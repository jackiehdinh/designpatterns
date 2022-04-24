import java.util.HashMap;

/**
 * A Juke Box
 * @author Kim Dinh
 */
public class JukeBox {
    private HashMap<String, Song> songs = new HashMap<String, Song>();
    private int currentSong;

    public JukeBox() {
        this.currentSong = 0;
    }

    /**
     * Adds a song to the juke box
     * @param song
     */
    public void addSong(Song song) {
        songs.put(song.getTitle(), song);
    }

    /**
     * Plays song from juke box
     * @param songName
     */
    public void play(String songName) {
        if(songs.get(songName) == null) {
            System.out.println("Sorry!");
        } else {
            System.out.println(songs.get(songName).toString());
        }
    }
}
