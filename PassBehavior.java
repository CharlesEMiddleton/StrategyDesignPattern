/*
 * Created by Charles Middleton
 */
/**
 * this class implements the offencive and defencive behavior interfaces to force the child classes to implement the play method
 * @author Charlie Middleton
 *
 */

public class PassBehavior implements DefenceBehavior, OffenceBehavior {
public void play() {
	System.out.println("passes to a forward");
}
}
