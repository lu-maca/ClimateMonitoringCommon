/*************************************************
 * Operator class
 * @author Luca Macavero, 755091, lmacavero@studenti.uninsubria.it, VA
 *
 */


package uni.climatemonitor.common;

import java.io.Serializable;

/**
 * Class that represents an operator and the associated methods
 */
public class Operator implements Serializable {
    static final long serialVersionUID = 1L;

    String name;
    String taxCode;
    String email;
    String username;
    String password;
    MonitoringCenter monitoringCenter;

    public Operator(String name, String taxCode, String email, String username, String password, MonitoringCenter monitoringCenter){
        this.name = name;
        this.taxCode = taxCode;
        this.email = email;
        this.username = username;
        this.password = password;
        this.monitoringCenter = monitoringCenter;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public MonitoringCenter getMonitoringCenter() {
        return monitoringCenter;
    }

    public String getPassword() {
        return password;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString(){ return getUsername(); }
}
