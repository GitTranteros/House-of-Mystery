package game;

import java.util.Enumeration;
import java.util.Vector;

public class Player {
	
	public String text;
	public static String currentLocation;
	public Vector inventory;
	
	
	
	
	public void inputText(String text){
		
		
		
	}
	
	
	
	public void getInventory(){
		
		 Enumeration vEnum = inventory.elements();
		 System.out.println("\nElements in vector:");
	      while(vEnum.hasMoreElements())
	         System.out.print(vEnum.nextElement() + " ");
	      System.out.println();
		
	}
	

}
