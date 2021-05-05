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
	
	@Test
	public void isValidMobileNumberTestCase1() {
		Long number = 1234567890L;
		boolean isValidMobileNumber = EmployeeDataValidation.isValidMobileNumber(number);
		assertTrue(isValidMobileNumber);
	}
	
	@Test
	public void isValidMobileNumberTestCase2() {
		Long number = 1231110L;
		boolean isValidMobileNumber = EmployeeDataValidation.isValidMobileNumber(number);
		assertFalse(isValidMobileNumber);
	}
	
	


}
