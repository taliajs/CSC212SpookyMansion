package edu.smith.cs.csc212.spooky;

import java.util.Objects;

/**
 * This class represents an exit from a Place to another Place.
 * @author jfoley
 *
 */
public class Exit {
	/** 
	 * Whether or not an exit is secret
	 */
	private boolean isSecret;

	/**
	 * If an exit is hidden
	 */
	private boolean hidden;
	
	/** 
	 * If an exit is revealed
	 */
	public boolean reveal;
	
	/**
	 * How do we describe this exit to a user, e.g., "A door with a spiderweb."
	 */
	private String description;
	/**
	 * How do we identify the Place that this is going.
	 */
	private String target;
	
	/**
	 * Create a new Exit.
	 * @param target - where it goes.
	 * @param description - how it looks.
	 */
	public Exit(String target, String description) {
		this.description = description;
		this.target = target;
		this.isSecret = false;
	}
	
	/**
	 * A getter for the description of this exit.
	 * @return how it looks.
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * A getter for the target place of this exit.
	 * @return where it goes.
	 */
	public String getTarget() {
		return this.target;
	}
	
	/**
	 * Make this debug-able when we print it for ourselves.
	 */
	public String toString() {
		return "Exit("+this.description+", "+this.target+")";
	}
	
	/**
	 * Make it so we can put this in a HashMap or HashSet.
	 */
	public int hashCode() {
		return Objects.hash(this.description, this.target);
	}
	
	/**
	 * This is a useful definition of being the same.
	 * @param other - another exit.
	 * @return if they go to the same place.
	 */
	public boolean goesToSamePlace(Exit other) {
		return this.target.equals(other.target);
	}
	
	/**
	 * The other half of hashCode that lets us put it in a HashMap or HashSet.
	 */
	public boolean equals(Object other) {
		if (other instanceof Exit) {
			Exit rhs = (Exit) other;
			return this.target.equals(rhs.target) && this.description.equals(rhs.description); 
		}
		return false;
	}
	
	public boolean isSecret() {
		return this.isSecret;
	}
	
	public boolean hidden() {
		return this.reveal = true;
	}
	

	
	 public void search() {
		isSecret = true;
	}
}
