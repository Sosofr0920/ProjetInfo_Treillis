/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.info2.projettreillis;

/**
 *
 * @author sophi
 */
public class Terrain {
   
    private double xmin;
    private double xmax;
    private double ymin;
    private double ymax;
    
    /**
     * Default constructor
     */
    public Terrain() {
    }
    
    public double getXmin(){
        return this.xmin;
    }

    public double getXmax(){
        return this.xmax;
    }
    
    public double getYmin(){
        return this.ymin;
    }
    
    public double getYmax(){
        return this.ymax;
    }
    
}