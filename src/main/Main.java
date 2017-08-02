package main;

import java.util.Scanner;

import navigator.Location;
import navigator.VerbChecker;

public class Main {
	
	
	public static String question;
	public static Scanner in = new Scanner(System.in);
	public static String user="";
	public static String currentLocation="";
	

	public static void main(String[] args) {
		
		question ="0";
		
		currentLocation ="SOUTH";
		System.out.println("You wake up at South,and you dont remember anything,where u go want to go?");
		user=in.nextLine();
		user.toUpperCase();
		
		
		do
		{
			
			if(user.equalsIgnoreCase("EXIT"))
			{
				System.exit(0);
			}
			else
			{
				VerbChecker dire=new VerbChecker();
				
				currentLocation = dire.getVerb(user);
				System.out.println(currentLocation);
				
			}

			user=in.nextLine();
			user.toUpperCase();
			
		}while(true);
	}
}
