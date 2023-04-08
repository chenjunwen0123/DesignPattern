package Singleton.RegisterSingleton;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/3/31 9:14 PM
 * @Version v1.0
 */
public class EnumTest {
    public static void main(String[] args) {
//        EnumSingleton spring1 = EnumSingleton.SPRING;
//        EnumSingleton spring2 = EnumSingleton.SPRING;
//
//        System.out.println(spring1.hashCode());
//        System.out.println(spring2.hashCode());
//        System.out.println(EnumSingleton.valueOf(spring1.name()));


        EnumSingletonDemo one_1 = EnumSingletonDemo.INSTANCE_ONE;
        EnumSingletonDemo one_2 = EnumSingletonDemo.INSTANCE_ONE;

        System.out.println(one_1.hashCode());    // 589431969
        System.out.println(one_2.hashCode());    // 589431969
        System.out.println(one_1.getKey() + ":" + one_1.getVal());    // 1:one
        System.out.println(one_1.getKey().hashCode());      // 49
        System.out.println(one_2.getKey() + ":" + one_2.getVal());   // 1:one
        System.out.println(one_1.getKey().hashCode());      // 49


    }
}
