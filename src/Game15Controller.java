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

    private int indexEmptyTile = 15;


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
            String text = pressedJButton.getText();
            //System.out.println("text: " + text);
            if (!text.equals("")) {//om det inte är tom ruta
                checkIndex(text);
            }
        }
    }


    private static void checkIndex(String text) {
        int index;
        for (int i = 0; i < Game15.myTiles.size(); i++) {
            //JButton b = new JButton();
            JButton b = Game15.myTiles.get(i);
            if (b.getText().equals(text)) {//index i ArrayListen där rätt text finns
                index = i;
                //System.out.println("index är: " + index);
                swapTiles(index);
            }
        }
    }


    private static void swapTiles(int clickedIndex) {
        //System.out.println("Inne i swapTiles(), index är: " + clickedIndex);
        ArrayList<Integer> indexToCheck = new ArrayList<Integer>();
        //indexEmptyTile
        //clickedIndex

        switch (clickedIndex) {
            case 0:
                indexToCheck.add(1); indexToCheck.add(4);
                break;
            case 1:
                indexToCheck.add(0); indexToCheck.add(2);indexToCheck.add(5);
                break;
            case 2:
                indexToCheck.add(1); indexToCheck.add(3);indexToCheck.add(6);
                break;
            case 3:
                indexToCheck.add(2); indexToCheck.add(7);
                break;
            case 4:
                indexToCheck.add(0); indexToCheck.add(5);indexToCheck.add(8);
                break;
            case 5:
                indexToCheck.add(1); indexToCheck.add(4);indexToCheck.add(6);indexToCheck.add(9);
                break;
            case 6:
                indexToCheck.add(2); indexToCheck.add(5);indexToCheck.add(7);indexToCheck.add(10);
                break;
            case 7:
                indexToCheck.add(3); indexToCheck.add(6);indexToCheck.add(11);
                break;
            case 8:
                indexToCheck.add(4); indexToCheck.add(9);indexToCheck.add(12);
                break;
            case 9:
                indexToCheck.add(5); indexToCheck.add(8);indexToCheck.add(10);indexToCheck.add(13);
                break;
            case 10:
                indexToCheck.add(6); indexToCheck.add(9);indexToCheck.add(11);indexToCheck.add(14);
                break;
            case 11:
                indexToCheck.add(7); indexToCheck.add(10);indexToCheck.add(15);
                break;
            case 12:
                indexToCheck.add(8); indexToCheck.add(13);
                break;
            case 13:
                indexToCheck.add(9); indexToCheck.add(12);indexToCheck.add(14);
                break;
            case 14:
                indexToCheck.add(10); indexToCheck.add(13);indexToCheck.add(15);
                break;
            case 15:
                indexToCheck.add(11); indexToCheck.add(14);
                break;
            //default:
            //System.out.println("Not in 10, 20 or 30");
        }
        swap(clickedIndex, indexToCheck);
    }


    private static void swap(int clickedIndex, ArrayList<Integer> indexToCheck) {
        System.out.println("clickedIndex: " + clickedIndex);
        System.out.println("index att kolla: ");
        for (Integer i : indexToCheck) {
            System.out.print(" " + i);
        }
    }


    private static boolean isSolvable() {
        //System.out.println("Inne i isSolvable()");
        int count = 0;

        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < i; j++) {
                if (Integer.parseInt(Game15.myTiles.get(j).getText()) > Integer.parseInt(Game15.myTiles.get(i).getText())) {
                    count++;
                }
            }
        }
        return count % 2 == 0;
    }


    private boolean isSolved() {
        //System.out.println("Inne i isSolved()");
        if (indexEmptyTile != 15) {
            return false;
        } else {
            for (int i = 15; i >= 0; i--) {
                if (Integer.parseInt(Game15.myTiles.get(i).getText()) != i + 1) {
                    return false;
                }
            }
        }
        return true;
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
