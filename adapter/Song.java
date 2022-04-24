/**
 * Abstract Class Song
 * @author Kim Dinh
 */
public abstract class Song {
    public abstract String getTitle();
    public abstract String getAlbum();
    public abstract String getArtistFirstName();
    public abstract String getArtistLastName();
    public abstract String getGenre();
    public String toString() {
        return getTitle() + "\nAlbum: " + getAlbum() + "\nBy: " + getArtistFirstName() + " " + getArtistLastName() +"\nGenre: " + getGenre();
    }
}
