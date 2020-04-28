/**
 * Track class stores the details of each individual track
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
public class Track implements Comparable<Track> {
    private String artist; // Stores the contact name.
    private String title; // Ttores the contact number.
    private int duration;
    private int year;
    int minutes;
    int seconds;
    public Track(String artist, String title) {
        this.artist = artist;
        this.title = title;
        duration = 0;
        year = 0;
    }

    public Track(String artist, String title, int duration, int year) {
        this.artist = artist;
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    public void setName(String title) {
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setTitle(String number) {
        this.title = title;
    }

    public String getitle() {
        return this.title ;
    }
    
     public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public int getDuration(){
        return this.duration;
    }
    
     public void setYear(int year) {
        this.year = year;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public String toString() {
        minutes = this.duration / 60;
        seconds = this.duration % 60;
        return "(" + this.title + " _ " + this.artist + " _ " + minutes + ":" + seconds + " _ " + this.year + ")";
    }

    public int compareTo(Track other) {
        // NOTE: the comparison is CASE INSENSITIVE
        return this.title.compareToIgnoreCase(other.title);
    }
}

