/**
 * An adapter that turns a tune into a song
 * @author Kim Dinh
 */
public class SongAdapter extends Song{
    private Tune tune;
    
    public SongAdapter(Tune tune) {
        this.tune = tune;
    }

    /**
     * Returns title of song
     * @return title
     */
    public String getTitle() {
        String[] display = tune.getDisplayTitle().split(": ");
        return display[0];
    }

    /**
     * Returns album of song
     * @return album
     */
    public String getAlbum() {
        String[] display = tune.getDisplayTitle().split(": ");
        return display[1];
    }

    /**
     * Returns artist's first name
     * @return first name
     */
    public String getArtistFirstName() {
        String[] name = tune.getArtistName().split(" ");
        return name[0];
    }

    /**
     * Returns artist's last name
     * @return last name
     */
    public String getArtistLastName() {
        String[] name = tune.getArtistName().split(" ");
        return name[1];
    }

    /**
     * Returns song's genre
     * @return genre
     */
    public String getGenre() {
        String category = tune.getCategory( );
        String genre = "";
        switch(category) {
            case "Country and Western":
                genre = "Country";
                break;
            case "R&B and Soul": 
                genre = "Jazz";
                break;
            case "Easy Listening": 
                genre = "Other";
                break;
            case "Rock": 
                genre = "Rock";
                break;
            case "Classic Rock":
                genre = "Rock";
                break;
        }
        return genre;
    }
}
