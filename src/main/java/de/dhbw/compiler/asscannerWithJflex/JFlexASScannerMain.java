/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AS-Scanner mit JFlex 3
 * 
 * **********************************************
 */

package de.dhbw.compiler.asscannerWithJflex;

import java.io.StringReader;


public class JFlexASScannerMain {
	
	private static final String TEST = "[34, x,peter,  34kurt, g56, null,null, 8] ";
	
	public static void main(String[] args) throws Exception {
		
		JFlexASScanner scanner = new JFlexASScanner(new StringReader(TEST));
		
		Token mytoken = scanner.nextToken();
		
		while (mytoken.getType()!=Token.EOF) {
			System.out.println(mytoken);
			mytoken = scanner.nextToken();
		}

		System.out.println(mytoken);
	}

}
