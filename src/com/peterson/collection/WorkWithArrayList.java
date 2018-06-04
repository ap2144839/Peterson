package com.peterson.collection;

import java.util.ArrayList;

/**
 * Created by user on 22.05.2018.
 */
public class WorkWithArrayList extends WorkWithList {

    public ArrayList list;

    public ArrayList fillList(int size){
        list = new ArrayList<>();
        for (int i = 0; i < size; i++){
            list.add(1);
        }
        return list;
    }

    public void deleteElementList (WorkWithArrayList list, int index) {
        this.list.remove(index);
    }

}
