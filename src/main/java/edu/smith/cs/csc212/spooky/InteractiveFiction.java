package edu.smith.cs.csc212.spooky;

import java.util.ArrayList;
import java.util.List;

/**
 * This is our main class for SpookyMansion.
 * It interacts with a GameWorld and handles user-input.
 * It can play any game, really.
 *
 * @author jfoley
 *
 */
public class InteractiveFiction {

	/**
	 * This method actually plays the game.
	 * @param input - a helper object to ask the user questions.
	 * @param game - the places and exits that make up the game we're playing.
	 * @return where - the place the player finished.
	 */
	static String runGame(TextInput input, GameWorld game) {
		// This is the current location of the player (initialize as start).
		// Maybe we'll expand this to a Player object.
		
		String place = game.getStart(); //place = Player
		List<String> bag = new ArrayList<>();
		
		//for loop to put stuff in 
		//here.printItems();

		// Play the game until quitting.
		// This is too hard to express here, so we just use an infinite loop with breaks.
		while (true) {
			// Print the description of where you are.
			Place here = game.getPlace(place);
			
			System.out.println();
			System.out.println("... --- ...");
			System.out.println(here.getDescription());
			System.out.println(here.printItems());
			System.out.println("Time");
		
				
			if (here.hasVisited()) {
				System.out.println("This place feels familiar..."); 
			}
			here.visit();

			// Game over after print!
			if (here.isTerminalState()) {
				break;
			}

			// Show a user the ways out of this place.
			List<Exit> exits = here.getVisibleExits();
			

			for (int i=0; i<exits.size(); i++) {
				Exit e = exits.get(i);
				System.out.println(" "+i+". " + e.getDescription());
			}
			

			// Figure out what the user wants to do, for now, only "quit" is special.
			List<String> words = input.getUserWords("?");
			if (words.size() > 1) {
				System.out.println("Only give the system 1 word at a time!");
				continue;
			}

			// Get the word they typed as lowercase, and no spaces.
			// Do not uppercase action -- I have lowercased it.
			String action = words.get(0).toLowerCase().trim();
			
			if (action.equals("help")) {
				System.out.println("How to quit: Type 'quit', 'q', or 'escape'");
				System.out.println("To play: type in the number of the room or option.");
				continue; 
			}
	
			if (action.equals("quit") || action.equals("q") || action.equals("escape"))  {
				if (input.confirm("Are you sure you want to quit?")) {
					return place;
				} else {
					continue;
				}
			}
			
			if (action.equals("search")) {
				System.out.println("You search the room for additional exits.");
				for (Exit e: here.getSecretExits()) { //this searches for the secret exits
					e.search();
				}
				continue;
				
			}
			
			if (action.equals("stuff")) {
				if(bag.size() == 0) {
					System.out.println("You have nothing");
				} else {
					for (String a: bag) {
						System.out.println(a);
					}
				} continue;
			}
			

			if (action.equals("take")) {
				if (here.stuff().size() != 0) { //adding stuff to the player's bag
					for (String a: here.stuff) {
						bag.add(a);
					} 
				} here.clearStuff(); //removes the stuff from the original list and puts into bag
				continue;
			}

			// From here on out, what they typed better be a number!
			Integer exitNum = null;
			try {
				exitNum = Integer.parseInt(action);
			} catch (NumberFormatException nfe) {
				System.out.println("That's not something I understand! Try a number!");
				continue;
			}

			if (exitNum < 0 || exitNum >= exits.size()) {
				System.out.println("I don't know what to do with that number!");
				continue;
			}

			// Move to the room they indicated.
			Exit destination = exits.get(exitNum);
			place = destination.getTarget();
		}

		return place;
	}

	/**
	 * This is where we play the game.
	 * @param args
	 */
	public static void main(String[] args) {
		// This is a text input source (provides getUserWords() and confirm()).
		TextInput input = TextInput.fromArgs(args);

		// This is the game we're playing.
		GameWorld game = new SpookyMansion();

		// Actually play the game.
		runGame(input, game);

		// You get here by typing "quit" or by reaching a Terminal Place.
		System.out.println("\n\n>>> GAME OVER <<<");
	}

}
