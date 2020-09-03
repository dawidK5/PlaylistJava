/**
 * Driver for managing tracks and playlists
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
public class Driver {
    public static void main(String[] args) {
        PlayList myFavourites = new PlayList();
        System.out.println("first we create a new playlist");
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
        System.out.println("we can show All tracks in playlist in order.");
         System.out.println();
        myFavourites.playAll(false);
        System.out.println();
        System.out.println();
        System.out.println("or in random order.");
         System.out.println();
        myFavourites.playAll(true);
        System.out.println();
        System.out.println("we can play only tracks from one artist.");
         System.out.println();
        myFavourites.playOnly("Beatles");
        System.out.println();
        System.out.println("or from only one year.");
         System.out.println();
        myFavourites.playOnly(1971);
         System.out.println();
        System.out.println("and we can remove tracks from the list such as WHAT'D I SAY by Ray Charles.");
         System.out.println();
        myFavourites.remove("WHAT'D I SAY");
        myFavourites.showList();
        System.out.println("but if we try to remove a track that doesnt exist then remove will return false.");
         System.out.println();
        System.out.println(myFavourites.remove("WHAT'D I SAY"));
         System.out.println();
        System.out.println("we can create a new playlist with a specified name.");
        System.out.println();
        PlayList myPlaylist= new PlayList("Tiger");
        myPlaylist.add("American Idiot","GreenDay", 2004, 183);
        myPlaylist.add("The Pretender","The Foo Fighters",2007,270);
        myPlaylist.add("Photograph", "Nickelback", 2005, 260);
        myPlaylist.add("Never gonna give you up", "Rick Astley");
        myPlaylist.add("Holding out for a hero", "Bonnie Tyler");
        myPlaylist.add("Good Vibrations", "The Beach Boys");
        myPlaylist.add("Bohemian Rhapsody", "Queen", 1975, 359);
        myPlaylist.add("Smells Like Teen Spirit", "Nirvana");
        myPlaylist.add("Hit The Road Jack", "Ray Charles");
        myPlaylist.add("Tribute", "Tenacious D");
        myPlaylist.add("I Want To Break Free","Queen");
        myPlaylist.add("We Will Rock You", "Queen", 1977, 135);
        System.out.println(myPlaylist.getName());
        System.out.println();
        System.out.println("and we can rename the playlist.");
        System.out.println();
        myPlaylist.setName("Dinosaur");
        System.out.println( myPlaylist.getName());
        System.out.println();
        
        myPlaylist.showList();
        System.out.println();
        System.out.println("we can add a new Track to the playlist with year and duration.");
        System.out.println();
        Track ourOwnTrack = new Track("HelloWorld", "CSstudents", 2020, 260);
        myPlaylist.add(ourOwnTrack);
        myPlaylist.showList();
        System.out.println("or without them.");
        System.out.println();
        Track ourOwnTrack2 = new Track("Hello", "students");
        myPlaylist.add(ourOwnTrack2);
        myPlaylist.showList();
        System.out.println();
        System.out.println("we can get the name of an existing Track");
        System.out.println();
        System.out.println( myPlaylist.playList.get(1).getTitle());
        System.out.println();
        System.out.println("And also get the artist duration and year");
        System.out.println( myPlaylist.playList.get(1).getArtist());
        System.out.println( myPlaylist.playList.get(1).getDuration());
        System.out.println( myPlaylist.playList.get(1).getYear());
        System.out.println();
        System.out.println("we can Also change these values.");
        myPlaylist.playList.get(1).setTitle("Bolivian Rap City");
        myPlaylist.playList.get(1).setArtist("King");
        myPlaylist.playList.get(1).setYear(1789);
        myPlaylist.playList.get(1).setDuration(98989);
        System.out.println( myPlaylist.playList.get(1).getTitle());
        System.out.println( myPlaylist.playList.get(1).getArtist());
        System.out.println( myPlaylist.playList.get(1).getDuration());
        System.out.println( myPlaylist.playList.get(1).getYear());
        System.out.println();
        myPlaylist.showList();
    }
}
