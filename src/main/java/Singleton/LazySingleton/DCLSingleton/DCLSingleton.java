package Singleton.LazySingleton.DCLSingleton;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 17:32
 */
public class DCLSingleton {
    private volatile static DCLSingleton dclSingleton;
    private DCLSingleton() {}
    private DCLSingleton(String param) {
        System.out.println(param);
    }
    public static DCLSingleton getInstance(){
        if (dclSingleton == null) {
            synchronized (DCLSingleton.class) {
                if(dclSingleton == null) {
                    String name = "param";
                    dclSingleton = new DCLSingleton(name);
                }
            }
        }
        return dclSingleton;
    }
}
