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
// Look through the ContactList (on GitHub in a subfolder), some of the code needed is there
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
    }
}
