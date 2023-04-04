package ProxyDemo.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年04月03日 14:46
 */
public class MyMethodInterceptor implements MethodInterceptor {
    private Object realSubject;

    public MyMethodInterceptor(Object realSubject) {
        this.realSubject = realSubject;
    }
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before Running");
        Object result = method.invoke(realSubject,objects);
        System.out.println("after Running");
        return result;
    }
}
