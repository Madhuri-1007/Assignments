package Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5_Maps {
	
	
	public static void main(String[] args) {
		
		
/* Inside this Excel There are 3 TestCases with each Testcase having 3 rows of data. 
 * Now, Create Map<String, Map<String,String>> to store all the data and Print the data from Product details > Supplier Name >
 *  Office Depot  from the   Map<String, Map<String,String>>*/		
		
		Map<String,String> ProductRow1 = new HashMap<String,String>();
		
		ProductRow1.put("Product ID", "P001");
		ProductRow1.put("Name", "Laptop");
		ProductRow1.put("Category", "Electronics");
		ProductRow1.put("Price", "$1200");
		ProductRow1.put("Stock Quantity", "50");
		ProductRow1.put("Supplier", "Tech Supplies");
		ProductRow1.put("Warranty", "2 years");
		ProductRow1.put("Rating", "2.5");
		ProductRow1.put("Manufacturing Date", "1/15/2023");
		ProductRow1.put("Expiry Date", "1/15/2025");
		
		
		Map<String,String> ProductRow2 = new HashMap<String,String>();
		
	    ProductRow2.put("Product ID", "P002");
		ProductRow2.put("Name", "Desk Chair");
		ProductRow2.put("Category", "Furniture");
		ProductRow2.put("Price", "$150");
		ProductRow2.put("Stock Quantity", "100");
		ProductRow2.put("Supplier", "Office Depot");
		ProductRow2.put("Warranty", "1 year");
		ProductRow2.put("Rating", "4");
		ProductRow2.put("Manufacturing Date", "2/10/2023");
		ProductRow2.put("Expiry Date", "N/A");
		
      Map<String,String> ProductRow3 = new HashMap<String,String>();
		
	    ProductRow3.put("Product ID", "P003");
		ProductRow3.put("Name", "Coffee Maker");
		ProductRow3.put("Category", "Kitchen");
		ProductRow3.put("Price", "$75");
		ProductRow3.put("Stock Quantity", "200");
		ProductRow3.put("Supplier", "KitchenWorld");
		ProductRow3.put("Warranty", "6 months");
		ProductRow3.put("Rating", "4.2");
		ProductRow3.put("Manufacturing Date", "3/20/2023");
		ProductRow3.put("Expiry Date", "3/20/2024");
		
		List<Map<String,String>> Products = new ArrayList<Map<String,String>>();
		
		Products.add(ProductRow1);
		Products.add(ProductRow2);
		Products.add(ProductRow3);
		
		
		
		
        Map<String,String> Student1Map = new HashMap<String,String>();
		
		Student1Map.put("Product ID", "P001");
		Student1Map.put("Name", "Laptop");
		Student1Map.put("Category", "Electronics");
		Student1Map.put("Price", "$1200");
		Student1Map.put("Stock Quantity", "50");
		Student1Map.put("Supplier", "Tech Supplies");
		Student1Map.put("Warranty", "2 years");
		Student1Map.put("Rating", "2.5");
		Student1Map.put("Manufacturing Date", "1/15/2023");
		Student1Map.put("Expiry Date", "1/15/2025");
		
		
		Map<String,String> Student2Map = new HashMap<String,String>();
		
	    Student2Map.put("Product ID", "P002");
		Student2Map.put("Name", "Desk Chair");
		Student2Map.put("Category", "Furniture");
		Student2Map.put("Price", "$150");
		Student2Map.put("Stock Quantity", "100");
		Student2Map.put("Supplier", "Office Depot");
		Student2Map.put("Warranty", "1 year");
		Student2Map.put("Rating", "4");
		Student2Map.put("Manufacturing Date", "2/10/2023");
		Student2Map.put("Expiry Date", "N/A");
		
      Map<String,String> Student3Map = new HashMap<String,String>();
		
	    Student3Map.put("Product ID", "P003");
		Student3Map.put("Name", "Coffee Maker");
		Student3Map.put("Category", "Kitchen");
		Student3Map.put("Price", "$75");
		Student3Map.put("Stock Quantity", "200");
		Student3Map.put("Supplier", "KitchenWorld");
		Student3Map.put("Warranty", "6 months");
		Student3Map.put("Rating", "4.2");
		Student3Map.put("Manufacturing Date", "3/20/2023");
		Student3Map.put("Expiry Date", "3/20/2024");
		
		List<Map<String,String>> Students = new ArrayList<Map<String,String>>();
		
		Students.add(Student1Map);
		Students.add(Student2Map);
		Students.add(Student3Map);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
