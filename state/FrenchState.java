import java.util.ArrayList;

public class FrenchState implements State {
    private MusicBox box;

    public FrenchState(MusicBox box) {
        this.box = box;
    }

    public void pressStarButton() {
        ArrayList<String> brille = new ArrayList<String>();
        brille.add("Jouer: Brille, Brille, Petite Étoile");
        brille.add("Brille, brille, petite étoile,");
        brille.add("Je me demande vraiment ce que tu es!");
        brille.add("Au-dessus du monde si haut,");
        brille.add("Comme un diamant dans le ciel.");
        brille.add("Brille, brille, petite étoile,");
        brille.add("Je me demande vraiment ce que tu es!");
        String songTitle = "Brille, Brille, Petite Étoile";
        box.playSong(songTitle, brille);
    }

    public void pressHappyButton() {
        ArrayList<String> joie = new ArrayList<String>();
        joie.add("Jouer: Si Tu as D'la Joie au Coeur");
        joie.add("Si tu as d'la joie au coeur, Frappe des mains");
        joie.add("Si tu as d'la joie au coeur, Frappe des mains");
        joie.add("Si tu as d'la joie au coeur, Frappe des mains");
        joie.add("Si tu as d'la joie au coeur, Frappe des mains");
        String songTitle = "Si Tu as D'la Joie au Coeur";
        box.playSong(songTitle, joie);
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