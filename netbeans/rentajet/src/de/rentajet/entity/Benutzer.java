/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.entity;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author j.schipplick
 */
@Entity
@Table(name = "benutzer")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Benutzer.findAll", query = "SELECT b FROM Benutzer b"),
	@NamedQuery(name = "Benutzer.findById", query = "SELECT b FROM Benutzer b WHERE b.id = :id"),
	@NamedQuery(name = "Benutzer.findByNummer", query = "SELECT b FROM Benutzer b WHERE b.nummer = :nummer"),
	@NamedQuery(name = "Benutzer.findByVorname", query = "SELECT b FROM Benutzer b WHERE b.vorname = :vorname"),
	@NamedQuery(name = "Benutzer.findByNachname", query = "SELECT b FROM Benutzer b WHERE b.nachname = :nachname"),
	@NamedQuery(name = "Benutzer.findByInitialen", query = "SELECT b FROM Benutzer b WHERE b.initialen = :initialen"),
	@NamedQuery(name = "Benutzer.findByLogin", query = "SELECT b FROM Benutzer b WHERE b.login = :login"),
	@NamedQuery(name = "Benutzer.findByPasswort", query = "SELECT b FROM Benutzer b WHERE b.passwort = :passwort"),
	@NamedQuery(name = "Benutzer.findByGesperrt", query = "SELECT b FROM Benutzer b WHERE b.gesperrt = :gesperrt"),
	@NamedQuery(name = "Benutzer.findByBenutzergruppeID", query = "SELECT b FROM Benutzer b WHERE b.benutzergruppeID = :benutzergruppeID")})
public class Benutzer implements Serializable {
	@Transient
	private PropertyChangeSupport changeSupport = new PropertyChangeSupport( this );
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "Nummer")
	private Integer nummer;
	@Column(name = "Vorname")
	private String vorname;
	@Column(name = "Nachname")
	private String nachname;
	@Column(name = "Initialen")
	private String initialen;
	@Column(name = "Login")
	private String login;
	@Column(name = "Passwort")
	private String passwort;
	@Column(name = "Gesperrt")
	private Boolean gesperrt;
	@Column(name = "BenutzergruppeID")
	private Integer benutzergruppeID;

	public Benutzer() {
	}

	public Benutzer( Integer id ) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId( Integer id ) {
		Integer oldId = this.id;
		this.id = id;
		changeSupport.firePropertyChange( "id", oldId, id );
	}

	public Integer getNummer() {
		return nummer;
	}

	public void setNummer( Integer nummer ) {
		Integer oldNummer = this.nummer;
		this.nummer = nummer;
		changeSupport.firePropertyChange( "nummer", oldNummer, nummer );
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname( String vorname ) {
		String oldVorname = this.vorname;
		this.vorname = vorname;
		changeSupport.firePropertyChange( "vorname", oldVorname, vorname );
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname( String nachname ) {
		String oldNachname = this.nachname;
		this.nachname = nachname;
		changeSupport.firePropertyChange( "nachname", oldNachname, nachname );
	}

	public String getInitialen() {
		return initialen;
	}

	public void setInitialen( String initialen ) {
		String oldInitialen = this.initialen;
		this.initialen = initialen;
		changeSupport.firePropertyChange( "initialen", oldInitialen, initialen );
	}

	public String getLogin() {
		return login;
	}

	public void setLogin( String login ) {
		String oldLogin = this.login;
		this.login = login;
		changeSupport.firePropertyChange( "login", oldLogin, login );
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort( String passwort ) {
		String oldPasswort = this.passwort;
		this.passwort = passwort;
		changeSupport.firePropertyChange( "passwort", oldPasswort, passwort );
	}

	public Boolean getGesperrt() {
		return gesperrt;
	}

	public void setGesperrt( Boolean gesperrt ) {
		Boolean oldGesperrt = this.gesperrt;
		this.gesperrt = gesperrt;
		changeSupport.firePropertyChange( "gesperrt", oldGesperrt, gesperrt );
	}

	public Integer getBenutzergruppeID() {
		return benutzergruppeID;
	}

	public void setBenutzergruppeID( Integer benutzergruppeID ) {
		Integer oldBenutzergruppeID = this.benutzergruppeID;
		this.benutzergruppeID = benutzergruppeID;
		changeSupport.firePropertyChange( "benutzergruppeID", oldBenutzergruppeID, benutzergruppeID );
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals( Object object ) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if( !(object instanceof Benutzer) ) {
			return false;
		}
		Benutzer other = (Benutzer) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Benutzer[ id=" + id + " ]";
	}

	public void addPropertyChangeListener( PropertyChangeListener listener ) {
		changeSupport.addPropertyChangeListener( listener );
	}

	public void removePropertyChangeListener( PropertyChangeListener listener ) {
		changeSupport.removePropertyChangeListener( listener );
	}
	
}
