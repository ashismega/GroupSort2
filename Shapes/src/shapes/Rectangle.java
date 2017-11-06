/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
    CHANGE LOG

    The rectangle class was changed to fit two points. 
    This made changes to the contructer and the area method.
    Made this change because paint component does not handle squares
    that are rotated when inputted. Made parts of my code useless so 
    it was changed.
*/

package 
    shapes;

/**
 *Creates a rectangle using 4 point classes, and also
 * implements the shape class
 * @author 073903999
 */
public class Rectangle implements Shape{
    //4 private Point classes to represent the rectangle vertices
    private Point p1;
    private Point p2;

 
    //2 private doubles to represent the length and width
   
    
    /**
     * Creates a rectangle using no arguments.
     * Creates a rectangle using no arguments,
     * and is initialized at the points
     * (0, 0),  (0, 1), (1, 0), (1, 1).
     */
    public Rectangle(){
        // technically a square but all squares are technically rectangles, so its okay
        this.p1.setX(0);
        this.p1.setY(0);
        
        this.p2.setX(0);
        this.p2.setY(1);
        
    }

   
    
     /**
     *Creates a Rectangle using the 4 Points of two parallel lines.
     * Creates a Rectangle using the 4 different points of two parallel 
     * lines being either the width and width or the length and length
     * of the Rectangle.
     * @param length1   Point 1 for First parallel line
     * @param length2   Point 2 for First parallel line
     */
    public Rectangle(Point length1, Point length2){
        // sets the 4 points and then checks to see which would make a line for length and width
        this.p1 = length1;
        this.p2 = length2;
        
        
        
    }
    
  
    
    private void checkTest(){
        
    }
    
    @Override
    public void scale(double scaler) {
        this.p1.scale(scaler);
        this.p2.scale(scaler);
       
       
    }
    
    
    @Override
    public double area() {
        
        return( p2.getX()-p1.getX() *  p2.getX()-p1.getY());
    }

    

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

   

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    
    
    @Override
    public void rotate(double angle) {
        this.p1.rotate(angle);
        this.p2.rotate(angle);
        
    }

    @Override
    public void reflect(String axis) {
       this.p1.reflect(axis);
       this.p2.reflect(axis);
       
    }

    @Override
    public void translate(double x, double y) {
       this.p1.translate(x, y);
       this.p2.translate(x, y);
       
    }
     
    @Override
    public boolean equals(Object o) {
        if(o instanceof Rectangle){
            Rectangle r = (Rectangle)o;
            if( r.p1.equals(this.p1) && r.p2.equals(this.p2)){
                return(true);
            }
            return(false);
        }
        return(false);
    }
    
    @Override
    public String toString(){
        return("Point 1: \n" + this.p1.toString() + "\nPoint 2: \n" + this.p2.toString());
    }
    
}
