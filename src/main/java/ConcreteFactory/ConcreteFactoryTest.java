package ConcreteFactory;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 9:47
 */
public class ConcreteFactoryTest {
    public static void main(String[] args) {
        Factory concreteFactory = new ConcreteFactory();
        IProduct product = concreteFactory.createProduct();
        product.show();
    }
}
