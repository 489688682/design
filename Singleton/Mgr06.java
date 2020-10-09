package com.rootcloud.service.impl.Singleton;

/**
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全问题
 * 可以通过synchronized解决，但也带来效率下降
 * 懒汉式最完美的
 */
public class Mgr06 {
    private static volatile Mgr06 instance;//没有初始化的时候就返回instance

    private Mgr06(){}

    public static Mgr06 getInstance(){
        if(instance == null){
            //双重检查
            synchronized(Mgr06.class){
                if(instance == null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Mgr06();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for(int i = 0;i < 100;i ++){
            new Thread(()->
                    System.out.println(Mgr06.getInstance().hashCode())
            ).start();
        }
    }
}