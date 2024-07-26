 /*************************************************
 * Coordinates class
 * @author Luca Macavero, 755091, lmacavero@studenti.uninsubria.it, VA
 *
 */
package uni.climatemonitor.common;
import java.io.Serializable;
import java.time.LocalDate;

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
    LocalDate date;
    String who;

    /**
     * constructor
     */
    public ClimateParameter(String geonameId, int wind, int humidity, int pressure, int temperature, int rainfall,
                     int glaciersAlt, int glaciersMass, String notes, LocalDate date, String who ) {
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
        this.who = who;
    }

    public int getWind() {
        return wind;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getGlaciersAlt() {
        return glaciersAlt;
    }

    public int getGlaciersMass() {
        return glaciersMass;
    }

    public int getRainfall() {
        return rainfall;
    }

    public String getGeonameId() {
        return geonameId;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNotes() {
        return notes;
    }

    public String getWho() {
        return who;
    }
}
