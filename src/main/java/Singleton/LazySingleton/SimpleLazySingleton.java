package Singleton.LazySingleton;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 16:25
 */
public class SimpleLazySingleton {
    private static SimpleLazySingleton lazySingleton = new SimpleLazySingleton();

    private SimpleLazySingleton() {}
    public static synchronized SimpleLazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new SimpleLazySingleton();
        }
        return lazySingleton;
    }
}
