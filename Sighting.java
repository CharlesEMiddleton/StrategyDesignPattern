/*
 * created by charlie middleton
 */
public class Sighting {
private String location;
private String details;
/**
 * default constructor and instance variables 
 * @param location
 * @param details
 */
public Sighting(String location, String details) {
	this.location =location;
	this.details =details;
	
}
/**
 * getters for location and detail
 * @return
 */
public String getLocation() {
	return this.location;
}
public String getDetails() {
	return this.details;
}
}
