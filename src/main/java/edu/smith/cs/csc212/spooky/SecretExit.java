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


}
