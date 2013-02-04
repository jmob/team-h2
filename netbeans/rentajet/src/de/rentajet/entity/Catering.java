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
@Table(name = "catering")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Catering.findAll", query = "SELECT c FROM Catering c"),
	@NamedQuery(name = "Catering.findById", query = "SELECT c FROM Catering c WHERE c.id = :id"),
	@NamedQuery(name = "Catering.findByNummer", query = "SELECT c FROM Catering c WHERE c.nummer = :nummer"),
	@NamedQuery(name = "Catering.findByBezeichnung", query = "SELECT c FROM Catering c WHERE c.bezeichnung = :bezeichnung"),
	@NamedQuery(name = "Catering.findByBeschreibung", query = "SELECT c FROM Catering c WHERE c.beschreibung = :beschreibung"),
	@NamedQuery(name = "Catering.findByKosten", query = "SELECT c FROM Catering c WHERE c.kosten = :kosten")})
public class Catering implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "Nummer")
	private Integer nummer;
	@Column(name = "Bezeichnung")
	private String bezeichnung;
	@Column(name = "Beschreibung")
	private String beschreibung;
	@Column(name = "Kosten")
	private Integer kosten;

	public Catering() {
	}

	public Catering( Integer id ) {
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

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung( String beschreibung ) {
		this.beschreibung = beschreibung;
	}

	public Integer getKosten() {
		return kosten;
	}

	public void setKosten( Integer kosten ) {
		this.kosten = kosten;
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
		if( !(object instanceof Catering) ) {
			return false;
		}
		Catering other = (Catering) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Catering[ id=" + id + " ]";
	}
	
}
