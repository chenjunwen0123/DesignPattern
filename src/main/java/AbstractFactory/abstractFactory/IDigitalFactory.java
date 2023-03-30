package AbstractFactory.abstractFactory;

import AbstractFactory.abstractProduct.IComputer;
import AbstractFactory.abstractProduct.IMobile;

public interface IDigitalFactory {
    IMobile produceMobile();
    IComputer produceComputer();
}
