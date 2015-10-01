/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trainertable;

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
@Table(name = "trainer", catalog = "termproject", schema = "")
@NamedQueries({
    @NamedQuery(name = "Trainer.findAll", query = "SELECT t FROM Trainer t"),
    @NamedQuery(name = "Trainer.findByTrainerID", query = "SELECT t FROM Trainer t WHERE t.trainerID = :trainerID"),
    @NamedQuery(name = "Trainer.findByTrainerLastName", query = "SELECT t FROM Trainer t WHERE t.trainerLastName = :trainerLastName"),
    @NamedQuery(name = "Trainer.findByTrainerFirstName", query = "SELECT t FROM Trainer t WHERE t.trainerFirstName = :trainerFirstName"),
    @NamedQuery(name = "Trainer.findByTrainerEmail", query = "SELECT t FROM Trainer t WHERE t.trainerEmail = :trainerEmail"),
    @NamedQuery(name = "Trainer.findByTrainerPhone", query = "SELECT t FROM Trainer t WHERE t.trainerPhone = :trainerPhone")})
public class Trainer implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TrainerID")
    private Integer trainerID;
    @Basic(optional = false)
    @Column(name = "TrainerLastName")
    private String trainerLastName;
    @Basic(optional = false)
    @Column(name = "TrainerFirstName")
    private String trainerFirstName;
    @Basic(optional = false)
    @Column(name = "TrainerEmail")
    private String trainerEmail;
    @Basic(optional = false)
    @Column(name = "TrainerPhone")
    private String trainerPhone;

    public Trainer() {
    }

    public Trainer(Integer trainerID) {
        this.trainerID = trainerID;
    }

    public Trainer(Integer trainerID, String trainerLastName, String trainerFirstName, String trainerEmail, String trainerPhone) {
        this.trainerID = trainerID;
        this.trainerLastName = trainerLastName;
        this.trainerFirstName = trainerFirstName;
        this.trainerEmail = trainerEmail;
        this.trainerPhone = trainerPhone;
    }

    public Integer getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(Integer trainerID) {
        Integer oldTrainerID = this.trainerID;
        this.trainerID = trainerID;
        changeSupport.firePropertyChange("trainerID", oldTrainerID, trainerID);
    }

    public String getTrainerLastName() {
        return trainerLastName;
    }

    public void setTrainerLastName(String trainerLastName) {
        String oldTrainerLastName = this.trainerLastName;
        this.trainerLastName = trainerLastName;
        changeSupport.firePropertyChange("trainerLastName", oldTrainerLastName, trainerLastName);
    }

    public String getTrainerFirstName() {
        return trainerFirstName;
    }

    public void setTrainerFirstName(String trainerFirstName) {
        String oldTrainerFirstName = this.trainerFirstName;
        this.trainerFirstName = trainerFirstName;
        changeSupport.firePropertyChange("trainerFirstName", oldTrainerFirstName, trainerFirstName);
    }

    public String getTrainerEmail() {
        return trainerEmail;
    }

    public void setTrainerEmail(String trainerEmail) {
        String oldTrainerEmail = this.trainerEmail;
        this.trainerEmail = trainerEmail;
        changeSupport.firePropertyChange("trainerEmail", oldTrainerEmail, trainerEmail);
    }

    public String getTrainerPhone() {
        return trainerPhone;
    }

    public void setTrainerPhone(String trainerPhone) {
        String oldTrainerPhone = this.trainerPhone;
        this.trainerPhone = trainerPhone;
        changeSupport.firePropertyChange("trainerPhone", oldTrainerPhone, trainerPhone);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trainerID != null ? trainerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainer)) {
            return false;
        }
        Trainer other = (Trainer) object;
        if ((this.trainerID == null && other.trainerID != null) || (this.trainerID != null && !this.trainerID.equals(other.trainerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "trainertable.Trainer[ trainerID=" + trainerID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
