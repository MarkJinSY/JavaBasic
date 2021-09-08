package DesignModel.Creational.Singleton;

/**
 * 优点
 *     资源利用率高，不执行getInstance()不被实例，可以执行该类其他静态方法
 * 缺点
 *     第一次加载时反应不够快
 */

public class StaticSingleton {
    private static class SingletonHolder {
        private static final StaticSingleton instance = new StaticSingleton();
    }

    private StaticSingleton() {
        System.out.println("created by Static Singleton");
    };

    public static final StaticSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
