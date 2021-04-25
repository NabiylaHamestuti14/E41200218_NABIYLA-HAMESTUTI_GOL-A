/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_1;

import java.awt.*;
import java.applet.*;

/**
 *
 * @author Nabiyla Hamestuti
 */
public class DrawShapes extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    public void init() {
        //set font dan ukuran font
        font = new Font("Arial",Font.ITALIC,18);
        //set warna
        redColor = Color.red;
        backgroundColor = Color.orange;
        blueColor = new Color(0,0,122);
        //set warna background
        setBackground(backgroundColor);
    }
    public void stop() {
    }
    public void paint(Graphics graph){
        //mencetak teks dengan font arial, italic
        graph.setFont(font);
        //membuat judul 
        graph.drawString("Draw Shapes",90,20);
        //membuat shape dengan warna biru
        graph.setColor(blueColor);
        graph.drawRect(120,120,120,120);
        graph.fillRect(115,115,90,90);
        //membuat shape dengan warna merah
        graph.setColor(redColor);
        graph.fillArc(110,110,50,50,0,360);
        //membuat shape dengan warna cyan
        graph.setColor(Color.CYAN);
        graph.drawRect(50,50,50,50);
        graph.fillRect(50,50,60,60);
    }
}

