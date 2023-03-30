package AbstractFactory.Huawei;

import AbstractFactory.Huawei.mobile.HuaweiMobile;
import AbstractFactory.abstractFactory.I5GBaseFactory;
import AbstractFactory.abstractFactory.IDigitalFactory;
import AbstractFactory.abstractProduct.I5GBase;
import AbstractFactory.abstractProduct.IComputer;
import AbstractFactory.Huawei.baseStation.LocalAreaBaseStation;
import AbstractFactory.Huawei.baseStation.MediumRangeBaseStation;
import AbstractFactory.Huawei.baseStation.WideAreaBaseStation;
import AbstractFactory.Huawei.computer.HuaweiComputer;
import AbstractFactory.abstractProduct.IMobile;


/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 11:32
 */
public class HuaweiFactory implements IDigitalFactory, I5GBaseFactory {
    @Override
    public I5GBase produceBaseStation(String type) {
        I5GBase base = null;
        switch(type){
            case "wide":
                base = new WideAreaBaseStation();
                break;
            case "medium":
                base = new MediumRangeBaseStation();
                break;
            case "local":
                base = new LocalAreaBaseStation();
                break;
            default:
                throw new RuntimeException("没有该类型的基站");
        }
        return base;
    }

    @Override
    public IMobile produceMobile() {
        return new HuaweiMobile();
    }

    @Override
    public IComputer produceComputer() {
        return new HuaweiComputer();
    }
}
