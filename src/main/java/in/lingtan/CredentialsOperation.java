package in.lingtan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CredentialsOperation {
	static HashMap<String , String> masterCredentialStorage = new HashMap<String , String>();
    static HashMap <String,String > adminCredentialHashTable = new HashMap<String, String>();
	
	static {
			masterCredentialStorage.put("Ling2657","@Password123");
			masterCredentialStorage.put("Andr2766","@Password123");
			masterCredentialStorage.put("Arya2657","@Password123");
			masterCredentialStorage.put("Madd2657","@Password123");
			masterCredentialStorage.put("Vija2657","@Password123");		
	}
	/**
	 * To register a new employee by the administrator
	 * @param username
	 * @param password
	 * @return
	 */
		public static boolean registerEmployee(String employeeId, String password) {
			boolean isRegistered = false;
			
			boolean isValidAllParameters = employeeIdValidation(employeeId);
			boolean isValidPasswordFormat = EmployeeDataValidation.isValidPasswordFormat(password);
			
			try {
				if(masterCredentialStorage.containsKey(employeeId)) {
					isRegistered=false;
				}
				else if(isValidAllParameters && isValidPasswordFormat) {
					masterCredentialStorage.put(employeeId, password);
					isRegistered = true;
					}
			}
			catch(NullPointerException e) {
				System.out.println("Cannot register employee with no fields");
			}
			return isRegistered;
		}
		
		public static boolean employeeIdValidation(String employeeId) {
			boolean isValidAllParameters = false;
			boolean isEmptyAndNull = InputCredentialDataValidation.isEmptyAndNull(employeeId);
			boolean isValidEmployeeIdLength = InputCredentialDataValidation.isValidEmployeeIdLength(employeeId);
			boolean isValidEmployeeIdFormat = InputCredentialDataValidation.isValidEmployyeeIdFormat(employeeId);
			
			if(isEmptyAndNull && isValidEmployeeIdFormat && isValidEmployeeIdLength) {
				isValidAllParameters = true;
			}
			return isValidAllParameters;
		}
		/**
		 * The credentials entered by the users are verified and boolean value is returned
		 * @param employeeId
		 * @param password
		 * @return
		 */
		public static boolean employeeCredentialValidation(String employeeId, String password) {
			boolean isValidCredentials = false;
			boolean isValidAllParameters = employeeIdValidation(employeeId);
			boolean isValidPasswordFormat = EmployeeDataValidation.isValidPasswordFormat(password);
			if(isValidAllParameters && isValidPasswordFormat) {
				if(masterCredentialStorage.containsKey(employeeId) && password.equals(masterCredentialStorage.get(employeeId))) {
						isValidCredentials = true;
					}
				}
			return isValidCredentials;
		}

		/**
		 * This method is used to validate the admin username and password during login, Since there must be a default admin at first an admin is added into the array while writing the program
		 * @param adminUsername
		 * @param adminPassword
		 * @return
		 */
		
		public static boolean adminValidation(String adminUsername, String adminPassword) {
			boolean isValidAdmin = false;
			adminCredentialHashTable.put("Ling2657".trim(),"@Password123".trim());
			if(adminUsername != null && adminPassword != null) {
				if(adminCredentialHashTable.containsKey("Ling2657")){
					if(adminPassword.equals(adminCredentialHashTable.get(adminUsername))){
						isValidAdmin = true;
					}
				}
			}
			return isValidAdmin;
			
		}
		public static boolean isUserAvailable(String employeeId) {
			boolean isAvailable = false;
			if(employeeId != null) {
				if(masterCredentialStorage.containsKey(employeeId)) {
				isAvailable = true;
			}
		}
		return isAvailable;
		}
		
		/**
		 * This method is used to add a new admin to access the admin portal- This add admin feature can be accessed by the existing admin
		 * @param newAdminUsername
		 * @param newAdminPassword
		 * @return 
		 */
		public static boolean addNewAdmin(String newAdminUsername, String newAdminPassword) {
			boolean isAdminRegistered = false;
			boolean isValidAllParameters = employeeIdValidation(newAdminUsername);
			boolean isValidPasswordFormat = EmployeeDataValidation.isValidPasswordFormat(newAdminPassword);
			if(masterCredentialStorage.containsKey(newAdminUsername)) {
				isAdminRegistered=false;
			}
			else {
				if(isValidAllParameters && isValidPasswordFormat) {
					adminCredentialHashTable.put(newAdminUsername, newAdminPassword);
					isAdminRegistered = true;
				}
			}
			return isAdminRegistered;
		}
		
		/**
		 * This method is used to reset the password of a existing employee - because the password is created by the admin during the registration process of the employee so that password has to be changed 
		 * @param employeeId
		 * @param oldPassword
		 * @param newPassword
		 * @return 
		 */
		
		public static boolean resetPassword(String employeeId, String oldPassword, String newPassword) {
			boolean isChanged = false;
			boolean isValidPasswordFormat = EmployeeDataValidation.isValidPasswordFormat(newPassword);
			if(employeeId !=null) {
				if(masterCredentialStorage.containsKey(employeeId) && isValidPasswordFormat ) {
					masterCredentialStorage.replace(employeeId , oldPassword, newPassword);
					isChanged =true;
			}
			}
			return isChanged;
		}
						
		/**This method displays the masterCredential data of the employee
		 * 
		 * @return
		 */
		public static HashMap<String, String> getCredentials(){
			return masterCredentialStorage;
		}
		/**
		 * This method returns the Credential datas for the admins
		 * @return
		 */
		public static HashMap<String, String> getAdminCredentials() {
			return adminCredentialHashTable;
	}
	
}
