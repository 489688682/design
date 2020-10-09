package com.rootcloud.service.impl.strategy;

/**
 * User: zbw
 * Date: 2020-10-9
 * Time: 13:33
 * Description:
 */
public class Dog implements Comparable{
    int size;
    public Dog(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "size=" + size +
                '}';
    }

    public int compareTo(Object o) {
        Dog d = (Dog)o;
        if(this.size>d.size) return -1;
        else if(this.size < d.size) return 1;
        else return 0;
    }
}