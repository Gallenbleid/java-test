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
    
    
    public Monster(){
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
        this.name = sname;
        this.pd = 100;
        this.speed = 30;
        this.power = 100;
        this.shield = 0.1;        
    }
    public void infoMonster(){
        System.out.println("Monster "+getName()+" Życie = "+getPD());
    }
    public void atack(Monster victim){        
        double cios = this.getPower()*victim.getShield();
        System.out.println("Zadano cios "+ cios + " PD.");
        victim.setPD(getPD()-cios);
    }
    public void atack(Skeleton victim){        
        double cios = this.getPower()*victim.getShield();
        victim.setPD(getPD()-cios);
    }
    public void atack(Zombie victim){        
        double cios = this.getPower()*victim.getShield();
        victim.setPD(getPD()-cios);
    }
    public void atack(Enderman victim){        
        double cios = this.getPower()*victim.getShield();
        victim.setPD(getPD()-cios);
    }
    public String toString(){
        return "Potwór - " + name;
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
}
