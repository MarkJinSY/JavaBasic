package DesignModel.Creational.Singleton;

/**
 * 有两次检查 instance == null，一次是在同步块外，一次是在同步块内。为什么在同步块内还要再检验一次？
 * 因为可能会有多个线程一起进入同步块外的 if，如果在同步块内不进行二次检验的话就会生成多个实例了。
 *
 * instance = new Singleton()这句，这并非是一个原子操作，事实上在 JVM 中这句话大概做了下面 3 件事情。
 *
 * 1、给 instance 分配内存
 * 2、调用 Singleton 的构造函数来初始化成员变量
 * 3、将instance对象指向分配的内存空间（执行完这步 instance 就为非 null 了）
 * 但是在 JVM 的即时编译器中存在指令重排序的优化。也就是说上面的第二步和第三步的顺序是不能保证的，
 * 最终的执行顺序可能是 1-2-3 也可能是 1-3-2。如果是后者，则在 3 执行完毕、2 未执行之前，被线程二抢占了，
 * 这时 instance 已经是非 null 了（但却没有初始化），所以线程二会直接返回 instance，然后使用，然后顺理成章地报错。
 *
 * 优点
 *     资源利用率高，不执行getInstance()就不被实例，可以执行该类其他静态方法
 * 缺点
 *     第一次加载时反应不快，由于java内存模型一些原因偶尔失败
 */

public class DoubleCheck {
    private volatile static DoubleCheck instance; //声明成 volatile
    private DoubleCheck (){
        System.out.println("created by double check Singleton");
    }

    public static DoubleCheck getSingleton() {
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
