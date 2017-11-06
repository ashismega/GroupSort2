/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;
/*
    CHANGE LOG

    Has to change to fit along with the new Rectangle class.
*/
/**
 * Creates a circle class.
 * Creates a circle class using a point class
 * and a double to represent the center and the radius.
 * @author Asad Ali
 */
public class Circle implements Shape{
    //A private point class to represent center of the circle
    //And a private double to represent the radius
    private Point cent;
    private double r;
    
    public Circle(){
        this.cent.setX(0);
        this.cent.setY(0);
        this.r = 5;
    }
    
    public Circle(Point cent, double r){
        this.cent = cent;
        this.r = r;
    }
    
    /**
     * gets the center point.
     * Gets the center point and returns it as a
     * a point class
     * @return      returns the center point
     */
    public Point getCent() {
        return cent;
    }
    /**
     * gets the radius.
     * gets the radius and returns its as 
     * a double
     * @return 
     */
    public double getR() {
        return r;
    }
    /**
     * sets the center point.
     * sets the center point using a point class 
     * variable passed into the function.
     * 
     * @param cent      The center point
     */
    public void setCent(Point cent) {
        this.cent = cent;
    }

    /**
     * sets the radius.
     * Sets the radius using a double variable
     * passed into the function
     * @param r 
     */
    public void setR(double r) {
        this.r = r;
    }
    @Override
    public void scale(double scaler) {
        this.r = this.r *scaler;
    }
    
    @Override
    public double area() {
      return(Math.pow(this.r, 2 ) * Math.PI);
    }

    @Override
    public void rotate(double angle) {
        
        this.cent.rotate(angle);
    }

    @Override
    public void reflect(String axis) {
        this.cent.reflect(axis);
    }

    @Override
    public void translate(double x, double y) {
        this.cent.translate(x, y);
    }
    
    @Override
    public boolean equals(Object o) {
        
        if(o instanceof Circle){
           Circle c = (Circle)o;
           
           return ( c.cent == this.cent && c.r == this.r);
        }
        
        else{
            return(false);
        }
    }
    
    @Override
    public String toString(){
        
        return ("(x - " + this.cent.getX() + ")^2 + (y - " + this.cent.getY() + ")^2 = " + this.r  + "^2" );
    }
    
}
