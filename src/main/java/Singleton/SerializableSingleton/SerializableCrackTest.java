package Singleton.SerializableSingleton;

import java.io.*;

/**
 * @Description TODO
 * @Author whi5p3r
 * @Date 2023/3/31 10:36 PM
 * @Version v1.0
 */
public class SerializableCrackTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = null;

        FileOutputStream fos = new FileOutputStream("singleton.obj");
        ObjectOutputStream outputStream = new ObjectOutputStream(fos);
        outputStream.writeObject(s1);
        outputStream.flush();
        outputStream.close();


        FileInputStream fis = new FileInputStream("singleton.obj");
        ObjectInputStream inputStream = new ObjectInputStream(fis);
        Object s3 = inputStream.readObject();
        System.out.println(s3);
        //s2 = (Singleton) inputStream.readObject();
        inputStream.close();

        //System.out.println(s1);  // Singleton@232204a1
        //System.out.println(s2);  // Singleton@58372a00
        fos.close();
        fis.close();
    }
}
