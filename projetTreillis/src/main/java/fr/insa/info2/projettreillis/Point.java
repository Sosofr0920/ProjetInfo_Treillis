/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.info2.projettreillis;

import java.util.ArrayList;

/**
 *
 * @author sophi
 */
public class Point {
    
    
    private ArrayList<Double> point;
    
     
     public Point(double px, double py) {
        this.point = new ArrayList<Double>();
        this.point.add(px);
        this.point.add(py);
    }
    
     public Point() {
        this(0.0, 0.0);
    }
    
     public String toString() {
        return "" + this.point + "";
    }
}
