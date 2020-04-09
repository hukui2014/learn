package com.hk.demo;

/**
 * 单例-双重校验锁
 */
public class Singleton_doublecheck {

    private static volatile Singleton_doublecheck INSTANCE;

    /**
     * 私有构造函数
     */
    private Singleton_doublecheck(){

    }

    /**
     * 获取实例
     * @return
     */
    public static Singleton_doublecheck getInstance(){
        if(INSTANCE == null){
            synchronized (Singleton_doublecheck.class){
                if(INSTANCE == null){
                    INSTANCE = new Singleton_doublecheck();
                }
            }
        }
        return INSTANCE;
    }
}
