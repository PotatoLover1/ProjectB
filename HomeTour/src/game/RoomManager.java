package game;
import java.util.List;
import fixtures.Room;
import java.util.Arrays;

public class RoomManager {
	Room[] rooms;
	Room startingRoom;

	public void init() {
		
		//Starting Room
	    Room foyer = new Room("The Foyer", "a small foyer",
	               "The small entrway of a neo-colonial house. A dining Room is open to the South, Where a large table can be seen\n"
	                       + "The hardwood floor leads west into doorway, next to a staircase that leads up to a second dloor"
	                       + "and a door that leads to the basement.\n");
	    
	    List<String> move = foyer.getMove(); //instantiate the starting room
		rooms = new Room[move.size()];

		
		//The other rooms
		Room kit = new Room("Kitchen",
				           "a small kitchen",
				           "There's alot of rusted pots, pans, and alot of moldy food. "
				           + "The dining table, you see a family of ducks eating dinner.");
		
		Room lr = new Room("Living Room", 
				 	       "a modern looking room",
				 	       "There's a large flat screen and a very new looking sofa, accented with a crimson red carpet.");
		
		Room br = new Room("Bed Room", 
				           "a old smelly bedroom", 
				           "The bed is made with finest silk, touching it feels like you're touching a soft and smooth baby seal.");
		
		Room bt = new Room("Bathroom", 
				           " a room with just a toilet", 
				           "There's a single toilet in the center of the room and a mirror in front of it.");
		
		Room bs = new Room("Basement", 
				           "a haven for ducks", 
				           "A majectic pond with a beautiful waterfall next to it and a shrine dedicated to a golden duck.");
		
		Room at = new Room("Attic", 
				           "a den of smells", 
				           "There's a small hut in the middle of the swamp, and a sign next to it saying (Beware of Ogre)");

		
		this.startingRoom = foyer;
		
		//Exits for the foyer
		rooms[move.indexOf("North")] = kit;
		rooms[move.indexOf("West")] = lr;
		rooms[move.indexOf("Up")] = at;
		foyer.setExits(rooms);
		
		rooms = new Room[move.size()];//Arrays.fill(rooms, null);// 
		rooms[move.indexOf("South")] = foyer;
		kit.setExits(rooms);
		
	    rooms = new Room[move.size()];
		rooms[move.indexOf("North")] = br;
		rooms[move.indexOf("East")] = foyer;
		lr.setExits(rooms);
		
	    rooms = new Room[move.size()];
		rooms[move.indexOf("South")] = lr;
		rooms[move.indexOf("West")] = bt;
		br.setExits(rooms);
		
	    rooms = new Room[move.size()];
		rooms[move.indexOf("East")] = br;
		rooms[move.indexOf("Down")] = bs;
		bt.setExits(rooms);
		
	    rooms = new Room[move.size()];
		rooms[move.indexOf("UpWest")] = bt;
		rooms[move.indexOf("UpEast")] = foyer;
		bs.setExits(rooms);
		
	    rooms = new Room[move.size()];
		rooms[move.indexOf("Down")] = foyer;
		at.setExits(rooms);
		

		

	}


	

}
