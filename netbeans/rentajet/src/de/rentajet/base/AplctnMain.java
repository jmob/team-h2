package de.rentajet.base;

/**
 *
 * @author H.Petersen
 */
public class AplctnMain {
	public AplctnMain() {
		try {
			FrmMain frame = new FrmMain();
			frame.setLocation( 190, 262 );
			frame.setSize( 800, 600 );
			frame.setVisible( true );
		}
		catch (Exception ex) {
			ex.printStackTrace();
			System.exit( -1 );
		}

	}

	public static void main( String[] args ) {
		AplctnMain am = new AplctnMain();
	}
}
