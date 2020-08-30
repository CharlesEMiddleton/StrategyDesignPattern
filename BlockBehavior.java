

/*
 * Created By Charles Middleton
 */
import java.util.Random;
/**
 * this class implements the interfaces to create a new version of the play method
 * @author Charlie Middleton
 *
 */
public class BlockBehavior implements DefenceBehavior, OffenceBehavior {
 static final int UPPER_NUMBER = 3;
/**
 * This method is the abstract version of play in the BlockBehavior class, that has a chance of being `1 of 3 options.
 * i used the random generator to pick a number between 1 and 3 to see which phrase will be used.
 */
	public void play() {
		Random r = new Random(3);
		int pick = r.nextInt(UPPER_NUMBER)+1;
		if (pick == 1)
			System.out.println("block player from passing");
		else if (pick == 2)
			System.out.println("blocks player from shooting");
		else if (pick ==3)
			System.out.println("checks player with puck");
			
	
	}

}
