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
	public static boolean isNameNull(String name){  // " " Lingtan Null
		boolean isValidName = false;
		
		if(name != null) {
			isValidName = true;
		}
		
		return isValidName;
	}
	
	public static boolean isNameNotEmpty(String name){  // " " Lingtan Null
		boolean isValidName = true;
		
		if(name.trim().isEmpty()) {
			isValidName = false;
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
	public static boolean isValidMobileNumberLength(Long number) {
		boolean isValidNumber = false;
		if(number != null) {
			long numberString = (long) number.toString().trim().length();
			if((numberString == 10) && number != 0) {
				isValidNumber = true;
			}
		}		
		return isValidNumber;
	}
	
	public static boolean isMobileNumberPositive(Long number) {
		boolean isValidNumber = false;
		if(number != null) {
			if(number>0) {
			isValidNumber = true;
			}
		}		
		return isValidNumber;
	}
	
	
	public static boolean isValidEmailId(String emailId) {
		boolean isValidEmailId = false;
		if(emailId == null || emailId.isEmpty()) {
			isValidEmailId = false;
		}
		
		else {
			String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			Pattern regexEmailFormat = Pattern.compile(regex);
			Matcher matchEmailPattern = regexEmailFormat.matcher(emailId);
			isValidEmailId = matchEmailPattern.matches(); 
			
		}
		return isValidEmailId;
	}

	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	public static boolean isEmployeeIdEmptyAndNull(String employeeId) {   //null, "" 
		boolean isEmployeeNull = true;
			if(employeeId == null){
				isEmployeeNull = false;	
				
			}
			else if(employeeId.trim().length()==0) {
				 
				isEmployeeNull = false;
			}
		return isEmployeeNull;
	}
	
	public static boolean isValidEmployeeIdLength(String employeeId) {
		boolean isValidEmployeeId = false;
		if(employeeId!=null) {
		if(employeeId.length() == 8) {
			isValidEmployeeId = true;
		}
		}
		
		return isValidEmployeeId;
	}
	
	
	public static boolean isValidEmployyeeIdFormat(String employeeId) {
		boolean isValidFormat = false;
		if(employeeId!=null) {
			String stringOfId  = employeeId.replaceAll("\\D", "");
			String digitsOfId  = employeeId.replaceAll("\\d", "");
			if((stringOfId.length()==4) && (digitsOfId.length()==4)) {
				isValidFormat=true;
			}	
		}
		
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


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static boolean employeeIdValidation(String employeeId) {
		boolean isValidAllParameters = false;
		boolean isEmptyAndNull = EmployeeDataValidation.isEmployeeIdEmptyAndNull(employeeId);
		boolean isValidEmployeeIdLength = EmployeeDataValidation.isValidEmployeeIdLength(employeeId);
		boolean isValidEmployeeIdFormat = EmployeeDataValidation.isValidEmployyeeIdFormat(employeeId);
		
		if(isEmptyAndNull && isValidEmployeeIdFormat && isValidEmployeeIdLength) {
			isValidAllParameters = true;
		}
		return isValidAllParameters;
	}
	
	public static boolean employeeNameFinalValidation(String employeeName) {
		boolean isEmployeeNameValid = false;
		boolean isNameNotNull = EmployeeDataValidation.isNameNotEmpty(employeeName);
		boolean isNameNull = EmployeeDataValidation.isNameNull(employeeName);
		if(isNameNotNull && isNameNull) {
			isEmployeeNameValid = true;
		}
		return isEmployeeNameValid;
	}
	
	public static boolean finalMobileNumberValidation(long mobileNumber) {
		boolean isValidMobileNumber = false;
		boolean isValidMobileNumberLength = EmployeeDataValidation.isValidMobileNumberLength(mobileNumber);
		boolean isMobileNumberPositive = EmployeeDataValidation.isMobileNumberPositive(mobileNumber);
		if(isMobileNumberPositive && isValidMobileNumberLength) {
			isValidMobileNumber = true;
			
		}
		return isValidMobileNumber;
	}
	
	


}
