/**
 * Track class stores the details of each individual track
 *
 * @author
 * Dawid Kocik          19233116
 * Tommy Crowley        19263546
 * Elliot Cleary        19264259
 * Ronan McMorrow       19235208        
 * Oscar Bogenberger    19275153
 * 
 * @version 16/04/2020
 */
import java.util.*;
// Look through the ContactList (on GitHub in a subfolder), some of the code needed is there
// Add private helper methods if needed
public class Track {
    private String title;
    private String artist;
    private int year;
    private int duration;
    
    // Track class should implement Comparable and include a compareTo method that determines 
    // the natural ordering of Track instances. Tracks should be ordered by title (case 
    // insensitive )
    
    // 2 constructors
    public Track(String title, String artist) {
        // 1st constructor, initialise instance variables e.g. this.title = title;
        // and set year and duration to 0
        
    }
    public Track(String title, String artist, int year, int duration) {
        // 2nd constructor, all 4 pieces of data
    }
    public String toString() {
        // displays all track details in a neat way
        // track duration should be given in MM:SS format
        return title;
    }
    public void setTitle(String title) {
        // This allows the title to be changed
    }
    public String getTitle() { 
        // This returns the current title
        return title;
    }
    public void setArtist(String artist) {
        // This allows the artist name to be changed
    }
    public String getArtist() {
        // This returns the current artist name
        return artist;
    }
    public void setYear(int year) {
        // This allows the year of release to be changed
    }
    public int getYear() {
        // This returns the current year of release
        return year;
    }
    public void setDuration(int seconds) {
        // This allows the track duration to be changed
    }
    public int getDuration() {
        // This returns the current duration
        return duration;
    }
    
}
