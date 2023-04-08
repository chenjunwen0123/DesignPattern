package ProxyDemo;

import ProxyDemo.cglib.MyMethodInterceptor;
import ProxyDemo.cglib.MyMethodInterceptorVersion2;
import ProxyDemo.jdk.MyInvocationHandler;
import ProxyDemo.pojo.IPerson;
import ProxyDemo.pojo.Student;
import ProxyDemo.pojo.UserServiceImpl;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.*;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年04月03日 13:41
 */
public class ProxyTest {
    public static void main(String[] args) {
        cglibTest();
    }

    public static void jdkTest(){
        Student huihui = new Student("Huihui");
        Student honghong = new Student("Honghong");

        IPerson huihuiProxy = (IPerson) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(),
                Student.class.getInterfaces(),
                new MyInvocationHandler(honghong)
                );
        IPerson honghongProxy = (IPerson) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(),
                Student.class.getInterfaces(),
                new MyInvocationHandler(honghong)
        );
        // 里式替换原则，返回的是实现了Student的接口（IPerson）的代理类，所以只能强转成IPerson不能转成Student

        huihuiProxy.sayHi();
        huihui.sayHi();

        honghongProxy.sayHi();
        honghong.sayHi();
    }

    public static void cglibTest(){
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "H://cglib_proxy_classes");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        UserServiceImpl userServiceRealSubject = new UserServiceImpl("NotProxy");
        enhancer.setCallback(new MyMethodInterceptor(userServiceRealSubject));
        UserServiceImpl userService = (UserServiceImpl) enhancer.create();

        System.out.println("RealSubject:" + userServiceRealSubject.hashCode());
        userService.addUser();
    }
}
