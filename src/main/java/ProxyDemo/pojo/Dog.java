package ProxyDemo.pojo;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年04月03日 14:17
 */
public class Dog implements IAnimal{
    private String name;
    public Dog(String name){
        this.name = name;
    }
    @Override
    public void eat() {
        System.out.printf("[%s(%d)]: eating!\n", this.name, this.hashCode());
    }

    @Override
    public void run() {
        System.out.printf("[%s(%d)]: running!\n", this.name, this.hashCode());
    }
}
