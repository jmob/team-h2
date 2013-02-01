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
@Table(name = "zahlungsbedingung")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Zahlungsbedingung.findAll", query = "SELECT z FROM Zahlungsbedingung z"),
	@NamedQuery(name = "Zahlungsbedingung.findById", query = "SELECT z FROM Zahlungsbedingung z WHERE z.id = :id"),
	@NamedQuery(name = "Zahlungsbedingung.findByNummer", query = "SELECT z FROM Zahlungsbedingung z WHERE z.nummer = :nummer"),
	@NamedQuery(name = "Zahlungsbedingung.findByBezeichnung", query = "SELECT z FROM Zahlungsbedingung z WHERE z.bezeichnung = :bezeichnung"),
	@NamedQuery(name = "Zahlungsbedingung.findByBelegtext", query = "SELECT z FROM Zahlungsbedingung z WHERE z.belegtext = :belegtext"),
	@NamedQuery(name = "Zahlungsbedingung.findByValuta", query = "SELECT z FROM Zahlungsbedingung z WHERE z.valuta = :valuta"),
	@NamedQuery(name = "Zahlungsbedingung.findBySkontoValuta", query = "SELECT z FROM Zahlungsbedingung z WHERE z.skontoValuta = :skontoValuta"),
	@NamedQuery(name = "Zahlungsbedingung.findBySkontosatz", query = "SELECT z FROM Zahlungsbedingung z WHERE z.skontosatz = :skontosatz")})
public class Zahlungsbedingung implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private String id;
	@Column(name = "Nummer")
	private String nummer;
	@Column(name = "Bezeichnung")
	private String bezeichnung;
	@Column(name = "Belegtext")
	private String belegtext;
	@Column(name = "Valuta")
	private String valuta;
	@Column(name = "SkontoValuta")
	private String skontoValuta;
	@Column(name = "Skontosatz")
	private Long skontosatz;

	public Zahlungsbedingung() {
	}

	public Zahlungsbedingung( String id ) {
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

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung( String bezeichnung ) {
		this.bezeichnung = bezeichnung;
	}

	public String getBelegtext() {
		return belegtext;
	}

	public void setBelegtext( String belegtext ) {
		this.belegtext = belegtext;
	}

	public String getValuta() {
		return valuta;
	}

	public void setValuta( String valuta ) {
		this.valuta = valuta;
	}

	public String getSkontoValuta() {
		return skontoValuta;
	}

	public void setSkontoValuta( String skontoValuta ) {
		this.skontoValuta = skontoValuta;
	}

	public Long getSkontosatz() {
		return skontosatz;
	}

	public void setSkontosatz( Long skontosatz ) {
		this.skontosatz = skontosatz;
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
		if( !(object instanceof Zahlungsbedingung) ) {
			return false;
		}
		Zahlungsbedingung other = (Zahlungsbedingung) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Zahlungsbedingung[ id=" + id + " ]";
	}
	
}
