/*************************************************
 * MonitoringCenters class
 * @author Luca Macavero, 755091, lmacavero@studenti.uninsubria.it, VA
 *
 */


package uni.climatemonitor.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Class for monitoring center, with relative methods.
 */
public class MonitoringCenter implements Serializable {
    static final long serialVersionUID = 1L;

    String name;
    String address;
    String id;

    public MonitoringCenter(String name, String address, String id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
    
    public String getId() { return id; }

    @Override
    public String toString(){
        return name;
    }

}
