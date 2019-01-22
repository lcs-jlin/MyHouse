/**
 * Creates an instance of a Tree.
 *
 * @author Justy Lin
 * @version January 19, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Square lowerbase;
    private Square lowerbase2;
    private Square lowerbase3;
    private Circle leaves;
    private Circle leaves2;
    private Circle leaves3;
    private Circle leaves4;
    private Circle leaves5;
    
    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        lowerbase = new Square();
        lowerbase2 = new Square();
        lowerbase3 = new Square();
        leaves = new Circle();
        leaves2 = new Circle();
        leaves3 = new Circle();
        leaves4 = new Circle();
        leaves5 = new Circle();
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // put your code here
        lowerbase.makeVisible();
        lowerbase.changeColor("black");
        lowerbase.moveHorizontal(360);
        lowerbase.moveVertical(350);
        // move the base to the horizontal position specified
        lowerbase.moveHorizontal(x);
        lowerbase.moveVertical(y);
        
        lowerbase2.makeVisible();
        lowerbase2.changeColor("black");
        lowerbase2.moveHorizontal(360);
        lowerbase2.moveVertical(330);
        lowerbase2.moveHorizontal(x);
        lowerbase2.moveVertical(y);
        
        lowerbase3.makeVisible();
        lowerbase3.changeColor("black");
        lowerbase3.moveHorizontal(360);
        lowerbase3.moveVertical(300);
        lowerbase3.moveHorizontal(x);
        lowerbase3.moveVertical(y);
        
        
        leaves.makeVisible();
        leaves.changeColor("red");
        leaves.changeSize(80);
        leaves.moveHorizontal(345);
        leaves.moveVertical(190);
        leaves.moveHorizontal(x);
        leaves.moveVertical(y);
        
        leaves2.makeVisible();
        leaves2.changeColor("red");
        leaves2.changeSize(80);
        leaves2.moveHorizontal(410);
        leaves2.moveVertical(190);
        leaves2.moveHorizontal(x);
        leaves2.moveVertical(y);
        
        leaves3.makeVisible();
        leaves3.changeColor("red");
        leaves3.changeSize(80);
        leaves3.moveHorizontal(375);
        leaves3.moveVertical(170);
        leaves3.moveHorizontal(x);
        leaves3.moveVertical(y);
        
        leaves4.makeVisible();
        leaves4.changeColor("red");
        leaves4.changeSize(80);
        leaves4.moveHorizontal(405);
        leaves4.moveVertical(220);
        leaves4.moveHorizontal(x);
        leaves4.moveVertical(y);
        
        leaves5.makeVisible();
        leaves5.changeColor("red");
        leaves5.changeSize(80);
        leaves5.moveHorizontal(355);
        leaves5.moveVertical(220);
        leaves5.moveHorizontal(x);
        leaves5.moveVertical(y);
        
        // translate the tree to the specified location
        
        
    }
    
}