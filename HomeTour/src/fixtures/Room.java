package fixtures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room extends Fixture{
	private Room[] exits;
	private List<String> move = Arrays.asList("North", "South", "East", 
			                                  "West", "Up", "Down", "UpEast", "UpWest");
	//private Map<String, String> move2 = new HashMap<>(); 
	//Constructor
	public Room(String name, String sDesc, String lDesc) {
		super(name, sDesc, lDesc);
		this.exits = new Room[move.size()];
	}
	
	//Getter for exit
	public Room getExit(String move) {
		return exits[this.move.indexOf(move)];
	}
	
	//Getter for move which is a list
	public List<String> getMove() {
		return move;
	}

	//Getter for exit
	public Room[] getExits() {
		return exits;
	}

	
	//Setter for Exit
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	@Override
	public String toString() {
		String exits = "";
		 for (String i : this.move) {//for (int i = 0; i < move.length; i++) both the same thing but for some reason length is invalid
			if(getExit(i) != null)
				exits += (i + ": " + getExit(i).getsDesc() + "\n"); // prints the list of the exits into the console
		}
		return this.getName() + "\n\n" + this.getlDesc() + "\n\n" + "Exits:\n" + exits; // displays the long descriptions and the exits
	}


	
	
}
