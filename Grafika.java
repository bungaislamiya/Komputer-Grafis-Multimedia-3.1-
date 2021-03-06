/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Grafika extends JFrame {
    
    private Shaping2d myShape = new Shaping2d();
    private Drawing2d myDrawing = new Drawing2d();
    private Gcanvas myGcanvas = new Gcanvas();
    
    public Grafika(){
        setBackground(Color.white);
        myDrawing.addShape(myShape);
        myGcanvas.setDrawing(myDrawing);
        myShape.addLine((float)50,(float)50,(float)50,(float)150);
        myShape.addLine((float)50,(float)100,(float)100,(float)100);
        myShape.addLine((float)100,(float)100,(float)100,(float)150);
        myShape.addLine((float)150,(float)150,(float)150,(float)100);
    }// constructor
    
    void thisWindowClosing(java.awt.event.WindowEvent e){
        //Close the window when the close box is clicked
        setVisible(false);
        dispose();
        System.exit(0);
    }//end - thisWindowClosing
    
    public void initComponents() throws Exception {
        setLocation(new java.awt.Point(0, 30));
        setSize(new java.awt.Dimension(650, 400));
        setTitle("Graphics Application");
        getContentPane().add(myGcanvas);
        
   addWindowListener(new java.awt.event.WindowAdapter(){
   public void windowClosing(java.awt.event.WindowEvent e){
       thisWindowClosing(e);
   }
   });
    }//end - initComponents
    
    
    static public void main(String[] args){
        // Main entry point
        try {
            Grafika myGapp = new Grafika();
            myGapp.initComponents();
            myGapp.setVisible(true);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//end main

}
