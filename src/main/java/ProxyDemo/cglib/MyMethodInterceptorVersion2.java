package ProxyDemo.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年04月03日 14:49
 */
public class MyMethodInterceptorVersion2 implements MethodInterceptor {
    private Object realSubject;

    public MyMethodInterceptorVersion2(Object realSubject){
        this.realSubject = realSubject;
    }
    public void before(){
        System.out.println("Version2: before running");
    }
    public void after(){
        System.out.println("Version2: after running");
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        // Object result = methodProxy.invokeSuper(o,objects);
        Object result = method.invoke(this.realSubject,objects);
        after();
        return result;
    }
}
