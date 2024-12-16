 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.swing;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Background extends JPanel {

    public Background() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); // Ensures default painting is handled
        Graphics2D g2 = (Graphics2D) grphcs.create();

        // Enable anti-aliasing for smooth graphics
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 1. Gradient Sky (top section)
        GradientPaint skyGradient = new GradientPaint(
            0, 0, new Color(30, 87, 153), // Deep blue
            0, getHeight() / 2, new Color(125, 185, 232) // Lighter blue
        );
        g2.setPaint(skyGradient);
        g2.fillRect(0, 0, getWidth(), getHeight() / 2);

        // 2. Road with Gradient
        GradientPaint roadGradient = new GradientPaint(
            0, getHeight() / 2, new Color(50, 50, 50), // Dark gray
            0, getHeight(), new Color(100, 100, 100) // Lighter gray
        );
        g2.setPaint(roadGradient);
        g2.fillRect(0, getHeight() / 2, getWidth(), getHeight() / 2);

        // 3. Lane Markings
        int roadCenter = getHeight() * 3 / 4; // Center of the road
        g2.setColor(Color.WHITE);
        int dashWidth = 60;
        int dashSpacing = 30;
        for (int x = 0; x < getWidth(); x += dashWidth + dashSpacing) {
            g2.fillRect(x, roadCenter - 2, dashWidth, 5); // Dash height 5px
        }

        // 4. Car-Like Shape (Dynamic Accent)
        g2.setColor(new Color(255, 69, 0, 200)); // Semi-transparent red
        int carWidth = 200;
        int carHeight = 50;
        int carX = getWidth() / 2 - carWidth / 2; // Centered horizontally
        int carY = getHeight() / 3; // Floating in the top section
        g2.fillRoundRect(carX, carY, carWidth, carHeight, 20, 20);

        // Add "glow" under the car
        g2.setColor(new Color(255, 69, 0, 100)); // Faint red glow
        g2.fillOval(carX - 20, carY + carHeight - 10, carWidth + 40, 20);

        // 5. Title Banner
        int bannerHeight = 80;
        int bannerY = getHeight() / 4 - bannerHeight / 2;
        GradientPaint bannerGradient = new GradientPaint(
            0, bannerY, new Color(255, 255, 255, 200), // Semi-transparent white
            0, bannerY + bannerHeight, new Color(200, 200, 200, 150) // Grayish tint
        );
        g2.setPaint(bannerGradient);
        g2.fillRoundRect(getWidth() / 4, bannerY, getWidth() / 2, bannerHeight, 30, 30);

        // Add text to the banner
        g2.setColor(Color.DARK_GRAY);
        g2.setFont(new Font("Arial", Font.BOLD, 28));
        String title = "Agence de Location de Voitures";
        FontMetrics metrics = g2.getFontMetrics();
        int titleX = (getWidth() - metrics.stringWidth(title)) / 2;
        int titleY = bannerY + (bannerHeight + metrics.getAscent() - metrics.getDescent()) / 2;
        g2.drawString(title, titleX, titleY);

        g2.dispose();
    }
}
