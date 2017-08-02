package navigator;

import java.util.Scanner;


public class Location {
	
	public String currentLocation;
	public static Scanner in = new Scanner(System.in);
	
	public void getLocation(String loca)
	{
		loca.toUpperCase();
		
		if(loca.equals("GO")){
			
			System.out.println("Where? \n\n");
			loca=in.nextLine();
			loca.toUpperCase();
			if(loca.equals("WEST"))
			{
				System.out.println("You are at West \n\n");
				currentLocation="WEST";
				
			}
			else if(loca.equals("EAST"))
			{
				System.out.println("You are at East \n\n");
				currentLocation="EAST";
			}
			else if(loca.equals("SOUTH"))
			{
				System.out.println("You are at South \n\n");
				currentLocation="SOUTH";
			}
		}
		else if(loca.equals("GO WEST"))
		{
			System.out.println("You are at West \n\n");
			currentLocation="WEST";
		}
		else if(loca.equals("GO EAST"))
		{
			System.out.println("You are at East \n\n");
			currentLocation="EAST";
		}
		else if(loca.equals("GO SOUTH"))
		{
			System.out.println("You are at South \n\n");
			currentLocation="SOUTH";
		}
		else
		{
			System.out.println("Wrong Location \n\n");
		}
		
	}
	
}