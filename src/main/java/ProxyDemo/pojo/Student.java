package ProxyDemo.pojo;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年04月03日 14:10
 */
public class Student implements IPerson{
    private String name;
    public Student(String name) {
        this.name = name;
    }
    @Override
    public void sayHi() {
        System.out.printf("[%s(%d)]:Hello!\n", this.name, this.hashCode());
    }
}
