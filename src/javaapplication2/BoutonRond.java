/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author HIGH TECH
 */
import javax.swing.*;
import java.awt.*;

public class BoutonRond extends JButton {

    // Constructor
    public BoutonRond() {
        super(); // Call JButton constructor
        setContentAreaFilled(false); // Disable default JButton painting
    }

    // Paint the button with rounded corners
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set the background color and draw the rounded rectangle
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20); // Adjust the corner radius as needed

        // Call the parent class to handle text/icon painting
        super.paintComponent(g);
        g2.dispose();
    }

    // Paint the border with rounded corners
    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set the border color and draw the rounded rectangle border
        g2.setColor(getForeground());
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20); // Adjust the corner radius as needed
        g2.dispose();
    }

    // Override this method to prevent default painting behavior
    @Override
    public void setContentAreaFilled(boolean b) {
        // Do nothing to keep custom painting intact
    }
}
