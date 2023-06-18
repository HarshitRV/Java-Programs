package src.uni.lessons.javarmi;

import java.rmi.*;

public class TimeClient {
    public static void main(String[] args) throws Exception {

        PerfectTimeI local = (PerfectTimeI) Naming.lookup("//localhost:8052/object");
        System.out.println("This is client");
        System.out.println(local.getPerfectTime());
    }
}
