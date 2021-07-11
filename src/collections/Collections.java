package collections;

import java.util.ArrayList;
import java.util.Comparator;

public class Collections {


    public static void main(String[] args) {
        ArrayList<Integer> col1 = new ArrayList<Integer>();
        col1.add(6);
        col1.add(4);
        col1.add(6);
        col1.add(8);
        col1.add(1);
        col1.add(100);
        col1.add(-100);

        ArrayList<Integer> col2 = new ArrayList<Integer>();
        col2.add(3);
        col2.add(8);
        col2.add(76554);
        col2.add(-42);
        col2.add(1);
        col2.add(100);
        col1.sort((Comparator.naturalOrder()));

        col1.retainAll(col2);


        System.out.println(col1);


    }

}
