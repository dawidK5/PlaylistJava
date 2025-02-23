/**
 * PlayList class stores the list of tracks to be played
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
public class PlayList {
    public ArrayList<Track> playList;
    private String playListName;
    
    // we have to make instance variable for the Collection of Tracks    
    // 2 constructors
   public PlayList() {
       this.playList = new ArrayList<Track>();
       setName("NewPlaylist");
        // initialises empty playlist called My playlist#1 (or next, consecutive number)
        
   }
   public PlayList(String playListName) {
       this.playList = new ArrayList<Track>();
       this.playListName = playListName;
        // initialises empty playlist from name given
   }
   public void setName(String name) {
       this.playListName = name;
        // allows us to change playlist name
        // add a number if to the name if it repeats
   }
   public String getName() {
        // returns name of this playlist
        return playListName;
   }
   
   public String toString() {
       String playListContents="Playlist Name: "+playListName+"\n"+"Tracks:\t";
       for (int i=0; i<playList.size(); i++) {
            playListContents = playListContents+playList.get(i).toString()+"\n \t";
       }
       
        // return instance values in readable format
       return playListContents;
   }
   
   public void add(String title, String artist) {
       Track t = new Track(title, artist);
       add(t);
       // adds track to the PlayList
   }
   public void add(String title, String artist, int year, int duration) {
       Track t = new Track(title, artist, year, duration);
       add(t);
       // adds track to the PlayList
   }
   public void add(Track t) {
       this.playList.add(t);
       sort();
       // adds track to the PlayList
   }
   public boolean remove(String title) {
        int sizeBefore = playList.size();
        for (int i=0; i<playList.size(); i++) {
            if (playList.get(i).getTitle().equalsIgnoreCase(title)) {
                playList.remove(i);
                return true;
            } 
        }
        //improved fast removal from java 8
        
        // return true if removal successful, else false
        // case insensitive
        // If the PlayList contains two or more tracks with the same track title 
        // then the remove operation should only remove the FIRST one located in the PlayList.
        return false;
   }
   public void showList() {
       if (playList.size() == 0) {
           System.out.println(toString());
           System.out.println("The list is empty ");
       } else {
           System.out.println(toString());
       }
        // that displays the PlayList on the screen in sequential order 
        // (i.e. in the order that the tracks appear in the list 
        // if no tracks display "list is empty"
   }
   void sort() {
       Collections.sort(playList);
   }
   public void playAll(boolean random) {
       if (random) {
         int pos;
         int length = playList.size();
         ArrayList<Integer> ranPos = new ArrayList<Integer>(length); 
         while (ranPos.size() < length ) {
             pos=(int)(Math.random()*playList.size());
             if(!ranPos.contains(pos)) {
                 ranPos.add(pos);
             }// only added if it is a unique value
         }
         for (int i=0; i< ranPos.size(); i++) {
             System.out.println(playList.get(ranPos.get(i)).toString());
         }
       } else {
         for (int i=0; i<playList.size(); i++) {
             System.out.println(playList.get(i).toString());
         }
       }
   }
   /*public String getTitle(int position){
    return playList.get(position).getTitle();
    }
   public String getArtist(int position){
    return playList.get(position).getArtist();
   }
   public int getDuration(int position){
    return playList.get(position).getDuration();
   }
   public int getYear(int position){
    return playList.get(position).getYear();
    }
   public void setTitle(int position, String newTitle){
    (playList.get(position)).setTitle(newTitle);
    }
   public void setTitle(int position, String newTitle){
    (playList.get(position)).setTitle(newTitle);
    }
   public void setTitle(int position, String newTitle){
    (playList.get(position)).setTitle(newTitle);
    }
   public void setTitle(int position, String newTitle){
    (playList.get(position)).setTitle(newTitle);
    }*/
   public void playOnly(String artist){
       artist = artist.toUpperCase();
       for(int i=0; i<playList.size(); i++){
            if(playList.get(i).getArtist().toUpperCase().contains(artist)){
                System.out.println(playList.get(i).toString());
                
            }
        }

    }
    
   public void playOnly(int year){
        for(int i=0; i<playList.size(); i++){
            if(playList.get(i).getYear() == year){
                System.out.println(playList.get(i).toString());

            }
        } 

   }

}
