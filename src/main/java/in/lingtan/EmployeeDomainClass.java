package in.lingtan;

import java.time.LocalDate;
import java.util.HashMap;

public class EmployeeDomainClass {
	
	public String name;
	@Override
	public String toString() {
		return "EmployeeDomainClass [name=" + name + ", role=" + role + ", employeeID=" + employeeID + ", email="
				+ email + ", dob=" + dob + ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", joiningData="
				+ joiningData + ",  salary=" + salary + "]";
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
	
	
	
	
	
}
