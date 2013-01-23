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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author j.schipplick
 */
@Entity
@Table(name = "firma")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Firma.findAll", query = "SELECT f FROM Firma f"),
	@NamedQuery(name = "Firma.findById", query = "SELECT f FROM Firma f WHERE f.id = :id"),
	@NamedQuery(name = "Firma.findByBezeichnung", query = "SELECT f FROM Firma f WHERE f.bezeichnung = :bezeichnung"),
	@NamedQuery(name = "Firma.findByName1", query = "SELECT f FROM Firma f WHERE f.name1 = :name1"),
	@NamedQuery(name = "Firma.findByName2", query = "SELECT f FROM Firma f WHERE f.name2 = :name2"),
	@NamedQuery(name = "Firma.findByName3", query = "SELECT f FROM Firma f WHERE f.name3 = :name3"),
	@NamedQuery(name = "Firma.findByStrasse", query = "SELECT f FROM Firma f WHERE f.strasse = :strasse"),
	@NamedQuery(name = "Firma.findByOrtID", query = "SELECT f FROM Firma f WHERE f.ortID = :ortID"),
	@NamedQuery(name = "Firma.findBySteuernummer", query = "SELECT f FROM Firma f WHERE f.steuernummer = :steuernummer"),
	@NamedQuery(name = "Firma.findByBetriebsnummer", query = "SELECT f FROM Firma f WHERE f.betriebsnummer = :betriebsnummer"),
	@NamedQuery(name = "Firma.findByUSTIdentNummer", query = "SELECT f FROM Firma f WHERE f.uSTIdentNummer = :uSTIdentNummer"),
	@NamedQuery(name = "Firma.findByTelefon", query = "SELECT f FROM Firma f WHERE f.telefon = :telefon"),
	@NamedQuery(name = "Firma.findByTelefax", query = "SELECT f FROM Firma f WHERE f.telefax = :telefax")})
public class Firma implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "Bezeichnung")
	private String bezeichnung;
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
	@Column(name = "Steuernummer")
	private BigInteger steuernummer;
	@Column(name = "Betriebsnummer")
	private Integer betriebsnummer;
	@Column(name = "USTIdentNummer")
	private String uSTIdentNummer;
	@Column(name = "Telefon")
	private Integer telefon;
	@Column(name = "Telefax")
	private Integer telefax;
	@Basic(optional = false)
  @Lob
  @Column(name = "Logo")
	private byte[] logo;

	public Firma() {
	}

	public Firma( Integer id ) {
		this.id = id;
	}

	public Firma( Integer id, byte[] logo ) {
		this.id = id;
		this.logo = logo;
	}

	public Integer getId() {
		return id;
	}

	public void setId( Integer id ) {
		this.id = id;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung( String bezeichnung ) {
		this.bezeichnung = bezeichnung;
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

	public BigInteger getSteuernummer() {
		return steuernummer;
	}

	public void setSteuernummer( BigInteger steuernummer ) {
		this.steuernummer = steuernummer;
	}

	public Integer getBetriebsnummer() {
		return betriebsnummer;
	}

	public void setBetriebsnummer( Integer betriebsnummer ) {
		this.betriebsnummer = betriebsnummer;
	}

	public String getUSTIdentNummer() {
		return uSTIdentNummer;
	}

	public void setUSTIdentNummer( String uSTIdentNummer ) {
		this.uSTIdentNummer = uSTIdentNummer;
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

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo( byte[] logo ) {
		this.logo = logo;
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
		if( !(object instanceof Firma) ) {
			return false;
		}
		Firma other = (Firma) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Firma[ id=" + id + " ]";
	}
	
}
