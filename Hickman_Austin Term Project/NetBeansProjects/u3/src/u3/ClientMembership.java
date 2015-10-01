/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package u3;

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
@Table(name = "client_membership", catalog = "termproject2", schema = "")
@NamedQueries({
    @NamedQuery(name = "ClientMembership.findAll", query = "SELECT c FROM ClientMembership c"),
    @NamedQuery(name = "ClientMembership.findByMembershipID", query = "SELECT c FROM ClientMembership c WHERE c.membershipID = :membershipID"),
    @NamedQuery(name = "ClientMembership.findByClientNumber", query = "SELECT c FROM ClientMembership c WHERE c.clientNumber = :clientNumber"),
    @NamedQuery(name = "ClientMembership.findByMembershipType", query = "SELECT c FROM ClientMembership c WHERE c.membershipType = :membershipType"),
    @NamedQuery(name = "ClientMembership.findByMembershipStartDate", query = "SELECT c FROM ClientMembership c WHERE c.membershipStartDate = :membershipStartDate"),
    @NamedQuery(name = "ClientMembership.findByMembershipEndDate", query = "SELECT c FROM ClientMembership c WHERE c.membershipEndDate = :membershipEndDate")})
public class ClientMembership implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MembershipID")
    private Integer membershipID;
    @Basic(optional = false)
    @Column(name = "ClientNumber")
    private int clientNumber;
    @Basic(optional = false)
    @Column(name = "MembershipType")
    private String membershipType;
    @Basic(optional = false)
    @Column(name = "MembershipStartDate")
    @Temporal(TemporalType.DATE)
    private Date membershipStartDate;
    @Basic(optional = false)
    @Column(name = "MembershipEndDate")
    @Temporal(TemporalType.DATE)
    private Date membershipEndDate;

    public ClientMembership() {
    }

    public ClientMembership(Integer membershipID) {
        this.membershipID = membershipID;
    }

    public ClientMembership(Integer membershipID, int clientNumber, String membershipType, Date membershipStartDate, Date membershipEndDate) {
        this.membershipID = membershipID;
        this.clientNumber = clientNumber;
        this.membershipType = membershipType;
        this.membershipStartDate = membershipStartDate;
        this.membershipEndDate = membershipEndDate;
    }

    public Integer getMembershipID() {
        return membershipID;
    }

    public void setMembershipID(Integer membershipID) {
        Integer oldMembershipID = this.membershipID;
        this.membershipID = membershipID;
        changeSupport.firePropertyChange("membershipID", oldMembershipID, membershipID);
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        int oldClientNumber = this.clientNumber;
        this.clientNumber = clientNumber;
        changeSupport.firePropertyChange("clientNumber", oldClientNumber, clientNumber);
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        String oldMembershipType = this.membershipType;
        this.membershipType = membershipType;
        changeSupport.firePropertyChange("membershipType", oldMembershipType, membershipType);
    }

    public Date getMembershipStartDate() {
        return membershipStartDate;
    }

    public void setMembershipStartDate(Date membershipStartDate) {
        Date oldMembershipStartDate = this.membershipStartDate;
        this.membershipStartDate = membershipStartDate;
        changeSupport.firePropertyChange("membershipStartDate", oldMembershipStartDate, membershipStartDate);
    }

    public Date getMembershipEndDate() {
        return membershipEndDate;
    }

    public void setMembershipEndDate(Date membershipEndDate) {
        Date oldMembershipEndDate = this.membershipEndDate;
        this.membershipEndDate = membershipEndDate;
        changeSupport.firePropertyChange("membershipEndDate", oldMembershipEndDate, membershipEndDate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (membershipID != null ? membershipID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientMembership)) {
            return false;
        }
        ClientMembership other = (ClientMembership) object;
        if ((this.membershipID == null && other.membershipID != null) || (this.membershipID != null && !this.membershipID.equals(other.membershipID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "u3.ClientMembership[ membershipID=" + membershipID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
