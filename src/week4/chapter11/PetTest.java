/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.chapter11;

/**
 *
 * @author joshu_000
 */
public class PetTest {
    public static void main(String[] args) {
        Pet pc1 = new PetCat();
        pc1.setPetName("Mittens");
        Pet pd1 = new PetDog();
        pd1.setPetName("Fido");
        System.out.println(pc1.speak());
        System.out.println(pd1.speak());
        System.out.println(pc1);
        System.out.println(pd1);
    }
}