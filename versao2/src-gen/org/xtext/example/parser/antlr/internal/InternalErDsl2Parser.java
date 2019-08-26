package org.xtext.example.parser.antlr.internal;

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
import org.xtext.example.services.ErDsl2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalErDsl2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Entities{'", "'}'", "'Relationships{'", "'Domain'", "'*'", "'is'", "'{'", "','", "'['", "'relates'", "']'", "'(0,1)'", "'(1,1)'", "'(0,N)'", "'(1,N)'", "'int'", "'double'", "'money'", "'string'", "'boolean'", "'datetime'", "'file'"
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


        public InternalErDsl2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalErDsl2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalErDsl2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalErDsl2.g"; }



     	private ErDsl2GrammarAccess grammarAccess;

        public InternalErDsl2Parser(TokenStream input, ErDsl2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ERModel";
       	}

       	@Override
       	protected ErDsl2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleERModel"
    // InternalErDsl2.g:65:1: entryRuleERModel returns [EObject current=null] : iv_ruleERModel= ruleERModel EOF ;
    public final EObject entryRuleERModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERModel = null;


        try {
            // InternalErDsl2.g:65:48: (iv_ruleERModel= ruleERModel EOF )
            // InternalErDsl2.g:66:2: iv_ruleERModel= ruleERModel EOF
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
    // InternalErDsl2.g:72:1: ruleERModel returns [EObject current=null] : ( ( (lv_domain_0_0= ruleDomain ) ) otherlv_1= 'Entities{' ( (lv_entities_2_0= ruleEntity ) )+ otherlv_3= '}' otherlv_4= 'Relationships{' ( (lv_relations_5_0= ruleRelation ) )* otherlv_6= '}' ) ;
    public final EObject ruleERModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_domain_0_0 = null;

        EObject lv_entities_2_0 = null;

        EObject lv_relations_5_0 = null;



        	enterRule();

        try {
            // InternalErDsl2.g:78:2: ( ( ( (lv_domain_0_0= ruleDomain ) ) otherlv_1= 'Entities{' ( (lv_entities_2_0= ruleEntity ) )+ otherlv_3= '}' otherlv_4= 'Relationships{' ( (lv_relations_5_0= ruleRelation ) )* otherlv_6= '}' ) )
            // InternalErDsl2.g:79:2: ( ( (lv_domain_0_0= ruleDomain ) ) otherlv_1= 'Entities{' ( (lv_entities_2_0= ruleEntity ) )+ otherlv_3= '}' otherlv_4= 'Relationships{' ( (lv_relations_5_0= ruleRelation ) )* otherlv_6= '}' )
            {
            // InternalErDsl2.g:79:2: ( ( (lv_domain_0_0= ruleDomain ) ) otherlv_1= 'Entities{' ( (lv_entities_2_0= ruleEntity ) )+ otherlv_3= '}' otherlv_4= 'Relationships{' ( (lv_relations_5_0= ruleRelation ) )* otherlv_6= '}' )
            // InternalErDsl2.g:80:3: ( (lv_domain_0_0= ruleDomain ) ) otherlv_1= 'Entities{' ( (lv_entities_2_0= ruleEntity ) )+ otherlv_3= '}' otherlv_4= 'Relationships{' ( (lv_relations_5_0= ruleRelation ) )* otherlv_6= '}'
            {
            // InternalErDsl2.g:80:3: ( (lv_domain_0_0= ruleDomain ) )
            // InternalErDsl2.g:81:4: (lv_domain_0_0= ruleDomain )
            {
            // InternalErDsl2.g:81:4: (lv_domain_0_0= ruleDomain )
            // InternalErDsl2.g:82:5: lv_domain_0_0= ruleDomain
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
            						"org.xtext.example.ErDsl2.Domain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getERModelAccess().getEntitiesKeyword_1());
            		
            // InternalErDsl2.g:103:3: ( (lv_entities_2_0= ruleEntity ) )+
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
            	    // InternalErDsl2.g:104:4: (lv_entities_2_0= ruleEntity )
            	    {
            	    // InternalErDsl2.g:104:4: (lv_entities_2_0= ruleEntity )
            	    // InternalErDsl2.g:105:5: lv_entities_2_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_entities_2_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_2_0,
            	    						"org.xtext.example.ErDsl2.Entity");
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

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getERModelAccess().getRelationshipsKeyword_4());
            		
            // InternalErDsl2.g:130:3: ( (lv_relations_5_0= ruleRelation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalErDsl2.g:131:4: (lv_relations_5_0= ruleRelation )
            	    {
            	    // InternalErDsl2.g:131:4: (lv_relations_5_0= ruleRelation )
            	    // InternalErDsl2.g:132:5: lv_relations_5_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getERModelAccess().getRelationsRelationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_relations_5_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_5_0,
            	    						"org.xtext.example.ErDsl2.Relation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalErDsl2.g:157:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalErDsl2.g:157:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalErDsl2.g:158:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalErDsl2.g:164:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalErDsl2.g:170:2: ( (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalErDsl2.g:171:2: (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalErDsl2.g:171:2: (otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalErDsl2.g:172:3: otherlv_0= 'Domain' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainKeyword_0());
            		
            // InternalErDsl2.g:176:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalErDsl2.g:177:4: (lv_name_1_0= RULE_ID )
            {
            // InternalErDsl2.g:177:4: (lv_name_1_0= RULE_ID )
            // InternalErDsl2.g:178:5: lv_name_1_0= RULE_ID
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
    // InternalErDsl2.g:198:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalErDsl2.g:198:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalErDsl2.g:199:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalErDsl2.g:205:1: ruleAttribute returns [EObject current=null] : ( ( (lv_isKey_0_0= '*' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleDataType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_isKey_0_0=null;
        Token lv_name_1_0=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalErDsl2.g:211:2: ( ( ( (lv_isKey_0_0= '*' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleDataType ) ) ) )
            // InternalErDsl2.g:212:2: ( ( (lv_isKey_0_0= '*' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleDataType ) ) )
            {
            // InternalErDsl2.g:212:2: ( ( (lv_isKey_0_0= '*' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleDataType ) ) )
            // InternalErDsl2.g:213:3: ( (lv_isKey_0_0= '*' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleDataType ) )
            {
            // InternalErDsl2.g:213:3: ( (lv_isKey_0_0= '*' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalErDsl2.g:214:4: (lv_isKey_0_0= '*' )
                    {
                    // InternalErDsl2.g:214:4: (lv_isKey_0_0= '*' )
                    // InternalErDsl2.g:215:5: lv_isKey_0_0= '*'
                    {
                    lv_isKey_0_0=(Token)match(input,15,FOLLOW_4); 

                    					newLeafNode(lv_isKey_0_0, grammarAccess.getAttributeAccess().getIsKeyAsteriskKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "isKey", true, "*");
                    				

                    }


                    }
                    break;

            }

            // InternalErDsl2.g:227:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalErDsl2.g:228:4: (lv_name_1_0= RULE_ID )
            {
            // InternalErDsl2.g:228:4: (lv_name_1_0= RULE_ID )
            // InternalErDsl2.g:229:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalErDsl2.g:245:3: ( (lv_type_2_0= ruleDataType ) )
            // InternalErDsl2.g:246:4: (lv_type_2_0= ruleDataType )
            {
            // InternalErDsl2.g:246:4: (lv_type_2_0= ruleDataType )
            // InternalErDsl2.g:247:5: lv_type_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.ErDsl2.DataType");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEntity"
    // InternalErDsl2.g:268:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalErDsl2.g:268:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalErDsl2.g:269:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalErDsl2.g:275:1: ruleEntity returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? ) ;
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
            // InternalErDsl2.g:281:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? ) )
            // InternalErDsl2.g:282:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? )
            {
            // InternalErDsl2.g:282:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )? )
            // InternalErDsl2.g:283:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )* (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )?
            {
            // InternalErDsl2.g:283:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalErDsl2.g:284:4: (lv_name_0_0= RULE_ID )
            {
            // InternalErDsl2.g:284:4: (lv_name_0_0= RULE_ID )
            // InternalErDsl2.g:285:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            // InternalErDsl2.g:301:3: (otherlv_1= 'is' ( (otherlv_2= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalErDsl2.g:302:4: otherlv_1= 'is' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getIsKeyword_1_0());
            	    			
            	    // InternalErDsl2.g:306:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalErDsl2.g:307:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalErDsl2.g:307:5: (otherlv_2= RULE_ID )
            	    // InternalErDsl2.g:308:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEntityRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getIsAEntityCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalErDsl2.g:320:3: (otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalErDsl2.g:321:4: otherlv_3= '{' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalErDsl2.g:325:4: ( (lv_attributes_4_0= ruleAttribute ) )
                    // InternalErDsl2.g:326:5: (lv_attributes_4_0= ruleAttribute )
                    {
                    // InternalErDsl2.g:326:5: (lv_attributes_4_0= ruleAttribute )
                    // InternalErDsl2.g:327:6: lv_attributes_4_0= ruleAttribute
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
                    							"org.xtext.example.ErDsl2.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalErDsl2.g:344:4: (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalErDsl2.g:345:5: otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalErDsl2.g:349:5: ( (lv_attributes_6_0= ruleAttribute ) )
                    	    // InternalErDsl2.g:350:6: (lv_attributes_6_0= ruleAttribute )
                    	    {
                    	    // InternalErDsl2.g:350:6: (lv_attributes_6_0= ruleAttribute )
                    	    // InternalErDsl2.g:351:7: lv_attributes_6_0= ruleAttribute
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
                    	    								"org.xtext.example.ErDsl2.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,12,FOLLOW_2); 

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
    // InternalErDsl2.g:378:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalErDsl2.g:378:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalErDsl2.g:379:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalErDsl2.g:385:1: ruleRelation returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )* ) ;
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
            // InternalErDsl2.g:391:2: ( ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )* ) )
            // InternalErDsl2.g:392:2: ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )* )
            {
            // InternalErDsl2.g:392:2: ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )* )
            // InternalErDsl2.g:393:3: ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' ) (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )*
            {
            // InternalErDsl2.g:393:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalErDsl2.g:394:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalErDsl2.g:394:4: (lv_name_0_0= RULE_ID )
                    // InternalErDsl2.g:395:5: lv_name_0_0= RULE_ID
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

            // InternalErDsl2.g:411:3: (otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']' )
            // InternalErDsl2.g:412:4: otherlv_1= '[' ( (lv_leftEnding_2_0= ruleRelationSide ) ) otherlv_3= 'relates' ( (lv_rightEnding_4_0= ruleRelationSide ) ) otherlv_5= ']'
            {
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            				newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_1_0());
            			
            // InternalErDsl2.g:416:4: ( (lv_leftEnding_2_0= ruleRelationSide ) )
            // InternalErDsl2.g:417:5: (lv_leftEnding_2_0= ruleRelationSide )
            {
            // InternalErDsl2.g:417:5: (lv_leftEnding_2_0= ruleRelationSide )
            // InternalErDsl2.g:418:6: lv_leftEnding_2_0= ruleRelationSide
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
            							"org.xtext.example.ErDsl2.RelationSide");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_13); 

            				newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getRelatesKeyword_1_2());
            			
            // InternalErDsl2.g:439:4: ( (lv_rightEnding_4_0= ruleRelationSide ) )
            // InternalErDsl2.g:440:5: (lv_rightEnding_4_0= ruleRelationSide )
            {
            // InternalErDsl2.g:440:5: (lv_rightEnding_4_0= ruleRelationSide )
            // InternalErDsl2.g:441:6: lv_rightEnding_4_0= ruleRelationSide
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
            							"org.xtext.example.ErDsl2.RelationSide");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_16); 

            				newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getRightSquareBracketKeyword_1_4());
            			

            }

            // InternalErDsl2.g:463:3: (otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalErDsl2.g:464:4: otherlv_6= '{' ( (lv_attributes_7_0= ruleAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )* otherlv_10= '}'
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_10); 

            	    				newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2_0());
            	    			
            	    // InternalErDsl2.g:468:4: ( (lv_attributes_7_0= ruleAttribute ) )
            	    // InternalErDsl2.g:469:5: (lv_attributes_7_0= ruleAttribute )
            	    {
            	    // InternalErDsl2.g:469:5: (lv_attributes_7_0= ruleAttribute )
            	    // InternalErDsl2.g:470:6: lv_attributes_7_0= ruleAttribute
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
            	    							"org.xtext.example.ErDsl2.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalErDsl2.g:487:4: (otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==18) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalErDsl2.g:488:5: otherlv_8= ',' ( (lv_attributes_9_0= ruleAttribute ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,18,FOLLOW_10); 

            	    	    					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getCommaKeyword_2_2_0());
            	    	    				
            	    	    // InternalErDsl2.g:492:5: ( (lv_attributes_9_0= ruleAttribute ) )
            	    	    // InternalErDsl2.g:493:6: (lv_attributes_9_0= ruleAttribute )
            	    	    {
            	    	    // InternalErDsl2.g:493:6: (lv_attributes_9_0= ruleAttribute )
            	    	    // InternalErDsl2.g:494:7: lv_attributes_9_0= ruleAttribute
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
            	    	    								"org.xtext.example.ErDsl2.Attribute");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    otherlv_10=(Token)match(input,12,FOLLOW_16); 

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
    // InternalErDsl2.g:521:1: entryRuleRelationSide returns [EObject current=null] : iv_ruleRelationSide= ruleRelationSide EOF ;
    public final EObject entryRuleRelationSide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationSide = null;


        try {
            // InternalErDsl2.g:521:53: (iv_ruleRelationSide= ruleRelationSide EOF )
            // InternalErDsl2.g:522:2: iv_ruleRelationSide= ruleRelationSide EOF
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
    // InternalErDsl2.g:528:1: ruleRelationSide returns [EObject current=null] : ( ( ( ( (lv_Cardinality_0_1= '(0,1)' | lv_Cardinality_0_2= '(1,1)' | lv_Cardinality_0_3= '(0,N)' | lv_Cardinality_0_4= '(1,N)' ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
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
            // InternalErDsl2.g:534:2: ( ( ( ( ( (lv_Cardinality_0_1= '(0,1)' | lv_Cardinality_0_2= '(1,1)' | lv_Cardinality_0_3= '(0,N)' | lv_Cardinality_0_4= '(1,N)' ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalErDsl2.g:535:2: ( ( ( ( (lv_Cardinality_0_1= '(0,1)' | lv_Cardinality_0_2= '(1,1)' | lv_Cardinality_0_3= '(0,N)' | lv_Cardinality_0_4= '(1,N)' ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalErDsl2.g:535:2: ( ( ( ( (lv_Cardinality_0_1= '(0,1)' | lv_Cardinality_0_2= '(1,1)' | lv_Cardinality_0_3= '(0,N)' | lv_Cardinality_0_4= '(1,N)' ) ) ) ( (otherlv_1= RULE_ID ) ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=22 && LA11_0<=25)) ) {
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
                    // InternalErDsl2.g:536:3: ( ( ( (lv_Cardinality_0_1= '(0,1)' | lv_Cardinality_0_2= '(1,1)' | lv_Cardinality_0_3= '(0,N)' | lv_Cardinality_0_4= '(1,N)' ) ) ) ( (otherlv_1= RULE_ID ) ) )
                    {
                    // InternalErDsl2.g:536:3: ( ( ( (lv_Cardinality_0_1= '(0,1)' | lv_Cardinality_0_2= '(1,1)' | lv_Cardinality_0_3= '(0,N)' | lv_Cardinality_0_4= '(1,N)' ) ) ) ( (otherlv_1= RULE_ID ) ) )
                    // InternalErDsl2.g:537:4: ( ( (lv_Cardinality_0_1= '(0,1)' | lv_Cardinality_0_2= '(1,1)' | lv_Cardinality_0_3= '(0,N)' | lv_Cardinality_0_4= '(1,N)' ) ) ) ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalErDsl2.g:537:4: ( ( (lv_Cardinality_0_1= '(0,1)' | lv_Cardinality_0_2= '(1,1)' | lv_Cardinality_0_3= '(0,N)' | lv_Cardinality_0_4= '(1,N)' ) ) )
                    // InternalErDsl2.g:538:5: ( (lv_Cardinality_0_1= '(0,1)' | lv_Cardinality_0_2= '(1,1)' | lv_Cardinality_0_3= '(0,N)' | lv_Cardinality_0_4= '(1,N)' ) )
                    {
                    // InternalErDsl2.g:538:5: ( (lv_Cardinality_0_1= '(0,1)' | lv_Cardinality_0_2= '(1,1)' | lv_Cardinality_0_3= '(0,N)' | lv_Cardinality_0_4= '(1,N)' ) )
                    // InternalErDsl2.g:539:6: (lv_Cardinality_0_1= '(0,1)' | lv_Cardinality_0_2= '(1,1)' | lv_Cardinality_0_3= '(0,N)' | lv_Cardinality_0_4= '(1,N)' )
                    {
                    // InternalErDsl2.g:539:6: (lv_Cardinality_0_1= '(0,1)' | lv_Cardinality_0_2= '(1,1)' | lv_Cardinality_0_3= '(0,N)' | lv_Cardinality_0_4= '(1,N)' )
                    int alt10=4;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt10=1;
                        }
                        break;
                    case 23:
                        {
                        alt10=2;
                        }
                        break;
                    case 24:
                        {
                        alt10=3;
                        }
                        break;
                    case 25:
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
                            // InternalErDsl2.g:540:7: lv_Cardinality_0_1= '(0,1)'
                            {
                            lv_Cardinality_0_1=(Token)match(input,22,FOLLOW_4); 

                            							newLeafNode(lv_Cardinality_0_1, grammarAccess.getRelationSideAccess().getCardinality01Keyword_0_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRule());
                            							}
                            							setWithLastConsumed(current, "Cardinality", lv_Cardinality_0_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalErDsl2.g:551:7: lv_Cardinality_0_2= '(1,1)'
                            {
                            lv_Cardinality_0_2=(Token)match(input,23,FOLLOW_4); 

                            							newLeafNode(lv_Cardinality_0_2, grammarAccess.getRelationSideAccess().getCardinality11Keyword_0_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRule());
                            							}
                            							setWithLastConsumed(current, "Cardinality", lv_Cardinality_0_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalErDsl2.g:562:7: lv_Cardinality_0_3= '(0,N)'
                            {
                            lv_Cardinality_0_3=(Token)match(input,24,FOLLOW_4); 

                            							newLeafNode(lv_Cardinality_0_3, grammarAccess.getRelationSideAccess().getCardinality0NKeyword_0_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationSideRule());
                            							}
                            							setWithLastConsumed(current, "Cardinality", lv_Cardinality_0_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalErDsl2.g:573:7: lv_Cardinality_0_4= '(1,N)'
                            {
                            lv_Cardinality_0_4=(Token)match(input,25,FOLLOW_4); 

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

                    // InternalErDsl2.g:586:4: ( (otherlv_1= RULE_ID ) )
                    // InternalErDsl2.g:587:5: (otherlv_1= RULE_ID )
                    {
                    // InternalErDsl2.g:587:5: (otherlv_1= RULE_ID )
                    // InternalErDsl2.g:588:6: otherlv_1= RULE_ID
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
                    // InternalErDsl2.g:601:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalErDsl2.g:601:3: ( (otherlv_2= RULE_ID ) )
                    // InternalErDsl2.g:602:4: (otherlv_2= RULE_ID )
                    {
                    // InternalErDsl2.g:602:4: (otherlv_2= RULE_ID )
                    // InternalErDsl2.g:603:5: otherlv_2= RULE_ID
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
    // InternalErDsl2.g:618:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'money' ) | (enumLiteral_3= 'string' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'datetime' ) | (enumLiteral_6= 'file' ) ) ;
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
            // InternalErDsl2.g:624:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'money' ) | (enumLiteral_3= 'string' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'datetime' ) | (enumLiteral_6= 'file' ) ) )
            // InternalErDsl2.g:625:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'money' ) | (enumLiteral_3= 'string' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'datetime' ) | (enumLiteral_6= 'file' ) )
            {
            // InternalErDsl2.g:625:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'money' ) | (enumLiteral_3= 'string' ) | (enumLiteral_4= 'boolean' ) | (enumLiteral_5= 'datetime' ) | (enumLiteral_6= 'file' ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            case 29:
                {
                alt12=4;
                }
                break;
            case 30:
                {
                alt12=5;
                }
                break;
            case 31:
                {
                alt12=6;
                }
                break;
            case 32:
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
                    // InternalErDsl2.g:626:3: (enumLiteral_0= 'int' )
                    {
                    // InternalErDsl2.g:626:3: (enumLiteral_0= 'int' )
                    // InternalErDsl2.g:627:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl2.g:634:3: (enumLiteral_1= 'double' )
                    {
                    // InternalErDsl2.g:634:3: (enumLiteral_1= 'double' )
                    // InternalErDsl2.g:635:4: enumLiteral_1= 'double'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl2.g:642:3: (enumLiteral_2= 'money' )
                    {
                    // InternalErDsl2.g:642:3: (enumLiteral_2= 'money' )
                    // InternalErDsl2.g:643:4: enumLiteral_2= 'money'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl2.g:650:3: (enumLiteral_3= 'string' )
                    {
                    // InternalErDsl2.g:650:3: (enumLiteral_3= 'string' )
                    // InternalErDsl2.g:651:4: enumLiteral_3= 'string'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalErDsl2.g:658:3: (enumLiteral_4= 'boolean' )
                    {
                    // InternalErDsl2.g:658:3: (enumLiteral_4= 'boolean' )
                    // InternalErDsl2.g:659:4: enumLiteral_4= 'boolean'
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalErDsl2.g:666:3: (enumLiteral_5= 'datetime' )
                    {
                    // InternalErDsl2.g:666:3: (enumLiteral_5= 'datetime' )
                    // InternalErDsl2.g:667:4: enumLiteral_5= 'datetime'
                    {
                    enumLiteral_5=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalErDsl2.g:674:3: (enumLiteral_6= 'file' )
                    {
                    // InternalErDsl2.g:674:3: (enumLiteral_6= 'file' )
                    // InternalErDsl2.g:675:4: enumLiteral_6= 'file'
                    {
                    enumLiteral_6=(Token)match(input,32,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000081010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000001FC000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003C00010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020002L});

}