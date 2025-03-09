package Assignments;

public class Assignment2_Array {
	
	public static void main(String[]  args) {
		
		
		
		/*Create a 3D array to represent the following data:
			o Semesters as the first dimension.
			o Subjects and Marks as the second dimension.
			o Actual values for Subject Names and Marks as the third dimension.*/
		
		
		String[][][] Marks = {{{"Mathematics I","Physics","Chemistry","Computer Programming","Engineering Drawing",
                                "Basic Electrical Eng."},{"78","85","91","74","88","79"}},
				
				            {{"Mathematics II","Mechanics","Environmental Sci","Basic Electronics","Engineering Physics",
                              "Engineering Graphics"},{"82","77","93","69","84","90"}},
				            
				            {{"Data Structures","Discreate Mathmatics","Digital Electronics","Operating Systems",
					               "Signals and Systems","Object-Oriented Prog."},{"88","81","76","92","85","78"}},
                              
                              {{"Algorithms","Computer Networks","Database Systems","Microprocessors",
                                  "Communication Eng.","Software Engineering"},{"91","73","89","80","76","87"}},
                              
                              {{"Propability & Statistics","Machine Learning","Compiler Design","Theory of Computation",
                                  "Embedded Systems.","Computer Graphics"},{"86","88","84","95","73","90"}}};
		
		
		//Print Semester 3 - Subject 4 and Subject 5 Names.
		
		System.out.println(" Subject 4 and Subject 5 Names." +  Marks[2][0][3] +  " and " + Marks[2][0][4] );
		
		//Print Semester 5 - Subject 3 and Subject 6 marks
		
		System.out.println(" Subject 4 and Subject 5 Names." +  Marks[4][0][2] +  " and " + Marks[4][0][5] );
		
		
	
		
	      
		
		
		
			            
				            
		
		
		
		
	
				
				
		}
				
		
}


