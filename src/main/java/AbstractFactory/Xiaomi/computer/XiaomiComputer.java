package AbstractFactory.Xiaomi.computer;

import AbstractFactory.abstractProduct.IComputer;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 11:42
 */
public class XiaomiComputer implements IComputer {
    @Override
    public void showComputer() {
        System.out.println("Hi，小米电脑");
    }
}
