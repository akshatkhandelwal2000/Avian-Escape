package com.javaProjectAvianEscape;

import javax.swing.*;

public class Game {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Avian Escape");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        AvianEscape avianEscape = new AvianEscape();
        frame.add(avianEscape);
        frame.pack();
        avianEscape.requestFocus();
        frame.setVisible(true);
    }
}
