/**
 * Old Format of Displaying Songs
 * @author Kim Dinh
 */
public class Oldie implements Tune {
    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;

    public Oldie(String artistName, String songTitle, String recordTitle, String category) {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }

    /**
     * Returns artist's name
     * @return name
     */
    public String getArtistName() {
        return this.artistName;
    }

    /**
     * Returns display title
     * @return display title
     */
    public String getDisplayTitle() {
        String display = this.songTitle + ": " + this.recordTitle;
        return display;
    }

    /**
     * Returns cagetory
     * @return category
     */
    public String getCategory() {
        return this.category;
    }
    
}
