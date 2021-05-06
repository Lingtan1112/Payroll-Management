package in.lingtan;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;

public class EmployeeAttendance {
static Employee attendance = new Employee();
int attendance1 = attendance.attendance;
static HashMap<LocalDate, Integer > attendanceRecord =  attendance.attendanceMap;
static HashMap<Integer, HashMap<LocalDate, Integer>> annualAttendanceChart = attendance.annualAttendanceChart;


	public static void attendanceOfEmployee(int status, String employeeId) {
				
		Employee viewAllDetailsOfEmployee = EmployeeOperations.getAllEmployees().get(employeeId);
		System.out.println(viewAllDetailsOfEmployee);
		viewAllDetailsOfEmployee.attendance=1;
		//EmployeeOperations.employeeMap.put(employeeId, viewAllDetailsOfEmployee);
//		if(status == 1) {
//			attendanceRecord.put(LocalDate.now(), status);
//		}
//		else if(status == 0) {
//			attendanceRecord.put(LocalDate.now(), status);
//		}
//		annualAttendanceChart.put(LocalDate.now().getMonthValue(), attendanceRecord);
//			
	}
	
	public static HashMap<Integer, HashMap<LocalDate, Integer>> displayAttendanceChart() {
		return annualAttendanceChart;
	}
}
