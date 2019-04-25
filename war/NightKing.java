import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NightKing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NightKing extends Subject
{
    /**
     * Act - do whatever the NightKing wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img;
    boolean selected;
    private int X;
    private int Y;
    private int time;
    private int spawnTimer;
    public NightKing()
    {
        img= new GreenfootImage("Night_king1.gif");
        img.scale(50,50);
        setImage(img);
        selected = false;
        spawnTimer=0;
        time=300;// for 5 seconds
    }
    
     public void act() 
    {
        spawnTimer++;
        X=getX();
        Y=getY();
        int r= random();
        if(spawnTimer%time == 0)
        {
            if(r%2==0)
            getWorld().addObject(new Undead(), X+30, Y);
            else
            getWorld().addObject(new Undead(),X-30,Y);
        }
        
    }
    
    public void castleSelected()
    {
        if(!selected)
        {
        selected = true;
        selected(this);
        }
        else
        {
            selected = false;
        }
    }  
    
   public void setSelectedState(boolean s)
    {
        this.selected = s;
    }
    public int random()
    {
        int deltaX=Greenfoot.getRandomNumber(100);
        return deltaX;
    }
  
}