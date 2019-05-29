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
    // InternalErDsl2.g:187:1: ruleRelationSide : ( ( rule__RelationSide__Group__0 ) ) ;
    public final void ruleRelationSide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:191:2: ( ( ( rule__RelationSide__Group__0 ) ) )
            // InternalErDsl2.g:192:2: ( ( rule__RelationSide__Group__0 ) )
            {
            // InternalErDsl2.g:192:2: ( ( rule__RelationSide__Group__0 ) )
            // InternalErDsl2.g:193:3: ( rule__RelationSide__Group__0 )
            {
             before(grammarAccess.getRelationSideAccess().getGroup()); 
            // InternalErDsl2.g:194:3: ( rule__RelationSide__Group__0 )
            // InternalErDsl2.g:194:4: rule__RelationSide__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationSide__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideAccess().getGroup()); 

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


    // $ANTLR start "rule__RelationSide__CardinalityAlternatives_0_0"
    // InternalErDsl2.g:218:1: rule__RelationSide__CardinalityAlternatives_0_0 : ( ( '(0,1)' ) | ( '(1,1)' ) | ( '(0,N)' ) | ( '(1,N)' ) );
    public final void rule__RelationSide__CardinalityAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:222:1: ( ( '(0,1)' ) | ( '(1,1)' ) | ( '(0,N)' ) | ( '(1,N)' ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
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
                    // InternalErDsl2.g:223:2: ( '(0,1)' )
                    {
                    // InternalErDsl2.g:223:2: ( '(0,1)' )
                    // InternalErDsl2.g:224:3: '(0,1)'
                    {
                     before(grammarAccess.getRelationSideAccess().getCardinality01Keyword_0_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getRelationSideAccess().getCardinality01Keyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl2.g:229:2: ( '(1,1)' )
                    {
                    // InternalErDsl2.g:229:2: ( '(1,1)' )
                    // InternalErDsl2.g:230:3: '(1,1)'
                    {
                     before(grammarAccess.getRelationSideAccess().getCardinality11Keyword_0_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getRelationSideAccess().getCardinality11Keyword_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl2.g:235:2: ( '(0,N)' )
                    {
                    // InternalErDsl2.g:235:2: ( '(0,N)' )
                    // InternalErDsl2.g:236:3: '(0,N)'
                    {
                     before(grammarAccess.getRelationSideAccess().getCardinality0NKeyword_0_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRelationSideAccess().getCardinality0NKeyword_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl2.g:241:2: ( '(1,N)' )
                    {
                    // InternalErDsl2.g:241:2: ( '(1,N)' )
                    // InternalErDsl2.g:242:3: '(1,N)'
                    {
                     before(grammarAccess.getRelationSideAccess().getCardinality1NKeyword_0_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRelationSideAccess().getCardinality1NKeyword_0_0_3()); 

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
    // $ANTLR end "rule__RelationSide__CardinalityAlternatives_0_0"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalErDsl2.g:251:1: rule__DataType__Alternatives : ( ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'money' ) ) | ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'datetime' ) ) | ( ( 'file' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:255:1: ( ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'money' ) ) | ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'datetime' ) ) | ( ( 'file' ) ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            case 19:
                {
                alt2=5;
                }
                break;
            case 20:
                {
                alt2=6;
                }
                break;
            case 21:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalErDsl2.g:256:2: ( ( 'int' ) )
                    {
                    // InternalErDsl2.g:256:2: ( ( 'int' ) )
                    // InternalErDsl2.g:257:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalErDsl2.g:258:3: ( 'int' )
                    // InternalErDsl2.g:258:4: 'int'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl2.g:262:2: ( ( 'double' ) )
                    {
                    // InternalErDsl2.g:262:2: ( ( 'double' ) )
                    // InternalErDsl2.g:263:3: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                    // InternalErDsl2.g:264:3: ( 'double' )
                    // InternalErDsl2.g:264:4: 'double'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl2.g:268:2: ( ( 'money' ) )
                    {
                    // InternalErDsl2.g:268:2: ( ( 'money' ) )
                    // InternalErDsl2.g:269:3: ( 'money' )
                    {
                     before(grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2()); 
                    // InternalErDsl2.g:270:3: ( 'money' )
                    // InternalErDsl2.g:270:4: 'money'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl2.g:274:2: ( ( 'string' ) )
                    {
                    // InternalErDsl2.g:274:2: ( ( 'string' ) )
                    // InternalErDsl2.g:275:3: ( 'string' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                    // InternalErDsl2.g:276:3: ( 'string' )
                    // InternalErDsl2.g:276:4: 'string'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalErDsl2.g:280:2: ( ( 'boolean' ) )
                    {
                    // InternalErDsl2.g:280:2: ( ( 'boolean' ) )
                    // InternalErDsl2.g:281:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 
                    // InternalErDsl2.g:282:3: ( 'boolean' )
                    // InternalErDsl2.g:282:4: 'boolean'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalErDsl2.g:286:2: ( ( 'datetime' ) )
                    {
                    // InternalErDsl2.g:286:2: ( ( 'datetime' ) )
                    // InternalErDsl2.g:287:3: ( 'datetime' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5()); 
                    // InternalErDsl2.g:288:3: ( 'datetime' )
                    // InternalErDsl2.g:288:4: 'datetime'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalErDsl2.g:292:2: ( ( 'file' ) )
                    {
                    // InternalErDsl2.g:292:2: ( ( 'file' ) )
                    // InternalErDsl2.g:293:3: ( 'file' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBLOBEnumLiteralDeclaration_6()); 
                    // InternalErDsl2.g:294:3: ( 'file' )
                    // InternalErDsl2.g:294:4: 'file'
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
    // InternalErDsl2.g:302:1: rule__ERModel__Group__0 : rule__ERModel__Group__0__Impl rule__ERModel__Group__1 ;
    public final void rule__ERModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:306:1: ( rule__ERModel__Group__0__Impl rule__ERModel__Group__1 )
            // InternalErDsl2.g:307:2: rule__ERModel__Group__0__Impl rule__ERModel__Group__1
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
    // InternalErDsl2.g:314:1: rule__ERModel__Group__0__Impl : ( ( rule__ERModel__DomainAssignment_0 ) ) ;
    public final void rule__ERModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:318:1: ( ( ( rule__ERModel__DomainAssignment_0 ) ) )
            // InternalErDsl2.g:319:1: ( ( rule__ERModel__DomainAssignment_0 ) )
            {
            // InternalErDsl2.g:319:1: ( ( rule__ERModel__DomainAssignment_0 ) )
            // InternalErDsl2.g:320:2: ( rule__ERModel__DomainAssignment_0 )
            {
             before(grammarAccess.getERModelAccess().getDomainAssignment_0()); 
            // InternalErDsl2.g:321:2: ( rule__ERModel__DomainAssignment_0 )
            // InternalErDsl2.g:321:3: rule__ERModel__DomainAssignment_0
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
    // InternalErDsl2.g:329:1: rule__ERModel__Group__1 : rule__ERModel__Group__1__Impl rule__ERModel__Group__2 ;
    public final void rule__ERModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:333:1: ( rule__ERModel__Group__1__Impl rule__ERModel__Group__2 )
            // InternalErDsl2.g:334:2: rule__ERModel__Group__1__Impl rule__ERModel__Group__2
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
    // InternalErDsl2.g:341:1: rule__ERModel__Group__1__Impl : ( 'Entities{' ) ;
    public final void rule__ERModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:345:1: ( ( 'Entities{' ) )
            // InternalErDsl2.g:346:1: ( 'Entities{' )
            {
            // InternalErDsl2.g:346:1: ( 'Entities{' )
            // InternalErDsl2.g:347:2: 'Entities{'
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
    // InternalErDsl2.g:356:1: rule__ERModel__Group__2 : rule__ERModel__Group__2__Impl rule__ERModel__Group__3 ;
    public final void rule__ERModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:360:1: ( rule__ERModel__Group__2__Impl rule__ERModel__Group__3 )
            // InternalErDsl2.g:361:2: rule__ERModel__Group__2__Impl rule__ERModel__Group__3
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
    // InternalErDsl2.g:368:1: rule__ERModel__Group__2__Impl : ( ( ( rule__ERModel__EntitiesAssignment_2 ) ) ( ( rule__ERModel__EntitiesAssignment_2 )* ) ) ;
    public final void rule__ERModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:372:1: ( ( ( ( rule__ERModel__EntitiesAssignment_2 ) ) ( ( rule__ERModel__EntitiesAssignment_2 )* ) ) )
            // InternalErDsl2.g:373:1: ( ( ( rule__ERModel__EntitiesAssignment_2 ) ) ( ( rule__ERModel__EntitiesAssignment_2 )* ) )
            {
            // InternalErDsl2.g:373:1: ( ( ( rule__ERModel__EntitiesAssignment_2 ) ) ( ( rule__ERModel__EntitiesAssignment_2 )* ) )
            // InternalErDsl2.g:374:2: ( ( rule__ERModel__EntitiesAssignment_2 ) ) ( ( rule__ERModel__EntitiesAssignment_2 )* )
            {
            // InternalErDsl2.g:374:2: ( ( rule__ERModel__EntitiesAssignment_2 ) )
            // InternalErDsl2.g:375:3: ( rule__ERModel__EntitiesAssignment_2 )
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_2()); 
            // InternalErDsl2.g:376:3: ( rule__ERModel__EntitiesAssignment_2 )
            // InternalErDsl2.g:376:4: rule__ERModel__EntitiesAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__ERModel__EntitiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getEntitiesAssignment_2()); 

            }

            // InternalErDsl2.g:379:2: ( ( rule__ERModel__EntitiesAssignment_2 )* )
            // InternalErDsl2.g:380:3: ( rule__ERModel__EntitiesAssignment_2 )*
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_2()); 
            // InternalErDsl2.g:381:3: ( rule__ERModel__EntitiesAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalErDsl2.g:381:4: rule__ERModel__EntitiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ERModel__EntitiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalErDsl2.g:390:1: rule__ERModel__Group__3 : rule__ERModel__Group__3__Impl rule__ERModel__Group__4 ;
    public final void rule__ERModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:394:1: ( rule__ERModel__Group__3__Impl rule__ERModel__Group__4 )
            // InternalErDsl2.g:395:2: rule__ERModel__Group__3__Impl rule__ERModel__Group__4
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
    // InternalErDsl2.g:402:1: rule__ERModel__Group__3__Impl : ( '}' ) ;
    public final void rule__ERModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:406:1: ( ( '}' ) )
            // InternalErDsl2.g:407:1: ( '}' )
            {
            // InternalErDsl2.g:407:1: ( '}' )
            // InternalErDsl2.g:408:2: '}'
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
    // InternalErDsl2.g:417:1: rule__ERModel__Group__4 : rule__ERModel__Group__4__Impl rule__ERModel__Group__5 ;
    public final void rule__ERModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:421:1: ( rule__ERModel__Group__4__Impl rule__ERModel__Group__5 )
            // InternalErDsl2.g:422:2: rule__ERModel__Group__4__Impl rule__ERModel__Group__5
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
    // InternalErDsl2.g:429:1: rule__ERModel__Group__4__Impl : ( 'Relationships{' ) ;
    public final void rule__ERModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:433:1: ( ( 'Relationships{' ) )
            // InternalErDsl2.g:434:1: ( 'Relationships{' )
            {
            // InternalErDsl2.g:434:1: ( 'Relationships{' )
            // InternalErDsl2.g:435:2: 'Relationships{'
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
    // InternalErDsl2.g:444:1: rule__ERModel__Group__5 : rule__ERModel__Group__5__Impl rule__ERModel__Group__6 ;
    public final void rule__ERModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:448:1: ( rule__ERModel__Group__5__Impl rule__ERModel__Group__6 )
            // InternalErDsl2.g:449:2: rule__ERModel__Group__5__Impl rule__ERModel__Group__6
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
    // InternalErDsl2.g:456:1: rule__ERModel__Group__5__Impl : ( ( rule__ERModel__RelationsAssignment_5 )* ) ;
    public final void rule__ERModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:460:1: ( ( ( rule__ERModel__RelationsAssignment_5 )* ) )
            // InternalErDsl2.g:461:1: ( ( rule__ERModel__RelationsAssignment_5 )* )
            {
            // InternalErDsl2.g:461:1: ( ( rule__ERModel__RelationsAssignment_5 )* )
            // InternalErDsl2.g:462:2: ( rule__ERModel__RelationsAssignment_5 )*
            {
             before(grammarAccess.getERModelAccess().getRelationsAssignment_5()); 
            // InternalErDsl2.g:463:2: ( rule__ERModel__RelationsAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==29) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalErDsl2.g:463:3: rule__ERModel__RelationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ERModel__RelationsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalErDsl2.g:471:1: rule__ERModel__Group__6 : rule__ERModel__Group__6__Impl ;
    public final void rule__ERModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:475:1: ( rule__ERModel__Group__6__Impl )
            // InternalErDsl2.g:476:2: rule__ERModel__Group__6__Impl
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
    // InternalErDsl2.g:482:1: rule__ERModel__Group__6__Impl : ( '}' ) ;
    public final void rule__ERModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:486:1: ( ( '}' ) )
            // InternalErDsl2.g:487:1: ( '}' )
            {
            // InternalErDsl2.g:487:1: ( '}' )
            // InternalErDsl2.g:488:2: '}'
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
    // InternalErDsl2.g:498:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:502:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalErDsl2.g:503:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalErDsl2.g:510:1: rule__Domain__Group__0__Impl : ( 'Domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:514:1: ( ( 'Domain' ) )
            // InternalErDsl2.g:515:1: ( 'Domain' )
            {
            // InternalErDsl2.g:515:1: ( 'Domain' )
            // InternalErDsl2.g:516:2: 'Domain'
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
    // InternalErDsl2.g:525:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:529:1: ( rule__Domain__Group__1__Impl )
            // InternalErDsl2.g:530:2: rule__Domain__Group__1__Impl
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
    // InternalErDsl2.g:536:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:540:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalErDsl2.g:541:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalErDsl2.g:541:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalErDsl2.g:542:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalErDsl2.g:543:2: ( rule__Domain__NameAssignment_1 )
            // InternalErDsl2.g:543:3: rule__Domain__NameAssignment_1
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
    // InternalErDsl2.g:552:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:556:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalErDsl2.g:557:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalErDsl2.g:564:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__IsKeyAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:568:1: ( ( ( rule__Attribute__IsKeyAssignment_0 )? ) )
            // InternalErDsl2.g:569:1: ( ( rule__Attribute__IsKeyAssignment_0 )? )
            {
            // InternalErDsl2.g:569:1: ( ( rule__Attribute__IsKeyAssignment_0 )? )
            // InternalErDsl2.g:570:2: ( rule__Attribute__IsKeyAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getIsKeyAssignment_0()); 
            // InternalErDsl2.g:571:2: ( rule__Attribute__IsKeyAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalErDsl2.g:571:3: rule__Attribute__IsKeyAssignment_0
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
    // InternalErDsl2.g:579:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:583:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalErDsl2.g:584:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalErDsl2.g:591:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:595:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalErDsl2.g:596:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalErDsl2.g:596:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalErDsl2.g:597:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalErDsl2.g:598:2: ( rule__Attribute__NameAssignment_1 )
            // InternalErDsl2.g:598:3: rule__Attribute__NameAssignment_1
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
    // InternalErDsl2.g:606:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:610:1: ( rule__Attribute__Group__2__Impl )
            // InternalErDsl2.g:611:2: rule__Attribute__Group__2__Impl
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
    // InternalErDsl2.g:617:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:621:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalErDsl2.g:622:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalErDsl2.g:622:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalErDsl2.g:623:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalErDsl2.g:624:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalErDsl2.g:624:3: rule__Attribute__TypeAssignment_2
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
    // InternalErDsl2.g:633:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:637:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalErDsl2.g:638:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalErDsl2.g:645:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:649:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // InternalErDsl2.g:650:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // InternalErDsl2.g:650:1: ( ( rule__Entity__NameAssignment_0 ) )
            // InternalErDsl2.g:651:2: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // InternalErDsl2.g:652:2: ( rule__Entity__NameAssignment_0 )
            // InternalErDsl2.g:652:3: rule__Entity__NameAssignment_0
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
    // InternalErDsl2.g:660:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:664:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalErDsl2.g:665:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalErDsl2.g:672:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__Group_1__0 )* ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:676:1: ( ( ( rule__Entity__Group_1__0 )* ) )
            // InternalErDsl2.g:677:1: ( ( rule__Entity__Group_1__0 )* )
            {
            // InternalErDsl2.g:677:1: ( ( rule__Entity__Group_1__0 )* )
            // InternalErDsl2.g:678:2: ( rule__Entity__Group_1__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_1()); 
            // InternalErDsl2.g:679:2: ( rule__Entity__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalErDsl2.g:679:3: rule__Entity__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalErDsl2.g:687:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:691:1: ( rule__Entity__Group__2__Impl )
            // InternalErDsl2.g:692:2: rule__Entity__Group__2__Impl
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
    // InternalErDsl2.g:698:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:702:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalErDsl2.g:703:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalErDsl2.g:703:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalErDsl2.g:704:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalErDsl2.g:705:2: ( rule__Entity__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalErDsl2.g:705:3: rule__Entity__Group_2__0
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
    // InternalErDsl2.g:714:1: rule__Entity__Group_1__0 : rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 ;
    public final void rule__Entity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:718:1: ( rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 )
            // InternalErDsl2.g:719:2: rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1
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
    // InternalErDsl2.g:726:1: rule__Entity__Group_1__0__Impl : ( 'is' ) ;
    public final void rule__Entity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:730:1: ( ( 'is' ) )
            // InternalErDsl2.g:731:1: ( 'is' )
            {
            // InternalErDsl2.g:731:1: ( 'is' )
            // InternalErDsl2.g:732:2: 'is'
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
    // InternalErDsl2.g:741:1: rule__Entity__Group_1__1 : rule__Entity__Group_1__1__Impl ;
    public final void rule__Entity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:745:1: ( rule__Entity__Group_1__1__Impl )
            // InternalErDsl2.g:746:2: rule__Entity__Group_1__1__Impl
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
    // InternalErDsl2.g:752:1: rule__Entity__Group_1__1__Impl : ( ( rule__Entity__IsAAssignment_1_1 ) ) ;
    public final void rule__Entity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:756:1: ( ( ( rule__Entity__IsAAssignment_1_1 ) ) )
            // InternalErDsl2.g:757:1: ( ( rule__Entity__IsAAssignment_1_1 ) )
            {
            // InternalErDsl2.g:757:1: ( ( rule__Entity__IsAAssignment_1_1 ) )
            // InternalErDsl2.g:758:2: ( rule__Entity__IsAAssignment_1_1 )
            {
             before(grammarAccess.getEntityAccess().getIsAAssignment_1_1()); 
            // InternalErDsl2.g:759:2: ( rule__Entity__IsAAssignment_1_1 )
            // InternalErDsl2.g:759:3: rule__Entity__IsAAssignment_1_1
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
    // InternalErDsl2.g:768:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:772:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalErDsl2.g:773:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
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
    // InternalErDsl2.g:780:1: rule__Entity__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:784:1: ( ( '{' ) )
            // InternalErDsl2.g:785:1: ( '{' )
            {
            // InternalErDsl2.g:785:1: ( '{' )
            // InternalErDsl2.g:786:2: '{'
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
    // InternalErDsl2.g:795:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:799:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // InternalErDsl2.g:800:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
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
    // InternalErDsl2.g:807:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:811:1: ( ( ( rule__Entity__AttributesAssignment_2_1 ) ) )
            // InternalErDsl2.g:812:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            {
            // InternalErDsl2.g:812:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            // InternalErDsl2.g:813:2: ( rule__Entity__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_1()); 
            // InternalErDsl2.g:814:2: ( rule__Entity__AttributesAssignment_2_1 )
            // InternalErDsl2.g:814:3: rule__Entity__AttributesAssignment_2_1
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
    // InternalErDsl2.g:822:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:826:1: ( rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 )
            // InternalErDsl2.g:827:2: rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3
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
    // InternalErDsl2.g:834:1: rule__Entity__Group_2__2__Impl : ( ( rule__Entity__Group_2_2__0 )* ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:838:1: ( ( ( rule__Entity__Group_2_2__0 )* ) )
            // InternalErDsl2.g:839:1: ( ( rule__Entity__Group_2_2__0 )* )
            {
            // InternalErDsl2.g:839:1: ( ( rule__Entity__Group_2_2__0 )* )
            // InternalErDsl2.g:840:2: ( rule__Entity__Group_2_2__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_2_2()); 
            // InternalErDsl2.g:841:2: ( rule__Entity__Group_2_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==28) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalErDsl2.g:841:3: rule__Entity__Group_2_2__0
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
    // InternalErDsl2.g:849:1: rule__Entity__Group_2__3 : rule__Entity__Group_2__3__Impl ;
    public final void rule__Entity__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:853:1: ( rule__Entity__Group_2__3__Impl )
            // InternalErDsl2.g:854:2: rule__Entity__Group_2__3__Impl
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
    // InternalErDsl2.g:860:1: rule__Entity__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Entity__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:864:1: ( ( '}' ) )
            // InternalErDsl2.g:865:1: ( '}' )
            {
            // InternalErDsl2.g:865:1: ( '}' )
            // InternalErDsl2.g:866:2: '}'
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
    // InternalErDsl2.g:876:1: rule__Entity__Group_2_2__0 : rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 ;
    public final void rule__Entity__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:880:1: ( rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 )
            // InternalErDsl2.g:881:2: rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1
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
    // InternalErDsl2.g:888:1: rule__Entity__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:892:1: ( ( ',' ) )
            // InternalErDsl2.g:893:1: ( ',' )
            {
            // InternalErDsl2.g:893:1: ( ',' )
            // InternalErDsl2.g:894:2: ','
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
    // InternalErDsl2.g:903:1: rule__Entity__Group_2_2__1 : rule__Entity__Group_2_2__1__Impl ;
    public final void rule__Entity__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:907:1: ( rule__Entity__Group_2_2__1__Impl )
            // InternalErDsl2.g:908:2: rule__Entity__Group_2_2__1__Impl
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
    // InternalErDsl2.g:914:1: rule__Entity__Group_2_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Entity__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:918:1: ( ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) )
            // InternalErDsl2.g:919:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDsl2.g:919:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            // InternalErDsl2.g:920:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDsl2.g:921:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            // InternalErDsl2.g:921:3: rule__Entity__AttributesAssignment_2_2_1
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
    // InternalErDsl2.g:930:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:934:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalErDsl2.g:935:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
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
    // InternalErDsl2.g:942:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__NameAssignment_0 )? ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:946:1: ( ( ( rule__Relation__NameAssignment_0 )? ) )
            // InternalErDsl2.g:947:1: ( ( rule__Relation__NameAssignment_0 )? )
            {
            // InternalErDsl2.g:947:1: ( ( rule__Relation__NameAssignment_0 )? )
            // InternalErDsl2.g:948:2: ( rule__Relation__NameAssignment_0 )?
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_0()); 
            // InternalErDsl2.g:949:2: ( rule__Relation__NameAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalErDsl2.g:949:3: rule__Relation__NameAssignment_0
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
    // InternalErDsl2.g:957:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:961:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalErDsl2.g:962:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
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
    // InternalErDsl2.g:969:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__Group_1__0 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:973:1: ( ( ( rule__Relation__Group_1__0 ) ) )
            // InternalErDsl2.g:974:1: ( ( rule__Relation__Group_1__0 ) )
            {
            // InternalErDsl2.g:974:1: ( ( rule__Relation__Group_1__0 ) )
            // InternalErDsl2.g:975:2: ( rule__Relation__Group_1__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_1()); 
            // InternalErDsl2.g:976:2: ( rule__Relation__Group_1__0 )
            // InternalErDsl2.g:976:3: rule__Relation__Group_1__0
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
    // InternalErDsl2.g:984:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:988:1: ( rule__Relation__Group__2__Impl )
            // InternalErDsl2.g:989:2: rule__Relation__Group__2__Impl
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
    // InternalErDsl2.g:995:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__Group_2__0 )* ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:999:1: ( ( ( rule__Relation__Group_2__0 )* ) )
            // InternalErDsl2.g:1000:1: ( ( rule__Relation__Group_2__0 )* )
            {
            // InternalErDsl2.g:1000:1: ( ( rule__Relation__Group_2__0 )* )
            // InternalErDsl2.g:1001:2: ( rule__Relation__Group_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2()); 
            // InternalErDsl2.g:1002:2: ( rule__Relation__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalErDsl2.g:1002:3: rule__Relation__Group_2__0
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
    // InternalErDsl2.g:1011:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1015:1: ( rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 )
            // InternalErDsl2.g:1016:2: rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1
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
    // InternalErDsl2.g:1023:1: rule__Relation__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1027:1: ( ( '[' ) )
            // InternalErDsl2.g:1028:1: ( '[' )
            {
            // InternalErDsl2.g:1028:1: ( '[' )
            // InternalErDsl2.g:1029:2: '['
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
    // InternalErDsl2.g:1038:1: rule__Relation__Group_1__1 : rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 ;
    public final void rule__Relation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1042:1: ( rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 )
            // InternalErDsl2.g:1043:2: rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2
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
    // InternalErDsl2.g:1050:1: rule__Relation__Group_1__1__Impl : ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) ;
    public final void rule__Relation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1054:1: ( ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) )
            // InternalErDsl2.g:1055:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            {
            // InternalErDsl2.g:1055:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            // InternalErDsl2.g:1056:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            {
             before(grammarAccess.getRelationAccess().getLeftEndingAssignment_1_1()); 
            // InternalErDsl2.g:1057:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            // InternalErDsl2.g:1057:3: rule__Relation__LeftEndingAssignment_1_1
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
    // InternalErDsl2.g:1065:1: rule__Relation__Group_1__2 : rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 ;
    public final void rule__Relation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1069:1: ( rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 )
            // InternalErDsl2.g:1070:2: rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3
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
    // InternalErDsl2.g:1077:1: rule__Relation__Group_1__2__Impl : ( 'relates' ) ;
    public final void rule__Relation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1081:1: ( ( 'relates' ) )
            // InternalErDsl2.g:1082:1: ( 'relates' )
            {
            // InternalErDsl2.g:1082:1: ( 'relates' )
            // InternalErDsl2.g:1083:2: 'relates'
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
    // InternalErDsl2.g:1092:1: rule__Relation__Group_1__3 : rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 ;
    public final void rule__Relation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1096:1: ( rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 )
            // InternalErDsl2.g:1097:2: rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4
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
    // InternalErDsl2.g:1104:1: rule__Relation__Group_1__3__Impl : ( ( rule__Relation__RightEndingAssignment_1_3 ) ) ;
    public final void rule__Relation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1108:1: ( ( ( rule__Relation__RightEndingAssignment_1_3 ) ) )
            // InternalErDsl2.g:1109:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            {
            // InternalErDsl2.g:1109:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            // InternalErDsl2.g:1110:2: ( rule__Relation__RightEndingAssignment_1_3 )
            {
             before(grammarAccess.getRelationAccess().getRightEndingAssignment_1_3()); 
            // InternalErDsl2.g:1111:2: ( rule__Relation__RightEndingAssignment_1_3 )
            // InternalErDsl2.g:1111:3: rule__Relation__RightEndingAssignment_1_3
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
    // InternalErDsl2.g:1119:1: rule__Relation__Group_1__4 : rule__Relation__Group_1__4__Impl ;
    public final void rule__Relation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1123:1: ( rule__Relation__Group_1__4__Impl )
            // InternalErDsl2.g:1124:2: rule__Relation__Group_1__4__Impl
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
    // InternalErDsl2.g:1130:1: rule__Relation__Group_1__4__Impl : ( ']' ) ;
    public final void rule__Relation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1134:1: ( ( ']' ) )
            // InternalErDsl2.g:1135:1: ( ']' )
            {
            // InternalErDsl2.g:1135:1: ( ']' )
            // InternalErDsl2.g:1136:2: ']'
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
    // InternalErDsl2.g:1146:1: rule__Relation__Group_2__0 : rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 ;
    public final void rule__Relation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1150:1: ( rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 )
            // InternalErDsl2.g:1151:2: rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1
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
    // InternalErDsl2.g:1158:1: rule__Relation__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Relation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1162:1: ( ( '{' ) )
            // InternalErDsl2.g:1163:1: ( '{' )
            {
            // InternalErDsl2.g:1163:1: ( '{' )
            // InternalErDsl2.g:1164:2: '{'
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
    // InternalErDsl2.g:1173:1: rule__Relation__Group_2__1 : rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 ;
    public final void rule__Relation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1177:1: ( rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 )
            // InternalErDsl2.g:1178:2: rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2
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
    // InternalErDsl2.g:1185:1: rule__Relation__Group_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_1 ) ) ;
    public final void rule__Relation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1189:1: ( ( ( rule__Relation__AttributesAssignment_2_1 ) ) )
            // InternalErDsl2.g:1190:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            {
            // InternalErDsl2.g:1190:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            // InternalErDsl2.g:1191:2: ( rule__Relation__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_1()); 
            // InternalErDsl2.g:1192:2: ( rule__Relation__AttributesAssignment_2_1 )
            // InternalErDsl2.g:1192:3: rule__Relation__AttributesAssignment_2_1
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
    // InternalErDsl2.g:1200:1: rule__Relation__Group_2__2 : rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 ;
    public final void rule__Relation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1204:1: ( rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 )
            // InternalErDsl2.g:1205:2: rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3
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
    // InternalErDsl2.g:1212:1: rule__Relation__Group_2__2__Impl : ( ( rule__Relation__Group_2_2__0 )* ) ;
    public final void rule__Relation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1216:1: ( ( ( rule__Relation__Group_2_2__0 )* ) )
            // InternalErDsl2.g:1217:1: ( ( rule__Relation__Group_2_2__0 )* )
            {
            // InternalErDsl2.g:1217:1: ( ( rule__Relation__Group_2_2__0 )* )
            // InternalErDsl2.g:1218:2: ( rule__Relation__Group_2_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2_2()); 
            // InternalErDsl2.g:1219:2: ( rule__Relation__Group_2_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalErDsl2.g:1219:3: rule__Relation__Group_2_2__0
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
    // InternalErDsl2.g:1227:1: rule__Relation__Group_2__3 : rule__Relation__Group_2__3__Impl ;
    public final void rule__Relation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1231:1: ( rule__Relation__Group_2__3__Impl )
            // InternalErDsl2.g:1232:2: rule__Relation__Group_2__3__Impl
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
    // InternalErDsl2.g:1238:1: rule__Relation__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Relation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1242:1: ( ( '}' ) )
            // InternalErDsl2.g:1243:1: ( '}' )
            {
            // InternalErDsl2.g:1243:1: ( '}' )
            // InternalErDsl2.g:1244:2: '}'
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
    // InternalErDsl2.g:1254:1: rule__Relation__Group_2_2__0 : rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 ;
    public final void rule__Relation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1258:1: ( rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 )
            // InternalErDsl2.g:1259:2: rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1
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
    // InternalErDsl2.g:1266:1: rule__Relation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Relation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1270:1: ( ( ',' ) )
            // InternalErDsl2.g:1271:1: ( ',' )
            {
            // InternalErDsl2.g:1271:1: ( ',' )
            // InternalErDsl2.g:1272:2: ','
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
    // InternalErDsl2.g:1281:1: rule__Relation__Group_2_2__1 : rule__Relation__Group_2_2__1__Impl ;
    public final void rule__Relation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1285:1: ( rule__Relation__Group_2_2__1__Impl )
            // InternalErDsl2.g:1286:2: rule__Relation__Group_2_2__1__Impl
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
    // InternalErDsl2.g:1292:1: rule__Relation__Group_2_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Relation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1296:1: ( ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) )
            // InternalErDsl2.g:1297:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDsl2.g:1297:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            // InternalErDsl2.g:1298:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDsl2.g:1299:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            // InternalErDsl2.g:1299:3: rule__Relation__AttributesAssignment_2_2_1
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


    // $ANTLR start "rule__RelationSide__Group__0"
    // InternalErDsl2.g:1308:1: rule__RelationSide__Group__0 : rule__RelationSide__Group__0__Impl rule__RelationSide__Group__1 ;
    public final void rule__RelationSide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1312:1: ( rule__RelationSide__Group__0__Impl rule__RelationSide__Group__1 )
            // InternalErDsl2.g:1313:2: rule__RelationSide__Group__0__Impl rule__RelationSide__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RelationSide__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationSide__Group__1();

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
    // $ANTLR end "rule__RelationSide__Group__0"


    // $ANTLR start "rule__RelationSide__Group__0__Impl"
    // InternalErDsl2.g:1320:1: rule__RelationSide__Group__0__Impl : ( ( rule__RelationSide__CardinalityAssignment_0 ) ) ;
    public final void rule__RelationSide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1324:1: ( ( ( rule__RelationSide__CardinalityAssignment_0 ) ) )
            // InternalErDsl2.g:1325:1: ( ( rule__RelationSide__CardinalityAssignment_0 ) )
            {
            // InternalErDsl2.g:1325:1: ( ( rule__RelationSide__CardinalityAssignment_0 ) )
            // InternalErDsl2.g:1326:2: ( rule__RelationSide__CardinalityAssignment_0 )
            {
             before(grammarAccess.getRelationSideAccess().getCardinalityAssignment_0()); 
            // InternalErDsl2.g:1327:2: ( rule__RelationSide__CardinalityAssignment_0 )
            // InternalErDsl2.g:1327:3: rule__RelationSide__CardinalityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationSide__CardinalityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideAccess().getCardinalityAssignment_0()); 

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
    // $ANTLR end "rule__RelationSide__Group__0__Impl"


    // $ANTLR start "rule__RelationSide__Group__1"
    // InternalErDsl2.g:1335:1: rule__RelationSide__Group__1 : rule__RelationSide__Group__1__Impl ;
    public final void rule__RelationSide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1339:1: ( rule__RelationSide__Group__1__Impl )
            // InternalErDsl2.g:1340:2: rule__RelationSide__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationSide__Group__1__Impl();

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
    // $ANTLR end "rule__RelationSide__Group__1"


    // $ANTLR start "rule__RelationSide__Group__1__Impl"
    // InternalErDsl2.g:1346:1: rule__RelationSide__Group__1__Impl : ( ( rule__RelationSide__TargetAssignment_1 ) ) ;
    public final void rule__RelationSide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1350:1: ( ( ( rule__RelationSide__TargetAssignment_1 ) ) )
            // InternalErDsl2.g:1351:1: ( ( rule__RelationSide__TargetAssignment_1 ) )
            {
            // InternalErDsl2.g:1351:1: ( ( rule__RelationSide__TargetAssignment_1 ) )
            // InternalErDsl2.g:1352:2: ( rule__RelationSide__TargetAssignment_1 )
            {
             before(grammarAccess.getRelationSideAccess().getTargetAssignment_1()); 
            // InternalErDsl2.g:1353:2: ( rule__RelationSide__TargetAssignment_1 )
            // InternalErDsl2.g:1353:3: rule__RelationSide__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationSide__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideAccess().getTargetAssignment_1()); 

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
    // $ANTLR end "rule__RelationSide__Group__1__Impl"


    // $ANTLR start "rule__ERModel__DomainAssignment_0"
    // InternalErDsl2.g:1362:1: rule__ERModel__DomainAssignment_0 : ( ruleDomain ) ;
    public final void rule__ERModel__DomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1366:1: ( ( ruleDomain ) )
            // InternalErDsl2.g:1367:2: ( ruleDomain )
            {
            // InternalErDsl2.g:1367:2: ( ruleDomain )
            // InternalErDsl2.g:1368:3: ruleDomain
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
    // InternalErDsl2.g:1377:1: rule__ERModel__EntitiesAssignment_2 : ( ruleEntity ) ;
    public final void rule__ERModel__EntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1381:1: ( ( ruleEntity ) )
            // InternalErDsl2.g:1382:2: ( ruleEntity )
            {
            // InternalErDsl2.g:1382:2: ( ruleEntity )
            // InternalErDsl2.g:1383:3: ruleEntity
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
    // InternalErDsl2.g:1392:1: rule__ERModel__RelationsAssignment_5 : ( ruleRelation ) ;
    public final void rule__ERModel__RelationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1396:1: ( ( ruleRelation ) )
            // InternalErDsl2.g:1397:2: ( ruleRelation )
            {
            // InternalErDsl2.g:1397:2: ( ruleRelation )
            // InternalErDsl2.g:1398:3: ruleRelation
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
    // InternalErDsl2.g:1407:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1411:1: ( ( RULE_ID ) )
            // InternalErDsl2.g:1412:2: ( RULE_ID )
            {
            // InternalErDsl2.g:1412:2: ( RULE_ID )
            // InternalErDsl2.g:1413:3: RULE_ID
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
    // InternalErDsl2.g:1422:1: rule__Attribute__IsKeyAssignment_0 : ( ( '*' ) ) ;
    public final void rule__Attribute__IsKeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1426:1: ( ( ( '*' ) ) )
            // InternalErDsl2.g:1427:2: ( ( '*' ) )
            {
            // InternalErDsl2.g:1427:2: ( ( '*' ) )
            // InternalErDsl2.g:1428:3: ( '*' )
            {
             before(grammarAccess.getAttributeAccess().getIsKeyAsteriskKeyword_0_0()); 
            // InternalErDsl2.g:1429:3: ( '*' )
            // InternalErDsl2.g:1430:4: '*'
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
    // InternalErDsl2.g:1441:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1445:1: ( ( RULE_ID ) )
            // InternalErDsl2.g:1446:2: ( RULE_ID )
            {
            // InternalErDsl2.g:1446:2: ( RULE_ID )
            // InternalErDsl2.g:1447:3: RULE_ID
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
    // InternalErDsl2.g:1456:1: rule__Attribute__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1460:1: ( ( ruleDataType ) )
            // InternalErDsl2.g:1461:2: ( ruleDataType )
            {
            // InternalErDsl2.g:1461:2: ( ruleDataType )
            // InternalErDsl2.g:1462:3: ruleDataType
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
    // InternalErDsl2.g:1471:1: rule__Entity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1475:1: ( ( RULE_ID ) )
            // InternalErDsl2.g:1476:2: ( RULE_ID )
            {
            // InternalErDsl2.g:1476:2: ( RULE_ID )
            // InternalErDsl2.g:1477:3: RULE_ID
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
    // InternalErDsl2.g:1486:1: rule__Entity__IsAAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__IsAAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1490:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl2.g:1491:2: ( ( RULE_ID ) )
            {
            // InternalErDsl2.g:1491:2: ( ( RULE_ID ) )
            // InternalErDsl2.g:1492:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getIsAEntityCrossReference_1_1_0()); 
            // InternalErDsl2.g:1493:3: ( RULE_ID )
            // InternalErDsl2.g:1494:4: RULE_ID
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
    // InternalErDsl2.g:1505:1: rule__Entity__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1509:1: ( ( ruleAttribute ) )
            // InternalErDsl2.g:1510:2: ( ruleAttribute )
            {
            // InternalErDsl2.g:1510:2: ( ruleAttribute )
            // InternalErDsl2.g:1511:3: ruleAttribute
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
    // InternalErDsl2.g:1520:1: rule__Entity__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1524:1: ( ( ruleAttribute ) )
            // InternalErDsl2.g:1525:2: ( ruleAttribute )
            {
            // InternalErDsl2.g:1525:2: ( ruleAttribute )
            // InternalErDsl2.g:1526:3: ruleAttribute
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
    // InternalErDsl2.g:1535:1: rule__Relation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1539:1: ( ( RULE_ID ) )
            // InternalErDsl2.g:1540:2: ( RULE_ID )
            {
            // InternalErDsl2.g:1540:2: ( RULE_ID )
            // InternalErDsl2.g:1541:3: RULE_ID
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
    // InternalErDsl2.g:1550:1: rule__Relation__LeftEndingAssignment_1_1 : ( ruleRelationSide ) ;
    public final void rule__Relation__LeftEndingAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1554:1: ( ( ruleRelationSide ) )
            // InternalErDsl2.g:1555:2: ( ruleRelationSide )
            {
            // InternalErDsl2.g:1555:2: ( ruleRelationSide )
            // InternalErDsl2.g:1556:3: ruleRelationSide
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
    // InternalErDsl2.g:1565:1: rule__Relation__RightEndingAssignment_1_3 : ( ruleRelationSide ) ;
    public final void rule__Relation__RightEndingAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1569:1: ( ( ruleRelationSide ) )
            // InternalErDsl2.g:1570:2: ( ruleRelationSide )
            {
            // InternalErDsl2.g:1570:2: ( ruleRelationSide )
            // InternalErDsl2.g:1571:3: ruleRelationSide
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
    // InternalErDsl2.g:1580:1: rule__Relation__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1584:1: ( ( ruleAttribute ) )
            // InternalErDsl2.g:1585:2: ( ruleAttribute )
            {
            // InternalErDsl2.g:1585:2: ( ruleAttribute )
            // InternalErDsl2.g:1586:3: ruleAttribute
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
    // InternalErDsl2.g:1595:1: rule__Relation__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1599:1: ( ( ruleAttribute ) )
            // InternalErDsl2.g:1600:2: ( ruleAttribute )
            {
            // InternalErDsl2.g:1600:2: ( ruleAttribute )
            // InternalErDsl2.g:1601:3: ruleAttribute
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


    // $ANTLR start "rule__RelationSide__CardinalityAssignment_0"
    // InternalErDsl2.g:1610:1: rule__RelationSide__CardinalityAssignment_0 : ( ( rule__RelationSide__CardinalityAlternatives_0_0 ) ) ;
    public final void rule__RelationSide__CardinalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1614:1: ( ( ( rule__RelationSide__CardinalityAlternatives_0_0 ) ) )
            // InternalErDsl2.g:1615:2: ( ( rule__RelationSide__CardinalityAlternatives_0_0 ) )
            {
            // InternalErDsl2.g:1615:2: ( ( rule__RelationSide__CardinalityAlternatives_0_0 ) )
            // InternalErDsl2.g:1616:3: ( rule__RelationSide__CardinalityAlternatives_0_0 )
            {
             before(grammarAccess.getRelationSideAccess().getCardinalityAlternatives_0_0()); 
            // InternalErDsl2.g:1617:3: ( rule__RelationSide__CardinalityAlternatives_0_0 )
            // InternalErDsl2.g:1617:4: rule__RelationSide__CardinalityAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationSide__CardinalityAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideAccess().getCardinalityAlternatives_0_0()); 

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
    // $ANTLR end "rule__RelationSide__CardinalityAssignment_0"


    // $ANTLR start "rule__RelationSide__TargetAssignment_1"
    // InternalErDsl2.g:1625:1: rule__RelationSide__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSide__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl2.g:1629:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl2.g:1630:2: ( ( RULE_ID ) )
            {
            // InternalErDsl2.g:1630:2: ( ( RULE_ID ) )
            // InternalErDsl2.g:1631:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideAccess().getTargetEntityCrossReference_1_0()); 
            // InternalErDsl2.g:1632:3: ( RULE_ID )
            // InternalErDsl2.g:1633:4: RULE_ID
            {
             before(grammarAccess.getRelationSideAccess().getTargetEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationSideAccess().getTargetEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRelationSideAccess().getTargetEntityCrossReference_1_0()); 

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
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});

}