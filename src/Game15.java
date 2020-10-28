import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by Nina Eriksson
 * Date: 2020-10-22
 * Time: 09:31
 * Project: Inlamningsuppgift3
 * Copyright: MIT
 */


public class Game15 {

    private JFrame myGame15Frame = new JFrame("NINAS SPEL");
    private JPanel gamePanel = new JPanel();
    private JPanel informationPanel = new JPanel();
    private JLabel gameOverLabel = new JLabel("Grattis, du vann!");
    private JButton newGameButton = new JButton("Nytt spel");
    private Boolean gameOver = false;
    static ArrayList<JButton> myTiles = new ArrayList<>();


    public static void main(String[] args) {
        Game15 my15Game = new Game15();
    }

    public Game15() {
        myTiles.clear();
        /*System.out.println("myTiles efter clear(): ");
        for(JButton b : myTiles)
            System.out.println(", " + b.getText());*/

        myGame15Frame.setSize(416, 500);
        myGame15Frame.setLocation(250, 100);
        myGame15Frame.setVisible(true);
        myGame15Frame.setTitle("NINAS SPEL");
        myGame15Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myGame15Frame.setResizable(true);

        gamePanel.setBackground(Color.LIGHT_GRAY);
        gamePanel.setSize(400, 400);
        gamePanel.setLayout(new GridLayout(4, 4));

        informationPanel.setBackground(Color.WHITE);
        /*if (gameOver) {
            informationPanel.add(gameOverLabel);
        }*/


        /*class NewGameActionListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Nytt spel-knappen är tryckt");
            }
        }*/

        newGameButton.addActionListener(new Game15Controller.NewGameActionListener());
        newGameButton.setFont(new Font("Arial", Font.PLAIN, 20));
        informationPanel.add(newGameButton);

        //ArrayList<JButton> myTiles = new ArrayList<>();

        JButton b1 = new JButton("1");
        b1.setFont(new Font("Arial", Font.PLAIN, 30));
        b1.addActionListener(new Game15Controller.GameButtonActionListener());
        JButton b2 = new JButton("2");
        b2.setFont(new Font("Arial", Font.PLAIN, 30));
        b2.addActionListener(new Game15Controller.GameButtonActionListener());
        JButton b3 = new JButton("3");
        b3.setFont(new Font("Arial", Font.PLAIN, 30));
        b3.addActionListener(new Game15Controller.GameButtonActionListener());
        JButton b4 = new JButton("4");
        b4.setFont(new Font("Arial", Font.PLAIN, 30));
        b4.addActionListener(new Game15Controller.GameButtonActionListener());
        JButton b5 = new JButton("5");
        b5.setFont(new Font("Arial", Font.PLAIN, 30));
        b5.addActionListener(new Game15Controller.GameButtonActionListener());
        JButton b6 = new JButton("6");
        b6.setFont(new Font("Arial", Font.PLAIN, 30));
        b6.addActionListener(new Game15Controller.GameButtonActionListener());
        JButton b7 = new JButton("7");
        b7.setFont(new Font("Arial", Font.PLAIN, 30));
        b7.addActionListener(new Game15Controller.GameButtonActionListener());
        JButton b8 = new JButton("8");
        b8.setFont(new Font("Arial", Font.PLAIN, 30));
        b8.addActionListener(new Game15Controller.GameButtonActionListener());
        JButton b9 = new JButton("9");
        b9.setFont(new Font("Arial", Font.PLAIN, 30));
        b9.addActionListener(new Game15Controller.GameButtonActionListener());
        JButton b10 = new JButton("10");
        b10.setFont(new Font("Arial", Font.PLAIN, 30));
        b10.addActionListener(new Game15Controller.GameButtonActionListener());
        JButton b11 = new JButton("11");
        b11.setFont(new Font("Arial", Font.PLAIN, 30));
        b11.addActionListener(new Game15Controller.GameButtonActionListener());
        JButton b12 = new JButton("12");
        b12.setFont(new Font("Arial", Font.PLAIN, 30));
        b12.addActionListener(new Game15Controller.GameButtonActionListener());
        JButton b13 = new JButton("13");
        b13.setFont(new Font("Arial", Font.PLAIN, 30));
        b13.addActionListener(new Game15Controller.GameButtonActionListener());
        JButton b14 = new JButton("14");
        b14.setFont(new Font("Arial", Font.PLAIN, 30));
        b14.addActionListener(new Game15Controller.GameButtonActionListener());
        JButton b15 = new JButton("15");
        b15.setFont(new Font("Arial", Font.PLAIN, 30));
        b15.addActionListener(new Game15Controller.GameButtonActionListener());
        JButton b16 = new JButton("");
        b16.setFont(new Font("Arial", Font.PLAIN, 30));
        b16.addActionListener(new Game15Controller.GameButtonActionListener());
        b16.setBackground(Color.LIGHT_GRAY);


        myTiles.add(b1);
        myTiles.add(b2);
        myTiles.add(b3);
        myTiles.add(b4);
        myTiles.add(b5);
        myTiles.add(b6);
        myTiles.add(b7);
        myTiles.add(b8);
        myTiles.add(b9);
        myTiles.add(b10);
        myTiles.add(b11);
        myTiles.add(b12);
        myTiles.add(b13);
        myTiles.add(b14);
        myTiles.add(b15);

        Collections.shuffle(myTiles);
        myTiles.add(b16);

        for(int i = 0; i < 16; i++){
            gamePanel.add(myTiles.get(i));
        }

        myGame15Frame.add(gamePanel).setLocation(0, 0);
        myGame15Frame.add(informationPanel, BorderLayout.SOUTH);
        myGame15Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myGame15Frame.setVisible(true);
    }

   /* @Override
    public void actionPerformed(ActionEvent e) {

    }*/

    /*private class GameButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton pressedJButton = new JButton();
            pressedJButton = (JButton) e.getSource();
            System.out.println("Siffran är: " + pressedJButton.getText());
        }
    }*/
}
