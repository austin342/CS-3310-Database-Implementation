/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Austin
 */
@Entity
@Table(name = "client", catalog = "termproject", schema = "")
@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c"),
    @NamedQuery(name = "Client.findByClientNumber", query = "SELECT c FROM Client c WHERE c.clientNumber = :clientNumber"),
    @NamedQuery(name = "Client.findByClientLastName", query = "SELECT c FROM Client c WHERE c.clientLastName = :clientLastName"),
    @NamedQuery(name = "Client.findByClientFirstName", query = "SELECT c FROM Client c WHERE c.clientFirstName = :clientFirstName"),
    @NamedQuery(name = "Client.findByClientPhone", query = "SELECT c FROM Client c WHERE c.clientPhone = :clientPhone"),
    @NamedQuery(name = "Client.findByClientEmail", query = "SELECT c FROM Client c WHERE c.clientEmail = :clientEmail"),
    @NamedQuery(name = "Client.findByClientMembershipType", query = "SELECT c FROM Client c WHERE c.clientMembershipType = :clientMembershipType"),
    @NamedQuery(name = "Client.findByClientJoinDate", query = "SELECT c FROM Client c WHERE c.clientJoinDate = :clientJoinDate"),
    @NamedQuery(name = "Client.findByMembershipExpirationDate", query = "SELECT c FROM Client c WHERE c.membershipExpirationDate = :membershipExpirationDate")})
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
    @Column(name = "ClientMembershipType")
    private String clientMembershipType;
    @Basic(optional = false)
    @Column(name = "ClientJoinDate")
    @Temporal(TemporalType.DATE)
    private Date clientJoinDate;
    @Basic(optional = false)
    @Column(name = "MembershipExpirationDate")
    @Temporal(TemporalType.DATE)
    private Date membershipExpirationDate;

    public Client() {
    }

    public Client(Integer clientNumber) {
        this.clientNumber = clientNumber;
    }

    public Client(Integer clientNumber, String clientLastName, String clientFirstName, String clientPhone, String clientEmail, String clientMembershipType, Date clientJoinDate, Date membershipExpirationDate) {
        this.clientNumber = clientNumber;
        this.clientLastName = clientLastName;
        this.clientFirstName = clientFirstName;
        this.clientPhone = clientPhone;
        this.clientEmail = clientEmail;
        this.clientMembershipType = clientMembershipType;
        this.clientJoinDate = clientJoinDate;
        this.membershipExpirationDate = membershipExpirationDate;
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

    public String getClientMembershipType() {
        return clientMembershipType;
    }

    public void setClientMembershipType(String clientMembershipType) {
        String oldClientMembershipType = this.clientMembershipType;
        this.clientMembershipType = clientMembershipType;
        changeSupport.firePropertyChange("clientMembershipType", oldClientMembershipType, clientMembershipType);
    }

    public Date getClientJoinDate() {
        return clientJoinDate;
    }

    public void setClientJoinDate(Date clientJoinDate) {
        Date oldClientJoinDate = this.clientJoinDate;
        this.clientJoinDate = clientJoinDate;
        changeSupport.firePropertyChange("clientJoinDate", oldClientJoinDate, clientJoinDate);
    }

    public Date getMembershipExpirationDate() {
        return membershipExpirationDate;
    }

    public void setMembershipExpirationDate(Date membershipExpirationDate) {
        Date oldMembershipExpirationDate = this.membershipExpirationDate;
        this.membershipExpirationDate = membershipExpirationDate;
        changeSupport.firePropertyChange("membershipExpirationDate", oldMembershipExpirationDate, membershipExpirationDate);
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
        return "client.Client[ clientNumber=" + clientNumber + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
