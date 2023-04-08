package ProxyPattern.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/4/2 5:40 PM
 * @Version v1.0
 */
public class CglibProxy implements MethodInterceptor {
    public Object getProxyInstance(Class<?> cls, Class<?>[] argTypes, Object[] args){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create(argTypes,args);
    }
    private void before(){
        System.out.println("before invoking");
    }
    private void after(){
        System.out.println("after invoking");
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o,objects);
        after();
        return result;
    }
}
