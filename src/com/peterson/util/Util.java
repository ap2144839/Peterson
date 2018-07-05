package com.peterson.util;

import com.peterson.collection.*;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

import java.util.*;

/**
 * Created by user on 23.05.2018.
 */
public class Util {

    public static Collection<Integer> fillCollection(Collection<Integer> collection, int size){
        long start = System.currentTimeMillis();
        Collection<Integer> col = WorkWithCollection.fillList(collection, size);
        long stop = System.currentTimeMillis();
        System.out.println(String.format("Filling Collection of %d elements takes: %d milliseconds", size, (stop-start)));
        return col;
    }

    public static void deleteObject(WorkWithCollection workWithCollection, Collection<Integer> collection, Object o){
        long start = System.currentTimeMillis();
        workWithCollection.deleteElement(collection, o);
        long stop = System.currentTimeMillis();
        System.out.println(String.format("Deleting element %s from Collection takes: %d milliseconds", o.toString(), (stop-start)));
    }

    public static void main(String args[]){

        CollectionFactory factory = new CollectionFactory();
        WorkWithCollection workWithList = factory.getCollection(CollectionType.LIST);

        List<Integer> arrayList1 = new ArrayList<>();
        fillCollection(arrayList1, 100);
        deleteObject(workWithList, arrayList1, 99);
        deleteObject(workWithList, arrayList1, 50);
        deleteObject(workWithList, arrayList1, 0);

        List<Integer> arrayList2 = new ArrayList<>();
        fillCollection(arrayList2, 1000);
        deleteObject(workWithList, arrayList2, 999);
        deleteObject(workWithList, arrayList2, 500);
        deleteObject(workWithList, arrayList2,0);

        List<Integer> arrayList3 = new ArrayList<>();
        fillCollection(arrayList3, 1000000);
        deleteObject(workWithList, arrayList3, 999999);
        deleteObject(workWithList, arrayList3, 500000);
        deleteObject(workWithList, arrayList3, 0);

        List<Integer> linkedList1 = new LinkedList<>();
        fillCollection(linkedList1, 100);
        deleteObject(workWithList, linkedList1, 99);
        deleteObject(workWithList, linkedList1, 50);
        deleteObject(workWithList, linkedList1, 0);

        List<Integer> linkedList2 = new LinkedList<>();
        fillCollection(linkedList2, 1000);
        deleteObject(workWithList, linkedList2, 999);
        deleteObject(workWithList, linkedList2, 500);
        deleteObject(workWithList, linkedList2, 0);

        List<Integer> linkedList3 = new LinkedList<>();
        fillCollection(linkedList3, 1000000);
        deleteObject(workWithList, linkedList3, 999999);
        deleteObject(workWithList, linkedList3, 500000);
        deleteObject(workWithList, linkedList3, 0);

        WorkWithCollection workWithSet = factory.getCollection(CollectionType.SET);

        HashSet<Integer> hashSet1 = new HashSet<>();
        fillCollection(hashSet1, 100);
        deleteObject(workWithSet, hashSet1, 99);
        deleteObject(workWithSet, hashSet1, 50);
        deleteObject(workWithSet, hashSet1, 0);

        HashSet<Integer> hashSet2 = new HashSet<>();
        fillCollection(hashSet2, 1000);
        deleteObject(workWithSet, hashSet2, 999);
        deleteObject(workWithSet, hashSet2, 500);
        deleteObject(workWithSet, hashSet2, 0);

        HashSet<Integer> hashSet3 = new HashSet<>();
        fillCollection(hashSet3, 1000000);
        deleteObject(workWithSet, hashSet3, 999999);
        deleteObject(workWithSet, hashSet3, 500000);
        deleteObject(workWithSet, hashSet3, 0);

    }

}
