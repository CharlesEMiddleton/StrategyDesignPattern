/*
 * created by charlie middleton
 */
public interface Observer {
	/**
	 * interface for the Observers with 2 methods that need to be implemented
	 * @param location
	 * @param description
	 */
public void update(String location, String description);
public String getLog();
}
