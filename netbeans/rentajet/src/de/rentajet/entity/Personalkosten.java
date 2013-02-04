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
@Table(name = "personalkosten")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Personalkosten.findAll", query = "SELECT p FROM Personalkosten p"),
	@NamedQuery(name = "Personalkosten.findById", query = "SELECT p FROM Personalkosten p WHERE p.id = :id"),
	@NamedQuery(name = "Personalkosten.findByNummer", query = "SELECT p FROM Personalkosten p WHERE p.nummer = :nummer"),
	@NamedQuery(name = "Personalkosten.findByArbeitsstunden", query = "SELECT p FROM Personalkosten p WHERE p.arbeitsstunden = :arbeitsstunden"),
	@NamedQuery(name = "Personalkosten.findByJahresgehalt", query = "SELECT p FROM Personalkosten p WHERE p.jahresgehalt = :jahresgehalt"),
	@NamedQuery(name = "Personalkosten.findByStundenlohn", query = "SELECT p FROM Personalkosten p WHERE p.stundenlohn = :stundenlohn"),
	@NamedQuery(name = "Personalkosten.findByStundensatz", query = "SELECT p FROM Personalkosten p WHERE p.stundensatz = :stundensatz"),
	@NamedQuery(name = "Personalkosten.findByBezeichnung", query = "SELECT p FROM Personalkosten p WHERE p.bezeichnung = :bezeichnung")})
public class Personalkosten implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "Nummer")
	private Integer nummer;
	@Column(name = "Arbeitsstunden")
	private Integer arbeitsstunden;
	// @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
	@Column(name = "Jahresgehalt")
	private Double jahresgehalt;
	@Column(name = "Stundenlohn")
	private Double stundenlohn;
	@Column(name = "Stundensatz")
	private Double stundensatz;
	@Column(name = "Bezeichnung")
	private String bezeichnung;
	@JoinColumn(name = "PersonaltypID", referencedColumnName = "ID")
  @ManyToOne
	private Personaltyp personaltypID;

	public Personalkosten() {
	}

	public Personalkosten( Integer id ) {
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

	public Integer getArbeitsstunden() {
		return arbeitsstunden;
	}

	public void setArbeitsstunden( Integer arbeitsstunden ) {
		this.arbeitsstunden = arbeitsstunden;
	}

	public Double getJahresgehalt() {
		return jahresgehalt;
	}

	public void setJahresgehalt( Double jahresgehalt ) {
		this.jahresgehalt = jahresgehalt;
	}

	public Double getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn( Double stundenlohn ) {
		this.stundenlohn = stundenlohn;
	}

	public Double getStundensatz() {
		return stundensatz;
	}

	public void setStundensatz( Double stundensatz ) {
		this.stundensatz = stundensatz;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung( String bezeichnung ) {
		this.bezeichnung = bezeichnung;
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
		if( !(object instanceof Personalkosten) ) {
			return false;
		}
		Personalkosten other = (Personalkosten) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Personalkosten[ id=" + id + " ]";
	}
	
}
