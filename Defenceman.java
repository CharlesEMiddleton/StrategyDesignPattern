/*
 * Created by Charlie Middleton
 */
import java.util.Random;
/**
 * This class extends player with inheritance 
 * and chooses a random behavior with a random number generator.
 * @author Charlie Middleton
 *
 */
public class Defenceman extends Player{
	static final int UPPER_NUMBER=2;
	static final int BIGGER_NUMBER= 10;
	/**
	 * These ints set a cap on the numbers the random word generator can choose
	 * @param name
	 */
public Defenceman(String name) {
super(name);
/**
 * this method uses super to call name from the parent class
 */
}
Random r = new Random(2);
/**
 * this class randomly chooses the defencebehavior for defenceman
 */
public void setDefenceBehavior() {
	int pick = r.nextInt(UPPER_NUMBER)+1;
	if (pick ==1)
		defenceBehavior = new ChasePuckBehavior();
	else
		defenceBehavior = new BlockBehavior();

}
/**
 * this class randomly chooses the offenceBehavior for defenceman
 */
public void setOffenceBehavior() {
	int choice = r.nextInt(BIGGER_NUMBER)+1;
	if(choice == 1-9)
		offenceBehavior = new PassBehavior();
	else
		offenceBehavior = new SlapShotBehavior();
		
}
/**
 * This class prints out the name and position of the player
 */
public String toString() {
	return this.name+" plays the position: Defenceman ";
}
/**
 * this class prints the defence and offence behavior
 */
public void play() {
	if (isOffence() == false)
		System.out.println(defenceBehavior);
	else
		System.out.println(offenceBehavior);
}

}
