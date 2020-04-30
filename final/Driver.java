/**
 * Driver for managing tracks and playlists
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
import java.util.Collections;
public class Driver {
    public static void main(String[] args) {
        PlayList myFavourites = new PlayList();
        myFavourites.add("Like a Rolling Stone","Bob Dylan", 1965, 201);
        myFavourites.add("(I Can't Get No) Satisfaction","The Rolling Stones",1965,197);
        myFavourites.add("Imagine", "John Lennon", 1971, 215);
        myFavourites.add("What's Going On", "Marvin Gaye");
        myFavourites.add("Respect", "Aretha Franklin");
        myFavourites.add("Good Vibrations", "Mike Love");
        myFavourites.add("Hey Jude", "The Beatles", 1968, 347);
        myFavourites.add("Smells Like Teen Spirit", "Nirvana");
        myFavourites.add("What'd I Say", "Ray Charles");
        myFavourites.add("The Long and Winding Road", "The Beatles");
        myFavourites.add("The Times They are a Changin'","Bob Dylan");
        myFavourites.add("Yellow Submarine", "The Beatles", 1967, 235);
        System.out.println();
        myFavourites.showList();
        System.out.println();
        myFavourites.playAll(false);
        System.out.println();
        System.out.println();
        myFavourites.playAll(true);
        System.out.println();
        myFavourites.playOnly("Beatles");
        System.out.println();
        myFavourites.playOnly(1971);
        myFavourites.remove("WHAT'D I SAY");
        myFavourites.showList();
        PlayList myPlaylist= new PlayList();
        myPlaylist.add("American Idiot","GreenDay", 2004, 183);
        myPlaylist.add("The Pretender","The Foo Fighters",2007,270);
        myPlaylist.add("Photograph", "Nickelback", 2005, 260);
        myPlaylist.add("Never gonna give you up", "Rick Astly");
        myPlaylist.add("Holding out for a hero", "Bonnie Tyler");
        myPlaylist.add("Good Vibrations", "The Beach Boys");
        myPlaylist.add("Bohemian Rhapsody", "Queen", 1975, 359);
        myPlaylist.add("Smells Like Teen Spirit", "Nirvana");
        myPlaylist.add("Hit The Road Jack", "Ray Charles");
        myPlaylist.add("Tribute", "Tenacious D");
        myPlaylist.add("I Want To Break Free","Queen");
        myPlaylist.add("We Will Rock You", "Queen", 1977, 135);
        myPlaylist.getPlayListName();
        System.out.println("Rename the playlist");
        myPlaylist.setPlayListName("Dinosaur");
        myPlaylist.getPlayListName();
        System.out.println();
        myPlaylist.showList();
        System.out.println();
        myPlaylist.playAll(false);
        System.out.println();
        System.out.println();
        myPlaylist.playAll(true);
        System.out.println();
        myPlaylist.playOnly("Queen");
        System.out.println();
        myPlaylist.playOnly(1971);
        myPlaylist.remove("Photograph");
        myPlaylist.showList();
    }
}
