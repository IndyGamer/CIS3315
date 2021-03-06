/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.chapter12;

import java.util.Scanner;

/**
 *
 * @author joshu_000
 */
public class C12N8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = sc.nextLine();
        try {
            System.out.println("The decimal value is " + hexToDecimal(hex.toUpperCase()));
        } catch (HexFormatException e) {
            e.printStackTrace();
        }
    }

    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);

        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) throws HexFormatException {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else if (ch >= '0' && ch <= '9') {
            return ch - '0';
        } else {
            throw new HexFormatException();
        }
    }
}

class HexFormatException extends Exception {

    public HexFormatException() {
        super("Invalid hex number");
    }
}
