package org.xtext.unipampa.erdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'Entities{'", "'};'", "'Relationships{'", "'Domain'", "'isIdentifier'", "'is'", "'{'", "','", "'}'", "'['", "'relates'", "']'", "'(0:1)'", "'(1:1)'", "'(0:N)'", "'(1:N)'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=5;
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
    // InternalErDsl.g:64:1: entryRuleERModel returns [EObject current=null] : iv_ruleERModel= ruleERModel EOF ;
    public final EObject entryRuleERModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERModel = null;


        try {
            // InternalErDsl.g:64:48: (iv_ruleERModel= ruleERModel EOF )
            // InternalErDsl.g:65:2: iv_ruleERModel= ruleERModel EOF
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
    // InternalErDsl.g:71:1: ruleERModel returns [EObject current=null] : ( ( (lv_domain_0_0= ruleDomain ) ) otherlv_1= ';' otherlv_2= 'Entities{' ( (lv_entities_3_0= ruleEntity ) )+ otherlv_4= '};' otherlv_5= 'Relationships{' ( (lv_relations_6_0= ruleRelation ) )* otherlv_7= '};' ) ;
    public final EObject ruleERModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_domain_0_0 = null;

        EObject lv_entities_3_0 = null;

        EObject lv_relations_6_0 = null;



        	enterRule();

        try {
            // InternalErDsl.g:77:2: ( ( ( (lv_domain_0_0= ruleDomain ) ) otherlv_1= ';' otherlv_2= 'Entities{' ( (lv_entities_3_0= ruleEntity ) )+ otherlv_4= '};' otherlv_5= 'Relationships{' ( (lv_relations_6_0= ruleRelation ) )* otherlv_7= '};' ) )
            // InternalErDsl.g:78:2: ( ( (lv_domain_0_0= ruleDomain ) ) otherlv_1= ';' otherlv_2= 'Entities{' ( (lv_entities_3_0= ruleEntity ) )+ otherlv_4= '};' otherlv_5= 'Relationships{' ( (lv_relations_6_0= ruleRelation ) )* otherlv_7= '};' )
            {
            // InternalErDsl.g:78:2: ( ( (lv_domain_0_0= ruleDomain ) ) otherlv_1= ';' otherlv_2= 'Entities{' ( (lv_entities_3_0= ruleEntity ) )+ otherlv_4= '};' otherlv_5= 'Relationships{' ( (lv_relations_6_0= ruleRelation ) )* otherlv_7= '};' )
            // InternalErDsl.g:79:3: ( (lv_domain_0_0= ruleDomain ) ) otherlv_1= ';' otherlv_2= 'Entities{' ( (lv_entities_3_0= ruleEntity ) )+ otherlv_4= '};' otherlv_5= 'Relationships{' ( (lv_relations_6_0= ruleRelation ) )* otherlv_7= '};'
            {
            // InternalErDsl.g:79:3: ( (lv_domain_0_0= ruleDomain ) )
            // InternalErDsl.g:80:4: (lv_domain_0_0= ruleDomain )
            {
            // InternalErDsl.g:80:4: (lv_domain_0_0= ruleDomain )
            // InternalErDsl.g:81:5: lv_domain_0_0= ruleDomain
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
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getERModelAccess().getEntitiesKeyword_2());
            		
            // InternalErDsl.g:106:3: ( (lv_entities_3_0= ruleEntity ) )+
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
            	    // InternalErDsl.g:107:4: (lv_entities_3_0= ruleEntity )
            	    {
            	    // InternalErDsl.g:107:4: (lv_entities_3_0= ruleEntity )
            	    // InternalErDsl.g:108:5: lv_entities_3_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_entities_3_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_3_0,
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

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getERModelAccess().getRightCurlyBracketSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getERModelAccess().getRelationshipsKeyword_5());
            		
            // InternalErDsl.g:133:3: ( (lv_relations_6_0= ruleRelation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalErDsl.g:134:4: (lv_relations_6_0= ruleRelation )
            	    {
            	    // InternalErDsl.g:134:4: (lv_relations_6_0= ruleRelation )
            	    // InternalErDsl.g:135:5: lv_relations_6_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getERModelAccess().getRelationsRelationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_relations_6_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_6_0,
            	    						"org.xtext.unipampa.erdsl.ErDsl.Relation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getERModelAccess().getRightCurlyBracketSemicolonKeyword_7());
            		

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
    // InternalErDsl.g:160:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalErDsl.g:160:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalErDsl.g:161:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalErDsl.g:167:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalErDsl.g:173:2: ( (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalErDsl.g:174:2: (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalErDsl.g:174:2: (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalErDsl.g:175:3: otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
            		
            // InternalErDsl.g:179:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalErDsl.g:180:4: (lv_name_1_0= RULE_ID )
            {
            // InternalErDsl.g:180:4: (lv_name_1_0= RULE_ID )
            // InternalErDsl.g:181:5: lv_name_1_0= RULE_ID
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
    // InternalErDsl.g:201:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalErDsl.g:201:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalErDsl.g:202:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalErDsl.g:208:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_isKey_1_0= 'isIdentifier' ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_isKey_1_0=null;


        	enterRule();

        try {
            // InternalErDsl.g:214:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_isKey_1_0= 'isIdentifier' ) )? ) )
            // InternalErDsl.g:215:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_isKey_1_0= 'isIdentifier' ) )? )
            {
            // InternalErDsl.g:215:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_isKey_1_0= 'isIdentifier' ) )? )
            // InternalErDsl.g:216:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_isKey_1_0= 'isIdentifier' ) )?
            {
            // InternalErDsl.g:216:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalErDsl.g:217:4: (lv_name_0_0= RULE_ID )
            {
            // InternalErDsl.g:217:4: (lv_name_0_0= RULE_ID )
            // InternalErDsl.g:218:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            // InternalErDsl.g:234:3: ( (lv_isKey_1_0= 'isIdentifier' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalErDsl.g:235:4: (lv_isKey_1_0= 'isIdentifier' )
                    {
                    // InternalErDsl.g:235:4: (lv_isKey_1_0= 'isIdentifier' )
                    // InternalErDsl.g:236:5: lv_isKey_1_0= 'isIdentifier'
                    {
                    lv_isKey_1_0=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_isKey_1_0, grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_1_0());
                    				

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
    // InternalErDsl.g:252:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalErDsl.g:252:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalErDsl.g:253:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalErDsl.g:259:1: ruleEntity returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? ) ;
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
            // InternalErDsl.g:265:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? ) )
            // InternalErDsl.g:266:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? )
            {
            // InternalErDsl.g:266:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? )
            // InternalErDsl.g:267:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )?
            {
            // InternalErDsl.g:267:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalErDsl.g:268:4: (lv_name_0_0= RULE_ID )
            {
            // InternalErDsl.g:268:4: (lv_name_0_0= RULE_ID )
            // InternalErDsl.g:269:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalErDsl.g:285:3: (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalErDsl.g:286:4: otherlv_1= 'is' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getIsKeyword_1_0());
            	    			
            	    // InternalErDsl.g:290:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalErDsl.g:291:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalErDsl.g:291:5: (otherlv_2= RULE_ID )
            	    // InternalErDsl.g:292:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEntityRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getIsEntityCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalErDsl.g:304:3: (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalErDsl.g:305:4: otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalErDsl.g:309:4: ( (lv_attributes_4_0= ruleAttribute ) )
                    // InternalErDsl.g:310:5: (lv_attributes_4_0= ruleAttribute )
                    {
                    // InternalErDsl.g:310:5: (lv_attributes_4_0= ruleAttribute )
                    // InternalErDsl.g:311:6: lv_attributes_4_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    // InternalErDsl.g:328:4: (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==19) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalErDsl.g:329:5: otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) )
                    	    {
                    	    otherlv_5=(Token)match(input,19,FOLLOW_5); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalErDsl.g:333:5: ( (lv_attributes_6_0= ruleAttribute ) )
                    	    // InternalErDsl.g:334:6: (lv_attributes_6_0= ruleAttribute )
                    	    {
                    	    // InternalErDsl.g:334:6: (lv_attributes_6_0= ruleAttribute )
                    	    // InternalErDsl.g:335:7: lv_attributes_6_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
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

                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

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
    // InternalErDsl.g:362:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalErDsl.g:362:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalErDsl.g:363:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalErDsl.g:369:1: ruleRelation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )* ) ;
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
            // InternalErDsl.g:375:2: ( ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )* ) )
            // InternalErDsl.g:376:2: ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )* )
            {
            // InternalErDsl.g:376:2: ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )* )
            // InternalErDsl.g:377:3: ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )*
            {
            // InternalErDsl.g:377:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalErDsl.g:378:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalErDsl.g:378:4: (lv_name_0_0= RULE_ID )
                    // InternalErDsl.g:379:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            // InternalErDsl.g:395:3: (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' )
            // InternalErDsl.g:396:4: otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']'
            {
            otherlv_1=(Token)match(input,21,FOLLOW_13); 

            				newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_1_0());
            			
            // InternalErDsl.g:400:4: ( (lv_leftEnding_2_0= ruleRelationSide ) )
            // InternalErDsl.g:401:5: (lv_leftEnding_2_0= ruleRelationSide )
            {
            // InternalErDsl.g:401:5: (lv_leftEnding_2_0= ruleRelationSide )
            // InternalErDsl.g:402:6: lv_leftEnding_2_0= ruleRelationSide
            {

            						newCompositeNode(grammarAccess.getRelationAccess().getLeftEndingRelationSideParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,22,FOLLOW_13); 

            				newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getRelatesKeyword_1_2());
            			
            // InternalErDsl.g:423:4: ( (lv_rightEnding_4_0= ruleRelationSide ) )
            // InternalErDsl.g:424:5: (lv_rightEnding_4_0= ruleRelationSide )
            {
            // InternalErDsl.g:424:5: (lv_rightEnding_4_0= ruleRelationSide )
            // InternalErDsl.g:425:6: lv_rightEnding_4_0= ruleRelationSide
            {

            						newCompositeNode(grammarAccess.getRelationAccess().getRightEndingRelationSideParserRuleCall_1_3_0());
            					
            pushFollow(FOLLOW_15);
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

            otherlv_5=(Token)match(input,23,FOLLOW_16); 

            				newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getRightSquareBracketKeyword_1_4());
            			

            }

            // InternalErDsl.g:447:3: (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalErDsl.g:448:4: otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}'
            	    {
            	    otherlv_6=(Token)match(input,18,FOLLOW_5); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2_0());
            	    			
            	    // InternalErDsl.g:452:4: ( (lv_attributes_7_0= ruleAttribute ) )
            	    // InternalErDsl.g:453:5: (lv_attributes_7_0= ruleAttribute )
            	    {
            	    // InternalErDsl.g:453:5: (lv_attributes_7_0= ruleAttribute )
            	    // InternalErDsl.g:454:6: lv_attributes_7_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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

            	    // InternalErDsl.g:471:4: (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==19) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalErDsl.g:472:5: otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,19,FOLLOW_5); 

            	    	    					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getCommaKeyword_2_2_0());
            	    	    				
            	    	    // InternalErDsl.g:476:5: ( (lv_attributes_9_0= ruleAttribute ) )
            	    	    // InternalErDsl.g:477:6: (lv_attributes_9_0= ruleAttribute )
            	    	    {
            	    	    // InternalErDsl.g:477:6: (lv_attributes_9_0= ruleAttribute )
            	    	    // InternalErDsl.g:478:7: lv_attributes_9_0= ruleAttribute
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_2_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_11);
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

            	    otherlv_10=(Token)match(input,20,FOLLOW_16); 

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
    // InternalErDsl.g:505:1: entryRuleRelationSide returns [EObject current=null] : iv_ruleRelationSide= ruleRelationSide EOF ;
    public final EObject entryRuleRelationSide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationSide = null;


        try {
            // InternalErDsl.g:505:53: (iv_ruleRelationSide= ruleRelationSide EOF )
            // InternalErDsl.g:506:2: iv_ruleRelationSide= ruleRelationSide EOF
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
    // InternalErDsl.g:512:1: ruleRelationSide returns [EObject current=null] : ( ( ( ( (lv_Cardinality_0_1= '(0:1)' | lv_Cardinality_0_2= '(1:1)' | lv_Cardinality_0_3= '(0:N)' | lv_Cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRelationSide() throws RecognitionException {
        EObject current = null;

        Token lv_Cardinality_0_1=null;
        Token lv_Cardinality_0_2=null;
        Token lv_Cardinality_0_3=null;
        Token lv_Cardinality_0_4=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalErDsl.g:518:2: ( ( ( ( ( (lv_Cardinality_0_1= '(0:1)' | lv_Cardinality_0_2= '(1:1)' | lv_Cardinality_0_3= '(0:N)' | lv_Cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalErDsl.g:519:2: ( ( ( ( (lv_Cardinality_0_1= '(0:1)' | lv_Cardinality_0_2= '(1:1)' | lv_Cardinality_0_3= '(0:N)' | lv_Cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalErDsl.g:519:2: ( ( ( ( (lv_Cardinality_0_1= '(0:1)' | lv_Cardinality_0_2= '(1:1)' | lv_Cardinality_0_3= '(0:N)' | lv_Cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=24 && LA11_0<=27)) ) {
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
                    // InternalErDsl.g:520:3: ( ( ( (lv_Cardinality_0_1= '(0:1)' | lv_Cardinality_0_2= '(1:1)' | lv_Cardinality_0_3= '(0:N)' | lv_Cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalErDsl.g:520:3: ( ( ( (lv_Cardinality_0_1= '(0:1)' | lv_Cardinality_0_2= '(1:1)' | lv_Cardinality_0_3= '(0:N)' | lv_Cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) ) )
                    // InternalErDsl.g:521:4: ( ( (lv_Cardinality_0_1= '(0:1)' | lv_Cardinality_0_2= '(1:1)' | lv_Cardinality_0_3= '(0:N)' | lv_Cardinality_0_4= '(1:N)' ) ) ) ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalErDsl.g:521:4: ( ( (lv_Cardinality_0_1= '(0:1)' | lv_Cardinality_0_2= '(1:1)' | lv_Cardinality_0_3= '(0:N)' | lv_Cardinality_0_4= '(1:N)' ) ) )
                    // InternalErDsl.g:522:5: ( (lv_Cardinality_0_1= '(0:1)' | lv_Cardinality_0_2= '(1:1)' | lv_Cardinality_0_3= '(0:N)' | lv_Cardinality_0_4= '(1:N)' ) )
                    {
                    // InternalErDsl.g:522:5: ( (lv_Cardinality_0_1= '(0:1)' | lv_Cardinality_0_2= '(1:1)' | lv_Cardinality_0_3= '(0:N)' | lv_Cardinality_0_4= '(1:N)' ) )
                    // InternalErDsl.g:523:6: (lv_Cardinality_0_1= '(0:1)' | lv_Cardinality_0_2= '(1:1)' | lv_Cardinality_0_3= '(0:N)' | lv_Cardinality_0_4= '(1:N)' )
                    {
                    // InternalErDsl.g:523:6: (lv_Cardinality_0_1= '(0:1)' | lv_Cardinality_0_2= '(1:1)' | lv_Cardinality_0_3= '(0:N)' | lv_Cardinality_0_4= '(1:N)' )
                    int alt10=4;
                    switch ( input.LA(1) ) {
                    case 24:
                        {
                        alt10=1;
                        }
                        break;
                    case 25:
                        {
                        alt10=2;
                        }
                        break;
                    case 26:
                        {
                        alt10=3;
                        }
                        break;
                    case 27:
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
                            // InternalErDsl.g:524:7: lv_Cardinality_0_1= '(0:1)'
                            {
                            lv_Cardinality_0_1=(Token)match(input,24,FOLLOW_5); 

                            							newLeafNode(lv_Cardinality_0_1, grammarAccess.getRelationSideAccess().getCardinality01Keyword_0_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRule());
                            							}
                            							setWithLastConsumed(current, "Cardinality", lv_Cardinality_0_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalErDsl.g:535:7: lv_Cardinality_0_2= '(1:1)'
                            {
                            lv_Cardinality_0_2=(Token)match(input,25,FOLLOW_5); 

                            							newLeafNode(lv_Cardinality_0_2, grammarAccess.getRelationSideAccess().getCardinality11Keyword_0_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRule());
                            							}
                            							setWithLastConsumed(current, "Cardinality", lv_Cardinality_0_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalErDsl.g:546:7: lv_Cardinality_0_3= '(0:N)'
                            {
                            lv_Cardinality_0_3=(Token)match(input,26,FOLLOW_5); 

                            							newLeafNode(lv_Cardinality_0_3, grammarAccess.getRelationSideAccess().getCardinality0NKeyword_0_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRule());
                            							}
                            							setWithLastConsumed(current, "Cardinality", lv_Cardinality_0_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalErDsl.g:557:7: lv_Cardinality_0_4= '(1:N)'
                            {
                            lv_Cardinality_0_4=(Token)match(input,27,FOLLOW_5); 

                            							newLeafNode(lv_Cardinality_0_4, grammarAccess.getRelationSideAccess().getCardinality1NKeyword_0_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRule());
                            							}
                            							setWithLastConsumed(current, "Cardinality", lv_Cardinality_0_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalErDsl.g:570:4: ( (otherlv_1= RULE_ID ) )
                    // InternalErDsl.g:571:5: (otherlv_1= RULE_ID )
                    {
                    // InternalErDsl.g:571:5: (otherlv_1= RULE_ID )
                    // InternalErDsl.g:572:6: otherlv_1= RULE_ID
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
                    // InternalErDsl.g:585:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalErDsl.g:585:3: ( (otherlv_2= RULE_ID ) )
                    // InternalErDsl.g:586:4: (otherlv_2= RULE_ID )
                    {
                    // InternalErDsl.g:586:4: (otherlv_2= RULE_ID )
                    // InternalErDsl.g:587:5: otherlv_2= RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000202010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000F000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});

}