package Assignments;

public class Assignment3_EmpGroups {
	
	
	//create another class called EmpGroups that contains two arrays to store the employee names
	//and IDs//
	
	public static void main(String[] args) {
		
		
		Assignment3_ClassAndObjects Group = new Assignment3_ClassAndObjects();
		
		
		Group.EmployeeNames[0] = "Bharath";
		
		Group.EmployeeNames[1] = "ABC";
		
		Group.EmployeeNames[2] = "XYZ";
		
		
         Group.EmployeeID[0] = 1234;
		
         Group.EmployeeID[1] = 1235;
		
         Group.EmployeeID[2] = 1236;
         
         
         //Employee Name: Bharath, Employee ID: 1234
         
         
         System.out.println("Employee Name: " + Group.EmployeeNames[0] + " Employee ID:" + Group.EmployeeID[0] );
         
    
         
         System.out.println("Employee Name: " + Group.EmployeeNames[1] + " Employee ID:" + Group.EmployeeID[1] );
         
         
		
         System.out.print("Employee Name: " + Group.EmployeeNames[2] + " Employee ID:" + Group.EmployeeID[2] );
         
       
		
		
	}
	

}
