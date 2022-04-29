package com.example.demo.services;

import java.sql.*;
import java.util.*;


public class Product {


	private Connection con;

	public Product(Connection con) {
		super();
		this.con = con;
	}
	
	public List<ProductService> findAll()
	{
		List<ProductService> productList= new ArrayList<ProductService>();
		
		String sql="select * from poov_product";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				int productId=rs.getInt("product_id");
				String productName=rs.getString("product_name");
			    double price=rs.getDouble("price");
			    
			    ProductService prod=new ProductService(productId,productName,price);
			    productList.add(prod);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return productList;
	}
	
	public void usingTxn(ProductService prd1,ProductService prd2)
	{
		String sql="insert into poov_product values(?,?,?)";
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			con.setAutoCommit(false);
			
			pstmt.setInt(1, prd1.getProductId());
			pstmt.setString(2, prd1.getProductName());
			pstmt.setDouble(3, prd1.getPrice());
			
		int rowsAdded=pstmt.executeUpdate();
		
		pstmt.setInt(1, prd2.getProductId());
		pstmt.setString(2, prd2.getProductName());
		pstmt.setDouble(3,prd2.getPrice());
		
		int rowsAdded1=pstmt.executeUpdate();
		
		if(prd2.getPrice()>prd1.getPrice())
		{
			con.commit();
		}
		else
		{
		con.rollback();
			
		}
		System.out.println("Rows updated"+rowsAdded);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	
	private double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteById(int id)
	{   int rowsDeleted=0;
		String sql="delete from poov_product where  product_id=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
	           pstmt.setInt(1, id);
	           rowsDeleted=pstmt.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return rowsDeleted;
	}
	
	public int updatePriceById(int id,double newPrice)
	{
		int rowsUpdated=0;
		String sql="update poov_product set price= ? where product_id=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			pstmt.setDouble(1,newPrice);
			pstmt.setInt(2,id);
					
	            rowsUpdated=pstmt.executeUpdate();
			
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
					
		return rowsUpdated;	
			
		}
		
		
	
	public Optional<ProductService> findById(int id)
	{
		Optional<ProductService> obj=Optional.empty();
		String sql="select * from poov_product where  product_id=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			pstmt.setInt(1,id);
		
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				int productId=rs.getInt("product_id");
				String productName=rs.getString("product_name");
				double price=rs.getDouble("price");
				
				ProductService prod=new ProductService(productId,productName,price);
				obj=Optional.of(prod);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return obj;
	}
	
	
	public int addProduct(ProductService product)
	{
		int rowAdded=0;
		
		String sql="insert into poov_product values(?,?,?)";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			pstmt.setInt(1,product.getProductId());
			pstmt.setString(2,product.getProductName());
			pstmt.setDouble(3,product.getPrice());
			
			rowAdded=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	
}
