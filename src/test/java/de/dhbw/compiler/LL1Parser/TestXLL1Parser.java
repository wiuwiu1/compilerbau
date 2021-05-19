/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis AST für X
 * - Testsuite für Scanner
 * 
 * **********************************************
 */
package de.dhbw.compiler.LL1Parser;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestXScanner1.class, TestXScanner2.class, TestXScanner3.class, TestXLL1Parser1.class, TestXLL1Parser2.class })
public class TestXLL1Parser {

}
