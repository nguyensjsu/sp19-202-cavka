import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Subject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Subject extends Actor implements ISubject
{
    /**
     * Act - do whatever the Subject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static World world;
    SelectedTab selectedTab;
    Level lv;
    
    Subject()
    {
        world= MyWorld.getMyWorld();
        addObserver();
        lv = new LevelStrategy1();
        
    }
    
    public void act() 
    {
       
    }    
    
    public void notifyObserver(ISubject a)
    {
        System.out.println("In subject cause damage  : "+a);
        if(a instanceof Man)
        {
            selectedTab.setJonHealth(a.getHealth());
        }
         else if(a instanceof Wall)
        {
            selectedTab.setWallHealth(a.getHealth());
        }
        else if(a instanceof Man)
        {
            selectedTab.setNKHealth(a.getHealth());
        }
        
        
    }
    
    public void addObserver()
    {
        selectedTab = MyWorld.getSelectedTab();
    }
    
    public void die(ISubject s)
    {
        getWorld().removeObject((Subject)s);
    }
    
    public void levelUp(Level l){
        
    }
    
    public abstract void causeDamage(ISubject a);
    
    public abstract void HealthSet(int val);
    
    public abstract int getHealth();
    
    public abstract int getDamage();
    
    public abstract void setDamage(int val);
}

