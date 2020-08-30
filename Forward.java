/*
 * Created By Charles Middleton
 */
import java.util.Random;
/**
 * This class is an extended version of player with inheritance
 * @author Charlie Middleton
 *
 */
public class Forward extends Player {
	 static final int UPPER_NUMBER = 2;
public Forward (String name) {
	super(name);
	/**
	 * this method calls name from the parent class
	 */
	
	}
		Random r = new Random(2);
		/**
		 * this method selects a random behavior for the offenceBehavior with a random number generator
		 */
	public void setOffenceBehavior() {
	int pick = r.nextInt(UPPER_NUMBER)+1;
	if (pick ==1)
	offenceBehavior = new PassBehavior();
	else 
		offenceBehavior = new ShootBehavior();
	}
	/**
	 * this method sets the defence behavior with a random number generator
	 */
	public void setDefenceBehavior() {
	int pick2 = r.nextInt(UPPER_NUMBER)+1;
	if(pick2 ==1)
		defenceBehavior= new ChasePuckBehavior();
	else 
		defenceBehavior = new BlockBehavior();
	}
	/**
	 * this method prints out the players name and position
	 */
	public String toString() {
		return this.name+"plays the position: Forward";
	}
	/**
	 * this method printsout the defence or offence behavior depending on if they are offencive or not
	 */
	public void play() {
		if(isOffence()==false)
		System.out.println(defenceBehavior);
		else
			System.out.println(offenceBehavior);
	
		
		

	}

}
