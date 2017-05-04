/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaminojavaexam.dal;

import adaminojavaexam.be.Song;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mathias
 */
public class SongDAO {

    private DBConnectionManager cm;

    public SongDAO() {
        try {
            this.cm = DBConnectionManager.getInstance();
        } catch (IOException ex) {
            Logger.getLogger(SongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Song> getAllSongsFromDB() {
        String sql = "SELECT song.ID AS 'SongID', "
                + "song.Title AS 'SongTitle', "
                + "song.Duration AS 'SongDuration', "
                + "artist.Name AS 'ArtistName', "
                + "category.Name AS 'CategoryName' "
                + "FROM Song song "
                + "JOIN Artist artist ON artist.ID = song.ArtistID "
                + "JOIN Category category ON category.ID = song.CategoryID";
        try (Connection con = cm.getConnection()) {

        } catch (Exception e) {'

        }
    }

}
