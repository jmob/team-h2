/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.  XXXX
 */
package de.rentajet.frames;

import de.rentajet.base.H2InternalFrame;
import de.rentajet.uti.Util;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Petersen
 */
public class AuftragInfo {
	private pnlAuftrag pnlAuftrag;
	private int iID;
	private int iNummer;
	private String sDatum;
	private int iVorgArt;
	private String sRechnungsdatum;
	private int iKunde;
	private String sName1;
	private String sName2;
	private String sName3;
	private String sStrasse;
	private int iPLZ;
	private String sOrt;
	private int iMitarbKunde;
	private String sMitarbKundeVorname;
	private String sMitarbKundeName;
	private int iKundenberater;
	private String sFlugdatum;
	private String sUhrzeit;	
	private String sFlugdatumEnde;
	private String sUhrzeitEnde;
	private int iStart;
	private int iZiel;
	private int iKilometer;
	private int iPersonen;
	private int iStops;
	private int iErsterStop;
	private int iZweiterStop;
	private int iDritterStop;	
	private int iVierterStop;
	private int iFuenfterStop;
	private int iSechsterStop;
	private int iErsterStopAufenthalt;
	private int iZweiterStopAufenthalt;
	private int iDritterStopAufenthalt;
	private int iVierterStopAufenthalt;
	private int iFuenfterStopAufenthalt;
	private int iSechsterStopAufenthalt;
	private int iFlugzeit;
	private int iFlightcrew;
	private int iCabincrew;
	private int iCatering;
	private double dKostenFlug;
	private double dKostenStop;
	private double dKostenFlightcrew;
	private double dKostenCabincrew;
	private double dKostenCatering;
	private double dKostenFlugGesamt;
	private double dKostenStopGesamt;
	private double dKostenFlightcrewGesamt;
	private double dKostenCabincrewGesamt;
	private double dKostenCateringGesamt;
	private double dNetto;
	private double dRabattProzent;
	private double dRabatt;
	private double dMwSt;
	private double dBrutto;
	private int iZahlungsbedingung;
	private int iValuta;
	private int iSkontoValuta;
	private double dSkontosatz;
	private double dKostenFlugVar;
	private double dKostenFlugVarGesamt;
	private int iCharterdauer;
	
	private int iFlugzeugID;
	private int iCaptainID;
	private int iOfficerID;
	private int iFlugbegleiterEinsID;
	private int iFlugbegleiterZweiID;

	public int getiFlugzeugID() {
		return iFlugzeugID;
	}

	public void setiFlugzeugID( int iFlugzeugID ) {
		this.iFlugzeugID = iFlugzeugID;
	}

	public int getiCaptainID() {
		return iCaptainID;
	}

	public void setiCaptainID( int iCaptainID ) {
		this.iCaptainID = iCaptainID;
	}

	public int getiOfficerID() {
		return iOfficerID;
	}

	public void setiOfficerID( int iOfficerID ) {
		this.iOfficerID = iOfficerID;
	}

	public int getiFlugbegleiterEinsID() {
		return iFlugbegleiterEinsID;
	}

	public void setiFlugbegleiterEinsID( int iFlugbegleiterEinsID ) {
		this.iFlugbegleiterEinsID = iFlugbegleiterEinsID;
	}

	public int getiFlugbegleiterZweiID() {
		return iFlugbegleiterZweiID;
	}

	public void setiFlugbegleiterZweiID( int iFlugbegleiterZweiID ) {
		this.iFlugbegleiterZweiID = iFlugbegleiterZweiID;
	}

	public de.rentajet.frames.pnlAuftrag getPnlAuftrag() {
		return pnlAuftrag;
	}

	public void setPnlAuftrag( de.rentajet.frames.pnlAuftrag pnlAuftrag ) {
		this.pnlAuftrag = pnlAuftrag;
	}

	public int getiID() {
		return iID;
	}

	public void setiID( int iID ) {
		this.iID = iID;
	}

	public int getiNummer() {
		return iNummer;
	}

	public void setiNummer( int iNummer ) {
		this.iNummer = iNummer;
	}

	public String getsDatum() {
		return sDatum;
	}

	public void setsDatum( String sDatum ) {
		this.sDatum = sDatum;
	}

	public int getiVorgArt() {
		return iVorgArt;
	}

	public void setiVorgArt( int iVorgArt ) {
		this.iVorgArt = iVorgArt;
	}

	public String getsRechnungsdatum() {
		return sRechnungsdatum;
	}

	public void setsRechnungsdatum( String sRechnungsdatum ) {
		this.sRechnungsdatum = sRechnungsdatum;
	}

	public int getiKunde() {
		return iKunde;
	}

	public void setiKunde( int iKunde ) {
		this.iKunde = iKunde;
	}

	public String getsName1() {
		return sName1;
	}

	public void setsName1( String sName1 ) {
		this.sName1 = sName1;
	}

	public String getsName2() {
		return sName2;
	}

	public void setsName2( String sName2 ) {
		this.sName2 = sName2;
	}

	public String getsName3() {
		return sName3;
	}

	public void setsName3( String sName3 ) {
		this.sName3 = sName3;
	}

	public String getsStrasse() {
		return sStrasse;
	}

	public void setsStrasse( String sStrasse ) {
		this.sStrasse = sStrasse;
	}

	public int getiPLZ() {
		return iPLZ;
	}

	public void setiPLZ( int iPLZ ) {
		this.iPLZ = iPLZ;
	}

	public String getsOrt() {
		return sOrt;
	}

	public void setsOrt( String sOrt ) {
		this.sOrt = sOrt;
	}

	public int getiMitarbKunde() {
		return iMitarbKunde;
	}

	public void setiMitarbKunde( int iMitarbKunde ) {
		this.iMitarbKunde = iMitarbKunde;
	}

	public String getsMitarbKundeVorname() {
		return sMitarbKundeVorname;
	}

	public void setsMitarbKundeVorname( String sMitarbKundeVorname ) {
		this.sMitarbKundeVorname = sMitarbKundeVorname;
	}

	public String getsMitarbKundeName() {
		return sMitarbKundeName;
	}

	public void setsMitarbKundeName( String sMitarbKundeName ) {
		this.sMitarbKundeName = sMitarbKundeName;
	}

	public int getiKundenberater() {
		return iKundenberater;
	}

	public void setiKundenberater( int iKundenberater ) {
		this.iKundenberater = iKundenberater;
	}

	public String getsFlugdatum() {
		return sFlugdatum;
	}

	public void setsFlugdatum( String sFlugdatum ) {
		this.sFlugdatum = sFlugdatum;
	}

	public String getsUhrzeit() {
		return sUhrzeit;
	}

	public void setsUhrzeit( String sUhrzeit ) {
		this.sUhrzeit = sUhrzeit;
	}

	public String getsFlugdatumEnde() {
		return sFlugdatumEnde;
	}

	public void setsFlugdatumEnde( String sFlugdatumEnde ) {
		this.sFlugdatumEnde = sFlugdatumEnde;
	}

	public String getsUhrzeitEnde() {
		return sUhrzeitEnde;
	}

	public void setsUhrzeitEnde( String sUhrzeitEnde ) {
		this.sUhrzeitEnde = sUhrzeitEnde;
	}

	public int getiStart() {
		return iStart;
	}

	public void setiStart( int iStart ) {
		this.iStart = iStart;
	}

	public int getiZiel() {
		return iZiel;
	}

	public void setiZiel( int iZiel ) {
		this.iZiel = iZiel;
	}

	public int getiKilometer() {
		return iKilometer;
	}

	public void setiKilometer( int iKilometer ) {
		this.iKilometer = iKilometer;
	}

	public int getiPersonen() {
		return iPersonen;
	}

	public void setiPersonen( int iPersonen ) {
		this.iPersonen = iPersonen;
	}

	public int getiStops() {
		return iStops;
	}

	public void setiStops( int iStops ) {
		this.iStops = iStops;
	}

	public int getiErsterStop() {
		return iErsterStop;
	}

	public void setiErsterStop( int iErsterStop ) {
		this.iErsterStop = iErsterStop;
	}

	public int getiZweiterStop() {
		return iZweiterStop;
	}

	public void setiZweiterStop( int iZweiterStop ) {
		this.iZweiterStop = iZweiterStop;
	}

	public int getiDritterStop() {
		return iDritterStop;
	}

	public void setiDritterStop( int iDritterStop ) {
		this.iDritterStop = iDritterStop;
	}

	public int getiVierterStop() {
		return iVierterStop;
	}

	public void setiVierterStop( int iVierterStop ) {
		this.iVierterStop = iVierterStop;
	}

	public int getiFuenfterStop() {
		return iFuenfterStop;
	}

	public void setiFuenfterStop( int iFuenfterStop ) {
		this.iFuenfterStop = iFuenfterStop;
	}

	public int getiSechsterStop() {
		return iSechsterStop;
	}

	public void setiSechsterStop( int iSechsterStop ) {
		this.iSechsterStop = iSechsterStop;
	}

	public int getiErsterStopAufenthalt() {
		return iErsterStopAufenthalt;
	}

	public void setiErsterStopAufenthalt( int iErsterStopAufenthalt ) {
		this.iErsterStopAufenthalt = iErsterStopAufenthalt;
	}

	public int getiZweiterStopAufenthalt() {
		return iZweiterStopAufenthalt;
	}

	public void setiZweiterStopAufenthalt( int iZweiterStopAufenthalt ) {
		this.iZweiterStopAufenthalt = iZweiterStopAufenthalt;
	}

	public int getiDritterStopAufenthalt() {
		return iDritterStopAufenthalt;
	}

	public void setiDritterStopAufenthalt( int iDritterStopAufenthalt ) {
		this.iDritterStopAufenthalt = iDritterStopAufenthalt;
	}

	public int getiVierterStopAufenthalt() {
		return iVierterStopAufenthalt;
	}

	public void setiVierterStopAufenthalt( int iVierterStopAufenthalt ) {
		this.iVierterStopAufenthalt = iVierterStopAufenthalt;
	}

	public int getiFuenfterStopAufenthalt() {
		return iFuenfterStopAufenthalt;
	}

	public void setiFuenfterStopAufenthalt( int iFuenfterStopAufenthalt ) {
		this.iFuenfterStopAufenthalt = iFuenfterStopAufenthalt;
	}

	public int getiSechsterStopAufenthalt() {
		return iSechsterStopAufenthalt;
	}

	public void setiSechsterStopAufenthalt( int iSechsterStopAufenthalt ) {
		this.iSechsterStopAufenthalt = iSechsterStopAufenthalt;
	}

	public int getiFlugzeit() {
		return iFlugzeit;
	}

	public void setiFlugzeit( int iFlugzeit ) {
		this.iFlugzeit = iFlugzeit;
	}

	public int getiFlightcrew() {
		return iFlightcrew;
	}

	public void setiFlightcrew( int iFlightcrew ) {
		this.iFlightcrew = iFlightcrew;
	}

	public int getiCabincrew() {
		return iCabincrew;
	}

	public void setiCabincrew( int iCabincrew ) {
		this.iCabincrew = iCabincrew;
	}

	public int getiCatering() {
		return iCatering;
	}

	public void setiCatering( int iCatering ) {
		this.iCatering = iCatering;
	}

	public double getdKostenFlug() {
		return dKostenFlug;
	}

	public void setdKostenFlug( double dKostenFlug ) {
		this.dKostenFlug = dKostenFlug;
	}

	public double getdKostenStop() {
		return dKostenStop;
	}

	public void setdKostenStop( double dKostenStop ) {
		this.dKostenStop = dKostenStop;
	}

	public double getdKostenFlightcrew() {
		return dKostenFlightcrew;
	}

	public void setdKostenFlightcrew( double dKostenFlightcrew ) {
		this.dKostenFlightcrew = dKostenFlightcrew;
	}

	public double getdKostenCabincrew() {
		return dKostenCabincrew;
	}

	public void setdKostenCabincrew( double dKostenCabincrew ) {
		this.dKostenCabincrew = dKostenCabincrew;
	}

	public double getdKostenCatering() {
		return dKostenCatering;
	}

	public void setdKostenCatering( double dKostenCatering ) {
		this.dKostenCatering = dKostenCatering;
	}

	public double getdKostenFlugGesamt() {
		return dKostenFlugGesamt;
	}

	public void setdKostenFlugGesamt( double dKostenFlugGesamt ) {
		this.dKostenFlugGesamt = dKostenFlugGesamt;
	}

	public double getdKostenStopGesamt() {
		return dKostenStopGesamt;
	}

	public void setdKostenStopGesamt( double dKostenStopGesamt ) {
		this.dKostenStopGesamt = dKostenStopGesamt;
	}

	public double getdKostenFlightcrewGesamt() {
		return dKostenFlightcrewGesamt;
	}

	public void setdKostenFlightcrewGesamt( double dKostenFlightcrewGesamt ) {
		this.dKostenFlightcrewGesamt = dKostenFlightcrewGesamt;
	}

	public double getdKostenCabincrewGesamt() {
		return dKostenCabincrewGesamt;
	}

	public void setdKostenCabincrewGesamt( double dKostenCabincrewGesamt ) {
		this.dKostenCabincrewGesamt = dKostenCabincrewGesamt;
	}

	public double getdKostenCateringGesamt() {
		return dKostenCateringGesamt;
	}

	public void setdKostenCateringGesamt( double dKostenCateringGesamt ) {
		this.dKostenCateringGesamt = dKostenCateringGesamt;
	}

	public double getdNetto() {
		return dNetto;
	}

	public void setdNetto( double dNetto ) {
		this.dNetto = dNetto;
	}

	public double getdRabattProzent() {
		return dRabattProzent;
	}

	public void setdRabattProzent( double dRabattProzent ) {
		this.dRabattProzent = dRabattProzent;
	}

	public double getdRabatt() {
		return dRabatt;
	}

	public void setdRabatt( double dRabatt ) {
		this.dRabatt = dRabatt;
	}

	public double getdMwSt() {
		return dMwSt;
	}

	public void setdMwSt( double dMwSt ) {
		this.dMwSt = dMwSt;
	}

	public double getdBrutto() {
		return dBrutto;
	}

	public void setdBrutto( double dBrutto ) {
		this.dBrutto = dBrutto;
	}

	public int getiZahlungsbedingung() {
		return iZahlungsbedingung;
	}

	public void setiZahlungsbedingung( int iZahlungsbedingung ) {
		this.iZahlungsbedingung = iZahlungsbedingung;
	}

	public int getiValuta() {
		return iValuta;
	}

	public void setiValuta( int iValuta ) {
		this.iValuta = iValuta;
	}

	public int getiSkontoValuta() {
		return iSkontoValuta;
	}

	public void setiSkontoValuta( int iSkontoValuta ) {
		this.iSkontoValuta = iSkontoValuta;
	}

	public double getdSkontosatz() {
		return dSkontosatz;
	}

	public void setdSkontosatz( double dSkontosatz ) {
		this.dSkontosatz = dSkontosatz;
	}

	public double getdKostenFlugVar() {
		return dKostenFlugVar;
	}

	public void setdKostenFlugVar( double dKostenFlugVar ) {
		this.dKostenFlugVar = dKostenFlugVar;
	}

	public double getdKostenFlugVarGesamt() {
		return dKostenFlugVarGesamt;
	}

	public void setdKostenFlugVarGesamt( double dKostenFlugVarGesamt ) {
		this.dKostenFlugVarGesamt = dKostenFlugVarGesamt;
	}

	public int getiCharterdauer() {
		return iCharterdauer;
	}

	public void setiCharterdauer( int iCharterdauer ) {
		this.iCharterdauer = iCharterdauer;
	}
	
	public AuftragInfo() {
		
	}
	
	public void show( JPanel pnlMain ) {
		pnlAuftrag = new pnlAuftrag();
		H2InternalFrame frmAuftrag = new H2InternalFrame( "Anrede" );
		frmAuftrag.add( pnlAuftrag, BorderLayout.CENTER );
		frmAuftrag.setVisible( true );
		pnlMain.add( frmAuftrag );
		try {
			frmAuftrag.setSelected(true);
    } 
		catch (java.beans.PropertyVetoException e) {
		}
	}	
	
	private void setzeAnzeige() {
		pnlAuftrag.setNummer( iNummer );
		pnlAuftrag.setDatum( sDatum );
		pnlAuftrag.setVorgArt( iVorgArt );
		pnlAuftrag.setRechnungsdatum( sRechnungsdatum );
		pnlAuftrag.setKunde( iKunde );
		pnlAuftrag.setName1( sName1 );
		pnlAuftrag.setName2( sName2 );
		pnlAuftrag.setName3( sName3 );
		pnlAuftrag.setStrasse( sStrasse );
		pnlAuftrag.setPLZ( iPLZ );
		pnlAuftrag.setOrt( sOrt );
		pnlAuftrag.setMitarbKunde( iMitarbKunde );
		pnlAuftrag.setMitarbKundeVorname( sMitarbKundeVorname );
		pnlAuftrag.setMitarbKundeName( sMitarbKundeName );
		pnlAuftrag.setKundenberater( iKundenberater );
		pnlAuftrag.setFlugdatum( sFlugdatum );
		pnlAuftrag.setUhrzeit( sUhrzeit );           
		pnlAuftrag.setFlugdatumEnde( sFlugdatumEnde );
		pnlAuftrag.setUhrzeitEnde( sUhrzeitEnde );
		pnlAuftrag.setStart( iStart );
		pnlAuftrag.setZiel( iZiel );
		pnlAuftrag.setKilometer( iKilometer );
		pnlAuftrag.setPersonen( iPersonen );
		pnlAuftrag.setStops( iStops );
		pnlAuftrag.setErsterStop( iErsterStop );
		pnlAuftrag.setZweiterStop( iZweiterStop );
		pnlAuftrag.setDritterStop( iDritterStop );       
		pnlAuftrag.setVierterStop( iVierterStop );
		pnlAuftrag.setFuenfterStop( iFuenfterStop );
		pnlAuftrag.setSechsterStop( iSechsterStop );
		pnlAuftrag.setErsterStopAufenthalt( iErsterStopAufenthalt );
		pnlAuftrag.setZweiterStopAufenthalt( iZweiterStopAufenthalt );
		pnlAuftrag.setDritterStopAufenthalt( iDritterStopAufenthalt );
		pnlAuftrag.setVierterStopAufenthalt( iVierterStopAufenthalt );
		pnlAuftrag.setFuenfterStopAufenthalt( iFuenfterStopAufenthalt );
		pnlAuftrag.setSechsterStopAufenthalt( iSechsterStopAufenthalt );
		pnlAuftrag.setFlugzeit( iFlugzeit );
		pnlAuftrag.setFlightcrew( iFlightcrew );
		pnlAuftrag.setCabincrew( iCabincrew );
		pnlAuftrag.setCatering( iCatering );
		pnlAuftrag.setKostenFlug( dKostenFlug );
		pnlAuftrag.setKostenStop( dKostenStop );
		pnlAuftrag.setKostenFlightcrew( dKostenFlightcrew );
		pnlAuftrag.setKostenCabincrew( dKostenCabincrew );
		pnlAuftrag.setKostenCatering( dKostenCatering );
		pnlAuftrag.setKostenFlugGesamt( dKostenFlugGesamt );
		pnlAuftrag.setKostenStopGesamt( dKostenStopGesamt );
		pnlAuftrag.setKostenFlightcrewGesamt( dKostenFlightcrewGesamt );
		pnlAuftrag.setKostenCabincrewGesamt( dKostenCabincrewGesamt );
		pnlAuftrag.setKostenCateringGesamt( dKostenCateringGesamt );
		pnlAuftrag.setNetto( dNetto );
		pnlAuftrag.setRabattProzent( dRabattProzent );
		pnlAuftrag.setRabatt( dRabatt );
		pnlAuftrag.setMwSt( dMwSt );
		pnlAuftrag.setBrutto( dBrutto );
		pnlAuftrag.setZahlungsbedingung( iZahlungsbedingung );
		pnlAuftrag.setValuta( iValuta );
		pnlAuftrag.setSkontoValuta( iSkontoValuta );
		pnlAuftrag.setSkontosatz( dSkontosatz );
		pnlAuftrag.setKostenFlugVar( dKostenFlugVar );
		pnlAuftrag.setKostenFlugVarGesamt( dKostenFlugVarGesamt );
		pnlAuftrag.setChaterdauer( iCharterdauer );
		
//		FlugzeugID
//		CaptainID
//		OfficerID
//		FlugbegleiterEinsID
//		FlugbegleiterZweiID
	}
	
	private void leseausAnzeige() {
		iNummer = Util.statischStringNachInt( pnlAuftrag.getNummer() );
		sDatum = pnlAuftrag.getDatum();
		iVorgArt = Util.statischStringNachInt( pnlAuftrag.getVorgArt() );
		sRechnungsdatum = pnlAuftrag.getRechnungsdatum();
		iKunde = Util.statischStringNachInt( pnlAuftrag.getKunde() );
		sName1 = pnlAuftrag.getName1();
		sName2 = pnlAuftrag.getName2();
		sName3 = pnlAuftrag.getName3();
		sStrasse = pnlAuftrag.getStrasse();
		iPLZ = Util.statischStringNachInt( pnlAuftrag.getPLZ() );
		sOrt = pnlAuftrag.getOrt();
		iMitarbKunde = Util.statischStringNachInt( pnlAuftrag.getMitarbKunde() );
		sMitarbKundeVorname = pnlAuftrag.getMitarbKundeVorname();
		sMitarbKundeName = pnlAuftrag.getMitarbKundeName();
		iKundenberater = Util.statischStringNachInt( pnlAuftrag.getKundenberater() );
		sFlugdatum = pnlAuftrag.getFlugdatum();
		sUhrzeit = pnlAuftrag.getUhrzeit();
		sFlugdatumEnde = pnlAuftrag.getFlugdatumEnde();
		sUhrzeitEnde = pnlAuftrag.getUhrzeitEnde();
		iStart = Util.statischStringNachInt( pnlAuftrag.getStart() );
		iZiel = Util.statischStringNachInt( pnlAuftrag.getZiel() );
		iKilometer = Util.statischStringNachInt( pnlAuftrag.getKilometer() );
		iPersonen = Util.statischStringNachInt( pnlAuftrag.getPersonen() );
		iStops = Util.statischStringNachInt( pnlAuftrag.getStops() );
		iErsterStop = Util.statischStringNachInt( pnlAuftrag.getErsterStop() );
		iZweiterStop = Util.statischStringNachInt( pnlAuftrag.getZweiterStop() );
		iDritterStop = Util.statischStringNachInt( pnlAuftrag.getDritterStop() );
		iVierterStop = Util.statischStringNachInt( pnlAuftrag.getVierterStop() );
		iFuenfterStop = Util.statischStringNachInt( pnlAuftrag.getFuenfterStop() );
		iSechsterStop = Util.statischStringNachInt( pnlAuftrag.getSechsterStop() );
		iErsterStopAufenthalt = Util.statischStringNachInt( pnlAuftrag.getErsterStopAufenthalt() );
		iZweiterStopAufenthalt = Util.statischStringNachInt( pnlAuftrag.getZweiterStopAufenthalt() );
		iDritterStopAufenthalt = Util.statischStringNachInt( pnlAuftrag.getDritterStopAufenthalt() );
		iVierterStopAufenthalt = Util.statischStringNachInt( pnlAuftrag.getVierterStopAufenthalt() );
		iFuenfterStopAufenthalt = Util.statischStringNachInt( pnlAuftrag.getFuenfterStopAufenthalt() );
		iSechsterStopAufenthalt = Util.statischStringNachInt( pnlAuftrag.getSechsterStopAufenthalt() );
		iFlugzeit = Util.statischStringNachInt( pnlAuftrag.getFlugzeit() );
		iFlightcrew = Util.statischStringNachInt( pnlAuftrag.getFlightcrew() );
		iCabincrew = Util.statischStringNachInt( pnlAuftrag.getCabincrew() );
		iCatering = Util.statischStringNachInt( pnlAuftrag.getCatering() );
		dKostenFlug = Util.statischStringNachDouble( pnlAuftrag.getKostenFlug(), 2 );
		dKostenStop = Util.statischStringNachDouble( pnlAuftrag.getKostenStop(), 2 );
		dKostenFlightcrew = Util.statischStringNachDouble( pnlAuftrag.getKostenFlightcrew(), 2 );
		dKostenCabincrew = Util.statischStringNachDouble( pnlAuftrag.getKostenCabincrew(), 2 );
		dKostenCatering = Util.statischStringNachDouble( pnlAuftrag.getKostenCatering(), 2 );
		dKostenFlugGesamt = Util.statischStringNachDouble( pnlAuftrag.getKostenFlugGesamt(), 2 );
		dKostenStopGesamt = Util.statischStringNachDouble( pnlAuftrag.getKostenStopGesamt(), 2 );
		dKostenFlightcrewGesamt = Util.statischStringNachDouble( pnlAuftrag.getKostenFlightcrewGesamt(), 2 );
		dKostenCabincrewGesamt = Util.statischStringNachDouble( pnlAuftrag.getKostenCabincrewGesamt(), 2 );
		dKostenCateringGesamt = Util.statischStringNachDouble( pnlAuftrag.getKostenCateringGesamt(), 2 );
		dNetto = Util.statischStringNachDouble( pnlAuftrag.getNetto(), 2 );
		dRabattProzent = Util.statischStringNachDouble( pnlAuftrag.getRabattProzent(), 2 );
		dRabatt = Util.statischStringNachDouble( pnlAuftrag.getRabatt(), 2 );
		dMwSt = Util.statischStringNachDouble( pnlAuftrag.getMwSt(), 2 );
		dBrutto = Util.statischStringNachDouble( pnlAuftrag.getBrutto(), 2 );
		iZahlungsbedingung = Util.statischStringNachInt( pnlAuftrag.getZahlungsbedingung() );
		iValuta = Util.statischStringNachInt( pnlAuftrag.getValuta() );
		iSkontoValuta = Util.statischStringNachInt( pnlAuftrag.getSkontoValuta() );
		dSkontosatz = Util.statischStringNachDouble( pnlAuftrag.getSkontosatz(), 2 );
		dKostenFlugVar = Util.statischStringNachDouble( pnlAuftrag.getKostenFlugVar(), 2 );
		dKostenFlugVarGesamt = Util.statischStringNachDouble( pnlAuftrag.getKostenFlugVarGesamt(), 2);
		iCharterdauer = Util.statischStringNachInt( pnlAuftrag.getCharterdauer() );
	}
	
	private void aktualisiereAnzeige() {
		iNummer = 0;
		setzeAnzeige();
	}
	
	public void ersterDatensatz() {
		ersterDatensatzDB();
		setzeAnzeige();
	}
	
	public void vorherigerdatensatz() {
		vorherigerdatensatzDB();
		setzeAnzeige();
	}
	
	public void naechsterDatensatz() {
		naechsterDatensatzDB();
		setzeAnzeige();
	}
	
	public void letzterDatensatz() {
		letzterDatensatzDB();
		setzeAnzeige();
	}
	
	public void sucheDatensatz() {
		// ToDo: Erstellung eines Suchfensters
	}
	
	public void speichern() {
		speichereDB();
		aktualisiereAnzeige();
	}
	
	public void abbrechen() {
		aktualisiereAnzeige();
	}
	
	public void loeschen() {
		loescheDB();
		aktualisiereAnzeige();
	}
	
	public void aktualisieren() {
		setzeAnzeige();
	}
	
	public void drucken() {
		JOptionPane.showMessageDialog(
			null, "Es stehen keine Druckdaten zur Verfügung", "Drucken", 
			JOptionPane.OK_OPTION
		);	
	}
		
	public void zeigeArchiv() {
		JOptionPane.showMessageDialog(
			null, "Es stehen keine Archivdaten zur Verfügung", "Archiv", 
			JOptionPane.OK_OPTION
		);	
	}

	public void speichereDB() {
		
	}
	
	public void ladeDB(){
		
	}
	
	public void loescheDB(){
		
	}
	
	
	public void ersterDatensatzDB() {
		
	}
	
	public void vorherigerdatensatzDB() {
		
	}
	
	public void naechsterDatensatzDB() {
		
	}
	
	public void letzterDatensatzDB() {
		
	}
	
	public String[] holeVerfuegbareFlugzeuge( String sPersonen, String sDatum, String sFlugdatumEnde ) {
		// Verfügbarkeitsprüfung
		String[] sa = new String[3];
		sa[0] = "1. Flugzeug";
		sa[1] = "2. Flugzeug";
		sa[2] = "3. Flugzeug";	
		return sa;  
	}
	
	public String[] holeVerfuegbareCaptain( String sDatum, String sFlugdatumEnde ) {
		// Verfügbarkeitsprüfung
		String[] sa = new String[3];
		sa[0] = "1. Captain";
		sa[1] = "2. Captain";
		sa[2] = "3. Captain";	
		return sa;  
	}
	
	public String[] holeVerfuegbareOfficer( String sDatum, String sFlugdatumEnde ) {
		// Verfügbarkeitsprüfung
		String[] sa = new String[3];
		sa[0] = "1. Officer";
		sa[1] = "2. Officer";
		sa[2] = "3. Officer";	
		return sa;  
	}
	
	public String[] holeVerfuegbareFlugbegleiter( String sDatum, String sFlugdatumEnde ) {
		// Verfügbarkeitsprüfung
		String[] sa = new String[3];
		sa[0] = "1. Flugbegeliter";
		sa[1] = "2. Flugbegleiter";
		sa[2] = "3. Flugbegleiter";	
		return sa;  
	}
	
	public boolean istDatensatzVorhanden( int iNummer ) {
		//ToDo Abfrage in DB ob Datensatz mit übergebener Nummer vorhanden ist und ggf. Variablen füllen
		if( iNummer == 10 )
			return true;
		else
			return false;
	}
}
