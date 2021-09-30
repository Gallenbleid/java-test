/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

//import com.sun.javafx.scene.layout.region.Margins;
//import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;
//import com.sun.xml.internal.ws.commons.xmlutil.Converter;
import java.util.ArrayList;
import monsters.Monster;
import monsters.MonsterGenerator;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.KeyEvent;
import java.util.stream.IntStream;
        
/**
 *
 * @author jimy
 */
public class JavaApplication1 {
    
    static ArrayList<Monster> monsterList = new ArrayList<>();
    static Random rd = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        
        Scanner kscan = new Scanner(System.in);
        Boolean wybor = true;
        Monster agresor, victim;
        
        
        MonsterGenerator.getMonsters(5, monsterList);
        System.out.println("-------------Zaczynamy igrzyska śmierci---------");
        String klawisz = "t";        
        do{                        
            if (klawisz.equals("t")) {
                agresor = JavaApplication1.getAgresor();
                victim = JavaApplication1.getVictim();
                System.out.println("Przygotowanie do walki");
                System.out.println(".....");
                //System.out.println("Wybrano Agresora: "+agresor);
                //System.out.println("Poziom agresora: " + agresor.getLevel());
                //System.out.println("Wybrano Ofiarę: "+victim);
                if (victim != agresor){                    
                    JavaApplication1.walka(agresor, victim);
                }else            
                    System.out.println("Nie walczę ze sobą");
                    //MonsterGenerator.printAllMonsters(monsterList);
                //
            }
            else {
                wybor =false;
                System.out.println("Po walkach.");
                break;
            }
            System.out.println("Kolejna walka?");
            klawisz = kscan.next();
        }while(wybor);
        
    } 
    public static Monster getAgresor(){
        Monster a = monsterList.get(rd.nextInt(monsterList.size()));
        System.out.print("Wybrano Atakującego : " + a.getName() + " --> ");
        return a;
    }
    public static Monster getVictim(){
        Monster v = monsterList.get(rd.nextInt(monsterList.size()));
        System.out.println("Wybrano Ofiarę : " + v.getName());
        return v;
    }
    public static void walka(Monster agresor, Monster victim) {        
        agresor.badLook();
        agresor.atack(victim);
        double vPd = victim.getPD();
        int aLevel = agresor.getLevel();
        System.out.println("Stan ofiary " + vPd);
        if (vPd <= 0){
            System.out.println(victim.getName() + " zdechł!");
            monsterList.remove(victim);            
            aLevel++;
            agresor.setLevel(aLevel);
            System.out.println(agresor.getLevel());
        }
        System.out.println("-------------Stan potworów po walce.-------------");
        MonsterGenerator.printAllMonsters(monsterList);
    }
    
}
