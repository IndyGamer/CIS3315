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
public class Knight extends Chessman {

    public Knight(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "knight";
    }

    @Override
    public String getSymbol() {
        return color.equals("white") ? "h" : "H";
    }

//    @Override
//    public String getColor() {
//        return color;
//    }

    @Override
    public double getPoints() {
        return 3;
    }

}