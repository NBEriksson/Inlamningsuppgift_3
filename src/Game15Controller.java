import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Nina Eriksson
 * Date: 2020-10-27
 * Time: 19:43
 * Project: Inlamningsuppgift3
 * Copyright: MIT
 */

public class Game15Controller {

    /*if (gameOver) {
            informationPanel.add(gameOverLabel);
       }*/


    static class NewGameActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //System.out.println("Nytt spel-knappen är tryckt");
            new Game15();
        }
    }


/* @Override
    public void actionPerformed(ActionEvent e) {

    }*/


    static class GameButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton pressedJButton = new JButton();
            pressedJButton = (JButton) e.getSource();
            //System.out.println("Siffran är: " + pressedJButton.getText());
            //swapTiles(pressedJButton.getText());
            checkIndex(pressedJButton.getText());
        }
    }


    private static void checkIndex(String text){
        int index;
        for(int i = 0; i < Game15.myTiles.size(); i++){
            //JButton b = new JButton();
            JButton b = Game15.myTiles.get(i);
            if(b.getText() == text){
                index = i;
                //System.out.println("index är: " + index);
                swapTiles(index);
            }
        }
    }

    private static void swapTiles(int index){

        System.out.println("Inne i swapTiles()");
    }



    // Only half permutations o the puzzle are solvable
// Whenever a tile is preceded by a tile with higher value it counts
// as an inversion. In our case, with the blank tile in the solved position,
// the number of inversions must be even for the puzzle to be solvable
   /* private boolean isSolvable() {
        int countInversions = 0;

        for (int i = 0; i < nbTiles; i++) {
            for (int j = 0; j < i; j++) {
                if (tiles[j] > tiles[i])
                    countInversions++;
            }
        }

        return countInversions % 2 == 0;
    }*/



    /*private boolean isSolved() {
        if (tiles[tiles.length - 1] != 0) // if blank tile is not in the solved position ==> not solved
            return false;

        for (int i = nbTiles - 1; i >= 0; i--) {
            if (tiles[i] != i + 1)
                return false;
        }

        return true;
    }*/

}
