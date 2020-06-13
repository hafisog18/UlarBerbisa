import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ular extends Actor
{
    /**
     * Act - do whatever the Ular wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int belok = 0;
    public void act() 
    {
        KontrolKeyboard();
        Makan();
    }    
    
    public void KontrolKeyboard() {
        if (Greenfoot.isKeyDown("W")){
            move(1);
    }
    if (Greenfoot.isKeyDown("S")){
            move(-1);
    }
    if (Greenfoot.isKeyDown("down")){
            belok +=2;
            setRotation(belok);
    }
    if (Greenfoot.isKeyDown("up")){
        belok -=2;
        setRotation(belok);
    }
    }
    
    public void Makan() {
     if (isTouching(Kodok.class)){
            removeTouching (Kodok.class);
            Greenfoot.playSound("eat.wav");
        }
    }
}
