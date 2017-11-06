/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *Creates a line class.
 * Creates a line class using 2 point classes
 * and also implements shape.
 * @author 073903999
 */
public class Line implements Shape{
    //creates two private points
    private Point p1;
    private Point p2;
    
    /**
     * Create a line using no arguments.
     * Creates a line that has the points
     * (0, 0) and (1,1).
     */
    public Line(){
        this.p1.setX(0);
        this.p1.setY(0);
        
        this.p2.setX(1);
        this.p2.setY(1);
    }
    
    
    /**
     * Create a line using two point arguments.
     * Creates a line that has the points 
     * passed into the function.
     * @param p1    The first point
     * @param p2    The second point
     */
     
    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;          
    }
    
    /**
     * Sets a point using an inputted point.
     * Sets a point using the passed 
     * point class argument.
     * @param p1    The point
     */
    public void setP1(Point p1) {
        this.p1 = p1;
    }
    
    /**
     * Sets a point using an inputted point.
     * Sets a point using the passed 
     * point class argument.
     * @param p2    The point
     */
    public void setP2(Point p2) {
        this.p2 = p2;
    }
    /**
     * Gets a point.
     * Gets a point and returns 
     * it as a point.
     * @return      The point
     */
    public Point getP1() {
        return p1;
    }
    
    /**
     * Gets a point.
     * Gets a point and returns 
     * it as a point.
     * @return      The point
     */
    public Point getP2() {
        return p2;
    }

    
    @Override
    public void scale(double scaler) {
        this.p1.scale(scaler);  
        this.p1.scale(scaler);
        
    }

    @Override
    public double area() {
       return 0;
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
        if(o instanceof Line){
            Line l = (Line)o;
            
            return(  l.p1.equals(this.p1) && l.p2.equals(this.p2) );
        }
        return(false);
    }
    
    @Override
    public String toString(){
        return("Point 1: " + this.p1.toString() + "\nPoint 2: " + this.p2.toString());
    }
}
