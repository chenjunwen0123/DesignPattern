package ProxyPattern.dynamicProxy.jdkProxy;

import ProxyPattern.staticProxy.ISubject;
import ProxyPattern.staticProxy.RealSubject;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/4/2 5:01 PM
 * @Version v1.0
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        testDemo1();
    }
    public static void testDemo1(){
        ISubject subject1 = new RealSubject("Subject1");
        ISubject subject2 = new RealSubject("Subject2");

        ISubject proxySubject1 = (ISubject) new JdkProxy().getProxyInstance(subject1);
        ISubject proxySubject2 = (ISubject) new JdkProxy().getProxyInstance(subject2);

        System.out.println("JdkProxyTest.classLoader:" + JdkProxyTest.class.getClassLoader());
        System.out.println(subject1.hashCode());    // 1836019240
        System.out.println(subject2.hashCode());    // 325040804
        proxySubject1.request();
        proxySubject2.request();
    }
}
