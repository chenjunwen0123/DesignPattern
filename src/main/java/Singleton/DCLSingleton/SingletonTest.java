package Singleton.DCLSingleton;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 17:41
 */
public class SingletonTest {
    public static void main(String[] args) {
        for(int i = 0;i < 4; ++i){
            Thread thread = new Thread(new Executor());
            thread.start();
        }
    }

}
