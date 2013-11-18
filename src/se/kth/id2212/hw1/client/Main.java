package se.kth.id2212.hw1.client;

import se.kth.id2212.hw1.client.view.View;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Controller controller = new Controller();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                View view = new View(controller);
                controller.setView(view);
                view.setVisible(true);
            }
        });
        
        /*
        
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
        */
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
