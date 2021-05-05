package in.lingtan;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class EmployeeOperations {



static HashMap<String, EmployeeDomainClass> employeeMap = new HashMap<String, EmployeeDomainClass>();

static {
EmployeeDomainClass employee1 = new EmployeeDomainClass();
employee1.name = "Employee1";
employee1.role = "Software Developer";
employee1.employeeID = "emp1111";
employee1.email = "emp1@chainsys.com";
employee1.dob = LocalDate.of(2000, 12, 12);
employee1.gender = "Male";
employee1.mobileNumber =9249324982L;
employee1.joiningData = LocalDate.of(2000, 12, 12);
employeeMap.put(employee1.employeeID,employee1);
		
}

	/**
	 * To add the details of an Employee into a hashmap where the employeeId is the key for the employee
	 * @param employee
	 */
	public static void addEmployee(EmployeeDomainClass employee) {	
		employeeMap.put(employee.employeeID,employee);
			
	}
	
	/**
	 * To delete an existing employee data using the employeeId which acts as a key for the employee's data and returns true if removed
	 * @param employeeId
	 * @return
	 */
	public static boolean deleteEmployee(String employeeId) {
		boolean isRemoved = false;
		if(employeeMap.containsKey(employeeId)) {
			employeeMap.remove(employeeId);
			isRemoved = true;
		}
		return isRemoved;
		
	}
	
	/**
	 * This method displays the data of any individual Employee ,This can be displayed by the employeeId which acts as a key to the data
	 * @param employeeId
	 * @return
	 */
	public static EmployeeDomainClass viewAllDetailsOfEmployee( String employeeId) {
		EmployeeDomainClass viewAllDetailsOfEmployee = employeeMap.get(employeeId);
		return viewAllDetailsOfEmployee;
	}
	
	/**
	 * This method renames the name of the employee The parameters required are the employeeId and the new updated name
	 * @param employeeId
	 * @param newName
	 * @return
	 */
	public static EmployeeDomainClass editEmployeeName( String employeeId, String newName) {
		EmployeeDomainClass editedDetailsOfEmployee = employeeMap.get(employeeId);
		editedDetailsOfEmployee.name = newName;
		return editedDetailsOfEmployee;
	}
	
	/**
	 * This method checks whether an employee is present inside the list or not and returns true if it is present
	 * @param employeeId
	 * @return
	 */
	
	public static boolean isEmployeeAvailable(String employeeId) {
		boolean isAvailable = false;
		if(employeeMap.containsKey(employeeId)) {
			isAvailable = true;
		}
		return isAvailable;
	}
	
	/**
	 * This Method displays the hashMap that stores the employee data
	 * @return
	 */
	
	public static HashMap<String, EmployeeDomainClass> getEmployeeMap() {
		return employeeMap;
	}
	
	public static EmployeeDomainClass addSalary(String employeeId, int basicPay){
		EmployeeDomainClass viewAllDetailsOfEmployee = employeeMap.get(employeeId);
		viewAllDetailsOfEmployee.basicPay = basicPay;
		return viewAllDetailsOfEmployee; 
					
	}
	
	public static EmployeeDomainClass salaryCalculation(String employeeId) {
		EmployeeDomainClass viewAllDetailsOfEmployee = employeeMap.get(employeeId);
		EmployeeConstants salaryConstants = new EmployeeConstants();
		double salaryCalculation = (viewAllDetailsOfEmployee.basicPay + salaryConstants.hra + salaryConstants.lunchAllowance + salaryConstants.medicalAllowance) ;
		viewAllDetailsOfEmployee.pf = (salaryCalculation * 0.07);
		viewAllDetailsOfEmployee.salary = ( salaryCalculation - viewAllDetailsOfEmployee.pf );		
		return viewAllDetailsOfEmployee;
	}
	
	
	
	
	
	
		
}



