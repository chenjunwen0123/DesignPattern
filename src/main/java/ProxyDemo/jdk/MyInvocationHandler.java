package ProxyDemo.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年04月03日 13:50
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object object;
    public MyInvocationHandler (Object object){
        this.object = object;

    }
    private void before(){
        System.out.println("before invoke");
    }
    private void after(){
        System.out.println("after invoke");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(this.object, args);
        after();
        return null;
    }
}
