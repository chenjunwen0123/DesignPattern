package AbstractFactory.Huawei.baseStation;

import AbstractFactory.abstractProduct.I5GBase;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 11:37
 */
public class MediumRangeBaseStation implements I5GBase {
    @Override
    public void showBaseStation() {
        System.out.println("中程基站");
    }
}
