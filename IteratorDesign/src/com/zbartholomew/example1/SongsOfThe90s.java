package com.zbartholomew.example1;

import java.util.HashMap;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {

    // Create a Hashmap with an int as a key and SongInfo
    // Objects
    HashMap<Integer, SongInfo> bestSongs = new HashMap<>();

    // Will increment the Hashmap key
    int hashKey = 0;

    public SongsOfThe90s() {

        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad The Wet Sprocket", 1991);
    }

    // Add a new SongInfo Object to the Hashmap and then increment
    // the Hashtable key
    public void addSong(String songName, String bandName, int yearReleased) {

        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

        bestSongs.put(hashKey, songInfo);

        hashKey++;
    }

    // This is replaced by the Iterator
    // Return a Hashmap full of SongInfo Objects
    public HashMap<Integer, SongInfo> getBestSongs() {
        return bestSongs;
    }

    // NEW By adding this method I'll be able to treat all
    // collections the same
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
