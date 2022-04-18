import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * A Music Box
 * @author Kim Dinh
 */
public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
    }

    public void pressStarButton() {
        state.pressStarButton();
    }

    public void pressHappyButton() {
        state.pressHappyButton();
    }

    public void pressEnglishButton() {
        setState(englishState);
        state.pressEnglishButton();
    }

    public void pressFrenchButton() {
        setState(frenchState);
        state.pressFrenchButton();
    }
    
    public void pressSpanishButton() {
        setState(spanishState);
        state.pressSpanishButton();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getEnglishState() {
        return englishState;
    }

    public State getFrenchState() {
        return frenchState;
    }

    public State getSpanishState() {
        return spanishState;
    }

    public void playSong(String songName, ArrayList<String> lyrics) {
        try {
            for(int i = 0; i < lyrics.size(); i++) {
                System.out.println(lyrics.get(i));
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}