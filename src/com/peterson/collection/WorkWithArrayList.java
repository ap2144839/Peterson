package com.peterson.collection;

import java.util.List;

/**
 * Created by user on 22.05.2018.
 */
public class WorkWithArrayList extends WorkWithList {

    public List<Integer> fillList(List<Integer> list, int size){
        for (int i = 0; i < size; i++){
            list.add(1000);
        }
        return list;
    }

    public void deleteElementList (List<Integer> list, int index) {
        list.remove(index);
    }

}
