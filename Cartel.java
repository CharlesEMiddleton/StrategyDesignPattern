import java.util.*;
/**
 * this class implements from the observer interface
 * @author Charlie Middleton
 *
 */
public class Cartel implements Observer {
private Subject cook;
private ArrayList<Sighting> sightings;
/**
 * default constructor
 * @param cook
 */
public Cartel (Subject cook) {
	
	this.cook = cook;
	cook.registerObserver(this);
	 this.sightings = new ArrayList<Sighting>();
	
}
/**
 * overrided update method to update the cartels notes
 */
public void update(String location, String description) {
	sightings.add(new Sighting(location,description));
	
}
/**
 * this method prints the cartels notes in the desired fashion
 */
public String getLog() {
String loca ="";
for(Sighting sighting:sightings) {
	loca+= sighting.getLocation();
	loca+="("+sighting.getDetails()+")\n";
}
return loca;

			}	
	

}
