import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World implements IGameState
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    private int counter=0; 
    private GifImage gif;
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        gif= new GifImage("startup.gif");
     }

    public void act()
    {
        animate();
        counter++;
        if (counter%200 == 0) 
        Default.sm.changeState(States.GAME);
    }

    public void animate()
    {
        setBackground(gif.getCurrentImage());
        if(counter>=195)
            showText("Winter is here...",500,390);
        else
            showText("Winter is coming...",500,390);
    }

}
