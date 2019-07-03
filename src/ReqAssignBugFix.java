//package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ReqAssignBugFix {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Song> songs = new ArrayList<Song>();
        String artist, title;
        Song s;

        for (int i = 0; i< 10;i++){

            //String artist = "Prince";//modify program to prompt user for an artist
            //String title = "Purple Rain"; //modify program to prompt user for a title
            System.out.println("Entering Song #" + (i+1));
            System.out.println("Enter an artist name");
            artist = keyboard.nextLine();

            System.out.println("Enter a title");
            title = keyboard.nextLine();

            s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        System.out.println("Songs are:");
        for(Song item: songs){
            System.out.println(item.display());
        }

        //look for blue and print if found
        String titleToFind = "Purple Rain";
        for (Song item: songs){
            if (item.getTitle().equalsIgnoreCase(titleToFind)){
                System.out.printf("I found %s \r\n", item.display());
                break;
            }
        }
    }
}