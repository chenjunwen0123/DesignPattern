package ProxyDemo.pojo;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年04月03日 14:34
 */
public class UserServiceImpl {
    private String name;
    public UserServiceImpl(){
        this.name = "proxy";
    }
    public UserServiceImpl(String name){
        this.name = name;
    }
    public void addUser(){
        System.out.println(this.name  + "(" + this.hashCode() +  ")" + ": addUser() is running!");
    }
}
