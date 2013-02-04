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
@Table(name = "personaltyp")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Personaltyp.findAll", query = "SELECT p FROM Personaltyp p"),
	@NamedQuery(name = "Personaltyp.findById", query = "SELECT p FROM Personaltyp p WHERE p.id = :id"),
	@NamedQuery(name = "Personaltyp.findByNummer", query = "SELECT p FROM Personaltyp p WHERE p.nummer = :nummer"),
	@NamedQuery(name = "Personaltyp.findByBezeichnung", query = "SELECT p FROM Personaltyp p WHERE p.bezeichnung = :bezeichnung")})
public class Personaltyp implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "Nummer")
	private Integer nummer;
	@Column(name = "Bezeichnung")
	private String bezeichnung;
	@OneToMany(mappedBy = "personaltypID")
	private Collection<Personalkosten> personalkostenCollection;
	@OneToMany(mappedBy = "personaltypID")
	private Collection<Personal> personalCollection;

	public Personaltyp() {
	}

	public Personaltyp( Integer id ) {
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
	public Collection<Personalkosten> getPersonalkostenCollection() {
		return personalkostenCollection;
	}

	public void setPersonalkostenCollection( Collection<Personalkosten> personalkostenCollection ) {
		this.personalkostenCollection = personalkostenCollection;
	}

	@XmlTransient
	public Collection<Personal> getPersonalCollection() {
		return personalCollection;
	}

	public void setPersonalCollection( Collection<Personal> personalCollection ) {
		this.personalCollection = personalCollection;
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
		if( !(object instanceof Personaltyp) ) {
			return false;
		}
		Personaltyp other = (Personaltyp) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Personaltyp[ id=" + id + " ]";
	}
	
}
