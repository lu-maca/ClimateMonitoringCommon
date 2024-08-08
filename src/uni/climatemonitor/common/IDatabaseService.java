package uni.climatemonitor.common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * This interface exposes services to query the DB
 */
public interface IDatabaseService extends Remote {

    public Operator operatorExists(String username) throws RemoteException;
    public boolean pushOperator(Operator o) throws RemoteException;
    public boolean isOperatorEnabledForLocation(String username, Location l) throws RemoteException;
    public MonitoringCenter getMonitoringCenterForOperator(String username) throws RemoteException;

    public ArrayList<Location> filterLocationsByName(String filterOnName) throws RemoteException;
    public ArrayList<Location> filterLocationsByCoordinates(Coordinates coordinates) throws RemoteException;
    public boolean locationExists(Location l) throws RemoteException;
    public boolean pushLocation(Location l) throws RemoteException;

    public ClimateParameter getClimateParameterForDate(Location l, LocalDate date) throws RemoteException;
    public boolean pushClimateParameter(ClimateParameter p) throws RemoteException;
    public ArrayList<ClimateParameter> getClimateParameterHistory(Location l) throws RemoteException;

    public MonitoringCenter getMonitoringCenterFromName(String name) throws RemoteException;

    /**
     *
     * @param c
     * @param monitoredAreas
     * @return the id of the new monitoring center
     * @throws RemoteException
     */
    public String pushMonitoringCenter(MonitoringCenter c, ArrayList<String> monitoredAreas) throws RemoteException;
    public boolean isMonitoringCentersTableEmpty() throws RemoteException;
    public ArrayList<MonitoringCenter> getAllMonitoringCenters() throws RemoteException;

    public boolean addLocationToMonitoringCenter(Location l, MonitoringCenter mc) throws RemoteException;
}
