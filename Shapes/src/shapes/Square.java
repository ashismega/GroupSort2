/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *Creates a square class.
 * Creates a square class using 4 points, also extends 
 * Rectangle
 * @author 073903999
 */
public class Square extends Rectangle {
    private Point p1;
    private Point p2;
 
    /**
     * creates a square using the rectangles constructor.
     * Creates a square class using the super rectangle constructor that has no arguments.
     */
    public Square () {
        super();
        
    }
    /**
     * Creates a square using the rectangles constructor.
     * Creates a square using the 4 different points of two parallel 
     * lines being either the width and width or the length and length
     * of the square. Checks if the points make a square and throws an 
     * if they do not.
     * @param p1   Point 1 for First parallel line
     * @param p2   Point 2 for First parallel line
     * @throws     An error if points do not make a square 
     */
    public Square(Point p1, Point p2) {
        super(p1,p2);
        
        
        // uses the fact that in a square, the diagonal line (Hypotenus) is x*Math.sqrt(2).
        // Checks by finding if they are equal using pythag theorem
        //if it isnt it throws an IllegalStateException
        if( Double.compare(p2.getX()-p1.getX(), p2.getY()-p1.getY()) == 0 ){
            
        }
        else{
            
            throw new IllegalStateException("Not a Square");
        }    
        
    }
    
}
