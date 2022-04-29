package com.training.example.jdbc_example;

import java.sql.*;
import java.util.*;

public class CustomerService implements CrudRepository<LoanApplication>
{
	private Connection con;
	
	public CustomerService(Connection con) {
		super();
		this.con = con;
	}

	
	
public int add(LoanApplication obj)
	{
	 int rowsAdded1=0;
	 int rowsAdded2=0;
		String sql1="insert into flower_Customerz values(?,?,?,?)";
		String sql2="insert into flower_LoanApplicationz(?,?,?)";
		
		try(PreparedStatement pstmt1=con.prepareStatement(sql1);
				PreparedStatement pstmt2=con.prepareStatement(sql2))
		{
			
		    pstmt1.setInt(1,obj.getCustomer().getCustomer_Id());
		    pstmt1.setString(2,obj.getCustomer().getCustomer_Name());
		    pstmt1.setLong(3,obj.getCustomer().getPhone_Number());
		    pstmt1.setDouble(4, obj.getCustomer().getCredit_Score());
		    
		    rowsAdded1=pstmt1.executeUpdate();
		    
		    pstmt2.setInt(1,obj.getApplicationNumber());
		    pstmt2.setInt(2,obj.getCustomer().getCustomer_Id());
		    pstmt2.setDouble(3,obj.getLoanAmount());
		    
		    rowsAdded2=pstmt2.executeUpdate();
		    
		   
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rowsAdded2;
	}

	public int delete(int id)
	{
		int rowsDeleted=0;
		String sql="delete from flower_Customerz where customer_id=?";
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
		
	
	
	public Optional<LoanApplication> findById(int id) {
		
		Optional<LoanApplication> obj=Optional.empty();
		String sql="select * from flower_Customerz e left join flowers_LoanApplicationz d on e.customer_id=d.application_Id where e.customer_id=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			pstmt.setInt(1,id);
		
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				
				int applicationNumber=rs.getInt("application_Number");
			    double loanAmount=rs.getDouble("loan_Amount");
			    int customerid=rs.getInt("customer_id");
			    String customerName=rs.getString("customer_Name");
			    int creditScore=rs.getInt("credit_Score");
			    long phoneNumber=rs.getLong("phone_Number");
			    
			    Customer customer=new Customer(customerid,customerName,phoneNumber,creditScore);
			    
			    LoanApplication prod=new LoanApplication(applicationNumber,customer,loanAmount);
			    
			
				obj=Optional.of(prod);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return obj;
	}
	
	public List<LoanApplication> findByAll() {
List<LoanApplication> productList= new ArrayList<LoanApplication>();
		
		String sql="select *from flower_Customerz left join flowers_LoanApplicationz on flower_Customerz.customer_id=flowers_LoanApplicationz.application_Id";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				int applicationNumber=rs.getInt("application_Number");
			    double loanAmount=rs.getDouble("loan_Amount");
			    int customerid=rs.getInt("customer_id");
			    String customerName=rs.getString("customer_Name");
			    int creditScore=rs.getInt("credit_Score");
			    long phoneNumber=rs.getLong("phone_Number");
			    
			    Customer customer=new Customer(customerid,customerName,phoneNumber,creditScore);
			    
			    LoanApplication prod=new LoanApplication(applicationNumber,customer,loanAmount);
			    productList.add(prod);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return productList;
	}

}
