package com.rootcloud.service.impl.strategy;

/**
 * User: zbw
 * Date: 2020-10-9
 * Time: 13:33
 * Description:
 */
public class Cat implements Comparable{
    int weight;int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Cat c = (Cat)o;
        if(this.weight<c.weight) return -1;
        else if(this.weight>c.weight) return 1;
        else return 0;
    }
}