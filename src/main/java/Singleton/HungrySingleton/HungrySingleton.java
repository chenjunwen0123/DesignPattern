package Singleton.HungrySingleton;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 15:46
 */
public class HungrySingleton {
    // 隐藏构造函数
    private HungrySingleton () {}
    // 一次实例化
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    // 提供对外入口
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
