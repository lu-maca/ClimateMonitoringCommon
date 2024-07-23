package uni.climatemonitor.common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.ArrayList;

/**
 * This interface exposes services to query the DB
 */
public interface IDatabaseService extends Remote {

    public boolean operatorExists(String username) throws RemoteException;
    public boolean pushOperator(Operator o) throws RemoteException;
    public boolean isOperatorEnabledForLocation(Operator o, Location l) throws RemoteException;
    public MonitoringCenter getMonitoringCenterForOperator(Operator o) throws RemoteException;

    public ArrayList<Location> filterLocationsByName(String filterOnName) throws RemoteException;
    public ArrayList<Location> filterLocationsByCoordinates(Coordinates coordinates) throws RemoteException;
    public boolean locationExists(Location l) throws RemoteException;
    public boolean pushLocation(Location l) throws RemoteException;

    public ClimateParameter getClimateParameterForDate(Date date) throws RemoteException;
    public boolean pushClimateParameter(ClimateParameter p) throws RemoteException;

    public MonitoringCenter getMonitoringCenterFromName(String name) throws RemoteException;
    public boolean pushMonitoringCenter(MonitoringCenter c) throws RemoteException;
}
