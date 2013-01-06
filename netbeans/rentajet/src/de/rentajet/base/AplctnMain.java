package de.rentajet.base;

/**
 *
 * @author H.Petersen
 */
public class AplctnMain {
	public AplctnMain() {
		try {
			FrmMain frame = new FrmMain();
			frame.setLocation( 190, 170 );
			frame.setSize( 1024, 800 );
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
