/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner mit JFlex 1
 * 
 * **********************************************
 */

package de.dhbw.compiler.namenscanner;

import java.io.StringReader;


public class NamenScannerMain {
	
	private static final String TEST = "anna peter petra";
	
	public static void main(String[] args) throws Exception {
		
		NamenScanner scanner = new NamenScanner(new StringReader(TEST));
		
		Token mytoken = scanner.nextToken();
		
		while (mytoken.getType()!=Token.EOF) {
			System.out.println(mytoken);
			mytoken = scanner.nextToken();
		}

		System.out.println(mytoken);
	}

}
