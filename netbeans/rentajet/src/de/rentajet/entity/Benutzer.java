/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
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
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private String id;
	@Column(name = "Nummer")
	private String nummer;
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

	public Benutzer( String id ) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId( String id ) {
		this.id = id;
	}

	public String getNummer() {
		return nummer;
	}

	public void setNummer( String nummer ) {
		this.nummer = nummer;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname( String vorname ) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname( String nachname ) {
		this.nachname = nachname;
	}

	public String getInitialen() {
		return initialen;
	}

	public void setInitialen( String initialen ) {
		this.initialen = initialen;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin( String login ) {
		this.login = login;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort( String passwort ) {
		this.passwort = passwort;
	}

	public Boolean getGesperrt() {
		return gesperrt;
	}

	public void setGesperrt( Boolean gesperrt ) {
		this.gesperrt = gesperrt;
	}

	public Integer getBenutzergruppeID() {
		return benutzergruppeID;
	}

	public void setBenutzergruppeID( Integer benutzergruppeID ) {
		this.benutzergruppeID = benutzergruppeID;
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
	
}
