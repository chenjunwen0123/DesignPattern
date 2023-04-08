package Singleton.ThreadLocalSingleton;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/4/1 12:33 AM
 * @Version v1.0
 */
public class ThreadLocalSingletonTest {
    public static void main(String[] args) {
        ThreadLocalSingleton instance1 = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance3 = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance4 = ThreadLocalSingleton.getInstance();

        instance1.setValue1("Tom");
        instance1.setValue2("Candy");

        instance2.setValue1("Andy");
        instance3.setValue2("Funny");

        instance4.setValue1("Finally");

        System.out.println(instance1);   // ThreadLocalSingleton@232204a1
        System.out.println(instance2);   // ThreadLocalSingleton@232204a1
        System.out.println(instance3);   // ThreadLocalSingleton@232204a1
        System.out.println(instance4);   // ThreadLocalSingleton@232204a1

        System.out.println(instance1.getValue1());  // Finally
        System.out.println(instance1.getValue2());  // Funny
    }
}
