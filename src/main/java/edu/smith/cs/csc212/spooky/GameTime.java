package edu.smith.cs.csc212.spooky;

/**
 * Creates a time system in our game 
 * @author tseshaiah
 *
 */

public class GameTime implements GameWorld {
	int hour;
	
	public GameTime() {
	 	hour = 0;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public void increaseHour() {
		if (hour > 0 && hour < 24) {
			hour = hour += 1; 
		} else {
			hour = 0;
		}
	
	}

	@Override
	public String getStart() {
		return null;
	}

	@Override
	public Place getPlace(String id) {
		return null;
	}


	


}
