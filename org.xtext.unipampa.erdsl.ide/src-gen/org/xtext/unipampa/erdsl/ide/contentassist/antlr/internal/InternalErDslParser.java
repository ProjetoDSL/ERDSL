package org.xtext.unipampa.erdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.unipampa.erdsl.services.ErDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalErDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'(0:1)'", "'(1:1)'", "'(0:N)'", "'(1:N)'", "';'", "'Entities{'", "'};'", "'Relationships{'", "'Domain'", "'is'", "'{'", "'}'", "','", "'['", "'relates'", "']'", "'isIdentifier'"
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

    	public void setGrammarAccess(ErDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleERModel"
    // InternalErDsl.g:53:1: entryRuleERModel : ruleERModel EOF ;
    public final void entryRuleERModel() throws RecognitionException {
        try {
            // InternalErDsl.g:54:1: ( ruleERModel EOF )
            // InternalErDsl.g:55:1: ruleERModel EOF
            {
             before(grammarAccess.getERModelRule()); 
            pushFollow(FOLLOW_1);
            ruleERModel();

            state._fsp--;

             after(grammarAccess.getERModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleERModel"


    // $ANTLR start "ruleERModel"
    // InternalErDsl.g:62:1: ruleERModel : ( ( rule__ERModel__Group__0 ) ) ;
    public final void ruleERModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:66:2: ( ( ( rule__ERModel__Group__0 ) ) )
            // InternalErDsl.g:67:2: ( ( rule__ERModel__Group__0 ) )
            {
            // InternalErDsl.g:67:2: ( ( rule__ERModel__Group__0 ) )
            // InternalErDsl.g:68:3: ( rule__ERModel__Group__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup()); 
            // InternalErDsl.g:69:3: ( rule__ERModel__Group__0 )
            // InternalErDsl.g:69:4: rule__ERModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleERModel"


    // $ANTLR start "entryRuleDomain"
    // InternalErDsl.g:78:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalErDsl.g:79:1: ( ruleDomain EOF )
            // InternalErDsl.g:80:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalErDsl.g:87:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:91:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalErDsl.g:92:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalErDsl.g:92:2: ( ( rule__Domain__Group__0 ) )
            // InternalErDsl.g:93:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalErDsl.g:94:3: ( rule__Domain__Group__0 )
            // InternalErDsl.g:94:4: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleAttribute"
    // InternalErDsl.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalErDsl.g:104:1: ( ruleAttribute EOF )
            // InternalErDsl.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalErDsl.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalErDsl.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalErDsl.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalErDsl.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalErDsl.g:119:3: ( rule__Attribute__Group__0 )
            // InternalErDsl.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEntity"
    // InternalErDsl.g:128:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalErDsl.g:129:1: ( ruleEntity EOF )
            // InternalErDsl.g:130:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalErDsl.g:137:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:141:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalErDsl.g:142:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalErDsl.g:142:2: ( ( rule__Entity__Group__0 ) )
            // InternalErDsl.g:143:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalErDsl.g:144:3: ( rule__Entity__Group__0 )
            // InternalErDsl.g:144:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRelation"
    // InternalErDsl.g:153:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalErDsl.g:154:1: ( ruleRelation EOF )
            // InternalErDsl.g:155:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalErDsl.g:162:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:166:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalErDsl.g:167:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalErDsl.g:167:2: ( ( rule__Relation__Group__0 ) )
            // InternalErDsl.g:168:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalErDsl.g:169:3: ( rule__Relation__Group__0 )
            // InternalErDsl.g:169:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleRelationSide"
    // InternalErDsl.g:178:1: entryRuleRelationSide : ruleRelationSide EOF ;
    public final void entryRuleRelationSide() throws RecognitionException {
        try {
            // InternalErDsl.g:179:1: ( ruleRelationSide EOF )
            // InternalErDsl.g:180:1: ruleRelationSide EOF
            {
             before(grammarAccess.getRelationSideRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationSide();

            state._fsp--;

             after(grammarAccess.getRelationSideRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationSide"


    // $ANTLR start "ruleRelationSide"
    // InternalErDsl.g:187:1: ruleRelationSide : ( ( rule__RelationSide__Alternatives ) ) ;
    public final void ruleRelationSide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:191:2: ( ( ( rule__RelationSide__Alternatives ) ) )
            // InternalErDsl.g:192:2: ( ( rule__RelationSide__Alternatives ) )
            {
            // InternalErDsl.g:192:2: ( ( rule__RelationSide__Alternatives ) )
            // InternalErDsl.g:193:3: ( rule__RelationSide__Alternatives )
            {
             before(grammarAccess.getRelationSideAccess().getAlternatives()); 
            // InternalErDsl.g:194:3: ( rule__RelationSide__Alternatives )
            // InternalErDsl.g:194:4: rule__RelationSide__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationSide__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationSide"


    // $ANTLR start "rule__RelationSide__Alternatives"
    // InternalErDsl.g:202:1: rule__RelationSide__Alternatives : ( ( ( rule__RelationSide__Group_0__0 ) ) | ( ( rule__RelationSide__TargetAssignment_1 ) ) );
    public final void rule__RelationSide__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:206:1: ( ( ( rule__RelationSide__Group_0__0 ) ) | ( ( rule__RelationSide__TargetAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=14)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalErDsl.g:207:2: ( ( rule__RelationSide__Group_0__0 ) )
                    {
                    // InternalErDsl.g:207:2: ( ( rule__RelationSide__Group_0__0 ) )
                    // InternalErDsl.g:208:3: ( rule__RelationSide__Group_0__0 )
                    {
                     before(grammarAccess.getRelationSideAccess().getGroup_0()); 
                    // InternalErDsl.g:209:3: ( rule__RelationSide__Group_0__0 )
                    // InternalErDsl.g:209:4: rule__RelationSide__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationSide__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationSideAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:213:2: ( ( rule__RelationSide__TargetAssignment_1 ) )
                    {
                    // InternalErDsl.g:213:2: ( ( rule__RelationSide__TargetAssignment_1 ) )
                    // InternalErDsl.g:214:3: ( rule__RelationSide__TargetAssignment_1 )
                    {
                     before(grammarAccess.getRelationSideAccess().getTargetAssignment_1()); 
                    // InternalErDsl.g:215:3: ( rule__RelationSide__TargetAssignment_1 )
                    // InternalErDsl.g:215:4: rule__RelationSide__TargetAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationSide__TargetAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationSideAccess().getTargetAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSide__Alternatives"


    // $ANTLR start "rule__RelationSide__CardinalityAlternatives_0_0_0"
    // InternalErDsl.g:223:1: rule__RelationSide__CardinalityAlternatives_0_0_0 : ( ( '(0:1)' ) | ( '(1:1)' ) | ( '(0:N)' ) | ( '(1:N)' ) );
    public final void rule__RelationSide__CardinalityAlternatives_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:227:1: ( ( '(0:1)' ) | ( '(1:1)' ) | ( '(0:N)' ) | ( '(1:N)' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalErDsl.g:228:2: ( '(0:1)' )
                    {
                    // InternalErDsl.g:228:2: ( '(0:1)' )
                    // InternalErDsl.g:229:3: '(0:1)'
                    {
                     before(grammarAccess.getRelationSideAccess().getCardinality01Keyword_0_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getRelationSideAccess().getCardinality01Keyword_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:234:2: ( '(1:1)' )
                    {
                    // InternalErDsl.g:234:2: ( '(1:1)' )
                    // InternalErDsl.g:235:3: '(1:1)'
                    {
                     before(grammarAccess.getRelationSideAccess().getCardinality11Keyword_0_0_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getRelationSideAccess().getCardinality11Keyword_0_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl.g:240:2: ( '(0:N)' )
                    {
                    // InternalErDsl.g:240:2: ( '(0:N)' )
                    // InternalErDsl.g:241:3: '(0:N)'
                    {
                     before(grammarAccess.getRelationSideAccess().getCardinality0NKeyword_0_0_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRelationSideAccess().getCardinality0NKeyword_0_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl.g:246:2: ( '(1:N)' )
                    {
                    // InternalErDsl.g:246:2: ( '(1:N)' )
                    // InternalErDsl.g:247:3: '(1:N)'
                    {
                     before(grammarAccess.getRelationSideAccess().getCardinality1NKeyword_0_0_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRelationSideAccess().getCardinality1NKeyword_0_0_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSide__CardinalityAlternatives_0_0_0"


    // $ANTLR start "rule__ERModel__Group__0"
    // InternalErDsl.g:256:1: rule__ERModel__Group__0 : rule__ERModel__Group__0__Impl rule__ERModel__Group__1 ;
    public final void rule__ERModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:260:1: ( rule__ERModel__Group__0__Impl rule__ERModel__Group__1 )
            // InternalErDsl.g:261:2: rule__ERModel__Group__0__Impl rule__ERModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ERModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__0"


    // $ANTLR start "rule__ERModel__Group__0__Impl"
    // InternalErDsl.g:268:1: rule__ERModel__Group__0__Impl : ( ( rule__ERModel__DomainAssignment_0 ) ) ;
    public final void rule__ERModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:272:1: ( ( ( rule__ERModel__DomainAssignment_0 ) ) )
            // InternalErDsl.g:273:1: ( ( rule__ERModel__DomainAssignment_0 ) )
            {
            // InternalErDsl.g:273:1: ( ( rule__ERModel__DomainAssignment_0 ) )
            // InternalErDsl.g:274:2: ( rule__ERModel__DomainAssignment_0 )
            {
             before(grammarAccess.getERModelAccess().getDomainAssignment_0()); 
            // InternalErDsl.g:275:2: ( rule__ERModel__DomainAssignment_0 )
            // InternalErDsl.g:275:3: rule__ERModel__DomainAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__DomainAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getDomainAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__0__Impl"


    // $ANTLR start "rule__ERModel__Group__1"
    // InternalErDsl.g:283:1: rule__ERModel__Group__1 : rule__ERModel__Group__1__Impl rule__ERModel__Group__2 ;
    public final void rule__ERModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:287:1: ( rule__ERModel__Group__1__Impl rule__ERModel__Group__2 )
            // InternalErDsl.g:288:2: rule__ERModel__Group__1__Impl rule__ERModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ERModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__1"


    // $ANTLR start "rule__ERModel__Group__1__Impl"
    // InternalErDsl.g:295:1: rule__ERModel__Group__1__Impl : ( ';' ) ;
    public final void rule__ERModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:299:1: ( ( ';' ) )
            // InternalErDsl.g:300:1: ( ';' )
            {
            // InternalErDsl.g:300:1: ( ';' )
            // InternalErDsl.g:301:2: ';'
            {
             before(grammarAccess.getERModelAccess().getSemicolonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__1__Impl"


    // $ANTLR start "rule__ERModel__Group__2"
    // InternalErDsl.g:310:1: rule__ERModel__Group__2 : rule__ERModel__Group__2__Impl rule__ERModel__Group__3 ;
    public final void rule__ERModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:314:1: ( rule__ERModel__Group__2__Impl rule__ERModel__Group__3 )
            // InternalErDsl.g:315:2: rule__ERModel__Group__2__Impl rule__ERModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ERModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__2"


    // $ANTLR start "rule__ERModel__Group__2__Impl"
    // InternalErDsl.g:322:1: rule__ERModel__Group__2__Impl : ( 'Entities{' ) ;
    public final void rule__ERModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:326:1: ( ( 'Entities{' ) )
            // InternalErDsl.g:327:1: ( 'Entities{' )
            {
            // InternalErDsl.g:327:1: ( 'Entities{' )
            // InternalErDsl.g:328:2: 'Entities{'
            {
             before(grammarAccess.getERModelAccess().getEntitiesKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getEntitiesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__2__Impl"


    // $ANTLR start "rule__ERModel__Group__3"
    // InternalErDsl.g:337:1: rule__ERModel__Group__3 : rule__ERModel__Group__3__Impl rule__ERModel__Group__4 ;
    public final void rule__ERModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:341:1: ( rule__ERModel__Group__3__Impl rule__ERModel__Group__4 )
            // InternalErDsl.g:342:2: rule__ERModel__Group__3__Impl rule__ERModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ERModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__3"


    // $ANTLR start "rule__ERModel__Group__3__Impl"
    // InternalErDsl.g:349:1: rule__ERModel__Group__3__Impl : ( ( ( rule__ERModel__EntitiesAssignment_3 ) ) ( ( rule__ERModel__EntitiesAssignment_3 )* ) ) ;
    public final void rule__ERModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:353:1: ( ( ( ( rule__ERModel__EntitiesAssignment_3 ) ) ( ( rule__ERModel__EntitiesAssignment_3 )* ) ) )
            // InternalErDsl.g:354:1: ( ( ( rule__ERModel__EntitiesAssignment_3 ) ) ( ( rule__ERModel__EntitiesAssignment_3 )* ) )
            {
            // InternalErDsl.g:354:1: ( ( ( rule__ERModel__EntitiesAssignment_3 ) ) ( ( rule__ERModel__EntitiesAssignment_3 )* ) )
            // InternalErDsl.g:355:2: ( ( rule__ERModel__EntitiesAssignment_3 ) ) ( ( rule__ERModel__EntitiesAssignment_3 )* )
            {
            // InternalErDsl.g:355:2: ( ( rule__ERModel__EntitiesAssignment_3 ) )
            // InternalErDsl.g:356:3: ( rule__ERModel__EntitiesAssignment_3 )
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_3()); 
            // InternalErDsl.g:357:3: ( rule__ERModel__EntitiesAssignment_3 )
            // InternalErDsl.g:357:4: rule__ERModel__EntitiesAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__ERModel__EntitiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getEntitiesAssignment_3()); 

            }

            // InternalErDsl.g:360:2: ( ( rule__ERModel__EntitiesAssignment_3 )* )
            // InternalErDsl.g:361:3: ( rule__ERModel__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_3()); 
            // InternalErDsl.g:362:3: ( rule__ERModel__EntitiesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalErDsl.g:362:4: rule__ERModel__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ERModel__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getERModelAccess().getEntitiesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__3__Impl"


    // $ANTLR start "rule__ERModel__Group__4"
    // InternalErDsl.g:371:1: rule__ERModel__Group__4 : rule__ERModel__Group__4__Impl rule__ERModel__Group__5 ;
    public final void rule__ERModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:375:1: ( rule__ERModel__Group__4__Impl rule__ERModel__Group__5 )
            // InternalErDsl.g:376:2: rule__ERModel__Group__4__Impl rule__ERModel__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__ERModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__4"


    // $ANTLR start "rule__ERModel__Group__4__Impl"
    // InternalErDsl.g:383:1: rule__ERModel__Group__4__Impl : ( '};' ) ;
    public final void rule__ERModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:387:1: ( ( '};' ) )
            // InternalErDsl.g:388:1: ( '};' )
            {
            // InternalErDsl.g:388:1: ( '};' )
            // InternalErDsl.g:389:2: '};'
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketSemicolonKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRightCurlyBracketSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__4__Impl"


    // $ANTLR start "rule__ERModel__Group__5"
    // InternalErDsl.g:398:1: rule__ERModel__Group__5 : rule__ERModel__Group__5__Impl rule__ERModel__Group__6 ;
    public final void rule__ERModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:402:1: ( rule__ERModel__Group__5__Impl rule__ERModel__Group__6 )
            // InternalErDsl.g:403:2: rule__ERModel__Group__5__Impl rule__ERModel__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ERModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__5"


    // $ANTLR start "rule__ERModel__Group__5__Impl"
    // InternalErDsl.g:410:1: rule__ERModel__Group__5__Impl : ( 'Relationships{' ) ;
    public final void rule__ERModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:414:1: ( ( 'Relationships{' ) )
            // InternalErDsl.g:415:1: ( 'Relationships{' )
            {
            // InternalErDsl.g:415:1: ( 'Relationships{' )
            // InternalErDsl.g:416:2: 'Relationships{'
            {
             before(grammarAccess.getERModelAccess().getRelationshipsKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRelationshipsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__5__Impl"


    // $ANTLR start "rule__ERModel__Group__6"
    // InternalErDsl.g:425:1: rule__ERModel__Group__6 : rule__ERModel__Group__6__Impl rule__ERModel__Group__7 ;
    public final void rule__ERModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:429:1: ( rule__ERModel__Group__6__Impl rule__ERModel__Group__7 )
            // InternalErDsl.g:430:2: rule__ERModel__Group__6__Impl rule__ERModel__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__ERModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__6"


    // $ANTLR start "rule__ERModel__Group__6__Impl"
    // InternalErDsl.g:437:1: rule__ERModel__Group__6__Impl : ( ( rule__ERModel__RelationsAssignment_6 )* ) ;
    public final void rule__ERModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:441:1: ( ( ( rule__ERModel__RelationsAssignment_6 )* ) )
            // InternalErDsl.g:442:1: ( ( rule__ERModel__RelationsAssignment_6 )* )
            {
            // InternalErDsl.g:442:1: ( ( rule__ERModel__RelationsAssignment_6 )* )
            // InternalErDsl.g:443:2: ( rule__ERModel__RelationsAssignment_6 )*
            {
             before(grammarAccess.getERModelAccess().getRelationsAssignment_6()); 
            // InternalErDsl.g:444:2: ( rule__ERModel__RelationsAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalErDsl.g:444:3: rule__ERModel__RelationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ERModel__RelationsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getERModelAccess().getRelationsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__6__Impl"


    // $ANTLR start "rule__ERModel__Group__7"
    // InternalErDsl.g:452:1: rule__ERModel__Group__7 : rule__ERModel__Group__7__Impl ;
    public final void rule__ERModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:456:1: ( rule__ERModel__Group__7__Impl )
            // InternalErDsl.g:457:2: rule__ERModel__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__7"


    // $ANTLR start "rule__ERModel__Group__7__Impl"
    // InternalErDsl.g:463:1: rule__ERModel__Group__7__Impl : ( '};' ) ;
    public final void rule__ERModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:467:1: ( ( '};' ) )
            // InternalErDsl.g:468:1: ( '};' )
            {
            // InternalErDsl.g:468:1: ( '};' )
            // InternalErDsl.g:469:2: '};'
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketSemicolonKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRightCurlyBracketSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__7__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // InternalErDsl.g:479:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:483:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalErDsl.g:484:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0"


    // $ANTLR start "rule__Domain__Group__0__Impl"
    // InternalErDsl.g:491:1: rule__Domain__Group__0__Impl : ( 'Domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:495:1: ( ( 'Domain' ) )
            // InternalErDsl.g:496:1: ( 'Domain' )
            {
            // InternalErDsl.g:496:1: ( 'Domain' )
            // InternalErDsl.g:497:2: 'Domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getDomainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // InternalErDsl.g:506:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:510:1: ( rule__Domain__Group__1__Impl )
            // InternalErDsl.g:511:2: rule__Domain__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1"


    // $ANTLR start "rule__Domain__Group__1__Impl"
    // InternalErDsl.g:517:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:521:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalErDsl.g:522:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalErDsl.g:522:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalErDsl.g:523:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalErDsl.g:524:2: ( rule__Domain__NameAssignment_1 )
            // InternalErDsl.g:524:3: rule__Domain__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Domain__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalErDsl.g:533:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:537:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalErDsl.g:538:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalErDsl.g:545:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:549:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalErDsl.g:550:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalErDsl.g:550:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalErDsl.g:551:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalErDsl.g:552:2: ( rule__Attribute__NameAssignment_0 )
            // InternalErDsl.g:552:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalErDsl.g:560:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:564:1: ( rule__Attribute__Group__1__Impl )
            // InternalErDsl.g:565:2: rule__Attribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalErDsl.g:571:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__IsKeyAssignment_1 )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:575:1: ( ( ( rule__Attribute__IsKeyAssignment_1 )? ) )
            // InternalErDsl.g:576:1: ( ( rule__Attribute__IsKeyAssignment_1 )? )
            {
            // InternalErDsl.g:576:1: ( ( rule__Attribute__IsKeyAssignment_1 )? )
            // InternalErDsl.g:577:2: ( rule__Attribute__IsKeyAssignment_1 )?
            {
             before(grammarAccess.getAttributeAccess().getIsKeyAssignment_1()); 
            // InternalErDsl.g:578:2: ( rule__Attribute__IsKeyAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalErDsl.g:578:3: rule__Attribute__IsKeyAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__IsKeyAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getIsKeyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalErDsl.g:587:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:591:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalErDsl.g:592:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalErDsl.g:599:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:603:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // InternalErDsl.g:604:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // InternalErDsl.g:604:1: ( ( rule__Entity__NameAssignment_0 ) )
            // InternalErDsl.g:605:2: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // InternalErDsl.g:606:2: ( rule__Entity__NameAssignment_0 )
            // InternalErDsl.g:606:3: rule__Entity__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalErDsl.g:614:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:618:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalErDsl.g:619:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalErDsl.g:626:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__Group_1__0 )* ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:630:1: ( ( ( rule__Entity__Group_1__0 )* ) )
            // InternalErDsl.g:631:1: ( ( rule__Entity__Group_1__0 )* )
            {
            // InternalErDsl.g:631:1: ( ( rule__Entity__Group_1__0 )* )
            // InternalErDsl.g:632:2: ( rule__Entity__Group_1__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_1()); 
            // InternalErDsl.g:633:2: ( rule__Entity__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalErDsl.g:633:3: rule__Entity__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Entity__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalErDsl.g:641:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:645:1: ( rule__Entity__Group__2__Impl )
            // InternalErDsl.g:646:2: rule__Entity__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalErDsl.g:652:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:656:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalErDsl.g:657:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalErDsl.g:657:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalErDsl.g:658:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalErDsl.g:659:2: ( rule__Entity__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalErDsl.g:659:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group_1__0"
    // InternalErDsl.g:668:1: rule__Entity__Group_1__0 : rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 ;
    public final void rule__Entity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:672:1: ( rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 )
            // InternalErDsl.g:673:2: rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__0"


    // $ANTLR start "rule__Entity__Group_1__0__Impl"
    // InternalErDsl.g:680:1: rule__Entity__Group_1__0__Impl : ( 'is' ) ;
    public final void rule__Entity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:684:1: ( ( 'is' ) )
            // InternalErDsl.g:685:1: ( 'is' )
            {
            // InternalErDsl.g:685:1: ( 'is' )
            // InternalErDsl.g:686:2: 'is'
            {
             before(grammarAccess.getEntityAccess().getIsKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getIsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__0__Impl"


    // $ANTLR start "rule__Entity__Group_1__1"
    // InternalErDsl.g:695:1: rule__Entity__Group_1__1 : rule__Entity__Group_1__1__Impl ;
    public final void rule__Entity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:699:1: ( rule__Entity__Group_1__1__Impl )
            // InternalErDsl.g:700:2: rule__Entity__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__1"


    // $ANTLR start "rule__Entity__Group_1__1__Impl"
    // InternalErDsl.g:706:1: rule__Entity__Group_1__1__Impl : ( ( rule__Entity__IsAssignment_1_1 ) ) ;
    public final void rule__Entity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:710:1: ( ( ( rule__Entity__IsAssignment_1_1 ) ) )
            // InternalErDsl.g:711:1: ( ( rule__Entity__IsAssignment_1_1 ) )
            {
            // InternalErDsl.g:711:1: ( ( rule__Entity__IsAssignment_1_1 ) )
            // InternalErDsl.g:712:2: ( rule__Entity__IsAssignment_1_1 )
            {
             before(grammarAccess.getEntityAccess().getIsAssignment_1_1()); 
            // InternalErDsl.g:713:2: ( rule__Entity__IsAssignment_1_1 )
            // InternalErDsl.g:713:3: rule__Entity__IsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__IsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getIsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__1__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalErDsl.g:722:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:726:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalErDsl.g:727:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalErDsl.g:734:1: rule__Entity__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:738:1: ( ( '{' ) )
            // InternalErDsl.g:739:1: ( '{' )
            {
            // InternalErDsl.g:739:1: ( '{' )
            // InternalErDsl.g:740:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalErDsl.g:749:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:753:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // InternalErDsl.g:754:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalErDsl.g:761:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:765:1: ( ( ( rule__Entity__AttributesAssignment_2_1 ) ) )
            // InternalErDsl.g:766:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            {
            // InternalErDsl.g:766:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            // InternalErDsl.g:767:2: ( rule__Entity__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_1()); 
            // InternalErDsl.g:768:2: ( rule__Entity__AttributesAssignment_2_1 )
            // InternalErDsl.g:768:3: rule__Entity__AttributesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__AttributesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAttributesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Entity__Group_2__2"
    // InternalErDsl.g:776:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:780:1: ( rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 )
            // InternalErDsl.g:781:2: rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3
            {
            pushFollow(FOLLOW_14);
            rule__Entity__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__2"


    // $ANTLR start "rule__Entity__Group_2__2__Impl"
    // InternalErDsl.g:788:1: rule__Entity__Group_2__2__Impl : ( ( rule__Entity__Group_2_2__0 )* ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:792:1: ( ( ( rule__Entity__Group_2_2__0 )* ) )
            // InternalErDsl.g:793:1: ( ( rule__Entity__Group_2_2__0 )* )
            {
            // InternalErDsl.g:793:1: ( ( rule__Entity__Group_2_2__0 )* )
            // InternalErDsl.g:794:2: ( rule__Entity__Group_2_2__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_2_2()); 
            // InternalErDsl.g:795:2: ( rule__Entity__Group_2_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalErDsl.g:795:3: rule__Entity__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Entity__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__2__Impl"


    // $ANTLR start "rule__Entity__Group_2__3"
    // InternalErDsl.g:803:1: rule__Entity__Group_2__3 : rule__Entity__Group_2__3__Impl ;
    public final void rule__Entity__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:807:1: ( rule__Entity__Group_2__3__Impl )
            // InternalErDsl.g:808:2: rule__Entity__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__3"


    // $ANTLR start "rule__Entity__Group_2__3__Impl"
    // InternalErDsl.g:814:1: rule__Entity__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Entity__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:818:1: ( ( '}' ) )
            // InternalErDsl.g:819:1: ( '}' )
            {
            // InternalErDsl.g:819:1: ( '}' )
            // InternalErDsl.g:820:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__3__Impl"


    // $ANTLR start "rule__Entity__Group_2_2__0"
    // InternalErDsl.g:830:1: rule__Entity__Group_2_2__0 : rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 ;
    public final void rule__Entity__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:834:1: ( rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 )
            // InternalErDsl.g:835:2: rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2_2__0"


    // $ANTLR start "rule__Entity__Group_2_2__0__Impl"
    // InternalErDsl.g:842:1: rule__Entity__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:846:1: ( ( ',' ) )
            // InternalErDsl.g:847:1: ( ',' )
            {
            // InternalErDsl.g:847:1: ( ',' )
            // InternalErDsl.g:848:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_2_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2_2__1"
    // InternalErDsl.g:857:1: rule__Entity__Group_2_2__1 : rule__Entity__Group_2_2__1__Impl ;
    public final void rule__Entity__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:861:1: ( rule__Entity__Group_2_2__1__Impl )
            // InternalErDsl.g:862:2: rule__Entity__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2_2__1"


    // $ANTLR start "rule__Entity__Group_2_2__1__Impl"
    // InternalErDsl.g:868:1: rule__Entity__Group_2_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Entity__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:872:1: ( ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) )
            // InternalErDsl.g:873:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDsl.g:873:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            // InternalErDsl.g:874:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDsl.g:875:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            // InternalErDsl.g:875:3: rule__Entity__AttributesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__AttributesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAttributesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2_2__1__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalErDsl.g:884:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:888:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalErDsl.g:889:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalErDsl.g:896:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__NameAssignment_0 )? ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:900:1: ( ( ( rule__Relation__NameAssignment_0 )? ) )
            // InternalErDsl.g:901:1: ( ( rule__Relation__NameAssignment_0 )? )
            {
            // InternalErDsl.g:901:1: ( ( rule__Relation__NameAssignment_0 )? )
            // InternalErDsl.g:902:2: ( rule__Relation__NameAssignment_0 )?
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_0()); 
            // InternalErDsl.g:903:2: ( rule__Relation__NameAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalErDsl.g:903:3: rule__Relation__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalErDsl.g:911:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:915:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalErDsl.g:916:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalErDsl.g:923:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__Group_1__0 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:927:1: ( ( ( rule__Relation__Group_1__0 ) ) )
            // InternalErDsl.g:928:1: ( ( rule__Relation__Group_1__0 ) )
            {
            // InternalErDsl.g:928:1: ( ( rule__Relation__Group_1__0 ) )
            // InternalErDsl.g:929:2: ( rule__Relation__Group_1__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_1()); 
            // InternalErDsl.g:930:2: ( rule__Relation__Group_1__0 )
            // InternalErDsl.g:930:3: rule__Relation__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalErDsl.g:938:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:942:1: ( rule__Relation__Group__2__Impl )
            // InternalErDsl.g:943:2: rule__Relation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalErDsl.g:949:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__Group_2__0 )* ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:953:1: ( ( ( rule__Relation__Group_2__0 )* ) )
            // InternalErDsl.g:954:1: ( ( rule__Relation__Group_2__0 )* )
            {
            // InternalErDsl.g:954:1: ( ( rule__Relation__Group_2__0 )* )
            // InternalErDsl.g:955:2: ( rule__Relation__Group_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2()); 
            // InternalErDsl.g:956:2: ( rule__Relation__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalErDsl.g:956:3: rule__Relation__Group_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Relation__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRelationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group_1__0"
    // InternalErDsl.g:965:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:969:1: ( rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 )
            // InternalErDsl.g:970:2: rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Relation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__0"


    // $ANTLR start "rule__Relation__Group_1__0__Impl"
    // InternalErDsl.g:977:1: rule__Relation__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:981:1: ( ( '[' ) )
            // InternalErDsl.g:982:1: ( '[' )
            {
            // InternalErDsl.g:982:1: ( '[' )
            // InternalErDsl.g:983:2: '['
            {
             before(grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__0__Impl"


    // $ANTLR start "rule__Relation__Group_1__1"
    // InternalErDsl.g:992:1: rule__Relation__Group_1__1 : rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 ;
    public final void rule__Relation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:996:1: ( rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 )
            // InternalErDsl.g:997:2: rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Relation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__1"


    // $ANTLR start "rule__Relation__Group_1__1__Impl"
    // InternalErDsl.g:1004:1: rule__Relation__Group_1__1__Impl : ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) ;
    public final void rule__Relation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1008:1: ( ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) )
            // InternalErDsl.g:1009:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            {
            // InternalErDsl.g:1009:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            // InternalErDsl.g:1010:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            {
             before(grammarAccess.getRelationAccess().getLeftEndingAssignment_1_1()); 
            // InternalErDsl.g:1011:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            // InternalErDsl.g:1011:3: rule__Relation__LeftEndingAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__LeftEndingAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getLeftEndingAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__1__Impl"


    // $ANTLR start "rule__Relation__Group_1__2"
    // InternalErDsl.g:1019:1: rule__Relation__Group_1__2 : rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 ;
    public final void rule__Relation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1023:1: ( rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 )
            // InternalErDsl.g:1024:2: rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3
            {
            pushFollow(FOLLOW_19);
            rule__Relation__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__2"


    // $ANTLR start "rule__Relation__Group_1__2__Impl"
    // InternalErDsl.g:1031:1: rule__Relation__Group_1__2__Impl : ( 'relates' ) ;
    public final void rule__Relation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1035:1: ( ( 'relates' ) )
            // InternalErDsl.g:1036:1: ( 'relates' )
            {
            // InternalErDsl.g:1036:1: ( 'relates' )
            // InternalErDsl.g:1037:2: 'relates'
            {
             before(grammarAccess.getRelationAccess().getRelatesKeyword_1_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelatesKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__2__Impl"


    // $ANTLR start "rule__Relation__Group_1__3"
    // InternalErDsl.g:1046:1: rule__Relation__Group_1__3 : rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 ;
    public final void rule__Relation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1050:1: ( rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 )
            // InternalErDsl.g:1051:2: rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4
            {
            pushFollow(FOLLOW_21);
            rule__Relation__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__3"


    // $ANTLR start "rule__Relation__Group_1__3__Impl"
    // InternalErDsl.g:1058:1: rule__Relation__Group_1__3__Impl : ( ( rule__Relation__RightEndingAssignment_1_3 ) ) ;
    public final void rule__Relation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1062:1: ( ( ( rule__Relation__RightEndingAssignment_1_3 ) ) )
            // InternalErDsl.g:1063:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            {
            // InternalErDsl.g:1063:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            // InternalErDsl.g:1064:2: ( rule__Relation__RightEndingAssignment_1_3 )
            {
             before(grammarAccess.getRelationAccess().getRightEndingAssignment_1_3()); 
            // InternalErDsl.g:1065:2: ( rule__Relation__RightEndingAssignment_1_3 )
            // InternalErDsl.g:1065:3: rule__Relation__RightEndingAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Relation__RightEndingAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getRightEndingAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__3__Impl"


    // $ANTLR start "rule__Relation__Group_1__4"
    // InternalErDsl.g:1073:1: rule__Relation__Group_1__4 : rule__Relation__Group_1__4__Impl ;
    public final void rule__Relation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1077:1: ( rule__Relation__Group_1__4__Impl )
            // InternalErDsl.g:1078:2: rule__Relation__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__4"


    // $ANTLR start "rule__Relation__Group_1__4__Impl"
    // InternalErDsl.g:1084:1: rule__Relation__Group_1__4__Impl : ( ']' ) ;
    public final void rule__Relation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1088:1: ( ( ']' ) )
            // InternalErDsl.g:1089:1: ( ']' )
            {
            // InternalErDsl.g:1089:1: ( ']' )
            // InternalErDsl.g:1090:2: ']'
            {
             before(grammarAccess.getRelationAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRightSquareBracketKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__4__Impl"


    // $ANTLR start "rule__Relation__Group_2__0"
    // InternalErDsl.g:1100:1: rule__Relation__Group_2__0 : rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 ;
    public final void rule__Relation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1104:1: ( rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 )
            // InternalErDsl.g:1105:2: rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Relation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_2__0"


    // $ANTLR start "rule__Relation__Group_2__0__Impl"
    // InternalErDsl.g:1112:1: rule__Relation__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Relation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1116:1: ( ( '{' ) )
            // InternalErDsl.g:1117:1: ( '{' )
            {
            // InternalErDsl.g:1117:1: ( '{' )
            // InternalErDsl.g:1118:2: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_2__0__Impl"


    // $ANTLR start "rule__Relation__Group_2__1"
    // InternalErDsl.g:1127:1: rule__Relation__Group_2__1 : rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 ;
    public final void rule__Relation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1131:1: ( rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 )
            // InternalErDsl.g:1132:2: rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2
            {
            pushFollow(FOLLOW_14);
            rule__Relation__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_2__1"


    // $ANTLR start "rule__Relation__Group_2__1__Impl"
    // InternalErDsl.g:1139:1: rule__Relation__Group_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_1 ) ) ;
    public final void rule__Relation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1143:1: ( ( ( rule__Relation__AttributesAssignment_2_1 ) ) )
            // InternalErDsl.g:1144:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            {
            // InternalErDsl.g:1144:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            // InternalErDsl.g:1145:2: ( rule__Relation__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_1()); 
            // InternalErDsl.g:1146:2: ( rule__Relation__AttributesAssignment_2_1 )
            // InternalErDsl.g:1146:3: rule__Relation__AttributesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__AttributesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getAttributesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_2__1__Impl"


    // $ANTLR start "rule__Relation__Group_2__2"
    // InternalErDsl.g:1154:1: rule__Relation__Group_2__2 : rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 ;
    public final void rule__Relation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1158:1: ( rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 )
            // InternalErDsl.g:1159:2: rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3
            {
            pushFollow(FOLLOW_14);
            rule__Relation__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_2__2"


    // $ANTLR start "rule__Relation__Group_2__2__Impl"
    // InternalErDsl.g:1166:1: rule__Relation__Group_2__2__Impl : ( ( rule__Relation__Group_2_2__0 )* ) ;
    public final void rule__Relation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1170:1: ( ( ( rule__Relation__Group_2_2__0 )* ) )
            // InternalErDsl.g:1171:1: ( ( rule__Relation__Group_2_2__0 )* )
            {
            // InternalErDsl.g:1171:1: ( ( rule__Relation__Group_2_2__0 )* )
            // InternalErDsl.g:1172:2: ( rule__Relation__Group_2_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2_2()); 
            // InternalErDsl.g:1173:2: ( rule__Relation__Group_2_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalErDsl.g:1173:3: rule__Relation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Relation__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRelationAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_2__2__Impl"


    // $ANTLR start "rule__Relation__Group_2__3"
    // InternalErDsl.g:1181:1: rule__Relation__Group_2__3 : rule__Relation__Group_2__3__Impl ;
    public final void rule__Relation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1185:1: ( rule__Relation__Group_2__3__Impl )
            // InternalErDsl.g:1186:2: rule__Relation__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_2__3"


    // $ANTLR start "rule__Relation__Group_2__3__Impl"
    // InternalErDsl.g:1192:1: rule__Relation__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Relation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1196:1: ( ( '}' ) )
            // InternalErDsl.g:1197:1: ( '}' )
            {
            // InternalErDsl.g:1197:1: ( '}' )
            // InternalErDsl.g:1198:2: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_2__3__Impl"


    // $ANTLR start "rule__Relation__Group_2_2__0"
    // InternalErDsl.g:1208:1: rule__Relation__Group_2_2__0 : rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 ;
    public final void rule__Relation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1212:1: ( rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 )
            // InternalErDsl.g:1213:2: rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Relation__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_2_2__0"


    // $ANTLR start "rule__Relation__Group_2_2__0__Impl"
    // InternalErDsl.g:1220:1: rule__Relation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Relation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1224:1: ( ( ',' ) )
            // InternalErDsl.g:1225:1: ( ',' )
            {
            // InternalErDsl.g:1225:1: ( ',' )
            // InternalErDsl.g:1226:2: ','
            {
             before(grammarAccess.getRelationAccess().getCommaKeyword_2_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_2_2__0__Impl"


    // $ANTLR start "rule__Relation__Group_2_2__1"
    // InternalErDsl.g:1235:1: rule__Relation__Group_2_2__1 : rule__Relation__Group_2_2__1__Impl ;
    public final void rule__Relation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1239:1: ( rule__Relation__Group_2_2__1__Impl )
            // InternalErDsl.g:1240:2: rule__Relation__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_2_2__1"


    // $ANTLR start "rule__Relation__Group_2_2__1__Impl"
    // InternalErDsl.g:1246:1: rule__Relation__Group_2_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Relation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1250:1: ( ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) )
            // InternalErDsl.g:1251:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDsl.g:1251:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            // InternalErDsl.g:1252:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDsl.g:1253:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            // InternalErDsl.g:1253:3: rule__Relation__AttributesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__AttributesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getAttributesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_2_2__1__Impl"


    // $ANTLR start "rule__RelationSide__Group_0__0"
    // InternalErDsl.g:1262:1: rule__RelationSide__Group_0__0 : rule__RelationSide__Group_0__0__Impl rule__RelationSide__Group_0__1 ;
    public final void rule__RelationSide__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1266:1: ( rule__RelationSide__Group_0__0__Impl rule__RelationSide__Group_0__1 )
            // InternalErDsl.g:1267:2: rule__RelationSide__Group_0__0__Impl rule__RelationSide__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__RelationSide__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationSide__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSide__Group_0__0"


    // $ANTLR start "rule__RelationSide__Group_0__0__Impl"
    // InternalErDsl.g:1274:1: rule__RelationSide__Group_0__0__Impl : ( ( rule__RelationSide__CardinalityAssignment_0_0 ) ) ;
    public final void rule__RelationSide__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1278:1: ( ( ( rule__RelationSide__CardinalityAssignment_0_0 ) ) )
            // InternalErDsl.g:1279:1: ( ( rule__RelationSide__CardinalityAssignment_0_0 ) )
            {
            // InternalErDsl.g:1279:1: ( ( rule__RelationSide__CardinalityAssignment_0_0 ) )
            // InternalErDsl.g:1280:2: ( rule__RelationSide__CardinalityAssignment_0_0 )
            {
             before(grammarAccess.getRelationSideAccess().getCardinalityAssignment_0_0()); 
            // InternalErDsl.g:1281:2: ( rule__RelationSide__CardinalityAssignment_0_0 )
            // InternalErDsl.g:1281:3: rule__RelationSide__CardinalityAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationSide__CardinalityAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideAccess().getCardinalityAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSide__Group_0__0__Impl"


    // $ANTLR start "rule__RelationSide__Group_0__1"
    // InternalErDsl.g:1289:1: rule__RelationSide__Group_0__1 : rule__RelationSide__Group_0__1__Impl ;
    public final void rule__RelationSide__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1293:1: ( rule__RelationSide__Group_0__1__Impl )
            // InternalErDsl.g:1294:2: rule__RelationSide__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationSide__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSide__Group_0__1"


    // $ANTLR start "rule__RelationSide__Group_0__1__Impl"
    // InternalErDsl.g:1300:1: rule__RelationSide__Group_0__1__Impl : ( ( rule__RelationSide__TargetAssignment_0_1 ) ) ;
    public final void rule__RelationSide__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1304:1: ( ( ( rule__RelationSide__TargetAssignment_0_1 ) ) )
            // InternalErDsl.g:1305:1: ( ( rule__RelationSide__TargetAssignment_0_1 ) )
            {
            // InternalErDsl.g:1305:1: ( ( rule__RelationSide__TargetAssignment_0_1 ) )
            // InternalErDsl.g:1306:2: ( rule__RelationSide__TargetAssignment_0_1 )
            {
             before(grammarAccess.getRelationSideAccess().getTargetAssignment_0_1()); 
            // InternalErDsl.g:1307:2: ( rule__RelationSide__TargetAssignment_0_1 )
            // InternalErDsl.g:1307:3: rule__RelationSide__TargetAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationSide__TargetAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideAccess().getTargetAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSide__Group_0__1__Impl"


    // $ANTLR start "rule__ERModel__DomainAssignment_0"
    // InternalErDsl.g:1316:1: rule__ERModel__DomainAssignment_0 : ( ruleDomain ) ;
    public final void rule__ERModel__DomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1320:1: ( ( ruleDomain ) )
            // InternalErDsl.g:1321:2: ( ruleDomain )
            {
            // InternalErDsl.g:1321:2: ( ruleDomain )
            // InternalErDsl.g:1322:3: ruleDomain
            {
             before(grammarAccess.getERModelAccess().getDomainDomainParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getDomainDomainParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__DomainAssignment_0"


    // $ANTLR start "rule__ERModel__EntitiesAssignment_3"
    // InternalErDsl.g:1331:1: rule__ERModel__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__ERModel__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1335:1: ( ( ruleEntity ) )
            // InternalErDsl.g:1336:2: ( ruleEntity )
            {
            // InternalErDsl.g:1336:2: ( ruleEntity )
            // InternalErDsl.g:1337:3: ruleEntity
            {
             before(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__EntitiesAssignment_3"


    // $ANTLR start "rule__ERModel__RelationsAssignment_6"
    // InternalErDsl.g:1346:1: rule__ERModel__RelationsAssignment_6 : ( ruleRelation ) ;
    public final void rule__ERModel__RelationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1350:1: ( ( ruleRelation ) )
            // InternalErDsl.g:1351:2: ( ruleRelation )
            {
            // InternalErDsl.g:1351:2: ( ruleRelation )
            // InternalErDsl.g:1352:3: ruleRelation
            {
             before(grammarAccess.getERModelAccess().getRelationsRelationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getRelationsRelationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__RelationsAssignment_6"


    // $ANTLR start "rule__Domain__NameAssignment_1"
    // InternalErDsl.g:1361:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1365:1: ( ( RULE_ID ) )
            // InternalErDsl.g:1366:2: ( RULE_ID )
            {
            // InternalErDsl.g:1366:2: ( RULE_ID )
            // InternalErDsl.g:1367:3: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__NameAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalErDsl.g:1376:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1380:1: ( ( RULE_ID ) )
            // InternalErDsl.g:1381:2: ( RULE_ID )
            {
            // InternalErDsl.g:1381:2: ( RULE_ID )
            // InternalErDsl.g:1382:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__IsKeyAssignment_1"
    // InternalErDsl.g:1391:1: rule__Attribute__IsKeyAssignment_1 : ( ( 'isIdentifier' ) ) ;
    public final void rule__Attribute__IsKeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1395:1: ( ( ( 'isIdentifier' ) ) )
            // InternalErDsl.g:1396:2: ( ( 'isIdentifier' ) )
            {
            // InternalErDsl.g:1396:2: ( ( 'isIdentifier' ) )
            // InternalErDsl.g:1397:3: ( 'isIdentifier' )
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_1_0()); 
            // InternalErDsl.g:1398:3: ( 'isIdentifier' )
            // InternalErDsl.g:1399:4: 'isIdentifier'
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__IsKeyAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_0"
    // InternalErDsl.g:1410:1: rule__Entity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1414:1: ( ( RULE_ID ) )
            // InternalErDsl.g:1415:2: ( RULE_ID )
            {
            // InternalErDsl.g:1415:2: ( RULE_ID )
            // InternalErDsl.g:1416:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_0"


    // $ANTLR start "rule__Entity__IsAssignment_1_1"
    // InternalErDsl.g:1425:1: rule__Entity__IsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__IsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1429:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl.g:1430:2: ( ( RULE_ID ) )
            {
            // InternalErDsl.g:1430:2: ( ( RULE_ID ) )
            // InternalErDsl.g:1431:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getIsEntityCrossReference_1_1_0()); 
            // InternalErDsl.g:1432:3: ( RULE_ID )
            // InternalErDsl.g:1433:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getIsEntityIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getIsEntityIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getIsEntityCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__IsAssignment_1_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_2_1"
    // InternalErDsl.g:1444:1: rule__Entity__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1448:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:1449:2: ( ruleAttribute )
            {
            // InternalErDsl.g:1449:2: ( ruleAttribute )
            // InternalErDsl.g:1450:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_2_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_2_2_1"
    // InternalErDsl.g:1459:1: rule__Entity__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1463:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:1464:2: ( ruleAttribute )
            {
            // InternalErDsl.g:1464:2: ( ruleAttribute )
            // InternalErDsl.g:1465:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_2_2_1"


    // $ANTLR start "rule__Relation__NameAssignment_0"
    // InternalErDsl.g:1474:1: rule__Relation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1478:1: ( ( RULE_ID ) )
            // InternalErDsl.g:1479:2: ( RULE_ID )
            {
            // InternalErDsl.g:1479:2: ( RULE_ID )
            // InternalErDsl.g:1480:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__NameAssignment_0"


    // $ANTLR start "rule__Relation__LeftEndingAssignment_1_1"
    // InternalErDsl.g:1489:1: rule__Relation__LeftEndingAssignment_1_1 : ( ruleRelationSide ) ;
    public final void rule__Relation__LeftEndingAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1493:1: ( ( ruleRelationSide ) )
            // InternalErDsl.g:1494:2: ( ruleRelationSide )
            {
            // InternalErDsl.g:1494:2: ( ruleRelationSide )
            // InternalErDsl.g:1495:3: ruleRelationSide
            {
             before(grammarAccess.getRelationAccess().getLeftEndingRelationSideParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationSide();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getLeftEndingRelationSideParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__LeftEndingAssignment_1_1"


    // $ANTLR start "rule__Relation__RightEndingAssignment_1_3"
    // InternalErDsl.g:1504:1: rule__Relation__RightEndingAssignment_1_3 : ( ruleRelationSide ) ;
    public final void rule__Relation__RightEndingAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1508:1: ( ( ruleRelationSide ) )
            // InternalErDsl.g:1509:2: ( ruleRelationSide )
            {
            // InternalErDsl.g:1509:2: ( ruleRelationSide )
            // InternalErDsl.g:1510:3: ruleRelationSide
            {
             before(grammarAccess.getRelationAccess().getRightEndingRelationSideParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationSide();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getRightEndingRelationSideParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__RightEndingAssignment_1_3"


    // $ANTLR start "rule__Relation__AttributesAssignment_2_1"
    // InternalErDsl.g:1519:1: rule__Relation__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1523:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:1524:2: ( ruleAttribute )
            {
            // InternalErDsl.g:1524:2: ( ruleAttribute )
            // InternalErDsl.g:1525:3: ruleAttribute
            {
             before(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__AttributesAssignment_2_1"


    // $ANTLR start "rule__Relation__AttributesAssignment_2_2_1"
    // InternalErDsl.g:1534:1: rule__Relation__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1538:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:1539:2: ( ruleAttribute )
            {
            // InternalErDsl.g:1539:2: ( ruleAttribute )
            // InternalErDsl.g:1540:3: ruleAttribute
            {
             before(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getAttributesAttributeParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__AttributesAssignment_2_2_1"


    // $ANTLR start "rule__RelationSide__CardinalityAssignment_0_0"
    // InternalErDsl.g:1549:1: rule__RelationSide__CardinalityAssignment_0_0 : ( ( rule__RelationSide__CardinalityAlternatives_0_0_0 ) ) ;
    public final void rule__RelationSide__CardinalityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1553:1: ( ( ( rule__RelationSide__CardinalityAlternatives_0_0_0 ) ) )
            // InternalErDsl.g:1554:2: ( ( rule__RelationSide__CardinalityAlternatives_0_0_0 ) )
            {
            // InternalErDsl.g:1554:2: ( ( rule__RelationSide__CardinalityAlternatives_0_0_0 ) )
            // InternalErDsl.g:1555:3: ( rule__RelationSide__CardinalityAlternatives_0_0_0 )
            {
             before(grammarAccess.getRelationSideAccess().getCardinalityAlternatives_0_0_0()); 
            // InternalErDsl.g:1556:3: ( rule__RelationSide__CardinalityAlternatives_0_0_0 )
            // InternalErDsl.g:1556:4: rule__RelationSide__CardinalityAlternatives_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationSide__CardinalityAlternatives_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideAccess().getCardinalityAlternatives_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSide__CardinalityAssignment_0_0"


    // $ANTLR start "rule__RelationSide__TargetAssignment_0_1"
    // InternalErDsl.g:1564:1: rule__RelationSide__TargetAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSide__TargetAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1568:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl.g:1569:2: ( ( RULE_ID ) )
            {
            // InternalErDsl.g:1569:2: ( ( RULE_ID ) )
            // InternalErDsl.g:1570:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideAccess().getTargetEntityCrossReference_0_1_0()); 
            // InternalErDsl.g:1571:3: ( RULE_ID )
            // InternalErDsl.g:1572:4: RULE_ID
            {
             before(grammarAccess.getRelationSideAccess().getTargetEntityIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationSideAccess().getTargetEntityIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getRelationSideAccess().getTargetEntityCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSide__TargetAssignment_0_1"


    // $ANTLR start "rule__RelationSide__TargetAssignment_1"
    // InternalErDsl.g:1583:1: rule__RelationSide__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSide__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1587:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl.g:1588:2: ( ( RULE_ID ) )
            {
            // InternalErDsl.g:1588:2: ( ( RULE_ID ) )
            // InternalErDsl.g:1589:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideAccess().getTargetRelationCrossReference_1_0()); 
            // InternalErDsl.g:1590:3: ( RULE_ID )
            // InternalErDsl.g:1591:4: RULE_ID
            {
             before(grammarAccess.getRelationSideAccess().getTargetRelationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationSideAccess().getTargetRelationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRelationSideAccess().getTargetRelationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSide__TargetAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001020010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000007810L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});

}