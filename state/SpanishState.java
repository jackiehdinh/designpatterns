import java.util.ArrayList;

/**
 * Spanish State 
 * @author Kim Dinh
 */
public class SpanishState implements State {
    private MusicBox box;

    public SpanishState(MusicBox box) {
        this.box = box;
    }

    public void pressStarButton() {
        ArrayList<String> estrellita = new ArrayList<String>();
        estrellita.add("Tocando: Estrellita Dónde Estás");
        estrellita.add("Estrellita ¿dónde estás?");
        estrellita.add("Me pregunto qué serás.");
        estrellita.add("Está noche allí estarás");
        estrellita.add("Cual diamante brillarás.");
        estrellita.add("Estrellita ¿dónde estás?");
        estrellita.add("Me pregunto qué serás.");
        String songTitle = "Estrellita Dónde Estás";
        box.playSong(songTitle, estrellita);
    }

    public void pressHappyButton() {
        ArrayList<String> feliz = new ArrayList<String>();
        feliz.add("Tocando: Si Usted Está Feliz");
        feliz.add("Si usted está feliz, apaluda las fuerte.");
        feliz.add("Si usted está feliz, apaluda las fuerte.");
        feliz.add("Si usted está feliz, en su cara se vera.");
        feliz.add("Si usted está feliz apaluda las fuerte.");
        String songTitle = "Tocando: Si Usted Está Feliz";
        box.playSong(songTitle, feliz);
    }

    public void pressEnglishButton() {
        System.out.println("You are in English mode.");
        box.setState(box.getEnglishState());
    }

    public void pressFrenchButton() {
        System.out.println("Êtes en mode Français.");
        box.setState(box.getFrenchState());
    }

    public void pressSpanishButton() {
        System.out.println("Está en modo Español.");
        box.setState(box.getSpanishState());
    }
}
