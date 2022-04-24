/**
 * A Track
 * @author Kim Dinh
 */
public class Track extends Song {
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;

    public Track(String title, String album, String firstName, String lastName, Genre genre) {
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    /**
     * Returns title of track
     * @return title
     */
    public String getTitle() {
        return this.title;
    }
    
    /**
     * Returns album name of track
     * @return album 
     */
    public String getAlbum() {
        return this.album;
    }

    /**
     * Returns first name of track artist
     * @return first name
     */
    public String getArtistFirstName() {
        return this.firstName;
    }

    /**
     * Returns last name of track artist
     * @return last name
     */
    public String getArtistLastName() {
        return this.lastName;
    }

    /**
     * Returns genre of track
     * @return genre
     */
    public String getGenre() {
        return this.genre.toString();
    }
}
