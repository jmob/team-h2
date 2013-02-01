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
@Table(name = "kundenberater")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Kundenberater.findAll", query = "SELECT k FROM Kundenberater k"),
	@NamedQuery(name = "Kundenberater.findById", query = "SELECT k FROM Kundenberater k WHERE k.id = :id"),
	@NamedQuery(name = "Kundenberater.findByAnredeID", query = "SELECT k FROM Kundenberater k WHERE k.anredeID = :anredeID"),
	@NamedQuery(name = "Kundenberater.findByVorname", query = "SELECT k FROM Kundenberater k WHERE k.vorname = :vorname"),
	@NamedQuery(name = "Kundenberater.findByNachname", query = "SELECT k FROM Kundenberater k WHERE k.nachname = :nachname"),
	@NamedQuery(name = "Kundenberater.findByStrasse", query = "SELECT k FROM Kundenberater k WHERE k.strasse = :strasse"),
	@NamedQuery(name = "Kundenberater.findByOrtID", query = "SELECT k FROM Kundenberater k WHERE k.ortID = :ortID"),
	@NamedQuery(name = "Kundenberater.findByTelefon", query = "SELECT k FROM Kundenberater k WHERE k.telefon = :telefon"),
	@NamedQuery(name = "Kundenberater.findByTelefax", query = "SELECT k FROM Kundenberater k WHERE k.telefax = :telefax"),
	@NamedQuery(name = "Kundenberater.findByMobil", query = "SELECT k FROM Kundenberater k WHERE k.mobil = :mobil"),
	@NamedQuery(name = "Kundenberater.findByNummer", query = "SELECT k FROM Kundenberater k WHERE k.nummer = :nummer")})
public class Kundenberater implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private String id;
	@Column(name = "AnredeID")
	private String anredeID;
	@Column(name = "Vorname")
	private String vorname;
	@Column(name = "Nachname")
	private String nachname;
	@Column(name = "Strasse")
	private String strasse;
	@Column(name = "OrtID")
	private String ortID;
	@Column(name = "Telefon")
	private Integer telefon;
	@Column(name = "Telefax")
	private Integer telefax;
	@Column(name = "Mobil")
	private Integer mobil;
	@Column(name = "Nummer")
	private String nummer;

	public Kundenberater() {
	}

	public Kundenberater( String id ) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId( String id ) {
		this.id = id;
	}

	public String getAnredeID() {
		return anredeID;
	}

	public void setAnredeID( String anredeID ) {
		this.anredeID = anredeID;
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

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse( String strasse ) {
		this.strasse = strasse;
	}

	public String getOrtID() {
		return ortID;
	}

	public void setOrtID( String ortID ) {
		this.ortID = ortID;
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

	public String getNummer() {
		return nummer;
	}

	public void setNummer( String nummer ) {
		this.nummer = nummer;
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
		if( !(object instanceof Kundenberater) ) {
			return false;
		}
		Kundenberater other = (Kundenberater) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Kundenberater[ id=" + id + " ]";
	}
	
}
