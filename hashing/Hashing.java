package hashing;

import java.util.HashMap;

public class Hashing {

    public Hashing() {

    }

    public void run() {
        HashMap<String, String> statesCaps = new HashMap<String, String>();
        statesCaps.put("washington", "ollympia");
        statesCaps.put("south carolina", "columbia");
        statesCaps.put("florida", "tallahaussee");
        statesCaps.put("florida", "test");

        System.out.println(statesCaps.get("florida"));
    }

    public static void main(String[] args) {
        Hashing program = new Hashing();
        program.run();
    }
}