/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.base;

import de.rentajet.frames.AnredeInfo;
import de.rentajet.frames.AuftragInfo;
import de.rentajet.frames.BenutzerInfo;
import de.rentajet.frames.BenutzergruppeInfo;
import de.rentajet.frames.CateringInfo;
import de.rentajet.frames.FirmaInfo;
import de.rentajet.frames.FlughafenInfo;
import de.rentajet.frames.FlugzeugInfo;
import de.rentajet.frames.FlugzeugkostenInfo;
import de.rentajet.frames.FlugzeugtypInfo;
import de.rentajet.frames.KundeInfo;
import de.rentajet.frames.KundenberaterInfo;
import de.rentajet.frames.MitarbkundeInfo;
import de.rentajet.frames.OrtInfo;
import de.rentajet.frames.PersonalkostenInfo;
import de.rentajet.frames.StaatInfo;
import de.rentajet.frames.TriebwerkartInfo;
import de.rentajet.frames.ZahlungsbedingungInfo;
import javax.swing.JOptionPane;

/**
 *
 * @author H.Petersen
 */
public class MainInfo {
	private String sFrame = "";
	
	private AnredeInfo anrede;
	private AuftragInfo auftrag;
	private BenutzerInfo benutzer;
	private BenutzergruppeInfo benutzergruppe;
	private CateringInfo catering;
	private FirmaInfo firma;
	private FlughafenInfo flughafen;
	private FlugzeugInfo flugzeug;
	private FlugzeugkostenInfo flugzeugkosten;
	private FlugzeugtypInfo flugzeugtyp;
	private KundeInfo kunde;
	private KundenberaterInfo kundenberater;
	private MitarbkundeInfo mitarbkunde;
	private OrtInfo ort;
	private PersonalkostenInfo personalkosten;
	private StaatInfo staat;
	private TriebwerkartInfo triebwerkart;
	private ZahlungsbedingungInfo zahlungsbedingung;
	
	public MainInfo() {

	}
	
	public void Anrede() {
		anrede = new AnredeInfo();
	}
	
	public void Auftrag() {
		auftrag = new AuftragInfo();
	}
	
	public void Benutzer() {
		benutzer = new BenutzerInfo();
	}
	
	public void Benutzergruppe() {
		benutzergruppe = new BenutzergruppeInfo();
	}
	
	public void Catering() {
		catering = new CateringInfo();
	}
	
	public void Firma() {
		firma = new FirmaInfo();
	}
	
	public void Flughafen() {
		flughafen = new FlughafenInfo();
	}
	
	public void Flugzeug() {
		flugzeug = new FlugzeugInfo();
	}
	
	public void Flugzeugkosten() {
		flugzeugkosten = new FlugzeugkostenInfo();
	}
	
	public void Flugzeugtyp() {
		flugzeugtyp = new FlugzeugtypInfo();
	}
	
	public void Kunde() {
		kunde = new KundeInfo();
	}
	
	public void Kundenberater() {
		kundenberater = new KundenberaterInfo();
	}
	
	public void Mitarbkunde() {
		mitarbkunde = new MitarbkundeInfo();
	}

	public void Ort() {
		ort = new OrtInfo();
	}
	
	public void Personalkosten() {
		personalkosten = new PersonalkostenInfo();
	}
	
	public void Staat() {
		staat = new StaatInfo();
	}
	
	public void Triebwerkart() {
		triebwerkart = new TriebwerkartInfo();
	}
	
	public void Zahlungsbedingung() {
		zahlungsbedingung = new ZahlungsbedingungInfo();
	}
	
	
	public void setFrame( String sFrame ) {
		this.sFrame = sFrame;
	}
		
	public void ersterDatensatz() {

	}
	
	public void vorherigerdatensatz() {

	}
	
	public void naechsterDatensatz() {

	}
	
	public void letzterDatensatz() {

	}
	
	public void sucheDatensatz() {

	}
	
	public void speichern() {

	}
	
	public void abbrechen() {

	}
	
	public void loeschen() {

	}
	
	public void aktualisieren() {

	}
	
	public void drucken() {
	
	}
		
	public void zeigeArchiv() {
	
	}
	
}
