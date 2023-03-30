package AbstractFactory.Xiaomi;

import AbstractFactory.Xiaomi.mobile.XiaomiMobile;
import AbstractFactory.abstractFactory.IDigitalFactory;
import AbstractFactory.abstractProduct.IComputer;
import AbstractFactory.Xiaomi.computer.XiaomiComputer;
import AbstractFactory.abstractProduct.IMobile;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 11:44
 */
public class XiaomiFactory implements IDigitalFactory {
    @Override
    public IMobile produceMobile() {
        return new XiaomiMobile();
    }
    @Override
    public IComputer produceComputer() {
        return new XiaomiComputer();
    }
}
