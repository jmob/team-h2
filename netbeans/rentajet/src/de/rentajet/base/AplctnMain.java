package de.rentajet.base;

/**
 *
 * @author H.Petersen
 */
public class AplctnMain {
	public AplctnMain() {
		try {
			Login_jframe frame = new Login_jframe();
			//FrmMain frame = new FrmMain();
			frame.setLocation( 190, 170 );
			//frame.setSize( 1024, 800 );
			frame.setSize( 672, 546 );
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
