/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teamh2_db_entity_classes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

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
	@NamedQuery(name = "Flugzeug.findByBezeichnung", query = "SELECT f FROM Flugzeug f WHERE f.bezeichnung = :bezeichnung"),
	@NamedQuery(name = "Flugzeug.findByFlugzeugtypID", query = "SELECT f FROM Flugzeug f WHERE f.flugzeugtypID = :flugzeugtypID")})
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
	@Column(name = "FlugzeugtypID")
	private Integer flugzeugtypID;
	@Basic(optional = false)
  @Lob
  @Column(name = "Foto")
	private byte[] foto;

	public Flugzeug() {
	}

	public Flugzeug( Integer id ) {
		this.id = id;
	}

	public Flugzeug( Integer id, byte[] foto ) {
		this.id = id;
		this.foto = foto;
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

	public Integer getFlugzeugtypID() {
		return flugzeugtypID;
	}

	public void setFlugzeugtypID( Integer flugzeugtypID ) {
		this.flugzeugtypID = flugzeugtypID;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto( byte[] foto ) {
		this.foto = foto;
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
		return "teamh2_db_entity_classes.Flugzeug[ id=" + id + " ]";
	}
	
}
