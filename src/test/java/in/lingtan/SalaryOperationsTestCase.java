package in.lingtan;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class SalaryOperationsTestCase {

	@Test
	public void basicPayOfEmployeeTestCase1() { 
		String employeeId ="empl3333";
		int basicPay = 10000;
		SalaryOperations.addBasicPay(employeeId,basicPay);
	}
	
	@Test
	public void basicPayOfEmployeeTestCase2() { 
		String employeeId ="empl2222";
		int basicPay = 15000;
		SalaryOperations.addBasicPay(employeeId,basicPay);
	}
	
	@Test
	public void basicPayOfEmployeeTestCase3() { 
		String employeeId ="Scar1234";
		int basicPay = 15000;
		SalaryOperations.addBasicPay(employeeId,basicPay);
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Test
	public void salaryCalculationTestCase1() { 
		String employeeId ="empl1111";
		SalaryOperations.salaryCalculation(employeeId);
		
	}
	
	@Test
	public void salaryCalculationTestCase2() { 
		String employeeId ="empl2222";
		SalaryOperations.salaryCalculation(employeeId);
	}
	
	@Test
	public void salaryCalculationTestCase3() { 
		String employeeId ="Ling265";
		SalaryOperations.salaryCalculation(employeeId);
		HashMap<String, Employee> employeeMap = EmployeeOperations.getEmployeeMap();
		System.out.println("After updating salary :"+employeeMap);
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	@Test
	public void getAllEmployeeTest(){
		HashMap<String, Employee> employeeMap = EmployeeOperations.getAllEmployees();
		System.out.println("Employee Master Data  :"+employeeMap);
	}
	


}
