import java.util.*;
/**
 * this class implements from the interface subject and starts off listing instance variables 
 * @author Charlie Middleton
 *
 */
public class Cook implements Subject{
	private ArrayList<Observer> observers;
	private String name;
	/**
	 * this method is the default constructor
	 * @param name
	 */
public Cook(String name) {
this.name = name;
this.observers = new ArrayList<Observer>();
}
/**
 * this method adds the observers of heisenburg 
 */
public void registerObserver(Observer observer) {
	observers.add(observer);
}
/**
 * this method removes observers from heisenburg
 */
public void removeObserver(Observer observer) {
	observers.remove(observer);
}
/**
 * this method goes through the observer list and updates their location and description
 */

public void notifyObservers(String location, String description) {
	for(Observer observer : observers) {
		observer.update(location, description);
		
	}
}
/**
 * this method calls notify observers
 * @param location
 * @param description
 */
public void enterSighting(String location, String description) {

	notifyObservers(location,description);
}
/**
 * getter for name
 * @return
 */
public String getName() {
	return name;
}
}
