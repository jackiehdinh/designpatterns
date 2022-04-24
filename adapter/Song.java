/**
 * Abstract Class Song
 * @author Kim Dinh
 */
public abstract class Song {
    /**
     * Returns song title
     * @return song title
     */
    public abstract String getTitle();
    
    /**
     * Returns album title
     * @return album title
     */
    public abstract String getAlbum();
    
    /**
     * Returns artist's first name
     * @return artist's first name
     */
    public abstract String getArtistFirstName();
    
    /**
     * Returns artist's last name
     * @return artist's last name
     */
    public abstract String getArtistLastName();
    
    /**
     * Returns genre
     * @return genre
     */
    public abstract String getGenre();

    /**
     * Return string format of song
     * @return string format of song
     */
    public String toString() {
        return getTitle() + "\nAlbum: " + getAlbum() + "\nBy: " + getArtistFirstName() + " " + getArtistLastName() +"\nGenre: " + getGenre();
    }
}
