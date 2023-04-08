package Singleton.RegisterSingleton;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/4/1 9:21 PM
 * @Version v1.0
 */
public enum EnumSingletonDemo {
    INSTANCE_ONE("1", "one"),
    INSTANCE_TWO("2", "two");
    private final String key;
    private final String val;

    // 枚举类中构造函数默认是private
    EnumSingletonDemo(String key, String val) {
        this.key = key;
        this.val = val;
//        setKey(s);
//        setVal(one);
    }

    public String getKey() {
        return key;
    }
    public String getVal(){
        return val;
    }
}
