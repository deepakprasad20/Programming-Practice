import java.io.*;

class Dog implements Serializable{
    int i = 10 , j = 20;
}
public class SerializedDemo {
    public static void main(String...k) throws Exception {
        new ObjectOutputStream(new FileOutputStream("deepak.ser")).writeObject(new Dog());

        Dog dog = (Dog) new ObjectInputStream(new FileInputStream("deepak.ser")).readObject();
        System.out.println("i = " + dog.i + "   j = " + dog.j);
    }
}
