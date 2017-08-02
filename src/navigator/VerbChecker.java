package navigator;

import java.util.Scanner;
import game.Player;
import game.ActionType;

	public class VerbChecker{
		
		public static Scanner in = new Scanner(System.in);
		
		
		 private String verb;

		   
		    public String getVerb(String dir) {
		    	
		    	this.verb=dir;
		    	verb.toUpperCase();
		    	
		    	//if(verb.contains("GO"))
		    	//{
		    		Location desti=new Location();
			    	desti.getLocation(verb);
			    	
			    	Player.currentLocation= desti.currentLocation;
		    	//}
		    	//else
		    	/*{
		    		ActionType action=new ActionType();
		    		
		    		action.getAction(verb);
		    	}
		   */
			    	return desti.currentLocation;
		    }
}
