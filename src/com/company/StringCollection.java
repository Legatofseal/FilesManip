package com.company;

import java.util.*;

/**
 * Created by Legat on 6/5/2016.
 */
public class StringCollection {


    public void setArrayListToFile() {

    }

    public ArrayList<String> sortString(ArrayList<String> input) {
        System.out.println("sorted");
        Collections.sort(input);
        return input;
    }



    public ArrayList<String> reverseString(ArrayList<String> input) {
        Collections.reverse(input);
        System.out.println("reversed");
        return input;

    }

    public ArrayList<String> shuffleString(ArrayList<String> input) {
        Collections.shuffle(input);
        System.out.println("shuffled");
        return input;
    }
}
