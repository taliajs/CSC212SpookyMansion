package edu.smith.cs.csc212.spooky;


/**
 * Creates a time system in our game
 * @author tseshaiah
 *
 */

public class GameTime implements GameWorld {
	int hour;
	
	//the constructor 
	public GameTime() {
	 	hour = 0;
	}
	
	public void getHour() { //prints out the hour like a 12 or 24 watch
	
		//if game is started, set hour = 0 
		//for every move, add 1 to hour
		
	}
	

	
	public void increaseHour() {
		if (hour > 0 && hour < 24) {
			hour = hour += 1; 
		} else {
			hour = 0;
		}
		
		//if hour > 0 and < 24, increase hour (hour +=1) 
		//else, reset (hour == 0) 
	}

	@Override
	public String getStart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Place getPlace(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
