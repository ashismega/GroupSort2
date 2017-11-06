/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 * A point Class.
 * Creates points by implementing the shape class
 * @author 073903999
 */
public class Point implements Shape{
    // two private variables to hold the x and y
    private double x;
    private double y;
    
    /**
     * Creates a point with no arguments.
     * Creates a point using no arguments
     * and a x and y initialized at 0
     */
    public Point(){
       this.x = 0;
       this.y = 0;
    }
    
    // second constructor taking 2 arguments
    // the x and the y
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * gets the y of a point.
     * gets the y of a 
     * point class.
     * returns the point as a 
     * double
     * @return      The Y of a point
     */
    public double getY() {
        return y;
    }
    
    /**
     * gets the y of a point.
     * gets the y of a 
     * point class.
     * returns the point as a 
     * double
     * @return      The x of  Point
     */
    public double getX() {
        return x;
    }
    
    /**
     * Sets the x of a point.
     * Sets the x of a point 
     * class using it as a 
     * parameter.
     * @param x     The x     
     */
    public void setX(double x) {
        this.x = x;
    }
    
    /**
     * Sets the y of a point.
     * Sets the y of a point 
     * class using it as a 
     * parameter.
     * @param y    The y     
     */
    public void setY(double y) {
        this.y = y;
    }
    
    /**
     *Adds two points together.
     * Adds two points together using their x 
     * and y.
     * @param o     The second point
     */
    void add(Point p){
        
        this.x = this.x + p.x;
        this.y = this.y + p.y;
        
    }
    
    
    /**
     * Find the distance from the origin.
     * Takes in an x and y and finds the distance
     * from the origin.
     * @param x     The x of the point
     * @param y     The y of the point
     * @return 
     */
    public double length(double x, double y){
        
        return Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));
        
    }
    
    /**
     * The distance between two points.
     * Takes in a point and finds the
     * distance using its own point.
     * Returns the distance of both
     * points as a double value.
     * @param p     The second point
     * @return      The distance
     */
    public Double distance(Point p){
        
        double x = Math.abs(this.x - p.x);
        double y = Math.abs(this.y - p.y);
        return(length(x,y));
    }
    
            
    @Override
    public void scale(double scaler) {
        this.x = this.x * scaler;
        this.y = this.y * scaler;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void rotate(double angle) {
        double x = 0;
        double y = 0;
        x = ( (this.x * Math.cos(angle)) - (this.y * Math.sin(angle)) );
        y = ( (this.x * Math.sin(angle)) + (this.y * Math.cos(angle)) );
        this.x = Math.round(x);
        this.y = Math.round(y);
    }

    @Override
    public void reflect(String axis) {
        axis = axis.toUpperCase();
        if(axis.equals("X")){
            this.y = ( this.y *-1) ;
        }
        else{
            this.x = (this.x *-1) ;
        }
    }

    @Override
    public void translate(double x, double y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }

    @Override
    public boolean equals(Object o) {
        
        if(o instanceof Point){
           Point p = (Point)o;
           
           return (p.x == this.x && p.y == this.y);
        }
        
        else{
            return(false);
        }
    }
    
    @Override
    public String toString(){
        return("(" + this.x + ", " + this.y + ")");
    }
 
    
}
