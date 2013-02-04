/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author j.schipplick
 */
@Entity
@Table(name = "buchung")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Buchung.findAll", query = "SELECT b FROM Buchung b"),
	@NamedQuery(name = "Buchung.findById", query = "SELECT b FROM Buchung b WHERE b.id = :id"),
	@NamedQuery(name = "Buchung.findByNummer", query = "SELECT b FROM Buchung b WHERE b.nummer = :nummer"),
	@NamedQuery(name = "Buchung.findByBuchungStart", query = "SELECT b FROM Buchung b WHERE b.buchungStart = :buchungStart"),
	@NamedQuery(name = "Buchung.findByBuchungEnde", query = "SELECT b FROM Buchung b WHERE b.buchungEnde = :buchungEnde")})
public class Buchung implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "Nummer")
	private Integer nummer;
	@Column(name = "BuchungStart")
  @Temporal(TemporalType.DATE)
	private Date buchungStart;
	@Column(name = "BuchungEnde")
  @Temporal(TemporalType.DATE)
	private Date buchungEnde;
	@JoinColumn(name = "FlugzeugtypID", referencedColumnName = "ID")
  @ManyToOne
	private Flugzeugtyp flugzeugtypID;
	@JoinColumn(name = "FlugzeugID", referencedColumnName = "ID")
  @ManyToOne
	private Flugzeug flugzeugID;

	public Buchung() {
	}

	public Buchung( Integer id ) {
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

	public Date getBuchungStart() {
		return buchungStart;
	}

	public void setBuchungStart( Date buchungStart ) {
		this.buchungStart = buchungStart;
	}

	public Date getBuchungEnde() {
		return buchungEnde;
	}

	public void setBuchungEnde( Date buchungEnde ) {
		this.buchungEnde = buchungEnde;
	}

	public Flugzeugtyp getFlugzeugtypID() {
		return flugzeugtypID;
	}

	public void setFlugzeugtypID( Flugzeugtyp flugzeugtypID ) {
		this.flugzeugtypID = flugzeugtypID;
	}

	public Flugzeug getFlugzeugID() {
		return flugzeugID;
	}

	public void setFlugzeugID( Flugzeug flugzeugID ) {
		this.flugzeugID = flugzeugID;
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
		if( !(object instanceof Buchung) ) {
			return false;
		}
		Buchung other = (Buchung) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Buchung[ id=" + id + " ]";
	}
	
}
