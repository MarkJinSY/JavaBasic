package DesignModel.Creational.Singleton;

/**
 * 单例实例在第一次被使用时构建，延迟初始化。
 * 优点：
 *     避免了饿汉式的那种在没有用到的情况下创建事例，资源利用率高，不执行getInstance()就不会被实例，可以执行该类的其他静态方法。
 * 缺点：
 *     懒汉式在单个线程中没有问题，但多个线程同事访问的时候就可能同事创建多个实例，而且这多个实例不是同一个对象，虽然后面创建的实例会覆盖先创建的实例，
 *     但是还是会存在拿到不同对象的情况。解决这个问题的办法就是加锁synchonized，第一次加载时不够快，多线程使用不必要的同步开销大。
 */

public class LazySingleton {

    private static LazySingleton instance;
    private LazySingleton (){
        System.out.println("created by lazy Singleton");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("lazy Singleton");
    }
}
