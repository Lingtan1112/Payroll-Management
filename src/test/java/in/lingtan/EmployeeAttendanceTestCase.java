package in.lingtan;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.HashMap;

import org.junit.Test;

public class EmployeeAttendanceTestCase {

	@Test
	public void attendanceOfEmployeeTest1() {
		String employeeId = "empl1111";
		int status = 1;
		LocalDate DateOfAttendance = LocalDate.now();
		EmployeeAttendance.attendanceOfEmployee(status, employeeId, DateOfAttendance);
		
	}
	@Test
	public void attendanceOfEmployeeTest2() {
		String employeeId = "empl1111";
		int status = 0;
		LocalDate DateOfAttendance = LocalDate.now().plusDays(1);
		
		EmployeeAttendance.attendanceOfEmployee(status, employeeId , DateOfAttendance);
	}
	
	@Test
	public void attendanceOfEmployeeTest3() {
		String employeeId = "empl1111";
		int status = 1;
		LocalDate DateOfAttendance = LocalDate.now().plusDays(2);
		EmployeeAttendance.attendanceOfEmployee(status, employeeId , DateOfAttendance);
		HashMap<String, Employee> attendanceMap = EmployeeOperations.getEmployeeMap();
		System.out.println("After adding taking attendance  "+attendanceMap);
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	@Test
	public void attendanceStatusTest3() {
		String employeeId = "empl2222";
		EmployeeAttendance.attendanceOfEmployee(0, employeeId, LocalDate.now().plusDays(2));
		EmployeeAttendance.attendanceOfEmployee(1, employeeId, LocalDate.now().plusDays(3));
		EmployeeAttendance.attendanceOfEmployee(1, employeeId, LocalDate.now().plusDays(4));
		EmployeeAttendance.attendanceOfEmployee(1, employeeId, LocalDate.now().plusDays(5));
		EmployeeAttendance.attendanceOfEmployee(0, employeeId, LocalDate.now().plusDays(6));
		EmployeeAttendance.attendanceOfEmployee(1, employeeId, LocalDate.now().plusDays(7));
		EmployeeAttendance.attendanceOfEmployee(1, employeeId, LocalDate.now().plusDays(8));
		EmployeeAttendance.attendanceOfEmployee(1, employeeId, LocalDate.now().plusDays(9));
		
		EmployeeAttendance.attendanceStatus(employeeId );
		
		HashMap<String, Employee> attendanceMap = EmployeeOperations.getEmployeeMap();
		Employee viewAllDetailsOfEmployee = EmployeeOperations.getAllEmployees().get(employeeId);
		assertEquals(viewAllDetailsOfEmployee.present , 6);
		assertEquals(viewAllDetailsOfEmployee.absent , 2);
		System.out.println("Status "+attendanceMap);
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	
	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
}
