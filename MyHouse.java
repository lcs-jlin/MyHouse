 
/**
 * Creates an image of a house
 *
 * @author Justy Lin
 * @version Jan 14 2019
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    // ACCESS_MODIFIER TYPE NAME
    private Square base;
    private Square base2;
    private Triangle roof;
    private Triangle roof2;
    private Square roof3;
    private Square chimny;
    private Circle sun;
    private Square door;
    private Circle window;
    private Square ground;
    private Triangle grass;
    private Triangle grass2;
    private Triangle grass3;
    private Square sky;
    
    

    /**
     * Constructor for objects of class MyHouse
     */
    public MyHouse()
    {
        // initialise instance variables
        base = new Square();
        base2 = new Square();
        roof = new Triangle();
        roof2 = new Triangle();
        roof3 = new Square();
        sun = new Circle();
        window = new Circle();
        door = new Square();
        ground = new Square();
        grass = new Triangle();
        grass2 = new Triangle();
        grass3 = new Triangle();
        sky = new Square();
        chimny = new Square();
        
        
    }

    /**
     * Drwas the house 
     */
    public void drawhouse()
    {
        // put your code here
        
        // Set up the sky (Ctrl + Space)
        sky.makeVisible();
        sky.changeColor("yellow");
        sky.changeSize(700);
        sky.moveUp();
        sky.moveUp();
        sky.moveUp();
        sky.moveLeft();
        sky.moveLeft();
        sky.moveLeft();
        
        
        // Set up the ground (Ctrl + Space)
        ground.makeVisible();
        ground.changeColor("green");
        ground.changeSize(800);
        ground.moveLeft();
        ground.moveLeft();
        ground.moveLeft();
        ground.moveDown();
        ground.moveDown();
        ground.moveDown();
        ground.moveDown();
        ground.moveDown();
        ground.moveDown();
        ground.moveDown();
        ground.moveDown();
        ground.moveDown();
        ground.moveDown();
        ground.moveDown();
        ground.moveDown();
        ground.moveDown();
        ground.moveDown();
        ground.moveDown();
        ground.moveDown();
        ground.moveDown();
        ground.moveDown();
        
        
        
        // Set up the base (Ctrl + Space)
        base.makeVisible();
        base.changeColor("black");
        base.changeSize(150);
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveDown();
        
        // Set up the base2 (Ctrl + Space)
        base2.makeVisible();
        base2.changeColor("black");
        base2.changeSize(150);
        base2.moveRight();
        base2.moveRight();
        base2.moveRight();
        base2.moveRight();
        base2.moveDown();
        base2.moveDown();
        base2.moveDown();
        base2.moveDown();
        base2.moveDown();
        base2.moveDown();
        base2.moveDown();
        base2.moveDown();
        base2.moveDown();
        base2.moveDown();
        base2.moveDown();
        base2.moveDown();
        
        
        // Set up the sun (Ctrl + Space)
        sun.makeVisible();
        sun.changeSize(200);
        sun.changeColor("white");
        sun.changeSize(70);
        sun.moveUp();
        
        
        // Set up the roof (Ctrl + Space)
        roof.makeVisible();
        roof.changeColor("red");
        roof.changeSize(100, 200);
        roof.moveDown();
        roof.moveRight();
        roof.moveRight();
        roof.moveRight();
        roof.moveRight();
        roof.moveDown();
        roof.moveDown();
        roof.moveDown();
        roof.moveDown();
        roof.moveDown();
        roof.moveDown();
        roof.moveDown();
        roof.moveDown();
        
        // Set up the roof2 (Ctrl + Space)
        roof2.makeVisible();
        roof2.changeColor("red");
        roof2.changeSize(100, 200);
        roof2.moveDown();
        roof2.moveRight();
        roof2.moveRight();
        roof2.moveRight();
        roof2.moveRight();
        roof2.moveRight();
        roof2.moveRight();
        roof2.moveRight();
        roof2.moveRight();
        
        
        roof2.moveDown();
        roof2.moveDown();
        roof2.moveDown();
        roof2.moveDown();
        roof2.moveDown();
        roof2.moveDown();
        roof2.moveDown();
        roof2.moveDown();
        
        
        
        
        // Set up the door (Ctrl + Space)
        door.makeVisible();
        door.changeColor("blue");
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
        window.changeColor("green");
        window.changeSize(50);
        window.moveDown();
        window.moveDown();
        window.moveDown();
        window.moveDown();
        window.moveDown();
        window.moveDown();
        window.moveDown();
        window.moveDown();
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
        
        
        // Set up the grass (Ctrl + Space)
        grass.makeVisible();
        grass2.makeVisible();
        grass3.makeVisible();
        grass.changeColor("blue");
        grass2.changeColor("blue");
        grass3.changeColor("blue");
        grass.changeSize(20, 20);
        grass2.changeSize(20, 20);
        grass3.changeSize(20, 20);
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass2.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass3.moveDown();
        grass2.moveLeft();
        grass3.moveLeft();
        grass3.moveLeft();
        
        
    }
}
