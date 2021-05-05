package in.lingtan;
import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class CredentialsOperationTestCase {

	@Test
	public void registerEmployeeTest1() { //Valid employeeID and password
		String username = "Sury2657";
		String password =  "@Password123";
		boolean isRegistered = CredentialsOperation.registerEmployee(username, password);
		assertTrue(isRegistered);
	}
		
	@Test
	public void registerEmployeeTest2() { //Valid employeeID and invalid Password
		String username = "@Raja2643";
		String password =  "Raja";
		boolean isRegistered = CredentialsOperation.registerEmployee(username, password);
		assertFalse(isRegistered);
		
		
	}
	@Test
	public void registerEmployeeTest3() { //InValid employeeID and invalid Password
		String username = "@ven123";
		String password =  "Venki";
		boolean isRegistered = CredentialsOperation.registerEmployee(username, password);
		assertFalse(isRegistered);
		
		
	}
	@Test
	public void registerEmployeeTest4() { //Invalid username is Valid password
		String username = "Nev9650";
		String password =  "@Nevil1234";
		boolean isRegistered = CredentialsOperation.registerEmployee(username, password);
		assertFalse(isRegistered);
		HashMap<String,String> masterCredentialStorage = CredentialsOperation.getCredentials();
		System.out.println("List of Registered Employees"+masterCredentialStorage);
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	@Test
	public void registerEmployeeTest5() { //Valid employeeID and password
		String username = null;
		String password =  null;
		boolean isRegistered = CredentialsOperation.registerEmployee(username, password);
		assertFalse(isRegistered);
	}
	
	@Test
	public void registerEmployeeTest6() { //Valid employeeID and password
		String username = "";
		String password =  "";
		boolean isRegistered = CredentialsOperation.registerEmployee(username, password);
		assertFalse(isRegistered);
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////
	@Test
	public void isUserAvailableTestCase1() { // available employeeID is checked
		String employeeId = "Ling2657";
		boolean isAvailable = CredentialsOperation.isUserAvailable(employeeId);
		assertTrue(isAvailable);
	}
	
	public void isUserAvailableTestCase2() { // invalid employeeID to search
		String employeeId = null;
		boolean isAvailable = CredentialsOperation.isUserAvailable(employeeId);
		assertFalse(isAvailable);
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void credentialValidationTest1() { //Valid username and password
		String employeeId = "Ling2657";
		String password =  "@Lingtan123";
		boolean inValidCredentials = CredentialsOperation.employeeCredentialValidation(employeeId, password);
		assertTrue(inValidCredentials);	
	}
	@Test
	public void credentialValidationTest2() { //Valid username and invalid Password
		String employeeId = "Ling2657"; 
		String password =  "password";
		boolean inValidCredentials = CredentialsOperation.employeeCredentialValidation(employeeId, password);
		assertFalse(inValidCredentials);	
	}
	@Test
	public void credentialValidationTest3() { // inValid username and invalid password
		String employeeId = "nevil23";
		String password =  "nevil";
		boolean inValidCredentials = CredentialsOperation.employeeCredentialValidation(employeeId, password);
		assertFalse(inValidCredentials);	
	}
	
	@Test
	public void credentialValidationTest4() { // inValid username and valid password
		String employeeId = null;
		String password = null;
		boolean inValidCredentials = CredentialsOperation.employeeCredentialValidation(employeeId, password);
		assertFalse(inValidCredentials);	
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void adminValidationTest1() { // Valid employeeID and Password
		String employeeId = "Ling2657";
		String password =  "@Password123";
		boolean inValidCredentials = CredentialsOperation.adminValidation(employeeId, password);
		assertTrue(inValidCredentials);	
	}
	@Test
	public void adminValidationTest2() { //Invalid employeeId and password
		String employeeId = "Arya2657";
		String password =  "@Password123";
		boolean inValidCredentials = CredentialsOperation.adminValidation(employeeId, password);
		assertFalse(inValidCredentials);	
	}	
	
	@Test
	public void adminValidationTest3() { //valid employeeId and Invalid password
		String employeeId = "Ling2657";
		String password =  "@Passssss1123";
		boolean inValidCredentials = CredentialsOperation.adminValidation(employeeId, password);
		assertFalse(inValidCredentials);	
	}	

	@Test
	public void adminValidationTest4() { //Ivalid employeeId and valid password
		String employeeId = null;
		String password =  null;
		boolean inValidCredentials = CredentialsOperation.adminValidation(employeeId, password);
		assertFalse(inValidCredentials);	
	}	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void addAdminCredentailTestCase1() { //Adding new admin with validated input
		String employeeId = "Sury1234";
		String password =  "@Surya1234";
		boolean isAdminRegistered = CredentialsOperation.addNewAdmin(employeeId, password);
		assertTrue(isAdminRegistered);
		
	}	

	@Test
	public void addAdminCredentailTestCase2() { //Adding the existing adminID
		String employeeId = null;
		String password =  null;
		boolean isAdminRegistered = CredentialsOperation.addNewAdmin(employeeId, password);
		assertFalse(isAdminRegistered);
		HashMap<String, String> adminCredentialHashTable = CredentialsOperation.getAdminCredentials();
		System.out.println("After adding a new admin  :"+adminCredentialHashTable);
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
			
	}	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void resetPasswordTestcase1() { // Correct credentials to change the password
		String employeeId = "Ling2657";
		String oldPassword =  "@Password123";
		String newPassword = "@Lingtan123";
		
		boolean inValidCredentials = CredentialsOperation.resetPassword(employeeId, oldPassword, newPassword);
		assertTrue(inValidCredentials);	
		
	}
	
	@Test
	public void resetPasswordTestcase2() { //username-wrong and password-wrong
		String employeeId = null;
		String oldPassword =  "@Password123";
		String newPassword = null;
		
		boolean inValidCredentials = CredentialsOperation.resetPassword(employeeId, oldPassword, newPassword);
		assertFalse(inValidCredentials);	
		
		HashMap<String,String> masterCredentialStorage = CredentialsOperation.getCredentials();
		System.out.println("List after Resetting password "+ masterCredentialStorage);
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	
}
