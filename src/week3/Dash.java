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
public class Dash extends Chessman {

    public Dash(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "dash";
    }

    @Override
    public String getSymbol() {
        return color.equals("white") ? "-" : "-";
    }

    @Override
    public double getPoints() {
        return 0;
    }

}
