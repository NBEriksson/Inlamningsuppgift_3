import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
            System.out.println("Siffran är: " + pressedJButton.getText());
        }
    }
}
