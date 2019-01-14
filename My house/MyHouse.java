 
/**
 * Creates an image of a house
 *
 * @author Justy Lin
 * @version Jan 11 2019
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    // ACCESS_MODIFIER TYPE NAME
    private Square base;
    private Triangle roof;
    private Circle sun;
    private Square door;
    private Circle window;
    
    

    /**
     * Constructor for objects of class MyHouse
     */
    public MyHouse()
    {
        // initialise instance variables
        base = new Square();
        roof = new Triangle();
        sun = new Circle();
        window = new Circle();
        door = new Square();
        
    }

    /**
     * Drwas the house 
     */
    public void drawhouse()
    {
        // put your code here
        // Set up the base (Ctrl + Space)
        base.makeVisible();
        base.changeColor("black");
        base.changeSize(150);
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveDown();
        // Set up the sun (Ctrl + Space)
        sun.makeVisible();
        sun.changeColor("yellow");
        sun.changeSize(70);
        sun.moveUp();
        sun.moveUp();
        sun.moveUp();
        // Set up the roof (Ctrl + Space)
        roof.makeVisible();
        roof.changeSize(100, 200);
        roof.moveDown();
        roof.moveRight();
        roof.moveRight();
        roof.moveRight();
        roof.moveRight();
        
        // Set up the door (Ctrl + Space)
        door.makeVisible();
        door.changeSize(50);
        door.moveRight();
        door.moveRight();
        door.moveDown();
        door.moveDown();
        door.moveDown();
        door.moveDown();
        door.moveDown();
        door.moveDown();
        door.moveDown();
        door.moveDown();
        door.moveDown();
        
        // Set up the window (Ctrl + Space)
        window.makeVisible();
        window.changeColor("blue");
        window.changeSize(50);
        window.moveDown();
        window.moveDown();
        window.moveDown();
        window.moveDown();
        window.moveRight();
        window.moveRight();
        window.moveRight();
        window.moveRight();
        window.moveRight();
        window.moveRight();
        
        
        
    }
}
