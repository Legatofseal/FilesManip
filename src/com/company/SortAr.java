package com.company;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Legat on 6/7/2016.
 */
public class SortAr implements Manipulation {


    @Override
    public ArrayList<String> manipulation(ArrayList<String> stringArrayList) {

        Collections.sort(stringArrayList);
        System.out.println("sorted");
        return stringArrayList;
    }
}
