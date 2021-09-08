package DesignModel.Creational.Singleton;

/**
 * 单例实例在类装载时就构建，急切初始化。（预先加载法）
 * 优点
 *     1.线程安全
 *     2.在类加载的同时已经创建好一个静态对象，调用时反应速度快
 * 缺点
 *     资源效率不高，可能getInstance()永远不会执行到，但执行该类的其他静态方法或者加载了该类（class.forName)，那么这个实例仍然初始化
 */

public class HungerSingleton {
    private static HungerSingleton instance = new HungerSingleton();

    private HungerSingleton() {
        System.out.println("created by hunger Singleton");
    };

    public static HungerSingleton getInstance() {
        return instance;
    }
}
