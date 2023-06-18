package src.uni.lessons.javarmi;

import java.rmi.*;
import java.rmi.server.*;

public class PerfectTime extends UnicastRemoteObject implements PerfectTimeI{
    public PerfectTime() throws RemoteException {

    }

    @Override
    public long getPerfectTime() throws RemoteException {
        // number of ms elaspsed since
        // Jan 1 1970, Mid-night, UTC (called epoch)
        return System.currentTimeMillis();
    }
}
