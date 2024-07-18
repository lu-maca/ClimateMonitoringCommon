/*************************************************
 * Location class
 * @author Luca Macavero, 755091, lmacavero@studenti.uninsubria.it, VA
 *
 */


package uni.climatemonitor.common;

import java.io.Serializable;

/**
 * This class implements a container for Locations with associated
 * methods
 */
public class Location implements Serializable {
    static final long serialVersionUID = 1L;

    final String geonameID;
    final String name;
    final String asciiName;
    final String state;
    final Coordinates coordinates;

    /**
     * constructor
     */
    public Location(String geonameID, String name, String asciiName, String state, double latitude, double longitude) {
        this.geonameID = geonameID;
        this.name = name;
        this.asciiName = asciiName;
        this.state = state;
        this.coordinates = new Coordinates(latitude, longitude);
    }

    /**
     * override for toString
     * @return a representation of the object
     */
    @Override
    public String toString() {
        String out = asciiName + ", " + state + ", " + coordinates.toString();
        return out;
    }

    /**
     * return a representation of the object without coordinates
     */
    public String toStringNoCoordinates() {
        String out = asciiName + ", " + state;
        return out;
    }

    /**
     * state getter
     */
    public String getState() {
        return state;
    }

    /**
     * ascii_name getter
     */
    public String getAsciiName(){ return asciiName; }

    /**
     * geoname_id getter
     */
    public String getGeonameID(){ return geonameID; }

    /**
     * coordinates getter
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }
}
