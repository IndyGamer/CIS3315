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
public class PetDog extends Pet {

    @Override
    public String speak() {
        return "Ruff Ruff";
    }
    
    @Override
    public String toString(){
        return "My name is " + getPetName() + " I am a dog";
    }
}
