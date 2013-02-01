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
@Table(name = "flugzeugtyp")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Flugzeugtyp.findAll", query = "SELECT f FROM Flugzeugtyp f"),
	@NamedQuery(name = "Flugzeugtyp.findById", query = "SELECT f FROM Flugzeugtyp f WHERE f.id = :id"),
	@NamedQuery(name = "Flugzeugtyp.findByNummer", query = "SELECT f FROM Flugzeugtyp f WHERE f.nummer = :nummer"),
	@NamedQuery(name = "Flugzeugtyp.findByBezeichnung", query = "SELECT f FROM Flugzeugtyp f WHERE f.bezeichnung = :bezeichnung"),
	@NamedQuery(name = "Flugzeugtyp.findByHersteller", query = "SELECT f FROM Flugzeugtyp f WHERE f.hersteller = :hersteller"),
	@NamedQuery(name = "Flugzeugtyp.findByFlightcrew", query = "SELECT f FROM Flugzeugtyp f WHERE f.flightcrew = :flightcrew"),
	@NamedQuery(name = "Flugzeugtyp.findByCabincrew", query = "SELECT f FROM Flugzeugtyp f WHERE f.cabincrew = :cabincrew"),
	@NamedQuery(name = "Flugzeugtyp.findByReichweite", query = "SELECT f FROM Flugzeugtyp f WHERE f.reichweite = :reichweite"),
	@NamedQuery(name = "Flugzeugtyp.findBySitzpl\u00e4tze", query = "SELECT f FROM Flugzeugtyp f WHERE f.sitzpl\u00e4tze = :sitzpl\u00e4tze"),
	@NamedQuery(name = "Flugzeugtyp.findByReisegeschwindigkeit", query = "SELECT f FROM Flugzeugtyp f WHERE f.reisegeschwindigkeit = :reisegeschwindigkeit"),
	@NamedQuery(name = "Flugzeugtyp.findByTriebwerke", query = "SELECT f FROM Flugzeugtyp f WHERE f.triebwerke = :triebwerke"),
	@NamedQuery(name = "Flugzeugtyp.findByTriebwerkartID", query = "SELECT f FROM Flugzeugtyp f WHERE f.triebwerkartID = :triebwerkartID")})
public class Flugzeugtyp implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private String id;
	@Column(name = "Nummer")
	private String nummer;
	@Column(name = "Bezeichnung")
	private String bezeichnung;
	@Column(name = "Hersteller")
	private String hersteller;
	@Column(name = "Flightcrew")
	private String flightcrew;
	@Column(name = "Cabincrew")
	private String cabincrew;
	@Column(name = "Reichweite")
	private Integer reichweite;
	@Column(name = "Sitzpl\u00e4tze")
	private Integer sitzplätze;
	@Column(name = "Reisegeschwindigkeit")
	private Integer reisegeschwindigkeit;
	@Column(name = "Triebwerke")
	private Integer triebwerke;
	@Column(name = "TriebwerkartID")
	private String triebwerkartID;

	public Flugzeugtyp() {
	}

	public Flugzeugtyp( String id ) {
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

	public String getHersteller() {
		return hersteller;
	}

	public void setHersteller( String hersteller ) {
		this.hersteller = hersteller;
	}

	public String getFlightcrew() {
		return flightcrew;
	}

	public void setFlightcrew( String flightcrew ) {
		this.flightcrew = flightcrew;
	}

	public String getCabincrew() {
		return cabincrew;
	}

	public void setCabincrew( String cabincrew ) {
		this.cabincrew = cabincrew;
	}

	public Integer getReichweite() {
		return reichweite;
	}

	public void setReichweite( Integer reichweite ) {
		this.reichweite = reichweite;
	}

	public Integer getSitzplätze() {
		return sitzplätze;
	}

	public void setSitzplätze( Integer sitzplätze ) {
		this.sitzplätze = sitzplätze;
	}

	public Integer getReisegeschwindigkeit() {
		return reisegeschwindigkeit;
	}

	public void setReisegeschwindigkeit( Integer reisegeschwindigkeit ) {
		this.reisegeschwindigkeit = reisegeschwindigkeit;
	}

	public Integer getTriebwerke() {
		return triebwerke;
	}

	public void setTriebwerke( Integer triebwerke ) {
		this.triebwerke = triebwerke;
	}

	public String getTriebwerkartID() {
		return triebwerkartID;
	}

	public void setTriebwerkartID( String triebwerkartID ) {
		this.triebwerkartID = triebwerkartID;
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
		if( !(object instanceof Flugzeugtyp) ) {
			return false;
		}
		Flugzeugtyp other = (Flugzeugtyp) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Flugzeugtyp[ id=" + id + " ]";
	}
	
}
