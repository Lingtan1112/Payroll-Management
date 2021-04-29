package in.lingtan;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class EmployeeTestCase {

static String name ;
static String role ;
static String email ;
static String dob ;
static String gender ;
static String mobileNumber ;
static String  joiningDate ;


	@Test
	public void addEmployeeTestCase1() { //Example data For employee 1
		//System.out.println("addEmployeeTestCase1");
		name = "JosephKuruvila";
		role = "Software Developer";
		email = "joseph@chainsys.com";
		dob = "2000-02-12";
		gender = "Male";
		mobileNumber = "9600923846";
		joiningDate = "2021-04-07";
		///////////////////////////////////
		EmployeeOperations.addEmployee(name,role,email,dob,gender,mobileNumber,joiningDate);
		
	}
	@Test
	public void addEmployeeTestCase2() { //Example datas For employee 2
		
		name = "JD";
		role = "Technical Consultant";
		email = "jd@chainsys.com";
		dob = "1999-04-14";
		gender = "Male";
		mobileNumber = "9249823982";
		joiningDate = "2021-03-09";
		///////////////////////////////////
		EmployeeOperations.addEmployee(name,role,email,dob,gender,mobileNumber,joiningDate);		
		
	}
	@Test
	public void addEmployeeTestCase3() { //Example datas For employee 2
		
		name = "Maran";
		role = "HR";
		email = "maran@chainsys.com";
		dob = "1980-04-14";
		gender = "Male";
		mobileNumber = "7689823982";
		joiningDate = "2021-03-09";
		///////////////////////////////////
		EmployeeOperations.addEmployee(name,role,email,dob,gender,mobileNumber,joiningDate);		
		
	}
	
	
	@Test  //To delete the data of an employee this method is used, when the position of the employee is given that is removed
	public void deleteEmployeeTestCase1() { 
				
				
		String employeeToDelete = "JosephKuruvila";
		EmployeeOperations.deleteEmployee(employeeToDelete);
	}
	
	@Test  //To delete the data of an employee this method is used, when the position of the employee is given that is removed
	public void deleteEmployeeTestCase2() { 
		
		String employeeToDelete = "Maran";
		EmployeeOperations.deleteEmployee(employeeToDelete);
	}
	
	
	
	//@Test
	//public void displayMasterDataTestCase() {
	//	EmployeeOperations.viewMasterData();
	//}
	
	@Test
	public void displayMasterEmployeeDataTestCase() { //To clear all the employee data from the value	
		EmployeeOperations.displayMasterEmployeeData();
		
	}
	

}
