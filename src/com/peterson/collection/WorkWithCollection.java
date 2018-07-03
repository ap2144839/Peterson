package com.peterson.collection;

import java.util.Collection;

/**
 * Created by user on 21.05.2018.
 */
public abstract class WorkWithCollection {
    //It may be necessary to change the variable name: list -> collection
    public static Collection<Integer> fillList(Collection<Integer> collection, int size){
        for (int i = 0; i < size; i++){
            collection.add(i);
        }
        return collection;
    }

    public abstract void deleteElement(Collection<Integer> list, Object o);

}
