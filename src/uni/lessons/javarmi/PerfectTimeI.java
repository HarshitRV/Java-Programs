package src.uni.lessons.javarmi;

import java.rmi.*;

public interface PerfectTimeI extends Remote {
    public long getPerfectTime() throws RemoteException;
}
