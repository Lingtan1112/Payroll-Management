package in.lingtan;

import java.time.LocalDate;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



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
		long numberString = (long) number.toString().trim().length();
		if((numberString == 10) && number != 0) {
			isValidNumber = true;
		}
		return isValidNumber;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	public static boolean isEmployeeIdEmptyAndNull(String employeeId) {   //null, "" 
		boolean isEmployeeNull = true;
			if(employeeId == null){
				isEmployeeNull = false;	
				System.out.println("Null password");
			}
			else if(employeeId.trim().length()==0) {
				System.out.println("Please Enter any value"); 
				isEmployeeNull = false;
			}
		return isEmployeeNull;
	}
	
	public static boolean isValidEmployeeIdLength(String employeeId) {
		boolean isValidEmployeeId = false;
		if(employeeId.length()==8) {
			isValidEmployeeId=true;
		}
		System.out.println("Invalid length");
		return isValidEmployeeId;
	}
	
	
	public static boolean isValidEmployyeeIdFormat(String employeeId) {
		boolean isValidFormat = false;
		String stringOfId  = employeeId.replaceAll("\\D", "");
		String digitsOfId  = employeeId.replaceAll("\\d", "");
		if((stringOfId.length()==4) && (digitsOfId.length()==4)) {
			isValidFormat=true;
		}		
		System.out.println("Invalid Format- RequiredFormat abcd1234");
		return isValidFormat;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static boolean isValidPasswordFormat(String password) {
		 boolean isValidFormat = false;
		 if (password != null) {
			 String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,15}$";
			 Pattern regexPattern = Pattern.compile(regex);
			 Matcher matchCheck = regexPattern.matcher(password);
			 isValidFormat = matchCheck.matches();
		 	}
  return isValidFormat;
}
}



