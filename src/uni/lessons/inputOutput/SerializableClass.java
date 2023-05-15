package src.uni.lessons.inputOutput;

import java.io.*;

public class SerializableClass implements Serializable {
    String str;
    int i;
    double d;

    public SerializableClass(String str, int i, double d) {
        this.str = str;
        this.i = i;
        this.d = d;
    }

    public String toString() {
        return "str = " + str + ", i = " + ", d = " + d;
    }
}

class SerializationDemo {
    public static void main(String[] args) throws Exception {
        SerializableClass obj1 = new SerializableClass("A string", 1, 10.20);
        System.out.println("Obj1 " + obj1);

        FileOutputStream fo = new FileOutputStream("serial");
        ObjectOutputStream oo = new ObjectOutputStream(fo);

        oo.writeObject(obj1);
        oo.flush();
        oo.close();

        SerializableClass obj2;
        FileInputStream fi = new FileInputStream("serial");
        ObjectInputStream ois = new ObjectInputStream(fi);

        obj2 = (SerializableClass) ois.readObject();
        ois.close();

        System.out.println(obj2);
    }
}
