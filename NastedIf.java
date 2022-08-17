/*
Program: NastedIf
@Author: Shreyash Sonone
@Date: 17 Aug 2022
*/

class NestedIf
{
	static void takeAdmission()
	{
		float totalMarks=73.9f;
		float pcmMarks=87.9f;
		System.out.println(" Total Marks" +totalMarks);
		System.out.println(" PCM Marks =" +pcmMarks);
		if(totalMarks>75)
		{
			if(pcmMarks>85)
				System.out.println("---You are eligible for our college(B.Tech)---");
			else
				System.out.println("---You are eligible for our college(BCA)---");
		}
		else
			System.out.println("---You are not eligible for our college---");
		System.out.println("---Thank You for Applying---");
	}	
	public static void main(String args[])
	{
		takeAdmission();
		
	}
}	