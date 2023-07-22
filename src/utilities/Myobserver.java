package utilities;
/**
 *  * @Author Daniel Arvili ID 211704333
 *  * @Author Aviv Hagag ID 318259843
 *  * this class responsible to build a game with arenas and racers

 The Myobserver interface represents an observer that can receive notifications from a Myobservable object.
 The interface defines a method for receiving updates from the Myobservable object.
 */
public interface Myobserver{
    /**

     This method is called when the observed object changes.
     @param o The MyObservable object that triggered the update.
     */
public void update(Myobservable o);
}
