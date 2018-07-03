package com.peterson.collection;

/**
 * Created by user on 17.06.2018.
 */
public class CollectionFactory {

    public WorkWithCollection getCollection(CollectionType type){
        switch (type){
            case LIST:
                return new WorkWithList();
            case SET:
                return new WorkWithHashSet();
        }
        return null;
    }
}
