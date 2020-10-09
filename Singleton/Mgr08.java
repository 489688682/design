package com.rootcloud.service.impl.Singleton;

/**
 * 不仅可以解决线程同步，还可以防止反序列化(枚举没有构造方法)
 * 最完美的方式
 */
public enum Mgr08 {
    INSTANCE;

    public static void main(String[] args) {
        for(int i = 0;i < 100;i ++){
            new Thread(()->{
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }
}
