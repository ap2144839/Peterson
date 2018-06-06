package com.peterson.util;

import com.peterson.collection.WorkWithArrayList;
import java.util.ArrayList;
import java.util.List;

//import static com.peterson.collection.WorkWithArrayList.*;


/**
 * Created by user on 23.05.2018.
 */
public class Util {
    public static void main(String args[]){

        //FILLING AND DELETING EXPERIMENT FROM ARRAYLIST OF 100 ELEMENTS------------------------------------------------
        //Filling ArrayList of 100 elements
        WorkWithArrayList workWithArrayList = new WorkWithArrayList();
        List<Integer> arrayList1 = new ArrayList<>();
        long start = System.currentTimeMillis();
        List<Integer> list1 = workWithArrayList.fillList(arrayList1, 100);
        long stop = System.currentTimeMillis();
        System.out.println("Filling ArrayList of 100 elements takes: " + (stop-start) + " ms");
        //Deleting last element from ArrayList of 100 elements
        start = System.currentTimeMillis();
        workWithArrayList.deleteElementList(list1, 99);
        stop = System.currentTimeMillis();
        System.out.println("Deleting last element from ArrayList of 100 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from ArrayList of 100 elements
        start = System.currentTimeMillis();
        workWithArrayList.deleteElementList(list1, 50);
        stop = System.currentTimeMillis();
        System.out.println("Deleting middle element from ArrayList of 100 elements takes: " + (stop-start) + " ms");
        //Deleting first element from ArrayList of 100 elements
        start = System.currentTimeMillis();
        workWithArrayList.deleteElementList(list1, 0);
        stop = System.currentTimeMillis();
        System.out.println("Deleting first element from ArrayList of 100 elements takes: " + (stop-start) + " ms");

        //FILLING AND DELETING EXPERIMENT FROM ARRAYLIST OF 1,000 ELEMENTS----------------------------------------------
        //Filling ArrayList of 1,000 elements
        List<Integer> arrayList2 = new ArrayList<>();
        start = System.currentTimeMillis();
        List<Integer> list2 = workWithArrayList.fillList(arrayList2, 1000);
        stop = System.currentTimeMillis();
        System.out.println("Filling ArrayList of 1,000 elements takes: " + (stop-start) + " ms");
        //Deleting last element from ArrayList of 1,000 elements
        start = System.currentTimeMillis();
        workWithArrayList.deleteElementList(list2, 999);
        stop = System.currentTimeMillis();
        System.out.println("Deleting last element from ArrayList of 1,000 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from ArrayList of 1,000 elements
        start = System.currentTimeMillis();
        workWithArrayList.deleteElementList(list2, 500);
        stop = System.currentTimeMillis();
        System.out.println("Deleting middle element from ArrayList of 1,000 elements takes: " + (stop-start) + " ms");
        //Deleting first element from ArrayList of 1,000 elements
        start = System.currentTimeMillis();
        workWithArrayList.deleteElementList(list2, 0);
        stop = System.currentTimeMillis();
        System.out.println("Deleting first element from ArrayList of 1,000 elements takes: " + (stop-start) + " ms");

        //FILLING AND DELETING EXPERIMENT FROM ARRAYLIST OF 1,000,000 ELEMENTS------------------------------------------
        //Filling ArrayList of 1,000,000 elements
        List<Integer> arrayList3 = new ArrayList<>();
        start = System.currentTimeMillis();
        List<Integer> list3 = workWithArrayList.fillList(arrayList3, 1000000);
        stop = System.currentTimeMillis();
        System.out.println("Filling ArrayList of 1,000,000 elements takes: " + (stop-start) + " ms");
        //Deleting last element from ArrayList of 1,000,000 elements
        start = System.currentTimeMillis();
        workWithArrayList.deleteElementList(list3, 999999);
        stop = System.currentTimeMillis();
        System.out.println("Deleting last element from ArrayList of 1,000,000 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from ArrayList of 1,000,000 elements
        start = System.currentTimeMillis();
        workWithArrayList.deleteElementList(list3, 500000);
        stop = System.currentTimeMillis();
        System.out.println("Deleting middle element from ArrayList of 1,000,000 elements takes: " + (stop-start) + " ms");
        //Deleting first element from ArrayList of 1,000,000 elements
        start = System.currentTimeMillis();
        workWithArrayList.deleteElementList(list3, 0);
        stop = System.currentTimeMillis();
        System.out.println("Deleting first element from ArrayList of 1,000,000 elements takes: " + (stop-start) + " ms");


    }

}
