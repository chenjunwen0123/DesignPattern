package ConcreteFactory;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 9:45
 */
public class ConcreteFactory extends Factory{
    @Override
    public ConcreteProduct createProduct() {
        return new ConcreteProduct();
    }
}
