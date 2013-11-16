package se.kth.id2212.hw1.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.startNewGame();
        while (true) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String input;
                input = br.readLine();
                controller.guessLetter(input.charAt(0));

            } catch (IOException io) {
                io.printStackTrace();
            }
        }
//        controller.startNewGame();
//        controller.guessLetter('e');
//        controller.guessLetter('n');
//        controller.guessWord("car");
//        controller.guessWord("doodle");
//        controller.guessLetter('z');
//        controller.guessLetter('z');
//        controller.guessLetter('z');
//        controller.guessLetter('z');
//        controller.guessLetter('z');
//        controller.guessLetter('z');
//
//        controller.startNewGame();
    }
}
