import java.text.DecimalFormat;
import java.util.*;

/**
 * A Math Game
 * @author Kim Dinh
 */
public class MathGame {
    private static MathGame mathGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private String[] operands = {"+", "-", "*", "/" };
    
    /**
     * Constructs a MathGame, scanner object, and 
     * prints a welcoming statement
     */
    private MathGame() {
        this.rand = new Random();
        this.score = 0;
        this.reader = new Scanner(System.in);
        System.out.println("Let's have fun with Math!");
    }

    /**
     * Creates and returns an instance of MathGame
     * given one does not already exist; otherwise, 
     * returns existing instance of MathGame
     * @return MathGame
     */
    public static MathGame getInstance() {
        if (mathGame == null) 
            mathGame = new MathGame();
        return mathGame;
    }

    /**
     * Asks user if they want to play or quit and 
     * responds accordingly; if invalid data is entered, 
     * returns statement saying so
     */
    public void play() {
        while (true) {
            System.out.print("(P)lay or (Q)uit: ");
            String play = reader.nextLine();
            if (play.equalsIgnoreCase("P")) {
                System.out.println("\nRound answer to 1 decimal place");
                playRound();
            } else if (play.equalsIgnoreCase("Q")) {
                System.out.println("You won " + score + " games!\nGoodbye");
                break;
            } else {
                System.out.println("Sorry, you must enter p or q");
            }
        }
    }

    /**
     * Creates a question for user to answer by generating
     * two random numbers and one random operand; whether 
     * or not user's guess is correct determines whether it
     * returns true or false 
     * @return boolean
     */
    private boolean playRound() {
        try {
            DecimalFormat df = new DecimalFormat("0.0");
            double num1 = rand.nextInt(100 - 1) + 1;
            double num2 = rand.nextInt(100 - 1) + 1;
            String operand = selectOperand();
            double actualAns = findAns(num1, operand, num2);
            System.out.print(num1 + operand + num2 + " = ");
            int ans = reader.nextInt();
            reader.nextLine();
            if (ans == actualAns) {
                System.out.println("You got it!");
                score++;
                return true;
            } else {
                System.out.println("The correct answer is: " + df.format(actualAns));
                return false;
            }
        } catch (InputMismatchException e) {
            System.out.println("Please type a number rounded to one decimal place next time. No points for this round.");
            return false;
        } catch (Exception e) {
            System.out.println(e + "\nNo points for this round.");
            return false;
        }
    }

    /**
     * Randomly selections one of the four operations 
     * @return String
     */
    private static String selectOperand() {
        Random rand = new Random();
        int random = rand.nextInt(4);
        switch (random) {
            case 0:
            return " + ";
            case 1:
            return " - ";
            case 2:
            return " * ";
            case 3: 
            return " / ";
        }
        return "";
    }

    /**
     * Calculates the correct answer 
     * @param num1
     * @param operand
     * @param num2
     * @return double 
     */
    private static double findAns(double num1, String operand, double num2) {
        if (operand.equals(" + ")) {
            return num1 + num2;
        } else if (operand.equals(" - ")) {
            return num1 - num2;
        } else if (operand.equals(" * ")) {
            return num1 * num2;
        } else if (operand.equals(" / ")) {
            return num1 / num2;
        }
        return 0.0;
    }
}

