package in.lingtan;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class EmployeeOperationsTestCase {

static String name ;
static String role ;
static String email ;
static String dob ;
static String gender ;
static String mobileNumber ;
static String  joiningDate ;
static String employeeId; 


	@Test
	public void addEmployeeTestCase1() { //Example data For employee 1
		//System.out.println("addEmployeeTestCase1");
		name = "JosephKuruvila";
		role = "Software Developer";
		employeeId = "Joseph2655";
		email = "joseph@chainsys.com";
		dob = "2000-02-12";
		gender = "Male";
		mobileNumber = "9600923846";
		joiningDate = "2021-04-07";
		///////////////////////////////////
		EmployeeOperations.addEmployee(name,role,employeeId, email,dob,gender,mobileNumber,joiningDate);
		
	}
	@Test
	public void addEmployeeTestCase2() { //Example datas For employee 2
		
		name = "JD";
		role = "Technical Consultant";
		email = "jd@chainsys.com";
		employeeId = "JD2655";
		dob = "1999-04-14";
		gender = "Male";
		mobileNumber = "9249823982";
		joiningDate = "2021-03-09";
		///////////////////////////////////
		EmployeeOperations.addEmployee(name,role,employeeId,email,dob,gender,mobileNumber,joiningDate);		
		
	}
	@Test
	public void addEmployeeTestCase3() { //Example datas For employee 2
		
		name = "Maran";
		role = "HR";
		employeeId = "Maran2655";
		email = "maran@chainsys.com";
		dob = "1980-04-14";
		gender = "Male";
		mobileNumber = "7689823982";
		joiningDate = "2021-03-09";
		///////////////////////////////////
		EmployeeOperations.addEmployee(name,role,employeeId,email,dob,gender,mobileNumber,joiningDate);		
		
	}
	
	@Test
	public void addEmployeeTestCase4() { //Example data For employee 1
		//System.out.println("addEmployeeTestCase1");
		name = "Scarlett";
		role = "Functional Constultant";
		employeeId = "Scarlett2655";
		email = "scarlet@chainsys.com";
		dob = "1960-02-02";
		gender = "Female";
		mobileNumber = "9605345345";
		joiningDate = "2020-05-03";
		///////////////////////////////////
		HashMap<String,HashMap<String,String>> masterEmployeeData = EmployeeOperations.getMasterEmployeeDataHash();
		System.out.println("Master Data after adding 4 Employee"+masterEmployeeData);
		System.out.println("-------------------------------------------------------------------------------------------");
		
	}
	
	
	@Test  //To delete the data of an employee this method is used, when the position of the employee is given that is removed
	public void deleteEmployeeTestCase1() { 
				
		String employeeToDelete = "JosephKuruvila";
		EmployeeOperations.deleteEmployee(employeeToDelete);
		
	}
	
	@Test  //To delete the data of an employee this method is used, when the position of the employee is given that is removed
	public void deleteEmployeeTestCase2() { 
		String employeeToDelete = "Scarlett";
		EmployeeOperations.deleteEmployee(employeeToDelete);
		HashMap<String,HashMap<String,String>> masterEmployeeData = EmployeeOperations.getMasterEmployeeDataHash();
		System.out.println("After deleting scarlett and josephKuruvila "+masterEmployeeData);
		System.out.println("-------------------------------------------------------------------------------------------");
	}
	
	@Test  //To delete the data of an employee this method is used, when the position of the employee is given that is removed
	public void viewAllDetailsOfEmployeeTestCase1() { 
		String employeeName ="Maran";
		HashMap<String,String> individualDataToDisplay = EmployeeOperations.viewAllDetailsOfEmployee(employeeName);
		System.out.println(employeeName+ "'s Data alone"+"-->"+individualDataToDisplay);
}
}
