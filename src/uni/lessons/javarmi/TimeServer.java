package src.uni.lessons.javarmi;

import java.rmi.*;

public class TimeServer {
    public static void main(String[] args) throws Exception{
        PerfectTimeI rmObj = new PerfectTime();

        //
        // Default port number rum 1099
        Naming.rebind("//localhost:8052/object", rmObj);
        System.out.println("Ready to go");
    }
}
