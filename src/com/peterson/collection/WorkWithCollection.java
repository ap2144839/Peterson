package com.peterson.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Created by user on 21.05.2018.
 */
public class WorkWithCollection {

    public static Collection<Integer> fillList(Collection<Integer> list, int size){
        for (int i = 0; i < size; i++){
            list.add(i);
        }
        return list;
    }

    public static void deleteElement(List<Integer> list, int i) { list.remove(i); }

    public static void deleteElement(HashSet<Integer> hashSet, Object o){
        hashSet.remove(o);
    }

}
