/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.entity;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "kunde")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Kunde.findAll", query = "SELECT k FROM Kunde k"),
	@NamedQuery(name = "Kunde.findById", query = "SELECT k FROM Kunde k WHERE k.id = :id"),
	@NamedQuery(name = "Kunde.findByNummer", query = "SELECT k FROM Kunde k WHERE k.nummer = :nummer"),
	@NamedQuery(name = "Kunde.findByAnredeID", query = "SELECT k FROM Kunde k WHERE k.anredeID = :anredeID"),
	@NamedQuery(name = "Kunde.findByMatchcode", query = "SELECT k FROM Kunde k WHERE k.matchcode = :matchcode"),
	@NamedQuery(name = "Kunde.findByName1", query = "SELECT k FROM Kunde k WHERE k.name1 = :name1"),
	@NamedQuery(name = "Kunde.findByName2", query = "SELECT k FROM Kunde k WHERE k.name2 = :name2"),
	@NamedQuery(name = "Kunde.findByName3", query = "SELECT k FROM Kunde k WHERE k.name3 = :name3"),
	@NamedQuery(name = "Kunde.findByStrasse", query = "SELECT k FROM Kunde k WHERE k.strasse = :strasse"),
	@NamedQuery(name = "Kunde.findByOrtID", query = "SELECT k FROM Kunde k WHERE k.ortID = :ortID"),
	@NamedQuery(name = "Kunde.findByKundenberaterID", query = "SELECT k FROM Kunde k WHERE k.kundenberaterID = :kundenberaterID"),
	@NamedQuery(name = "Kunde.findByTelefon", query = "SELECT k FROM Kunde k WHERE k.telefon = :telefon"),
	@NamedQuery(name = "Kunde.findByTelefax", query = "SELECT k FROM Kunde k WHERE k.telefax = :telefax"),
	@NamedQuery(name = "Kunde.findByMobil", query = "SELECT k FROM Kunde k WHERE k.mobil = :mobil"),
	@NamedQuery(name = "Kunde.findByGesperrt", query = "SELECT k FROM Kunde k WHERE k.gesperrt = :gesperrt"),
	@NamedQuery(name = "Kunde.findByKreditlimit", query = "SELECT k FROM Kunde k WHERE k.kreditlimit = :kreditlimit"),
	@NamedQuery(name = "Kunde.findBySteuernummer", query = "SELECT k FROM Kunde k WHERE k.steuernummer = :steuernummer")})
public class Kunde implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "Nummer")
	private Integer nummer;
	@Column(name = "AnredeID")
	private Integer anredeID;
	@Column(name = "Matchcode")
	private Integer matchcode;
	@Column(name = "Name1")
	private String name1;
	@Column(name = "Name2")
	private String name2;
	@Column(name = "Name3")
	private String name3;
	@Column(name = "Strasse")
	private String strasse;
	@Column(name = "OrtID")
	private Integer ortID;
	@Column(name = "KundenberaterID")
	private Integer kundenberaterID;
	@Column(name = "Telefon")
	private Integer telefon;
	@Column(name = "Telefax")
	private Integer telefax;
	@Column(name = "Mobil")
	private Integer mobil;
	@Column(name = "Gesperrt")
	private Boolean gesperrt;
	@Column(name = "Kreditlimit")
	private Integer kreditlimit;
	@Column(name = "Steuernummer")
	private BigInteger steuernummer;

	public Kunde() {
	}

	public Kunde( Integer id ) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId( Integer id ) {
		this.id = id;
	}

	public Integer getNummer() {
		return nummer;
	}

	public void setNummer( Integer nummer ) {
		this.nummer = nummer;
	}

	public Integer getAnredeID() {
		return anredeID;
	}

	public void setAnredeID( Integer anredeID ) {
		this.anredeID = anredeID;
	}

	public Integer getMatchcode() {
		return matchcode;
	}

	public void setMatchcode( Integer matchcode ) {
		this.matchcode = matchcode;
	}

	public String getName1() {
		return name1;
	}

	public void setName1( String name1 ) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2( String name2 ) {
		this.name2 = name2;
	}

	public String getName3() {
		return name3;
	}

	public void setName3( String name3 ) {
		this.name3 = name3;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse( String strasse ) {
		this.strasse = strasse;
	}

	public Integer getOrtID() {
		return ortID;
	}

	public void setOrtID( Integer ortID ) {
		this.ortID = ortID;
	}

	public Integer getKundenberaterID() {
		return kundenberaterID;
	}

	public void setKundenberaterID( Integer kundenberaterID ) {
		this.kundenberaterID = kundenberaterID;
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

	public Boolean getGesperrt() {
		return gesperrt;
	}

	public void setGesperrt( Boolean gesperrt ) {
		this.gesperrt = gesperrt;
	}

	public Integer getKreditlimit() {
		return kreditlimit;
	}

	public void setKreditlimit( Integer kreditlimit ) {
		this.kreditlimit = kreditlimit;
	}

	public BigInteger getSteuernummer() {
		return steuernummer;
	}

	public void setSteuernummer( BigInteger steuernummer ) {
		this.steuernummer = steuernummer;
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
		if( !(object instanceof Kunde) ) {
			return false;
		}
		Kunde other = (Kunde) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Kunde[ id=" + id + " ]";
	}
	
}
