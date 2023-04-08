package ProxyPattern.staticProxy;

import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/4/2 1:10 PM
 * @Version v1.0
 */
public class StaticProxyDemo1 {
    public static void main(String[] args) {
        demo();
    }

    public static void demo(){
        ISubject realSubject1 = new RealSubject("subject1");
        ISubject realSubject2 = new RealSubject("subject2");

        ProxySubject proxySubject = new ProxySubject(realSubject1);
        proxySubject.request();

        proxySubject = new ProxySubject(realSubject2);
        proxySubject.request();
    }
}
