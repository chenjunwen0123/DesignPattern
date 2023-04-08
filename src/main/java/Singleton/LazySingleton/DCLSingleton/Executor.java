package Singleton.LazySingleton.DCLSingleton;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月30日 17:36
 */
public class Executor implements Runnable{
        @Override
        public void run() {
            DCLSingleton dclSingleton = DCLSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + dclSingleton);
        }
}
