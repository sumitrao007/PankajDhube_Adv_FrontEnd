package com.hefshine.test;

import com.hefshine.bean.Employee;
import com.hefshine.dao.EmployeeDAO;

public class InsertTest {
	
	public static void main(String[] args) {
		
		EmployeeDAO dao=new EmployeeDAO();
		
	//	int status=dao.insertData("Pratiksha", "Gandhi", "hefshine.pratiksha@gmail.com", "9654123689");
		
		Employee employee=new Employee();
		employee.setFname("Snehali");
		employee.setLname("Nandurkar");
		employee.setEmailid("hefshine.snehali@gmail.com");
		employee.setMobileno("7894563214");
		
		
		int status=dao.insertData(employee);
		
		
		if(status==1) {
			System.out.println("Data Insertated Successfully");
			
		}else
		{
			System.out.println("Data Not Insertated Successfully!!!!!!!!!!!!!!");
		}
		
	}
	

}
