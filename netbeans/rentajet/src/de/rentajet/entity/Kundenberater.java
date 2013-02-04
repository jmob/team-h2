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
@Table(name = "kundenberater")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Kundenberater.findAll", query = "SELECT k FROM Kundenberater k"),
	@NamedQuery(name = "Kundenberater.findById", query = "SELECT k FROM Kundenberater k WHERE k.id = :id"),
	@NamedQuery(name = "Kundenberater.findByVorname", query = "SELECT k FROM Kundenberater k WHERE k.vorname = :vorname"),
	@NamedQuery(name = "Kundenberater.findByNachname", query = "SELECT k FROM Kundenberater k WHERE k.nachname = :nachname"),
	@NamedQuery(name = "Kundenberater.findByStrasse", query = "SELECT k FROM Kundenberater k WHERE k.strasse = :strasse"),
	@NamedQuery(name = "Kundenberater.findByTelefon", query = "SELECT k FROM Kundenberater k WHERE k.telefon = :telefon"),
	@NamedQuery(name = "Kundenberater.findByTelefax", query = "SELECT k FROM Kundenberater k WHERE k.telefax = :telefax"),
	@NamedQuery(name = "Kundenberater.findByMobil", query = "SELECT k FROM Kundenberater k WHERE k.mobil = :mobil"),
	@NamedQuery(name = "Kundenberater.findByNummer", query = "SELECT k FROM Kundenberater k WHERE k.nummer = :nummer")})
public class Kundenberater implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "Vorname")
	private String vorname;
	@Column(name = "Nachname")
	private String nachname;
	@Column(name = "Strasse")
	private String strasse;
	@Column(name = "Telefon")
	private String telefon;
	@Column(name = "Telefax")
	private String telefax;
	@Column(name = "Mobil")
	private String mobil;
	@Column(name = "Nummer")
	private Integer nummer;
	@JoinColumn(name = "AnredeID", referencedColumnName = "ID")
  @ManyToOne
	private Anrede anredeID;
	@JoinColumn(name = "OrtID", referencedColumnName = "ID")
  @ManyToOne
	private Ort ortID;
	@OneToMany(mappedBy = "kundenberaterID")
	private Collection<Kunde> kundeCollection;

	public Kundenberater() {
	}

	public Kundenberater( Integer id ) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId( Integer id ) {
		this.id = id;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname( String vorname ) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname( String nachname ) {
		this.nachname = nachname;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse( String strasse ) {
		this.strasse = strasse;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon( String telefon ) {
		this.telefon = telefon;
	}

	public String getTelefax() {
		return telefax;
	}

	public void setTelefax( String telefax ) {
		this.telefax = telefax;
	}

	public String getMobil() {
		return mobil;
	}

	public void setMobil( String mobil ) {
		this.mobil = mobil;
	}

	public Integer getNummer() {
		return nummer;
	}

	public void setNummer( Integer nummer ) {
		this.nummer = nummer;
	}

	public Anrede getAnredeID() {
		return anredeID;
	}

	public void setAnredeID( Anrede anredeID ) {
		this.anredeID = anredeID;
	}

	public Ort getOrtID() {
		return ortID;
	}

	public void setOrtID( Ort ortID ) {
		this.ortID = ortID;
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
		if( !(object instanceof Kundenberater) ) {
			return false;
		}
		Kundenberater other = (Kundenberater) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Kundenberater[ id=" + id + " ]";
	}
	
}
