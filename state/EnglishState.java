import java.util.ArrayList;

public class EnglishState implements State {
    private MusicBox box;

    public EnglishState(MusicBox box) {
        this.box = box;
    }

    public void pressStarButton() {
        ArrayList<String> twinkle = new ArrayList<String>();
        twinkle.add("Playing: Twinkle Twinkle Little Star");
        twinkle.add("Twinkle, twinkle, little star,");
        twinkle.add("How I wonder what you are!");
        twinkle.add("Up above the world so high,");
        twinkle.add("Like a diamond in the sky.");
        twinkle.add("Twinkle, twinkle, little star,");
        twinkle.add("How I wonder what you are!");
        String songTitle = "Twinkle Twinkle Little Star";
        box.playSong(songTitle, twinkle);
    }

    public void pressHappyButton() {
        ArrayList<String> happy = new ArrayList<String>();
        happy.add("Playing: If You're Happy and You Know It");
        happy.add("If you're happy and you know it, clap your hands");
        happy.add("If you're happy and you know it, clap your hands");
        happy.add("If you're happy and you know it, then your face will surely show it");
        happy.add("If you're happy and you know it, clap your hands");
        String songTitle = "If You're Happy and You Know It";
        box.playSong(songTitle, happy);
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
