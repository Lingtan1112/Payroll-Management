package in.lingtan;

import java.util.ArrayList;
import java.util.HashMap;


public class CredentialsOperation {
static ArrayList<String> usernameArray = new ArrayList<String>();
static ArrayList<String> passwordArray = new ArrayList<String>();
static HashMap<String , String> masterCredentialStorage = new HashMap<String , String>();

	public static HashMap<String, String> registerEmployee(String username, String password) {
		usernameArray.add(username);
		passwordArray.add(password);
		masterCredentialStorage.put(username, password);
		//System.out.println(masterCredentialStorage);
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
			String wrong = "Wrong Passwordiytuytiu";
			System.out.println(wrong);
		}
		return isValidCredentials;
		
	}
}

	