package com.hefshine.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import com.hefshine.bean.Employee;

public class EmployeeDAO {
	
	private String DB_DRIVER="com.mysql.jdbc.Driver";
	private String DB_URL="jdbc:mysql://localhost:3306/pankajdubey";
	private String DB_USER="root";
	private String DB_password="";
	
	Connection con=null;
	PreparedStatement pst;
	
	// Setp 1&2
	public void OpenDB() {
		
		try {
			Class.forName(DB_DRIVER);
			con=DriverManager.getConnection(DB_URL, DB_USER, DB_password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Step 3 & 4
//	public int insertData(String myfname,String mylname,String myemailid,String mymobileno) {
//		int status=0;
//		String query="insert into empregister(fname,lname,emailid,mobileno) values (?,?,?,?) ";
//		
//		try {
//			OpenDB();
//			
//			pst=con.prepareStatement(query);
//			pst.setString(1, myfname);
//			pst.setString(2, mylname);
//			pst.setString(3, myemailid);
//			pst.setString(4, mymobileno);
//			
//			status=pst.executeUpdate();
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//			
//		}finally {
//			CloseDB();
//		}
//		return status;
//		
//	}
	
	
	//Using Pojo class
	// Step 3 &4
	 public int insertData(Employee employee) {
		 int status=0;
		 String query="insert into empregister(fname,lname,emailid,mobileno) values (?,?,?,?) ";
		 
		 try {
			 OpenDB();
			 pst=con.prepareStatement(query);
			 pst.setString(1, employee.getFname());
			 pst.setString(2, employee.getLname());
			 pst.setString(3, employee.getEmailid());
			 pst.setString(4, employee.getMobileno());
			 
			 status=pst.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			CloseDB();
		}
		 
		 return status;
		 
	 }
	
	
	
	
	//Step 5
	public void CloseDB() {
		
		try {
		if(con!=null) {
			con.close();
			con=null;
		}
		if(pst!=null) {
			pst.close();
			pst=null;
			
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	

}
