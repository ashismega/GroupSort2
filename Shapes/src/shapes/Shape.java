/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 * A shape interface.
 * Used as the base to create the shapes of the program.
 * @author 073903999
 */
public interface Shape {

    /**
     *Scales a shape, line, or point by a argument.
     * Scales a shape, line, or point by an inputed 
     * multiplier.
     * @param scaler    The double to multiply by
     */
    public abstract void scale(double scaler);

    /**
     *Creates a string from a shape, line, or point.
     * Creates and returns shape, line, or a point as 
     * a string.
     * @return      The shape, line, or point as a String
     */
    @Override
    public abstract String toString();

    /**
     *Finding the area of a shape.
     * Finds the area of a shape and returns it
     * as a double.
     * @return      The area of the shape
     */
    public abstract double area();

    /**
     *Rotates a shape, line, or point by an argument in radians.
     * Rotates a shape, line or point by a given radian.
     * @param angle     The radian to rotate by
     */
    public abstract void rotate(double angle);

    /**
     *Reflects a shape, line, or point based on a axis.
     * Reflects a shape, line, or point based on the
     * axis, x or y, given.
     * @param axis      The axis, being x or y
     */
    public abstract void reflect(String axis);

    /**
     *Translates a shape, line, or point by a given
     * x and y.
     * Translates a shape, line, or point by a given 
     * x and y double value.
     * @param x     The x to translate by
     * @param y     The y to translate by
     */
    public abstract void translate(double x, double y);

    /**
     *Checks if a shape, line, or point is equal
     *to a given object.
     * Checks if a shape, line, or point is equal
     * to a given object and returns true or
     * false.
     * @param o     The object to compare
     * @return      True or false if equal
     */
    @Override
    public abstract boolean equals(Object o);
}
