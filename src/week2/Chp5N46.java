package week2;

import java.util.Scanner;

/**
 *
 * @author joshu_000
 */
public class Chp5N46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println("");
    }
}
