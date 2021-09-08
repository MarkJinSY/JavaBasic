package DesignModel.Creational.Singleton;

public class LazySingletonWithSynchronized {
    private static LazySingletonWithSynchronized instance;
    private LazySingletonWithSynchronized (){
        System.out.println("created by lazy Singleton with Synchronized");
    }

    public static synchronized LazySingletonWithSynchronized getInstance() {
        if (instance == null) {
            instance = new LazySingletonWithSynchronized();
        }
        return instance;
    }
}
