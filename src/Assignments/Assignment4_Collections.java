package Assignments;

import java.util.List;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.lang.Integer;

public class Assignment4_Collections {

	
public static void main(String[] args)
{

	/*1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
	cities combined.*/
	
	
	System.out.println("***********Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.********");
	
	List<String> Top5Cities = new LinkedList<String>();
	
	Top5Cities.add("Delhi");
	Top5Cities.add("Bangalore");
	Top5Cities.add("Visakhapatnam");
	Top5Cities.add("Hyderabad");
	Top5Cities.add("Lucknow");
	
	
	
	List<Integer> Area = new LinkedList<Integer>();
	
	Area.add(1484);
	Area.add(741);
	Area.add(681);
	Area.add(650);
	Area.add(631);
	
	System.out.println("Top 3rd and 4th Citites are :"  +Top5Cities.get(2) +  " and "   + Top5Cities.get(3));
	
	System.out.println("total area of the 3rd and 4th cities are :" +(Area.get(2)+Area.get(3)));
	
	
	/* Create a set of the top 10 most visited tourist attractions in the world and print out of them and its size.*/
	
	System.out.println("********Create a set of the top 10 most visited tourist attractions in the world and print out of them and its size.*****");
	
    Set<String> TouristPlaces = new HashSet<String>();
	
	TouristPlaces.add("Eiffel Tower");
	TouristPlaces.add("Taj Mahal");
	TouristPlaces.add("Colosseum");
	TouristPlaces.add("Forbidden City");
	TouristPlaces.add("Louvre Museum");
	TouristPlaces.add("Mysore Palace");
	TouristPlaces.add("Las Vegas Strip");
	TouristPlaces.add("Great Wall of China");
	TouristPlaces.add("Palace of Versailles");
	TouristPlaces.add("Statue of Unity");
	
	
   System.out.println("Size of the Set : " +TouristPlaces.size());
   
   
  
   System.out.println(TouristPlaces);
  
   
  
   /*Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.*/
   
   System.out.println("*****Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.*****");
   
    int[] numbers = {100,200,300,400,500,600,700,800,900,100};
    
    System.out.println(numbers[4]/10);
    System.out.println(numbers[5]/10);
	
    
    
    /*Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.*/
    
    
    System.out.println("*************Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list**********");
    
    List<String> Movies = new ArrayList<String>();
    
    Movies.add("Bahubali");
    Movies.add("RRR");
    Movies.add("KGF");
    Movies.add("Devara");
    Movies.add("Pushpa");
    
    System.out.println("third movie on the list is : " +Movies.get(2));
    
    
	
	

	
	
	
	
	
	
	
	
	
	
	
}

}
