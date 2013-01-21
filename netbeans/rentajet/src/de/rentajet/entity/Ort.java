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
@Table(name = "ort")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Ort.findAll", query = "SELECT o FROM Ort o"),
	@NamedQuery(name = "Ort.findById", query = "SELECT o FROM Ort o WHERE o.id = :id"),
	@NamedQuery(name = "Ort.findByPlz", query = "SELECT o FROM Ort o WHERE o.plz = :plz"),
	@NamedQuery(name = "Ort.findByBezeichnung", query = "SELECT o FROM Ort o WHERE o.bezeichnung = :bezeichnung"),
	@NamedQuery(name = "Ort.findByStaatID", query = "SELECT o FROM Ort o WHERE o.staatID = :staatID")})
public class Ort implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "PLZ")
	private Integer plz;
	@Column(name = "Bezeichnung")
	private String bezeichnung;
	@Column(name = "StaatID")
	private Integer staatID;

	public Ort() {
	}

	public Ort( Integer id ) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId( Integer id ) {
		this.id = id;
	}

	public Integer getPlz() {
		return plz;
	}

	public void setPlz( Integer plz ) {
		this.plz = plz;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung( String bezeichnung ) {
		this.bezeichnung = bezeichnung;
	}

	public Integer getStaatID() {
		return staatID;
	}

	public void setStaatID( Integer staatID ) {
		this.staatID = staatID;
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
		if( !(object instanceof Ort) ) {
			return false;
		}
		Ort other = (Ort) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "teamh2_db_entity_classes.Ort[ id=" + id + " ]";
	}
	
}
