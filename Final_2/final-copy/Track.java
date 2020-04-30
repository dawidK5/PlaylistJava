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
public class Track implements Comparable<Track> {
    private String artist;
    private String title;
    private int duration;
    private int year;
    int minutes;
    int seconds;
    public Track(String title, String artist) {
        this.artist = artist;
        this.title = title;
        duration = 0;
        year = 0;
    }

    public Track(String title, String artist, int year, int duration) {
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
    public void setArtist(String Artist) {
        this.artist = Artist;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
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
        int sec;
        minutes = this.duration / 60;
        seconds = this.duration % 60;
        sec = seconds%10;
        seconds = seconds/10;
        return "(" + this.title + " _ " + this.artist + " _ " + this.year + " _ " + minutes + ":" + (seconds) + sec  + ")";
    }

    public int compareTo(Track other) {
        // NOTE: the comparison is CASE INSENSITIVE
        return this.title.compareToIgnoreCase(other.title);
    }
}

