package in.lingtan;

import java.time.LocalDate;

public class EmployeeDataValidation {
	
	/**
	 * This method checks whether the name has no empty value or null values
	 * @param name
	 * @return
	 */
	public static boolean isValidName(String name){
		boolean isValidName = true;
		try{
			if(name.trim().isEmpty()) {
				isValidName = false;
			}
		}
		catch(Exception e) {
			System.out.println("invalid Name");
			
		}
		return isValidName;
	}

	/**This method checks whether the date of birth is not a future date
	 * This method
	 * @param date
	 * @return
	 */
	public static boolean isValidDate(LocalDate date) {
		boolean isValidDate = true;
		if(date.isAfter(LocalDate.now())) {
			isValidDate = false;
		}
		
		return isValidDate;
		
	}
	
	/**
	 * This method checks whether the length of mobile number is 10 digits
	 * @param number
	 * @return
	 */
	public static boolean isValidMobileNumber(Long number) {
		boolean isValidNumber = false;
		number = (long) number.toString().trim().length();
		if(number == 10) {
			isValidNumber = true;
		}
		return isValidNumber;
	}
	
	
	

}

