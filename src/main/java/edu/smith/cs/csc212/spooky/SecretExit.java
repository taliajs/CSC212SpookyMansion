package edu.smith.cs.csc212.spooky;

/**
 * This class represents a Secret Exit
 * @author tseshaiah
 *
 */
public class SecretExit extends Exit {
	private boolean hidden;


	public SecretExit(String target, String description) {
		super(target, description);
		this.hidden = true;
	}
	
	public boolean isSecret() {
		return this.hidden;
	}
	
	
	@Override
	public void search() {
		this.hidden = false;
	}

	
	/**
	 * Secret Exit code --> move to SecretExit class? Place? or somewhere else?
	 */
	//secret exit (after user types "search")
//	basement.addExit(new Exit("SecretRoom", "There is a trap door behind the painting."));
//	
//	Place SecretRoom = insert(Place.create("SecretRoom", "You have found the secret room."));
//	//reveal the hidden exits
//	SecretRoom.addExit(new Exit("lockedDoor", "There is a locked door. Looks like there is a retina scanner"));
//	SecretRoom.addExit(new Exit("trapDoor", "There is a trap door. It looks like a one-way trip."));
//	
//	Place lockedDoor = insert(Place.create("lockedDoor", "Access denied. "));
//	Place trapDoor = insert(Place.create("trapDoor", "You have found a room... to be finished"));

}
