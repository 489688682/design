package com.rootcloud.service.impl.Singleton;

/**
 * 跟01是一个意思
 */
public class Mgr02 {//饿汉式
    private static Mgr02 instance;

    static{
        instance = new Mgr02();
    }

    private Mgr02(){}

    public static Mgr02 getInstance(){return instance;}

    public static void main(String[] args) {
        Mgr02 m1 = Mgr02.getInstance();
        Mgr02 m2 = Mgr02.getInstance();
        System.out.println(m1==m2);
    }

}