/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

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
	@NamedQuery(name = "Ort.findByNummer", query = "SELECT o FROM Ort o WHERE o.nummer = :nummer")})
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
	@Column(name = "Nummer")
	private Integer nummer;
	@OneToMany(mappedBy = "ortID")
	private Collection<Kundenberater> kundenberaterCollection;
	@JoinColumn(name = "StaatID", referencedColumnName = "ID")
  @ManyToOne
	private Staat staatID;
	@OneToMany(mappedBy = "ortID")
	private Collection<Kunde> kundeCollection;
	@OneToMany(mappedBy = "ortID")
	private Collection<Firma> firmaCollection;

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

	public Integer getNummer() {
		return nummer;
	}

	public void setNummer( Integer nummer ) {
		this.nummer = nummer;
	}

	@XmlTransient
	public Collection<Kundenberater> getKundenberaterCollection() {
		return kundenberaterCollection;
	}

	public void setKundenberaterCollection( Collection<Kundenberater> kundenberaterCollection ) {
		this.kundenberaterCollection = kundenberaterCollection;
	}

	public Staat getStaatID() {
		return staatID;
	}

	public void setStaatID( Staat staatID ) {
		this.staatID = staatID;
	}

	@XmlTransient
	public Collection<Kunde> getKundeCollection() {
		return kundeCollection;
	}

	public void setKundeCollection( Collection<Kunde> kundeCollection ) {
		this.kundeCollection = kundeCollection;
	}

	@XmlTransient
	public Collection<Firma> getFirmaCollection() {
		return firmaCollection;
	}

	public void setFirmaCollection( Collection<Firma> firmaCollection ) {
		this.firmaCollection = firmaCollection;
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
		return "de.rentajet.entity.Ort[ id=" + id + " ]";
	}
	
}
