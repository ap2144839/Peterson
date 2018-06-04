package com.peterson.util;

import com.peterson.collection.WorkWithArrayList;

import java.util.ArrayList;

//import static com.peterson.collection.WorkWithArrayList.*;


/**
 * Created by user on 23.05.2018.
 */
public class Util {
    public static void main(String args[]){

        //CREATING ARRAYLIST EXPERIMENT---------------------------------------------------------------------------------
        //Total time of ArrayList creation consisting of 100 elements
        int i = 100;
        long startTime = System.currentTimeMillis();
        WorkWithArrayList workwitharraylist2 = new WorkWithArrayList();
        ArrayList list = workwitharraylist2.fillList(i);
        long stopTime = System.currentTimeMillis();
        System.out.println("Total time of ArrayList creation: " + (stopTime - startTime) + " milliseconds for " + i + " elements");

        //Total time of ArrayList creation consisting of 1000 elements
        i = 1000;
        startTime = System.currentTimeMillis();
        WorkWithArrayList workwitharraylist3 = new WorkWithArrayList();
        list = workwitharraylist3.fillList(i);
        stopTime = System.currentTimeMillis();
        System.out.println("Total time of ArrayList creation: " + (stopTime - startTime) + " milliseconds for " + i + " elements");

        //Total time of ArrayList creation consisting of 1 000 000 elements
        i = 1000000;
        startTime = System.currentTimeMillis();
        WorkWithArrayList workwitharraylist6 = new WorkWithArrayList();
        list = workwitharraylist6.fillList(i);
        stopTime = System.currentTimeMillis();
        System.out.println("Total time of ArrayList creation: " + (stopTime - startTime) + " milliseconds for " + i + " elements");

        /**
        //Total time of ArrayList creation consisting of 1 000 000 000 elements
        //throws Exception java.lang.OutOfMemoryError: Java heap space
        i = 1000000000;
        startTime = System.currentTimeMillis();
        WorkWithArrayList workwitharraylist9 = new WorkWithArrayList();
        list = workwitharraylist9.fillList(i);
        stopTime = System.currentTimeMillis();
        System.out.println("Total time of ArrayList creation: " + (stopTime - startTime) + " miliseconds for " + i + " elements");
        */

        //ONE ELEMENT DELETING EXPERIMENT FROM ARRAYLIST---------------------------------------------------------------
        //Total time of last element deleting from ArrayList consisting of 100 elements
        i = 100;
        startTime = System.currentTimeMillis();
        workwitharraylist2.deleteElementList(workwitharraylist2, i-1);
        stopTime = System.currentTimeMillis();
        System.out.println("Total time of last element deleting from ArrayList consisting of " + i + " elements: "
                + (stopTime - startTime) + " milliseconds");

        //Total time of last element deleting from ArrayList consisting of 1 000 elements
        i = 1000;
        startTime = System.currentTimeMillis();
        workwitharraylist3.deleteElementList(workwitharraylist3, i-1);
        stopTime = System.currentTimeMillis();
        System.out.println("Total time of last element deleting from ArrayList consisting of " + i + " elements: "
                + (stopTime - startTime) + " milliseconds");

        //Total time of last element deleting from ArrayList consisting of 1 000 elements
        i = 1000000;
        startTime = System.currentTimeMillis();
        workwitharraylist6.deleteElementList(workwitharraylist6, i-1);
        stopTime = System.currentTimeMillis();
        System.out.println("Total time of last element deleting from ArrayList consisting of " + i + " elements: "
                + (stopTime - startTime) + " milliseconds");

        //Total time of first element deleting from ArrayList consisting of 100 elements
        i = 100;
        startTime = System.currentTimeMillis();
        workwitharraylist2.deleteElementList(workwitharraylist2, 0);
        stopTime = System.currentTimeMillis();
        System.out.println("Total time of first element deleting from ArrayList consisting of " + i + " elements: "
                + (stopTime - startTime) + " milliseconds");

        //Total time of first element deleting from ArrayList consisting of 1 000 elements
        i = 1000;
        startTime = System.currentTimeMillis();
        workwitharraylist3.deleteElementList(workwitharraylist3, 0);
        stopTime = System.currentTimeMillis();
        System.out.println("Total time of first element deleting from ArrayList consisting of " + i + " elements: "
                + (stopTime - startTime) + " milliseconds");

        //Total time of first element deleting from ArrayList consisting of 1 000 elements
        i = 1000000;
        startTime = System.currentTimeMillis();
        workwitharraylist6.deleteElementList(workwitharraylist6, 0);
        stopTime = System.currentTimeMillis();
        System.out.println("Total time of first element deleting from ArrayList consisting of " + i + " elements: "
                + (stopTime - startTime) + " milliseconds");

        //Total time of middle element deleting from ArrayList consisting of 100 elements
        i = 100;
        startTime = System.currentTimeMillis();
        workwitharraylist2.deleteElementList(workwitharraylist2, 50);
        stopTime = System.currentTimeMillis();
        System.out.println("Total time of middle element deleting from ArrayList consisting of " + i + " elements: "
                + (stopTime - startTime) + " milliseconds");

        //Total time of middle element deleting from ArrayList consisting of 1 000 elements
        i = 1000;
        startTime = System.currentTimeMillis();
        workwitharraylist3.deleteElementList(workwitharraylist3, 500);
        stopTime = System.currentTimeMillis();
        System.out.println("Total time of middle element deleting from ArrayList consisting of " + i + " elements: "
                + (stopTime - startTime) + " milliseconds");

        //Total time of middle element deleting from ArrayList consisting of 1 000 elements
        i = 1000000;
        startTime = System.currentTimeMillis();
        workwitharraylist6.deleteElementList(workwitharraylist6, 500000);
        stopTime = System.currentTimeMillis();
        System.out.println("Total time of middle element deleting from ArrayList consisting of " + i + " elements: "
                + (stopTime - startTime) + " milliseconds");

    }

}
