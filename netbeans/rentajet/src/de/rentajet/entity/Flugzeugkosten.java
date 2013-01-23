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
@Table(name = "flugzeugkosten")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Flugzeugkosten.findAll", query = "SELECT f FROM Flugzeugkosten f"),
	@NamedQuery(name = "Flugzeugkosten.findById", query = "SELECT f FROM Flugzeugkosten f WHERE f.id = :id"),
	@NamedQuery(name = "Flugzeugkosten.findByNummer", query = "SELECT f FROM Flugzeugkosten f WHERE f.nummer = :nummer"),
	@NamedQuery(name = "Flugzeugkosten.findByBezeichnung", query = "SELECT f FROM Flugzeugkosten f WHERE f.bezeichnung = :bezeichnung"),
	@NamedQuery(name = "Flugzeugkosten.findByFlugzeugtypID", query = "SELECT f FROM Flugzeugkosten f WHERE f.flugzeugtypID = :flugzeugtypID"),
	@NamedQuery(name = "Flugzeugkosten.findByFixkosten", query = "SELECT f FROM Flugzeugkosten f WHERE f.fixkosten = :fixkosten"),
	@NamedQuery(name = "Flugzeugkosten.findByRentabilitaetStd", query = "SELECT f FROM Flugzeugkosten f WHERE f.rentabilitaetStd = :rentabilitaetStd"),
	@NamedQuery(name = "Flugzeugkosten.findByFixkostenStd", query = "SELECT f FROM Flugzeugkosten f WHERE f.fixkostenStd = :fixkostenStd"),
	@NamedQuery(name = "Flugzeugkosten.findByStundensatz", query = "SELECT f FROM Flugzeugkosten f WHERE f.stundensatz = :stundensatz")})
public class Flugzeugkosten implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "Nummer")
	private Integer nummer;
	@Column(name = "Bezeichnung")
	private String bezeichnung;
	@Column(name = "FlugzeugtypID")
	private Integer flugzeugtypID;
	@Column(name = "Fixkosten")
	private Integer fixkosten;
	@Column(name = "RentabilitaetStd")
	private Integer rentabilitaetStd;
	@Column(name = "FixkostenStd")
	private Integer fixkostenStd;
	@Column(name = "Stundensatz")
	private Integer stundensatz;

	public Flugzeugkosten() {
	}

	public Flugzeugkosten( Integer id ) {
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

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung( String bezeichnung ) {
		this.bezeichnung = bezeichnung;
	}

	public Integer getFlugzeugtypID() {
		return flugzeugtypID;
	}

	public void setFlugzeugtypID( Integer flugzeugtypID ) {
		this.flugzeugtypID = flugzeugtypID;
	}

	public Integer getFixkosten() {
		return fixkosten;
	}

	public void setFixkosten( Integer fixkosten ) {
		this.fixkosten = fixkosten;
	}

	public Integer getRentabilitaetStd() {
		return rentabilitaetStd;
	}

	public void setRentabilitaetStd( Integer rentabilitaetStd ) {
		this.rentabilitaetStd = rentabilitaetStd;
	}

	public Integer getFixkostenStd() {
		return fixkostenStd;
	}

	public void setFixkostenStd( Integer fixkostenStd ) {
		this.fixkostenStd = fixkostenStd;
	}

	public Integer getStundensatz() {
		return stundensatz;
	}

	public void setStundensatz( Integer stundensatz ) {
		this.stundensatz = stundensatz;
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
		if( !(object instanceof Flugzeugkosten) ) {
			return false;
		}
		Flugzeugkosten other = (Flugzeugkosten) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Flugzeugkosten[ id=" + id + " ]";
	}
	
}
