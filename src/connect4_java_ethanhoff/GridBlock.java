/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4_java_ethanhoff;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Ethan
 */
public class GridBlock extends JComponent{
    Color pieceColor = (Color.white);
    
    int Pos = 0;
    
    String letter = "Press me!";
    
    public void GridBlock()
    {
        this.setForeground(pieceColor);
        this.setVisible(true);
        
    }
    
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        
        //  ************** ORDER IS EVERYTHING ****************************
        
        g.setColor(Color.black);
        g.fillRect(0, 0, 100, 100);
        g.setColor(pieceColor);
        g.fillRect(5, 5, 90, 90);
        
        if(Pos == 0 || Pos == 1 || Pos == 2 || Pos == 3 || Pos == 4 || Pos == 5 || Pos == 6)
        {
        //change the color back to black
        g.setColor(Color.black);
        
        //Center my text
        int width = g.getFontMetrics().stringWidth(letter);
        int left = (75 - width) / 2;
        
        //draw the string
        g.drawString(letter, left, 60);
        }

    }
    
    
    
    public Color getPieceColor() {
        return pieceColor;
    }

    public void setPieceColor(Color pieceColor) {
        this.pieceColor = pieceColor;
        this.repaint();
    }

    public int getPos() {
        return Pos;
    }

    public void setPos(int Pos) {
        this.Pos = Pos;
        
    }
    public String getLetter() {
        return letter;
    }

}
