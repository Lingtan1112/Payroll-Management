package in.lingtan;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class EmployeeOperationsTestCase {

	@Test
	public void addEmployeeTestCase1() { //Example data For employee 1
		EmployeeDomainClass employee1 = new EmployeeDomainClass();
		employee1.name = "JosephKuruvila";
		employee1.role = "Software Developer";
		employee1.employeeID = "Joseph2655";
		employee1.email = "joseph@chainsys.com";
		employee1.dob = LocalDate.of(2000, 12, 12);
		employee1.gender = "Male";
		employee1.mobileNumber =9249324982L;
		employee1.joiningData = LocalDate.of(2000, 12, 12);
		
		EmployeeOperations.addEmployee(employee1);
	}
	
	@Test
	public void addEmployeeTestCase2() { //Example datas For employee 2
		EmployeeDomainClass employee2 = new EmployeeDomainClass();
		employee2.name = "JD";
		employee2.role = "Technical Consultant";
		employee2.email = "jd@chainsys.com";
		employee2.employeeID = "Jd2655";
		employee2.dob = LocalDate.of(2000, 12, 12);
		employee2.gender = "Male";
		employee2.mobileNumber =Long.parseLong("9249324982");
		employee2.joiningData = LocalDate.of(2000, 12, 12);
		
		EmployeeOperations.addEmployee(employee2);
	}
	
	@Test
	public void addEmployeeTestCase3() { //Example datas For employee 2
		EmployeeDomainClass employee3 = new EmployeeDomainClass();
		employee3.name = "Lingtan";
		employee3.role = "Ui designer";
		employee3.email = "lingtan@chainsys.com";
		employee3.employeeID = "Ling2655";
		employee3.dob = LocalDate.of(2000, 12, 12);
		employee3.gender = "Male";
		employee3.mobileNumber =Long.parseLong("9249324982");
		employee3.joiningData = LocalDate.of(2000, 12, 12);
		
		EmployeeOperations.addEmployee(employee3);	
	}
	
	@Test
	public void addEmployeeTestCase4() { 
		EmployeeDomainClass employee4 = new EmployeeDomainClass();
		employee4.name = "Scarlett";
		employee4.role = "Functional Constultant";
		employee4.employeeID = "Scarlett2655";
		employee4.email = "scarlet@chainsys.com";
		employee4.dob = LocalDate.of(2000, 12, 12);
		employee4.gender = "Female";
		employee4.mobileNumber =Long.parseLong("9249823982");
		employee4.joiningData = LocalDate.of(2000, 12, 12);
		EmployeeOperations.addEmployee(employee4);
		
		
		HashMap<String, EmployeeDomainClass> masterEmployeeData = EmployeeOperations.getEmployeeMap();
		System.out.println("Master Data after adding 4 Employee  :"+masterEmployeeData);
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@Test  
	public void deleteEmployeeTestCase1() {
		String employeeIdToDelete = "Ling2655";
		boolean isRemoved = EmployeeOperations.deleteEmployee(employeeIdToDelete);
		assertTrue(isRemoved);
	}
	
	@Test  
	public void deleteEmployeeTestCase2() {
		String employeeIdToDelete = "Ling265";
		boolean isRemoved = EmployeeOperations.deleteEmployee(employeeIdToDelete);
		assertFalse(isRemoved);
	}
	

	
	@Test  //To delete the data of an employee this method is used, when the position of the employee is given that is removed
	public void deleteEmployeeTestCase3() { 
			String employeeIdToDelete = "Scarlett2655";
			EmployeeOperations.deleteEmployee(employeeIdToDelete);
			HashMap<String, EmployeeDomainClass> employeeMap = EmployeeOperations.getEmployeeMap();
			System.out.println("After Deletion  :"+employeeMap);
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test 
	public void viewAllDetailsOfEmployeeTestCase1() { 
		String employeeId ="Joseph2655";
		EmployeeDomainClass individualDataToDisplay =  EmployeeOperations.viewAllDetailsOfEmployee(employeeId);
		System.out.println(employeeId + "'s Data alone"+"-->"+individualDataToDisplay);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
	}
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test 
	public void editDetailsOfEmployeeTestCase2() { 
		String employeeId ="Jd2655";
		String newName = "JohnDavid";
		EmployeeDomainClass editedDetailsOfEmployee =  EmployeeOperations.editEmployeeName(employeeId, newName);
		System.out.println(employeeId + " After changing name :"+"-->"+editedDetailsOfEmployee);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void editDetailsOfEmployeeTestCase3() { 
		String employeeId ="Jd2655";
		String newEmail = "JohnDavid@gmail.com";
		EmployeeDomainClass editedDetailsOfEmployee =  EmployeeOperations.editEmployeeName(employeeId, newEmail);
		System.out.println(employeeId + " After changing name :"+"-->"+editedDetailsOfEmployee);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test  
	public void isEmployeeAvailableTestCase1() {
		
		String employeeIdToCheck = "Ling2655";
		boolean isAvailable = EmployeeOperations.isEmployeeAvailable(employeeIdToCheck);
		assertTrue(isAvailable);
		
	}
	
	@Test  
	public void isEmployeeAvailableTestCase2() {
		
		String employeeIdToCheck = "Scarlett2655";
		boolean isAvailable = EmployeeOperations.isEmployeeAvailable(employeeIdToCheck);
		assertTrue(isAvailable);
		
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void getEmployeeMap() {
		HashMap<String, EmployeeDomainClass> employeeMap = EmployeeOperations.getEmployeeMap();
		System.out.println("Employee Master Data  :"+employeeMap);
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	public void salaryOfEmployeeTestCase1() { 
		String employeeId ="Joseph2655";
		int basicPay = 10000;
		EmployeeOperations.addSalary(employeeId,basicPay);
	}
	
	@Test
	public void salaryOfEmployeeTestCase2() { 
		String employeeId ="Jd2655";
		int basicPay = 15000;
		EmployeeOperations.addSalary(employeeId,basicPay);
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void salaryCalculationTestCase1() { 
		String employeeId ="Joseph2655";
		EmployeeOperations.salaryCalculation(employeeId);
	}
	
	@Test
	public void salaryCalculationTestCase2() { 
		String employeeId ="Jd2655";
		EmployeeOperations.salaryCalculation(employeeId);
		HashMap<String, EmployeeDomainClass> employeeMap = EmployeeOperations.getEmployeeMap();
		System.out.println("After updating salary :"+employeeMap);
	}
		
}
