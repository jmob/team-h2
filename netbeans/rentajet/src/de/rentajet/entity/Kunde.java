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
@Table(name = "kunde")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Kunde.findAll", query = "SELECT k FROM Kunde k"),
	@NamedQuery(name = "Kunde.findById", query = "SELECT k FROM Kunde k WHERE k.id = :id"),
	@NamedQuery(name = "Kunde.findByNummer", query = "SELECT k FROM Kunde k WHERE k.nummer = :nummer"),
	@NamedQuery(name = "Kunde.findByMatchcode", query = "SELECT k FROM Kunde k WHERE k.matchcode = :matchcode"),
	@NamedQuery(name = "Kunde.findByName1", query = "SELECT k FROM Kunde k WHERE k.name1 = :name1"),
	@NamedQuery(name = "Kunde.findByName2", query = "SELECT k FROM Kunde k WHERE k.name2 = :name2"),
	@NamedQuery(name = "Kunde.findByName3", query = "SELECT k FROM Kunde k WHERE k.name3 = :name3"),
	@NamedQuery(name = "Kunde.findByStrasse", query = "SELECT k FROM Kunde k WHERE k.strasse = :strasse"),
	@NamedQuery(name = "Kunde.findByTelefon", query = "SELECT k FROM Kunde k WHERE k.telefon = :telefon"),
	@NamedQuery(name = "Kunde.findByTelefax", query = "SELECT k FROM Kunde k WHERE k.telefax = :telefax"),
	@NamedQuery(name = "Kunde.findByMobil", query = "SELECT k FROM Kunde k WHERE k.mobil = :mobil"),
	@NamedQuery(name = "Kunde.findByGesperrt", query = "SELECT k FROM Kunde k WHERE k.gesperrt = :gesperrt"),
	@NamedQuery(name = "Kunde.findByKreditlimit", query = "SELECT k FROM Kunde k WHERE k.kreditlimit = :kreditlimit"),
	@NamedQuery(name = "Kunde.findBySteuernummer", query = "SELECT k FROM Kunde k WHERE k.steuernummer = :steuernummer"),
	@NamedQuery(name = "Kunde.findByMitarbeiter", query = "SELECT k FROM Kunde k WHERE k.mitarbeiter = :mitarbeiter")})
public class Kunde implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "Nummer")
	private Integer nummer;
	@Column(name = "Matchcode")
	private String matchcode;
	@Column(name = "Name1")
	private String name1;
	@Column(name = "Name2")
	private String name2;
	@Column(name = "Name3")
	private String name3;
	@Column(name = "Strasse")
	private String strasse;
	@Column(name = "Telefon")
	private String telefon;
	@Column(name = "Telefax")
	private String telefax;
	@Column(name = "Mobil")
	private String mobil;
	@Column(name = "Gesperrt")
	private Boolean gesperrt;
	// @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
	@Column(name = "Kreditlimit")
	private Double kreditlimit;
	@Column(name = "Steuernummer")
	private String steuernummer;
	@Column(name = "Mitarbeiter")
	private String mitarbeiter;
	@OneToMany(mappedBy = "kundeID")
	private Collection<Mitarbkunde> mitarbkundeCollection;
	@JoinColumn(name = "OrtID", referencedColumnName = "ID")
  @ManyToOne
	private Ort ortID;
	@JoinColumn(name = "KundenberaterID", referencedColumnName = "ID")
  @ManyToOne
	private Kundenberater kundenberaterID;
	@JoinColumn(name = "AnredeID", referencedColumnName = "ID")
  @ManyToOne
	private Anrede anredeID;

	public Kunde() {
	}

	public Kunde( Integer id ) {
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

	public String getMatchcode() {
		return matchcode;
	}

	public void setMatchcode( String matchcode ) {
		this.matchcode = matchcode;
	}

	public String getName1() {
		return name1;
	}

	public void setName1( String name1 ) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2( String name2 ) {
		this.name2 = name2;
	}

	public String getName3() {
		return name3;
	}

	public void setName3( String name3 ) {
		this.name3 = name3;
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

	public Boolean getGesperrt() {
		return gesperrt;
	}

	public void setGesperrt( Boolean gesperrt ) {
		this.gesperrt = gesperrt;
	}

	public Double getKreditlimit() {
		return kreditlimit;
	}

	public void setKreditlimit( Double kreditlimit ) {
		this.kreditlimit = kreditlimit;
	}

	public String getSteuernummer() {
		return steuernummer;
	}

	public void setSteuernummer( String steuernummer ) {
		this.steuernummer = steuernummer;
	}

	public String getMitarbeiter() {
		return mitarbeiter;
	}

	public void setMitarbeiter( String mitarbeiter ) {
		this.mitarbeiter = mitarbeiter;
	}

	@XmlTransient
	public Collection<Mitarbkunde> getMitarbkundeCollection() {
		return mitarbkundeCollection;
	}

	public void setMitarbkundeCollection( Collection<Mitarbkunde> mitarbkundeCollection ) {
		this.mitarbkundeCollection = mitarbkundeCollection;
	}

	public Ort getOrtID() {
		return ortID;
	}

	public void setOrtID( Ort ortID ) {
		this.ortID = ortID;
	}

	public Kundenberater getKundenberaterID() {
		return kundenberaterID;
	}

	public void setKundenberaterID( Kundenberater kundenberaterID ) {
		this.kundenberaterID = kundenberaterID;
	}

	public Anrede getAnredeID() {
		return anredeID;
	}

	public void setAnredeID( Anrede anredeID ) {
		this.anredeID = anredeID;
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
		if( !(object instanceof Kunde) ) {
			return false;
		}
		Kunde other = (Kunde) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Kunde[ id=" + id + " ]";
	}
	
}
