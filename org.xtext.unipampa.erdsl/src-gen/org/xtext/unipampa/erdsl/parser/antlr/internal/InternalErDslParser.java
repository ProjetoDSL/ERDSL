package org.xtext.unipampa.erdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.unipampa.erdsl.services.ErDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalErDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'Entities'", "'{'", "'}'", "'Relationships'", "'Domain'", "'isIdentifier'", "'is'", "','", "'['", "'relates'", "']'", "'(0:1)'", "'(1:1)'", "'(0:N)'", "'(1:N)'", "'int'", "'double'", "'money'", "'string'", "'boolean'", "'datetime'", "'file'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalErDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalErDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalErDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalErDsl.g"; }



     	private ErDslGrammarAccess grammarAccess;

        public InternalErDslParser(TokenStream input, ErDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ERModel";
       	}

       	@Override
       	protected ErDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleERModel"
    // InternalErDsl.g:65:1: entryRuleERModel returns [EObject current=null] : iv_ruleERModel= ruleERModel EOF ;
    public final EObject entryRuleERModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERModel = null;


        try {
            // InternalErDsl.g:65:48: (iv_ruleERModel= ruleERModel EOF )
            // InternalErDsl.g:66:2: iv_ruleERModel= ruleERModel EOF
            {
             newCompositeNode(grammarAccess.getERModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERModel=ruleERModel();

            state._fsp--;

             current =iv_ruleERModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERModel"


    // $ANTLR start "ruleERModel"
    // InternalErDsl.g:72:1: ruleERModel returns [EObject current=null] : ( ( (lv_domain_0_0= ruleDomain ) ) otherlv_1= ';' (otherlv_2= 'Entities' otherlv_3= '{' ) ( (lv_entities_4_0= ruleEntity ) )+ (otherlv_5= '}' otherlv_6= ';' ) (otherlv_7= 'Relationships' otherlv_8= '{' ) ( (lv_relations_9_0= ruleRelation ) )* (otherlv_10= '}' otherlv_11= ';' ) ) ;
    public final EObject ruleERModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_domain_0_0 = null;

        EObject lv_entities_4_0 = null;

        EObject lv_relations_9_0 = null;



        	enterRule();

        try {
            // InternalErDsl.g:78:2: ( ( ( (lv_domain_0_0= ruleDomain ) ) otherlv_1= ';' (otherlv_2= 'Entities' otherlv_3= '{' ) ( (lv_entities_4_0= ruleEntity ) )+ (otherlv_5= '}' otherlv_6= ';' ) (otherlv_7= 'Relationships' otherlv_8= '{' ) ( (lv_relations_9_0= ruleRelation ) )* (otherlv_10= '}' otherlv_11= ';' ) ) )
            // InternalErDsl.g:79:2: ( ( (lv_domain_0_0= ruleDomain ) ) otherlv_1= ';' (otherlv_2= 'Entities' otherlv_3= '{' ) ( (lv_entities_4_0= ruleEntity ) )+ (otherlv_5= '}' otherlv_6= ';' ) (otherlv_7= 'Relationships' otherlv_8= '{' ) ( (lv_relations_9_0= ruleRelation ) )* (otherlv_10= '}' otherlv_11= ';' ) )
            {
            // InternalErDsl.g:79:2: ( ( (lv_domain_0_0= ruleDomain ) ) otherlv_1= ';' (otherlv_2= 'Entities' otherlv_3= '{' ) ( (lv_entities_4_0= ruleEntity ) )+ (otherlv_5= '}' otherlv_6= ';' ) (otherlv_7= 'Relationships' otherlv_8= '{' ) ( (lv_relations_9_0= ruleRelation ) )* (otherlv_10= '}' otherlv_11= ';' ) )
            // InternalErDsl.g:80:3: ( (lv_domain_0_0= ruleDomain ) ) otherlv_1= ';' (otherlv_2= 'Entities' otherlv_3= '{' ) ( (lv_entities_4_0= ruleEntity ) )+ (otherlv_5= '}' otherlv_6= ';' ) (otherlv_7= 'Relationships' otherlv_8= '{' ) ( (lv_relations_9_0= ruleRelation ) )* (otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalErDsl.g:80:3: ( (lv_domain_0_0= ruleDomain ) )
            // InternalErDsl.g:81:4: (lv_domain_0_0= ruleDomain )
            {
            // InternalErDsl.g:81:4: (lv_domain_0_0= ruleDomain )
            // InternalErDsl.g:82:5: lv_domain_0_0= ruleDomain
            {

            					newCompositeNode(grammarAccess.getERModelAccess().getDomainDomainParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_domain_0_0=ruleDomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getERModelRule());
            					}
            					set(
            						current,
            						"domain",
            						lv_domain_0_0,
            						"org.xtext.unipampa.erdsl.ErDsl.Domain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getERModelAccess().getSemicolonKeyword_1());
            		
            // InternalErDsl.g:103:3: (otherlv_2= 'Entities' otherlv_3= '{' )
            // InternalErDsl.g:104:4: otherlv_2= 'Entities' otherlv_3= '{'
            {
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            				newLeafNode(otherlv_2, grammarAccess.getERModelAccess().getEntitiesKeyword_2_0());
            			
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            				newLeafNode(otherlv_3, grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_2_1());
            			

            }

            // InternalErDsl.g:113:3: ( (lv_entities_4_0= ruleEntity ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalErDsl.g:114:4: (lv_entities_4_0= ruleEntity )
            	    {
            	    // InternalErDsl.g:114:4: (lv_entities_4_0= ruleEntity )
            	    // InternalErDsl.g:115:5: lv_entities_4_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_entities_4_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_4_0,
            	    						"org.xtext.unipampa.erdsl.ErDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalErDsl.g:132:3: (otherlv_5= '}' otherlv_6= ';' )
            // InternalErDsl.g:133:4: otherlv_5= '}' otherlv_6= ';'
            {
            otherlv_5=(Token)match(input,14,FOLLOW_3); 

            				newLeafNode(otherlv_5, grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_4_0());
            			
            otherlv_6=(Token)match(input,11,FOLLOW_8); 

            				newLeafNode(otherlv_6, grammarAccess.getERModelAccess().getSemicolonKeyword_4_1());
            			

            }

            // InternalErDsl.g:142:3: (otherlv_7= 'Relationships' otherlv_8= '{' )
            // InternalErDsl.g:143:4: otherlv_7= 'Relationships' otherlv_8= '{'
            {
            otherlv_7=(Token)match(input,15,FOLLOW_5); 

            				newLeafNode(otherlv_7, grammarAccess.getERModelAccess().getRelationshipsKeyword_5_0());
            			
            otherlv_8=(Token)match(input,13,FOLLOW_9); 

            				newLeafNode(otherlv_8, grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_5_1());
            			

            }

            // InternalErDsl.g:152:3: ( (lv_relations_9_0= ruleRelation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalErDsl.g:153:4: (lv_relations_9_0= ruleRelation )
            	    {
            	    // InternalErDsl.g:153:4: (lv_relations_9_0= ruleRelation )
            	    // InternalErDsl.g:154:5: lv_relations_9_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getERModelAccess().getRelationsRelationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_relations_9_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_9_0,
            	    						"org.xtext.unipampa.erdsl.ErDsl.Relation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalErDsl.g:171:3: (otherlv_10= '}' otherlv_11= ';' )
            // InternalErDsl.g:172:4: otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_10=(Token)match(input,14,FOLLOW_3); 

            				newLeafNode(otherlv_10, grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_7_0());
            			
            otherlv_11=(Token)match(input,11,FOLLOW_2); 

            				newLeafNode(otherlv_11, grammarAccess.getERModelAccess().getSemicolonKeyword_7_1());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERModel"


    // $ANTLR start "entryRuleDomain"
    // InternalErDsl.g:185:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalErDsl.g:185:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalErDsl.g:186:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalErDsl.g:192:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalErDsl.g:198:2: ( (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalErDsl.g:199:2: (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalErDsl.g:199:2: (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalErDsl.g:200:3: otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
            		
            // InternalErDsl.g:204:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalErDsl.g:205:4: (lv_name_1_0= RULE_ID )
            {
            // InternalErDsl.g:205:4: (lv_name_1_0= RULE_ID )
            // InternalErDsl.g:206:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleAttribute"
    // InternalErDsl.g:226:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalErDsl.g:226:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalErDsl.g:227:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalErDsl.g:233:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isKey_2_0= 'isIdentifier' ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_isKey_2_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalErDsl.g:239:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isKey_2_0= 'isIdentifier' ) )? ) )
            // InternalErDsl.g:240:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isKey_2_0= 'isIdentifier' ) )? )
            {
            // InternalErDsl.g:240:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isKey_2_0= 'isIdentifier' ) )? )
            // InternalErDsl.g:241:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isKey_2_0= 'isIdentifier' ) )?
            {
            // InternalErDsl.g:241:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalErDsl.g:242:4: (lv_name_0_0= RULE_ID )
            {
            // InternalErDsl.g:242:4: (lv_name_0_0= RULE_ID )
            // InternalErDsl.g:243:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalErDsl.g:259:3: ( (lv_type_1_0= ruleDataType ) )
            // InternalErDsl.g:260:4: (lv_type_1_0= ruleDataType )
            {
            // InternalErDsl.g:260:4: (lv_type_1_0= ruleDataType )
            // InternalErDsl.g:261:5: lv_type_1_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_1_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.unipampa.erdsl.ErDsl.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalErDsl.g:278:3: ( (lv_isKey_2_0= 'isIdentifier' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalErDsl.g:279:4: (lv_isKey_2_0= 'isIdentifier' )
                    {
                    // InternalErDsl.g:279:4: (lv_isKey_2_0= 'isIdentifier' )
                    // InternalErDsl.g:280:5: lv_isKey_2_0= 'isIdentifier'
                    {
                    lv_isKey_2_0=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_isKey_2_0, grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isKey", true, "isIdentifier");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEntity"
    // InternalErDsl.g:296:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalErDsl.g:296:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalErDsl.g:297:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalErDsl.g:303:1: ruleEntity returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_attributes_4_0 = null;

        EObject lv_attributes_6_0 = null;



        	enterRule();

        try {
            // InternalErDsl.g:309:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? ) )
            // InternalErDsl.g:310:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? )
            {
            // InternalErDsl.g:310:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? )
            // InternalErDsl.g:311:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )?
            {
            // InternalErDsl.g:311:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalErDsl.g:312:4: (lv_name_0_0= RULE_ID )
            {
            // InternalErDsl.g:312:4: (lv_name_0_0= RULE_ID )
            // InternalErDsl.g:313:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalErDsl.g:329:3: (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalErDsl.g:330:4: otherlv_1= 'is' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getIsKeyword_1_0());
            	    			
            	    // InternalErDsl.g:334:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalErDsl.g:335:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalErDsl.g:335:5: (otherlv_2= RULE_ID )
            	    // InternalErDsl.g:336:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEntityRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    						newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getIsEntityCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalErDsl.g:348:3: (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalErDsl.g:349:4: otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalErDsl.g:353:4: ( (lv_attributes_4_0= ruleAttribute ) )
                    // InternalErDsl.g:354:5: (lv_attributes_4_0= ruleAttribute )
                    {
                    // InternalErDsl.g:354:5: (lv_attributes_4_0= ruleAttribute )
                    // InternalErDsl.g:355:6: lv_attributes_4_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_attributes_4_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_4_0,
                    							"org.xtext.unipampa.erdsl.ErDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalErDsl.g:372:4: (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==19) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalErDsl.g:373:5: otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalErDsl.g:377:5: ( (lv_attributes_6_0= ruleAttribute ) )
                    	    // InternalErDsl.g:378:6: (lv_attributes_6_0= ruleAttribute )
                    	    {
                    	    // InternalErDsl.g:378:6: (lv_attributes_6_0= ruleAttribute )
                    	    // InternalErDsl.g:379:7: lv_attributes_6_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_attributes_6_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_6_0,
                    	    								"org.xtext.unipampa.erdsl.ErDsl.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRelation"
    // InternalErDsl.g:406:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalErDsl.g:406:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalErDsl.g:407:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalErDsl.g:413:1: ruleRelation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )* ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_leftEnding_2_0 = null;

        EObject lv_rightEnding_4_0 = null;

        EObject lv_attributes_7_0 = null;

        EObject lv_attributes_9_0 = null;



        	enterRule();

        try {
            // InternalErDsl.g:419:2: ( ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )* ) )
            // InternalErDsl.g:420:2: ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )* )
            {
            // InternalErDsl.g:420:2: ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )* )
            // InternalErDsl.g:421:3: ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )*
            {
            // InternalErDsl.g:421:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalErDsl.g:422:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalErDsl.g:422:4: (lv_name_0_0= RULE_ID )
                    // InternalErDsl.g:423:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalErDsl.g:439:3: (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' )
            // InternalErDsl.g:440:4: otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']'
            {
            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            				newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_1_0());
            			
            // InternalErDsl.g:444:4: ( (lv_leftEnding_2_0= ruleRelationSide ) )
            // InternalErDsl.g:445:5: (lv_leftEnding_2_0= ruleRelationSide )
            {
            // InternalErDsl.g:445:5: (lv_leftEnding_2_0= ruleRelationSide )
            // InternalErDsl.g:446:6: lv_leftEnding_2_0= ruleRelationSide
            {

            						newCompositeNode(grammarAccess.getRelationAccess().getLeftEndingRelationSideParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_16);
            lv_leftEnding_2_0=ruleRelationSide();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRelationRule());
            						}
            						set(
            							current,
            							"leftEnding",
            							lv_leftEnding_2_0,
            							"org.xtext.unipampa.erdsl.ErDsl.RelationSide");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_15); 

            				newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getRelatesKeyword_1_2());
            			
            // InternalErDsl.g:467:4: ( (lv_rightEnding_4_0= ruleRelationSide ) )
            // InternalErDsl.g:468:5: (lv_rightEnding_4_0= ruleRelationSide )
            {
            // InternalErDsl.g:468:5: (lv_rightEnding_4_0= ruleRelationSide )
            // InternalErDsl.g:469:6: lv_rightEnding_4_0= ruleRelationSide
            {

            						newCompositeNode(grammarAccess.getRelationAccess().getRightEndingRelationSideParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_17);
            lv_rightEnding_4_0=ruleRelationSide();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRelationRule());
            						}
            						set(
            							current,
            							"rightEnding",
            							lv_rightEnding_4_0,
            							"org.xtext.unipampa.erdsl.ErDsl.RelationSide");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_18); 

            				newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getRightSquareBracketKeyword_1_4());
            			

            }

            // InternalErDsl.g:491:3: (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalErDsl.g:492:4: otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}'
            	    {
            	    otherlv_6=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2_0());
            	    			
            	    // InternalErDsl.g:496:4: ( (lv_attributes_7_0= ruleAttribute ) )
            	    // InternalErDsl.g:497:5: (lv_attributes_7_0= ruleAttribute )
            	    {
            	    // InternalErDsl.g:497:5: (lv_attributes_7_0= ruleAttribute )
            	    // InternalErDsl.g:498:6: lv_attributes_7_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_attributes_7_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRelationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_7_0,
            	    							"org.xtext.unipampa.erdsl.ErDsl.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalErDsl.g:515:4: (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==19) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalErDsl.g:516:5: otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,19,FOLLOW_6); 

            	    	    					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getCommaKeyword_2_2_0());
            	    	    				
            	    	    // InternalErDsl.g:520:5: ( (lv_attributes_9_0= ruleAttribute ) )
            	    	    // InternalErDsl.g:521:6: (lv_attributes_9_0= ruleAttribute )
            	    	    {
            	    	    // InternalErDsl.g:521:6: (lv_attributes_9_0= ruleAttribute )
            	    	    // InternalErDsl.g:522:7: lv_attributes_9_0= ruleAttribute
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_2_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_attributes_9_0=ruleAttribute();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getRelationRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"attributes",
            	    	    								lv_attributes_9_0,
            	    	    								"org.xtext.unipampa.erdsl.ErDsl.Attribute");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    otherlv_10=(Token)match(input,14,FOLLOW_18); 

            	    				newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_2_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleRelationSide"
    // InternalErDsl.g:549:1: entryRuleRelationSide returns [EObject current=null] : iv_ruleRelationSide= ruleRelationSide EOF ;
    public final EObject entryRuleRelationSide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationSide = null;


        try {
            // InternalErDsl.g:549:53: (iv_ruleRelationSide= ruleRelationSide EOF )
            // InternalErDsl.g:550:2: iv_ruleRelationSide= ruleRelationSide EOF
            {
             newCompositeNode(grammarAccess.getRelationSideRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationSide=ruleRelationSide();

            state._fsp--;

             current =iv_ruleRelationSide; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationSide"


    // $ANTLR start "ruleRelationSide"
    // InternalErDsl.g:556:1: ruleRelationSide returns [EObject current=null] : ( ( ( ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRelationSide() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_0_1=null;
        Token lv_cardinality_0_2=null;
        Token lv_cardinality_0_3=null;
        Token lv_cardinality_0_4=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalErDsl.g:562:2: ( ( ( ( ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalErDsl.g:563:2: ( ( ( ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalErDsl.g:563:2: ( ( ( ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=23 && LA11_0<=26)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalErDsl.g:564:3: ( ( ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalErDsl.g:564:3: ( ( ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) )
                    // InternalErDsl.g:565:4: ( ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalErDsl.g:565:4: ( ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) ) )
                    // InternalErDsl.g:566:5: ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) )
                    {
                    // InternalErDsl.g:566:5: ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) )
                    // InternalErDsl.g:567:6: (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' )
                    {
                    // InternalErDsl.g:567:6: (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' )
                    int alt10=4;
                    switch ( input.LA(1) ) {
                    case 23:
                        {
                        alt10=1;
                        }
                        break;
                    case 24:
                        {
                        alt10=2;
                        }
                        break;
                    case 25:
                        {
                        alt10=3;
                        }
                        break;
                    case 26:
                        {
                        alt10=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }

                    switch (alt10) {
                        case 1 :
                            // InternalErDsl.g:568:7: lv_cardinality_0_1= '(0:1)'
                            {
                            lv_cardinality_0_1=(Token)match(input,23,FOLLOW_6); 

                            							newLeafNode(lv_cardinality_0_1, grammarAccess.getRelationSideAccess().getCardinality01Keyword_0_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_0_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalErDsl.g:579:7: lv_cardinality_0_2= '(1:1)'
                            {
                            lv_cardinality_0_2=(Token)match(input,24,FOLLOW_6); 

                            							newLeafNode(lv_cardinality_0_2, grammarAccess.getRelationSideAccess().getCardinality11Keyword_0_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_0_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalErDsl.g:590:7: lv_cardinality_0_3= '(0:N)'
                            {
                            lv_cardinality_0_3=(Token)match(input,25,FOLLOW_6); 

                            							newLeafNode(lv_cardinality_0_3, grammarAccess.getRelationSideAccess().getCardinality0NKeyword_0_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_0_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalErDsl.g:601:7: lv_cardinality_0_4= '(1:N)'
                            {
                            lv_cardinality_0_4=(Token)match(input,26,FOLLOW_6); 

                            							newLeafNode(lv_cardinality_0_4, grammarAccess.getRelationSideAccess().getCardinality1NKeyword_0_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_0_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalErDsl.g:614:4: ( (otherlv_1= RULE_ID ) )
                    // InternalErDsl.g:615:5: (otherlv_1= RULE_ID )
                    {
                    // InternalErDsl.g:615:5: (otherlv_1= RULE_ID )
                    // InternalErDsl.g:616:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationSideRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getRelationSideAccess().getTargetEntityCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:629:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalErDsl.g:629:3: ( (otherlv_2= RULE_ID ) )
                    // InternalErDsl.g:630:4: (otherlv_2= RULE_ID )
                    {
                    // InternalErDsl.g:630:4: (otherlv_2= RULE_ID )
                    // InternalErDsl.g:631:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationSideRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getRelationSideAccess().getTargetRelationCrossReference_1_0());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationSide"


    // $ANTLR start "ruleDataType"
    // InternalErDsl.g:646:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'money' ) | (enumLiteral_3= 'string' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'datetime' ) | (enumLiteral_6= 'file' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalErDsl.g:652:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'money' ) | (enumLiteral_3= 'string' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'datetime' ) | (enumLiteral_6= 'file' ) ) )
            // InternalErDsl.g:653:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'money' ) | (enumLiteral_3= 'string' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'datetime' ) | (enumLiteral_6= 'file' ) )
            {
            // InternalErDsl.g:653:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'money' ) | (enumLiteral_3= 'string' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'datetime' ) | (enumLiteral_6= 'file' ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt12=1;
                }
                break;
            case 28:
                {
                alt12=2;
                }
                break;
            case 29:
                {
                alt12=3;
                }
                break;
            case 30:
                {
                alt12=4;
                }
                break;
            case 31:
                {
                alt12=5;
                }
                break;
            case 32:
                {
                alt12=6;
                }
                break;
            case 33:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalErDsl.g:654:3: (enumLiteral_0= 'int' )
                    {
                    // InternalErDsl.g:654:3: (enumLiteral_0= 'int' )
                    // InternalErDsl.g:655:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:662:3: (enumLiteral_1= 'double' )
                    {
                    // InternalErDsl.g:662:3: (enumLiteral_1= 'double' )
                    // InternalErDsl.g:663:4: enumLiteral_1= 'double'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl.g:670:3: (enumLiteral_2= 'money' )
                    {
                    // InternalErDsl.g:670:3: (enumLiteral_2= 'money' )
                    // InternalErDsl.g:671:4: enumLiteral_2= 'money'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl.g:678:3: (enumLiteral_3= 'string' )
                    {
                    // InternalErDsl.g:678:3: (enumLiteral_3= 'string' )
                    // InternalErDsl.g:679:4: enumLiteral_3= 'string'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalErDsl.g:686:3: (enumLiteral_4= 'boolean' )
                    {
                    // InternalErDsl.g:686:3: (enumLiteral_4= 'boolean' )
                    // InternalErDsl.g:687:4: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalErDsl.g:694:3: (enumLiteral_5= 'datetime' )
                    {
                    // InternalErDsl.g:694:3: (enumLiteral_5= 'datetime' )
                    // InternalErDsl.g:695:4: enumLiteral_5= 'datetime'
                    {
                    enumLiteral_5=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalErDsl.g:702:3: (enumLiteral_6= 'file' )
                    {
                    // InternalErDsl.g:702:3: (enumLiteral_6= 'file' )
                    // InternalErDsl.g:703:4: enumLiteral_6= 'file'
                    {
                    enumLiteral_6=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBLOBEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getBLOBEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000104010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000003F8000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000042002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000007800010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002002L});

}