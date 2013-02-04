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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author j.schipplick
 */
@Entity
@Table(name = "personal")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Personal.findAll", query = "SELECT p FROM Personal p"),
	@NamedQuery(name = "Personal.findById", query = "SELECT p FROM Personal p WHERE p.id = :id"),
	@NamedQuery(name = "Personal.findByNummer", query = "SELECT p FROM Personal p WHERE p.nummer = :nummer"),
	@NamedQuery(name = "Personal.findByBezeichnung", query = "SELECT p FROM Personal p WHERE p.bezeichnung = :bezeichnung"),
	@NamedQuery(name = "Personal.findByNachname", query = "SELECT p FROM Personal p WHERE p.nachname = :nachname"),
	@NamedQuery(name = "Personal.findByVorname", query = "SELECT p FROM Personal p WHERE p.vorname = :vorname"),
	@NamedQuery(name = "Personal.findByInfo", query = "SELECT p FROM Personal p WHERE p.info = :info"),
	@NamedQuery(name = "Personal.findByTelefon", query = "SELECT p FROM Personal p WHERE p.telefon = :telefon"),
	@NamedQuery(name = "Personal.findByTelefax", query = "SELECT p FROM Personal p WHERE p.telefax = :telefax"),
	@NamedQuery(name = "Personal.findByMobil", query = "SELECT p FROM Personal p WHERE p.mobil = :mobil")})
public class Personal implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "Nummer")
	private Integer nummer;
	@Column(name = "Bezeichnung")
	private String bezeichnung;
	@Column(name = "Nachname")
	private String nachname;
	@Column(name = "Vorname")
	private String vorname;
	@Column(name = "Info")
	private String info;
	@Column(name = "Telefon")
	private String telefon;
	@Column(name = "Telefax")
	private String telefax;
	@Column(name = "Mobil")
	private String mobil;
	@JoinColumn(name = "PersonaltypID", referencedColumnName = "ID")
  @ManyToOne
	private Personaltyp personaltypID;

	public Personal() {
	}

	public Personal( Integer id ) {
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

	public String getNachname() {
		return nachname;
	}

	public void setNachname( String nachname ) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname( String vorname ) {
		this.vorname = vorname;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo( String info ) {
		this.info = info;
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

	public Personaltyp getPersonaltypID() {
		return personaltypID;
	}

	public void setPersonaltypID( Personaltyp personaltypID ) {
		this.personaltypID = personaltypID;
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
		if( !(object instanceof Personal) ) {
			return false;
		}
		Personal other = (Personal) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Personal[ id=" + id + " ]";
	}
	
}
