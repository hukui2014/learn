package com.hk.demo;

/**
 * 单例-静态内部类实现方式
 */
public final class Singleton_static {

    private Singleton_static(){

    }

    /**
     * 获取实例方法
     * @return
     */
    public static final Singleton_static getInstance(){
        return SingletonHolder.INSTANCE;
    }

    /**
     * 静态内部类
     * 类加载的时候初始化
     */
    private static class SingletonHolder{
        private static final Singleton_static INSTANCE = new Singleton_static();
    }

    public void anyMethod(){

    }
}
