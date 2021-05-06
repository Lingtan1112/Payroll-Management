package in.lingtan;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class EmployeeAttendance {
	static Employee attendance = new Employee();

	public static void attendanceOfEmployee(int status, String employeeId, LocalDate dateOfAttendance) {
		Employee viewAllDetailsOfEmployee = EmployeeOperations.getAllEmployees().get(employeeId);
		viewAllDetailsOfEmployee.attendance = 1;
		viewAllDetailsOfEmployee.attendanceMap.put(dateOfAttendance, status);
		EmployeeOperations.getAllEmployees().put(employeeId, viewAllDetailsOfEmployee);
	}

	public static void attendanceStatus(String employeeId) {

		Employee viewAllDetailsOfEmployee = EmployeeOperations.getAllEmployees().get(employeeId);
		Collection<Integer> dateValues = viewAllDetailsOfEmployee.attendanceMap.values();
		for (int status : dateValues) {
			if (status == 1) {
				viewAllDetailsOfEmployee.present = viewAllDetailsOfEmployee.present + 1;
			} else if (status == 0) {
				viewAllDetailsOfEmployee.absent = viewAllDetailsOfEmployee.absent + 1;
			}
		}
		EmployeeOperations.getAllEmployees().put(employeeId, viewAllDetailsOfEmployee);
	}

}
