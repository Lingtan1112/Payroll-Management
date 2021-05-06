package in.lingtan;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.HashMap;

import org.junit.Test;

public class EmployeeAttendanceTestCase {

	@Test
	public void test() {
		String employeeId = "empl1111";
		int status = 1;
		EmployeeAttendance.attendanceOfEmployee(status, employeeId);
		HashMap<String, Employee> masterEmployeeData = EmployeeOperations.getEmployeeMap();
		System.out.println("Master Data after adding Employee  :"+masterEmployeeData);
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	
	}

}
