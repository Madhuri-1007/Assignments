package Assignments;

public class Assignmennt6_ConditionalStatements {
	
	
	public static void main(String[] args) {
		
		
		/* Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
marks [75, 80, 82] Add 10 marks to each students using assignment operators and
store it into another array, after adding 10 marks identify the average marks of all
students*/
		//create 1st array for student name
		String[] StudentName = new String[3];
		
		StudentName[0] = "Suresh";
		StudentName[1] = "Mahesh";
		StudentName[2] = "Naresh";
		
		//create 2nd array for marks
		int[] StudentMarks = new int[3];
		
		StudentMarks[0] = 75;
		StudentMarks[1] = 80;
		StudentMarks[2] = 82;
		
		//Add 10 marks to each student
		
		int[] UpdatedMarks = new int[3];
		
		UpdatedMarks[0] = (StudentMarks[0]+10);
		UpdatedMarks[1] = (StudentMarks[1]+10);
		UpdatedMarks[2] = (StudentMarks[2]+10);
		
		System.out.println("Updated Marks :");
		
		System.out.println(StudentName[0] + ":" + UpdatedMarks[0] );
		System.out.println(StudentName[1] + ":" + UpdatedMarks[1] );
		System.out.println(StudentName[2] + ":" + UpdatedMarks[2] );
		
		float Average = ((UpdatedMarks[0]+UpdatedMarks[1]+UpdatedMarks[2])/3);
		
		System.out.println("Average Marks:" +Average);
			
		
		
		
	}
		
	}
	
	


