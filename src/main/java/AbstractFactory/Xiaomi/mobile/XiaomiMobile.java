package AbstractFactory.Xiaomi.mobile;

import AbstractFactory.abstractProduct.IMobile;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 11:52
 */
public class XiaomiMobile implements IMobile {
    @Override
    public void showMobile() {
        System.out.println("Hi，小米手机");
    }
}
