/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaminojavaexam.be;

/**
 *
 * @author Mathias
 */
public class Song {

    private final int ID;
    private final String title;
    private final String artist;
    private final String Category;
    private final int duration;

    public Song(int ID, String title, String artist, String Category, int duration) {
        this.ID = ID;
        this.title = title;
        this.artist = artist;
        this.Category = Category;
        this.duration = duration;
    }

}
