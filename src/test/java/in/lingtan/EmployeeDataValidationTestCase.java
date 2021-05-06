package in.lingtan;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class EmployeeDataValidationTestCase {

	@Test
	public void isNameEmptyTestCase1() {// returns false if empty
		String name = "  ";
		boolean isValidName = EmployeeDataValidation.isNameNotEmpty(name);
		assertFalse(isValidName);
	}
	
	@Test
	public void isNameEmptyTestCase2() { // returns true if available
		String name = "Lingtan";
		boolean isValidName = EmployeeDataValidation.isNameNotEmpty(name);
		assertTrue(isValidName);
	}
	
//////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void isNameNullTestCase1() {
		String name = null;
		boolean isValidName = EmployeeDataValidation.isNameNull(name);
		assertFalse(isValidName);
	}
	
	@Test
	public void isNameNullTestCase2() {
		String name = null;
		boolean isValidName = EmployeeDataValidation.isNameNull(name);
		assertFalse(isValidName);
	}
	
	
//////////////////////////////////////////////////////////////////////////////////	
	
	@Test
	public void isValidEmailTestCase1() {  //Valid Mail 
		String emailId = "lingtan@gmail.com";
		boolean isValidName = EmployeeDataValidation.isValidEmailId(emailId);
		assertTrue(isValidName);
	}
	
	@Test
	public void isValidEmailTestCase2() {  //Valid Mail 
		String emailId = "lingtangmail.com";
		boolean isValidName = EmployeeDataValidation.isValidEmailId(emailId);
		assertFalse(isValidName);
	}
		
	@Test
	public void isValidEmailTestCase3() {  //Valid Mail 
		String emailId = "lingtangmailcom";
		boolean isValidName = EmployeeDataValidation.isValidEmailId(emailId);
		assertFalse(isValidName);
	}
		
	
//////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void isValidDateTestCase1() {
		LocalDate date = LocalDate.of(2020, 12, 02);
		boolean isValidName = EmployeeDataValidation.isValidDate(date);
		assertTrue(isValidName);
	}
	
	@Test
	public void isValidDateTestCase2() {
		LocalDate date = LocalDate.now().plusDays(1);
		boolean isValidName = EmployeeDataValidation.isValidDate(date);
		assertFalse(isValidName);
	}
	
//////////////////////////////////////////////////////////////////////////////////	
	@Test
	public void isValidMobileNumberTestCase1() {
		long number = 1234567890l;
		boolean isValidMobileNumber = EmployeeDataValidation.isValidMobileNumberLength(number);
		assertTrue(isValidMobileNumber);
	}
	
	@Test
	public void isValidMobileNumberTestCase2() {
		Long number = 1231110L;
		boolean isValidMobileNumber = EmployeeDataValidation.isValidMobileNumberLength(number);
		assertFalse(isValidMobileNumber);
	}
	
	@Test
	public void isValidMobileNumberTestCase3() {
		Long number = 0000000000L;
		boolean isValidMobileNumber = EmployeeDataValidation.isValidMobileNumberLength(number);
		assertFalse(isValidMobileNumber);
	}
	
	@Test
	public void isValidMobileNumberTestCase4() {
		Long number = null;
		boolean isValidMobileNumber = EmployeeDataValidation.isValidMobileNumberLength(number);
		assertFalse(isValidMobileNumber);
	}
	
//////////////////////////////////////////////////////////////////////////////////	
	@Test
	public void isMobileNumberPositiveTestCase1() {
		Long number = -8374987334L;
		boolean isValidMobileNumber = EmployeeDataValidation.isMobileNumberPositive(number);
		assertFalse(isValidMobileNumber);
	}
	
	@Test
	public void isMobileNumberPositiveTestCase2() {
		Long number = 8374987334L;
		boolean isValidMobileNumber = EmployeeDataValidation.isMobileNumberPositive(number);
		assertTrue(isValidMobileNumber);
	}
	
	
	@Test
	public void isEmployeeIdNullTest1() {
		String employeeName = null;
		boolean isValidEmployeeId = EmployeeDataValidation.isEmployeeIdEmptyAndNull(employeeName);
		assertFalse(isValidEmployeeId);
	}
	
	@Test
	public void isEmployeeIdNullTest2() {
		String employeeName = "";
		boolean isValidEmployeeId = EmployeeDataValidation.isEmployeeIdEmptyAndNull(employeeName);
		assertFalse(isValidEmployeeId);
	}
	
	@Test
	public void isEmployeeIdNullTest3() {
		String employeeName = "Ling";
		boolean isValidEmployeeId = EmployeeDataValidation.isEmployeeIdEmptyAndNull(employeeName);
		assertTrue(isValidEmployeeId);
	}
	
//////////////////////////////////////////////////////////////////////////////////	
	

	@Test
	public void isValidEmployeeIdLengthTest() {
		String employeeName = "Ling2657";
		boolean isValidEmployeeId = EmployeeDataValidation.isValidEmployeeIdLength(employeeName);
		assertTrue(isValidEmployeeId);
	}
	
	@Test
	public void isValidEmployeeIdLengthTest1() {
	String employeeName = "Ling2657";
	boolean isValidEmployeeId = EmployeeDataValidation.isValidEmployeeIdLength(employeeName);
	assertTrue(isValidEmployeeId);
}

	@Test
	public void isValidFormatEmployyeeIdTest1() {
	String employeeName = "Lin2657";
	boolean isValidEmployeeId = EmployeeDataValidation.isValidEmployyeeIdFormat(employeeName);
	assertFalse(isValidEmployeeId);
	}
	
	@Test
	public void isValidFormatEmployyeeIdTest2() {
	String employeeName = "Ling257";
	boolean isValidEmployeeId =EmployeeDataValidation.isValidEmployyeeIdFormat(employeeName);
	assertFalse(isValidEmployeeId);
	}

	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void isValidPasswordFormatTest1() { //username is wrong password is correct
		String password =  "raja123";
		boolean isValidPasswordLength = EmployeeDataValidation.isValidPasswordFormat(password);
		assertFalse(isValidPasswordLength);
	}
	
	@Test
	public void isValidPasswordFormatTest2() { //username is wrong password is correct
		String password =  "@Lingtan123";
		boolean isValidPasswordLength = EmployeeDataValidation.isValidPasswordFormat(password);
		assertTrue(isValidPasswordLength);
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////Final Combined verification
	
	@Test
	public void isEmployyeeIdFinalTestCase1() {
	String employeeId = "Ling257";
	boolean finalEmployeeIdValidation = EmployeeDataValidation.employeeIdValidation(employeeId);
	assertFalse(finalEmployeeIdValidation);
	}
	
	@Test
	public void isValidNameFinalTestCase1() {
		String employeeName = "Lingtan";
		boolean finalEmployeeNameValidation  =  EmployeeDataValidation.employeeNameFinalValidation(employeeName);
		assertTrue(finalEmployeeNameValidation);
	}
	
	
}
