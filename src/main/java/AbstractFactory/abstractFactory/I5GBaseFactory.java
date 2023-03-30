package AbstractFactory.abstractFactory;

import AbstractFactory.abstractProduct.I5GBase;

public interface I5GBaseFactory {
    I5GBase produceBaseStation(String type);
}
