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
@Table(name = "mitarbkunde")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Mitarbkunde.findAll", query = "SELECT m FROM Mitarbkunde m"),
	@NamedQuery(name = "Mitarbkunde.findById", query = "SELECT m FROM Mitarbkunde m WHERE m.id = :id"),
	@NamedQuery(name = "Mitarbkunde.findByNummer", query = "SELECT m FROM Mitarbkunde m WHERE m.nummer = :nummer"),
	@NamedQuery(name = "Mitarbkunde.findByAnredeID", query = "SELECT m FROM Mitarbkunde m WHERE m.anredeID = :anredeID"),
	@NamedQuery(name = "Mitarbkunde.findByKundeID", query = "SELECT m FROM Mitarbkunde m WHERE m.kundeID = :kundeID"),
	@NamedQuery(name = "Mitarbkunde.findByVorname", query = "SELECT m FROM Mitarbkunde m WHERE m.vorname = :vorname"),
	@NamedQuery(name = "Mitarbkunde.findByNachname", query = "SELECT m FROM Mitarbkunde m WHERE m.nachname = :nachname"),
	@NamedQuery(name = "Mitarbkunde.findByInfo", query = "SELECT m FROM Mitarbkunde m WHERE m.info = :info"),
	@NamedQuery(name = "Mitarbkunde.findByTelefon", query = "SELECT m FROM Mitarbkunde m WHERE m.telefon = :telefon"),
	@NamedQuery(name = "Mitarbkunde.findByTelefax", query = "SELECT m FROM Mitarbkunde m WHERE m.telefax = :telefax"),
	@NamedQuery(name = "Mitarbkunde.findByMobil", query = "SELECT m FROM Mitarbkunde m WHERE m.mobil = :mobil")})
public class Mitarbkunde implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private String id;
	@Column(name = "Nummer")
	private String nummer;
	@Column(name = "AnredeID")
	private Integer anredeID;
	@Column(name = "KundeID")
	private Integer kundeID;
	@Column(name = "Vorname")
	private String vorname;
	@Column(name = "Nachname")
	private String nachname;
	@Column(name = "Info")
	private String info;
	@Column(name = "Telefon")
	private Integer telefon;
	@Column(name = "Telefax")
	private Integer telefax;
	@Column(name = "Mobil")
	private Integer mobil;

	public Mitarbkunde() {
	}

	public Mitarbkunde( String id ) {
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

	public Integer getAnredeID() {
		return anredeID;
	}

	public void setAnredeID( Integer anredeID ) {
		this.anredeID = anredeID;
	}

	public Integer getKundeID() {
		return kundeID;
	}

	public void setKundeID( Integer kundeID ) {
		this.kundeID = kundeID;
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

	public String getInfo() {
		return info;
	}

	public void setInfo( String info ) {
		this.info = info;
	}

	public Integer getTelefon() {
		return telefon;
	}

	public void setTelefon( Integer telefon ) {
		this.telefon = telefon;
	}

	public Integer getTelefax() {
		return telefax;
	}

	public void setTelefax( Integer telefax ) {
		this.telefax = telefax;
	}

	public Integer getMobil() {
		return mobil;
	}

	public void setMobil( Integer mobil ) {
		this.mobil = mobil;
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
		if( !(object instanceof Mitarbkunde) ) {
			return false;
		}
		Mitarbkunde other = (Mitarbkunde) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Mitarbkunde[ id=" + id + " ]";
	}
	
}
