/**
 * Playlist class stores the list of tracks to be played
 *
 * @author
 * Dawid Kocik          19233116
 * Tommy Crowley        19263546
 * Ronan McMorrow       19235208        
 * Oscar Bogenberger    19275153
 * 
 * @version 16/04/2020
 */
import java.util.*;
// Look through the ContactList (on GitHub in a subfolder), some of the code needed is there
// Add private helper methods if needed
public class Playlist {
    private String playlistName;
    // we have to make instance variable for the Collection of Tracks
    
    
    
    // 2 constructors
   public Playlist() {
        // initialises empty playlist called My playlist#1 (or next, consecutive number)
   }
   public Playlist(String listName) {
        // initialises empty playlist from name given
   }
   
   public void setPlaylistName(String listName) {
        // allows us to change playlist name
        // add a number if to the name if it repeats
   }
   public String getPlaylistName() {
        // returns name of this playlist
        return playlistName;
   }
   
   public String toString() {
        // return instance values in readable format
        return playlistName;
   }
   
   public void add(String title, String artist) {
        // adds track to the playlist
   }
   public void add(String title, String artist, int year, int duration) {
        // adds track to the playlist
   }
   public void add(Track t) {
        // adds track to the playlist
   }
   public boolean remove(String title) {
        boolean removed=false;
        // return true if removal successful, else false
        // case insensitive
        // If the playlist contains two or more tracks with the same track title 
        // then the remove operation should only remove the FIRST one located in the playlist.
        return removed;
   }
   public void showList() {
        // that displays the playlist on the screen in sequential order 
        // (i.e. in the order that the tracks appear in the list 
        // if no tracks display "list is empty"
   }
   
   public void play(boolean random) { // or playAll, could u check in your project description?
        // when false, play the tracks as they appear in the list (sequentially)
        // when true play each track randomly ONLY ONCE
        // playing tracks should not alter the order in the list
        // displaying track details is equivalent to playing it
   }
   public void playOnly(String artist) {
       // play any track that contains the String in the artist name section (case insensitive)
       // play them in sequential order (same as in the list)
       // if no tracks found, no output should be produced
   }
   public void playOnly(int year) {
       // play all tracks that have the same year of release (same order as in the list)
   }

}
