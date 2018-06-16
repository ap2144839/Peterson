package com.peterson.util;

import com.peterson.collection.WorkWithCollection;
import java.util.*;

/**
 * Created by user on 23.05.2018.
 */
public class Util {

    public static Collection<Integer> fillCollection(Collection<Integer> collection, int size){
        long start = System.currentTimeMillis();
        Collection<Integer> col = WorkWithCollection.fillList(collection, size);
        long stop = System.currentTimeMillis();
        System.out.println(String.format("Filling Collection of %d elements takes: %d", size, (stop-start)));
        return col;
    }

    public static void deleteObject(List<Integer> collection, int i){
        long start = System.currentTimeMillis();
        WorkWithCollection.deleteElement(collection, i);
        long stop = System.currentTimeMillis();
        System.out.println(String.format("Deleting element %d from Collection takes: %d", i, (stop-start)));
    }

    public static void deleteObject(HashSet<Integer> collection, Object o){
        long start = System.currentTimeMillis();
        WorkWithCollection.deleteElement(collection, o);
        long stop = System.currentTimeMillis();
        System.out.println(String.format("Deleting element %s from Collection takes: %d", o.toString(), (stop-start)));
    }


    public static void main(String args[]){

        List<Integer> arrayList1 = new ArrayList<>();
        fillCollection(arrayList1, 100);
        deleteObject(arrayList1, 99);
        deleteObject(arrayList1, 50);
        deleteObject(arrayList1, 0);

        List<Integer> arrayList2 = new ArrayList<>();
        fillCollection(arrayList2, 1000);
        deleteObject(arrayList2, 999);
        deleteObject(arrayList2, 500);
        deleteObject(arrayList2,0);

        List<Integer> arrayList3 = new ArrayList<>();
        fillCollection(arrayList3, 1000000);
        deleteObject(arrayList3, 999999);
        deleteObject(arrayList3, 500000);
        deleteObject(arrayList3, 0);

        List<Integer> linkedList1 = new LinkedList<>();
        fillCollection(linkedList1, 100);
        deleteObject(linkedList1, 99);
        deleteObject(linkedList1, 50);
        deleteObject(linkedList1, 0);

        List<Integer> linkedList2 = new LinkedList<>();
        fillCollection(linkedList2, 1000);
        deleteObject(linkedList2, 999);
        deleteObject(linkedList2, 500);
        deleteObject(linkedList2, 0);

        List<Integer> linkedList3 = new LinkedList<>();
        fillCollection(linkedList3, 1000000);
        deleteObject(linkedList3, 999999);
        deleteObject(linkedList3, 500000);
        deleteObject(linkedList3, 0);

        HashSet<Integer> hashSet1 = new HashSet<>();
        fillCollection(hashSet1, 100);
        deleteObject(hashSet1, 99);
        deleteObject(hashSet1, 50);
        deleteObject(hashSet1, 0);

        HashSet<Integer> hashSet2 = new HashSet<>();
        fillCollection(hashSet2, 1000);
        deleteObject(hashSet2, 999);
        deleteObject(hashSet2, 500);
        deleteObject(hashSet2, 0);

        HashSet<Integer> hashSet3 = new HashSet<>();
        fillCollection(hashSet3, 1000000);
        deleteObject(hashSet3, 999999);
        deleteObject(hashSet3, 500000);
        deleteObject(hashSet3, 0);
    }

}
