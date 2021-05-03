package in.lingtan;
import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class CredentialsOperationTestCase {

	@Test
	public void registerEmployeeTest1() { //both are correct
		String username = "ling2657";
		String password =  "Lingtan";
		CredentialsOperation.registerEmployee(username, password);
		
	    
	}
		
	@Test
	public void registerEmployeeTest2() { //username is wrong password is correct
		String username = "raja2643";
		String password =  "Raja";
	    CredentialsOperation.registerEmployee(username, password);
		
		
	}
	@Test
	public void registerEmployeeTest3() { //username is correct password is wrong
		String username = "Venki2622";
		String password =  "Venki";
		CredentialsOperation.registerEmployee(username, password);
		
		
	}
	@Test
	public void registerEmployeeTest4() { //username is correct password is wrong
		String username = "nevil2650";
		String password =  "nevil";
		CredentialsOperation.registerEmployee(username, password);
		HashMap<String,String> masterCredentialStorage = CredentialsOperation.getCredentials();
		System.out.println(masterCredentialStorage);
	}
///////////////////////////////////////////////////////////////////////////////////////////////
	
	
	@Test
	public void credentialValidationTest1() { //username - correct and password - correct
		String employeeId = "nevil2345";
		String password =  "nevil";
		boolean inValidCredentials = CredentialsOperation.credentialValidation(employeeId, password);
		assertFalse(inValidCredentials);	
	}
	@Test
	public void credentialValidationTest3() { //username - correct password - correct
		String employeeId = "ling2657";
		String password =  "Lingtan";
		boolean inValidCredentials = CredentialsOperation.credentialValidation(employeeId, password);
		assertTrue(inValidCredentials);	
	}
	@Test
	public void credentialValidationTest2() { //username-wrong and password-wrong
		String employeeId = "nevil23";
		String password =  "nevi";
		boolean inValidCredentials = CredentialsOperation.credentialValidation(employeeId, password);
		assertFalse(inValidCredentials);	
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void adminValidationTest1() { //username-wrong and password-wrong
		String employeeId = "Ling2657";
		String password =  "Lingtan";
		boolean inValidCredentials = CredentialsOperation.adminValidation(employeeId, password);
		assertFalse(inValidCredentials);	
	}
	@Test
	public void adminValidationTest2() { //username-wrong and password-wrong
		String employeeId = "Andrew2766";
		String password =  "andrew";
		boolean inValidCredentials = CredentialsOperation.adminValidation(employeeId, password);
		assertFalse(inValidCredentials);	
	}	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void resetPasswordTestcase1() { //username-wrong and password-wrong
		String employeeId = "Andrew2766";
		String oldPassword =  "Andrew";
		String newPassword = "Lingtan123";
		
		boolean inValidCredentials = CredentialsOperation.resetPassword(employeeId, oldPassword, newPassword);
		HashMap<String,String> masterCredentialStorage = CredentialsOperation.getCredentials();
		System.out.println("List after Resetting password "+ masterCredentialStorage);
		assertTrue(inValidCredentials);	
		
	}
	
	
	
}
