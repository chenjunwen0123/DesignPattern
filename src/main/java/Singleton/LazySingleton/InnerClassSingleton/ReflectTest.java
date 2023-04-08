package Singleton.LazySingleton.InnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/3/31 8:24 PM
 * @Version v1.0
 */
public class ReflectTest {
    public static void main(String[] args){
        Class<?> cls = InnerClassSingleton.class;
        try {
            Constructor<?> constructor = cls.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            InnerClassSingleton object1 = (InnerClassSingleton) constructor.newInstance();
            InnerClassSingleton object2 = (InnerClassSingleton) constructor.newInstance();
            System.out.println(object1);
            System.out.println(object2);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
