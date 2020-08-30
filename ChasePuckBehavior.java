/*
 * Created by Charles Middleton
 */
/**
 * this is a child class for the behavior of the players. this method of play is an overrided method with the use of an abstract parent class. 
 * @author Charlie Middleton
 *
 */
public class ChasePuckBehavior implements DefenceBehavior, OffenceBehavior {
	public void play() {
		System.out.println("Chases the puck! Run forest Run");
	}

}
