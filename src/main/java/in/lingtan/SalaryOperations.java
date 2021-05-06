package in.lingtan;

public class SalaryOperations {

public static Employee addBasicPay(String employeeId, int basicPay){
	
		Employee viewAllDetailsOfEmployee = EmployeeOperations.getAllEmployees().get(employeeId);
		try {
			viewAllDetailsOfEmployee.basicPay = basicPay;
		}
		catch(NullPointerException e) {
			System.out.println(employeeId+" not found to add basic pay");
			
		}		
		return viewAllDetailsOfEmployee; 			
	}
	
	public static Employee salaryCalculation(String employeeId) {
		Employee viewAllDetailsOfEmployee =EmployeeOperations.getAllEmployees().get(employeeId);
		try {
		EmployeeConstants salaryConstants = new EmployeeConstants();
		if(viewAllDetailsOfEmployee.basicPay == 0) {
			System.out.println("No PF added for" + employeeId);
		}
		else {
		double salaryCalculation = (viewAllDetailsOfEmployee.basicPay + salaryConstants.hra + salaryConstants.lunchAllowance + salaryConstants.medicalAllowance) ;
		viewAllDetailsOfEmployee.pf = (salaryCalculation * 0.07);
		viewAllDetailsOfEmployee.salary = ( salaryCalculation - viewAllDetailsOfEmployee.pf );		
		}
		}
		catch(NullPointerException e) {
			System.out.println(employeeId + " Not Found");
		}
		return viewAllDetailsOfEmployee;
	}
	
}
