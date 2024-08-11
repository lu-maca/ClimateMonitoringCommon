package uni.climatemonitor.common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * This interface exposes services to query the DB
 */
public interface IDatabaseService extends Remote {
    void registerClientForLocation(IClient client, Location l) throws RemoteException;
    void unregisterClientForLocation(IClient client) throws RemoteException;

    Operator operatorExists(String username) throws RemoteException;
    boolean pushOperator(Operator o) throws RemoteException;
    boolean isOperatorEnabledForLocation(String username, Location l) throws RemoteException;
    MonitoringCenter getMonitoringCenterForOperator(String username) throws RemoteException;

    ArrayList<Location> filterLocationsByName(String filterOnName) throws RemoteException;
    ArrayList<Location> filterLocationsByCoordinates(Coordinates coordinates) throws RemoteException;
    boolean locationExists(Location l) throws RemoteException;
    boolean pushLocation(Location l) throws RemoteException;
    ArrayList<Location> getLocationsFromMonitoringCenter(String mc_id) throws RemoteException;

    ClimateParameter getClimateParameterForDate(Location l, LocalDate date) throws RemoteException;
    boolean pushClimateParameter(ClimateParameter p) throws RemoteException;
    ArrayList<ClimateParameter> getClimateParameterHistory(Location l) throws RemoteException;

    MonitoringCenter getMonitoringCenterFromName(String name) throws RemoteException;

    /**
     *
     * @param c
     * @param monitoredAreas
     * @return the id of the new monitoring center
     * @throws RemoteException
     */
    String pushMonitoringCenter(MonitoringCenter c, ArrayList<String> monitoredAreas) throws RemoteException;
    boolean isMonitoringCentersTableEmpty() throws RemoteException;
    ArrayList<MonitoringCenter> getAllMonitoringCenters() throws RemoteException;

    boolean addLocationToMonitoringCenter(Location l, MonitoringCenter mc) throws RemoteException;
}
