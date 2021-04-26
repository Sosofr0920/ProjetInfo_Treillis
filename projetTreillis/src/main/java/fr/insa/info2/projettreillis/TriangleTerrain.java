/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.info2.projettreillis;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author sophi
 */
public class TriangleTerrain {
    
    private int id;

    private List<Point> position;
    private List <Point> segment1;
    private List <Point> segment2;
    private List <Point> segment3;
    // public Set<NoeudAppui> contient;
    
    
    public TriangleTerrain(Point p1, Point p2, Point p3) {
         
         this.id = id;
         this.position = new ArrayList<Point>();
         this.position.add(p1);
         this.position.add(p2);
         this.position.add(p3);
         this.segment1 = new ArrayList<Point>();
         this.segment1.add(p2);
         this.segment1.add(p3);
         this.segment2 = new ArrayList<Point>();
         this.segment2.add(p1);
         this.segment2.add(p2);
         this.segment3 = new ArrayList<Point>();
         this.segment3.add(p3);
         this.segment3.add(p1);
        
    } 

    public String toString(){
    
        return "TriangleTerrain" + this.id + " : " + this.position + "\n" + 
                "Segment"+this.id+ ",1 : " + this.segment1 + "\n"  + 
                "Segment"+this.id+ ",2 : " + this.segment2 + "\n"  + 
                "Segment"+this.id+ ",3 : " + this.segment3;
    }
    
    
    
    public static void main(String[] args) {
       
        
        TriangleTerrain TT;
        Point p1 = new Point(0.0,1.0);
        Point p2 = new Point(5.0,1.0);
        Point p3 = new Point(1.5,4.0);
        TT = new TriangleTerrain(p1,p2,p3);
        
        TriangleTerrain Tt;
        Point p4 = new Point(6.0,1.0);
        Point p5 = new Point(10.0,1.0);
        Point p6 = new Point(8.0,4.0);
        Tt = new TriangleTerrain(p1,p2,p3);
        
        System.out.println("TT1 :" + TT);
        System.out.println("TT2 :" + Tt);
    }

}

/* public int getId(){
        int nouveauId = id;
        id++;
        return nouveauId;
    }
*/