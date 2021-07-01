package game;

import java.util.Scanner;

public class Main {
	public static Scanner command = new Scanner(System.in);

	public static void main(String[] args) {

		RoomManager rm = new RoomManager();
		rm.init();
		Player player = new Player(rm.startingRoom);
		while (true) {
			printRoom(player);
			System.out.println("Where do you want to go?");
			parse(collectInput(), player);

		}
	}

	private static void printRoom(Player player) {
		System.out.println(player.getCurrentRoom().toString());
	}

	private static String[] collectInput() {
		return command.nextLine().split(" ");
	}

	private static void parse(String[] command, Player player) {
	
		switch (command[0].toLowerCase()) {
		case "go": 
			
			command[1] = command[1].substring(0, 1).toUpperCase() + "" + command[1].substring(1).toLowerCase();
			player.setCurrentRoom(player.getCurrentRoom().getExit(command[1]));
			break;
		case "quit":
			break;
		default:
			System.out.println("Wrong input please try again: please use go\n" + "use 'go' then pick an exit from above");
			break;
		}

	}

}
