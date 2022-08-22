/*
	Program: Java Program to print Formal Abbreviation (Using Switch)
	@author: Shreyash Sonone	
	@Date  : 22 August 2022
*/

// Declaring a class named FormalAbbr
class FormalAbbr
{	
	// Creating a method printAbbr to print full form of abbrivations
	static void printAbbr(String choice)
	{
		
		// Switch case start 
		switch(choice)
		{
			
			// if the case is agm 
			case "agm" -> System.out.println("AGM -> annual general meeting"); 
			// if the case is eta
			case "eta" -> System.out.println("ETA -> estimated time of arrival");
			// if the case is r&d 
			case "r&d" -> System.out.println("R&D -> research and development"); 
			// if the case is pr
			case "pr" -> System.out.println("PR -> public relations"); 
			// if the case is est.
			case "est." -> System.out.println("est. -> established"); 
			// if the case is not found
			default -> System.out.println("Wrong Input"); 
		
		}
		// Switch case end
		
		
	}
	
	// Calling the main method
	public static void main(String args[])
	{	
		//calling method printAbbr()
		printAbbr(args[0]).toLowerCase(); //passing 1 string command line argument
		
	}
}