package se.kth.id2212.hw1.client;

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
        controller.guessLetter('e');
        controller.guessLetter('n');
        controller.guessWord("car");
        controller.guessWord("doodle");
        controller.guessLetter('z');
        controller.guessLetter('z');
        controller.guessLetter('z');
        controller.guessLetter('z');
        controller.guessLetter('z');
        controller.guessLetter('z');
        
        controller.startNewGame();
    }

 

}
