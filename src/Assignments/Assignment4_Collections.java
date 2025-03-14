package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment4_Collections {

	
public static void main(String[] args)
{

	List<String> EmpId = new ArrayList<String>();
	List<String> Name = new ArrayList<String>();
	List<Integer> Age = new ArrayList<Integer>();
	List<String> Gender = new ArrayList<String>();
	List<String> Department = new ArrayList<String>();
	List<String> Position = new ArrayList<String>();
	List<Long> Salary = new ArrayList<Long>();
	List<String> Email = new ArrayList<String>();
	List<Double> PhoneNumber = new ArrayList<Double>();
	
	
	//Add EmpID Values
	EmpId.add("E001");
	EmpId.add("E002");
	EmpId.add("E003");
	
	//Add Names
	
	Name.add("Alice Green");
	Name.add("Bob Johnson");
	Name.add("Carol White");
	
	//Add Age
	
	Age.add(30);
	Age.add(25);
	Age.add(30);
	
	//Add Gender
	Gender.add("Male");
	Gender.add("Female");
	
	//Add Department
	
	Department.add("Engineering");
	Department.add("Marketing");
	Department.add("Sales");
	
	//Add Position
		
	Position.add("Software Engineer");
	Position.add("Marketing Engineer");
	Position.add("Sales Excecutive");
	
	// Add Salary
	
	Salary.add(75000L);
	Salary.add(85000L);
	Salary.add(65000L);
	
	// Add Email
	
	Email.add("alice@example.com");
	Email.add("Bob Johnson@example.com");
	Email.add("Carol White@example.com");
	
	//Add Phone Number
	
	PhoneNumber.add(9876543213d);
	PhoneNumber.add(9876543214d);
	PhoneNumber.add(9876543215d);
	
	System.out.println(Email.get(1));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
