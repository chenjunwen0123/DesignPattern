package ProxyPattern.staticProxy;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/4/2 1:07 PM
 * @Version v1.0
 */
public class RealSubject implements ISubject{
    private String name;
    public RealSubject(String name){
        this.name = name;
    }
    @Override
    public void request() {
        System.out.println(name  + ":request");
    }
}
