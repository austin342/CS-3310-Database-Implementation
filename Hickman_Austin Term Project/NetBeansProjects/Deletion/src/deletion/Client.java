/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deletion;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Austin
 */
@Entity
@Table(name = "client", catalog = "termproject2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c"),
    @NamedQuery(name = "Client.findByClientNumber", query = "SELECT c FROM Client c WHERE c.clientNumber = :clientNumber"),
    @NamedQuery(name = "Client.findByClientLastName", query = "SELECT c FROM Client c WHERE c.clientLastName = :clientLastName"),
    @NamedQuery(name = "Client.findByClientFirstName", query = "SELECT c FROM Client c WHERE c.clientFirstName = :clientFirstName"),
    @NamedQuery(name = "Client.findByClientPhone", query = "SELECT c FROM Client c WHERE c.clientPhone = :clientPhone"),
    @NamedQuery(name = "Client.findByClientEmail", query = "SELECT c FROM Client c WHERE c.clientEmail = :clientEmail"),
    @NamedQuery(name = "Client.findByClientState", query = "SELECT c FROM Client c WHERE c.clientState = :clientState"),
    @NamedQuery(name = "Client.findByClientCity", query = "SELECT c FROM Client c WHERE c.clientCity = :clientCity"),
    @NamedQuery(name = "Client.findByClientStreet", query = "SELECT c FROM Client c WHERE c.clientStreet = :clientStreet"),
    @NamedQuery(name = "Client.findByClientAddress", query = "SELECT c FROM Client c WHERE c.clientAddress = :clientAddress"),
    @NamedQuery(name = "Client.findByClientZipCode", query = "SELECT c FROM Client c WHERE c.clientZipCode = :clientZipCode")})
public class Client implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ClientNumber")
    private Integer clientNumber;
    @Basic(optional = false)
    @Column(name = "ClientLastName")
    private String clientLastName;
    @Basic(optional = false)
    @Column(name = "ClientFirstName")
    private String clientFirstName;
    @Basic(optional = false)
    @Column(name = "ClientPhone")
    private String clientPhone;
    @Basic(optional = false)
    @Column(name = "ClientEmail")
    private String clientEmail;
    @Basic(optional = false)
    @Column(name = "ClientState")
    private String clientState;
    @Basic(optional = false)
    @Column(name = "ClientCity")
    private String clientCity;
    @Basic(optional = false)
    @Column(name = "ClientStreet")
    private String clientStreet;
    @Basic(optional = false)
    @Column(name = "ClientAddress")
    private String clientAddress;
    @Basic(optional = false)
    @Column(name = "ClientZipCode")
    private int clientZipCode;

    public Client() {
    }

    public Client(Integer clientNumber) {
        this.clientNumber = clientNumber;
    }

    public Client(Integer clientNumber, String clientLastName, String clientFirstName, String clientPhone, String clientEmail, String clientState, String clientCity, String clientStreet, String clientAddress, int clientZipCode) {
        this.clientNumber = clientNumber;
        this.clientLastName = clientLastName;
        this.clientFirstName = clientFirstName;
        this.clientPhone = clientPhone;
        this.clientEmail = clientEmail;
        this.clientState = clientState;
        this.clientCity = clientCity;
        this.clientStreet = clientStreet;
        this.clientAddress = clientAddress;
        this.clientZipCode = clientZipCode;
    }

    public Integer getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(Integer clientNumber) {
        Integer oldClientNumber = this.clientNumber;
        this.clientNumber = clientNumber;
        changeSupport.firePropertyChange("clientNumber", oldClientNumber, clientNumber);
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        String oldClientLastName = this.clientLastName;
        this.clientLastName = clientLastName;
        changeSupport.firePropertyChange("clientLastName", oldClientLastName, clientLastName);
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        String oldClientFirstName = this.clientFirstName;
        this.clientFirstName = clientFirstName;
        changeSupport.firePropertyChange("clientFirstName", oldClientFirstName, clientFirstName);
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        String oldClientPhone = this.clientPhone;
        this.clientPhone = clientPhone;
        changeSupport.firePropertyChange("clientPhone", oldClientPhone, clientPhone);
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        String oldClientEmail = this.clientEmail;
        this.clientEmail = clientEmail;
        changeSupport.firePropertyChange("clientEmail", oldClientEmail, clientEmail);
    }

    public String getClientState() {
        return clientState;
    }

    public void setClientState(String clientState) {
        String oldClientState = this.clientState;
        this.clientState = clientState;
        changeSupport.firePropertyChange("clientState", oldClientState, clientState);
    }

    public String getClientCity() {
        return clientCity;
    }

    public void setClientCity(String clientCity) {
        String oldClientCity = this.clientCity;
        this.clientCity = clientCity;
        changeSupport.firePropertyChange("clientCity", oldClientCity, clientCity);
    }

    public String getClientStreet() {
        return clientStreet;
    }

    public void setClientStreet(String clientStreet) {
        String oldClientStreet = this.clientStreet;
        this.clientStreet = clientStreet;
        changeSupport.firePropertyChange("clientStreet", oldClientStreet, clientStreet);
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        String oldClientAddress = this.clientAddress;
        this.clientAddress = clientAddress;
        changeSupport.firePropertyChange("clientAddress", oldClientAddress, clientAddress);
    }

    public int getClientZipCode() {
        return clientZipCode;
    }

    public void setClientZipCode(int clientZipCode) {
        int oldClientZipCode = this.clientZipCode;
        this.clientZipCode = clientZipCode;
        changeSupport.firePropertyChange("clientZipCode", oldClientZipCode, clientZipCode);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientNumber != null ? clientNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.clientNumber == null && other.clientNumber != null) || (this.clientNumber != null && !this.clientNumber.equals(other.clientNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "deletion.Client[ clientNumber=" + clientNumber + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
