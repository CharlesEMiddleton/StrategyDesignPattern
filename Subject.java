/*
 * Created by charlie middleton
 */
/**
 * subject interface for cook with 3 methods the cook needs to implement 
 * @author Charlie Middleton
 *
 */
public interface Subject {
public void registerObserver(Observer observer);
public void removeObserver(Observer observer); 
public void notifyObservers(String location, String description);
}
