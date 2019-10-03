package edu.smith.cs.csc212.spooky;

//create a class SecretExit that extends Exit
public class SecretExit extends Exit {
	
	private boolean isSecret;
	private boolean hidden;
	private boolean reveal;

	public SecretExit(String target, String description) {
		super(target, description);
		this.isSecret = true;
		this.hidden = true;
		this.reveal = false;
		
	}
	
	public boolean isSecret() {
		return this.isSecret;
	}
	
	public boolean hidden() {
		return this.reveal = true;
		
	}




	{
		//Secret Exit not printed to the user in InteractiveFiction when hidden.
	
	}
	

	
	public void search() {
		//reveal SecretExit
	}

	
	/**
	 * Secret Exit code --> move to SecretExit class
	 */
	//secret exit (after user types "search")
//	basement.addExit(new Exit("SecretRoom", "There is a trap door behind the painting."));
//	
//	Place SecretRoom = insert(Place.create("SecretRoom", "You have found the secret room."));
//	//reveal the hidden exits
//	SecretRoom.addExit(new Exit("lockedDoor", "There is a locked door. Looks very high tech - there is a fingerprint scanner "
//			+ "and a retina scanner. "));
//	SecretRoom.addExit(new Exit("trapDoor", "There is a trap door. It looks like a one-way trip"));
//	
//	Place lockedDoor = insert(Place.create("lockedDoor", "Access denied"));
//	Place trapDoor = insert(Place.create("trapDoor", "You have found a room... to be finished"));

}
