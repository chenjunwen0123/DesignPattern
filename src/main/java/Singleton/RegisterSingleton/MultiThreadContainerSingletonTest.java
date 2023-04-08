package Singleton.RegisterSingleton;

import Singleton.RegisterSingleton.pojo.MyExecutor;
import Singleton.RegisterSingleton.pojo.TestPojo;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/3/31 11:54 PM
 * @Version v1.0
 */
public class MultiThreadContainerSingletonTest {
    public static void main(String[] args) {
        new Thread(new MyExecutor()).start();
        new Thread(new MyExecutor()).start();
        new Thread(new MyExecutor()).start();
        new Thread(new MyExecutor()).start();
        new Thread(new MyExecutor()).start();
        new Thread(new MyExecutor()).start();
        new Thread(new MyExecutor()).start();
        new Thread(new MyExecutor()).start();
        new Thread(new MyExecutor()).start();
        new Thread(new MyExecutor()).start();
    }
}
