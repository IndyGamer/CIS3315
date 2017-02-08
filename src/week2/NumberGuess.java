/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author joshu_000
 */
public class NumberGuess {

    public static void main(String[] args) {
        //int answer = 5;
        Random rand = new Random();
        int answer = rand.nextInt(1000) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("John's Guessing Game");
        System.out.println("Guess a number between 1 and 10");

        while (true) {
            System.out.print("Enter a number: ");
            int guess = sc.nextInt();
            if (guess == answer) {
                break;
            } else if (guess >= answer) {
                System.out.println("The number is lower, try again...");
            } else {
                System.out.println("The number is higher, try again...");
            }
        }
        System.out.println("You win!!!");
    }

}
