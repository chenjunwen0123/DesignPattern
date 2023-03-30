package AbstractFactory.Huawei.computer;

import AbstractFactory.abstractProduct.IComputer;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 11:41
 */
public class HuaweiComputer implements IComputer {
    @Override
    public void showComputer() {
        System.out.println("Hi，华为电脑");
    }
}
