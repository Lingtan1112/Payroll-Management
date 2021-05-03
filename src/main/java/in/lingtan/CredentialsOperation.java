package in.lingtan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CredentialsOperation {
	static ArrayList<String> usernameArray = new ArrayList<String>();
	static ArrayList<String> passwordArray = new ArrayList<String>();
	static HashMap<String , String> masterCredentialStorage = new HashMap<String , String>();
	
	static {
			usernameArray.add("Ling2657");
			passwordArray.add("Lingtan");
			usernameArray.add("Andrew2766");
			passwordArray.add("Andrew");
			masterCredentialStorage.put("Ling2657","Lingtan");
			masterCredentialStorage.put("Andrew2766","Andrew");
	}

		public static HashMap<String, String> registerEmployee(String username, String password) {
			usernameArray.add(username);
			passwordArray.add(password);
			masterCredentialStorage.put(username, password);
			return masterCredentialStorage;
		}
		
		public static boolean credentialValidation(String employeeId, String password) {
			boolean isValidCredentials = false;
			try {
				if(usernameArray.contains(employeeId)) {
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
		public static HashMap<String, String> getCredentials(){
			System.out.println("Displaying UsersCredentials");
			return masterCredentialStorage;
		}
		
		public static boolean adminValidation(String adminUsername, String adminPassword) {
			boolean isValidAdmin = false;
			HashMap <String,String > adminCredentialHashTable = new HashMap<String, String>();
			adminCredentialHashTable.put("Ling2657","Lingtan");
			if(adminCredentialHashTable.equals("Ling2657")){
				if(adminPassword.equals(adminCredentialHashTable.get(adminUsername))){
					isValidAdmin = true;
				}
			}
			
			return isValidAdmin;
			
		}
		
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

