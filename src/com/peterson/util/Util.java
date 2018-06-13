package com.peterson.util;

import com.peterson.collection.WorkWithList;

import java.util.*;

import com.peterson.collection.WorkWithHashSet;

/**
 * Created by user on 23.05.2018.
 */
public class Util {
    public static void main(String args[]){

        //ArrayList=====================================================================================================
        //FILLING AND DELETING EXPERIMENT FROM ARRAYLIST OF 100 ELEMENTS------------------------------------------------
        //Filling ArrayList of 100 elements
        List<Integer> arrayList1 = new ArrayList<>();
        long start = System.currentTimeMillis();
        List<Integer> list1 = WorkWithList.fillList(arrayList1, 100);
        long stop = System.currentTimeMillis();
        System.out.println("Filling ArrayList of 100 elements takes: " + (stop-start) + " ms");
        //Deleting last element from ArrayList of 100 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list1, 99);
        stop = System.currentTimeMillis();
        System.out.println("Deleting last element from ArrayList of 100 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from ArrayList of 100 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list1, 50);
        stop = System.currentTimeMillis();
        System.out.println("Deleting middle element from ArrayList of 100 elements takes: " + (stop-start) + " ms");
        //Deleting first element from ArrayList of 100 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list1, 0);
        stop = System.currentTimeMillis();
        System.out.println("Deleting first element from ArrayList of 100 elements takes: " + (stop-start) + " ms");

        //FILLING AND DELETING EXPERIMENT FROM ARRAYLIST OF 1,000 ELEMENTS----------------------------------------------
        //Filling ArrayList of 1,000 elements
        List<Integer> arrayList2 = new ArrayList<>();
        start = System.currentTimeMillis();
        List<Integer> list2 = WorkWithList.fillList(arrayList2, 1000);
        stop = System.currentTimeMillis();
        System.out.println("Filling ArrayList of 1,000 elements takes: " + (stop-start) + " ms");
        //Deleting last element from ArrayList of 1,000 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list2, 999);
        stop = System.currentTimeMillis();
        System.out.println("Deleting last element from ArrayList of 1,000 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from ArrayList of 1,000 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list2, 500);
        stop = System.currentTimeMillis();
        System.out.println("Deleting middle element from ArrayList of 1,000 elements takes: " + (stop-start) + " ms");
        //Deleting first element from ArrayList of 1,000 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list2, 0);
        stop = System.currentTimeMillis();
        System.out.println("Deleting first element from ArrayList of 1,000 elements takes: " + (stop-start) + " ms");

        //FILLING AND DELETING EXPERIMENT FROM ARRAYLIST OF 1,000,000 ELEMENTS------------------------------------------
        //Filling ArrayList of 1,000,000 elements
        List<Integer> arrayList3 = new ArrayList<>();
        start = System.currentTimeMillis();
        List<Integer> list3 = WorkWithList.fillList(arrayList3, 1000000);
        stop = System.currentTimeMillis();
        System.out.println("Filling ArrayList of 1,000,000 elements takes: " + (stop-start) + " ms");
        //Deleting last element from ArrayList of 1,000,000 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list3, 999999);
        stop = System.currentTimeMillis();
        System.out.println("Deleting last element from ArrayList of 1,000,000 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from ArrayList of 1,000,000 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list3, 500000);
        stop = System.currentTimeMillis();
        System.out.println("Deleting middle element from ArrayList of 1,000,000 elements takes: " + (stop-start) + " ms");
        //Deleting first element from ArrayList of 1,000,000 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list3, 0);
        stop = System.currentTimeMillis();
        System.out.println("Deleting first element from ArrayList of 1,000,000 elements takes: " + (stop-start) + " ms");

        //LinkedList====================================================================================================
        //FILLING AND DELETING EXPERIMENT FROM LINKEDLIST OF 100 ELEMENTS-----------------------------------------------
        //Filling LinkedList of 100 elements
        List<Integer> linkedList4 = new LinkedList<>();
        start = System.currentTimeMillis();
        List<Integer> list4 = WorkWithList.fillList(linkedList4, 100);
        stop = System.currentTimeMillis();
        System.out.println("Filling LinkedList of 100 elements takes: " + (stop-start) + " ms");
        //Deleting last element from LinkedList of 100 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list4, 99);
        stop = System.currentTimeMillis();
        System.out.println("Deleting last element from LinkedList of 100 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from LinkedList of 100 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list4, 50);
        stop = System.currentTimeMillis();
        System.out.println("Deleting middle element from LinkedList of 100 elements takes: " + (stop-start) + " ms");
        //Deleting first element from LinkedList of 100 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list4, 0);
        stop = System.currentTimeMillis();
        System.out.println("Deleting first element from LinkedList of 100 elements takes: " + (stop-start) + " ms");

        //FILLING AND DELETING EXPERIMENT FROM LINKEDLIST OF 1,000 ELEMENTS----------------------------------------------
        //Filling LinkedList of 1,000 elements
        List<Integer> linkedList5 = new LinkedList<>();
        start = System.currentTimeMillis();
        List<Integer> list5 = WorkWithList.fillList(linkedList5, 1000);
        stop = System.currentTimeMillis();
        System.out.println("Filling LinkedList of 1,000 elements takes: " + (stop-start) + " ms");
        //Deleting last element from LinkedList of 1,000 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list5, 999);
        stop = System.currentTimeMillis();
        System.out.println("Deleting last element from LinkedList of 1,000 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from LinkedList of 1,000 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list5, 500);
        stop = System.currentTimeMillis();
        System.out.println("Deleting middle element from LinkedList of 1,000 elements takes: " + (stop-start) + " ms");
        //Deleting first element from LinkedList of 1,000 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list5, 0);
        stop = System.currentTimeMillis();
        System.out.println("Deleting first element from LinkedList of 1,000 elements takes: " + (stop-start) + " ms");

        //FILLING AND DELETING EXPERIMENT FROM ARRAYLIST OF 1,000,000 ELEMENTS------------------------------------------
        //Filling ArrayList of 1,000,000 elements
        List<Integer> linkedList6 = new LinkedList<>();
        start = System.currentTimeMillis();
        List<Integer> list6 = WorkWithList.fillList(linkedList6, 1000000);
        stop = System.currentTimeMillis();
        System.out.println("Filling LinkedList of 1,000,000 elements takes: " + (stop-start) + " ms");
        //Deleting last element from LinkedList of 1,000,000 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list6, 999999);
        stop = System.currentTimeMillis();
        System.out.println("Deleting last element from LinkedList of 1,000,000 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from LinkedList of 1,000,000 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list6, 500000);
        stop = System.currentTimeMillis();
        System.out.println("Deleting middle element from LinkedList of 1,000,000 elements takes: " + (stop-start) + " ms");
        //Deleting first element from LinkedList of 1,000,000 elements
        start = System.currentTimeMillis();
        WorkWithList.deleteElementList(list6, 0);
        stop = System.currentTimeMillis();
        System.out.println("Deleting first element from LinkedList of 1,000,000 elements takes: " + (stop-start) + " ms");

        //HashSet====================================================================================================
        //FILLING AND DELETING EXPERIMENT FROM HASHSET OF 100 ELEMENTS-----------------------------------------------
        //Filling HashSet of 100 elements
        HashSet<Integer> hashSet1 = new HashSet<>();
        start = System.currentTimeMillis();
        HashSet<Integer> workWithHashSet1 = WorkWithHashSet.fillList(hashSet1, 100);
        stop = System.currentTimeMillis();
        System.out.println("Filling HashSet of 100 elements takes: " + (stop-start) + " ms");
        //Deleting last element from HashSet of 100 elements
        start = System.currentTimeMillis();
        WorkWithHashSet.deleteElementHashSet(workWithHashSet1,99);
        stop = System.currentTimeMillis();
        System.out.println("Deleting last element from HashSet of 100 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from HashSet of 100 elements
        start = System.currentTimeMillis();
        WorkWithHashSet.deleteElementHashSet(workWithHashSet1,50);
        stop = System.currentTimeMillis();
        System.out.println("Deleting middle element from HashSet of 100 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from HashSet of 100 elements
        start = System.currentTimeMillis();
        WorkWithHashSet.deleteElementHashSet(workWithHashSet1,0);
        stop = System.currentTimeMillis();
        System.out.println("Deleting first element from HashSet of 100 elements takes: " + (stop-start) + " ms");
        //FILLING AND DELETING EXPERIMENT FROM HASHSET OF 1,000 ELEMENTS-----------------------------------------------
        //Filling HashSet of 1,000 elements
        HashSet<Integer> hashSet2 = new HashSet<>();
        start = System.currentTimeMillis();
        HashSet<Integer> workWithHashSet2 = WorkWithHashSet.fillList(hashSet2, 1000);
        stop = System.currentTimeMillis();
        System.out.println("Filling HashSet of 1,000 elements takes: " + (stop-start) + " ms");
        //Deleting last element from HashSet of 1,000 elements
        start = System.currentTimeMillis();
        WorkWithHashSet.deleteElementHashSet(workWithHashSet2,999);
        stop = System.currentTimeMillis();
        System.out.println("Deleting last element from HashSet of 1,000 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from HashSet of 1,000 elements
        start = System.currentTimeMillis();
        WorkWithHashSet.deleteElementHashSet(workWithHashSet2,500);
        stop = System.currentTimeMillis();
        System.out.println("Deleting middle element from HashSet of 1,000 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from HashSet of 1,000 elements
        start = System.currentTimeMillis();
        WorkWithHashSet.deleteElementHashSet(workWithHashSet2,0);
        stop = System.currentTimeMillis();
        System.out.println("Deleting first element from HashSet of 1,000 elements takes: " + (stop-start) + " ms");
        //FILLING AND DELETING EXPERIMENT FROM HASHSET OF 1,000,000 ELEMENTS-----------------------------------------------
        //Filling HashSet of 1,000,000 elements
        HashSet<Integer> hashSet3 = new HashSet<>();
        start = System.currentTimeMillis();
        HashSet<Integer> workWithHashSet3 = WorkWithHashSet.fillList(hashSet3, 1000000);
        stop = System.currentTimeMillis();
        System.out.println("Filling HashSet of 1,000,000 elements takes: " + (stop-start) + " ms");
        //Deleting last element from HashSet of 1,000,000 elements
        start = System.currentTimeMillis();
        WorkWithHashSet.deleteElementHashSet(workWithHashSet3,999999);
        stop = System.currentTimeMillis();
        System.out.println("Deleting last element from HashSet of 1,000,000 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from HashSet of 1,000,000 elements
        start = System.currentTimeMillis();
        WorkWithHashSet.deleteElementHashSet(workWithHashSet3,500000);
        stop = System.currentTimeMillis();
        System.out.println("Deleting middle element from HashSet of 1,000,000 elements takes: " + (stop-start) + " ms");
        //Deleting middle element from HashSet of 1,000,000 elements
        start = System.currentTimeMillis();
        WorkWithHashSet.deleteElementHashSet(workWithHashSet3,0);
        stop = System.currentTimeMillis();
        System.out.println("Deleting first element from HashSet of 1,000,000 elements takes: " + (stop-start) + " ms");

    }

}
