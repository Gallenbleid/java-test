/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.sun.javafx.scene.layout.region.Margins;
import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;
import com.sun.xml.internal.ws.commons.xmlutil.Converter;
import java.util.ArrayList;
import java.util.Random;
import monsters.Monster;
import monsters.Skeleton;
import monsters.Zombie;
import monsters.Enderman;
import monsters.MonsterGenerator;
        
/**
 *
 * @author jimy
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        ArrayList<Monster> monsterList = new ArrayList<>();
        MonsterGenerator.getMonsters(5, monsterList);
        MonsterGenerator.printAllMonsters(monsterList);        
        monsterList.get(0).atack(monsterList.get(1));
        MonsterGenerator.printAllMonsters(monsterList);
    }    
    
}
