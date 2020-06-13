import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Batu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Batu extends Actor
{
    /**
     * Act - do whatever the Batu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Mati();
    }    
    
    public void Mati() {
        if (isTouching(Ular.class)){
            removeTouching(Ular.class);
            World myWorld = getWorld();
            GameOver go = new GameOver();
            myWorld.addObject(go, myWorld.getWidth()/2, myWorld.getHeight()/2);
        }
    }
}
