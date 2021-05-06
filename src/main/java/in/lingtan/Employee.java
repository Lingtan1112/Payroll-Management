package in.lingtan;

import java.time.LocalDate;
import java.util.HashMap;

public class Employee {
	
	public String name;
	@Override
	public String toString() {
		return "EmployeeDomainClass [name=" + name + ", role=" + role + ", employeeID=" + employeeID + ", email="
				+ email + ", dob=" + dob + ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", joiningData="
				+ joiningData + ", basicPay=" + basicPay + ", salary=" + salary + ", pf=" + pf + ", attendance="
				+ attendance + "]";
	}
	public String role;
	public String employeeID;
	public String email;
	public LocalDate dob;
	public String gender;
	public long mobileNumber;
	public LocalDate joiningData;
	public int basicPay;
	public double salary;
	public double pf;
	public int attendance;
	public HashMap <LocalDate,Integer> attendanceMap;
	public HashMap <Integer, HashMap<LocalDate,Integer>> annualAttendanceChart;
	
	
	
	
	
}
