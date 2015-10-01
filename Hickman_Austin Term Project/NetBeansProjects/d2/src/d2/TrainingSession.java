/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package d2;

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
@Table(name = "training_session", catalog = "termproject2", schema = "")
@NamedQueries({
    @NamedQuery(name = "TrainingSession.findAll", query = "SELECT t FROM TrainingSession t"),
    @NamedQuery(name = "TrainingSession.findBySessionID", query = "SELECT t FROM TrainingSession t WHERE t.sessionID = :sessionID"),
    @NamedQuery(name = "TrainingSession.findByClientNumber", query = "SELECT t FROM TrainingSession t WHERE t.clientNumber = :clientNumber"),
    @NamedQuery(name = "TrainingSession.findByTrainerID", query = "SELECT t FROM TrainingSession t WHERE t.trainerID = :trainerID"),
    @NamedQuery(name = "TrainingSession.findByTrainingStartDate", query = "SELECT t FROM TrainingSession t WHERE t.trainingStartDate = :trainingStartDate"),
    @NamedQuery(name = "TrainingSession.findByTrainingEndDate", query = "SELECT t FROM TrainingSession t WHERE t.trainingEndDate = :trainingEndDate"),
    @NamedQuery(name = "TrainingSession.findByTrainingFee", query = "SELECT t FROM TrainingSession t WHERE t.trainingFee = :trainingFee")})
public class TrainingSession implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SessionID")
    private Integer sessionID;
    @Basic(optional = false)
    @Column(name = "ClientNumber")
    private int clientNumber;
    @Basic(optional = false)
    @Column(name = "TrainerID")
    private int trainerID;
    @Column(name = "TrainingStartDate")
    @Temporal(TemporalType.DATE)
    private Date trainingStartDate;
    @Column(name = "TrainingEndDate")
    @Temporal(TemporalType.DATE)
    private Date trainingEndDate;
    @Basic(optional = false)
    @Column(name = "TrainingFee")
    private int trainingFee;

    public TrainingSession() {
    }

    public TrainingSession(Integer sessionID) {
        this.sessionID = sessionID;
    }

    public TrainingSession(Integer sessionID, int clientNumber, int trainerID, int trainingFee) {
        this.sessionID = sessionID;
        this.clientNumber = clientNumber;
        this.trainerID = trainerID;
        this.trainingFee = trainingFee;
    }

    public Integer getSessionID() {
        return sessionID;
    }

    public void setSessionID(Integer sessionID) {
        Integer oldSessionID = this.sessionID;
        this.sessionID = sessionID;
        changeSupport.firePropertyChange("sessionID", oldSessionID, sessionID);
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        int oldClientNumber = this.clientNumber;
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

    public Date getTrainingStartDate() {
        return trainingStartDate;
    }

    public void setTrainingStartDate(Date trainingStartDate) {
        Date oldTrainingStartDate = this.trainingStartDate;
        this.trainingStartDate = trainingStartDate;
        changeSupport.firePropertyChange("trainingStartDate", oldTrainingStartDate, trainingStartDate);
    }

    public Date getTrainingEndDate() {
        return trainingEndDate;
    }

    public void setTrainingEndDate(Date trainingEndDate) {
        Date oldTrainingEndDate = this.trainingEndDate;
        this.trainingEndDate = trainingEndDate;
        changeSupport.firePropertyChange("trainingEndDate", oldTrainingEndDate, trainingEndDate);
    }

    public int getTrainingFee() {
        return trainingFee;
    }

    public void setTrainingFee(int trainingFee) {
        int oldTrainingFee = this.trainingFee;
        this.trainingFee = trainingFee;
        changeSupport.firePropertyChange("trainingFee", oldTrainingFee, trainingFee);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sessionID != null ? sessionID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrainingSession)) {
            return false;
        }
        TrainingSession other = (TrainingSession) object;
        if ((this.sessionID == null && other.sessionID != null) || (this.sessionID != null && !this.sessionID.equals(other.sessionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "d2.TrainingSession[ sessionID=" + sessionID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
