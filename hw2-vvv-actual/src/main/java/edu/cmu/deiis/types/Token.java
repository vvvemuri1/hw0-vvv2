

/* First created by JCasGen Wed Sep 11 13:44:28 EDT 2013 */
package edu.cmu.deiis.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Token in question/answer (delimited by whitespace and punctuation).
 * Updated by JCasGen Sun Sep 22 21:18:02 EDT 2013
 * XML source: /Users/vvvemuri1/Documents/workspace/hw2-vvv-actual/src/main/resources/descriptors/deiis_types.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: sentenceId

  /** getter for sentenceId - gets Unique number assigned to each sentence to allow token to determine which sentence it is part of.
   * @generated */
  public int getSentenceId() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_sentenceId == null)
      jcasType.jcas.throwFeatMissing("sentenceId", "edu.cmu.deiis.types.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_sentenceId);}
    
  /** setter for sentenceId - sets Unique number assigned to each sentence to allow token to determine which sentence it is part of. 
   * @generated */
  public void setSentenceId(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_sentenceId == null)
      jcasType.jcas.throwFeatMissing("sentenceId", "edu.cmu.deiis.types.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_sentenceId, v);}    
   
    
  //*--------------*
  //* Feature: partOfSpeech

  /** getter for partOfSpeech - gets Linguistic category of token.
   * @generated */
  public String getPartOfSpeech() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "edu.cmu.deiis.types.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_partOfSpeech);}
    
  /** setter for partOfSpeech - sets Linguistic category of token. 
   * @generated */
  public void setPartOfSpeech(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "edu.cmu.deiis.types.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_partOfSpeech, v);}    
   
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets Text contained in token.
   * @generated */
  public String getText() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "edu.cmu.deiis.types.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets Text contained in token. 
   * @generated */
  public void setText(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "edu.cmu.deiis.types.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_text, v);}    
  }

    