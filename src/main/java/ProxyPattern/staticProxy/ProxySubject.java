package ProxyPattern.staticProxy;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/4/2 1:08 PM
 * @Version v1.0
 */
public class ProxySubject implements ISubject{
    private ISubject realSubject;
    public ProxySubject (ISubject realSubject){
        this.realSubject = realSubject;
    }
    public void before(){
        System.out.println("before request");
    }
    public void after(){
        System.out.println("after request");
    }
    @Override
    public void request() {
        before();
        realSubject.request();
        after();
    }
}
