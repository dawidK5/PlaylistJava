/**
 * Playlist class stores the list of playlist to be played
 *
 * @author
 * Dawid Kocik          19233116
 * Tommy Crowley        19263546
 * Ronan McMorrow       19235208        
 * Oscar Bogenberger    19275153
 * 
 * @version 16/04/2020
 */
import java.util.Collections;
import java.util.ArrayList;
import java.util.*;
// Look through the TrackList (on GitHub in a subfolder), some of the code needed is there
// Add private helper methods if needed
public class Playlist {
   private ArrayList<Track> playlist;  
   int playlistNumber = 1;
   HashMap<String,ArrayList<String>> arraynames = new HashMap<String,ArrayList<String>>();
        public void PlayList() {
        arraynames.put("Playlist"+playlistNumber, new ArrayList<String>());
        playlistNumber++;
    }
    public int Playlist(String name){
         arraynames.put(name, new ArrayList<String>());
         playlistNumber++;
    }
    public int add(String Track) {
        int index = Collections.binarySearch(playlist,newEntry);
        if(index < 0) {
            index = -(index+1);
            playlist.add(index,newEntry);
        }
        return index;
    }

    public void addAll(playlist additionalplaylist) {
        for(int i = 0; i < additionalplaylist.size(); i++) {
            add(additionalplaylist.get(i));
        }
    }
    
    public Track get(int index) {
        if(index < playlist.size()) {
            return playlist.get(index);
        }
        return null;
    }
    
    void sort() {
        Collections.sort(playlist);
    }

    public void display() {
        for(Track c : playlist) {
            System.out.println(c) ; // uses Track toString method to format output
        }
    }

    public String nameOfIncomingCaller(String incomingNumber) {
        for(Track c : playlist) {
            if(c.getNumber().compareTo(incomingNumber) == 0) {
                return c.getName();
            }
        }
        return null;
    }
    
    public String nameForDialledNumber(String dialledNumber) {
        for(Track c : playlist) {
            if(c.getNumber().compareTo(dialledNumber) == 0) {
                return c.getName();
            }
        }
        return null;
    } 
    
    public String toString() {
        return playlist.toString();
    }
    
    public int size() {
        return playlist.size();
    }
}

