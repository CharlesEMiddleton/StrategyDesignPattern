import java.util.*;
/**
 * this class implements the observer interface 
 * @author Charlie Middleton
 *
 */
public class DEA implements Observer {
private Subject cook;
private ArrayList<String>locations;
private String notes;
/**
 * default constructor
 * @param cook
 */
public DEA(Subject cook){
	this.cook = cook;
	cook.registerObserver(this);
	this.notes= "";
	this.locations = new ArrayList<String>();
	}
/**
 * overrided update method from observer that adds the location 
 */
public void update(String location, String description) {
	locations.add(location);
	this.notes+= "\n" +description;
}
/**
 * prints the notes of the dea in the desired format 
 */
public String getLog() {
String loca= "locations:\n";
for(String location:locations) {
	loca+= location;
	loca+="\n";
}
loca+= "Notes:";
loca+= notes;
return loca;
	
}



}
