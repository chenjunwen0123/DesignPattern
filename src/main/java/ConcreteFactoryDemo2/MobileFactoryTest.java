package ConcreteFactoryDemo2;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 10:03
 */
public class MobileFactoryTest {
    public static void main(String[] args) {
        Factory huaweiMobileFactory = new HuaweiFactory();
        IMobile huaweiMobile = huaweiMobileFactory.produceMobile();
        huaweiMobile.show();

        Factory xiaomiMobileFactory = new XiaomiFactory();
        IMobile xiaomiMobile = xiaomiMobileFactory.produceMobile();
        xiaomiMobile.show();
    }
}
