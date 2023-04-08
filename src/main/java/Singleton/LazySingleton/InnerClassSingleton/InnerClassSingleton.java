package Singleton.LazySingleton.InnerClassSingleton;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/3/31 12:41 AM
 * @Version v1.0
 */
public class InnerClassSingleton {
    private InnerClassSingleton () {
        if(SingletonHolder.INSTANCE != null){
            throw new RuntimeException("不允许非法访问");
        }
    }
    public InnerClassSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }
}
