package in.lingtan;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class EmployeeDataValidationTestCase {

	@Test
	public void isValidNameTestCase1() {
		String name = "  ";
		boolean isValidName = EmployeeDataValidation.isValidName(name);
		assertFalse(isValidName);
	}
	
	@Test
	public void isValidNameTestCase2() {
		String name = "Lingtan";
		boolean isValidName = EmployeeDataValidation.isValidName(name);
		assertTrue(isValidName);
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
		boolean isValidMobileNumber = EmployeeDataValidation.isValidMobileNumber(number);
		assertTrue(isValidMobileNumber);
	}
	
	@Test
	public void isValidMobileNumberTestCase2() {
		Long number = 1231110L;
		boolean isValidMobileNumber = EmployeeDataValidation.isValidMobileNumber(number);
		assertFalse(isValidMobileNumber);
	}
	
	@Test
	public void isValidMobileNumberTestCase3() {
		Long number = 0000000000L;
		boolean isValidMobileNumber = EmployeeDataValidation.isValidMobileNumber(number);
		assertFalse(isValidMobileNumber);
	}
	
//////////////////////////////////////////////////////////////////////////////////	
	
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
	
}
