package in.lingtan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CredentialsOperation {
	static ArrayList<String> usernameArray = new ArrayList<String>();
	static ArrayList<String> passwordArray = new ArrayList<String>();
	static HashMap<String , String> masterCredentialStorage = new HashMap<String , String>();
	static HashMap <String,String > adminCredentialHashTable = new HashMap<String, String>();
	static {
			usernameArray.add("Ling2657");
			passwordArray.add("Lingtan");
			usernameArray.add("Andrew2766");
			passwordArray.add("Andrew");
			masterCredentialStorage.put("Ling2657","Lingtan");
			masterCredentialStorage.put("Andrew2766","Andrew");
	}
	/**
	 * To register a new employee by the administrator
	 * @param username
	 * @param password
	 * @return
	 */

		public static HashMap<String, String> registerEmployee(String username, String password) {
			usernameArray.add(username);
			passwordArray.add(password);
			masterCredentialStorage.put(username, password);
			return masterCredentialStorage;
		}
		
		/**
		 * The credentials entered by the users are verified and boolean value is returned
		 * @param employeeId
		 * @param password
		 * @return
		 */
		
		public static boolean credentialValidation(String employeeId, String password) {
			boolean isValidCredentials = false;
			try {
				if(masterCredentialStorage.containsKey(employeeId)) {
					String employeeValue = masterCredentialStorage.get(employeeId);
					if(employeeValue.equals(password)) {
						isValidCredentials = true;
					}
					
				}
				
			}
			catch(Exception e) {
				String wrong = "Wrong Password";
				System.out.println(wrong);
			}
			return isValidCredentials;
			
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
		/**
		 * This method is used to validate the admin username and password during login, Since there must be a default admin at first an admin is added into the array while writing the program
		 * @param adminUsername
		 * @param adminPassword
		 * @return
		 */
		
		public static boolean adminValidation(String adminUsername, String adminPassword) {
			boolean isValidAdmin = false;
			
			adminCredentialHashTable.put("Ling2657","Lingtan");
			if(adminCredentialHashTable.equals("Ling2657")){
				if(adminPassword.equals(adminCredentialHashTable.get(adminUsername))){
					isValidAdmin = true;
				}
			}
			return isValidAdmin;
			
		}
		public static boolean isUserAvailable(String employeeId) {
			boolean isAvailable = false;
			if(masterCredentialStorage.containsKey(employeeId)) {
				isAvailable = true;
			}
			return isAvailable;
		}
		
		/**
		 * This method is used to add a new admin to access the admin portal- This add admin feature can be accessed by the existing admin
		 * @param newAdminUsername
		 * @param newAdminPassword
		 */
		public static void addNewAdmin(String newAdminUsername, String newAdminPassword) {
		
			adminCredentialHashTable.put(newAdminUsername, newAdminPassword);
			return;
		}
		/**
		 * This method is used to reset the password of a existing employee - because the password is created by the admin during the registration process of the employee so that password has to be changed 
		 * @param employeeId
		 * @param oldPassword
		 * @param newPassword
		 * @return
		 */
		
		public static boolean resetPassword(String employeeId, String oldPassword, String newPassword) {
			boolean isReplaced = false;
			int indexOfOldPassword =  passwordArray.indexOf(oldPassword);
			if(indexOfOldPassword!=-1) {
				passwordArray.set(indexOfOldPassword, newPassword);
				masterCredentialStorage.replace(employeeId , oldPassword, newPassword);
				isReplaced = true;
			}
			
			
			return isReplaced;
			
		}
	}

