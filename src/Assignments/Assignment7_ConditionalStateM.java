package Assignments;

public class Assignment7_ConditionalStateM {
	
	
	
	/*If the credit score is above 750, the loan is automatically approved.*/
	
	
	public static void main(String[] args) {
		
//		
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;
		
		System.out.println("customerName = \"John Doe\"");
		
		if(creditScore > 750)
		{
			System.out.println("Loan Approved");
			
		}
		
		else if ((creditScore > 650) && (creditScore <=750))
		{
		if(income>=50000)
		 {
			 if(isEmployed == true)
			 {
				 if(debtToIncomeRatio < 40)
				 {
					 System.out.println("Loan Approved");
				 }
			 }
		 }
		 
		
		
		 else
		 {
			 System.out.println("Loan Denied");
		 }
		
		}
		
		}
		
	}

		
		



		
	
			
		
			
			
			
		
		
			
			
		
		
		
		
	
	


