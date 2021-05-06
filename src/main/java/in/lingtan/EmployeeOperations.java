package in.lingtan;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class EmployeeOperations {



private static HashMap<String, Employee> employeeMap = new HashMap<String, Employee>();


public static HashMap<String, Employee> getAllEmployees() {
	return employeeMap;
}

static {
Employee employee1 = new Employee();
employee1.name = "Employee1";
employee1.role = "Software Developer";
employee1.employeeID = "empl1111";
employee1.email = "emp1@chainsys.com";
employee1.dob = LocalDate.of(2000, 12, 12);
employee1.gender = "Male";
employee1.mobileNumber =9249324982L;
employee1.joiningData = LocalDate.of(2000, 12, 12);
employeeMap.put(employee1.employeeID,employee1);

Employee employee2 = new Employee();
employee2.name = "Employee2";
employee2.role = "HR";
employee2.employeeID = "empl2222";
employee2.email = "emp1@chainsys.com";
employee2.dob = LocalDate.of(2000, 12, 12);
employee2.gender = "Male";
employee2.mobileNumber =9249324982L;
employee2.joiningData = LocalDate.of(2000, 12, 12);
employeeMap.put(employee2.employeeID,employee2);

Employee employee3 = new Employee();
employee3.name = "Employee3";
employee3.role = "Software Developer";
employee3.employeeID = "empl3333";
employee3.email = "emp1@chainsys.com";
employee3.dob = LocalDate.of(2000, 12, 12);
employee3.gender = "Male";
employee3.mobileNumber =9249324982L;
employee3.joiningData = LocalDate.of(2000, 12, 12);
employeeMap.put(employee3.employeeID,employee3);
		
}

	/**
	 * To add the details of an Employee into a hashmap where the employeeId is the key for the employee
	 * @param employee
	 * @return 
	 */
	public static boolean addEmployee(Employee employee) {	
		
		boolean isAddedEmployee = false;
		
		boolean isEmployeeIdValid = EmployeeDataValidation.employeeIdValidation(employee.employeeID);
		boolean isValidEmailId = EmployeeDataValidation.isValidEmailId(employee.email);
		boolean isValidName = EmployeeDataValidation.employeeNameFinalValidation(employee.name);
		boolean isValidDob = EmployeeDataValidation.isValidDate(employee.dob);
		boolean isValidJoiningDate = EmployeeDataValidation.isValidDate(employee.dob);
		boolean isValidMobileNumber = EmployeeDataValidation.finalMobileNumberValidation(employee.mobileNumber);
		if(isValidEmailId && isValidName && isValidDob && isValidJoiningDate && isValidMobileNumber && isEmployeeIdValid) {
			employeeMap.put(employee.employeeID,employee);
			isAddedEmployee = true;
		}
		return isAddedEmployee;
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
	public static Employee viewAllDetailsOfEmployee( String employeeId) {
		Employee viewAllDetailsOfEmployee = employeeMap.get(employeeId);
		if(viewAllDetailsOfEmployee == null) {
			System.out.println(employeeId +"  Not Found");
		}
		
		return viewAllDetailsOfEmployee;
	}
	
	/**
	 * This method renames the name of the employee The parameters required are the employeeId and the new updated name
	 * @param employeeId
	 * @param newName
	 * @return
	 */
	public static boolean editEmployeeName( String employeeId, String newName) {
		boolean isEdited = false;
		try {
			Employee editedDetailsOfEmployee = employeeMap.get(employeeId);
			editedDetailsOfEmployee.name = newName;
			isEdited = true;
		}
		catch(NullPointerException e) {
			System.out.println(  employeeId +" not found to edit");
		}
		
		return isEdited;
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
	
	public static HashMap<String, Employee> getEmployeeMap() {
		return employeeMap;
	}
	
	public static Employee addBasicPay(String employeeId, int basicPay){
		
		Employee viewAllDetailsOfEmployee = employeeMap.get(employeeId);
		try {
			viewAllDetailsOfEmployee.basicPay = basicPay;
		}
		catch(NullPointerException e) {
			System.out.println(employeeId+" not found to add basic pay");
			
		}		
		return viewAllDetailsOfEmployee; 			
	}
	
	public static Employee salaryCalculation(String employeeId) {
		Employee viewAllDetailsOfEmployee = employeeMap.get(employeeId);
		try {
		EmployeeConstants salaryConstants = new EmployeeConstants();
		double salaryCalculation = (viewAllDetailsOfEmployee.basicPay + salaryConstants.hra + salaryConstants.lunchAllowance + salaryConstants.medicalAllowance) ;
		viewAllDetailsOfEmployee.pf = (salaryCalculation * 0.07);
		viewAllDetailsOfEmployee.salary = ( salaryCalculation - viewAllDetailsOfEmployee.pf );		
		
		}
		catch(NullPointerException e) {
			System.out.println(employeeId + " Not Found");
		}
		return viewAllDetailsOfEmployee;
	}
	
	
	
	
	
	
		
}



