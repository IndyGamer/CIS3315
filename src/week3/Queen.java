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
public class Queen extends Chessman {

    public Queen(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "queen";
    }

    @Override
    public String getSymbol() {
        return color.equals("white") ? "q" : "Q";
    }

    @Override
    public double getPoints() {
        return 9;
    }

}