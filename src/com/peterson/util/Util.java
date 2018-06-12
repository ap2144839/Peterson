package com.peterson.util;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import com.peterson.collection.WorkWithArrayList;
import com.peterson.collection.WorkWithLinkedList;

/**
 * Created by user on 23.05.2018.
 */
public class Util {
    public static void main(String args[]){

        //ArrayList=====================================================================================================
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

        //LinkedList====================================================================================================
        //FILLING AND DELETING EXPERIMENT FROM LINKEDLIST OF 100 ELEMENTS-----------------------------------------------
        //Filling LinkedList of 100 elements
        WorkWithLinkedList workWithLinkedList = new WorkWithLinkedList();
        List<Integer> linkedList4 = new LinkedList<>();
        start = System.currentTimeMillis();
        List<Integer> list4 = workWithLinkedList.fillList(linkedList4, 100);
        stop = System.currentTimeMillis();
        System.out.println("Filling LinkedList of 100 elements takes: " + (stop-start) + " ms");
        //Deleting last element from LinkedList of 100 elements
        start = System.currentTimeMillis();
        workWithLinkedList.deleteElementList(list4, 99);
        stop = System.currentTimeMillis();
        System.out.println("Deleting last element from LinkedList of 100 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from LinkedList of 100 elements
        start = System.currentTimeMillis();
        workWithLinkedList.deleteElementList(list4, 50);
        stop = System.currentTimeMillis();
        System.out.println("Deleting middle element from LinkedList of 100 elements takes: " + (stop-start) + " ms");
        //Deleting first element from LinkedList of 100 elements
        start = System.currentTimeMillis();
        workWithLinkedList.deleteElementList(list4, 0);
        stop = System.currentTimeMillis();
        System.out.println("Deleting first element from LinkedList of 100 elements takes: " + (stop-start) + " ms");

        //FILLING AND DELETING EXPERIMENT FROM LINKEDLIST OF 1,000 ELEMENTS----------------------------------------------
        //Filling LinkedList of 1,000 elements
        List<Integer> linkedList5 = new LinkedList<>();
        start = System.currentTimeMillis();
        List<Integer> list5 = workWithLinkedList.fillList(linkedList5, 1000);
        stop = System.currentTimeMillis();
        System.out.println("Filling LinkedList of 1,000 elements takes: " + (stop-start) + " ms");
        //Deleting last element from LinkedList of 1,000 elements
        start = System.currentTimeMillis();
        workWithLinkedList.deleteElementList(list5, 999);
        stop = System.currentTimeMillis();
        System.out.println("Deleting last element from LinkedList of 1,000 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from LinkedList of 1,000 elements
        start = System.currentTimeMillis();
        workWithLinkedList.deleteElementList(list5, 500);
        stop = System.currentTimeMillis();
        System.out.println("Deleting middle element from LinkedList of 1,000 elements takes: " + (stop-start) + " ms");
        //Deleting first element from LinkedList of 1,000 elements
        start = System.currentTimeMillis();
        workWithLinkedList.deleteElementList(list5, 0);
        stop = System.currentTimeMillis();
        System.out.println("Deleting first element from LinkedList of 1,000 elements takes: " + (stop-start) + " ms");

        //FILLING AND DELETING EXPERIMENT FROM ARRAYLIST OF 1,000,000 ELEMENTS------------------------------------------
        //Filling ArrayList of 1,000,000 elements
        List<Integer> linkedList6 = new LinkedList<>();
        start = System.currentTimeMillis();
        List<Integer> list6 = workWithLinkedList.fillList(linkedList6, 1000000);
        stop = System.currentTimeMillis();
        System.out.println("Filling LinkedList of 1,000,000 elements takes: " + (stop-start) + " ms");
        //Deleting last element from LinkedList of 1,000,000 elements
        start = System.currentTimeMillis();
        workWithLinkedList.deleteElementList(list6, 999999);
        stop = System.currentTimeMillis();
        System.out.println("Deleting last element from LinkedList of 1,000,000 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from LinkedList of 1,000,000 elements
        start = System.currentTimeMillis();
        workWithLinkedList.deleteElementList(list6, 500000);
        stop = System.currentTimeMillis();
        System.out.println("Deleting middle element from LinkedList of 1,000,000 elements takes: " + (stop-start) + " ms");
        //Deleting first element from LinkedList of 1,000,000 elements
        start = System.currentTimeMillis();
        workWithLinkedList.deleteElementList(list6, 0);
        stop = System.currentTimeMillis();
        System.out.println("Deleting first element from LinkedList of 1,000,000 elements takes: " + (stop-start) + " ms");

    }

}
