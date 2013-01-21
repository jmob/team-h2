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
@Table(name = "benutzergruppe")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Benutzergruppe.findAll", query = "SELECT b FROM Benutzergruppe b"),
	@NamedQuery(name = "Benutzergruppe.findById", query = "SELECT b FROM Benutzergruppe b WHERE b.id = :id"),
	@NamedQuery(name = "Benutzergruppe.findByNummer", query = "SELECT b FROM Benutzergruppe b WHERE b.nummer = :nummer"),
	@NamedQuery(name = "Benutzergruppe.findByBezeichnung", query = "SELECT b FROM Benutzergruppe b WHERE b.bezeichnung = :bezeichnung"),
	@NamedQuery(name = "Benutzergruppe.findByBenutzerrolle", query = "SELECT b FROM Benutzergruppe b WHERE b.benutzerrolle = :benutzerrolle")})
public class Benutzergruppe implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "Nummer")
	private Integer nummer;
	@Column(name = "Bezeichnung")
	private String bezeichnung;
	@Column(name = "Benutzerrolle")
	private String benutzerrolle;

	public Benutzergruppe() {
	}

	public Benutzergruppe( Integer id ) {
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

	public String getBenutzerrolle() {
		return benutzerrolle;
	}

	public void setBenutzerrolle( String benutzerrolle ) {
		this.benutzerrolle = benutzerrolle;
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
		if( !(object instanceof Benutzergruppe) ) {
			return false;
		}
		Benutzergruppe other = (Benutzergruppe) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "teamh2_db_entity_classes.Benutzergruppe[ id=" + id + " ]";
	}
	
}
