package com.rootcloud.service.impl.strategy;

import java.util.Comparator;

/**
 * User: zbw
 * Date: 2020-10-9
 * Time: 14:30
 * Description:
 */
public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if(o1.size <o2.size) return -1;
        else if(o1.size > o2.size) return 1;
        else return 0;
    }
}