/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsters;

import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author jimy
 */
public class MonsterGenerator {
    
    public static ArrayList getMonsters(int monstersNumber, ArrayList<Monster> ml){
        Random r = new Random();        
                
        for (int i =0; i < monstersNumber; i++){
            
            switch(r.nextInt(3)){
            case 0:
                ml.add(new Skeleton(i+1));
                break;
            case 1:
                ml.add(new Zombie(i+1));
                break;
            case 2:
                ml.add(new Enderman(i+1));
                break;
            }
        }
        return ml;
    }
    
    public static void printAllMonsters(ArrayList<Monster> al){
        for (Monster m : al){
            m.infoMonster();            
        }
    }

    
}
