/**
 * Song Genres
 * @author Kim Dinh
 */
public enum Genre {
    ROCK ("Rock"),
    POP ("Pop"),
    HIPHOP ("Hiphop"),
    JAZZ ("Jazz"),
    COUNTRY ("Country"),
    OTHER ("Other");

    private final String textForm;

    /**
     * Converts the values into strings
     * @param textForm
     */
    private Genre(String textForm) {
        this.textForm = textForm;
    }

    /**
     * Returns string form of genre enum
     * @return string form of genre enum
     */
    public String toString() {
        return textForm;
    }
}