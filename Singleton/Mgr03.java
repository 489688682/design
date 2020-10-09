package com.rootcloud.service.impl.Singleton;

/**
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全问题
 */
public class Mgr03 {
    private static Mgr03 instance;

    private Mgr03(){}

    public static Mgr03 getInstance(){
        if(instance == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Mgr03();
        }
        return instance;
    }

    public static void main(String[] args) {
        for(int i = 0;i < 100;i ++){
            Thread t = new Thread(()->{
                System.out.println(Mgr03.getInstance().hashCode());
            });
            t.start();
            try {
                t.join();//测试join，与单例无关
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("1234");
    }
}