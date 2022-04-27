package com.training.execute;

import java.util.ArrayList;
import java.util.List;
import com.training.entity.Member;
import com.training.example.ifaces.CrudRepository;
import java.sql.*;
import java.time.LocalDate;

public class MemberRepository implements CrudRepository<Member> {

	private Connection con;
	
	public MemberRepository(Connection con) {
		super();
		this.con = con;
	}

	
	
	public int add(Member obj) {
		int rowAdded=0;
		
		String sql="insert into member_flower values(?,?,?,?,?,?,?)";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			pstmt.setInt(1,obj.getMemberId());
			pstmt.setString(2,obj.getMembername());
			pstmt.setString(3,obj.getMemberAddress());
			pstmt.setDate(4, Date.valueOf(obj.getAccountOpenDate()));
			pstmt.setString(5,obj.getMemberShipType());
			pstmt.setDouble(6,obj.getFeespaid());
			pstmt.setDouble(7,obj.getPenaltyAmount());
			
			rowAdded=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	public List<Member> findAll() {
      List<Member> memberList= new ArrayList<Member>();
		
		String sql="select * from member_flower";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				int memberId=rs.getInt("memberid");
				String memberName=rs.getString("membername");
			    String memberAddress=rs.getString("memberaddress");
			  
			    LocalDate accountOpenDate=rs.getDate("accountopendate").toLocalDate();
			    String memberShipType=rs.getString("membershiptype");
			    double feespaid=rs.getDouble("feespaid");
			  
			    double  penaltyAmount=rs.getDouble("penaltyamount");
			    
			    
 Member prod=new Member(memberId,memberName,memberAddress,accountOpenDate,memberShipType,feespaid,penaltyAmount);
      memberList.add(prod);
			   
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return memberList;
	}

	public int remove(int id) {
		 int rowsDeleted=0;
			String sql="delete from member_flower where memberid=?";
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

	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByName(String name, double obj) {
	

		int rowsUpdated=0;
		String sql="update member_flower set penaltyamount= ? where membername=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql))
		{
			pstmt.setDouble(1,obj);
			pstmt.setString(2,name);
					
	            rowsUpdated=pstmt.executeUpdate();
			
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
					
		return rowsUpdated;	
			
		}
	}
	
	


