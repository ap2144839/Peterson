package com.peterson.collection;

import java.util.Collection;

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

    public static void deleteElement(Collection<Integer> list, Object o){
        list.remove(o);
    }

}
