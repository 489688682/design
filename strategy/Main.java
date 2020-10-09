package com.rootcloud.service.impl.strategy;

import java.util.Arrays;

/**
 * User: zbw
 * Date: 2020-10-9
 * Time: 13:58
 * Description:
 */
public class Main {
    public static void main(String[] args) {//策略模式，例如：Comparator cat的height和weight分别用的CatHeightComaprator和CatWeightComparator，有新的属性可以再扩展，不用修改以前的方法
        Cat[] c = {new Cat(3,3),new Cat(5,5),new Cat(1,1)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(c,new CatHeightComparator());
        System.out.println(Arrays.toString(c));
    }
}