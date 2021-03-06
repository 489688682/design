package com.rootcloud.service.impl.strategy;

import java.util.Comparator;

/**
 * User: zbw
 * Date: 2020-10-9
 * Time: 14:30
 * Description:
 */
public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.height <o2.height) return -1;
        else if(o1.height > o2.height) return 1;
        else return 0;
    }
}