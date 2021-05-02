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
	public static HashMap<String, HashMap<String, String>> addEmployee(String name, String role, String email, String dob, String gender, String mobileNumber, String joiningDate) {
		HashMap<String,String> employeeDatas = new HashMap<String,String>();
		String[] employeeDataKey = {"name","role","email","dob","gender","mobileNumber","joining-Date"};
		String[] employeeDataValue = {name,role,email,dob,gender,mobileNumber,joiningDate}; //This is an array of user entered values
		for(int i=0; i<employeeDataKey.length;i++) {
				employeeDatas.put(employeeDataKey[i],employeeDataValue[i]);
				
		} 
		HashMap<String,HashMap<String,String>> masterEmployeeData = masterDataStorage(employeeDatas);	
		return masterEmployeeData;
	}
	
	/**
	 * After creating a HashMap with the user datas of type<String field and HashMap<String datafield and Data>>
	 * eg) : 
	 * @param employeeDatas
	 * @return
	 *///This method works good it combines the user data with their name as key value.
	
	public static HashMap<String, HashMap<String, String>> masterDataStorage(HashMap<String,String> employeeDatas) {		
		String getNameOfEmployee = employeeDatas.get("name");
		masterEmployeeDataHash.put(getNameOfEmployee, employeeDatas);
		masterEmployeeData.add(employeeDatas);
		return masterEmployeeDataHash;
	}
	
	public static HashMap<String,HashMap<String,String>> deleteEmployee(String employeeToDelete, HashMap<String,HashMap<String,String>> masterEmployeeData) {
		masterEmployeeData.remove(employeeToDelete);
		return masterEmployeeData;
	}
	
	public static void displayEmployeeData(HashMap<String,HashMap<String,String>> masterEmployeeData ) {
	System.out.println("Length " + masterEmployeeData.size());
	for(Entry<String, HashMap<String, String>> individualEmployee :  masterEmployeeData.entrySet() ) 	{
		System.out.println("1"+individualEmployee);
		
		
	}
	}
	
}



