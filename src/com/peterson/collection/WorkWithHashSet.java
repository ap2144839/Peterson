package com.peterson.collection;

import java.util.HashSet;

/**
 * Created by user on 13.06.2018.
 */
public class WorkWithHashSet {

    public static HashSet<Integer> fillList(HashSet<Integer> hashSet, int size){
        for (int i = 0; i < size; i++){
            hashSet.add(i);
        }
        return hashSet;
    }

    public static void deleteElementHashSet (HashSet<Integer> hashSet, Integer i){
        hashSet.remove(i);
    }

}
