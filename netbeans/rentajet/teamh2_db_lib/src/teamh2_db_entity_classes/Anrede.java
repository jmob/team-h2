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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

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
	@Column(name = "Nummer")
	private Integer nummer;
	@Column(name = "Bezeichnung")
	private String bezeichnung;

	public Anrede() {
	}

	public Anrede( Integer id ) {
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
		return "teamh2_db_entity_classes.Anrede[ id=" + id + " ]";
	}
	
}
