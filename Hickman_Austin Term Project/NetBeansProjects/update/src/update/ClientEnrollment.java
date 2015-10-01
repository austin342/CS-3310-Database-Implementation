/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package update;

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
@Table(name = "client_enrollment", catalog = "termproject2", schema = "")
@NamedQueries({
    @NamedQuery(name = "ClientEnrollment.findAll", query = "SELECT c FROM ClientEnrollment c"),
    @NamedQuery(name = "ClientEnrollment.findByClientNumber", query = "SELECT c FROM ClientEnrollment c WHERE c.clientNumber = :clientNumber"),
    @NamedQuery(name = "ClientEnrollment.findByTrainerID", query = "SELECT c FROM ClientEnrollment c WHERE c.trainerID = :trainerID"),
    @NamedQuery(name = "ClientEnrollment.findByClassesSubscribed", query = "SELECT c FROM ClientEnrollment c WHERE c.classesSubscribed = :classesSubscribed"),
    @NamedQuery(name = "ClientEnrollment.findByAmountPaid", query = "SELECT c FROM ClientEnrollment c WHERE c.amountPaid = :amountPaid")})
public class ClientEnrollment implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ClientNumber")
    private Integer clientNumber;
    @Basic(optional = false)
    @Column(name = "TrainerID")
    private int trainerID;
    @Basic(optional = false)
    @Column(name = "ClassesSubscribed")
    private String classesSubscribed;
    @Basic(optional = false)
    @Column(name = "AmountPaid")
    private String amountPaid;

    public ClientEnrollment() {
    }

    public ClientEnrollment(Integer clientNumber) {
        this.clientNumber = clientNumber;
    }

    public ClientEnrollment(Integer clientNumber, int trainerID, String classesSubscribed, String amountPaid) {
        this.clientNumber = clientNumber;
        this.trainerID = trainerID;
        this.classesSubscribed = classesSubscribed;
        this.amountPaid = amountPaid;
    }

    public Integer getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(Integer clientNumber) {
        Integer oldClientNumber = this.clientNumber;
        this.clientNumber = clientNumber;
        changeSupport.firePropertyChange("clientNumber", oldClientNumber, clientNumber);
    }

    public int getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(int trainerID) {
        int oldTrainerID = this.trainerID;
        this.trainerID = trainerID;
        changeSupport.firePropertyChange("trainerID", oldTrainerID, trainerID);
    }

    public String getClassesSubscribed() {
        return classesSubscribed;
    }

    public void setClassesSubscribed(String classesSubscribed) {
        String oldClassesSubscribed = this.classesSubscribed;
        this.classesSubscribed = classesSubscribed;
        changeSupport.firePropertyChange("classesSubscribed", oldClassesSubscribed, classesSubscribed);
    }

    public String getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(String amountPaid) {
        String oldAmountPaid = this.amountPaid;
        this.amountPaid = amountPaid;
        changeSupport.firePropertyChange("amountPaid", oldAmountPaid, amountPaid);
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
        if (!(object instanceof ClientEnrollment)) {
            return false;
        }
        ClientEnrollment other = (ClientEnrollment) object;
        if ((this.clientNumber == null && other.clientNumber != null) || (this.clientNumber != null && !this.clientNumber.equals(other.clientNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "update.ClientEnrollment[ clientNumber=" + clientNumber + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
