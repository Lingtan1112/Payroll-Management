package in.lingtan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class EmployeeOperations {
static ArrayList<HashMap<String, String>> masterEmployeeData = new ArrayList<HashMap<String,String>>();	//
static HashMap<String,HashMap<String,String>> masterEmployeeDataHash = new HashMap<String,HashMap<String,String>>();//This HashMap stores the Employee datas into a HashMap with their corresponding name as key eg):Lingtan={name=Lingtan,role=software}
//static HashMap<String,String> employeeDatas = new HashMap<String,String>(); //This HashMap holds the Employee data with corresponding key and value pair, It is a HashMap of data

	/**
	 * This method is used to add the Employee data mentioned below into a HashMap with corresponding Fields eg) Name = Lingtan 
	 * @param name
	 * @param role
	 * @param email
	 * @param dob
	 * @param gender
	 * @param mobileNumber
	 * @param joiningDate
	 * @return
	 */
    //This method successfully combines the data with dataField
	public static HashMap<String, String> addEmployee(String name, String role, String email, String dob, String gender, String mobileNumber, String joiningDate) {
		HashMap<String,String> employeeDatas = new HashMap<String,String>();
		String[] employeeDataKey = {"name","role","email","dob","gender","mobileNumber","joining-Date"};
		String[] employeeDataValue = {name,role,email,dob,gender,mobileNumber,joiningDate}; //This is an array of user entered values
		for(int i=0; i<employeeDataKey.length;i++) {
				employeeDatas.put(employeeDataKey[i],employeeDataValue[i]);
				
		}
		System.out.println(employeeDatas);
		//System.out.println(employeeDatas); 
		//HashMap<String,HashMap<String,String>> masterEmployeeData = masterDataStorage(employeeDatas);	
		//System.out.println(masterEmployeeData); 
		return employeeDatas;
	}
	
	/**
	 * After creating a HashMap with the user datas of type<String field and HashMap<String datafield and Data>>
	 * eg) : 
	 * @param employeeDatas
	 * @return
	 *///This method works good it combines the user data with their name as key value.
	public static HashMap<String, HashMap<String, String>> masterDataStorage(HashMap<String,String> employeeDatas) {		String getNameOfEmployee = employeeDatas.get("name");
		masterEmployeeDataHash.put(getNameOfEmployee, employeeDatas);
		masterEmployeeData.add(employeeDatas);
		//System.out.println("Master Data"+masterEmployeeDataHash);
		return masterEmployeeDataHash;
	}
	
	public static HashMap<String,HashMap<String,String>> deleteEmployee(String employeeToDelete) {
		//System.out.println("Before delete"+masterEmployeeDataHash);
		masterEmployeeDataHash.remove(employeeToDelete);
		//System.out.println("After delete"+masterEmployeeDataHash);
		return masterEmployeeDataHash;
	}
		
	public static void viewMasterData() {
		//System.out.println("Display Details121321"+masterEmployeeDataHash);
	}
	
	public static void displayMasterEmployeeData() {
		//System.out.println("Before - clearEmployee"+masterEmployeeData);
		//System.out.println("Display Details"+masterEmployeeDataHash);
		//masterEmployeeData.clear();
		//System.out.println("After - clearEmployee"+masterEmployeeData);
		//System.out.println("Cleared"+masterEmployeeData);
	}
		
		
		
		
		
}



/*public static void () {

System.out.println("Length " + masterEmployeeData.size());
System.out.println("Full"+masterEmployeeData);
//for(int i =0 ; i < masterEmployeeDataHash.size() ; i++) {
for(HashMap<String, String> individualEmployee : masterEmployeeData )  {
	System.out.println(individualEmployee);
	}
}
*/

