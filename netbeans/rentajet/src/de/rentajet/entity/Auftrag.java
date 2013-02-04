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
@Table(name = "auftrag")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "Auftrag.findAll", query = "SELECT a FROM Auftrag a"),
	@NamedQuery(name = "Auftrag.findById", query = "SELECT a FROM Auftrag a WHERE a.id = :id"),
	@NamedQuery(name = "Auftrag.findByNummer", query = "SELECT a FROM Auftrag a WHERE a.nummer = :nummer"),
	@NamedQuery(name = "Auftrag.findByDatum", query = "SELECT a FROM Auftrag a WHERE a.datum = :datum"),
	@NamedQuery(name = "Auftrag.findByVorgArt", query = "SELECT a FROM Auftrag a WHERE a.vorgArt = :vorgArt"),
	@NamedQuery(name = "Auftrag.findByRechnungsdatum", query = "SELECT a FROM Auftrag a WHERE a.rechnungsdatum = :rechnungsdatum"),
	@NamedQuery(name = "Auftrag.findByKunde", query = "SELECT a FROM Auftrag a WHERE a.kunde = :kunde"),
	@NamedQuery(name = "Auftrag.findByName1", query = "SELECT a FROM Auftrag a WHERE a.name1 = :name1"),
	@NamedQuery(name = "Auftrag.findByName2", query = "SELECT a FROM Auftrag a WHERE a.name2 = :name2"),
	@NamedQuery(name = "Auftrag.findByName3", query = "SELECT a FROM Auftrag a WHERE a.name3 = :name3"),
	@NamedQuery(name = "Auftrag.findByStrasse", query = "SELECT a FROM Auftrag a WHERE a.strasse = :strasse"),
	@NamedQuery(name = "Auftrag.findByPlz", query = "SELECT a FROM Auftrag a WHERE a.plz = :plz"),
	@NamedQuery(name = "Auftrag.findByOrt", query = "SELECT a FROM Auftrag a WHERE a.ort = :ort"),
	@NamedQuery(name = "Auftrag.findByMitarbKunde", query = "SELECT a FROM Auftrag a WHERE a.mitarbKunde = :mitarbKunde"),
	@NamedQuery(name = "Auftrag.findByMitarbKundeVorname", query = "SELECT a FROM Auftrag a WHERE a.mitarbKundeVorname = :mitarbKundeVorname"),
	@NamedQuery(name = "Auftrag.findByMitarbKundeName", query = "SELECT a FROM Auftrag a WHERE a.mitarbKundeName = :mitarbKundeName"),
	@NamedQuery(name = "Auftrag.findByKundenberater", query = "SELECT a FROM Auftrag a WHERE a.kundenberater = :kundenberater"),
	@NamedQuery(name = "Auftrag.findByFlugdatum", query = "SELECT a FROM Auftrag a WHERE a.flugdatum = :flugdatum"),
	@NamedQuery(name = "Auftrag.findByUhrzeit", query = "SELECT a FROM Auftrag a WHERE a.uhrzeit = :uhrzeit"),
	@NamedQuery(name = "Auftrag.findByFlugdatumEnde", query = "SELECT a FROM Auftrag a WHERE a.flugdatumEnde = :flugdatumEnde"),
	@NamedQuery(name = "Auftrag.findByUhrzeitEnde", query = "SELECT a FROM Auftrag a WHERE a.uhrzeitEnde = :uhrzeitEnde"),
	@NamedQuery(name = "Auftrag.findByStart", query = "SELECT a FROM Auftrag a WHERE a.start = :start"),
	@NamedQuery(name = "Auftrag.findByZiel", query = "SELECT a FROM Auftrag a WHERE a.ziel = :ziel"),
	@NamedQuery(name = "Auftrag.findByKilometer", query = "SELECT a FROM Auftrag a WHERE a.kilometer = :kilometer"),
	@NamedQuery(name = "Auftrag.findByPersonen", query = "SELECT a FROM Auftrag a WHERE a.personen = :personen"),
	@NamedQuery(name = "Auftrag.findByStops", query = "SELECT a FROM Auftrag a WHERE a.stops = :stops"),
	@NamedQuery(name = "Auftrag.findByErsterStop", query = "SELECT a FROM Auftrag a WHERE a.ersterStop = :ersterStop"),
	@NamedQuery(name = "Auftrag.findByZweiterStop", query = "SELECT a FROM Auftrag a WHERE a.zweiterStop = :zweiterStop"),
	@NamedQuery(name = "Auftrag.findByDritterStop", query = "SELECT a FROM Auftrag a WHERE a.dritterStop = :dritterStop"),
	@NamedQuery(name = "Auftrag.findByVierterStop", query = "SELECT a FROM Auftrag a WHERE a.vierterStop = :vierterStop"),
	@NamedQuery(name = "Auftrag.findByFuenfterStop", query = "SELECT a FROM Auftrag a WHERE a.fuenfterStop = :fuenfterStop"),
	@NamedQuery(name = "Auftrag.findBySechsterStop", query = "SELECT a FROM Auftrag a WHERE a.sechsterStop = :sechsterStop"),
	@NamedQuery(name = "Auftrag.findByErsterStopAufenthalt", query = "SELECT a FROM Auftrag a WHERE a.ersterStopAufenthalt = :ersterStopAufenthalt"),
	@NamedQuery(name = "Auftrag.findByZweiterStopAufenthalt", query = "SELECT a FROM Auftrag a WHERE a.zweiterStopAufenthalt = :zweiterStopAufenthalt"),
	@NamedQuery(name = "Auftrag.findByDritterStopAufenthalt", query = "SELECT a FROM Auftrag a WHERE a.dritterStopAufenthalt = :dritterStopAufenthalt"),
	@NamedQuery(name = "Auftrag.findByVierterStopAufenthalt", query = "SELECT a FROM Auftrag a WHERE a.vierterStopAufenthalt = :vierterStopAufenthalt"),
	@NamedQuery(name = "Auftrag.findByFuenfterStopAufenthalt", query = "SELECT a FROM Auftrag a WHERE a.fuenfterStopAufenthalt = :fuenfterStopAufenthalt"),
	@NamedQuery(name = "Auftrag.findBySechsterStopAufenthalt", query = "SELECT a FROM Auftrag a WHERE a.sechsterStopAufenthalt = :sechsterStopAufenthalt"),
	@NamedQuery(name = "Auftrag.findByFlugzeit", query = "SELECT a FROM Auftrag a WHERE a.flugzeit = :flugzeit"),
	@NamedQuery(name = "Auftrag.findByFlightcrew", query = "SELECT a FROM Auftrag a WHERE a.flightcrew = :flightcrew"),
	@NamedQuery(name = "Auftrag.findByCabincrew", query = "SELECT a FROM Auftrag a WHERE a.cabincrew = :cabincrew"),
	@NamedQuery(name = "Auftrag.findByCatering", query = "SELECT a FROM Auftrag a WHERE a.catering = :catering"),
	@NamedQuery(name = "Auftrag.findByKostenFlug", query = "SELECT a FROM Auftrag a WHERE a.kostenFlug = :kostenFlug"),
	@NamedQuery(name = "Auftrag.findByKostenStop", query = "SELECT a FROM Auftrag a WHERE a.kostenStop = :kostenStop"),
	@NamedQuery(name = "Auftrag.findByKostenFlightcrew", query = "SELECT a FROM Auftrag a WHERE a.kostenFlightcrew = :kostenFlightcrew"),
	@NamedQuery(name = "Auftrag.findByKostenCabincrew", query = "SELECT a FROM Auftrag a WHERE a.kostenCabincrew = :kostenCabincrew"),
	@NamedQuery(name = "Auftrag.findByKostenCatering", query = "SELECT a FROM Auftrag a WHERE a.kostenCatering = :kostenCatering"),
	@NamedQuery(name = "Auftrag.findByKostenFlugGesamt", query = "SELECT a FROM Auftrag a WHERE a.kostenFlugGesamt = :kostenFlugGesamt"),
	@NamedQuery(name = "Auftrag.findByKostenStopGesamt", query = "SELECT a FROM Auftrag a WHERE a.kostenStopGesamt = :kostenStopGesamt"),
	@NamedQuery(name = "Auftrag.findByKostenFlightcrewGesamt", query = "SELECT a FROM Auftrag a WHERE a.kostenFlightcrewGesamt = :kostenFlightcrewGesamt"),
	@NamedQuery(name = "Auftrag.findByKostenCabincrewGesamt", query = "SELECT a FROM Auftrag a WHERE a.kostenCabincrewGesamt = :kostenCabincrewGesamt"),
	@NamedQuery(name = "Auftrag.findByKostenCateringGesamt", query = "SELECT a FROM Auftrag a WHERE a.kostenCateringGesamt = :kostenCateringGesamt"),
	@NamedQuery(name = "Auftrag.findByNetto", query = "SELECT a FROM Auftrag a WHERE a.netto = :netto"),
	@NamedQuery(name = "Auftrag.findByRabattProzent", query = "SELECT a FROM Auftrag a WHERE a.rabattProzent = :rabattProzent"),
	@NamedQuery(name = "Auftrag.findByRabatt", query = "SELECT a FROM Auftrag a WHERE a.rabatt = :rabatt"),
	@NamedQuery(name = "Auftrag.findByMwSt", query = "SELECT a FROM Auftrag a WHERE a.mwSt = :mwSt"),
	@NamedQuery(name = "Auftrag.findByBrutto", query = "SELECT a FROM Auftrag a WHERE a.brutto = :brutto"),
	@NamedQuery(name = "Auftrag.findByZahlungsbedingung", query = "SELECT a FROM Auftrag a WHERE a.zahlungsbedingung = :zahlungsbedingung"),
	@NamedQuery(name = "Auftrag.findByValuta", query = "SELECT a FROM Auftrag a WHERE a.valuta = :valuta"),
	@NamedQuery(name = "Auftrag.findBySkontoValuta", query = "SELECT a FROM Auftrag a WHERE a.skontoValuta = :skontoValuta"),
	@NamedQuery(name = "Auftrag.findBySkontosatz", query = "SELECT a FROM Auftrag a WHERE a.skontosatz = :skontosatz"),
	@NamedQuery(name = "Auftrag.findByKostenFlugVar", query = "SELECT a FROM Auftrag a WHERE a.kostenFlugVar = :kostenFlugVar"),
	@NamedQuery(name = "Auftrag.findByKostenFlugVarGesamt", query = "SELECT a FROM Auftrag a WHERE a.kostenFlugVarGesamt = :kostenFlugVarGesamt"),
	@NamedQuery(name = "Auftrag.findByCaptainID", query = "SELECT a FROM Auftrag a WHERE a.captainID = :captainID"),
	@NamedQuery(name = "Auftrag.findByOfficerID", query = "SELECT a FROM Auftrag a WHERE a.officerID = :officerID"),
	@NamedQuery(name = "Auftrag.findByFlugbegleiterEinsID", query = "SELECT a FROM Auftrag a WHERE a.flugbegleiterEinsID = :flugbegleiterEinsID"),
	@NamedQuery(name = "Auftrag.findByFlugbegleiterZweiID", query = "SELECT a FROM Auftrag a WHERE a.flugbegleiterZweiID = :flugbegleiterZweiID"),
	@NamedQuery(name = "Auftrag.findByCharterzeit", query = "SELECT a FROM Auftrag a WHERE a.charterzeit = :charterzeit")})
public class Auftrag implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
  @Basic(optional = false)
  @Column(name = "ID")
	private Integer id;
	@Column(name = "Nummer")
	private Integer nummer;
	@Column(name = "Datum")
	private String datum;
	@Column(name = "VorgArt")
	private Integer vorgArt;
	@Column(name = "Rechnungsdatum")
	private String rechnungsdatum;
	@Column(name = "Kunde")
	private Integer kunde;
	@Column(name = "Name1")
	private String name1;
	@Column(name = "Name2")
	private String name2;
	@Column(name = "Name3")
	private String name3;
	@Column(name = "Strasse")
	private String strasse;
	@Column(name = "PLZ")
	private Integer plz;
	@Column(name = "Ort")
	private String ort;
	@Column(name = "MitarbKunde")
	private Integer mitarbKunde;
	@Column(name = "MitarbKundeVorname")
	private String mitarbKundeVorname;
	@Column(name = "MitarbKundeName")
	private String mitarbKundeName;
	@Column(name = "Kundenberater")
	private Integer kundenberater;
	@Column(name = "Flugdatum")
	private String flugdatum;
	@Column(name = "Uhrzeit")
	private String uhrzeit;
	@Column(name = "FlugdatumEnde")
	private String flugdatumEnde;
	@Column(name = "UhrzeitEnde")
	private String uhrzeitEnde;
	@Column(name = "Start")
	private Integer start;
	@Column(name = "Ziel")
	private Integer ziel;
	@Column(name = "Kilometer")
	private Integer kilometer;
	@Column(name = "Personen")
	private Integer personen;
	@Column(name = "Stops")
	private Integer stops;
	@Column(name = "ErsterStop")
	private Integer ersterStop;
	@Column(name = "ZweiterStop")
	private Integer zweiterStop;
	@Column(name = "DritterStop")
	private Integer dritterStop;
	@Column(name = "VierterStop")
	private Integer vierterStop;
	@Column(name = "FuenfterStop")
	private Integer fuenfterStop;
	@Column(name = "SechsterStop")
	private Integer sechsterStop;
	@Column(name = "ErsterStopAufenthalt")
	private Integer ersterStopAufenthalt;
	@Column(name = "ZweiterStopAufenthalt")
	private Integer zweiterStopAufenthalt;
	@Column(name = "DritterStopAufenthalt")
	private Integer dritterStopAufenthalt;
	@Column(name = "VierterStopAufenthalt")
	private Integer vierterStopAufenthalt;
	@Column(name = "FuenfterStopAufenthalt")
	private Integer fuenfterStopAufenthalt;
	@Column(name = "SechsterStopAufenthalt")
	private Integer sechsterStopAufenthalt;
	@Column(name = "Flugzeit")
	private Integer flugzeit;
	@Column(name = "Flightcrew")
	private Integer flightcrew;
	@Column(name = "Cabincrew")
	private Integer cabincrew;
	@Column(name = "Catering")
	private Integer catering;
	// @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
	@Column(name = "KostenFlug")
	private Double kostenFlug;
	@Column(name = "KostenStop")
	private Double kostenStop;
	@Column(name = "KostenFlightcrew")
	private Double kostenFlightcrew;
	@Column(name = "KostenCabincrew")
	private Double kostenCabincrew;
	@Column(name = "KostenCatering")
	private Double kostenCatering;
	@Column(name = "KostenFlugGesamt")
	private Double kostenFlugGesamt;
	@Column(name = "KostenStopGesamt")
	private Double kostenStopGesamt;
	@Column(name = "KostenFlightcrewGesamt")
	private Double kostenFlightcrewGesamt;
	@Column(name = "KostenCabincrewGesamt")
	private Double kostenCabincrewGesamt;
	@Column(name = "KostenCateringGesamt")
	private Double kostenCateringGesamt;
	@Column(name = "Netto")
	private Double netto;
	@Column(name = "RabattProzent")
	private Double rabattProzent;
	@Column(name = "Rabatt")
	private Double rabatt;
	@Column(name = "MwSt")
	private Double mwSt;
	@Column(name = "Brutto")
	private Double brutto;
	@Column(name = "Zahlungsbedingung")
	private Integer zahlungsbedingung;
	@Column(name = "Valuta")
	private Integer valuta;
	@Column(name = "SkontoValuta")
	private Integer skontoValuta;
	@Column(name = "Skontosatz")
	private Double skontosatz;
	@Column(name = "KostenFlugVar")
	private Double kostenFlugVar;
	@Column(name = "KostenFlugVarGesamt")
	private Double kostenFlugVarGesamt;
	@Column(name = "CaptainID")
	private Integer captainID;
	@Column(name = "OfficerID")
	private Integer officerID;
	@Column(name = "FlugbegleiterEinsID")
	private Integer flugbegleiterEinsID;
	@Column(name = "FlugbegleiterZweiID")
	private Integer flugbegleiterZweiID;
	@Column(name = "Charterzeit")
	private Integer charterzeit;
	@JoinColumn(name = "FlugzeugID", referencedColumnName = "ID")
  @ManyToOne
	private Flugzeug flugzeugID;

	public Auftrag() {
	}

	public Auftrag( Integer id ) {
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

	public String getDatum() {
		return datum;
	}

	public void setDatum( String datum ) {
		this.datum = datum;
	}

	public Integer getVorgArt() {
		return vorgArt;
	}

	public void setVorgArt( Integer vorgArt ) {
		this.vorgArt = vorgArt;
	}

	public String getRechnungsdatum() {
		return rechnungsdatum;
	}

	public void setRechnungsdatum( String rechnungsdatum ) {
		this.rechnungsdatum = rechnungsdatum;
	}

	public Integer getKunde() {
		return kunde;
	}

	public void setKunde( Integer kunde ) {
		this.kunde = kunde;
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

	public Integer getPlz() {
		return plz;
	}

	public void setPlz( Integer plz ) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt( String ort ) {
		this.ort = ort;
	}

	public Integer getMitarbKunde() {
		return mitarbKunde;
	}

	public void setMitarbKunde( Integer mitarbKunde ) {
		this.mitarbKunde = mitarbKunde;
	}

	public String getMitarbKundeVorname() {
		return mitarbKundeVorname;
	}

	public void setMitarbKundeVorname( String mitarbKundeVorname ) {
		this.mitarbKundeVorname = mitarbKundeVorname;
	}

	public String getMitarbKundeName() {
		return mitarbKundeName;
	}

	public void setMitarbKundeName( String mitarbKundeName ) {
		this.mitarbKundeName = mitarbKundeName;
	}

	public Integer getKundenberater() {
		return kundenberater;
	}

	public void setKundenberater( Integer kundenberater ) {
		this.kundenberater = kundenberater;
	}

	public String getFlugdatum() {
		return flugdatum;
	}

	public void setFlugdatum( String flugdatum ) {
		this.flugdatum = flugdatum;
	}

	public String getUhrzeit() {
		return uhrzeit;
	}

	public void setUhrzeit( String uhrzeit ) {
		this.uhrzeit = uhrzeit;
	}

	public String getFlugdatumEnde() {
		return flugdatumEnde;
	}

	public void setFlugdatumEnde( String flugdatumEnde ) {
		this.flugdatumEnde = flugdatumEnde;
	}

	public String getUhrzeitEnde() {
		return uhrzeitEnde;
	}

	public void setUhrzeitEnde( String uhrzeitEnde ) {
		this.uhrzeitEnde = uhrzeitEnde;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart( Integer start ) {
		this.start = start;
	}

	public Integer getZiel() {
		return ziel;
	}

	public void setZiel( Integer ziel ) {
		this.ziel = ziel;
	}

	public Integer getKilometer() {
		return kilometer;
	}

	public void setKilometer( Integer kilometer ) {
		this.kilometer = kilometer;
	}

	public Integer getPersonen() {
		return personen;
	}

	public void setPersonen( Integer personen ) {
		this.personen = personen;
	}

	public Integer getStops() {
		return stops;
	}

	public void setStops( Integer stops ) {
		this.stops = stops;
	}

	public Integer getErsterStop() {
		return ersterStop;
	}

	public void setErsterStop( Integer ersterStop ) {
		this.ersterStop = ersterStop;
	}

	public Integer getZweiterStop() {
		return zweiterStop;
	}

	public void setZweiterStop( Integer zweiterStop ) {
		this.zweiterStop = zweiterStop;
	}

	public Integer getDritterStop() {
		return dritterStop;
	}

	public void setDritterStop( Integer dritterStop ) {
		this.dritterStop = dritterStop;
	}

	public Integer getVierterStop() {
		return vierterStop;
	}

	public void setVierterStop( Integer vierterStop ) {
		this.vierterStop = vierterStop;
	}

	public Integer getFuenfterStop() {
		return fuenfterStop;
	}

	public void setFuenfterStop( Integer fuenfterStop ) {
		this.fuenfterStop = fuenfterStop;
	}

	public Integer getSechsterStop() {
		return sechsterStop;
	}

	public void setSechsterStop( Integer sechsterStop ) {
		this.sechsterStop = sechsterStop;
	}

	public Integer getErsterStopAufenthalt() {
		return ersterStopAufenthalt;
	}

	public void setErsterStopAufenthalt( Integer ersterStopAufenthalt ) {
		this.ersterStopAufenthalt = ersterStopAufenthalt;
	}

	public Integer getZweiterStopAufenthalt() {
		return zweiterStopAufenthalt;
	}

	public void setZweiterStopAufenthalt( Integer zweiterStopAufenthalt ) {
		this.zweiterStopAufenthalt = zweiterStopAufenthalt;
	}

	public Integer getDritterStopAufenthalt() {
		return dritterStopAufenthalt;
	}

	public void setDritterStopAufenthalt( Integer dritterStopAufenthalt ) {
		this.dritterStopAufenthalt = dritterStopAufenthalt;
	}

	public Integer getVierterStopAufenthalt() {
		return vierterStopAufenthalt;
	}

	public void setVierterStopAufenthalt( Integer vierterStopAufenthalt ) {
		this.vierterStopAufenthalt = vierterStopAufenthalt;
	}

	public Integer getFuenfterStopAufenthalt() {
		return fuenfterStopAufenthalt;
	}

	public void setFuenfterStopAufenthalt( Integer fuenfterStopAufenthalt ) {
		this.fuenfterStopAufenthalt = fuenfterStopAufenthalt;
	}

	public Integer getSechsterStopAufenthalt() {
		return sechsterStopAufenthalt;
	}

	public void setSechsterStopAufenthalt( Integer sechsterStopAufenthalt ) {
		this.sechsterStopAufenthalt = sechsterStopAufenthalt;
	}

	public Integer getFlugzeit() {
		return flugzeit;
	}

	public void setFlugzeit( Integer flugzeit ) {
		this.flugzeit = flugzeit;
	}

	public Integer getFlightcrew() {
		return flightcrew;
	}

	public void setFlightcrew( Integer flightcrew ) {
		this.flightcrew = flightcrew;
	}

	public Integer getCabincrew() {
		return cabincrew;
	}

	public void setCabincrew( Integer cabincrew ) {
		this.cabincrew = cabincrew;
	}

	public Integer getCatering() {
		return catering;
	}

	public void setCatering( Integer catering ) {
		this.catering = catering;
	}

	public Double getKostenFlug() {
		return kostenFlug;
	}

	public void setKostenFlug( Double kostenFlug ) {
		this.kostenFlug = kostenFlug;
	}

	public Double getKostenStop() {
		return kostenStop;
	}

	public void setKostenStop( Double kostenStop ) {
		this.kostenStop = kostenStop;
	}

	public Double getKostenFlightcrew() {
		return kostenFlightcrew;
	}

	public void setKostenFlightcrew( Double kostenFlightcrew ) {
		this.kostenFlightcrew = kostenFlightcrew;
	}

	public Double getKostenCabincrew() {
		return kostenCabincrew;
	}

	public void setKostenCabincrew( Double kostenCabincrew ) {
		this.kostenCabincrew = kostenCabincrew;
	}

	public Double getKostenCatering() {
		return kostenCatering;
	}

	public void setKostenCatering( Double kostenCatering ) {
		this.kostenCatering = kostenCatering;
	}

	public Double getKostenFlugGesamt() {
		return kostenFlugGesamt;
	}

	public void setKostenFlugGesamt( Double kostenFlugGesamt ) {
		this.kostenFlugGesamt = kostenFlugGesamt;
	}

	public Double getKostenStopGesamt() {
		return kostenStopGesamt;
	}

	public void setKostenStopGesamt( Double kostenStopGesamt ) {
		this.kostenStopGesamt = kostenStopGesamt;
	}

	public Double getKostenFlightcrewGesamt() {
		return kostenFlightcrewGesamt;
	}

	public void setKostenFlightcrewGesamt( Double kostenFlightcrewGesamt ) {
		this.kostenFlightcrewGesamt = kostenFlightcrewGesamt;
	}

	public Double getKostenCabincrewGesamt() {
		return kostenCabincrewGesamt;
	}

	public void setKostenCabincrewGesamt( Double kostenCabincrewGesamt ) {
		this.kostenCabincrewGesamt = kostenCabincrewGesamt;
	}

	public Double getKostenCateringGesamt() {
		return kostenCateringGesamt;
	}

	public void setKostenCateringGesamt( Double kostenCateringGesamt ) {
		this.kostenCateringGesamt = kostenCateringGesamt;
	}

	public Double getNetto() {
		return netto;
	}

	public void setNetto( Double netto ) {
		this.netto = netto;
	}

	public Double getRabattProzent() {
		return rabattProzent;
	}

	public void setRabattProzent( Double rabattProzent ) {
		this.rabattProzent = rabattProzent;
	}

	public Double getRabatt() {
		return rabatt;
	}

	public void setRabatt( Double rabatt ) {
		this.rabatt = rabatt;
	}

	public Double getMwSt() {
		return mwSt;
	}

	public void setMwSt( Double mwSt ) {
		this.mwSt = mwSt;
	}

	public Double getBrutto() {
		return brutto;
	}

	public void setBrutto( Double brutto ) {
		this.brutto = brutto;
	}

	public Integer getZahlungsbedingung() {
		return zahlungsbedingung;
	}

	public void setZahlungsbedingung( Integer zahlungsbedingung ) {
		this.zahlungsbedingung = zahlungsbedingung;
	}

	public Integer getValuta() {
		return valuta;
	}

	public void setValuta( Integer valuta ) {
		this.valuta = valuta;
	}

	public Integer getSkontoValuta() {
		return skontoValuta;
	}

	public void setSkontoValuta( Integer skontoValuta ) {
		this.skontoValuta = skontoValuta;
	}

	public Double getSkontosatz() {
		return skontosatz;
	}

	public void setSkontosatz( Double skontosatz ) {
		this.skontosatz = skontosatz;
	}

	public Double getKostenFlugVar() {
		return kostenFlugVar;
	}

	public void setKostenFlugVar( Double kostenFlugVar ) {
		this.kostenFlugVar = kostenFlugVar;
	}

	public Double getKostenFlugVarGesamt() {
		return kostenFlugVarGesamt;
	}

	public void setKostenFlugVarGesamt( Double kostenFlugVarGesamt ) {
		this.kostenFlugVarGesamt = kostenFlugVarGesamt;
	}

	public Integer getCaptainID() {
		return captainID;
	}

	public void setCaptainID( Integer captainID ) {
		this.captainID = captainID;
	}

	public Integer getOfficerID() {
		return officerID;
	}

	public void setOfficerID( Integer officerID ) {
		this.officerID = officerID;
	}

	public Integer getFlugbegleiterEinsID() {
		return flugbegleiterEinsID;
	}

	public void setFlugbegleiterEinsID( Integer flugbegleiterEinsID ) {
		this.flugbegleiterEinsID = flugbegleiterEinsID;
	}

	public Integer getFlugbegleiterZweiID() {
		return flugbegleiterZweiID;
	}

	public void setFlugbegleiterZweiID( Integer flugbegleiterZweiID ) {
		this.flugbegleiterZweiID = flugbegleiterZweiID;
	}

	public Integer getCharterzeit() {
		return charterzeit;
	}

	public void setCharterzeit( Integer charterzeit ) {
		this.charterzeit = charterzeit;
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
		if( !(object instanceof Auftrag) ) {
			return false;
		}
		Auftrag other = (Auftrag) object;
		if( (this.id == null && other.id != null) || (this.id != null && !this.id.equals( other.id )) ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "de.rentajet.entity.Auftrag[ id=" + id + " ]";
	}
	
}
