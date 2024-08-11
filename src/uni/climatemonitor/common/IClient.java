package uni.climatemonitor.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IClient extends Remote {
    void updateMe(ClimateParameter cp) throws RemoteException;
}
