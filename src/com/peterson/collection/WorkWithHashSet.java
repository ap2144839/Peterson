package com.peterson.collection;

import java.util.Collection;

/**
 * Created by user on 17.06.2018.
 */
public class WorkWithHashSet extends WorkWithCollection {
//It may be necessary to change the variable name: collection -> set
    public void deleteElement(Collection<Integer> set, Object o){
        set.remove(o);
    }

}
