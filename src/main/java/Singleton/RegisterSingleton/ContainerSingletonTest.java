package Singleton.RegisterSingleton;

import Singleton.RegisterSingleton.pojo.TestPojo;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/3/31 11:47 PM
 * @Version v1.0
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        TestPojo pojo1 = (TestPojo) ContainerSingleton.getInstance(TestPojo.class.getName());
        TestPojo pojo2 = (TestPojo) ContainerSingleton.getInstance(TestPojo.class.getName());

        System.out.println(pojo1.hashCode());
        System.out.println(pojo2.hashCode());
        System.out.println(pojo1 == pojo2);
    }
}
