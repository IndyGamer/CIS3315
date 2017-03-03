/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.chapter11;

import java.util.ArrayList;

/**
 *
 * @author joshu_000
 */
public class MyStack  extends ArrayList<Object> {


    public Object peek() {
        return get(size() - 1);
    }

    public Object pop() {
        Object o = get(size() - 1);
        remove(size() - 1);
        return o;
    }

    public void push(Object o) {
        add(o);
    }


    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}