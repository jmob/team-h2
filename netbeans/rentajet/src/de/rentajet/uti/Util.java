/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.rentajet.uti;

import java.text.DecimalFormatSymbols;

/**
 *
 * @author Petersen
 */
public class Util {
	public int iZahlOK = 1;
	public boolean bZahlOK = true;

	public Util(){
	}
	
	public static int statischStringNachInt( String s ) {
		try {
			s = bereiteZahlVor( s, -1 );
			if( s.length() == 0 )
				return 0;
			Integer integer = new Integer( s );
			return integer.intValue();
		}
		catch( java.lang.NumberFormatException e ) {
			return 0;
		}
	}

	public static double statischStringNachDouble( String sZahl, int iNachkomma ) {
		try {
			sZahl = bereiteZahlVor( sZahl, iNachkomma );

			if( ermittleDezimalTrenner(sZahl) == '.' ) {
				Double d = new Double( sZahl );
				return d.doubleValue();
			}
		}
		catch( java.lang.NumberFormatException e ) {
		}

		try {
			java.text.NumberFormat nf = java.text.NumberFormat.getInstance();
			Number n = nf.parse( sZahl );
			return n.doubleValue();
		}
		catch( java.text.ParseException ex ){
		}

		return 0.0;
	}
	
	public static String bereiteZahlVor( String sZahl, int iNachkomma ) {
		sZahl = sZahl.trim();
		int iLaenge = sZahl.length();

		if( iLaenge == 0 )
			return "";

		String sVorzeichen = "";

		// 1. Durchlauf
		if( sZahl.charAt(0) == '+' )                     // +9999
			sZahl = sZahl.substring( 1 );
		else if( sZahl.charAt(0) == '-' ) {              // -9999
			sVorzeichen = "-";
			sZahl = sZahl.substring( 1 );
		}
		else if( sZahl.charAt(sZahl.length() - 1) == '+' )   // 9999+
			sZahl = sZahl.substring( 0, sZahl.length() - 1 );
		else if( sZahl.charAt(sZahl.length() - 1) == '-' ) { // 9999-
			sVorzeichen = "-";
			sZahl = sZahl.substring( 0, sZahl.length() - 1 );
		}
		else if( sZahl.charAt(0) == 'S' )                // S9999
			sZahl = sZahl.substring( 1 );
		else if( sZahl.charAt(0) == 'H' ) {              // H9999
			sVorzeichen = "-";
			sZahl = sZahl.substring( 1 );
		}
		else if( sZahl.charAt(sZahl.length() - 1) == 'S' )   // 9999S
			sZahl = sZahl.substring( 0, sZahl.length() - 1 );
		else if( sZahl.charAt(sZahl.length() - 1) == 'H' ) { // 9999H
			sVorzeichen = "-";
			sZahl = sZahl.substring( 0, sZahl.length() - 1 );
		}

		// 2. Durchlauf, fallsZahl ein Vorzeichen weggefiltert wurde
		if( sZahl.length() != iLaenge && sZahl.length() > 0 ) {
			if( sZahl.charAt(0) == '+' )                     // +9999
				sZahl = sZahl.substring( 1 );
			else if( sZahl.charAt(0) == '-' ) {              // -9999
				sVorzeichen = sVorzeichen.length() == 0 ? "-" : "";
				sZahl = sZahl.substring( 1 );
			}
			else if( sZahl.charAt(sZahl.length() - 1) == '+' )   // 9999+
				sZahl = sZahl.substring( 0, sZahl.length() - 1 );
			else if( sZahl.charAt(sZahl.length() - 1) == '-' ) { // 9999-
				sVorzeichen = sVorzeichen.length() == 0 ? "-" : "";
				sZahl = sZahl.substring( 0, sZahl.length() - 1 );
			}
			else if( sZahl.charAt(0) == 'S' )                // S9999
				sZahl = sZahl.substring( 1 );
			else if( sZahl.charAt(0) == 'H' ) {              // H9999
				sVorzeichen = sVorzeichen.length() == 0 ? "-" : "";
				sZahl = sZahl.substring( 1 );
			}
			else if( sZahl.charAt(sZahl.length() - 1) == 'S' )   // 9999S
				sZahl = sZahl.substring( 0, sZahl.length() - 1 );
			else if( sZahl.charAt(sZahl.length() - 1) == 'H' ) { // 9999H
				sVorzeichen = sVorzeichen.length() == 0 ? "-" : "";
				sZahl = sZahl.substring( 0, sZahl.length() - 1 );
			}
		}

		if( sZahl.endsWith(",") || sZahl.endsWith(".")	)
			sZahl += 0;

		String sOhneNullen = trimmeVorne( sZahl, "0" );

		if( sOhneNullen.length() == 0 )
			return "0";

		// Kappung ueberzaehliger Nachkommastellen
		if( iNachkomma > -1 ) {
			char cDezimal = ermittleDezimalTrenner( sOhneNullen );
			int iIndex = sOhneNullen.lastIndexOf( cDezimal );

			if( iIndex != -1 && sOhneNullen.length() > (iIndex + 1 + iNachkomma) )
				sOhneNullen = sOhneNullen.substring( 0, iIndex + 1 + iNachkomma );
		}

		return sVorzeichen + sOhneNullen;
	}
	
	public static String trimmeVorne( String sQuelle, String sTrimmzeichen ) {
		if( sQuelle == null || sQuelle.length() == 0 )
			return "";

		int iLaenge = sQuelle.length();
		for( int i = 0; i < iLaenge; i++ ) {
			if( sTrimmzeichen.indexOf( sQuelle.charAt(i) ) < 0 )
				return entferneVorne( sQuelle, i );
		}
		return "";
	}
	
	public static String entferneVorne( String sQuelle, int iLaenge )	{
		int iQuelle = sQuelle.length();
		if( iLaenge >= iQuelle )
			return "";
		return sQuelle.substring( iLaenge, iQuelle );
	}
	
	public static char ermittleDezimalTrenner( String sZahl ) {
		/**
		 * Folgende Faelle kann es geben, in denen ein '.' als Dezimal-Trennzeichen
		 * fungiert:
		 *    - Das Standard-Locale definiert den '.' als Dezimal-Trenner und
		 *      der uebergebene Zahlenstring ist formatiert (z.B.: "1,000.00")
		 *    - Das native Format eines Doubles ohne Tausender-Trennzeichen,
		 *      sofern nach dem '.' nicht genau 3 Ziffern stehen, denn dann
		 *      koennte es auch eine formatierte Zahl mit einem Tausenderpunkt
		 *      sein (z.B.: 12345.67)
		 *      Ausnahmen, bei denen ein '.' trotzdem ein Dezimal-Trenner ist:
		 *      - .123 ('.' kann logischerweise nur ein Dezimal-Trenner sein)
		 *      - sZahl beginnt mit '0.', '-.' oder '-0.'
		 */
		int iPos = sZahl.indexOf( '.' );

		if( iPos >= 0 ) {
			if( sZahl.indexOf('E') >= 0 ) // sZahl folgt der Ingenieurs-Schreibweise
				return '.';
			else if( sZahl.indexOf('.', iPos + 1) < 0 && sZahl.indexOf(',') < 0 ) {
				// es gibt keinen weiteren '.' bzw. kein ','
				if( sZahl.length() - iPos != 4 ) // nach dem '.' stehen keine 3 Ziffern
					return '.';
				else if( iPos == 0 ) // sZahl beginnt mit '.' (z. B. ".123")
					return '.';
				else if( sZahl.startsWith( "0." ) // sZahl ist 5-stellig und beginnt
					|| sZahl.startsWith( "-." )    // mit '0.' oder '-.' (z. B. "0.123")
				) {
					return '.';
				}
				else if( sZahl.startsWith("-0.") ) // sZahl ist 6-stellig und beginnt
					return '.';                     // mit '-0.' (z. B. "-0.123")
			}
		}

		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		return dfs.getDecimalSeparator();
	}	
}
