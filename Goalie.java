/*
 * created by charles middleton
 */
/**
 * this class extends the parent player class
 * @author Charlie Middleton
 *
 */
public class Goalie extends Player {
/**
 * this method uses super to inherit name from the player class. and sets the defence and offence behavior by creating a new instance of the behavior classes.
 * @param name
 */
		public Goalie (String name) {
			super(name);
		defenceBehavior = new BlockBehavior();
		offenceBehavior = new BlockGoalBehavior();
			
		}
		/**
		 * this method prints out the players name and position
		 */
		
		public String toString() {
			return this.name+" plays the position: Goalie";
			
		}
		/**
		 * this method prints out the defence or offence behavior
		 */

		public void play() {
			if(isOffence() == false)
			System.out.println(defenceBehavior);
			else
			System.out.println(offenceBehavior);
			
		}
			
		}
		
		


