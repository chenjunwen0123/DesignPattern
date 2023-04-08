package Singleton.SerializableSingleton;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/3/31 10:15 PM
 * @Version v1.0
 */
public class Singleton implements Serializable {
    private static final Long serialVersionUID = 1L;
    private static final Singleton instance = new Singleton();
    private Singleton () {}
    public static Singleton getInstance(){
        return instance;
    }

    private Object readResolve(){
        return "helloworld";
    }
}
