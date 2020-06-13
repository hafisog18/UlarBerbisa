import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dasar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dasar extends World
{

    /**
     * Constructor for objects of class Dasar.
     * 
     */
    public Dasar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ular ular = new Ular();
        addObject(ular,93,119);
        Kodok kodok = new Kodok();
        addObject(kodok,273,161);
        Kodok kodok2 = new Kodok();
        addObject(kodok2,390,256);
        Kodok kodok3 = new Kodok();
        addObject(kodok3,536,151);
        Kodok kodok4 = new Kodok();
        addObject(kodok4,603,262);
        Batu batu = new Batu();
        addObject(batu,378,177);
        Batu batu2 = new Batu();
        addObject(batu2,511,239);
        Batu batu3 = new Batu();
        addObject(batu3,199,195);
        batu3.setLocation(160,184);
        Batu batu4 = new Batu();
        addObject(batu4,316,248);
        batu4.setLocation(465,154);
    }
}
