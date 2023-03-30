package AbstractFactory.Huawei.mobile;

import AbstractFactory.abstractProduct.IMobile;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 11:51
 */
public class HuaweiMobile implements IMobile {
    @Override
    public void showMobile() {
        System.out.println("Hi，华为手机");
    }
}
