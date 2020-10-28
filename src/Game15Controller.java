import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

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


    static class GameButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton pressedJButton = new JButton();
            pressedJButton = (JButton) e.getSource();
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
            JButton b = Game15.myTiles.get(i);
            if (b.getText().equals(text)) {//index i ArrayListen där rätt text finns
                index = i;
                swapTiles(index);
                i = Game15.myTiles.size();
            }
        }
    }


    private static void swapTiles(int clickedIndex) {

        ArrayList<Integer> indexToCheck = new ArrayList<Integer>();

        switch (clickedIndex) {
            case 0:
                indexToCheck.add(1);
                indexToCheck.add(4);
                break;
            case 1:
                indexToCheck.add(0);
                indexToCheck.add(2);
                indexToCheck.add(5);
                break;
            case 2:
                indexToCheck.add(1);
                indexToCheck.add(3);
                indexToCheck.add(6);
                break;
            case 3:
                indexToCheck.add(2);
                indexToCheck.add(7);
                break;
            case 4:
                indexToCheck.add(0);
                indexToCheck.add(5);
                indexToCheck.add(8);
                break;
            case 5:
                indexToCheck.add(1);
                indexToCheck.add(4);
                indexToCheck.add(6);
                indexToCheck.add(9);
                break;
            case 6:
                indexToCheck.add(2);
                indexToCheck.add(5);
                indexToCheck.add(7);
                indexToCheck.add(10);
                break;
            case 7:
                indexToCheck.add(3);
                indexToCheck.add(6);
                indexToCheck.add(11);
                break;
            case 8:
                indexToCheck.add(4);
                indexToCheck.add(9);
                indexToCheck.add(12);
                break;
            case 9:
                indexToCheck.add(5);
                indexToCheck.add(8);
                indexToCheck.add(10);
                indexToCheck.add(13);
                break;
            case 10:
                indexToCheck.add(6);
                indexToCheck.add(9);
                indexToCheck.add(11);
                indexToCheck.add(14);
                break;
            case 11:
                indexToCheck.add(7);
                indexToCheck.add(10);
                indexToCheck.add(15);
                break;
            case 12:
                indexToCheck.add(8);
                indexToCheck.add(13);
                break;
            case 13:
                indexToCheck.add(9);
                indexToCheck.add(12);
                indexToCheck.add(14);
                break;
            case 14:
                indexToCheck.add(10);
                indexToCheck.add(13);
                indexToCheck.add(15);
                break;
            case 15:
                indexToCheck.add(11);
                indexToCheck.add(14);
                break;
        }
        swap(clickedIndex, indexToCheck);
    }


    private static void swap(int clickedIndex, ArrayList<Integer> indexToCheck) {
        //System.out.println("\nclickedIndex: " + clickedIndex);
        int emptyIndex = 0;

        for (Integer i : indexToCheck) {
            if (Game15.myTiles.get(i).getText().equals("")) {//om tom ruta
                emptyIndex = i;
               // System.out.println("emptyIndex: " + emptyIndex);
            }
        }

        Collections.swap(Game15.myTiles, clickedIndex, emptyIndex);

        for(int i = 0; i < 16; i++){
            Game15.gamePanel.add(Game15.myTiles.get(i));
        }
        Game15.gamePanel.updateUI();
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


    //HITTAT PÅ NÄTET
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
}
