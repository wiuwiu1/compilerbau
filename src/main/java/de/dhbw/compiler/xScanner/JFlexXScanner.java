// DO NOT EDIT
// Generated by JFlex 1.8.1 http://jflex.de/
// source: src/main/java/de/dhbw/compiler/xScanner/JFlexXScanner.lex

/* **********************************************
 * Duale Hochschule Baden-Württemberg Karlsruhe
 * Prof. Dr. Jörn Eisenbiegler
 * 
 * Vorlesung Übersetzerbau
 * Praxis X-Scanner mit JFlex
 * - Scanner-Definition
 * 
 * **********************************************
 */


package de.dhbw.compiler.xScanner;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public final class JFlexXScanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int INTCONST = 2;
  public static final int FLOATCONST = 4;
  public static final int EXPO = 6;
  public static final int STRINGCONST = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\25\u0100\1\u0200\11\u0100\1\u0300\17\u0100\1\u0400\u10cf\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\5\1\22\0\1\2\1\0\1\3\5\0\1\4"+
    "\1\5\1\6\1\7\1\0\1\10\1\11\1\12\1\13"+
    "\11\14\1\15\1\16\1\17\1\20\1\21\2\0\4\22"+
    "\1\23\25\22\1\0\1\24\4\0\1\25\1\26\1\22"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\2\22\1\35"+
    "\1\36\1\37\1\40\1\41\1\22\1\42\1\43\1\44"+
    "\2\22\1\45\3\22\1\0\1\46\10\0\1\1\32\0"+
    "\1\1\u01df\0\1\1\177\0\13\1\35\0\2\1\5\0"+
    "\1\1\57\0\1\1\240\0\1\1\377\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1280];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\12\22\1\23\1\24\1\25\1\23\1\26"+
    "\1\27\1\26\1\30\1\31\1\32\1\33\1\34\1\33"+
    "\1\35\1\36\5\22\1\37\6\22\1\0\1\40\1\41"+
    "\1\42\2\22\1\43\1\22\1\44\1\45\6\22\1\46"+
    "\1\47\1\22\1\50\3\22\1\51\1\22\1\52\1\22"+
    "\1\53\1\54\1\55\2\22\1\56\1\22\1\57\1\60";

  private static int [] zzUnpackAction() {
    int [] result = new int[95];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\116\0\165\0\234\0\303\0\303\0\303"+
    "\0\303\0\303\0\303\0\303\0\303\0\303\0\303\0\352"+
    "\0\303\0\u0111\0\303\0\303\0\303\0\303\0\u0138\0\u015f"+
    "\0\u0186\0\u01ad\0\u01d4\0\u01fb\0\u0222\0\u0249\0\u0270\0\u0297"+
    "\0\303\0\303\0\303\0\u02be\0\303\0\303\0\u02be\0\303"+
    "\0\303\0\303\0\303\0\303\0\u02e5\0\303\0\303\0\u030c"+
    "\0\u0333\0\u035a\0\u0381\0\u03a8\0\u0138\0\u03cf\0\u03f6\0\u041d"+
    "\0\u0444\0\u046b\0\u0492\0\u04b9\0\303\0\303\0\303\0\u04e0"+
    "\0\u0507\0\u0138\0\u052e\0\u0138\0\u0138\0\u0555\0\u057c\0\u05a3"+
    "\0\u05ca\0\u05f1\0\u0618\0\303\0\303\0\u063f\0\u0138\0\u0666"+
    "\0\u068d\0\u06b4\0\u0138\0\u06db\0\u0138\0\u0702\0\u0138\0\u0138"+
    "\0\u0138\0\u0729\0\u0750\0\u0138\0\u0777\0\u0138\0\u0138";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[95];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\6\2\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\2\27\1\6\1\27\1\30\1\27\1\31\1\32"+
    "\2\27\1\33\4\27\1\34\1\35\1\36\1\37\1\40"+
    "\1\6\11\41\1\42\1\41\2\43\6\41\1\44\4\41"+
    "\1\44\16\41\13\45\2\46\6\45\1\47\4\45\1\47"+
    "\16\45\13\50\2\51\32\50\2\52\1\53\1\54\5\52"+
    "\1\53\1\52\3\53\4\52\2\53\1\55\21\53\1\52"+
    "\60\0\1\56\55\0\1\57\41\0\2\27\5\0\2\27"+
    "\1\0\22\27\13\0\2\27\5\0\2\27\1\0\3\27"+
    "\1\60\16\27\13\0\2\27\5\0\2\27\1\0\10\27"+
    "\1\61\1\27\1\62\7\27\13\0\2\27\5\0\2\27"+
    "\1\0\10\27\1\63\2\27\1\64\6\27\13\0\2\27"+
    "\5\0\2\27\1\0\4\27\1\65\5\27\1\66\7\27"+
    "\13\0\2\27\5\0\2\27\1\0\15\27\1\67\4\27"+
    "\13\0\2\27\5\0\2\27\1\0\3\27\1\70\16\27"+
    "\13\0\2\27\5\0\2\27\1\0\17\27\1\71\2\27"+
    "\13\0\2\27\5\0\2\27\1\0\6\27\1\72\13\27"+
    "\13\0\2\27\5\0\2\27\1\0\6\27\1\73\13\27"+
    "\10\0\1\74\2\0\1\75\1\76\35\0\1\77\56\0"+
    "\2\27\5\0\2\27\1\0\5\27\1\100\14\27\13\0"+
    "\2\27\5\0\2\27\1\0\16\27\1\101\3\27\13\0"+
    "\2\27\5\0\2\27\1\0\2\27\1\102\17\27\13\0"+
    "\2\27\5\0\2\27\1\0\13\27\1\103\6\27\13\0"+
    "\2\27\5\0\2\27\1\0\15\27\1\104\4\27\13\0"+
    "\2\27\5\0\2\27\1\0\17\27\1\105\2\27\13\0"+
    "\2\27\5\0\2\27\1\0\7\27\1\106\3\27\1\107"+
    "\6\27\13\0\2\27\5\0\2\27\1\0\1\110\21\27"+
    "\13\0\2\27\5\0\2\27\1\0\15\27\1\111\4\27"+
    "\13\0\2\27\5\0\2\27\1\0\3\27\1\112\16\27"+
    "\13\0\2\27\5\0\2\27\1\0\7\27\1\113\12\27"+
    "\13\0\1\114\1\115\45\0\2\27\5\0\2\27\1\0"+
    "\7\27\1\116\12\27\13\0\2\27\5\0\2\27\1\0"+
    "\3\27\1\117\16\27\13\0\2\27\5\0\2\27\1\0"+
    "\1\120\21\27\13\0\2\27\5\0\2\27\1\0\12\27"+
    "\1\121\7\27\13\0\2\27\5\0\2\27\1\0\5\27"+
    "\1\122\14\27\13\0\2\27\5\0\2\27\1\0\2\27"+
    "\1\123\17\27\13\0\2\27\5\0\2\27\1\0\7\27"+
    "\1\124\12\27\13\0\2\27\5\0\2\27\1\0\12\27"+
    "\1\125\7\27\13\0\2\27\5\0\2\27\1\0\10\27"+
    "\1\126\11\27\13\0\2\27\5\0\2\27\1\0\12\27"+
    "\1\127\7\27\13\0\2\27\5\0\2\27\1\0\17\27"+
    "\1\130\2\27\13\0\2\27\5\0\2\27\1\0\17\27"+
    "\1\131\2\27\13\0\2\27\5\0\2\27\1\0\15\27"+
    "\1\132\4\27\13\0\2\27\5\0\2\27\1\0\12\27"+
    "\1\133\7\27\13\0\2\27\5\0\2\27\1\0\3\27"+
    "\1\134\16\27\13\0\2\27\5\0\2\27\1\0\1\135"+
    "\21\27\13\0\2\27\5\0\2\27\1\0\5\27\1\136"+
    "\14\27\13\0\2\27\5\0\2\27\1\0\11\27\1\137"+
    "\10\27";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1950];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\5\0\12\11\1\1\1\11\1\1\4\11\12\1\3\11"+
    "\1\1\2\11\1\1\5\11\1\1\2\11\14\1\1\0"+
    "\3\11\14\1\2\11\22\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[95];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
private int intValue = 0;
private int floatValue = 0;
private int intExpo = 0;
private String stringText = "";
private String stringValue = "";
private int column;
private boolean negativeExpo = false;
private int decimalPlace = 0;


private int getInt() {
   return intValue;
}

private double getFrac() {
    return getInt() + 1 / (Math.pow(10, decimalPlace)) * floatValue;
}

private double getExpo(){
    if(negativeExpo){
        intExpo = intExpo * -1;
    }
    return Math.pow(10, intExpo) * getFrac();
}



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public JFlexXScanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token nextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            switch (zzLexicalState) {
            case INTCONST: {
              yybegin(YYINITIAL); return new IntConstToken(Token.INTCONST, stringText, yyline+1, column, getInt());
            }  // fall though
            case 96: break;
            case FLOATCONST: {
              yybegin(YYINITIAL); return new FloatConstToken(Token.FLOATCONST, stringText, yyline+1, column, getFrac());
            }  // fall though
            case 97: break;
            case EXPO: {
              yybegin(YYINITIAL); return new FloatConstToken(Token.FLOATCONST, stringText, yyline+1, column,  getExpo());
            }  // fall though
            case 98: break;
            case STRINGCONST: {
              yybegin(YYINITIAL); return new Token(Token.INVALID, stringText, yyline+1, column);
            }  // fall though
            case 99: break;
            default:
              {
                return new Token(Token.EOF,  yytext(), yyline+1, yycolumn+1);
              }
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return new Token(Token.INVALID,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 49: break;
          case 2:
            { /* eat white space*/
            }
            // fall through
          case 50: break;
          case 3:
            { yybegin(STRINGCONST); column = yycolumn+1; stringText = "\"";
            }
            // fall through
          case 51: break;
          case 4:
            { return new Token(Token.LBR,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 52: break;
          case 5:
            { return new Token(Token.RBR,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 53: break;
          case 6:
            { return new Token(Token.MULT,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 54: break;
          case 7:
            { return new Token(Token.PLUS,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 55: break;
          case 8:
            { return new Token(Token.MINUS,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 56: break;
          case 9:
            { return new Token(Token.DOT,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 57: break;
          case 10:
            { return new Token(Token.DIV,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 58: break;
          case 11:
            { return new IntConstToken(Token.INTCONST, yytext(), yyline+1, yycolumn+1, 0);
            }
            // fall through
          case 59: break;
          case 12:
            { yybegin(INTCONST); yypushback(1); column = yycolumn+1; stringText ="";
            }
            // fall through
          case 60: break;
          case 13:
            { return new Token(Token.COLON,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 61: break;
          case 14:
            { return new Token(Token.SEMICOLON,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 62: break;
          case 15:
            { return new Token(Token.LESS,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 63: break;
          case 16:
            { return new Token(Token.EQUALS,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 64: break;
          case 17:
            { return new Token(Token.MORE,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 65: break;
          case 18:
            { return new Token(Token.ID,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 66: break;
          case 19:
            { yybegin(YYINITIAL); yypushback(1); return new IntConstToken(Token.INTCONST, stringText, yyline+1, column, getInt());
            }
            // fall through
          case 67: break;
          case 20:
            { yybegin(FLOATCONST); stringText += yytext();
            }
            // fall through
          case 68: break;
          case 21:
            { intValue = intValue * 10 + (int) yycharat(0) - (int) '0'; stringText += yytext();
            }
            // fall through
          case 69: break;
          case 22:
            { yybegin(YYINITIAL); yypushback(1); return new FloatConstToken(Token.FLOATCONST, stringText, yyline+1, column, getFrac());
            }
            // fall through
          case 70: break;
          case 23:
            { floatValue = floatValue * 10 + (int) yycharat(0) - (int) '0'; stringText += yytext(); decimalPlace += 1;
            }
            // fall through
          case 71: break;
          case 24:
            { yybegin(YYINITIAL); yypushback(1); return new FloatConstToken(Token.FLOATCONST, stringText, yyline+1, column,  getExpo());
            }
            // fall through
          case 72: break;
          case 25:
            { intExpo = intExpo * 10 + (int) yycharat(0) - (int) '0'; stringText += yytext();
            }
            // fall through
          case 73: break;
          case 26:
            { yybegin(YYINITIAL); stringText += yytext(); return new Token(Token.INVALID, stringText, yyline+1, column);
            }
            // fall through
          case 74: break;
          case 27:
            { stringText+=yytext(); stringValue += yytext();
            }
            // fall through
          case 75: break;
          case 28:
            { yybegin(YYINITIAL); stringText += "\""; return new StringConstToken(Token.STRINGCONST, stringText, yyline+1, column, stringValue);
            }
            // fall through
          case 76: break;
          case 29:
            { yybegin(FLOATCONST); stringText += yytext(); column = yycolumn+1;
            }
            // fall through
          case 77: break;
          case 30:
            { return new Token(Token.ASSIGN,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 78: break;
          case 31:
            { return new Token(Token.IF,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 79: break;
          case 32:
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzStartRead, 1);
            { yybegin(YYINITIAL); yypushback(-1); stringText += yytext(); return new FloatConstToken(Token.FLOATCONST, stringText, yyline+1, column, getExpo());
            }
            // fall through
          case 80: break;
          case 33:
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzStartRead, 1);
            { yybegin(EXPO); stringText += yytext();
            }
            // fall through
          case 81: break;
          case 34:
            { stringText+= yytext(); stringValue += "\"";
            }
            // fall through
          case 82: break;
          case 35:
            { return new Token(Token.END,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 83: break;
          case 36:
            { return new Token(Token.FOR,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 84: break;
          case 37:
            { return new Token(Token.INT,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 85: break;
          case 38:
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzStartRead, 1);
            { yybegin(YYINITIAL); yypushback(-2); stringText += yytext(); return new FloatConstToken(Token.FLOATCONST, stringText, yyline+1, column, getExpo());
            }
            // fall through
          case 86: break;
          case 39:
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzStartRead, 2);
            { yybegin(EXPO); stringText += yytext(); negativeExpo = true;
            }
            // fall through
          case 87: break;
          case 40:
            { return new Token(Token.ELSE,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 88: break;
          case 41:
            { return new Token(Token.READ,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 89: break;
          case 42:
            { return new Token(Token.THEN,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 90: break;
          case 43:
            { return new Token(Token.BEGIN,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 91: break;
          case 44:
            { return new Token(Token.FLOAT,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 92: break;
          case 45:
            { return new Token(Token.PRINT,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 93: break;
          case 46:
            { return new Token(Token.WHILE,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 94: break;
          case 47:
            { return new Token(Token.STRING,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 95: break;
          case 48:
            { return new Token(Token.PROGRAM,  yytext(), yyline+1, yycolumn+1);
            }
            // fall through
          case 96: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
