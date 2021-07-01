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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Generate'", "'Logical Schema'", "'PostgreSQL'", "'MySQL'", "'All'", "';'", "'Entities'", "'{'", "'}'", "'Relationships'", "'Domain'", "'isIdentifier'", "'is'", "'total/disjoint'", "'total/Overlapped'", "'partial/disjoint'", "'partial/overlapped'", "','", "'['", "'relates'", "']'", "'(0:1)'", "'(1:1)'", "'(0:N)'", "'(1:N)'", "'int'", "'double'", "'money'", "'string'", "'boolean'", "'datetime'", "'file'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
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
    // InternalErDsl.g:72:1: ruleERModel returns [EObject current=null] : ( (otherlv_0= 'Generate' ( ( (lv_targetGenerator_1_1= 'Logical Schema' | lv_targetGenerator_1_2= 'PostgreSQL' | lv_targetGenerator_1_3= 'MySQL' | lv_targetGenerator_1_4= 'All' ) ) ) otherlv_2= ';' )? ( (lv_domain_3_0= ruleDomain ) ) otherlv_4= ';' (otherlv_5= 'Entities' otherlv_6= '{' ) ( (lv_entities_7_0= ruleEntity ) )+ (otherlv_8= '}' otherlv_9= ';' ) (otherlv_10= 'Relationships' otherlv_11= '{' ) ( (lv_relations_12_0= ruleRelation ) )* (otherlv_13= '}' otherlv_14= ';' ) ) ;
    public final EObject ruleERModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_targetGenerator_1_1=null;
        Token lv_targetGenerator_1_2=null;
        Token lv_targetGenerator_1_3=null;
        Token lv_targetGenerator_1_4=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_domain_3_0 = null;

        EObject lv_entities_7_0 = null;

        EObject lv_relations_12_0 = null;



        	enterRule();

        try {
            // InternalErDsl.g:78:2: ( ( (otherlv_0= 'Generate' ( ( (lv_targetGenerator_1_1= 'Logical Schema' | lv_targetGenerator_1_2= 'PostgreSQL' | lv_targetGenerator_1_3= 'MySQL' | lv_targetGenerator_1_4= 'All' ) ) ) otherlv_2= ';' )? ( (lv_domain_3_0= ruleDomain ) ) otherlv_4= ';' (otherlv_5= 'Entities' otherlv_6= '{' ) ( (lv_entities_7_0= ruleEntity ) )+ (otherlv_8= '}' otherlv_9= ';' ) (otherlv_10= 'Relationships' otherlv_11= '{' ) ( (lv_relations_12_0= ruleRelation ) )* (otherlv_13= '}' otherlv_14= ';' ) ) )
            // InternalErDsl.g:79:2: ( (otherlv_0= 'Generate' ( ( (lv_targetGenerator_1_1= 'Logical Schema' | lv_targetGenerator_1_2= 'PostgreSQL' | lv_targetGenerator_1_3= 'MySQL' | lv_targetGenerator_1_4= 'All' ) ) ) otherlv_2= ';' )? ( (lv_domain_3_0= ruleDomain ) ) otherlv_4= ';' (otherlv_5= 'Entities' otherlv_6= '{' ) ( (lv_entities_7_0= ruleEntity ) )+ (otherlv_8= '}' otherlv_9= ';' ) (otherlv_10= 'Relationships' otherlv_11= '{' ) ( (lv_relations_12_0= ruleRelation ) )* (otherlv_13= '}' otherlv_14= ';' ) )
            {
            // InternalErDsl.g:79:2: ( (otherlv_0= 'Generate' ( ( (lv_targetGenerator_1_1= 'Logical Schema' | lv_targetGenerator_1_2= 'PostgreSQL' | lv_targetGenerator_1_3= 'MySQL' | lv_targetGenerator_1_4= 'All' ) ) ) otherlv_2= ';' )? ( (lv_domain_3_0= ruleDomain ) ) otherlv_4= ';' (otherlv_5= 'Entities' otherlv_6= '{' ) ( (lv_entities_7_0= ruleEntity ) )+ (otherlv_8= '}' otherlv_9= ';' ) (otherlv_10= 'Relationships' otherlv_11= '{' ) ( (lv_relations_12_0= ruleRelation ) )* (otherlv_13= '}' otherlv_14= ';' ) )
            // InternalErDsl.g:80:3: (otherlv_0= 'Generate' ( ( (lv_targetGenerator_1_1= 'Logical Schema' | lv_targetGenerator_1_2= 'PostgreSQL' | lv_targetGenerator_1_3= 'MySQL' | lv_targetGenerator_1_4= 'All' ) ) ) otherlv_2= ';' )? ( (lv_domain_3_0= ruleDomain ) ) otherlv_4= ';' (otherlv_5= 'Entities' otherlv_6= '{' ) ( (lv_entities_7_0= ruleEntity ) )+ (otherlv_8= '}' otherlv_9= ';' ) (otherlv_10= 'Relationships' otherlv_11= '{' ) ( (lv_relations_12_0= ruleRelation ) )* (otherlv_13= '}' otherlv_14= ';' )
            {
            // InternalErDsl.g:80:3: (otherlv_0= 'Generate' ( ( (lv_targetGenerator_1_1= 'Logical Schema' | lv_targetGenerator_1_2= 'PostgreSQL' | lv_targetGenerator_1_3= 'MySQL' | lv_targetGenerator_1_4= 'All' ) ) ) otherlv_2= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalErDsl.g:81:4: otherlv_0= 'Generate' ( ( (lv_targetGenerator_1_1= 'Logical Schema' | lv_targetGenerator_1_2= 'PostgreSQL' | lv_targetGenerator_1_3= 'MySQL' | lv_targetGenerator_1_4= 'All' ) ) ) otherlv_2= ';'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getERModelAccess().getGenerateKeyword_0_0());
                    			
                    // InternalErDsl.g:85:4: ( ( (lv_targetGenerator_1_1= 'Logical Schema' | lv_targetGenerator_1_2= 'PostgreSQL' | lv_targetGenerator_1_3= 'MySQL' | lv_targetGenerator_1_4= 'All' ) ) )
                    // InternalErDsl.g:86:5: ( (lv_targetGenerator_1_1= 'Logical Schema' | lv_targetGenerator_1_2= 'PostgreSQL' | lv_targetGenerator_1_3= 'MySQL' | lv_targetGenerator_1_4= 'All' ) )
                    {
                    // InternalErDsl.g:86:5: ( (lv_targetGenerator_1_1= 'Logical Schema' | lv_targetGenerator_1_2= 'PostgreSQL' | lv_targetGenerator_1_3= 'MySQL' | lv_targetGenerator_1_4= 'All' ) )
                    // InternalErDsl.g:87:6: (lv_targetGenerator_1_1= 'Logical Schema' | lv_targetGenerator_1_2= 'PostgreSQL' | lv_targetGenerator_1_3= 'MySQL' | lv_targetGenerator_1_4= 'All' )
                    {
                    // InternalErDsl.g:87:6: (lv_targetGenerator_1_1= 'Logical Schema' | lv_targetGenerator_1_2= 'PostgreSQL' | lv_targetGenerator_1_3= 'MySQL' | lv_targetGenerator_1_4= 'All' )
                    int alt1=4;
                    switch ( input.LA(1) ) {
                    case 12:
                        {
                        alt1=1;
                        }
                        break;
                    case 13:
                        {
                        alt1=2;
                        }
                        break;
                    case 14:
                        {
                        alt1=3;
                        }
                        break;
                    case 15:
                        {
                        alt1=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }

                    switch (alt1) {
                        case 1 :
                            // InternalErDsl.g:88:7: lv_targetGenerator_1_1= 'Logical Schema'
                            {
                            lv_targetGenerator_1_1=(Token)match(input,12,FOLLOW_4); 

                            							newLeafNode(lv_targetGenerator_1_1, grammarAccess.getERModelAccess().getTargetGeneratorLogicalSchemaKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERModelRule());
                            							}
                            							setWithLastConsumed(current, "targetGenerator", lv_targetGenerator_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalErDsl.g:99:7: lv_targetGenerator_1_2= 'PostgreSQL'
                            {
                            lv_targetGenerator_1_2=(Token)match(input,13,FOLLOW_4); 

                            							newLeafNode(lv_targetGenerator_1_2, grammarAccess.getERModelAccess().getTargetGeneratorPostgreSQLKeyword_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERModelRule());
                            							}
                            							setWithLastConsumed(current, "targetGenerator", lv_targetGenerator_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalErDsl.g:110:7: lv_targetGenerator_1_3= 'MySQL'
                            {
                            lv_targetGenerator_1_3=(Token)match(input,14,FOLLOW_4); 

                            							newLeafNode(lv_targetGenerator_1_3, grammarAccess.getERModelAccess().getTargetGeneratorMySQLKeyword_0_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERModelRule());
                            							}
                            							setWithLastConsumed(current, "targetGenerator", lv_targetGenerator_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalErDsl.g:121:7: lv_targetGenerator_1_4= 'All'
                            {
                            lv_targetGenerator_1_4=(Token)match(input,15,FOLLOW_4); 

                            							newLeafNode(lv_targetGenerator_1_4, grammarAccess.getERModelAccess().getTargetGeneratorAllKeyword_0_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERModelRule());
                            							}
                            							setWithLastConsumed(current, "targetGenerator", lv_targetGenerator_1_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getERModelAccess().getSemicolonKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalErDsl.g:139:3: ( (lv_domain_3_0= ruleDomain ) )
            // InternalErDsl.g:140:4: (lv_domain_3_0= ruleDomain )
            {
            // InternalErDsl.g:140:4: (lv_domain_3_0= ruleDomain )
            // InternalErDsl.g:141:5: lv_domain_3_0= ruleDomain
            {

            					newCompositeNode(grammarAccess.getERModelAccess().getDomainDomainParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_domain_3_0=ruleDomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getERModelRule());
            					}
            					set(
            						current,
            						"domain",
            						lv_domain_3_0,
            						"org.xtext.unipampa.erdsl.ErDsl.Domain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getERModelAccess().getSemicolonKeyword_2());
            		
            // InternalErDsl.g:162:3: (otherlv_5= 'Entities' otherlv_6= '{' )
            // InternalErDsl.g:163:4: otherlv_5= 'Entities' otherlv_6= '{'
            {
            otherlv_5=(Token)match(input,17,FOLLOW_7); 

            				newLeafNode(otherlv_5, grammarAccess.getERModelAccess().getEntitiesKeyword_3_0());
            			
            otherlv_6=(Token)match(input,18,FOLLOW_8); 

            				newLeafNode(otherlv_6, grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_3_1());
            			

            }

            // InternalErDsl.g:172:3: ( (lv_entities_7_0= ruleEntity ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalErDsl.g:173:4: (lv_entities_7_0= ruleEntity )
            	    {
            	    // InternalErDsl.g:173:4: (lv_entities_7_0= ruleEntity )
            	    // InternalErDsl.g:174:5: lv_entities_7_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_entities_7_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_7_0,
            	    						"org.xtext.unipampa.erdsl.ErDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalErDsl.g:191:3: (otherlv_8= '}' otherlv_9= ';' )
            // InternalErDsl.g:192:4: otherlv_8= '}' otherlv_9= ';'
            {
            otherlv_8=(Token)match(input,19,FOLLOW_4); 

            				newLeafNode(otherlv_8, grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_5_0());
            			
            otherlv_9=(Token)match(input,16,FOLLOW_10); 

            				newLeafNode(otherlv_9, grammarAccess.getERModelAccess().getSemicolonKeyword_5_1());
            			

            }

            // InternalErDsl.g:201:3: (otherlv_10= 'Relationships' otherlv_11= '{' )
            // InternalErDsl.g:202:4: otherlv_10= 'Relationships' otherlv_11= '{'
            {
            otherlv_10=(Token)match(input,20,FOLLOW_7); 

            				newLeafNode(otherlv_10, grammarAccess.getERModelAccess().getRelationshipsKeyword_6_0());
            			
            otherlv_11=(Token)match(input,18,FOLLOW_11); 

            				newLeafNode(otherlv_11, grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_6_1());
            			

            }

            // InternalErDsl.g:211:3: ( (lv_relations_12_0= ruleRelation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==29) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalErDsl.g:212:4: (lv_relations_12_0= ruleRelation )
            	    {
            	    // InternalErDsl.g:212:4: (lv_relations_12_0= ruleRelation )
            	    // InternalErDsl.g:213:5: lv_relations_12_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getERModelAccess().getRelationsRelationParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_relations_12_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_12_0,
            	    						"org.xtext.unipampa.erdsl.ErDsl.Relation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalErDsl.g:230:3: (otherlv_13= '}' otherlv_14= ';' )
            // InternalErDsl.g:231:4: otherlv_13= '}' otherlv_14= ';'
            {
            otherlv_13=(Token)match(input,19,FOLLOW_4); 

            				newLeafNode(otherlv_13, grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_8_0());
            			
            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            				newLeafNode(otherlv_14, grammarAccess.getERModelAccess().getSemicolonKeyword_8_1());
            			

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
    // InternalErDsl.g:244:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalErDsl.g:244:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalErDsl.g:245:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalErDsl.g:251:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalErDsl.g:257:2: ( (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalErDsl.g:258:2: (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalErDsl.g:258:2: (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalErDsl.g:259:3: otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
            		
            // InternalErDsl.g:263:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalErDsl.g:264:4: (lv_name_1_0= RULE_ID )
            {
            // InternalErDsl.g:264:4: (lv_name_1_0= RULE_ID )
            // InternalErDsl.g:265:5: lv_name_1_0= RULE_ID
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
    // InternalErDsl.g:285:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalErDsl.g:285:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalErDsl.g:286:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalErDsl.g:292:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isKey_2_0= 'isIdentifier' ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_isKey_2_0=null;
        Enumerator lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalErDsl.g:298:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isKey_2_0= 'isIdentifier' ) )? ) )
            // InternalErDsl.g:299:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isKey_2_0= 'isIdentifier' ) )? )
            {
            // InternalErDsl.g:299:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isKey_2_0= 'isIdentifier' ) )? )
            // InternalErDsl.g:300:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleDataType ) ) ( (lv_isKey_2_0= 'isIdentifier' ) )?
            {
            // InternalErDsl.g:300:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalErDsl.g:301:4: (lv_name_0_0= RULE_ID )
            {
            // InternalErDsl.g:301:4: (lv_name_0_0= RULE_ID )
            // InternalErDsl.g:302:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            // InternalErDsl.g:318:3: ( (lv_type_1_0= ruleDataType ) )
            // InternalErDsl.g:319:4: (lv_type_1_0= ruleDataType )
            {
            // InternalErDsl.g:319:4: (lv_type_1_0= ruleDataType )
            // InternalErDsl.g:320:5: lv_type_1_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalErDsl.g:337:3: ( (lv_isKey_2_0= 'isIdentifier' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalErDsl.g:338:4: (lv_isKey_2_0= 'isIdentifier' )
                    {
                    // InternalErDsl.g:338:4: (lv_isKey_2_0= 'isIdentifier' )
                    // InternalErDsl.g:339:5: lv_isKey_2_0= 'isIdentifier'
                    {
                    lv_isKey_2_0=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_isKey_2_0, grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isKey", lv_isKey_2_0 != null, "isIdentifier");
                    				

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
    // InternalErDsl.g:355:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalErDsl.g:355:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalErDsl.g:356:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalErDsl.g:362:1: ruleEntity returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( ( (lv_generalization_2_1= 'total/disjoint' | lv_generalization_2_2= 'total/Overlapped' | lv_generalization_2_3= 'partial/disjoint' | lv_generalization_2_4= 'partial/overlapped' ) ) ) ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_generalization_2_1=null;
        Token lv_generalization_2_2=null;
        Token lv_generalization_2_3=null;
        Token lv_generalization_2_4=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_attributes_5_0 = null;

        EObject lv_attributes_7_0 = null;



        	enterRule();

        try {
            // InternalErDsl.g:368:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( ( (lv_generalization_2_1= 'total/disjoint' | lv_generalization_2_2= 'total/Overlapped' | lv_generalization_2_3= 'partial/disjoint' | lv_generalization_2_4= 'partial/overlapped' ) ) ) ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )? ) )
            // InternalErDsl.g:369:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( ( (lv_generalization_2_1= 'total/disjoint' | lv_generalization_2_2= 'total/Overlapped' | lv_generalization_2_3= 'partial/disjoint' | lv_generalization_2_4= 'partial/overlapped' ) ) ) ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )? )
            {
            // InternalErDsl.g:369:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( ( (lv_generalization_2_1= 'total/disjoint' | lv_generalization_2_2= 'total/Overlapped' | lv_generalization_2_3= 'partial/disjoint' | lv_generalization_2_4= 'partial/overlapped' ) ) ) ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )? )
            // InternalErDsl.g:370:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( ( (lv_generalization_2_1= 'total/disjoint' | lv_generalization_2_2= 'total/Overlapped' | lv_generalization_2_3= 'partial/disjoint' | lv_generalization_2_4= 'partial/overlapped' ) ) ) ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )?
            {
            // InternalErDsl.g:370:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalErDsl.g:371:4: (lv_name_0_0= RULE_ID )
            {
            // InternalErDsl.g:371:4: (lv_name_0_0= RULE_ID )
            // InternalErDsl.g:372:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            // InternalErDsl.g:388:3: (otherlv_1= 'is' ( ( (lv_generalization_2_1= 'total/disjoint' | lv_generalization_2_2= 'total/Overlapped' | lv_generalization_2_3= 'partial/disjoint' | lv_generalization_2_4= 'partial/overlapped' ) ) ) ( (otherlv_3= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalErDsl.g:389:4: otherlv_1= 'is' ( ( (lv_generalization_2_1= 'total/disjoint' | lv_generalization_2_2= 'total/Overlapped' | lv_generalization_2_3= 'partial/disjoint' | lv_generalization_2_4= 'partial/overlapped' ) ) ) ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getIsKeyword_1_0());
                    			
                    // InternalErDsl.g:393:4: ( ( (lv_generalization_2_1= 'total/disjoint' | lv_generalization_2_2= 'total/Overlapped' | lv_generalization_2_3= 'partial/disjoint' | lv_generalization_2_4= 'partial/overlapped' ) ) )
                    // InternalErDsl.g:394:5: ( (lv_generalization_2_1= 'total/disjoint' | lv_generalization_2_2= 'total/Overlapped' | lv_generalization_2_3= 'partial/disjoint' | lv_generalization_2_4= 'partial/overlapped' ) )
                    {
                    // InternalErDsl.g:394:5: ( (lv_generalization_2_1= 'total/disjoint' | lv_generalization_2_2= 'total/Overlapped' | lv_generalization_2_3= 'partial/disjoint' | lv_generalization_2_4= 'partial/overlapped' ) )
                    // InternalErDsl.g:395:6: (lv_generalization_2_1= 'total/disjoint' | lv_generalization_2_2= 'total/Overlapped' | lv_generalization_2_3= 'partial/disjoint' | lv_generalization_2_4= 'partial/overlapped' )
                    {
                    // InternalErDsl.g:395:6: (lv_generalization_2_1= 'total/disjoint' | lv_generalization_2_2= 'total/Overlapped' | lv_generalization_2_3= 'partial/disjoint' | lv_generalization_2_4= 'partial/overlapped' )
                    int alt6=4;
                    switch ( input.LA(1) ) {
                    case 24:
                        {
                        alt6=1;
                        }
                        break;
                    case 25:
                        {
                        alt6=2;
                        }
                        break;
                    case 26:
                        {
                        alt6=3;
                        }
                        break;
                    case 27:
                        {
                        alt6=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }

                    switch (alt6) {
                        case 1 :
                            // InternalErDsl.g:396:7: lv_generalization_2_1= 'total/disjoint'
                            {
                            lv_generalization_2_1=(Token)match(input,24,FOLLOW_8); 

                            							newLeafNode(lv_generalization_2_1, grammarAccess.getEntityAccess().getGeneralizationTotalDisjointKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEntityRule());
                            							}
                            							setWithLastConsumed(current, "generalization", lv_generalization_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalErDsl.g:407:7: lv_generalization_2_2= 'total/Overlapped'
                            {
                            lv_generalization_2_2=(Token)match(input,25,FOLLOW_8); 

                            							newLeafNode(lv_generalization_2_2, grammarAccess.getEntityAccess().getGeneralizationTotalOverlappedKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEntityRule());
                            							}
                            							setWithLastConsumed(current, "generalization", lv_generalization_2_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalErDsl.g:418:7: lv_generalization_2_3= 'partial/disjoint'
                            {
                            lv_generalization_2_3=(Token)match(input,26,FOLLOW_8); 

                            							newLeafNode(lv_generalization_2_3, grammarAccess.getEntityAccess().getGeneralizationPartialDisjointKeyword_1_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEntityRule());
                            							}
                            							setWithLastConsumed(current, "generalization", lv_generalization_2_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalErDsl.g:429:7: lv_generalization_2_4= 'partial/overlapped'
                            {
                            lv_generalization_2_4=(Token)match(input,27,FOLLOW_8); 

                            							newLeafNode(lv_generalization_2_4, grammarAccess.getEntityAccess().getGeneralizationPartialOverlappedKeyword_1_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEntityRule());
                            							}
                            							setWithLastConsumed(current, "generalization", lv_generalization_2_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalErDsl.g:442:4: ( (otherlv_3= RULE_ID ) )
                    // InternalErDsl.g:443:5: (otherlv_3= RULE_ID )
                    {
                    // InternalErDsl.g:443:5: (otherlv_3= RULE_ID )
                    // InternalErDsl.g:444:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getIsEntityCrossReference_1_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalErDsl.g:456:3: (otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalErDsl.g:457:4: otherlv_4= '{' ( (lv_attributes_5_0= ruleAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalErDsl.g:461:4: ( (lv_attributes_5_0= ruleAttribute ) )
                    // InternalErDsl.g:462:5: (lv_attributes_5_0= ruleAttribute )
                    {
                    // InternalErDsl.g:462:5: (lv_attributes_5_0= ruleAttribute )
                    // InternalErDsl.g:463:6: lv_attributes_5_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_attributes_5_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_5_0,
                    							"org.xtext.unipampa.erdsl.ErDsl.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalErDsl.g:480:4: (otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==28) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalErDsl.g:481:5: otherlv_6= ',' ( (lv_attributes_7_0= ruleAttribute ) )
                    	    {
                    	    otherlv_6=(Token)match(input,28,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalErDsl.g:485:5: ( (lv_attributes_7_0= ruleAttribute ) )
                    	    // InternalErDsl.g:486:6: (lv_attributes_7_0= ruleAttribute )
                    	    {
                    	    // InternalErDsl.g:486:6: (lv_attributes_7_0= ruleAttribute )
                    	    // InternalErDsl.g:487:7: lv_attributes_7_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_attributes_7_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_7_0,
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

                    otherlv_8=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // InternalErDsl.g:514:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalErDsl.g:514:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalErDsl.g:515:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalErDsl.g:521:1: ruleRelation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSideLeft ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSideRight ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )* ) ;
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
            // InternalErDsl.g:527:2: ( ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSideLeft ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSideRight ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )* ) )
            // InternalErDsl.g:528:2: ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSideLeft ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSideRight ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )* )
            {
            // InternalErDsl.g:528:2: ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSideLeft ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSideRight ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )* )
            // InternalErDsl.g:529:3: ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSideLeft ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSideRight ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )*
            {
            // InternalErDsl.g:529:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalErDsl.g:530:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalErDsl.g:530:4: (lv_name_0_0= RULE_ID )
                    // InternalErDsl.g:531:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            // InternalErDsl.g:547:3: (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSideLeft ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSideRight ) ) otherlv_5= ']' )
            // InternalErDsl.g:548:4: otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSideLeft ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSideRight ) ) otherlv_5= ']'
            {
            otherlv_1=(Token)match(input,29,FOLLOW_8); 

            				newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_1_0());
            			
            // InternalErDsl.g:552:4: ( (lv_leftEnding_2_0= ruleRelationSideLeft ) )
            // InternalErDsl.g:553:5: (lv_leftEnding_2_0= ruleRelationSideLeft )
            {
            // InternalErDsl.g:553:5: (lv_leftEnding_2_0= ruleRelationSideLeft )
            // InternalErDsl.g:554:6: lv_leftEnding_2_0= ruleRelationSideLeft
            {

            						newCompositeNode(grammarAccess.getRelationAccess().getLeftEndingRelationSideLeftParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_19);
            lv_leftEnding_2_0=ruleRelationSideLeft();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRelationRule());
            						}
            						set(
            							current,
            							"leftEnding",
            							lv_leftEnding_2_0,
            							"org.xtext.unipampa.erdsl.ErDsl.RelationSideLeft");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_20); 

            				newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getRelatesKeyword_1_2());
            			
            // InternalErDsl.g:575:4: ( (lv_rightEnding_4_0= ruleRelationSideRight ) )
            // InternalErDsl.g:576:5: (lv_rightEnding_4_0= ruleRelationSideRight )
            {
            // InternalErDsl.g:576:5: (lv_rightEnding_4_0= ruleRelationSideRight )
            // InternalErDsl.g:577:6: lv_rightEnding_4_0= ruleRelationSideRight
            {

            						newCompositeNode(grammarAccess.getRelationAccess().getRightEndingRelationSideRightParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_21);
            lv_rightEnding_4_0=ruleRelationSideRight();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRelationRule());
            						}
            						set(
            							current,
            							"rightEnding",
            							lv_rightEnding_4_0,
            							"org.xtext.unipampa.erdsl.ErDsl.RelationSideRight");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_5=(Token)match(input,31,FOLLOW_16); 

            				newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getRightSquareBracketKeyword_1_4());
            			

            }

            // InternalErDsl.g:599:3: (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalErDsl.g:600:4: otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}'
            	    {
            	    otherlv_6=(Token)match(input,18,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2_0());
            	    			
            	    // InternalErDsl.g:604:4: ( (lv_attributes_7_0= ruleAttribute ) )
            	    // InternalErDsl.g:605:5: (lv_attributes_7_0= ruleAttribute )
            	    {
            	    // InternalErDsl.g:605:5: (lv_attributes_7_0= ruleAttribute )
            	    // InternalErDsl.g:606:6: lv_attributes_7_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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

            	    // InternalErDsl.g:623:4: (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==28) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalErDsl.g:624:5: otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,28,FOLLOW_8); 

            	    	    					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getCommaKeyword_2_2_0());
            	    	    				
            	    	    // InternalErDsl.g:628:5: ( (lv_attributes_9_0= ruleAttribute ) )
            	    	    // InternalErDsl.g:629:6: (lv_attributes_9_0= ruleAttribute )
            	    	    {
            	    	    // InternalErDsl.g:629:6: (lv_attributes_9_0= ruleAttribute )
            	    	    // InternalErDsl.g:630:7: lv_attributes_9_0= ruleAttribute
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_2_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_17);
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
            	    	    break loop11;
            	        }
            	    } while (true);

            	    otherlv_10=(Token)match(input,19,FOLLOW_16); 

            	    				newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_2_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
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


    // $ANTLR start "entryRuleRelationSideRight"
    // InternalErDsl.g:657:1: entryRuleRelationSideRight returns [EObject current=null] : iv_ruleRelationSideRight= ruleRelationSideRight EOF ;
    public final EObject entryRuleRelationSideRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationSideRight = null;


        try {
            // InternalErDsl.g:657:58: (iv_ruleRelationSideRight= ruleRelationSideRight EOF )
            // InternalErDsl.g:658:2: iv_ruleRelationSideRight= ruleRelationSideRight EOF
            {
             newCompositeNode(grammarAccess.getRelationSideRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationSideRight=ruleRelationSideRight();

            state._fsp--;

             current =iv_ruleRelationSideRight; 
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
    // $ANTLR end "entryRuleRelationSideRight"


    // $ANTLR start "ruleRelationSideRight"
    // InternalErDsl.g:664:1: ruleRelationSideRight returns [EObject current=null] : ( ( ( ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRelationSideRight() throws RecognitionException {
        EObject current = null;

        Token lv_cardinality_0_1=null;
        Token lv_cardinality_0_2=null;
        Token lv_cardinality_0_3=null;
        Token lv_cardinality_0_4=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalErDsl.g:670:2: ( ( ( ( ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalErDsl.g:671:2: ( ( ( ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalErDsl.g:671:2: ( ( ( ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=32 && LA14_0<=35)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalErDsl.g:672:3: ( ( ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalErDsl.g:672:3: ( ( ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) )
                    // InternalErDsl.g:673:4: ( ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalErDsl.g:673:4: ( ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) ) )
                    // InternalErDsl.g:674:5: ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) )
                    {
                    // InternalErDsl.g:674:5: ( (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' ) )
                    // InternalErDsl.g:675:6: (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' )
                    {
                    // InternalErDsl.g:675:6: (lv_cardinality_0_1= '(0:1)' | lv_cardinality_0_2= '(1:1)' | lv_cardinality_0_3= '(0:N)' | lv_cardinality_0_4= '(1:N)' )
                    int alt13=4;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt13=1;
                        }
                        break;
                    case 33:
                        {
                        alt13=2;
                        }
                        break;
                    case 34:
                        {
                        alt13=3;
                        }
                        break;
                    case 35:
                        {
                        alt13=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // InternalErDsl.g:676:7: lv_cardinality_0_1= '(0:1)'
                            {
                            lv_cardinality_0_1=(Token)match(input,32,FOLLOW_8); 

                            							newLeafNode(lv_cardinality_0_1, grammarAccess.getRelationSideRightAccess().getCardinality01Keyword_0_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRightRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_0_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalErDsl.g:687:7: lv_cardinality_0_2= '(1:1)'
                            {
                            lv_cardinality_0_2=(Token)match(input,33,FOLLOW_8); 

                            							newLeafNode(lv_cardinality_0_2, grammarAccess.getRelationSideRightAccess().getCardinality11Keyword_0_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRightRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_0_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalErDsl.g:698:7: lv_cardinality_0_3= '(0:N)'
                            {
                            lv_cardinality_0_3=(Token)match(input,34,FOLLOW_8); 

                            							newLeafNode(lv_cardinality_0_3, grammarAccess.getRelationSideRightAccess().getCardinality0NKeyword_0_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRightRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_0_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalErDsl.g:709:7: lv_cardinality_0_4= '(1:N)'
                            {
                            lv_cardinality_0_4=(Token)match(input,35,FOLLOW_8); 

                            							newLeafNode(lv_cardinality_0_4, grammarAccess.getRelationSideRightAccess().getCardinality1NKeyword_0_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRightRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_0_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalErDsl.g:722:4: ( (otherlv_1= RULE_ID ) )
                    // InternalErDsl.g:723:5: (otherlv_1= RULE_ID )
                    {
                    // InternalErDsl.g:723:5: (otherlv_1= RULE_ID )
                    // InternalErDsl.g:724:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationSideRightRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getRelationSideRightAccess().getTargetEntityCrossReference_0_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:737:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalErDsl.g:737:3: ( (otherlv_2= RULE_ID ) )
                    // InternalErDsl.g:738:4: (otherlv_2= RULE_ID )
                    {
                    // InternalErDsl.g:738:4: (otherlv_2= RULE_ID )
                    // InternalErDsl.g:739:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationSideRightRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getRelationSideRightAccess().getTargetRelationCrossReference_1_0());
                    				

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
    // $ANTLR end "ruleRelationSideRight"


    // $ANTLR start "entryRuleRelationSideLeft"
    // InternalErDsl.g:754:1: entryRuleRelationSideLeft returns [EObject current=null] : iv_ruleRelationSideLeft= ruleRelationSideLeft EOF ;
    public final EObject entryRuleRelationSideLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationSideLeft = null;


        try {
            // InternalErDsl.g:754:57: (iv_ruleRelationSideLeft= ruleRelationSideLeft EOF )
            // InternalErDsl.g:755:2: iv_ruleRelationSideLeft= ruleRelationSideLeft EOF
            {
             newCompositeNode(grammarAccess.getRelationSideLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationSideLeft=ruleRelationSideLeft();

            state._fsp--;

             current =iv_ruleRelationSideLeft; 
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
    // $ANTLR end "entryRuleRelationSideLeft"


    // $ANTLR start "ruleRelationSideLeft"
    // InternalErDsl.g:761:1: ruleRelationSideLeft returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_cardinality_2_1= '(0:1)' | lv_cardinality_2_2= '(1:1)' | lv_cardinality_2_3= '(0:N)' | lv_cardinality_2_4= '(1:N)' ) ) ) ) ) ;
    public final EObject ruleRelationSideLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_cardinality_2_1=null;
        Token lv_cardinality_2_2=null;
        Token lv_cardinality_2_3=null;
        Token lv_cardinality_2_4=null;


        	enterRule();

        try {
            // InternalErDsl.g:767:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_cardinality_2_1= '(0:1)' | lv_cardinality_2_2= '(1:1)' | lv_cardinality_2_3= '(0:N)' | lv_cardinality_2_4= '(1:N)' ) ) ) ) ) )
            // InternalErDsl.g:768:2: ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_cardinality_2_1= '(0:1)' | lv_cardinality_2_2= '(1:1)' | lv_cardinality_2_3= '(0:N)' | lv_cardinality_2_4= '(1:N)' ) ) ) ) )
            {
            // InternalErDsl.g:768:2: ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_cardinality_2_1= '(0:1)' | lv_cardinality_2_2= '(1:1)' | lv_cardinality_2_3= '(0:N)' | lv_cardinality_2_4= '(1:N)' ) ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==EOF||LA16_1==30) ) {
                    alt16=1;
                }
                else if ( ((LA16_1>=32 && LA16_1<=35)) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalErDsl.g:769:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalErDsl.g:769:3: ( (otherlv_0= RULE_ID ) )
                    // InternalErDsl.g:770:4: (otherlv_0= RULE_ID )
                    {
                    // InternalErDsl.g:770:4: (otherlv_0= RULE_ID )
                    // InternalErDsl.g:771:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationSideLeftRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getRelationSideLeftAccess().getTargetEntityCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:783:3: ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_cardinality_2_1= '(0:1)' | lv_cardinality_2_2= '(1:1)' | lv_cardinality_2_3= '(0:N)' | lv_cardinality_2_4= '(1:N)' ) ) ) )
                    {
                    // InternalErDsl.g:783:3: ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_cardinality_2_1= '(0:1)' | lv_cardinality_2_2= '(1:1)' | lv_cardinality_2_3= '(0:N)' | lv_cardinality_2_4= '(1:N)' ) ) ) )
                    // InternalErDsl.g:784:4: ( (otherlv_1= RULE_ID ) ) ( ( (lv_cardinality_2_1= '(0:1)' | lv_cardinality_2_2= '(1:1)' | lv_cardinality_2_3= '(0:N)' | lv_cardinality_2_4= '(1:N)' ) ) )
                    {
                    // InternalErDsl.g:784:4: ( (otherlv_1= RULE_ID ) )
                    // InternalErDsl.g:785:5: (otherlv_1= RULE_ID )
                    {
                    // InternalErDsl.g:785:5: (otherlv_1= RULE_ID )
                    // InternalErDsl.g:786:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationSideLeftRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_1, grammarAccess.getRelationSideLeftAccess().getTargetRelationCrossReference_1_0_0());
                    					

                    }


                    }

                    // InternalErDsl.g:797:4: ( ( (lv_cardinality_2_1= '(0:1)' | lv_cardinality_2_2= '(1:1)' | lv_cardinality_2_3= '(0:N)' | lv_cardinality_2_4= '(1:N)' ) ) )
                    // InternalErDsl.g:798:5: ( (lv_cardinality_2_1= '(0:1)' | lv_cardinality_2_2= '(1:1)' | lv_cardinality_2_3= '(0:N)' | lv_cardinality_2_4= '(1:N)' ) )
                    {
                    // InternalErDsl.g:798:5: ( (lv_cardinality_2_1= '(0:1)' | lv_cardinality_2_2= '(1:1)' | lv_cardinality_2_3= '(0:N)' | lv_cardinality_2_4= '(1:N)' ) )
                    // InternalErDsl.g:799:6: (lv_cardinality_2_1= '(0:1)' | lv_cardinality_2_2= '(1:1)' | lv_cardinality_2_3= '(0:N)' | lv_cardinality_2_4= '(1:N)' )
                    {
                    // InternalErDsl.g:799:6: (lv_cardinality_2_1= '(0:1)' | lv_cardinality_2_2= '(1:1)' | lv_cardinality_2_3= '(0:N)' | lv_cardinality_2_4= '(1:N)' )
                    int alt15=4;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt15=1;
                        }
                        break;
                    case 33:
                        {
                        alt15=2;
                        }
                        break;
                    case 34:
                        {
                        alt15=3;
                        }
                        break;
                    case 35:
                        {
                        alt15=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }

                    switch (alt15) {
                        case 1 :
                            // InternalErDsl.g:800:7: lv_cardinality_2_1= '(0:1)'
                            {
                            lv_cardinality_2_1=(Token)match(input,32,FOLLOW_2); 

                            							newLeafNode(lv_cardinality_2_1, grammarAccess.getRelationSideLeftAccess().getCardinality01Keyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideLeftRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalErDsl.g:811:7: lv_cardinality_2_2= '(1:1)'
                            {
                            lv_cardinality_2_2=(Token)match(input,33,FOLLOW_2); 

                            							newLeafNode(lv_cardinality_2_2, grammarAccess.getRelationSideLeftAccess().getCardinality11Keyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideLeftRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_2_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalErDsl.g:822:7: lv_cardinality_2_3= '(0:N)'
                            {
                            lv_cardinality_2_3=(Token)match(input,34,FOLLOW_2); 

                            							newLeafNode(lv_cardinality_2_3, grammarAccess.getRelationSideLeftAccess().getCardinality0NKeyword_1_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideLeftRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_2_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalErDsl.g:833:7: lv_cardinality_2_4= '(1:N)'
                            {
                            lv_cardinality_2_4=(Token)match(input,35,FOLLOW_2); 

                            							newLeafNode(lv_cardinality_2_4, grammarAccess.getRelationSideLeftAccess().getCardinality1NKeyword_1_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideLeftRule());
                            							}
                            							setWithLastConsumed(current, "cardinality", lv_cardinality_2_4, null);
                            						

                            }
                            break;

                    }


                    }


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
    // $ANTLR end "ruleRelationSideLeft"


    // $ANTLR start "ruleDataType"
    // InternalErDsl.g:851:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'money' ) | (enumLiteral_3= 'string' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'datetime' ) | (enumLiteral_6= 'file' ) ) ;
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
            // InternalErDsl.g:857:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'money' ) | (enumLiteral_3= 'string' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'datetime' ) | (enumLiteral_6= 'file' ) ) )
            // InternalErDsl.g:858:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'money' ) | (enumLiteral_3= 'string' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'datetime' ) | (enumLiteral_6= 'file' ) )
            {
            // InternalErDsl.g:858:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'money' ) | (enumLiteral_3= 'string' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'datetime' ) | (enumLiteral_6= 'file' ) )
            int alt17=7;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt17=1;
                }
                break;
            case 37:
                {
                alt17=2;
                }
                break;
            case 38:
                {
                alt17=3;
                }
                break;
            case 39:
                {
                alt17=4;
                }
                break;
            case 40:
                {
                alt17=5;
                }
                break;
            case 41:
                {
                alt17=6;
                }
                break;
            case 42:
                {
                alt17=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalErDsl.g:859:3: (enumLiteral_0= 'int' )
                    {
                    // InternalErDsl.g:859:3: (enumLiteral_0= 'int' )
                    // InternalErDsl.g:860:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:867:3: (enumLiteral_1= 'double' )
                    {
                    // InternalErDsl.g:867:3: (enumLiteral_1= 'double' )
                    // InternalErDsl.g:868:4: enumLiteral_1= 'double'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl.g:875:3: (enumLiteral_2= 'money' )
                    {
                    // InternalErDsl.g:875:3: (enumLiteral_2= 'money' )
                    // InternalErDsl.g:876:4: enumLiteral_2= 'money'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl.g:883:3: (enumLiteral_3= 'string' )
                    {
                    // InternalErDsl.g:883:3: (enumLiteral_3= 'string' )
                    // InternalErDsl.g:884:4: enumLiteral_3= 'string'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalErDsl.g:891:3: (enumLiteral_4= 'boolean' )
                    {
                    // InternalErDsl.g:891:3: (enumLiteral_4= 'boolean' )
                    // InternalErDsl.g:892:4: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalErDsl.g:899:3: (enumLiteral_5= 'datetime' )
                    {
                    // InternalErDsl.g:899:3: (enumLiteral_5= 'datetime' )
                    // InternalErDsl.g:900:4: enumLiteral_5= 'datetime'
                    {
                    enumLiteral_5=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalErDsl.g:907:3: (enumLiteral_6= 'file' )
                    {
                    // InternalErDsl.g:907:3: (enumLiteral_6= 'file' )
                    // InternalErDsl.g:908:4: enumLiteral_6= 'file'
                    {
                    enumLiteral_6=(Token)match(input,42,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020080010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000007F000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000F00000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000F00000000L});

}