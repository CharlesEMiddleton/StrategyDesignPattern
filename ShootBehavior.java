/*
 * created by Charles Middleton
 */
/**
 * this class implements the interfaces to force the child class to implement play for shoot behavior
 * @author Charlie Middleton
 *
 */
public class ShootBehavior implements DefenceBehavior, OffenceBehavior{
	public void play() {
		System.out.println("shoots at the goal!");
	}

}
