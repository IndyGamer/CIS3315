/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.chapter11;

import java.util.Scanner;

/**
 *
 * @author joshu_000
 */
public class C11N10 {

    public static void main(String[] args) {

        MyStack stack = new MyStack();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 strings... ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }

        System.out.println("Displaying them in reverse order.");
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
}
