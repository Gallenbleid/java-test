package monsters;

/**
 *
 * @author jimy
 */
public class Zombie extends Monster{
    
    public Zombie(){
        super();
        this.pd = 80;
        this.speed = 30;
        this.power = 50;
        this.shield = 0.3;
        this.level = 1;
    }
    public Zombie(int nr){
        super(nr);
        this.level = 1;
        this.name = "Zombi " + nr;
        this.pd = 80;
        this.speed = 30;
        this.power = 50;
        this.shield = 0.3;
        
    }
}
