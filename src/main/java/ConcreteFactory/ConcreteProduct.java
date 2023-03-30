package ConcreteFactory;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 9:43
 */
public class ConcreteProduct implements IProduct {
    @Override
    public void show() {
        System.out.println("具体产品");
    }
}
