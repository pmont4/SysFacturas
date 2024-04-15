package main;

import frames.MainFrame;

public class App {
    
    private static MainFrame mainFrame;
    
    public static void main(String[] args) {
        mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
    
}
