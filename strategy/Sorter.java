package com.rootcloud.service.impl.strategy;

import org.apache.poi.ss.formula.functions.T;

import java.util.Comparator;

/**
 * User: zbw
 * Date: 2020-10-9
 * Time: 13:43
 * Description:
 */
public class Sorter<T> {
    public void sort(T[] arr, Comparator<T> comparator){
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length;j++){
                minPos = comparator.compare(arr[j],(arr[minPos]))==-1 ? j : minPos;
            }
            swap(arr,i,minPos);
        }
    }
    void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}