/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author joshu_000
 */
public abstract class Chessman {

    /**
     * A String that contains the color of the chessman.
     *
     */
    protected String color;

    public Chessman(String color) {
        this.color = color;
    }

    /**
     * Gets the name of the chessman.
     *
     * @return name
     */
    public abstract String getName();

    /**
     * Gets the symbol representation of the chessman.
     *
     * @return symbol
     */
    public abstract String getSymbol();

    /**
     * Gets the color of the chessman.
     *
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets the point value for this piece.
     *
     * @return points
     */
    public abstract double getPoints();

    /**
     * Returns a representation of the chessman object.
     *
     * @return symbol
     */
    @Override
    public String toString() {
        return getColor() + " " + getName() + " valued at " + getPoints() + " points";
    }
}
