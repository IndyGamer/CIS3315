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
public class King extends Chessman {

    public King(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "king";
    }

    @Override
    public String getSymbol() {
        return color.equals("white") ? "k" : "K";
    }

//    @Override
//    public String getColor() {
//        return color;
//    }

    @Override
    public double getPoints() {
        return 2;
    }

}
