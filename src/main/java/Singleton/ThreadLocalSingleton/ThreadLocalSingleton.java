package Singleton.ThreadLocalSingleton;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/4/1 12:20 AM
 * @Version v1.0
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton() {}
    private String value1;
    private String value2;

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }
    private ThreadLocalSingleton(String value1, String value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>() {
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
