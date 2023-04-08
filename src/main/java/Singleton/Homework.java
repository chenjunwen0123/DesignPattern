//package Singleton;
//
//import Singleton.HungrySingleton.HungrySingleton;
//import Singleton.RegisterSingleton.EnumSingleton;
//import Singleton.SerializableSingleton.Singleton;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @Description TODO
// * @Author whi5p3r
// * @Date 2023/4/1 8:40 PM
// * @Version v1.0
// */
//public class Homework {
//}
//
//
//class HungrySingletonDemo {
//    private static final HungrySingletonDemo singleton = new HungrySingletonDemo();
//    private HungrySingletonDemo() {}
//    public HungrySingletonDemo getInstance(){
//        return singleton;
//    }
//}
//
//// 基本写法
//class LazySingletonDemo {
//    private static  LazySingletonDemo singleton;
//    private LazySingletonDemo () {}
//    public LazySingletonDemo getInstance(){
//        if(singleton == null){
//            singleton = new LazySingletonDemo();
//        }
//        return singleton;
//    }
//}
//// 线程安全写法
//class LazySingletonDemo {
//    private static  LazySingletonDemo singleton;
//    private LazySingletonDemo () {}
//    public synchronized LazySingletonDemo getInstance(){
//        if(singleton == null){
//            singleton = new LazySingletonDemo();
//        }
//        return singleton;
//    }
//}
//
//
//// DCL解决线程安全和指令重排问题
//class LazySingletonDemo {
//    private static volatile LazySingletonDemo singleton;
//    private LazySingletonDemo () {}
//    public LazySingletonDemo getInstance(){
//        if(singleton == null){
//            synchronized (LazySingletonDemo.class) {
//                if(singleton == null) {
//                    singleton = new LazySingletonDemo();
//                }
//            }
//        }
//        return singleton;
//    }
//}
//
//// 枚举式单例
//enum EnumSingletonDemo {
//    INSTANCE_ONE("1","one"),
//    INSTANCE_TWO("2","two")
//    ;
//    private final String key;
//    private final String val;
//
//    // 枚举类中构造函数默认是private
//    EnumSingletonDemo(String key, String val) {
//        this.key = key;
//        this.val = val;
////        setKey(s);
////        setVal(one);
//    }
//
////    public String getKey() {
////        return key;
////    }
////
////    public void setKey(String key) {
////        this.key = key;
////    }
////
////    public String getVal() {
////        return val;
////    }
////
////    public void setVal(String val) {
////        this.val = val;
////    }
//}
//
//// 容器式单例
//class ContainerSingletonDemo{
//    private static final Map<String,Object> container = new HashMap<>();
//    private ContainerSingletonDemo () {}
//    public static Object getInstance(String className){
//        if(!container.containsKey(className)){
//            Object obj = null;
//            try {
//                obj = Class.forName(className).newInstance();
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//            container.put(className,obj);
//        }
//        return container.get(className);
//    }
//}
//
//// 线程安全：DCL
//class ContainerSingletonDemo{
//    private static volatile Map<String,Object> container = null;
//    private ContainerSingletonDemo () {}
//    public static Object getInstance(String className){
//        if(container == null){
//            synchronized (ContainerSingletonDemo.class){
//                if(container == null){
//                    container = new HashMap<>();
//                }
//            }
//        }
//        Object instance = container.get(className);
//        if(instance == null){
//            synchronized (ContainerSingletonDemo.class){
//                instance = container.get(className);
//                if(instance == null){
//                    try {
//                        instance = Class.forName(className).newInstance();
//                        container.put(className,instance);
//                    } catch (Exception e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        }
//        return instance;
//    }
//}