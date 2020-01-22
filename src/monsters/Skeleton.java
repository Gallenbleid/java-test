package monsters;

/**
 *
 * @author jimy
 */
public class Skeleton extends Monster{
    protected int id = 0;
    public Skeleton(){
        super();
    }
    public Skeleton(int nr){
        super(nr);
        this.name = "Szkieletor " + nr;
        this.pd = 80;
        this.speed = 80;
        this.power = 60;
        this.shield = 0.15;
    }
    public Skeleton(String name){
        super(name);        
        this.name = name;
        this.pd = 80;
        this.speed = 80;
        this.power = 60;
        this.shield = 0.15;
    }
}
