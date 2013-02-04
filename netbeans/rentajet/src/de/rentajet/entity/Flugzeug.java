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
import javax.persistence.Lob;
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
@Table(name = "flugzeug")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Flugzeug.findAll", query = "SELECT f FROM Flugzeug f"),
	@NamedQuery(name = "Flugzeug.findById", query = "SELECT f FROM Flugzeug f WHERE f.id = :id"),
	@NamedQuery(name = "Flugzeug.findByNummer", query = "SELECT f FROM Flugzeug f WHERE f.nummer = :nummer"),
	@NamedQuery(name = "Flugzeug.findByBezeichnung", query = "SELECT f FROM Flugzeug f WHERE f.bezeichnung = :bezeichnung")})
public class Flugzeug implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "Nummer")
	private Integer nummer;
	@Column(name = "Bezeichnung")
	private String bezeichnung;
	@Lob
  @Column(name = "Foto")
	private byte[] foto;
	@JoinColumn(name = "FlugzeugtypID", referencedColumnName = "ID")
  @ManyToOne
	private Flugzeugtyp flugzeugtypID;
	@OneToMany(mappedBy = "flugzeugID")
	private Collection<Buchung> buchungCollection;
	@OneToMany(mappedBy = "flugzeugID")
	private Collection<Auftrag> auftragCollection;

	public Flugzeug() {
	}

	public Flugzeug( Integer id ) {
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

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto( byte[] foto ) {
		this.foto = foto;
	}

	public Flugzeugtyp getFlugzeugtypID() {
		return flugzeugtypID;
	}

	public void setFlugzeugtypID( Flugzeugtyp flugzeugtypID ) {
		this.flugzeugtypID = flugzeugtypID;
	}

	@XmlTransient
	public Collection<Buchung> getBuchungCollection() {
		return buchungCollection;
	}

	public void setBuchungCollection( Collection<Buchung> buchungCollection ) {
		this.buchungCollection = buchungCollection;
	}

	@XmlTransient
	public Collection<Auftrag> getAuftragCollection() {
		return auftragCollection;
	}

	public void setAuftragCollection( Collection<Auftrag> auftragCollection ) {
		this.auftragCollection = auftragCollection;
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
		if( !(object instanceof Flugzeug) ) {
			return false;
		}
		Flugzeug other = (Flugzeug) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Flugzeug[ id=" + id + " ]";
	}
	
}
