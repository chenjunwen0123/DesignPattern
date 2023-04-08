package Singleton.RegisterSingleton;

import Singleton.LazySingleton.InnerClassSingleton.InnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/3/31 8:45 PM
 * @Version v1.0
 */
public class ReflectTest {
    public static void main(String[] args) {
        Class<?> cls = EnumSingleton.class;
        try {
            Constructor<?> constructor = cls.getDeclaredConstructor(String.class,int.class);
            constructor.setAccessible(true);

            EnumSingleton enumSingleton1 = (EnumSingleton) constructor.newInstance();
            EnumSingleton enumSingleton2 = (EnumSingleton) constructor.newInstance();
            System.out.println(enumSingleton1);
            System.out.println(enumSingleton2);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
