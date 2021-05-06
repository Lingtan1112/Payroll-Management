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
		Employee employee1 = new Employee();
		employee1.name = "JosephKuruvila";
		employee1.role = "Software Developer";
		employee1.employeeID = "Jose2455";
		employee1.email = "joseph@chainsys.com";
		employee1.dob = LocalDate.of(2000, 12, 12);
		employee1.gender = "Male";
		employee1.mobileNumber =Long.parseLong("9249324982");
		employee1.joiningData = LocalDate.of(2000, 12, 12);
		
		boolean isAddedEmployee = EmployeeOperations.addEmployee(employee1);
		assertTrue(isAddedEmployee);
	}
	
	@Test
	public void addEmployeeTestCase2() { // Invalid data fields so cannot be added
		Employee employee2 = new Employee();
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
		Employee employee3 = new Employee();
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
		Employee employee4 = new Employee();
		employee4.name = "Scarlett";
		employee4.role = "Functional Constultant";
		employee4.employeeID = "Scarlett2655";
		employee4.email = "scarlet@chainsys.com";
		employee4.dob = LocalDate.of(2000, 12, 12);
		employee4.gender = "Female";
		employee4.mobileNumber =Long.parseLong("9249823982");
		employee4.joiningData = LocalDate.of(2000, 12, 12);
		EmployeeOperations.addEmployee(employee4);
		
		
		
		
		HashMap<String, Employee> masterEmployeeData = EmployeeOperations.getEmployeeMap();
		System.out.println("Master Data after adding Employee  :"+masterEmployeeData);
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	@Test
	public void addEmployeeTestCase5() { //Example data For employee 1
		Employee employee5 = new Employee();
		employee5.name = "JosephKuruvila";
		employee5.role = "Software Developer";
		employee5.employeeID = "Jose2455";
		employee5.email = "joseph@chainsys.com";
		employee5.dob = LocalDate.of(2000, 12, 12);
		employee5.gender = "Male";
		employee5.mobileNumber =Long.parseLong("9249324982");
		employee5.joiningData = LocalDate.of(2000, 12, 12);
		
		boolean isAddedEmployee = EmployeeOperations.addEmployee(employee5);
		assertTrue(isAddedEmployee);
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	@Test  
	public void deleteEmployeeTestCase1() {
		String employeeIdToDelete = "empl1111";
		boolean isRemoved = EmployeeOperations.deleteEmployee(employeeIdToDelete);
		assertTrue(isRemoved);
	}
	
	@Test  
	public void deleteEmployeeTestCase2() {
		String employeeIdToDelete = "empl2222";
		boolean isRemoved = EmployeeOperations.deleteEmployee(employeeIdToDelete);
		assertTrue(isRemoved);
	}
	

	
	@Test  //To delete the data of an employee this method is used, when the position of the employee is given that is removed
	public void deleteEmployeeTestCase3() { 
			String employeeIdToDelete = "Scarlett2655";
			EmployeeOperations.deleteEmployee(employeeIdToDelete);
			HashMap<String, Employee> employeeMap = EmployeeOperations.getEmployeeMap();
			System.out.println("After Deletion  :"+employeeMap);
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test 
	public void viewAllDetailsOfEmployeeTestCase1() { 
		String employeeId ="Joseph2655";
		Employee individualDataToDisplay =  EmployeeOperations.viewAllDetailsOfEmployee(employeeId);
		System.out.println(employeeId + "'s Data alone"+"-->"+individualDataToDisplay);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
	}
	
	@Test 
	public void viewAllDetailsOfEmployeeTestCase2() { 
		String employeeId ="Ling2655";
		Employee individualDataToDisplay =  EmployeeOperations.viewAllDetailsOfEmployee(employeeId);
		System.out.println(employeeId + "'s Data alone"+"-->"+individualDataToDisplay);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
	}
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test 
	public void editDetailsOfEmployeeTestCase2() { 
		String employeeId ="Ling2655";
		String newName = "JohnDavid";
		boolean isEditedDetailsOfEmployee =  EmployeeOperations.editEmployeeName(employeeId, newName);
		assertTrue(isEditedDetailsOfEmployee);
		Employee actualEmp = EmployeeOperations.viewAllDetailsOfEmployee(employeeId);
		assertEquals(newName, actualEmp.name);
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
	}
	
	public void editDetailsOfEmployeeTestCase3() { 
		String employeeId ="Jd2655";
		String newEmail = "JohnDavid@gmail.com";
		boolean isEditedDetailsOfEmployee =  EmployeeOperations.editEmployeeName(employeeId, newEmail);
		assertFalse(isEditedDetailsOfEmployee);
		
		HashMap<String, Employee> employeeMap = EmployeeOperations.getEmployeeMap();
		System.out.println("After Editing detail  :"+employeeMap);
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
		assertFalse(isAvailable);
		
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void getEmployeeMap() {
		HashMap<String, Employee> employeeMap = EmployeeOperations.getEmployeeMap();
		System.out.println("Employee Master Data  :"+employeeMap);
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

