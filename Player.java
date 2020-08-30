/*
 * Created by Charlie Middleton
 */
/**
 * This class creates the general instance variables for a general player and since it is an abstract class there cannot be an instance of player.
 * @author Charlie Middleton
 *
 */
public abstract class Player {
	protected String name;
	private boolean offence = true;
	protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;	
	/**
	 * this method sets the name for player
	 * @param name
	 */
public Player(String name) {
	this.name = name;
	
}
/**
 * this method makes play abstract so each child class has to make their own special version of what happens in play
 */
public abstract void play();
/**
 * this method sets the defencebehavior variable
 * @param db
 */

	public void setDefenceBehavior(DefenceBehavior db) {
		defenceBehavior = db;
	}
	/**
	 * this method sets the offencive behavior variable
	 * @param ob
	 */
	public void setOffenceBehavior(OffenceBehavior ob) {
		offenceBehavior = ob;
	}
	/**
	 * this method picks what stance a player takes on the field whether it is offence or defence 
	 * @return
	 */
	
	public boolean turnover() {
		if (isOffence()==false ) {
			 this.setOffence(true);
		}
		else if(isOffence()==true){
			 this.setOffence(false);
		}
		else {}
		return this.isOffence();
	}
/**
 * getters and setters for offence
 * @return
 */
	public boolean isOffence() {
		return offence;
	}

	public void setOffence(boolean offence) {
		this.offence = offence;
	}
	 
	
	
}
