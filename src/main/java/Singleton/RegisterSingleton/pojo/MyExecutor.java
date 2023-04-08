package Singleton.RegisterSingleton.pojo;

import Singleton.RegisterSingleton.ContainerSingleton;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/3/31 11:57 PM
 * @Version v1.0
 */
public class MyExecutor implements Runnable{
    @Override
    public void run() {
        TestPojo pojo = (TestPojo) ContainerSingleton.getInstance(TestPojo.class.getName());
        System.out.println(Thread.currentThread().getName() + ":" + pojo);
    }
}