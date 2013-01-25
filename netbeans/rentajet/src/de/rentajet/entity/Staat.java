/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.entity;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author j.schipplick
 */
@Entity
@Table(name = "staat")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Staat.findAll", query = "SELECT s FROM Staat s"),
	@NamedQuery(name = "Staat.findById", query = "SELECT s FROM Staat s WHERE s.id = :id"),
	@NamedQuery(name = "Staat.findByNummer", query = "SELECT s FROM Staat s WHERE s.nummer = :nummer"),
	@NamedQuery(name = "Staat.findByBezeichnung", query = "SELECT s FROM Staat s WHERE s.bezeichnung = :bezeichnung"),
	@NamedQuery(name = "Staat.findByLaendercode", query = "SELECT s FROM Staat s WHERE s.laendercode = :laendercode"),
	@NamedQuery(name = "Staat.findByPostKuerzel", query = "SELECT s FROM Staat s WHERE s.postKuerzel = :postKuerzel"),
	@NamedQuery(name = "Staat.findByPostName", query = "SELECT s FROM Staat s WHERE s.postName = :postName")})
public class Staat implements Serializable {
	@Transient
	private PropertyChangeSupport changeSupport = new PropertyChangeSupport( this );
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "Nummer")
	private Integer nummer;
	@Column(name = "Bezeichnung")
	private String bezeichnung;
	@Column(name = "Laendercode")
	private String laendercode;
	@Column(name = "PostKuerzel")
	private String postKuerzel;
	@Column(name = "PostName")
	private String postName;

	public Staat() {
	}

	public Staat( Integer id ) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId( Integer id ) {
		Integer oldId = this.id;
		this.id = id;
		changeSupport.firePropertyChange( "id", oldId, id );
	}

	public Integer getNummer() {
		return nummer;
	}

	public void setNummer( Integer nummer ) {
		Integer oldNummer = this.nummer;
		this.nummer = nummer;
		changeSupport.firePropertyChange( "nummer", oldNummer, nummer );
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung( String bezeichnung ) {
		String oldBezeichnung = this.bezeichnung;
		this.bezeichnung = bezeichnung;
		changeSupport.firePropertyChange( "bezeichnung", oldBezeichnung, bezeichnung );
	}

	public String getLaendercode() {
		return laendercode;
	}

	public void setLaendercode( String laendercode ) {
		String oldLaendercode = this.laendercode;
		this.laendercode = laendercode;
		changeSupport.firePropertyChange( "laendercode", oldLaendercode, laendercode );
	}

	public String getPostKuerzel() {
		return postKuerzel;
	}

	public void setPostKuerzel( String postKuerzel ) {
		String oldPostKuerzel = this.postKuerzel;
		this.postKuerzel = postKuerzel;
		changeSupport.firePropertyChange( "postKuerzel", oldPostKuerzel, postKuerzel );
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName( String postName ) {
		String oldPostName = this.postName;
		this.postName = postName;
		changeSupport.firePropertyChange( "postName", oldPostName, postName );
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
		if( !(object instanceof Staat) ) {
			return false;
		}
		Staat other = (Staat) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Staat[ id=" + id + " ]";
	}

	public void addPropertyChangeListener( PropertyChangeListener listener ) {
		changeSupport.addPropertyChangeListener( listener );
	}

	public void removePropertyChangeListener( PropertyChangeListener listener ) {
		changeSupport.removePropertyChangeListener( listener );
	}
	
}
