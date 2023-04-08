package Singleton.RegisterSingleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/3/31 11:41 PM
 * @Version v1.0
 */
public class ContainerSingleton {
    private ContainerSingleton () {}
    private static volatile Map<String,Object> container = new HashMap<>();
    public static Object getInstance(String className){
        if(!container.containsKey(className)){
            synchronized (ContainerSingleton.container) {
                if(!container.containsKey(className)) {
                    Object o = null;
                    try {
                        o = Class.forName(className).newInstance();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    container.put(className, o);
                }
            }
        }
        return container.get(className);
    }
}
