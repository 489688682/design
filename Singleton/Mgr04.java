package com.rootcloud.service.impl.Singleton;

/**
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全问题
 * 可以通过synchronized解决，但也带来效率下降
 */
public class Mgr04 {
    private static Mgr04 instance;

    private Mgr04(){}

    public static synchronized Mgr04 getInstance(){
        if(instance == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Mgr04();
        }
        return instance;
    }

    public static void main(String[] args) {
        for(int i = 0;i < 100;i ++){
            new Thread(()->
                    System.out.println(Mgr04.getInstance().hashCode())
            ).start();
        }
    }
}