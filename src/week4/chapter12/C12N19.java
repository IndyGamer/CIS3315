/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.chapter12;

import java.util.Scanner;

/**
 *
 * @author 55allenjn05
 */
public class C12N19 {

    public static void main(String[] args) {
        try {

            java.net.URL url = new java.net.URL(
                    "http://cs.armstrong.edu/liang/data/Lincoln.txt");

            int count = 0;

            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {

                if (Character.isLetter((input.next()).charAt(0))) {
                    count++;
                }
            }

            System.out.println(
                    "Number of words in President Abraham Lincoln's Gettysburg address: "
                    + count);
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (java.io.IOException ex) {
            System.out.println("I/0 Errors: no such file");
        }
    }
}
