/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

/**
 *
 * @author Bushra
 */
public class CohenSutherlandClipping extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        resize (500,500);
    }

    @Override
    public void paint(Graphics g) {
        int ymin=50;int xmin=50; int ymax=250; int xmax=250;
        g.drawRect(ymin, xmin, 200, 200);
        int x1=20,y1=200,x2=200,y2=20;
        g.drawLine(x1, y1, x2, y2);
        int a,b,c,d;
        int ab,bb,cb,db;
        int m1=(y2-y1)/(x2-x1);
        int m2=(y1-y2)/(x1-x2);
        
        int y11=y1+m1*(xmin-x1);
        int x11=x2+(1/m2)*(ymin-y2);
        
        
       if (y1-ymax<0)
       {
           a=0;
       }
       else
       {
           a=1;
       }
       //hhhhhh
       if (ymin-y1<0)
       {
           b=0;
       }
       else 
       {
           b=1;
       }
       //hhhhhh
       if (x1-xmax<0)
       {
           c=0;
       }
       else
       {
           c=1;
       }
       //hhhhhh
       if (xmin-x1<0)
       {
           d=0;
       }
       else 
       {
           d=1;
       }
       //fffffffffffffffffffffffffffff
       
       if (y2-ymax<0)
       {
           ab=0;
       }
       else 
       {
           ab=1;
       }
       //hhhhhh
       if (ymin-y2<0)
       {
           bb=0;
       }
       else 
       {
           bb=1;
       }
       //hhhhhh
       if (x2-xmax<0)
       {
           cb=0;
       }
       else 
       {
           cb=1;
       }
       //hhhhhh
       if (xmin-x2<0)
       {
           db=0;
       }
       else
       {
           db=1;
       }
        
        System.out.println(a); System.out.println(b);
        System.out.println(c); System.out.println(d);
        System.out.println(ab); System.out.println(bb);
        System.out.println(cb); System.out.println(db);
        
        if (a+ab==2 ||b+bb==2 ||c+cb==2 ||d+db==2)
    {
        System.out.println("Line Not inside the window");
    }
        else if (a+b+c+d+ab+bb+cb+db==0)
        {
            System.out.println("Line already inside the window");
           g.setColor(Color.red);
           g.drawLine(x1, y1, x2, y2); 
        }
    else
    {
        System.out.println("Line inside the window");
        g.setColor(Color.red);
        g.drawLine(xmin, y11, x11, ymin);
    }
    }
    
    
    
   
}