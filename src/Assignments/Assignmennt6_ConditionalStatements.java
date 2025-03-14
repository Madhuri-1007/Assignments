package Assignments;

public class Assignmennt6_ConditionalStatements {
	
	
	public static void main(String[] args) {
		
		//If the credit score is above 750, the loan is automatically approved.
		
		int score = 720;
		String customerName = "John Doe";
		
		System.out.println(customerName);		
		
		if(score >= 750)
			
		{
			
			System.out.println("Loan is Approved");
		}
		
		//If the credit score is between 650 and 750, additional checks are performed.
		else if(score>650 && score<750) {
			
			System.out.println("the customer’s income must be at least $50,000 for the loan to be considered.");
		}
		
		//If the credit score is below 650, the loan is denied.
		else
		{
			System.out.println("Loan is Denied");
		}
		
		
		
		/*Employment Status:
o If the customer’s income is at least 50,000, the system checks whether the customer is
employed.
o If the customer is unemployed, the loan is denied.*/
		
		
		boolean employee = true;
		
		Double income = 55000.0d;
		
		if( employee == true && income >= 55000.0)
			
		{
			
		System.out.println("Customer is employee");
		}
		else
		{
			System.out.println("loan is denied");
		}
	
		/*Debt-to-Income Ratio:
o If the customer is employed, the system checks the debt-to-income (DTI) ratio.
o If the DTI ratio is less than 40%, the loan is approved.
o If the DTI ratio is 40% or greater, the loan is denied.
		 */
	float debtToIncomeRatio = 35.0f;
	
	if(debtToIncomeRatio < 40.0)
	{
		System.out.println("loan is Approved");
	}
	else if(debtToIncomeRatio > 40.0)
	{
		System.out.println("the loan is denied.");
	}
	
		
		
		
		
		
	}
		
		
	

		
	}
	
	


