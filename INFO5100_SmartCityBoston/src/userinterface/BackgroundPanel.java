/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manis
 */
public class BackgroundPanel extends JPanel{
    
ImageIcon backImage;
public BackgroundPanel(String imageName) {
    backImage = new ImageIcon(imageName);
    
    
}

@Override
protected void paintComponent(Graphics g) {
    BufferedImage scaledImage = getScaledImage();
    super.paintComponent(g);
    g.drawImage(scaledImage, 0, 0, null);
    
}

private BufferedImage getScaledImage(){
    BufferedImage image = new BufferedImage(getWidth(),getHeight(), BufferedImage.TYPE_INT_RGB);
    Graphics2D g2d = (Graphics2D) image.createGraphics();
    g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY));
    g2d.drawImage(backImage.getImage(), 0, 0,getWidth(),getHeight(), null);
    return image;
}
}

