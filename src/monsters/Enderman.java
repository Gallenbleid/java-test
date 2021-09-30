/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsters;

/**
 *
 * @author jimy
 * 
 */
public class Enderman extends Monster{
    
    public Enderman(){
        super();
        this.pd = 100;
        this.speed = 50;
        this.power = 90;
        this.shield = 0.6;
        this.level = 1;
    }
    public Enderman(int nr){
        super(nr);
        this.level = 1;
        this.name = "Enderman " + nr;
        this.pd = 100;
        this.speed = 50;
        this.power = 90;
        this.shield = 0.6;
        
    }
    public void badLook(){
        System.out.println("Ja patrzę na Cię, ja zły Enderman");
    }
}
