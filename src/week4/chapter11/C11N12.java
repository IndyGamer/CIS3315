/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joshu_000
 */
public class C11N12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        System.out.println("***************");
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            list.add(input.nextDouble());
        }

        System.out.println("The sum of the 5 numbers = " + sum(list));

    }

    private static double sum(ArrayList<Double> list) {

        double sum = 0;
        for (double i : list) {
            sum += i;
        }
        return sum;
    }

}
