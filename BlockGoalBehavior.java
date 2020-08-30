/*
 * Created by Charles Middleton

 */
import java.util.Random;
/**
 * this class implements the interfaces to create a new version of the play method for blockgoalbehavior
 * @author Charlie Middleton
 *
 */
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {
	static final int UPPER_NUMBER =4;
/**
 * This is the abstract play method for blockgoalbehavior which uses the random generator to pick a number between 1 and 4.
 */
public void play() {
	Random r = new Random(4);
	int pick = r.nextInt(UPPER_NUMBER)+1;
	
	if (pick == 1)
	System.out.println("blocks puck with knee pads!");
	else if (pick ==2)
		System.out.println("hand blocks the puck");
	else if (pick==3)
		System.out.println("catches the puck");
	else if (pick ==4) 
		System.out.println("blocks puck with stick");
	else 
		System.out.println("");
	
	
}

}
