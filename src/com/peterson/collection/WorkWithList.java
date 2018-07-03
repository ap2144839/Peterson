package com.peterson.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by user on 17.06.2018.
 */
public class WorkWithList extends WorkWithCollection {
    //It may be necessary to change the variable name: collection -> list
    public void deleteElement(Collection<Integer> list, Object o){
        int index = new ArrayList<>(list).indexOf(o);
        list.remove(index);
    }

}
