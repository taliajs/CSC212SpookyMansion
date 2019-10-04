package edu.smith.cs.csc212.spooky;

/**
 * This class represents a Locked Exit
 * @author tseshaiah
 *
 */

public class LockedExit extends Exit {
	public boolean canOpen;
	
	public LockedExit(String target, String description) {
		super(target, description);
		this.canOpen = true; //canOpen returns yes all the time
	}
	
	public boolean canOpen() {
		if (bag.contains("contact")) {
			return bag.contains("contact");
		} return canOpen;
	}
	

}



