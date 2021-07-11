package com.company;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<Integer>(Arrays.asList(new Integer[]{6, 4, 6, 8, 1, 100, -100}));

        Set<Integer> b = new TreeSet<Integer>(Arrays.asList(new Integer[]{3, 8, 76544, -42, 100, 1}));

        Set<Integer> c = new TreeSet<Integer>(a);

        c.addAll(b);

        System.out.println(c);

        Set<Integer> d = new TreeSet<Integer>(a);
        d.retainAll(b);

        System.out.println(d);
    }
}
