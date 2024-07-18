 /*************************************************
 * Coordinates class
 * @author Luca Macavero, 755091, lmacavero@studenti.uninsubria.it, VA
 *
 */
package uni.climatemonitor.common;
import java.io.Serializable;
import java.sql.Date;


public class ClimateParameter implements Serializable {
    static final long serialVersionUID = 1L;

    String geonameId;
    int wind;
    int humidity;
    int pressure;
    int temperature;
    int rainfall;
    int glaciersAlt;
    int glaciersMass;
    String notes;
    Date date;
    MonitoringCenter monitoringCenter;
    String who;

    /**
     * constructor
     */
    public ClimateParameter(String geonameId, int wind, int humidity, int pressure, int temperature, int rainfall,
                     int glaciersAlt, int glaciersMass, String notes, Date date, MonitoringCenter monitoringCenter, String who ) {
        this.geonameId = geonameId;
        this.wind = wind;
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        this.rainfall = rainfall;
        this.glaciersAlt = glaciersAlt;
        this.glaciersMass = glaciersMass;
        this.notes = notes;
        this.date = date;
        this.monitoringCenter = monitoringCenter;
        this.who = who;
    }
}