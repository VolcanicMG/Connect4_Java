/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4_java_ethanhoff;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import java.util.Random;


public class frame1 extends javax.swing.JFrame {

    ArrayList<GridBlock> myAL = new ArrayList();
    
    GridBlock block;
    Timer myTimer;
    
    int win = 0;
    int lose = 0;
    int tie = 0;
    
    int row1 = 35;
    int row2 = 36;
    int row3 = 37;
    int row4 = 38;
    int row5 = 39;
    int row6 = 40;
    int row7 = 41;
     
    int ProgValue = 0;
    
    Color myColor;
    
    Random RNG;
    
    int playerSwitch = 1;

    
    public frame1() {
        initComponents();
        //create the border
        jPanel1.setBorder(BorderFactory.createLineBorder(Color.black, 3, true));

        //set up the game tiles
        createTextFields();
        
        RNG = new Random();
    }

    
    
    
    private void createTextFields() {
        //variables
        int x = 30;
        int y = 30;
        int boxcnt = 42;
        
        //create the 7 by 6 grid
        for (int cntr = 0; cntr < boxcnt; cntr++) {
                //instanciate a new text field
                GridBlock tf = new GridBlock();

                //instanciate the boxes
                tf.setSize(75, 75);
                tf.setLocation(x, y);
                tf.setVisible(true);
                tf.setPieceColor(Color.LIGHT_GRAY);
                tf.setPos(cntr);
               
                
                //add a mouselistener  
                    tf.addMouseListener(new MouseListener() {
                        @Override
                        public void mouseClicked(MouseEvent arg0) {
                                Player(tf);
                                checkWin();
                                AI();
                                checkWin();
                                

                        }

                        @Override
                        public void mousePressed(MouseEvent arg0) {

                        }

                        @Override
                        public void mouseReleased(MouseEvent arg0) {

                        }

                        @Override
                        public void mouseEntered(MouseEvent arg0) {
                           // if(tf.getPieceColor() != (Color.red) || tf.getPieceColor() != (Color.yellow))
                            //{
                             //  tf.setPieceColor(Color.gray);
                           // }
                        }

                        @Override
                        public void mouseExited(MouseEvent arg0) {
                           // if(tf.getPieceColor() != (Color.red) || tf.getPieceColor() != (Color.yellow))
                           // {
                            //    tf.setPieceColor(Color.LIGHT_GRAY);
                           // }
                        }
                    });
                
                //add the tf to the arraylsit
                myAL.add(tf);
                
                //add the tf to the panel
                jPanel1.add(tf);
                 
                
                //move the boxes to the right 
                x = x + 80;
                
               //reset for the next layer of boxes
                 if(cntr % 7 == 6)
                    {
                        y = y + 80;
                        x = 30; 
                    }
                
                
            }
            
        
        
    }
    
    void colorswitchV(int cntr)
    {
        if(playerSwitch == 1)
        {
            myColor = (Color.yellow);
        }
        else if(playerSwitch == 2)
        {
            myColor = (Color.red);
        }
        
        myTimer = new Timer(100,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) 
            {
                
                ProgValue++;
                if(ProgValue == 10)
                {
                        myAL.get(cntr).setPieceColor(myColor);
                        myAL.get(cntr + 7).setPieceColor(myColor);
                        myAL.get(cntr + 14).setPieceColor(myColor);
                        myAL.get(cntr + 21).setPieceColor(myColor);
                        
                        ProgValue = 0;
                }
                else if(ProgValue >= 5)
                {
                        myAL.get(cntr).setPieceColor(Color.black);
                        myAL.get(cntr + 7).setPieceColor(Color.black);
                        myAL.get(cntr + 14).setPieceColor(Color.black);
                        myAL.get(cntr + 21).setPieceColor(Color.black);
                        
                        
                }
            }
        } );
        
        myTimer.start();
        
    }
    
    void colorswitchH(int cntr)
    {
        if(playerSwitch == 1)
        {
            myColor = (Color.yellow);
        }
        else if(playerSwitch == 2)
        {
            myColor = (Color.red);
        }
        
        myTimer = new Timer(100,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) 
            {
                
                ProgValue++;
                if(ProgValue == 10)
                {
                        myAL.get(cntr).setPieceColor(myColor);
                        myAL.get(cntr + 1).setPieceColor(myColor);
                        myAL.get(cntr + 2).setPieceColor(myColor);
                        myAL.get(cntr + 3).setPieceColor(myColor);
                        
                        ProgValue = 0;
                }
                else if(ProgValue >= 5)
                {
                        myAL.get(cntr).setPieceColor(Color.black);
                        myAL.get(cntr + 1).setPieceColor(Color.black);
                        myAL.get(cntr + 2).setPieceColor(Color.black);
                        myAL.get(cntr + 3).setPieceColor(Color.black);
                        
                        
                }
            }
        } );
        
        myTimer.start();
        
    }
    
    void colorswitchDiagR(int cntr)
    {
        if(playerSwitch == 1)
        {
            myColor = (Color.yellow);
        }
        else if(playerSwitch == 2)
        {
            myColor = (Color.red);
        }
        
        myTimer = new Timer(100,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) 
            {
                
                ProgValue++;
                if(ProgValue == 10)
                {
                        myAL.get(cntr).setPieceColor(myColor);
                        myAL.get(cntr + 8).setPieceColor(myColor);
                        myAL.get(cntr + 16).setPieceColor(myColor);
                        myAL.get(cntr + 24).setPieceColor(myColor);
                        
                        ProgValue = 0;
                }
                else if(ProgValue >= 5)
                {
                        myAL.get(cntr).setPieceColor(Color.black);
                        myAL.get(cntr + 8).setPieceColor(Color.black);
                        myAL.get(cntr + 16).setPieceColor(Color.black);
                        myAL.get(cntr + 24).setPieceColor(Color.black);
                        
                        
                }
            }
        } );
        
        myTimer.start();
        
    }
    
    void colorswitchDiagL(int cntr)
    {
        if(playerSwitch == 1)
        {
            myColor = (Color.yellow);
        }
        else if(playerSwitch == 2)
        {
            myColor = (Color.red);
        }
        
        myTimer = new Timer(100,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) 
            {
                
                ProgValue++;
                if(ProgValue == 10)
                {
                        myAL.get(cntr).setPieceColor(myColor);
                        myAL.get(cntr + 6).setPieceColor(myColor);
                        myAL.get(cntr + 12).setPieceColor(myColor);
                        myAL.get(cntr + 18).setPieceColor(myColor);
                        
                        ProgValue = 0;
                }
                else if(ProgValue >= 5)
                {
                        myAL.get(cntr).setPieceColor(Color.black);
                        myAL.get(cntr + 6).setPieceColor(Color.black);
                        myAL.get(cntr + 12).setPieceColor(Color.black);
                        myAL.get(cntr + 18).setPieceColor(Color.black);
                        
                        
                }
            }
        } );
        
        myTimer.start();
        
    }
    
    /*
    
     0  1  2  3  4  5  6
     7  8  9  10 11 12 13
     14 15 16 17 18 19 20
     21 22 23 24 25 26 27
     28 29 30 31 32 33 34 
     35 36 37 38 39 40 41
    
    */
    
    void checkWin()
    {
        //Check all 3 wins
        
        checkWinH();
        checkWinV();
        checkWinDiagR();
        checkWinDiagL();
    }
    
    void checkWinDiagL()
    {
        int rows = 6;
        int cals = 7;
        
        int row_end = 3; 
        int cal_start = 3; 
        int cal_end = 7; 
        for(int row = 0; row < row_end; row++){
            for(int cntr = cal_start; cntr < cal_end; cntr++)
            {
                //System.out.println("D Check " + row + " " + cntr);
                
                if(myAL.get(cntr).getPieceColor() == myAL.get(cntr + 6).getPieceColor() && 
                   myAL.get(cntr).getPieceColor() == myAL.get(cntr + 12).getPieceColor() && 
                   myAL.get(cntr).getPieceColor() == myAL.get(cntr + 18).getPieceColor() && 
                           myAL.get(cntr).getPieceColor() != Color.LIGHT_GRAY)
                {
                    //Check to see if the AI won or the player playerSwitch = 0 means the game stops
                    if(playerSwitch == 2)
                    {
                       colorswitchDiagL(cntr);
                       win++;
                       System.out.println("WINNER");
                       jLabel1.setText("Player wins!");
                       jLabel2.setText("Wins: " + win);
                       playerSwitch = 0;
                       
                    }
                    else if(playerSwitch == 1)
                    {
                        colorswitchDiagL(cntr);
                        lose++;
                        System.out.println("You lost..."); 
                        jLabel1.setText("AI wins!");
                        jLabel3.setText("Loses: " + lose);
                        playerSwitch = 0;
                         
                    }

                }
            }
            cal_start = cal_start + 7;
            cal_end = cal_end + 7;
        } 
        //System.out.println("\n----------\n");
    }
    
    void checkWinDiagR()
    {
        int rows = 6;
        int cals = 7;
        
        int row_end = 3; 
        int cal_start = 0; 
        int cal_end = 4; 
        for(int row = 0; row < row_end; row++){
            for(int cntr = cal_start; cntr < cal_end; cntr++)
            {
                //System.out.println("D Check " + row + " " + cntr);
                
                if(myAL.get(cntr).getPieceColor() == myAL.get(cntr + 8).getPieceColor() && 
                   myAL.get(cntr).getPieceColor() == myAL.get(cntr + 16).getPieceColor() && 
                   myAL.get(cntr).getPieceColor() == myAL.get(cntr + 24).getPieceColor() && 
                           myAL.get(cntr).getPieceColor() != Color.LIGHT_GRAY)
                {
                    //Check to see if the AI won or the player playerSwitch = 0 means the game stops
                    if(playerSwitch == 2)
                    {
                       colorswitchDiagR(cntr);
                       win++;
                       System.out.println("WINNER");
                       jLabel1.setText("Player wins!");
                       jLabel2.setText("Wins: " + win);
                       playerSwitch = 0;
                       
                    }
                    else if(playerSwitch == 1)
                    {
                        colorswitchDiagR(cntr);
                        lose++;
                        System.out.println("You lost..."); 
                        jLabel1.setText("AI wins!");
                        jLabel3.setText("Loses: " + lose);
                        playerSwitch = 0;
                         
                    }

                }
            }
            cal_start = cal_start + 7;
            cal_end = cal_end + 7;
        } 
        //System.out.println("\n----------\n");
    }
    
    //0 - 20 start and end
    void checkWinV()
    {
        int rows = 6;
        int cals = 7;
        
        int row_end = 3; 
        int cal_start = 0; 
        int cal_end = 7; 
        for(int row = 0; row < row_end; row++){
            for(int cntr = cal_start; cntr < cal_end; cntr++)
            {
                //System.out.println("V Check " + row + " " + cntr);
                
                if(myAL.get(cntr).getPieceColor() == myAL.get(cntr + 7).getPieceColor() && 
                   myAL.get(cntr).getPieceColor() == myAL.get(cntr + 14).getPieceColor() && 
                   myAL.get(cntr).getPieceColor() == myAL.get(cntr + 21).getPieceColor() && 
                           myAL.get(cntr).getPieceColor() != Color.LIGHT_GRAY)
                {
                    //Check to see if the AI won or the player playerSwitch = 0 means the game stops
                    if(playerSwitch == 2)
                    {
                       colorswitchV(cntr);
                       win++;
                       System.out.println("WINNER");
                       jLabel1.setText("Player wins!");
                       jLabel2.setText("Wins: " + win);
                       playerSwitch = 0;
                       
                    }
                    else if(playerSwitch == 1)
                    {
                        colorswitchV(cntr);
                        lose++;
                        System.out.println("You lost..."); 
                        jLabel1.setText("AI wins!");
                        jLabel3.setText("Loses: " + lose);
                        playerSwitch = 0;
                         
                    }

                }
            }
            cal_start = cal_start + 7;
            cal_end = cal_end + 7;
        } 
        //System.out.println("\n----------\n");
    }
    
    
    void checkWinH()
    {
        int rows = 6;
        int cals = 7;
        
        int row_end = 6; //Change on the diag verticals
        int cal_start = 0; //start of the Horizontal win, point where it can start
        int cal_end = 4; //end of the row for the Horizonatal win, point where it ends
        for(int row = 0; row < row_end; row++){
            for(int cntr = cal_start; cntr < cal_end; cntr++)
            {
                //System.out.println("H Check " + row + " " + cntr);
                
                if(myAL.get(cntr).getPieceColor() == myAL.get(cntr + 1).getPieceColor() && 
                   myAL.get(cntr).getPieceColor() == myAL.get(cntr + 2).getPieceColor() && 
                   myAL.get(cntr).getPieceColor() == myAL.get(cntr + 3).getPieceColor() && 
                           myAL.get(cntr).getPieceColor() != Color.LIGHT_GRAY)
                {
                    //Check to see if the AI won or the player playerSwitch = 0 means the game stops
                    if(playerSwitch == 2)
                    {
                       colorswitchH(cntr);
                       win++;
                       System.out.println("WINNER");
                       jLabel1.setText("Player wins!");
                       jLabel2.setText("Wins: " + win);
                       playerSwitch = 0;
                       
                    }
                    else if(playerSwitch == 1)
                    {
                        colorswitchH(cntr);
                        lose++;
                        System.out.println("You lost..."); 
                        jLabel1.setText("AI wins!");
                        jLabel3.setText("Loses: " + lose);
                        playerSwitch = 0;
                         
                    }

                }
            }
            cal_start = cal_start + 7;
            cal_end = cal_end + 7;
        } 
        //System.out.println("\n----------\n");
    }
    
    void Player(GridBlock tf)
    {
        //check to see what box was clicked
        if(tf.getPos() == 0 && playerSwitch == 1)
            {
            if(myAL.get(row1).getPieceColor() == Color.LIGHT_GRAY)
                {
                    myAL.get(row1).setPieceColor(Color.red);
                    playerSwitch++;
                }
            else if(myAL.get(row1).getPieceColor() != Color.LIGHT_GRAY)
            {
                if(myAL.get(row1).getPieceColor() == Color.yellow)
                {
                    while(myAL.get(row1).getPieceColor() == Color.yellow)
                    {
                     row1 = row1 - 7;
                    }
                }
                else{
                    if(row1 <= 0)
                    {
                        System.out.println("Pick another spot");
                    }else
                    {
                        row1 = row1 - 7;
                    }

                }

            }

        }
        if(tf.getPos() == 1 && playerSwitch == 1)
            {
            if(myAL.get(row2).getPieceColor() == Color.LIGHT_GRAY)
                {
                    myAL.get(row2).setPieceColor(Color.red);
                    playerSwitch++;
                }
            else if(myAL.get(row2).getPieceColor() != Color.LIGHT_GRAY)
            {
                if(myAL.get(row2).getPieceColor() == Color.yellow)
                {
                    while(myAL.get(row2).getPieceColor() == Color.yellow)
                    {
                     row2 = row2 - 7;
                    }
                }
                else{
                    if(row2 <= 1)
                    {
                        System.out.println("Pick another spot");
                    }else
                    {
                        row2 = row2 - 7;
                    }
                }
            }

        }
        if(tf.getPos() == 2 && playerSwitch == 1)
            {
            if(myAL.get(row3).getPieceColor() == Color.LIGHT_GRAY)
                {
                    myAL.get(row3).setPieceColor(Color.red);
                    playerSwitch++;
                }
            else if(myAL.get(row3).getPieceColor() != Color.LIGHT_GRAY)
            {
                if(myAL.get(row3).getPieceColor() == Color.yellow)
                {
                    while(myAL.get(row3).getPieceColor() == Color.yellow)
                    {
                     row3 = row3 - 7;
                    }
                }
                else{
                    if(row3 <= 2)
                    {
                        System.out.println("Pick another spot");
                    }else
                    {
                        row3 = row3 - 7;
                    }
                }

            }

        }
        if(tf.getPos() == 3 && playerSwitch == 1)
            {
            if(myAL.get(row4).getPieceColor() == Color.LIGHT_GRAY)
                {
                    myAL.get(row4).setPieceColor(Color.red);
                    playerSwitch++;

                }
            else if(myAL.get(row4).getPieceColor() != Color.LIGHT_GRAY)
            {
                if(myAL.get(row4).getPieceColor() == Color.yellow)
                {
                    while(myAL.get(row4).getPieceColor() == Color.yellow)
                    {
                     row4 = row4 - 7;
                    }
                }
                else{
                    if(row4 <= 3)
                    {
                        System.out.println("Pick another spot");
                    }else
                    {
                        row4 = row4 - 7;
                    }
                }

            }

        }
        if(tf.getPos() == 4 && playerSwitch == 1)
            {
            if(myAL.get(row5).getPieceColor() == Color.LIGHT_GRAY)
                {
                    myAL.get(row5).setPieceColor(Color.red);
                    playerSwitch++;

                }
            else if(myAL.get(row5).getPieceColor() != Color.LIGHT_GRAY)
            {
                if(myAL.get(row5).getPieceColor() == Color.yellow)
                {
                    while(myAL.get(row5).getPieceColor() == Color.yellow)
                    {
                     row5 = row5 - 7;
                    }
                }
                else{
                    if(row5 <= 4)
                    {
                        System.out.println("Pick another spot");
                    }else
                    {
                        row5 = row5 - 7;
                    }
                }

            }

        }
        if(tf.getPos() == 5 && playerSwitch == 1)
            {
            if(myAL.get(row6).getPieceColor() == Color.LIGHT_GRAY)
                {
                    myAL.get(row6).setPieceColor(Color.red);
                    playerSwitch++;

                }
            else if(myAL.get(row6).getPieceColor() != Color.LIGHT_GRAY)
            {
                if(myAL.get(row6).getPieceColor() == Color.yellow)
                {
                    while(myAL.get(row6).getPieceColor() == Color.yellow)
                    {
                     row6 = row6 - 7;
                    }
                }
                else{
                    if(row6 <= 5)
                    {
                        System.out.println("Pick another spot");
                    }else
                    {
                        row6 = row6 - 7;
                    }
                }

            }

        }
        if(tf.getPos() == 6 && playerSwitch == 1)
            {
            if(myAL.get(row7).getPieceColor() == Color.LIGHT_GRAY)
                {
                    myAL.get(row7).setPieceColor(Color.red);
                    playerSwitch++;
                }
            else if(myAL.get(row7).getPieceColor() != Color.LIGHT_GRAY)
            {
                if(myAL.get(row7).getPieceColor() == Color.yellow)
                {
                    while(myAL.get(row7).getPieceColor() == Color.yellow)
                    {
                     row7 = row7 - 7;
                    }
                }
                else{
                    if(row7 <= 6)
                    {
                        System.out.println("Pick another spot");
                    }else
                    {
                        row7 = row7 - 7;
                    }
                }

            }

        }
    }
    
    
    void AI()
    {
        //random is between 0-7
       int Random = RNG.nextInt(8);
        if(Random == 0)
        {
            Random = 1;
        }
            switch(Random)
            {
                //case 0-6 = row 1-7
                case 1:
                    if(playerSwitch == 2)
                        {
                            if(row1 <= 0)
                            {
                                AI();
                                break;
                            }
                            
                            if(myAL.get(row1).getPieceColor() == Color.LIGHT_GRAY && row1 >= 0) //try removing the row1 >= 0
                            {

                                    myAL.get(row1).setPieceColor(Color.yellow);
                                    row1 = row1 - 7;
                                    playerSwitch--;
                                    
                            }
                            else
                            {
                               AI();
                               break;
                            }
                        }
                    break;
                case 2:
                    if(playerSwitch == 2)
                        {
                            if(row2 <= 1)
                            {
                                AI();
                                break;
                            }
                            
                            if(myAL.get(row2).getPieceColor() == Color.LIGHT_GRAY && row2 >= 1)
                            {

                                    myAL.get(row2).setPieceColor(Color.yellow);
                                    row2 = row2 - 7;
                                    playerSwitch--;
                              
                            }
                            else
                            {
                                AI();
                                break;
                                
                            }
                        }
                    break;
                case 3:
                    if(playerSwitch == 2)
                        {
                                
                            if(row3 <= 2)
                            {
                                AI();
                                break;
                            }
                            
                            if(myAL.get(row3).getPieceColor() == Color.LIGHT_GRAY && row3 >= 2)
                            {
                                
                                    myAL.get(row3).setPieceColor(Color.yellow);
                                    row3 = row3 - 7;
                                    playerSwitch--;
                                
                            }
                            else
                            {
                               AI();
                               break;
                            }
                        }
                    break;
                case 4:
                    if(playerSwitch == 2)
                        {
                            if(row4 <= 3)
                            {
                                AI();
                                break;
                            }
                            
                            if(myAL.get(row4).getPieceColor() == Color.LIGHT_GRAY && row4 >= 3)
                            {

                                    myAL.get(row4).setPieceColor(Color.yellow);
                                    row4 = row4 - 7;
                                    playerSwitch--;
                              
                            }
                            else
                            {
                               AI();
                               break;
                            }
                        }
                    break;
                case 5:
                    if(playerSwitch == 2)
                        {
                            if(row5 <= 4)
                            {
                                AI();
                                break;
                            }
                            
                            if(myAL.get(row5).getPieceColor() == Color.LIGHT_GRAY && row5 >= 4)
                            {

                                    myAL.get(row5).setPieceColor(Color.yellow);
                                    row5 = row5 - 7;
                                    playerSwitch--;
                                
                            }
                            else
                            {
                               AI();
                               break;
                            }
                        }
                    break;
                case 6:
                    if(playerSwitch == 2)
                        {
                            if(row6 <= 5)
                            {
                                AI();
                                break;
                            }
                            
                            if(myAL.get(row6).getPieceColor() == Color.LIGHT_GRAY && row6 >= 5)
                            {

                                myAL.get(row6).setPieceColor(Color.yellow);
                                row6 = row6 - 7;
                                playerSwitch--;
                                
                            }
                            else
                            {
                               AI();
                               break;
                            }
                        }
                    break;
                case 7:
                    if(playerSwitch == 2)
                        {

                            if(row7 <= 6)
                            {
                                AI();
                                break;
                            }
                            
                            if(myAL.get(row7).getPieceColor() == Color.LIGHT_GRAY && row7 >= 6)
                            {

                                    myAL.get(row7).setPieceColor(Color.yellow);
                                    row7 = row7 - 7;
                                    playerSwitch--;
                                
                                
                            }
                            else
                            {
                               AI();
                               break;
                            }
                        }
                    break;
            }
       
    }
    
    void checkBounds()
    {
        if(row1 <= 0 && playerSwitch == 2)
        {
            if(row2 <= 1 && playerSwitch == 2)
            {
                if(row3 <= 2 && playerSwitch == 2)
                {
                    if(row4 <= 3 && playerSwitch == 2)
                    {
                        if(row5 <= 4 && playerSwitch == 2)
                        {
                            if(row6 <= 5 && playerSwitch == 2)
                            {
                                if(row7 <= 6 && playerSwitch == 2)
                                {
                                    System.out.println("ITS A TIE");
                                    playerSwitch = 0;
                                }
                            }
                            else if(row6 >= 1)
                            {
                                myAL.get(row6).setPieceColor(Color.yellow);
                                playerSwitch--;
                                row6 = row6 - 7;
                            }
                        }
                        else if(row5 >= 1)
                        {
                            myAL.get(row5).setPieceColor(Color.yellow);
                            playerSwitch--;
                            row5 = row5 - 7;
                        }
                    }
                    else if(row4 >= 1)
                    {
                        myAL.get(row4).setPieceColor(Color.yellow);
                        playerSwitch--;
                        row4 = row4 - 7;
                    }
                }
                else if(row3 >= 1)
                {
                    myAL.get(row3).setPieceColor(Color.yellow);
                    playerSwitch--;
                    row3 = row3 - 7;
                }
            }
            else if(row2 >= 1)
            {
                
                myAL.get(row2).setPieceColor(Color.yellow);
                playerSwitch--;
                row2 = row2 - 7;
                
            }
            
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setText("Wins:");

        jLabel3.setText("Loses:");

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        myTimer.stop();
        jPanel1.removeAll();
        myAL.clear();
        jLabel1.setText("");
        repaint();
        
        row1 = 35;
        row2 = 36;
        row3 = 37;
        row4 = 38;
        row5 = 39;
        row6 = 40;
        row7 = 41;
        
        playerSwitch = 1;
        
        createTextFields();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}


// EXTRA FOR LATER MAYBE
