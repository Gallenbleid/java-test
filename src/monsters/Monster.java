package monsters;


/**
 *
 * @author jimy
 */
public class Monster {
    protected int id = 0;
    protected String name = "";
    protected double pd;
    protected double speed;
    protected double power;
    protected double shield;
    protected int level;
    
    
    public Monster(){
        this.level = 1;
        this.name = "Potwór" + id;
        this.pd = 100;
        this.speed = 30;
        this.power = 100;
        this.shield = 0.1;
        
        
    }
    public Monster(int nr){
        this.name = "Monster " + nr;
    }
    public Monster(String sname){
        this.level = 1;
        this.name = sname;
        this.pd = 100;
        this.speed = 30;
        this.power = 100;
        this.shield = 0.1;        
    }
    public void infoMonster(){
        System.out.println("Monster "+getName()+" Życie = "+getPD() + " Level= " + getLevel());
    }
    public void atack(Monster victim){        
        double cios = this.getPower()*victim.getShield();
        //System.out.println("Atakujący : "+this.name + ", ofiara : " + victim.name);
        System.out.println("Zadano cios "+ cios + " PD.");
        victim.setPD(getPD()-cios);
    }    
    public double parade(Monster atacker){
       /** 
        * Method that minimalise the power of other monster atak      
        */
        double powerOfAtack = atacker.getPower()*0.5;
        return powerOfAtack;
    }
    public void fightOfTwo(){
        
    }
    public String toString(){
        return name;
    }
    public void badLook(){
        
    }
    
// ----------------------- getters - setters ---------------------- 
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.id++;
        this.name = name + id;
    }
    public double getID(){
        return id;
    }
    public double getPD(){
        return pd;
    }
    public void setPD(double pd){
        this.pd = pd;
    }
    public double getMoving(){
        return speed;
    }
    public void setMoving(double moving){
        this.speed = moving;
    }
    public double getPower(){
        return power;
    }
    public void setPower(double power){
        this.power = power;
    }
    public double getShield(){
        return shield;
    }
    public void setLevel(int actualLevel){
        this.level = actualLevel;
    }
    public int getLevel(){
        return level;
    }
}