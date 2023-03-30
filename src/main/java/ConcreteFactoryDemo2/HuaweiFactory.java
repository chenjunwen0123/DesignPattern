package ConcreteFactoryDemo2;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 10:02
 */
public class HuaweiFactory extends Factory{
    @Override
    public IMobile produceMobile() {
        return new HuaweiMobile();
    }
}
