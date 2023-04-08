package ProxyPattern.dynamicProxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/4/2 4:56 PM
 * @Version v1.0
 */
public class JdkProxy implements InvocationHandler {
    private Object realSubject;
    public Object getProxyInstance(Object realSubject){
        this.realSubject = realSubject;
        Class<?> cls = realSubject.getClass();
        ClassLoader classLoader = this.getClass().getClassLoader();
        System.out.println("JdkProxy.classLoader :" + classLoader);
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),cls.getInterfaces(),this);
    }

    private void before(){
        System.out.println("before [" + this.realSubject.hashCode() + "] invoking");
    }
    private void after(){
        System.out.println("after [" + this.realSubject.hashCode() + "] invoking");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.realSubject, args);
        after();
        return result;
    }
}
