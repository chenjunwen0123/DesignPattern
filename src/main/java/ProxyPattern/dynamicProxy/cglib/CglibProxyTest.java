package ProxyPattern.dynamicProxy.cglib;

import ProxyPattern.dynamicProxy.jdkProxy.JdkProxy;
import ProxyPattern.staticProxy.ISubject;
import ProxyPattern.staticProxy.RealSubject;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/4/2 5:49 PM
 * @Version v1.0
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        testDemo1();
    }
    public static void testDemo1(){
//        ISubject subject1 = new RealSubject("Subject1");

        Object[] args = {"subject1"};
        Class<?>[] argTypes = {String.class};

        ISubject proxySubject1 = (RealSubject) new CglibProxy().getProxyInstance(RealSubject.class, argTypes,args);
        proxySubject1.request();
        //System.out.println(proxySubject1.hashCode());
        //System.out.println(subject1.hashCode());
    }
}
