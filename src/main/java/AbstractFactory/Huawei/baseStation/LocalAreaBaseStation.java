package AbstractFactory.Huawei.baseStation;

import AbstractFactory.abstractProduct.I5GBase;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 11:38
 */
public class LocalAreaBaseStation implements I5GBase {
    @Override
    public void showBaseStation() {
        System.out.println("局域基站");
    }
}
