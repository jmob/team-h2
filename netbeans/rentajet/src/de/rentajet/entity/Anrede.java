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
@Table(name = "anrede")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Anrede.findAll", query = "SELECT a FROM Anrede a"),
	@NamedQuery(name = "Anrede.findById", query = "SELECT a FROM Anrede a WHERE a.id = :id"),
	@NamedQuery(name = "Anrede.findByNummer", query = "SELECT a FROM Anrede a WHERE a.nummer = :nummer"),
	@NamedQuery(name = "Anrede.findByBezeichnung", query = "SELECT a FROM Anrede a WHERE a.bezeichnung = :bezeichnung")})
public class Anrede implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Basic(optional = false)
  @Column(name = "Nummer")
	private int nummer;
	@Column(name = "Bezeichnung")
	private String bezeichnung;
	@OneToMany(mappedBy = "anredeID")
	private Collection<Mitarbkunde> mitarbkundeCollection;
	@OneToMany(mappedBy = "anredeID")
	private Collection<Kundenberater> kundenberaterCollection;
	@OneToMany(mappedBy = "anredeID")
	private Collection<Kunde> kundeCollection;

	public Anrede() {
	}

	public Anrede( Integer id ) {
		this.id = id;
	}

	public Anrede( Integer id, int nummer ) {
		this.id = id;
		this.nummer = nummer;
	}

	public Integer getId() {
		return id;
	}

	public void setId( Integer id ) {
		this.id = id;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer( int nummer ) {
		this.nummer = nummer;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung( String bezeichnung ) {
		this.bezeichnung = bezeichnung;
	}

	@XmlTransient
	public Collection<Mitarbkunde> getMitarbkundeCollection() {
		return mitarbkundeCollection;
	}

	public void setMitarbkundeCollection( Collection<Mitarbkunde> mitarbkundeCollection ) {
		this.mitarbkundeCollection = mitarbkundeCollection;
	}

	@XmlTransient
	public Collection<Kundenberater> getKundenberaterCollection() {
		return kundenberaterCollection;
	}

	public void setKundenberaterCollection( Collection<Kundenberater> kundenberaterCollection ) {
		this.kundenberaterCollection = kundenberaterCollection;
	}

	@XmlTransient
	public Collection<Kunde> getKundeCollection() {
		return kundeCollection;
	}

	public void setKundeCollection( Collection<Kunde> kundeCollection ) {
		this.kundeCollection = kundeCollection;
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
		if( !(object instanceof Anrede) ) {
			return false;
		}
		Anrede other = (Anrede) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Anrede[ id=" + id + " ]";
	}
	
}
