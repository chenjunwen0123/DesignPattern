package AbstractFactory;

import AbstractFactory.Huawei.HuaweiFactory;
import AbstractFactory.Xiaomi.XiaomiFactory;
import AbstractFactory.abstractFactory.IDigitalFactory;
import AbstractFactory.abstractProduct.I5GBase;
import AbstractFactory.abstractProduct.IComputer;
import AbstractFactory.abstractProduct.IMobile;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 11:53
 */
public class MainTest {
    public static void main(String[] args) {
        // 生产华为手机,华为电脑
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        IMobile huaweiMobile = huaweiFactory.produceMobile();
        IComputer huaweiComputer = huaweiFactory.produceComputer();
        huaweiMobile.showMobile();
        huaweiComputer.showComputer();


        // 生产小米手机，小米电脑
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IMobile xiaomiMobile = xiaomiFactory.produceMobile();
        IComputer xiaomiComputer = xiaomiFactory.produceComputer();
        xiaomiMobile.showMobile();
        xiaomiComputer.showComputer();

        // 建造华为5G基站
        I5GBase wideBase = huaweiFactory.produceBaseStation("wide");
        I5GBase mediumBase = huaweiFactory.produceBaseStation("medium");
        I5GBase localBase = huaweiFactory.produceBaseStation("local");

        wideBase.showBaseStation();
        mediumBase.showBaseStation();
        localBase.showBaseStation();
    }
}
