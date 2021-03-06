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
@Table(name = "triebwerkartid")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Triebwerkartid.findAll", query = "SELECT t FROM Triebwerkartid t"),
	@NamedQuery(name = "Triebwerkartid.findById", query = "SELECT t FROM Triebwerkartid t WHERE t.id = :id"),
	@NamedQuery(name = "Triebwerkartid.findByNummer", query = "SELECT t FROM Triebwerkartid t WHERE t.nummer = :nummer"),
	@NamedQuery(name = "Triebwerkartid.findByBezeichnung", query = "SELECT t FROM Triebwerkartid t WHERE t.bezeichnung = :bezeichnung")})
public class Triebwerkartid implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "Nummer")
	private Integer nummer;
	@Column(name = "Bezeichnung")
	private String bezeichnung;
	@OneToMany(mappedBy = "triebwerkartID")
	private Collection<Flugzeugtyp> flugzeugtypCollection;

	public Triebwerkartid() {
	}

	public Triebwerkartid( Integer id ) {
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

	@XmlTransient
	public Collection<Flugzeugtyp> getFlugzeugtypCollection() {
		return flugzeugtypCollection;
	}

	public void setFlugzeugtypCollection( Collection<Flugzeugtyp> flugzeugtypCollection ) {
		this.flugzeugtypCollection = flugzeugtypCollection;
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
		if( !(object instanceof Triebwerkartid) ) {
			return false;
		}
		Triebwerkartid other = (Triebwerkartid) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Triebwerkartid[ id=" + id + " ]";
	}
	
}
