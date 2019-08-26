package org.xtext.example.ide.contentassist.antlr.internal;

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
import org.xtext.example.services.ErDsl2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalErDsl2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'(0,1)'", "'(1,1)'", "'(0,N)'", "'(1,N)'", "'int'", "'double'", "'money'", "'string'", "'boolean'", "'datetime'", "'file'", "'Entities{'", "'}'", "'Relationships{'", "'Domain'", "'is'", "'{'", "','", "'['", "'relates'", "']'", "'*'"
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

    	public void setGrammarAccess(ErDsl2GrammarAccess grammarAccess) {
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
    // InternalErDsl2.g:53:1: entryRuleERModel : ruleERModel EOF ;
    public final void entryRuleERModel() throws RecognitionException {
        try {
            // InternalErDsl2.g:54:1: ( ruleERModel EOF )
            // InternalErDsl2.g:55:1: ruleERModel EOF
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
    // InternalErDsl2.g:62:1: ruleERModel : ( ( rule__ERModel__Group__0 ) ) ;
    public final void ruleERModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:66:2: ( ( ( rule__ERModel__Group__0 ) ) )
            // InternalErDsl2.g:67:2: ( ( rule__ERModel__Group__0 ) )
            {
            // InternalErDsl2.g:67:2: ( ( rule__ERModel__Group__0 ) )
            // InternalErDsl2.g:68:3: ( rule__ERModel__Group__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup()); 
            // InternalErDsl2.g:69:3: ( rule__ERModel__Group__0 )
            // InternalErDsl2.g:69:4: rule__ERModel__Group__0
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
    // InternalErDsl2.g:78:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalErDsl2.g:79:1: ( ruleDomain EOF )
            // InternalErDsl2.g:80:1: ruleDomain EOF
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
    // InternalErDsl2.g:87:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:91:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalErDsl2.g:92:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalErDsl2.g:92:2: ( ( rule__Domain__Group__0 ) )
            // InternalErDsl2.g:93:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalErDsl2.g:94:3: ( rule__Domain__Group__0 )
            // InternalErDsl2.g:94:4: rule__Domain__Group__0
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
    // InternalErDsl2.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalErDsl2.g:104:1: ( ruleAttribute EOF )
            // InternalErDsl2.g:105:1: ruleAttribute EOF
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
    // InternalErDsl2.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalErDsl2.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalErDsl2.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalErDsl2.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalErDsl2.g:119:3: ( rule__Attribute__Group__0 )
            // InternalErDsl2.g:119:4: rule__Attribute__Group__0
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
    // InternalErDsl2.g:128:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalErDsl2.g:129:1: ( ruleEntity EOF )
            // InternalErDsl2.g:130:1: ruleEntity EOF
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
    // InternalErDsl2.g:137:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:141:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalErDsl2.g:142:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalErDsl2.g:142:2: ( ( rule__Entity__Group__0 ) )
            // InternalErDsl2.g:143:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalErDsl2.g:144:3: ( rule__Entity__Group__0 )
            // InternalErDsl2.g:144:4: rule__Entity__Group__0
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
    // InternalErDsl2.g:153:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalErDsl2.g:154:1: ( ruleRelation EOF )
            // InternalErDsl2.g:155:1: ruleRelation EOF
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
    // InternalErDsl2.g:162:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:166:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalErDsl2.g:167:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalErDsl2.g:167:2: ( ( rule__Relation__Group__0 ) )
            // InternalErDsl2.g:168:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalErDsl2.g:169:3: ( rule__Relation__Group__0 )
            // InternalErDsl2.g:169:4: rule__Relation__Group__0
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
    // InternalErDsl2.g:178:1: entryRuleRelationSide : ruleRelationSide EOF ;
    public final void entryRuleRelationSide() throws RecognitionException {
        try {
            // InternalErDsl2.g:179:1: ( ruleRelationSide EOF )
            // InternalErDsl2.g:180:1: ruleRelationSide EOF
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
    // InternalErDsl2.g:187:1: ruleRelationSide : ( ( rule__RelationSide__Alternatives ) ) ;
    public final void ruleRelationSide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:191:2: ( ( ( rule__RelationSide__Alternatives ) ) )
            // InternalErDsl2.g:192:2: ( ( rule__RelationSide__Alternatives ) )
            {
            // InternalErDsl2.g:192:2: ( ( rule__RelationSide__Alternatives ) )
            // InternalErDsl2.g:193:3: ( rule__RelationSide__Alternatives )
            {
             before(grammarAccess.getRelationSideAccess().getAlternatives()); 
            // InternalErDsl2.g:194:3: ( rule__RelationSide__Alternatives )
            // InternalErDsl2.g:194:4: rule__RelationSide__Alternatives
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


    // $ANTLR start "ruleDataType"
    // InternalErDsl2.g:203:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:207:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalErDsl2.g:208:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalErDsl2.g:208:2: ( ( rule__DataType__Alternatives ) )
            // InternalErDsl2.g:209:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalErDsl2.g:210:3: ( rule__DataType__Alternatives )
            // InternalErDsl2.g:210:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__RelationSide__Alternatives"
    // InternalErDsl2.g:218:1: rule__RelationSide__Alternatives : ( ( ( rule__RelationSide__Group_0__0 ) ) | ( ( rule__RelationSide__TargetAssignment_1 ) ) );
    public final void rule__RelationSide__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:222:1: ( ( ( rule__RelationSide__Group_0__0 ) ) | ( ( rule__RelationSide__TargetAssignment_1 ) ) )
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
                    // InternalErDsl2.g:223:2: ( ( rule__RelationSide__Group_0__0 ) )
                    {
                    // InternalErDsl2.g:223:2: ( ( rule__RelationSide__Group_0__0 ) )
                    // InternalErDsl2.g:224:3: ( rule__RelationSide__Group_0__0 )
                    {
                     before(grammarAccess.getRelationSideAccess().getGroup_0()); 
                    // InternalErDsl2.g:225:3: ( rule__RelationSide__Group_0__0 )
                    // InternalErDsl2.g:225:4: rule__RelationSide__Group_0__0
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
                    // InternalErDsl2.g:229:2: ( ( rule__RelationSide__TargetAssignment_1 ) )
                    {
                    // InternalErDsl2.g:229:2: ( ( rule__RelationSide__TargetAssignment_1 ) )
                    // InternalErDsl2.g:230:3: ( rule__RelationSide__TargetAssignment_1 )
                    {
                     before(grammarAccess.getRelationSideAccess().getTargetAssignment_1()); 
                    // InternalErDsl2.g:231:3: ( rule__RelationSide__TargetAssignment_1 )
                    // InternalErDsl2.g:231:4: rule__RelationSide__TargetAssignment_1
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
    // InternalErDsl2.g:239:1: rule__RelationSide__CardinalityAlternatives_0_0_0 : ( ( '(0,1)' ) | ( '(1,1)' ) | ( '(0,N)' ) | ( '(1,N)' ) );
    public final void rule__RelationSide__CardinalityAlternatives_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:243:1: ( ( '(0,1)' ) | ( '(1,1)' ) | ( '(0,N)' ) | ( '(1,N)' ) )
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
                    // InternalErDsl2.g:244:2: ( '(0,1)' )
                    {
                    // InternalErDsl2.g:244:2: ( '(0,1)' )
                    // InternalErDsl2.g:245:3: '(0,1)'
                    {
                     before(grammarAccess.getRelationSideAccess().getCardinality01Keyword_0_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getRelationSideAccess().getCardinality01Keyword_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl2.g:250:2: ( '(1,1)' )
                    {
                    // InternalErDsl2.g:250:2: ( '(1,1)' )
                    // InternalErDsl2.g:251:3: '(1,1)'
                    {
                     before(grammarAccess.getRelationSideAccess().getCardinality11Keyword_0_0_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getRelationSideAccess().getCardinality11Keyword_0_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl2.g:256:2: ( '(0,N)' )
                    {
                    // InternalErDsl2.g:256:2: ( '(0,N)' )
                    // InternalErDsl2.g:257:3: '(0,N)'
                    {
                     before(grammarAccess.getRelationSideAccess().getCardinality0NKeyword_0_0_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRelationSideAccess().getCardinality0NKeyword_0_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl2.g:262:2: ( '(1,N)' )
                    {
                    // InternalErDsl2.g:262:2: ( '(1,N)' )
                    // InternalErDsl2.g:263:3: '(1,N)'
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


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalErDsl2.g:272:1: rule__DataType__Alternatives : ( ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'money' ) ) | ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'datetime' ) ) | ( ( 'file' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:276:1: ( ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'money' ) ) | ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'datetime' ) ) | ( ( 'file' ) ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            case 20:
                {
                alt3=6;
                }
                break;
            case 21:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalErDsl2.g:277:2: ( ( 'int' ) )
                    {
                    // InternalErDsl2.g:277:2: ( ( 'int' ) )
                    // InternalErDsl2.g:278:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalErDsl2.g:279:3: ( 'int' )
                    // InternalErDsl2.g:279:4: 'int'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl2.g:283:2: ( ( 'double' ) )
                    {
                    // InternalErDsl2.g:283:2: ( ( 'double' ) )
                    // InternalErDsl2.g:284:3: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                    // InternalErDsl2.g:285:3: ( 'double' )
                    // InternalErDsl2.g:285:4: 'double'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl2.g:289:2: ( ( 'money' ) )
                    {
                    // InternalErDsl2.g:289:2: ( ( 'money' ) )
                    // InternalErDsl2.g:290:3: ( 'money' )
                    {
                     before(grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2()); 
                    // InternalErDsl2.g:291:3: ( 'money' )
                    // InternalErDsl2.g:291:4: 'money'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl2.g:295:2: ( ( 'string' ) )
                    {
                    // InternalErDsl2.g:295:2: ( ( 'string' ) )
                    // InternalErDsl2.g:296:3: ( 'string' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                    // InternalErDsl2.g:297:3: ( 'string' )
                    // InternalErDsl2.g:297:4: 'string'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalErDsl2.g:301:2: ( ( 'boolean' ) )
                    {
                    // InternalErDsl2.g:301:2: ( ( 'boolean' ) )
                    // InternalErDsl2.g:302:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 
                    // InternalErDsl2.g:303:3: ( 'boolean' )
                    // InternalErDsl2.g:303:4: 'boolean'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalErDsl2.g:307:2: ( ( 'datetime' ) )
                    {
                    // InternalErDsl2.g:307:2: ( ( 'datetime' ) )
                    // InternalErDsl2.g:308:3: ( 'datetime' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5()); 
                    // InternalErDsl2.g:309:3: ( 'datetime' )
                    // InternalErDsl2.g:309:4: 'datetime'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalErDsl2.g:313:2: ( ( 'file' ) )
                    {
                    // InternalErDsl2.g:313:2: ( ( 'file' ) )
                    // InternalErDsl2.g:314:3: ( 'file' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBLOBEnumLiteralDeclaration_6()); 
                    // InternalErDsl2.g:315:3: ( 'file' )
                    // InternalErDsl2.g:315:4: 'file'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBLOBEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__ERModel__Group__0"
    // InternalErDsl2.g:323:1: rule__ERModel__Group__0 : rule__ERModel__Group__0__Impl rule__ERModel__Group__1 ;
    public final void rule__ERModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:327:1: ( rule__ERModel__Group__0__Impl rule__ERModel__Group__1 )
            // InternalErDsl2.g:328:2: rule__ERModel__Group__0__Impl rule__ERModel__Group__1
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
    // InternalErDsl2.g:335:1: rule__ERModel__Group__0__Impl : ( ( rule__ERModel__DomainAssignment_0 ) ) ;
    public final void rule__ERModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:339:1: ( ( ( rule__ERModel__DomainAssignment_0 ) ) )
            // InternalErDsl2.g:340:1: ( ( rule__ERModel__DomainAssignment_0 ) )
            {
            // InternalErDsl2.g:340:1: ( ( rule__ERModel__DomainAssignment_0 ) )
            // InternalErDsl2.g:341:2: ( rule__ERModel__DomainAssignment_0 )
            {
             before(grammarAccess.getERModelAccess().getDomainAssignment_0()); 
            // InternalErDsl2.g:342:2: ( rule__ERModel__DomainAssignment_0 )
            // InternalErDsl2.g:342:3: rule__ERModel__DomainAssignment_0
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
    // InternalErDsl2.g:350:1: rule__ERModel__Group__1 : rule__ERModel__Group__1__Impl rule__ERModel__Group__2 ;
    public final void rule__ERModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:354:1: ( rule__ERModel__Group__1__Impl rule__ERModel__Group__2 )
            // InternalErDsl2.g:355:2: rule__ERModel__Group__1__Impl rule__ERModel__Group__2
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
    // InternalErDsl2.g:362:1: rule__ERModel__Group__1__Impl : ( 'Entities{' ) ;
    public final void rule__ERModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:366:1: ( ( 'Entities{' ) )
            // InternalErDsl2.g:367:1: ( 'Entities{' )
            {
            // InternalErDsl2.g:367:1: ( 'Entities{' )
            // InternalErDsl2.g:368:2: 'Entities{'
            {
             before(grammarAccess.getERModelAccess().getEntitiesKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getEntitiesKeyword_1()); 

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
    // InternalErDsl2.g:377:1: rule__ERModel__Group__2 : rule__ERModel__Group__2__Impl rule__ERModel__Group__3 ;
    public final void rule__ERModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:381:1: ( rule__ERModel__Group__2__Impl rule__ERModel__Group__3 )
            // InternalErDsl2.g:382:2: rule__ERModel__Group__2__Impl rule__ERModel__Group__3
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
    // InternalErDsl2.g:389:1: rule__ERModel__Group__2__Impl : ( ( ( rule__ERModel__EntitiesAssignment_2 ) ) ( ( rule__ERModel__EntitiesAssignment_2 )* ) ) ;
    public final void rule__ERModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:393:1: ( ( ( ( rule__ERModel__EntitiesAssignment_2 ) ) ( ( rule__ERModel__EntitiesAssignment_2 )* ) ) )
            // InternalErDsl2.g:394:1: ( ( ( rule__ERModel__EntitiesAssignment_2 ) ) ( ( rule__ERModel__EntitiesAssignment_2 )* ) )
            {
            // InternalErDsl2.g:394:1: ( ( ( rule__ERModel__EntitiesAssignment_2 ) ) ( ( rule__ERModel__EntitiesAssignment_2 )* ) )
            // InternalErDsl2.g:395:2: ( ( rule__ERModel__EntitiesAssignment_2 ) ) ( ( rule__ERModel__EntitiesAssignment_2 )* )
            {
            // InternalErDsl2.g:395:2: ( ( rule__ERModel__EntitiesAssignment_2 ) )
            // InternalErDsl2.g:396:3: ( rule__ERModel__EntitiesAssignment_2 )
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_2()); 
            // InternalErDsl2.g:397:3: ( rule__ERModel__EntitiesAssignment_2 )
            // InternalErDsl2.g:397:4: rule__ERModel__EntitiesAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__ERModel__EntitiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getEntitiesAssignment_2()); 

            }

            // InternalErDsl2.g:400:2: ( ( rule__ERModel__EntitiesAssignment_2 )* )
            // InternalErDsl2.g:401:3: ( rule__ERModel__EntitiesAssignment_2 )*
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_2()); 
            // InternalErDsl2.g:402:3: ( rule__ERModel__EntitiesAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalErDsl2.g:402:4: rule__ERModel__EntitiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ERModel__EntitiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getERModelAccess().getEntitiesAssignment_2()); 

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
    // $ANTLR end "rule__ERModel__Group__2__Impl"


    // $ANTLR start "rule__ERModel__Group__3"
    // InternalErDsl2.g:411:1: rule__ERModel__Group__3 : rule__ERModel__Group__3__Impl rule__ERModel__Group__4 ;
    public final void rule__ERModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:415:1: ( rule__ERModel__Group__3__Impl rule__ERModel__Group__4 )
            // InternalErDsl2.g:416:2: rule__ERModel__Group__3__Impl rule__ERModel__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalErDsl2.g:423:1: rule__ERModel__Group__3__Impl : ( '}' ) ;
    public final void rule__ERModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:427:1: ( ( '}' ) )
            // InternalErDsl2.g:428:1: ( '}' )
            {
            // InternalErDsl2.g:428:1: ( '}' )
            // InternalErDsl2.g:429:2: '}'
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_3()); 

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
    // InternalErDsl2.g:438:1: rule__ERModel__Group__4 : rule__ERModel__Group__4__Impl rule__ERModel__Group__5 ;
    public final void rule__ERModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:442:1: ( rule__ERModel__Group__4__Impl rule__ERModel__Group__5 )
            // InternalErDsl2.g:443:2: rule__ERModel__Group__4__Impl rule__ERModel__Group__5
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
    // InternalErDsl2.g:450:1: rule__ERModel__Group__4__Impl : ( 'Relationships{' ) ;
    public final void rule__ERModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:454:1: ( ( 'Relationships{' ) )
            // InternalErDsl2.g:455:1: ( 'Relationships{' )
            {
            // InternalErDsl2.g:455:1: ( 'Relationships{' )
            // InternalErDsl2.g:456:2: 'Relationships{'
            {
             before(grammarAccess.getERModelAccess().getRelationshipsKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRelationshipsKeyword_4()); 

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
    // InternalErDsl2.g:465:1: rule__ERModel__Group__5 : rule__ERModel__Group__5__Impl rule__ERModel__Group__6 ;
    public final void rule__ERModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:469:1: ( rule__ERModel__Group__5__Impl rule__ERModel__Group__6 )
            // InternalErDsl2.g:470:2: rule__ERModel__Group__5__Impl rule__ERModel__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalErDsl2.g:477:1: rule__ERModel__Group__5__Impl : ( ( rule__ERModel__RelationsAssignment_5 )* ) ;
    public final void rule__ERModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:481:1: ( ( ( rule__ERModel__RelationsAssignment_5 )* ) )
            // InternalErDsl2.g:482:1: ( ( rule__ERModel__RelationsAssignment_5 )* )
            {
            // InternalErDsl2.g:482:1: ( ( rule__ERModel__RelationsAssignment_5 )* )
            // InternalErDsl2.g:483:2: ( rule__ERModel__RelationsAssignment_5 )*
            {
             before(grammarAccess.getERModelAccess().getRelationsAssignment_5()); 
            // InternalErDsl2.g:484:2: ( rule__ERModel__RelationsAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==29) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalErDsl2.g:484:3: rule__ERModel__RelationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ERModel__RelationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getERModelAccess().getRelationsAssignment_5()); 

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
    // InternalErDsl2.g:492:1: rule__ERModel__Group__6 : rule__ERModel__Group__6__Impl ;
    public final void rule__ERModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:496:1: ( rule__ERModel__Group__6__Impl )
            // InternalErDsl2.g:497:2: rule__ERModel__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group__6__Impl();

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
    // InternalErDsl2.g:503:1: rule__ERModel__Group__6__Impl : ( '}' ) ;
    public final void rule__ERModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:507:1: ( ( '}' ) )
            // InternalErDsl2.g:508:1: ( '}' )
            {
            // InternalErDsl2.g:508:1: ( '}' )
            // InternalErDsl2.g:509:2: '}'
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_6()); 

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


    // $ANTLR start "rule__Domain__Group__0"
    // InternalErDsl2.g:519:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:523:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalErDsl2.g:524:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalErDsl2.g:531:1: rule__Domain__Group__0__Impl : ( 'Domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:535:1: ( ( 'Domain' ) )
            // InternalErDsl2.g:536:1: ( 'Domain' )
            {
            // InternalErDsl2.g:536:1: ( 'Domain' )
            // InternalErDsl2.g:537:2: 'Domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalErDsl2.g:546:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:550:1: ( rule__Domain__Group__1__Impl )
            // InternalErDsl2.g:551:2: rule__Domain__Group__1__Impl
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
    // InternalErDsl2.g:557:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:561:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalErDsl2.g:562:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalErDsl2.g:562:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalErDsl2.g:563:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalErDsl2.g:564:2: ( rule__Domain__NameAssignment_1 )
            // InternalErDsl2.g:564:3: rule__Domain__NameAssignment_1
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
    // InternalErDsl2.g:573:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:577:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalErDsl2.g:578:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalErDsl2.g:585:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__IsKeyAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:589:1: ( ( ( rule__Attribute__IsKeyAssignment_0 )? ) )
            // InternalErDsl2.g:590:1: ( ( rule__Attribute__IsKeyAssignment_0 )? )
            {
            // InternalErDsl2.g:590:1: ( ( rule__Attribute__IsKeyAssignment_0 )? )
            // InternalErDsl2.g:591:2: ( rule__Attribute__IsKeyAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getIsKeyAssignment_0()); 
            // InternalErDsl2.g:592:2: ( rule__Attribute__IsKeyAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalErDsl2.g:592:3: rule__Attribute__IsKeyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__IsKeyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getIsKeyAssignment_0()); 

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
    // InternalErDsl2.g:600:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:604:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalErDsl2.g:605:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // InternalErDsl2.g:612:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:616:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalErDsl2.g:617:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalErDsl2.g:617:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalErDsl2.g:618:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalErDsl2.g:619:2: ( rule__Attribute__NameAssignment_1 )
            // InternalErDsl2.g:619:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalErDsl2.g:627:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:631:1: ( rule__Attribute__Group__2__Impl )
            // InternalErDsl2.g:632:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalErDsl2.g:638:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:642:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalErDsl2.g:643:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalErDsl2.g:643:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalErDsl2.g:644:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalErDsl2.g:645:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalErDsl2.g:645:3: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalErDsl2.g:654:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:658:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalErDsl2.g:659:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalErDsl2.g:666:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:670:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // InternalErDsl2.g:671:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // InternalErDsl2.g:671:1: ( ( rule__Entity__NameAssignment_0 ) )
            // InternalErDsl2.g:672:2: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // InternalErDsl2.g:673:2: ( rule__Entity__NameAssignment_0 )
            // InternalErDsl2.g:673:3: rule__Entity__NameAssignment_0
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
    // InternalErDsl2.g:681:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:685:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalErDsl2.g:686:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalErDsl2.g:693:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__Group_1__0 )* ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:697:1: ( ( ( rule__Entity__Group_1__0 )* ) )
            // InternalErDsl2.g:698:1: ( ( rule__Entity__Group_1__0 )* )
            {
            // InternalErDsl2.g:698:1: ( ( rule__Entity__Group_1__0 )* )
            // InternalErDsl2.g:699:2: ( rule__Entity__Group_1__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_1()); 
            // InternalErDsl2.g:700:2: ( rule__Entity__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalErDsl2.g:700:3: rule__Entity__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Entity__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalErDsl2.g:708:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:712:1: ( rule__Entity__Group__2__Impl )
            // InternalErDsl2.g:713:2: rule__Entity__Group__2__Impl
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
    // InternalErDsl2.g:719:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:723:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalErDsl2.g:724:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalErDsl2.g:724:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalErDsl2.g:725:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalErDsl2.g:726:2: ( rule__Entity__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalErDsl2.g:726:3: rule__Entity__Group_2__0
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
    // InternalErDsl2.g:735:1: rule__Entity__Group_1__0 : rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 ;
    public final void rule__Entity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:739:1: ( rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 )
            // InternalErDsl2.g:740:2: rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalErDsl2.g:747:1: rule__Entity__Group_1__0__Impl : ( 'is' ) ;
    public final void rule__Entity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:751:1: ( ( 'is' ) )
            // InternalErDsl2.g:752:1: ( 'is' )
            {
            // InternalErDsl2.g:752:1: ( 'is' )
            // InternalErDsl2.g:753:2: 'is'
            {
             before(grammarAccess.getEntityAccess().getIsKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalErDsl2.g:762:1: rule__Entity__Group_1__1 : rule__Entity__Group_1__1__Impl ;
    public final void rule__Entity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:766:1: ( rule__Entity__Group_1__1__Impl )
            // InternalErDsl2.g:767:2: rule__Entity__Group_1__1__Impl
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
    // InternalErDsl2.g:773:1: rule__Entity__Group_1__1__Impl : ( ( rule__Entity__IsAAssignment_1_1 ) ) ;
    public final void rule__Entity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:777:1: ( ( ( rule__Entity__IsAAssignment_1_1 ) ) )
            // InternalErDsl2.g:778:1: ( ( rule__Entity__IsAAssignment_1_1 ) )
            {
            // InternalErDsl2.g:778:1: ( ( rule__Entity__IsAAssignment_1_1 ) )
            // InternalErDsl2.g:779:2: ( rule__Entity__IsAAssignment_1_1 )
            {
             before(grammarAccess.getEntityAccess().getIsAAssignment_1_1()); 
            // InternalErDsl2.g:780:2: ( rule__Entity__IsAAssignment_1_1 )
            // InternalErDsl2.g:780:3: rule__Entity__IsAAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__IsAAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getIsAAssignment_1_1()); 

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
    // InternalErDsl2.g:789:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:793:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalErDsl2.g:794:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalErDsl2.g:801:1: rule__Entity__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:805:1: ( ( '{' ) )
            // InternalErDsl2.g:806:1: ( '{' )
            {
            // InternalErDsl2.g:806:1: ( '{' )
            // InternalErDsl2.g:807:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalErDsl2.g:816:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:820:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // InternalErDsl2.g:821:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
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
    // InternalErDsl2.g:828:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:832:1: ( ( ( rule__Entity__AttributesAssignment_2_1 ) ) )
            // InternalErDsl2.g:833:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            {
            // InternalErDsl2.g:833:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            // InternalErDsl2.g:834:2: ( rule__Entity__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_1()); 
            // InternalErDsl2.g:835:2: ( rule__Entity__AttributesAssignment_2_1 )
            // InternalErDsl2.g:835:3: rule__Entity__AttributesAssignment_2_1
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
    // InternalErDsl2.g:843:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:847:1: ( rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 )
            // InternalErDsl2.g:848:2: rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3
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
    // InternalErDsl2.g:855:1: rule__Entity__Group_2__2__Impl : ( ( rule__Entity__Group_2_2__0 )* ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:859:1: ( ( ( rule__Entity__Group_2_2__0 )* ) )
            // InternalErDsl2.g:860:1: ( ( rule__Entity__Group_2_2__0 )* )
            {
            // InternalErDsl2.g:860:1: ( ( rule__Entity__Group_2_2__0 )* )
            // InternalErDsl2.g:861:2: ( rule__Entity__Group_2_2__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_2_2()); 
            // InternalErDsl2.g:862:2: ( rule__Entity__Group_2_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalErDsl2.g:862:3: rule__Entity__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Entity__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalErDsl2.g:870:1: rule__Entity__Group_2__3 : rule__Entity__Group_2__3__Impl ;
    public final void rule__Entity__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:874:1: ( rule__Entity__Group_2__3__Impl )
            // InternalErDsl2.g:875:2: rule__Entity__Group_2__3__Impl
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
    // InternalErDsl2.g:881:1: rule__Entity__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Entity__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:885:1: ( ( '}' ) )
            // InternalErDsl2.g:886:1: ( '}' )
            {
            // InternalErDsl2.g:886:1: ( '}' )
            // InternalErDsl2.g:887:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalErDsl2.g:897:1: rule__Entity__Group_2_2__0 : rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 ;
    public final void rule__Entity__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:901:1: ( rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 )
            // InternalErDsl2.g:902:2: rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalErDsl2.g:909:1: rule__Entity__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:913:1: ( ( ',' ) )
            // InternalErDsl2.g:914:1: ( ',' )
            {
            // InternalErDsl2.g:914:1: ( ',' )
            // InternalErDsl2.g:915:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_2_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalErDsl2.g:924:1: rule__Entity__Group_2_2__1 : rule__Entity__Group_2_2__1__Impl ;
    public final void rule__Entity__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:928:1: ( rule__Entity__Group_2_2__1__Impl )
            // InternalErDsl2.g:929:2: rule__Entity__Group_2_2__1__Impl
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
    // InternalErDsl2.g:935:1: rule__Entity__Group_2_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Entity__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:939:1: ( ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) )
            // InternalErDsl2.g:940:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDsl2.g:940:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            // InternalErDsl2.g:941:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDsl2.g:942:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            // InternalErDsl2.g:942:3: rule__Entity__AttributesAssignment_2_2_1
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
    // InternalErDsl2.g:951:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:955:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalErDsl2.g:956:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
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
    // InternalErDsl2.g:963:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__NameAssignment_0 )? ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:967:1: ( ( ( rule__Relation__NameAssignment_0 )? ) )
            // InternalErDsl2.g:968:1: ( ( rule__Relation__NameAssignment_0 )? )
            {
            // InternalErDsl2.g:968:1: ( ( rule__Relation__NameAssignment_0 )? )
            // InternalErDsl2.g:969:2: ( rule__Relation__NameAssignment_0 )?
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_0()); 
            // InternalErDsl2.g:970:2: ( rule__Relation__NameAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalErDsl2.g:970:3: rule__Relation__NameAssignment_0
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
    // InternalErDsl2.g:978:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:982:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalErDsl2.g:983:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
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
    // InternalErDsl2.g:990:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__Group_1__0 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:994:1: ( ( ( rule__Relation__Group_1__0 ) ) )
            // InternalErDsl2.g:995:1: ( ( rule__Relation__Group_1__0 ) )
            {
            // InternalErDsl2.g:995:1: ( ( rule__Relation__Group_1__0 ) )
            // InternalErDsl2.g:996:2: ( rule__Relation__Group_1__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_1()); 
            // InternalErDsl2.g:997:2: ( rule__Relation__Group_1__0 )
            // InternalErDsl2.g:997:3: rule__Relation__Group_1__0
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
    // InternalErDsl2.g:1005:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1009:1: ( rule__Relation__Group__2__Impl )
            // InternalErDsl2.g:1010:2: rule__Relation__Group__2__Impl
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
    // InternalErDsl2.g:1016:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__Group_2__0 )* ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1020:1: ( ( ( rule__Relation__Group_2__0 )* ) )
            // InternalErDsl2.g:1021:1: ( ( rule__Relation__Group_2__0 )* )
            {
            // InternalErDsl2.g:1021:1: ( ( rule__Relation__Group_2__0 )* )
            // InternalErDsl2.g:1022:2: ( rule__Relation__Group_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2()); 
            // InternalErDsl2.g:1023:2: ( rule__Relation__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalErDsl2.g:1023:3: rule__Relation__Group_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Relation__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalErDsl2.g:1032:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1036:1: ( rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 )
            // InternalErDsl2.g:1037:2: rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1
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
    // InternalErDsl2.g:1044:1: rule__Relation__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1048:1: ( ( '[' ) )
            // InternalErDsl2.g:1049:1: ( '[' )
            {
            // InternalErDsl2.g:1049:1: ( '[' )
            // InternalErDsl2.g:1050:2: '['
            {
             before(grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalErDsl2.g:1059:1: rule__Relation__Group_1__1 : rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 ;
    public final void rule__Relation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1063:1: ( rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 )
            // InternalErDsl2.g:1064:2: rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2
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
    // InternalErDsl2.g:1071:1: rule__Relation__Group_1__1__Impl : ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) ;
    public final void rule__Relation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1075:1: ( ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) )
            // InternalErDsl2.g:1076:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            {
            // InternalErDsl2.g:1076:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            // InternalErDsl2.g:1077:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            {
             before(grammarAccess.getRelationAccess().getLeftEndingAssignment_1_1()); 
            // InternalErDsl2.g:1078:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            // InternalErDsl2.g:1078:3: rule__Relation__LeftEndingAssignment_1_1
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
    // InternalErDsl2.g:1086:1: rule__Relation__Group_1__2 : rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 ;
    public final void rule__Relation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1090:1: ( rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 )
            // InternalErDsl2.g:1091:2: rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3
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
    // InternalErDsl2.g:1098:1: rule__Relation__Group_1__2__Impl : ( 'relates' ) ;
    public final void rule__Relation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1102:1: ( ( 'relates' ) )
            // InternalErDsl2.g:1103:1: ( 'relates' )
            {
            // InternalErDsl2.g:1103:1: ( 'relates' )
            // InternalErDsl2.g:1104:2: 'relates'
            {
             before(grammarAccess.getRelationAccess().getRelatesKeyword_1_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalErDsl2.g:1113:1: rule__Relation__Group_1__3 : rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 ;
    public final void rule__Relation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1117:1: ( rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 )
            // InternalErDsl2.g:1118:2: rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4
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
    // InternalErDsl2.g:1125:1: rule__Relation__Group_1__3__Impl : ( ( rule__Relation__RightEndingAssignment_1_3 ) ) ;
    public final void rule__Relation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1129:1: ( ( ( rule__Relation__RightEndingAssignment_1_3 ) ) )
            // InternalErDsl2.g:1130:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            {
            // InternalErDsl2.g:1130:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            // InternalErDsl2.g:1131:2: ( rule__Relation__RightEndingAssignment_1_3 )
            {
             before(grammarAccess.getRelationAccess().getRightEndingAssignment_1_3()); 
            // InternalErDsl2.g:1132:2: ( rule__Relation__RightEndingAssignment_1_3 )
            // InternalErDsl2.g:1132:3: rule__Relation__RightEndingAssignment_1_3
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
    // InternalErDsl2.g:1140:1: rule__Relation__Group_1__4 : rule__Relation__Group_1__4__Impl ;
    public final void rule__Relation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1144:1: ( rule__Relation__Group_1__4__Impl )
            // InternalErDsl2.g:1145:2: rule__Relation__Group_1__4__Impl
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
    // InternalErDsl2.g:1151:1: rule__Relation__Group_1__4__Impl : ( ']' ) ;
    public final void rule__Relation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1155:1: ( ( ']' ) )
            // InternalErDsl2.g:1156:1: ( ']' )
            {
            // InternalErDsl2.g:1156:1: ( ']' )
            // InternalErDsl2.g:1157:2: ']'
            {
             before(grammarAccess.getRelationAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalErDsl2.g:1167:1: rule__Relation__Group_2__0 : rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 ;
    public final void rule__Relation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1171:1: ( rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 )
            // InternalErDsl2.g:1172:2: rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalErDsl2.g:1179:1: rule__Relation__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Relation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1183:1: ( ( '{' ) )
            // InternalErDsl2.g:1184:1: ( '{' )
            {
            // InternalErDsl2.g:1184:1: ( '{' )
            // InternalErDsl2.g:1185:2: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalErDsl2.g:1194:1: rule__Relation__Group_2__1 : rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 ;
    public final void rule__Relation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1198:1: ( rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 )
            // InternalErDsl2.g:1199:2: rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2
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
    // InternalErDsl2.g:1206:1: rule__Relation__Group_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_1 ) ) ;
    public final void rule__Relation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1210:1: ( ( ( rule__Relation__AttributesAssignment_2_1 ) ) )
            // InternalErDsl2.g:1211:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            {
            // InternalErDsl2.g:1211:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            // InternalErDsl2.g:1212:2: ( rule__Relation__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_1()); 
            // InternalErDsl2.g:1213:2: ( rule__Relation__AttributesAssignment_2_1 )
            // InternalErDsl2.g:1213:3: rule__Relation__AttributesAssignment_2_1
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
    // InternalErDsl2.g:1221:1: rule__Relation__Group_2__2 : rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 ;
    public final void rule__Relation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1225:1: ( rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 )
            // InternalErDsl2.g:1226:2: rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3
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
    // InternalErDsl2.g:1233:1: rule__Relation__Group_2__2__Impl : ( ( rule__Relation__Group_2_2__0 )* ) ;
    public final void rule__Relation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1237:1: ( ( ( rule__Relation__Group_2_2__0 )* ) )
            // InternalErDsl2.g:1238:1: ( ( rule__Relation__Group_2_2__0 )* )
            {
            // InternalErDsl2.g:1238:1: ( ( rule__Relation__Group_2_2__0 )* )
            // InternalErDsl2.g:1239:2: ( rule__Relation__Group_2_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2_2()); 
            // InternalErDsl2.g:1240:2: ( rule__Relation__Group_2_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalErDsl2.g:1240:3: rule__Relation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Relation__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalErDsl2.g:1248:1: rule__Relation__Group_2__3 : rule__Relation__Group_2__3__Impl ;
    public final void rule__Relation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1252:1: ( rule__Relation__Group_2__3__Impl )
            // InternalErDsl2.g:1253:2: rule__Relation__Group_2__3__Impl
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
    // InternalErDsl2.g:1259:1: rule__Relation__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Relation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1263:1: ( ( '}' ) )
            // InternalErDsl2.g:1264:1: ( '}' )
            {
            // InternalErDsl2.g:1264:1: ( '}' )
            // InternalErDsl2.g:1265:2: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalErDsl2.g:1275:1: rule__Relation__Group_2_2__0 : rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 ;
    public final void rule__Relation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1279:1: ( rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 )
            // InternalErDsl2.g:1280:2: rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalErDsl2.g:1287:1: rule__Relation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Relation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1291:1: ( ( ',' ) )
            // InternalErDsl2.g:1292:1: ( ',' )
            {
            // InternalErDsl2.g:1292:1: ( ',' )
            // InternalErDsl2.g:1293:2: ','
            {
             before(grammarAccess.getRelationAccess().getCommaKeyword_2_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalErDsl2.g:1302:1: rule__Relation__Group_2_2__1 : rule__Relation__Group_2_2__1__Impl ;
    public final void rule__Relation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1306:1: ( rule__Relation__Group_2_2__1__Impl )
            // InternalErDsl2.g:1307:2: rule__Relation__Group_2_2__1__Impl
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
    // InternalErDsl2.g:1313:1: rule__Relation__Group_2_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Relation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1317:1: ( ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) )
            // InternalErDsl2.g:1318:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDsl2.g:1318:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            // InternalErDsl2.g:1319:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDsl2.g:1320:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            // InternalErDsl2.g:1320:3: rule__Relation__AttributesAssignment_2_2_1
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
    // InternalErDsl2.g:1329:1: rule__RelationSide__Group_0__0 : rule__RelationSide__Group_0__0__Impl rule__RelationSide__Group_0__1 ;
    public final void rule__RelationSide__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1333:1: ( rule__RelationSide__Group_0__0__Impl rule__RelationSide__Group_0__1 )
            // InternalErDsl2.g:1334:2: rule__RelationSide__Group_0__0__Impl rule__RelationSide__Group_0__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalErDsl2.g:1341:1: rule__RelationSide__Group_0__0__Impl : ( ( rule__RelationSide__CardinalityAssignment_0_0 ) ) ;
    public final void rule__RelationSide__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1345:1: ( ( ( rule__RelationSide__CardinalityAssignment_0_0 ) ) )
            // InternalErDsl2.g:1346:1: ( ( rule__RelationSide__CardinalityAssignment_0_0 ) )
            {
            // InternalErDsl2.g:1346:1: ( ( rule__RelationSide__CardinalityAssignment_0_0 ) )
            // InternalErDsl2.g:1347:2: ( rule__RelationSide__CardinalityAssignment_0_0 )
            {
             before(grammarAccess.getRelationSideAccess().getCardinalityAssignment_0_0()); 
            // InternalErDsl2.g:1348:2: ( rule__RelationSide__CardinalityAssignment_0_0 )
            // InternalErDsl2.g:1348:3: rule__RelationSide__CardinalityAssignment_0_0
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
    // InternalErDsl2.g:1356:1: rule__RelationSide__Group_0__1 : rule__RelationSide__Group_0__1__Impl ;
    public final void rule__RelationSide__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1360:1: ( rule__RelationSide__Group_0__1__Impl )
            // InternalErDsl2.g:1361:2: rule__RelationSide__Group_0__1__Impl
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
    // InternalErDsl2.g:1367:1: rule__RelationSide__Group_0__1__Impl : ( ( rule__RelationSide__TargetAssignment_0_1 ) ) ;
    public final void rule__RelationSide__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1371:1: ( ( ( rule__RelationSide__TargetAssignment_0_1 ) ) )
            // InternalErDsl2.g:1372:1: ( ( rule__RelationSide__TargetAssignment_0_1 ) )
            {
            // InternalErDsl2.g:1372:1: ( ( rule__RelationSide__TargetAssignment_0_1 ) )
            // InternalErDsl2.g:1373:2: ( rule__RelationSide__TargetAssignment_0_1 )
            {
             before(grammarAccess.getRelationSideAccess().getTargetAssignment_0_1()); 
            // InternalErDsl2.g:1374:2: ( rule__RelationSide__TargetAssignment_0_1 )
            // InternalErDsl2.g:1374:3: rule__RelationSide__TargetAssignment_0_1
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
    // InternalErDsl2.g:1383:1: rule__ERModel__DomainAssignment_0 : ( ruleDomain ) ;
    public final void rule__ERModel__DomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1387:1: ( ( ruleDomain ) )
            // InternalErDsl2.g:1388:2: ( ruleDomain )
            {
            // InternalErDsl2.g:1388:2: ( ruleDomain )
            // InternalErDsl2.g:1389:3: ruleDomain
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


    // $ANTLR start "rule__ERModel__EntitiesAssignment_2"
    // InternalErDsl2.g:1398:1: rule__ERModel__EntitiesAssignment_2 : ( ruleEntity ) ;
    public final void rule__ERModel__EntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1402:1: ( ( ruleEntity ) )
            // InternalErDsl2.g:1403:2: ( ruleEntity )
            {
            // InternalErDsl2.g:1403:2: ( ruleEntity )
            // InternalErDsl2.g:1404:3: ruleEntity
            {
             before(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ERModel__EntitiesAssignment_2"


    // $ANTLR start "rule__ERModel__RelationsAssignment_5"
    // InternalErDsl2.g:1413:1: rule__ERModel__RelationsAssignment_5 : ( ruleRelation ) ;
    public final void rule__ERModel__RelationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1417:1: ( ( ruleRelation ) )
            // InternalErDsl2.g:1418:2: ( ruleRelation )
            {
            // InternalErDsl2.g:1418:2: ( ruleRelation )
            // InternalErDsl2.g:1419:3: ruleRelation
            {
             before(grammarAccess.getERModelAccess().getRelationsRelationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getRelationsRelationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ERModel__RelationsAssignment_5"


    // $ANTLR start "rule__Domain__NameAssignment_1"
    // InternalErDsl2.g:1428:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1432:1: ( ( RULE_ID ) )
            // InternalErDsl2.g:1433:2: ( RULE_ID )
            {
            // InternalErDsl2.g:1433:2: ( RULE_ID )
            // InternalErDsl2.g:1434:3: RULE_ID
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


    // $ANTLR start "rule__Attribute__IsKeyAssignment_0"
    // InternalErDsl2.g:1443:1: rule__Attribute__IsKeyAssignment_0 : ( ( '*' ) ) ;
    public final void rule__Attribute__IsKeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1447:1: ( ( ( '*' ) ) )
            // InternalErDsl2.g:1448:2: ( ( '*' ) )
            {
            // InternalErDsl2.g:1448:2: ( ( '*' ) )
            // InternalErDsl2.g:1449:3: ( '*' )
            {
             before(grammarAccess.getAttributeAccess().getIsKeyAsteriskKeyword_0_0()); 
            // InternalErDsl2.g:1450:3: ( '*' )
            // InternalErDsl2.g:1451:4: '*'
            {
             before(grammarAccess.getAttributeAccess().getIsKeyAsteriskKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsKeyAsteriskKeyword_0_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIsKeyAsteriskKeyword_0_0()); 

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
    // $ANTLR end "rule__Attribute__IsKeyAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalErDsl2.g:1462:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1466:1: ( ( RULE_ID ) )
            // InternalErDsl2.g:1467:2: ( RULE_ID )
            {
            // InternalErDsl2.g:1467:2: ( RULE_ID )
            // InternalErDsl2.g:1468:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalErDsl2.g:1477:1: rule__Attribute__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1481:1: ( ( ruleDataType ) )
            // InternalErDsl2.g:1482:2: ( ruleDataType )
            {
            // InternalErDsl2.g:1482:2: ( ruleDataType )
            // InternalErDsl2.g:1483:3: ruleDataType
            {
             before(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__Entity__NameAssignment_0"
    // InternalErDsl2.g:1492:1: rule__Entity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1496:1: ( ( RULE_ID ) )
            // InternalErDsl2.g:1497:2: ( RULE_ID )
            {
            // InternalErDsl2.g:1497:2: ( RULE_ID )
            // InternalErDsl2.g:1498:3: RULE_ID
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


    // $ANTLR start "rule__Entity__IsAAssignment_1_1"
    // InternalErDsl2.g:1507:1: rule__Entity__IsAAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__IsAAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1511:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl2.g:1512:2: ( ( RULE_ID ) )
            {
            // InternalErDsl2.g:1512:2: ( ( RULE_ID ) )
            // InternalErDsl2.g:1513:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getIsAEntityCrossReference_1_1_0()); 
            // InternalErDsl2.g:1514:3: ( RULE_ID )
            // InternalErDsl2.g:1515:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getIsAEntityIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getIsAEntityIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getIsAEntityCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__Entity__IsAAssignment_1_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_2_1"
    // InternalErDsl2.g:1526:1: rule__Entity__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1530:1: ( ( ruleAttribute ) )
            // InternalErDsl2.g:1531:2: ( ruleAttribute )
            {
            // InternalErDsl2.g:1531:2: ( ruleAttribute )
            // InternalErDsl2.g:1532:3: ruleAttribute
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
    // InternalErDsl2.g:1541:1: rule__Entity__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1545:1: ( ( ruleAttribute ) )
            // InternalErDsl2.g:1546:2: ( ruleAttribute )
            {
            // InternalErDsl2.g:1546:2: ( ruleAttribute )
            // InternalErDsl2.g:1547:3: ruleAttribute
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
    // InternalErDsl2.g:1556:1: rule__Relation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1560:1: ( ( RULE_ID ) )
            // InternalErDsl2.g:1561:2: ( RULE_ID )
            {
            // InternalErDsl2.g:1561:2: ( RULE_ID )
            // InternalErDsl2.g:1562:3: RULE_ID
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
    // InternalErDsl2.g:1571:1: rule__Relation__LeftEndingAssignment_1_1 : ( ruleRelationSide ) ;
    public final void rule__Relation__LeftEndingAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1575:1: ( ( ruleRelationSide ) )
            // InternalErDsl2.g:1576:2: ( ruleRelationSide )
            {
            // InternalErDsl2.g:1576:2: ( ruleRelationSide )
            // InternalErDsl2.g:1577:3: ruleRelationSide
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
    // InternalErDsl2.g:1586:1: rule__Relation__RightEndingAssignment_1_3 : ( ruleRelationSide ) ;
    public final void rule__Relation__RightEndingAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1590:1: ( ( ruleRelationSide ) )
            // InternalErDsl2.g:1591:2: ( ruleRelationSide )
            {
            // InternalErDsl2.g:1591:2: ( ruleRelationSide )
            // InternalErDsl2.g:1592:3: ruleRelationSide
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
    // InternalErDsl2.g:1601:1: rule__Relation__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1605:1: ( ( ruleAttribute ) )
            // InternalErDsl2.g:1606:2: ( ruleAttribute )
            {
            // InternalErDsl2.g:1606:2: ( ruleAttribute )
            // InternalErDsl2.g:1607:3: ruleAttribute
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
    // InternalErDsl2.g:1616:1: rule__Relation__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1620:1: ( ( ruleAttribute ) )
            // InternalErDsl2.g:1621:2: ( ruleAttribute )
            {
            // InternalErDsl2.g:1621:2: ( ruleAttribute )
            // InternalErDsl2.g:1622:3: ruleAttribute
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
    // InternalErDsl2.g:1631:1: rule__RelationSide__CardinalityAssignment_0_0 : ( ( rule__RelationSide__CardinalityAlternatives_0_0_0 ) ) ;
    public final void rule__RelationSide__CardinalityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1635:1: ( ( ( rule__RelationSide__CardinalityAlternatives_0_0_0 ) ) )
            // InternalErDsl2.g:1636:2: ( ( rule__RelationSide__CardinalityAlternatives_0_0_0 ) )
            {
            // InternalErDsl2.g:1636:2: ( ( rule__RelationSide__CardinalityAlternatives_0_0_0 ) )
            // InternalErDsl2.g:1637:3: ( rule__RelationSide__CardinalityAlternatives_0_0_0 )
            {
             before(grammarAccess.getRelationSideAccess().getCardinalityAlternatives_0_0_0()); 
            // InternalErDsl2.g:1638:3: ( rule__RelationSide__CardinalityAlternatives_0_0_0 )
            // InternalErDsl2.g:1638:4: rule__RelationSide__CardinalityAlternatives_0_0_0
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
    // InternalErDsl2.g:1646:1: rule__RelationSide__TargetAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSide__TargetAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1650:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl2.g:1651:2: ( ( RULE_ID ) )
            {
            // InternalErDsl2.g:1651:2: ( ( RULE_ID ) )
            // InternalErDsl2.g:1652:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideAccess().getTargetEntityCrossReference_0_1_0()); 
            // InternalErDsl2.g:1653:3: ( RULE_ID )
            // InternalErDsl2.g:1654:4: RULE_ID
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
    // InternalErDsl2.g:1665:1: rule__RelationSide__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSide__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1669:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl2.g:1670:2: ( ( RULE_ID ) )
            {
            // InternalErDsl2.g:1670:2: ( ( RULE_ID ) )
            // InternalErDsl2.g:1671:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideAccess().getTargetRelationCrossReference_1_0()); 
            // InternalErDsl2.g:1672:3: ( RULE_ID )
            // InternalErDsl2.g:1673:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020800010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003F8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000007810L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});

}