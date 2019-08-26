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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'double'", "'money'", "'string'", "'boolean'", "'datetime'", "'file'", "'one'", "'many'", "';'", "'Entities{'", "'};'", "'Relationships{'", "'Domain'", "':'", "'isA'", "'{'", "'}'", "','", "'['", "'isRelatedWith'", "']'", "'isIdentifier'", "'zero'"
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
    public static final int T__34=34;
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


    // $ANTLR start "ruleDataType"
    // InternalErDsl.g:203:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:207:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalErDsl.g:208:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalErDsl.g:208:2: ( ( rule__DataType__Alternatives ) )
            // InternalErDsl.g:209:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalErDsl.g:210:3: ( rule__DataType__Alternatives )
            // InternalErDsl.g:210:4: rule__DataType__Alternatives
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


    // $ANTLR start "ruleCardinalityType"
    // InternalErDsl.g:219:1: ruleCardinalityType : ( ( rule__CardinalityType__Alternatives ) ) ;
    public final void ruleCardinalityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:223:1: ( ( ( rule__CardinalityType__Alternatives ) ) )
            // InternalErDsl.g:224:2: ( ( rule__CardinalityType__Alternatives ) )
            {
            // InternalErDsl.g:224:2: ( ( rule__CardinalityType__Alternatives ) )
            // InternalErDsl.g:225:3: ( rule__CardinalityType__Alternatives )
            {
             before(grammarAccess.getCardinalityTypeAccess().getAlternatives()); 
            // InternalErDsl.g:226:3: ( rule__CardinalityType__Alternatives )
            // InternalErDsl.g:226:4: rule__CardinalityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CardinalityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCardinalityType"


    // $ANTLR start "rule__RelationSide__Alternatives"
    // InternalErDsl.g:234:1: rule__RelationSide__Alternatives : ( ( ( rule__RelationSide__Group_0__0 ) ) | ( ( rule__RelationSide__TargetAssignment_1 ) ) );
    public final void rule__RelationSide__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:238:1: ( ( ( rule__RelationSide__Group_0__0 ) ) | ( ( rule__RelationSide__TargetAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=18 && LA1_0<=19)||LA1_0==34) ) {
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
                    // InternalErDsl.g:239:2: ( ( rule__RelationSide__Group_0__0 ) )
                    {
                    // InternalErDsl.g:239:2: ( ( rule__RelationSide__Group_0__0 ) )
                    // InternalErDsl.g:240:3: ( rule__RelationSide__Group_0__0 )
                    {
                     before(grammarAccess.getRelationSideAccess().getGroup_0()); 
                    // InternalErDsl.g:241:3: ( rule__RelationSide__Group_0__0 )
                    // InternalErDsl.g:241:4: rule__RelationSide__Group_0__0
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
                    // InternalErDsl.g:245:2: ( ( rule__RelationSide__TargetAssignment_1 ) )
                    {
                    // InternalErDsl.g:245:2: ( ( rule__RelationSide__TargetAssignment_1 ) )
                    // InternalErDsl.g:246:3: ( rule__RelationSide__TargetAssignment_1 )
                    {
                     before(grammarAccess.getRelationSideAccess().getTargetAssignment_1()); 
                    // InternalErDsl.g:247:3: ( rule__RelationSide__TargetAssignment_1 )
                    // InternalErDsl.g:247:4: rule__RelationSide__TargetAssignment_1
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


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalErDsl.g:255:1: rule__DataType__Alternatives : ( ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'money' ) ) | ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'datetime' ) ) | ( ( 'file' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:259:1: ( ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'money' ) ) | ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'datetime' ) ) | ( ( 'file' ) ) )
            int alt2=7;
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
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
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
                    // InternalErDsl.g:260:2: ( ( 'int' ) )
                    {
                    // InternalErDsl.g:260:2: ( ( 'int' ) )
                    // InternalErDsl.g:261:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalErDsl.g:262:3: ( 'int' )
                    // InternalErDsl.g:262:4: 'int'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:266:2: ( ( 'double' ) )
                    {
                    // InternalErDsl.g:266:2: ( ( 'double' ) )
                    // InternalErDsl.g:267:3: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                    // InternalErDsl.g:268:3: ( 'double' )
                    // InternalErDsl.g:268:4: 'double'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl.g:272:2: ( ( 'money' ) )
                    {
                    // InternalErDsl.g:272:2: ( ( 'money' ) )
                    // InternalErDsl.g:273:3: ( 'money' )
                    {
                     before(grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2()); 
                    // InternalErDsl.g:274:3: ( 'money' )
                    // InternalErDsl.g:274:4: 'money'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl.g:278:2: ( ( 'string' ) )
                    {
                    // InternalErDsl.g:278:2: ( ( 'string' ) )
                    // InternalErDsl.g:279:3: ( 'string' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                    // InternalErDsl.g:280:3: ( 'string' )
                    // InternalErDsl.g:280:4: 'string'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalErDsl.g:284:2: ( ( 'boolean' ) )
                    {
                    // InternalErDsl.g:284:2: ( ( 'boolean' ) )
                    // InternalErDsl.g:285:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 
                    // InternalErDsl.g:286:3: ( 'boolean' )
                    // InternalErDsl.g:286:4: 'boolean'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalErDsl.g:290:2: ( ( 'datetime' ) )
                    {
                    // InternalErDsl.g:290:2: ( ( 'datetime' ) )
                    // InternalErDsl.g:291:3: ( 'datetime' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5()); 
                    // InternalErDsl.g:292:3: ( 'datetime' )
                    // InternalErDsl.g:292:4: 'datetime'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalErDsl.g:296:2: ( ( 'file' ) )
                    {
                    // InternalErDsl.g:296:2: ( ( 'file' ) )
                    // InternalErDsl.g:297:3: ( 'file' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBLOBEnumLiteralDeclaration_6()); 
                    // InternalErDsl.g:298:3: ( 'file' )
                    // InternalErDsl.g:298:4: 'file'
                    {
                    match(input,17,FOLLOW_2); 

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


    // $ANTLR start "rule__CardinalityType__Alternatives"
    // InternalErDsl.g:306:1: rule__CardinalityType__Alternatives : ( ( ( 'one' ) ) | ( ( 'many' ) ) );
    public final void rule__CardinalityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:310:1: ( ( ( 'one' ) ) | ( ( 'many' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalErDsl.g:311:2: ( ( 'one' ) )
                    {
                    // InternalErDsl.g:311:2: ( ( 'one' ) )
                    // InternalErDsl.g:312:3: ( 'one' )
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0()); 
                    // InternalErDsl.g:313:3: ( 'one' )
                    // InternalErDsl.g:313:4: 'one'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityTypeAccess().getOneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:317:2: ( ( 'many' ) )
                    {
                    // InternalErDsl.g:317:2: ( ( 'many' ) )
                    // InternalErDsl.g:318:3: ( 'many' )
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getManyEnumLiteralDeclaration_1()); 
                    // InternalErDsl.g:319:3: ( 'many' )
                    // InternalErDsl.g:319:4: 'many'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getCardinalityTypeAccess().getManyEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__CardinalityType__Alternatives"


    // $ANTLR start "rule__ERModel__Group__0"
    // InternalErDsl.g:327:1: rule__ERModel__Group__0 : rule__ERModel__Group__0__Impl rule__ERModel__Group__1 ;
    public final void rule__ERModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:331:1: ( rule__ERModel__Group__0__Impl rule__ERModel__Group__1 )
            // InternalErDsl.g:332:2: rule__ERModel__Group__0__Impl rule__ERModel__Group__1
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
    // InternalErDsl.g:339:1: rule__ERModel__Group__0__Impl : ( ( rule__ERModel__DomainAssignment_0 ) ) ;
    public final void rule__ERModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:343:1: ( ( ( rule__ERModel__DomainAssignment_0 ) ) )
            // InternalErDsl.g:344:1: ( ( rule__ERModel__DomainAssignment_0 ) )
            {
            // InternalErDsl.g:344:1: ( ( rule__ERModel__DomainAssignment_0 ) )
            // InternalErDsl.g:345:2: ( rule__ERModel__DomainAssignment_0 )
            {
             before(grammarAccess.getERModelAccess().getDomainAssignment_0()); 
            // InternalErDsl.g:346:2: ( rule__ERModel__DomainAssignment_0 )
            // InternalErDsl.g:346:3: rule__ERModel__DomainAssignment_0
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
    // InternalErDsl.g:354:1: rule__ERModel__Group__1 : rule__ERModel__Group__1__Impl rule__ERModel__Group__2 ;
    public final void rule__ERModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:358:1: ( rule__ERModel__Group__1__Impl rule__ERModel__Group__2 )
            // InternalErDsl.g:359:2: rule__ERModel__Group__1__Impl rule__ERModel__Group__2
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
    // InternalErDsl.g:366:1: rule__ERModel__Group__1__Impl : ( ';' ) ;
    public final void rule__ERModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:370:1: ( ( ';' ) )
            // InternalErDsl.g:371:1: ( ';' )
            {
            // InternalErDsl.g:371:1: ( ';' )
            // InternalErDsl.g:372:2: ';'
            {
             before(grammarAccess.getERModelAccess().getSemicolonKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalErDsl.g:381:1: rule__ERModel__Group__2 : rule__ERModel__Group__2__Impl rule__ERModel__Group__3 ;
    public final void rule__ERModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:385:1: ( rule__ERModel__Group__2__Impl rule__ERModel__Group__3 )
            // InternalErDsl.g:386:2: rule__ERModel__Group__2__Impl rule__ERModel__Group__3
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
    // InternalErDsl.g:393:1: rule__ERModel__Group__2__Impl : ( 'Entities{' ) ;
    public final void rule__ERModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:397:1: ( ( 'Entities{' ) )
            // InternalErDsl.g:398:1: ( 'Entities{' )
            {
            // InternalErDsl.g:398:1: ( 'Entities{' )
            // InternalErDsl.g:399:2: 'Entities{'
            {
             before(grammarAccess.getERModelAccess().getEntitiesKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalErDsl.g:408:1: rule__ERModel__Group__3 : rule__ERModel__Group__3__Impl rule__ERModel__Group__4 ;
    public final void rule__ERModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:412:1: ( rule__ERModel__Group__3__Impl rule__ERModel__Group__4 )
            // InternalErDsl.g:413:2: rule__ERModel__Group__3__Impl rule__ERModel__Group__4
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
    // InternalErDsl.g:420:1: rule__ERModel__Group__3__Impl : ( ( ( rule__ERModel__EntitiesAssignment_3 ) ) ( ( rule__ERModel__EntitiesAssignment_3 )* ) ) ;
    public final void rule__ERModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:424:1: ( ( ( ( rule__ERModel__EntitiesAssignment_3 ) ) ( ( rule__ERModel__EntitiesAssignment_3 )* ) ) )
            // InternalErDsl.g:425:1: ( ( ( rule__ERModel__EntitiesAssignment_3 ) ) ( ( rule__ERModel__EntitiesAssignment_3 )* ) )
            {
            // InternalErDsl.g:425:1: ( ( ( rule__ERModel__EntitiesAssignment_3 ) ) ( ( rule__ERModel__EntitiesAssignment_3 )* ) )
            // InternalErDsl.g:426:2: ( ( rule__ERModel__EntitiesAssignment_3 ) ) ( ( rule__ERModel__EntitiesAssignment_3 )* )
            {
            // InternalErDsl.g:426:2: ( ( rule__ERModel__EntitiesAssignment_3 ) )
            // InternalErDsl.g:427:3: ( rule__ERModel__EntitiesAssignment_3 )
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_3()); 
            // InternalErDsl.g:428:3: ( rule__ERModel__EntitiesAssignment_3 )
            // InternalErDsl.g:428:4: rule__ERModel__EntitiesAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__ERModel__EntitiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getEntitiesAssignment_3()); 

            }

            // InternalErDsl.g:431:2: ( ( rule__ERModel__EntitiesAssignment_3 )* )
            // InternalErDsl.g:432:3: ( rule__ERModel__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_3()); 
            // InternalErDsl.g:433:3: ( rule__ERModel__EntitiesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalErDsl.g:433:4: rule__ERModel__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ERModel__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalErDsl.g:442:1: rule__ERModel__Group__4 : rule__ERModel__Group__4__Impl rule__ERModel__Group__5 ;
    public final void rule__ERModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:446:1: ( rule__ERModel__Group__4__Impl rule__ERModel__Group__5 )
            // InternalErDsl.g:447:2: rule__ERModel__Group__4__Impl rule__ERModel__Group__5
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
    // InternalErDsl.g:454:1: rule__ERModel__Group__4__Impl : ( '};' ) ;
    public final void rule__ERModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:458:1: ( ( '};' ) )
            // InternalErDsl.g:459:1: ( '};' )
            {
            // InternalErDsl.g:459:1: ( '};' )
            // InternalErDsl.g:460:2: '};'
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketSemicolonKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalErDsl.g:469:1: rule__ERModel__Group__5 : rule__ERModel__Group__5__Impl rule__ERModel__Group__6 ;
    public final void rule__ERModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:473:1: ( rule__ERModel__Group__5__Impl rule__ERModel__Group__6 )
            // InternalErDsl.g:474:2: rule__ERModel__Group__5__Impl rule__ERModel__Group__6
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
    // InternalErDsl.g:481:1: rule__ERModel__Group__5__Impl : ( 'Relationships{' ) ;
    public final void rule__ERModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:485:1: ( ( 'Relationships{' ) )
            // InternalErDsl.g:486:1: ( 'Relationships{' )
            {
            // InternalErDsl.g:486:1: ( 'Relationships{' )
            // InternalErDsl.g:487:2: 'Relationships{'
            {
             before(grammarAccess.getERModelAccess().getRelationshipsKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalErDsl.g:496:1: rule__ERModel__Group__6 : rule__ERModel__Group__6__Impl rule__ERModel__Group__7 ;
    public final void rule__ERModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:500:1: ( rule__ERModel__Group__6__Impl rule__ERModel__Group__7 )
            // InternalErDsl.g:501:2: rule__ERModel__Group__6__Impl rule__ERModel__Group__7
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
    // InternalErDsl.g:508:1: rule__ERModel__Group__6__Impl : ( ( rule__ERModel__RelationsAssignment_6 )* ) ;
    public final void rule__ERModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:512:1: ( ( ( rule__ERModel__RelationsAssignment_6 )* ) )
            // InternalErDsl.g:513:1: ( ( rule__ERModel__RelationsAssignment_6 )* )
            {
            // InternalErDsl.g:513:1: ( ( rule__ERModel__RelationsAssignment_6 )* )
            // InternalErDsl.g:514:2: ( rule__ERModel__RelationsAssignment_6 )*
            {
             before(grammarAccess.getERModelAccess().getRelationsAssignment_6()); 
            // InternalErDsl.g:515:2: ( rule__ERModel__RelationsAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalErDsl.g:515:3: rule__ERModel__RelationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ERModel__RelationsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalErDsl.g:523:1: rule__ERModel__Group__7 : rule__ERModel__Group__7__Impl ;
    public final void rule__ERModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:527:1: ( rule__ERModel__Group__7__Impl )
            // InternalErDsl.g:528:2: rule__ERModel__Group__7__Impl
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
    // InternalErDsl.g:534:1: rule__ERModel__Group__7__Impl : ( '};' ) ;
    public final void rule__ERModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:538:1: ( ( '};' ) )
            // InternalErDsl.g:539:1: ( '};' )
            {
            // InternalErDsl.g:539:1: ( '};' )
            // InternalErDsl.g:540:2: '};'
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketSemicolonKeyword_7()); 
            match(input,22,FOLLOW_2); 
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
    // InternalErDsl.g:550:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:554:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalErDsl.g:555:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalErDsl.g:562:1: rule__Domain__Group__0__Impl : ( 'Domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:566:1: ( ( 'Domain' ) )
            // InternalErDsl.g:567:1: ( 'Domain' )
            {
            // InternalErDsl.g:567:1: ( 'Domain' )
            // InternalErDsl.g:568:2: 'Domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalErDsl.g:577:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:581:1: ( rule__Domain__Group__1__Impl )
            // InternalErDsl.g:582:2: rule__Domain__Group__1__Impl
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
    // InternalErDsl.g:588:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:592:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalErDsl.g:593:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalErDsl.g:593:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalErDsl.g:594:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalErDsl.g:595:2: ( rule__Domain__NameAssignment_1 )
            // InternalErDsl.g:595:3: rule__Domain__NameAssignment_1
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
    // InternalErDsl.g:604:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:608:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalErDsl.g:609:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalErDsl.g:616:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:620:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalErDsl.g:621:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalErDsl.g:621:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalErDsl.g:622:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalErDsl.g:623:2: ( rule__Attribute__NameAssignment_0 )
            // InternalErDsl.g:623:3: rule__Attribute__NameAssignment_0
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
    // InternalErDsl.g:631:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:635:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalErDsl.g:636:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalErDsl.g:643:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:647:1: ( ( ':' ) )
            // InternalErDsl.g:648:1: ( ':' )
            {
            // InternalErDsl.g:648:1: ( ':' )
            // InternalErDsl.g:649:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

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
    // InternalErDsl.g:658:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:662:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalErDsl.g:663:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // InternalErDsl.g:670:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:674:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalErDsl.g:675:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalErDsl.g:675:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalErDsl.g:676:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalErDsl.g:677:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalErDsl.g:677:3: rule__Attribute__TypeAssignment_2
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


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalErDsl.g:685:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:689:1: ( rule__Attribute__Group__3__Impl )
            // InternalErDsl.g:690:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalErDsl.g:696:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__IsKeyAssignment_3 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:700:1: ( ( ( rule__Attribute__IsKeyAssignment_3 )? ) )
            // InternalErDsl.g:701:1: ( ( rule__Attribute__IsKeyAssignment_3 )? )
            {
            // InternalErDsl.g:701:1: ( ( rule__Attribute__IsKeyAssignment_3 )? )
            // InternalErDsl.g:702:2: ( rule__Attribute__IsKeyAssignment_3 )?
            {
             before(grammarAccess.getAttributeAccess().getIsKeyAssignment_3()); 
            // InternalErDsl.g:703:2: ( rule__Attribute__IsKeyAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalErDsl.g:703:3: rule__Attribute__IsKeyAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__IsKeyAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getIsKeyAssignment_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalErDsl.g:712:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:716:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalErDsl.g:717:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalErDsl.g:724:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:728:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // InternalErDsl.g:729:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // InternalErDsl.g:729:1: ( ( rule__Entity__NameAssignment_0 ) )
            // InternalErDsl.g:730:2: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // InternalErDsl.g:731:2: ( rule__Entity__NameAssignment_0 )
            // InternalErDsl.g:731:3: rule__Entity__NameAssignment_0
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
    // InternalErDsl.g:739:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:743:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalErDsl.g:744:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalErDsl.g:751:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__Group_1__0 )* ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:755:1: ( ( ( rule__Entity__Group_1__0 )* ) )
            // InternalErDsl.g:756:1: ( ( rule__Entity__Group_1__0 )* )
            {
            // InternalErDsl.g:756:1: ( ( rule__Entity__Group_1__0 )* )
            // InternalErDsl.g:757:2: ( rule__Entity__Group_1__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_1()); 
            // InternalErDsl.g:758:2: ( rule__Entity__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalErDsl.g:758:3: rule__Entity__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalErDsl.g:766:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:770:1: ( rule__Entity__Group__2__Impl )
            // InternalErDsl.g:771:2: rule__Entity__Group__2__Impl
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
    // InternalErDsl.g:777:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:781:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalErDsl.g:782:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalErDsl.g:782:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalErDsl.g:783:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalErDsl.g:784:2: ( rule__Entity__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalErDsl.g:784:3: rule__Entity__Group_2__0
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
    // InternalErDsl.g:793:1: rule__Entity__Group_1__0 : rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 ;
    public final void rule__Entity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:797:1: ( rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 )
            // InternalErDsl.g:798:2: rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1
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
    // InternalErDsl.g:805:1: rule__Entity__Group_1__0__Impl : ( 'isA' ) ;
    public final void rule__Entity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:809:1: ( ( 'isA' ) )
            // InternalErDsl.g:810:1: ( 'isA' )
            {
            // InternalErDsl.g:810:1: ( 'isA' )
            // InternalErDsl.g:811:2: 'isA'
            {
             before(grammarAccess.getEntityAccess().getIsAKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getIsAKeyword_1_0()); 

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
    // InternalErDsl.g:820:1: rule__Entity__Group_1__1 : rule__Entity__Group_1__1__Impl ;
    public final void rule__Entity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:824:1: ( rule__Entity__Group_1__1__Impl )
            // InternalErDsl.g:825:2: rule__Entity__Group_1__1__Impl
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
    // InternalErDsl.g:831:1: rule__Entity__Group_1__1__Impl : ( ( rule__Entity__IsAAssignment_1_1 ) ) ;
    public final void rule__Entity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:835:1: ( ( ( rule__Entity__IsAAssignment_1_1 ) ) )
            // InternalErDsl.g:836:1: ( ( rule__Entity__IsAAssignment_1_1 ) )
            {
            // InternalErDsl.g:836:1: ( ( rule__Entity__IsAAssignment_1_1 ) )
            // InternalErDsl.g:837:2: ( rule__Entity__IsAAssignment_1_1 )
            {
             before(grammarAccess.getEntityAccess().getIsAAssignment_1_1()); 
            // InternalErDsl.g:838:2: ( rule__Entity__IsAAssignment_1_1 )
            // InternalErDsl.g:838:3: rule__Entity__IsAAssignment_1_1
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
    // InternalErDsl.g:847:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:851:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalErDsl.g:852:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
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
    // InternalErDsl.g:859:1: rule__Entity__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:863:1: ( ( '{' ) )
            // InternalErDsl.g:864:1: ( '{' )
            {
            // InternalErDsl.g:864:1: ( '{' )
            // InternalErDsl.g:865:2: '{'
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
    // InternalErDsl.g:874:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:878:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // InternalErDsl.g:879:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalErDsl.g:886:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:890:1: ( ( ( rule__Entity__AttributesAssignment_2_1 ) ) )
            // InternalErDsl.g:891:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            {
            // InternalErDsl.g:891:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            // InternalErDsl.g:892:2: ( rule__Entity__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_1()); 
            // InternalErDsl.g:893:2: ( rule__Entity__AttributesAssignment_2_1 )
            // InternalErDsl.g:893:3: rule__Entity__AttributesAssignment_2_1
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
    // InternalErDsl.g:901:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:905:1: ( rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 )
            // InternalErDsl.g:906:2: rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalErDsl.g:913:1: rule__Entity__Group_2__2__Impl : ( ( rule__Entity__Group_2_2__0 )* ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:917:1: ( ( ( rule__Entity__Group_2_2__0 )* ) )
            // InternalErDsl.g:918:1: ( ( rule__Entity__Group_2_2__0 )* )
            {
            // InternalErDsl.g:918:1: ( ( rule__Entity__Group_2_2__0 )* )
            // InternalErDsl.g:919:2: ( rule__Entity__Group_2_2__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_2_2()); 
            // InternalErDsl.g:920:2: ( rule__Entity__Group_2_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalErDsl.g:920:3: rule__Entity__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalErDsl.g:928:1: rule__Entity__Group_2__3 : rule__Entity__Group_2__3__Impl ;
    public final void rule__Entity__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:932:1: ( rule__Entity__Group_2__3__Impl )
            // InternalErDsl.g:933:2: rule__Entity__Group_2__3__Impl
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
    // InternalErDsl.g:939:1: rule__Entity__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Entity__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:943:1: ( ( '}' ) )
            // InternalErDsl.g:944:1: ( '}' )
            {
            // InternalErDsl.g:944:1: ( '}' )
            // InternalErDsl.g:945:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalErDsl.g:955:1: rule__Entity__Group_2_2__0 : rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 ;
    public final void rule__Entity__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:959:1: ( rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 )
            // InternalErDsl.g:960:2: rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1
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
    // InternalErDsl.g:967:1: rule__Entity__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:971:1: ( ( ',' ) )
            // InternalErDsl.g:972:1: ( ',' )
            {
            // InternalErDsl.g:972:1: ( ',' )
            // InternalErDsl.g:973:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_2_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalErDsl.g:982:1: rule__Entity__Group_2_2__1 : rule__Entity__Group_2_2__1__Impl ;
    public final void rule__Entity__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:986:1: ( rule__Entity__Group_2_2__1__Impl )
            // InternalErDsl.g:987:2: rule__Entity__Group_2_2__1__Impl
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
    // InternalErDsl.g:993:1: rule__Entity__Group_2_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Entity__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:997:1: ( ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) )
            // InternalErDsl.g:998:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDsl.g:998:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            // InternalErDsl.g:999:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDsl.g:1000:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            // InternalErDsl.g:1000:3: rule__Entity__AttributesAssignment_2_2_1
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
    // InternalErDsl.g:1009:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1013:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalErDsl.g:1014:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalErDsl.g:1021:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__NameAssignment_0 )? ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1025:1: ( ( ( rule__Relation__NameAssignment_0 )? ) )
            // InternalErDsl.g:1026:1: ( ( rule__Relation__NameAssignment_0 )? )
            {
            // InternalErDsl.g:1026:1: ( ( rule__Relation__NameAssignment_0 )? )
            // InternalErDsl.g:1027:2: ( rule__Relation__NameAssignment_0 )?
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_0()); 
            // InternalErDsl.g:1028:2: ( rule__Relation__NameAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalErDsl.g:1028:3: rule__Relation__NameAssignment_0
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
    // InternalErDsl.g:1036:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1040:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalErDsl.g:1041:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalErDsl.g:1048:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__Group_1__0 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1052:1: ( ( ( rule__Relation__Group_1__0 ) ) )
            // InternalErDsl.g:1053:1: ( ( rule__Relation__Group_1__0 ) )
            {
            // InternalErDsl.g:1053:1: ( ( rule__Relation__Group_1__0 ) )
            // InternalErDsl.g:1054:2: ( rule__Relation__Group_1__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_1()); 
            // InternalErDsl.g:1055:2: ( rule__Relation__Group_1__0 )
            // InternalErDsl.g:1055:3: rule__Relation__Group_1__0
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
    // InternalErDsl.g:1063:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1067:1: ( rule__Relation__Group__2__Impl )
            // InternalErDsl.g:1068:2: rule__Relation__Group__2__Impl
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
    // InternalErDsl.g:1074:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__Group_2__0 )* ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1078:1: ( ( ( rule__Relation__Group_2__0 )* ) )
            // InternalErDsl.g:1079:1: ( ( rule__Relation__Group_2__0 )* )
            {
            // InternalErDsl.g:1079:1: ( ( rule__Relation__Group_2__0 )* )
            // InternalErDsl.g:1080:2: ( rule__Relation__Group_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2()); 
            // InternalErDsl.g:1081:2: ( rule__Relation__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalErDsl.g:1081:3: rule__Relation__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
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
    // InternalErDsl.g:1090:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1094:1: ( rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 )
            // InternalErDsl.g:1095:2: rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalErDsl.g:1102:1: rule__Relation__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1106:1: ( ( '[' ) )
            // InternalErDsl.g:1107:1: ( '[' )
            {
            // InternalErDsl.g:1107:1: ( '[' )
            // InternalErDsl.g:1108:2: '['
            {
             before(grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalErDsl.g:1117:1: rule__Relation__Group_1__1 : rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 ;
    public final void rule__Relation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1121:1: ( rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 )
            // InternalErDsl.g:1122:2: rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalErDsl.g:1129:1: rule__Relation__Group_1__1__Impl : ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) ;
    public final void rule__Relation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1133:1: ( ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) )
            // InternalErDsl.g:1134:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            {
            // InternalErDsl.g:1134:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            // InternalErDsl.g:1135:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            {
             before(grammarAccess.getRelationAccess().getLeftEndingAssignment_1_1()); 
            // InternalErDsl.g:1136:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            // InternalErDsl.g:1136:3: rule__Relation__LeftEndingAssignment_1_1
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
    // InternalErDsl.g:1144:1: rule__Relation__Group_1__2 : rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 ;
    public final void rule__Relation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1148:1: ( rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 )
            // InternalErDsl.g:1149:2: rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalErDsl.g:1156:1: rule__Relation__Group_1__2__Impl : ( 'isRelatedWith' ) ;
    public final void rule__Relation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1160:1: ( ( 'isRelatedWith' ) )
            // InternalErDsl.g:1161:1: ( 'isRelatedWith' )
            {
            // InternalErDsl.g:1161:1: ( 'isRelatedWith' )
            // InternalErDsl.g:1162:2: 'isRelatedWith'
            {
             before(grammarAccess.getRelationAccess().getIsRelatedWithKeyword_1_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getIsRelatedWithKeyword_1_2()); 

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
    // InternalErDsl.g:1171:1: rule__Relation__Group_1__3 : rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 ;
    public final void rule__Relation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1175:1: ( rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 )
            // InternalErDsl.g:1176:2: rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalErDsl.g:1183:1: rule__Relation__Group_1__3__Impl : ( ( rule__Relation__RightEndingAssignment_1_3 ) ) ;
    public final void rule__Relation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1187:1: ( ( ( rule__Relation__RightEndingAssignment_1_3 ) ) )
            // InternalErDsl.g:1188:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            {
            // InternalErDsl.g:1188:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            // InternalErDsl.g:1189:2: ( rule__Relation__RightEndingAssignment_1_3 )
            {
             before(grammarAccess.getRelationAccess().getRightEndingAssignment_1_3()); 
            // InternalErDsl.g:1190:2: ( rule__Relation__RightEndingAssignment_1_3 )
            // InternalErDsl.g:1190:3: rule__Relation__RightEndingAssignment_1_3
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
    // InternalErDsl.g:1198:1: rule__Relation__Group_1__4 : rule__Relation__Group_1__4__Impl ;
    public final void rule__Relation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1202:1: ( rule__Relation__Group_1__4__Impl )
            // InternalErDsl.g:1203:2: rule__Relation__Group_1__4__Impl
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
    // InternalErDsl.g:1209:1: rule__Relation__Group_1__4__Impl : ( ']' ) ;
    public final void rule__Relation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1213:1: ( ( ']' ) )
            // InternalErDsl.g:1214:1: ( ']' )
            {
            // InternalErDsl.g:1214:1: ( ']' )
            // InternalErDsl.g:1215:2: ']'
            {
             before(grammarAccess.getRelationAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalErDsl.g:1225:1: rule__Relation__Group_2__0 : rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 ;
    public final void rule__Relation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1229:1: ( rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 )
            // InternalErDsl.g:1230:2: rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1
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
    // InternalErDsl.g:1237:1: rule__Relation__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Relation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1241:1: ( ( '{' ) )
            // InternalErDsl.g:1242:1: ( '{' )
            {
            // InternalErDsl.g:1242:1: ( '{' )
            // InternalErDsl.g:1243:2: '{'
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
    // InternalErDsl.g:1252:1: rule__Relation__Group_2__1 : rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 ;
    public final void rule__Relation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1256:1: ( rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 )
            // InternalErDsl.g:1257:2: rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalErDsl.g:1264:1: rule__Relation__Group_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_1 ) ) ;
    public final void rule__Relation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1268:1: ( ( ( rule__Relation__AttributesAssignment_2_1 ) ) )
            // InternalErDsl.g:1269:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            {
            // InternalErDsl.g:1269:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            // InternalErDsl.g:1270:2: ( rule__Relation__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_1()); 
            // InternalErDsl.g:1271:2: ( rule__Relation__AttributesAssignment_2_1 )
            // InternalErDsl.g:1271:3: rule__Relation__AttributesAssignment_2_1
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
    // InternalErDsl.g:1279:1: rule__Relation__Group_2__2 : rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 ;
    public final void rule__Relation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1283:1: ( rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 )
            // InternalErDsl.g:1284:2: rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalErDsl.g:1291:1: rule__Relation__Group_2__2__Impl : ( ( rule__Relation__Group_2_2__0 )* ) ;
    public final void rule__Relation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1295:1: ( ( ( rule__Relation__Group_2_2__0 )* ) )
            // InternalErDsl.g:1296:1: ( ( rule__Relation__Group_2_2__0 )* )
            {
            // InternalErDsl.g:1296:1: ( ( rule__Relation__Group_2_2__0 )* )
            // InternalErDsl.g:1297:2: ( rule__Relation__Group_2_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2_2()); 
            // InternalErDsl.g:1298:2: ( rule__Relation__Group_2_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalErDsl.g:1298:3: rule__Relation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalErDsl.g:1306:1: rule__Relation__Group_2__3 : rule__Relation__Group_2__3__Impl ;
    public final void rule__Relation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1310:1: ( rule__Relation__Group_2__3__Impl )
            // InternalErDsl.g:1311:2: rule__Relation__Group_2__3__Impl
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
    // InternalErDsl.g:1317:1: rule__Relation__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Relation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1321:1: ( ( '}' ) )
            // InternalErDsl.g:1322:1: ( '}' )
            {
            // InternalErDsl.g:1322:1: ( '}' )
            // InternalErDsl.g:1323:2: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalErDsl.g:1333:1: rule__Relation__Group_2_2__0 : rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 ;
    public final void rule__Relation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1337:1: ( rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 )
            // InternalErDsl.g:1338:2: rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1
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
    // InternalErDsl.g:1345:1: rule__Relation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Relation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1349:1: ( ( ',' ) )
            // InternalErDsl.g:1350:1: ( ',' )
            {
            // InternalErDsl.g:1350:1: ( ',' )
            // InternalErDsl.g:1351:2: ','
            {
             before(grammarAccess.getRelationAccess().getCommaKeyword_2_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalErDsl.g:1360:1: rule__Relation__Group_2_2__1 : rule__Relation__Group_2_2__1__Impl ;
    public final void rule__Relation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1364:1: ( rule__Relation__Group_2_2__1__Impl )
            // InternalErDsl.g:1365:2: rule__Relation__Group_2_2__1__Impl
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
    // InternalErDsl.g:1371:1: rule__Relation__Group_2_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Relation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1375:1: ( ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) )
            // InternalErDsl.g:1376:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDsl.g:1376:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            // InternalErDsl.g:1377:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDsl.g:1378:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            // InternalErDsl.g:1378:3: rule__Relation__AttributesAssignment_2_2_1
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
    // InternalErDsl.g:1387:1: rule__RelationSide__Group_0__0 : rule__RelationSide__Group_0__0__Impl rule__RelationSide__Group_0__1 ;
    public final void rule__RelationSide__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1391:1: ( rule__RelationSide__Group_0__0__Impl rule__RelationSide__Group_0__1 )
            // InternalErDsl.g:1392:2: rule__RelationSide__Group_0__0__Impl rule__RelationSide__Group_0__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalErDsl.g:1399:1: rule__RelationSide__Group_0__0__Impl : ( ( rule__RelationSide__MinimalCardinalityAssignment_0_0 )? ) ;
    public final void rule__RelationSide__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1403:1: ( ( ( rule__RelationSide__MinimalCardinalityAssignment_0_0 )? ) )
            // InternalErDsl.g:1404:1: ( ( rule__RelationSide__MinimalCardinalityAssignment_0_0 )? )
            {
            // InternalErDsl.g:1404:1: ( ( rule__RelationSide__MinimalCardinalityAssignment_0_0 )? )
            // InternalErDsl.g:1405:2: ( rule__RelationSide__MinimalCardinalityAssignment_0_0 )?
            {
             before(grammarAccess.getRelationSideAccess().getMinimalCardinalityAssignment_0_0()); 
            // InternalErDsl.g:1406:2: ( rule__RelationSide__MinimalCardinalityAssignment_0_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalErDsl.g:1406:3: rule__RelationSide__MinimalCardinalityAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationSide__MinimalCardinalityAssignment_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationSideAccess().getMinimalCardinalityAssignment_0_0()); 

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
    // InternalErDsl.g:1414:1: rule__RelationSide__Group_0__1 : rule__RelationSide__Group_0__1__Impl rule__RelationSide__Group_0__2 ;
    public final void rule__RelationSide__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1418:1: ( rule__RelationSide__Group_0__1__Impl rule__RelationSide__Group_0__2 )
            // InternalErDsl.g:1419:2: rule__RelationSide__Group_0__1__Impl rule__RelationSide__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__RelationSide__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationSide__Group_0__2();

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
    // InternalErDsl.g:1426:1: rule__RelationSide__Group_0__1__Impl : ( ( rule__RelationSide__MaximumCardinalityAssignment_0_1 ) ) ;
    public final void rule__RelationSide__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1430:1: ( ( ( rule__RelationSide__MaximumCardinalityAssignment_0_1 ) ) )
            // InternalErDsl.g:1431:1: ( ( rule__RelationSide__MaximumCardinalityAssignment_0_1 ) )
            {
            // InternalErDsl.g:1431:1: ( ( rule__RelationSide__MaximumCardinalityAssignment_0_1 ) )
            // InternalErDsl.g:1432:2: ( rule__RelationSide__MaximumCardinalityAssignment_0_1 )
            {
             before(grammarAccess.getRelationSideAccess().getMaximumCardinalityAssignment_0_1()); 
            // InternalErDsl.g:1433:2: ( rule__RelationSide__MaximumCardinalityAssignment_0_1 )
            // InternalErDsl.g:1433:3: rule__RelationSide__MaximumCardinalityAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationSide__MaximumCardinalityAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideAccess().getMaximumCardinalityAssignment_0_1()); 

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


    // $ANTLR start "rule__RelationSide__Group_0__2"
    // InternalErDsl.g:1441:1: rule__RelationSide__Group_0__2 : rule__RelationSide__Group_0__2__Impl ;
    public final void rule__RelationSide__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1445:1: ( rule__RelationSide__Group_0__2__Impl )
            // InternalErDsl.g:1446:2: rule__RelationSide__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationSide__Group_0__2__Impl();

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
    // $ANTLR end "rule__RelationSide__Group_0__2"


    // $ANTLR start "rule__RelationSide__Group_0__2__Impl"
    // InternalErDsl.g:1452:1: rule__RelationSide__Group_0__2__Impl : ( ( rule__RelationSide__TargetAssignment_0_2 ) ) ;
    public final void rule__RelationSide__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1456:1: ( ( ( rule__RelationSide__TargetAssignment_0_2 ) ) )
            // InternalErDsl.g:1457:1: ( ( rule__RelationSide__TargetAssignment_0_2 ) )
            {
            // InternalErDsl.g:1457:1: ( ( rule__RelationSide__TargetAssignment_0_2 ) )
            // InternalErDsl.g:1458:2: ( rule__RelationSide__TargetAssignment_0_2 )
            {
             before(grammarAccess.getRelationSideAccess().getTargetAssignment_0_2()); 
            // InternalErDsl.g:1459:2: ( rule__RelationSide__TargetAssignment_0_2 )
            // InternalErDsl.g:1459:3: rule__RelationSide__TargetAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationSide__TargetAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideAccess().getTargetAssignment_0_2()); 

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
    // $ANTLR end "rule__RelationSide__Group_0__2__Impl"


    // $ANTLR start "rule__ERModel__DomainAssignment_0"
    // InternalErDsl.g:1468:1: rule__ERModel__DomainAssignment_0 : ( ruleDomain ) ;
    public final void rule__ERModel__DomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1472:1: ( ( ruleDomain ) )
            // InternalErDsl.g:1473:2: ( ruleDomain )
            {
            // InternalErDsl.g:1473:2: ( ruleDomain )
            // InternalErDsl.g:1474:3: ruleDomain
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
    // InternalErDsl.g:1483:1: rule__ERModel__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__ERModel__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1487:1: ( ( ruleEntity ) )
            // InternalErDsl.g:1488:2: ( ruleEntity )
            {
            // InternalErDsl.g:1488:2: ( ruleEntity )
            // InternalErDsl.g:1489:3: ruleEntity
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
    // InternalErDsl.g:1498:1: rule__ERModel__RelationsAssignment_6 : ( ruleRelation ) ;
    public final void rule__ERModel__RelationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1502:1: ( ( ruleRelation ) )
            // InternalErDsl.g:1503:2: ( ruleRelation )
            {
            // InternalErDsl.g:1503:2: ( ruleRelation )
            // InternalErDsl.g:1504:3: ruleRelation
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
    // InternalErDsl.g:1513:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1517:1: ( ( RULE_ID ) )
            // InternalErDsl.g:1518:2: ( RULE_ID )
            {
            // InternalErDsl.g:1518:2: ( RULE_ID )
            // InternalErDsl.g:1519:3: RULE_ID
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
    // InternalErDsl.g:1528:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1532:1: ( ( RULE_ID ) )
            // InternalErDsl.g:1533:2: ( RULE_ID )
            {
            // InternalErDsl.g:1533:2: ( RULE_ID )
            // InternalErDsl.g:1534:3: RULE_ID
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


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalErDsl.g:1543:1: rule__Attribute__TypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1547:1: ( ( ruleDataType ) )
            // InternalErDsl.g:1548:2: ( ruleDataType )
            {
            // InternalErDsl.g:1548:2: ( ruleDataType )
            // InternalErDsl.g:1549:3: ruleDataType
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


    // $ANTLR start "rule__Attribute__IsKeyAssignment_3"
    // InternalErDsl.g:1558:1: rule__Attribute__IsKeyAssignment_3 : ( ( 'isIdentifier' ) ) ;
    public final void rule__Attribute__IsKeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1562:1: ( ( ( 'isIdentifier' ) ) )
            // InternalErDsl.g:1563:2: ( ( 'isIdentifier' ) )
            {
            // InternalErDsl.g:1563:2: ( ( 'isIdentifier' ) )
            // InternalErDsl.g:1564:3: ( 'isIdentifier' )
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_3_0()); 
            // InternalErDsl.g:1565:3: ( 'isIdentifier' )
            // InternalErDsl.g:1566:4: 'isIdentifier'
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_3_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_3_0()); 

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
    // $ANTLR end "rule__Attribute__IsKeyAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_0"
    // InternalErDsl.g:1577:1: rule__Entity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1581:1: ( ( RULE_ID ) )
            // InternalErDsl.g:1582:2: ( RULE_ID )
            {
            // InternalErDsl.g:1582:2: ( RULE_ID )
            // InternalErDsl.g:1583:3: RULE_ID
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
    // InternalErDsl.g:1592:1: rule__Entity__IsAAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__IsAAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1596:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl.g:1597:2: ( ( RULE_ID ) )
            {
            // InternalErDsl.g:1597:2: ( ( RULE_ID ) )
            // InternalErDsl.g:1598:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getIsAEntityCrossReference_1_1_0()); 
            // InternalErDsl.g:1599:3: ( RULE_ID )
            // InternalErDsl.g:1600:4: RULE_ID
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
    // InternalErDsl.g:1611:1: rule__Entity__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1615:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:1616:2: ( ruleAttribute )
            {
            // InternalErDsl.g:1616:2: ( ruleAttribute )
            // InternalErDsl.g:1617:3: ruleAttribute
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
    // InternalErDsl.g:1626:1: rule__Entity__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1630:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:1631:2: ( ruleAttribute )
            {
            // InternalErDsl.g:1631:2: ( ruleAttribute )
            // InternalErDsl.g:1632:3: ruleAttribute
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
    // InternalErDsl.g:1641:1: rule__Relation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1645:1: ( ( RULE_ID ) )
            // InternalErDsl.g:1646:2: ( RULE_ID )
            {
            // InternalErDsl.g:1646:2: ( RULE_ID )
            // InternalErDsl.g:1647:3: RULE_ID
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
    // InternalErDsl.g:1656:1: rule__Relation__LeftEndingAssignment_1_1 : ( ruleRelationSide ) ;
    public final void rule__Relation__LeftEndingAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1660:1: ( ( ruleRelationSide ) )
            // InternalErDsl.g:1661:2: ( ruleRelationSide )
            {
            // InternalErDsl.g:1661:2: ( ruleRelationSide )
            // InternalErDsl.g:1662:3: ruleRelationSide
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
    // InternalErDsl.g:1671:1: rule__Relation__RightEndingAssignment_1_3 : ( ruleRelationSide ) ;
    public final void rule__Relation__RightEndingAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1675:1: ( ( ruleRelationSide ) )
            // InternalErDsl.g:1676:2: ( ruleRelationSide )
            {
            // InternalErDsl.g:1676:2: ( ruleRelationSide )
            // InternalErDsl.g:1677:3: ruleRelationSide
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
    // InternalErDsl.g:1686:1: rule__Relation__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1690:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:1691:2: ( ruleAttribute )
            {
            // InternalErDsl.g:1691:2: ( ruleAttribute )
            // InternalErDsl.g:1692:3: ruleAttribute
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
    // InternalErDsl.g:1701:1: rule__Relation__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1705:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:1706:2: ( ruleAttribute )
            {
            // InternalErDsl.g:1706:2: ( ruleAttribute )
            // InternalErDsl.g:1707:3: ruleAttribute
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


    // $ANTLR start "rule__RelationSide__MinimalCardinalityAssignment_0_0"
    // InternalErDsl.g:1716:1: rule__RelationSide__MinimalCardinalityAssignment_0_0 : ( ( 'zero' ) ) ;
    public final void rule__RelationSide__MinimalCardinalityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1720:1: ( ( ( 'zero' ) ) )
            // InternalErDsl.g:1721:2: ( ( 'zero' ) )
            {
            // InternalErDsl.g:1721:2: ( ( 'zero' ) )
            // InternalErDsl.g:1722:3: ( 'zero' )
            {
             before(grammarAccess.getRelationSideAccess().getMinimalCardinalityZeroKeyword_0_0_0()); 
            // InternalErDsl.g:1723:3: ( 'zero' )
            // InternalErDsl.g:1724:4: 'zero'
            {
             before(grammarAccess.getRelationSideAccess().getMinimalCardinalityZeroKeyword_0_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRelationSideAccess().getMinimalCardinalityZeroKeyword_0_0_0()); 

            }

             after(grammarAccess.getRelationSideAccess().getMinimalCardinalityZeroKeyword_0_0_0()); 

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
    // $ANTLR end "rule__RelationSide__MinimalCardinalityAssignment_0_0"


    // $ANTLR start "rule__RelationSide__MaximumCardinalityAssignment_0_1"
    // InternalErDsl.g:1735:1: rule__RelationSide__MaximumCardinalityAssignment_0_1 : ( ruleCardinalityType ) ;
    public final void rule__RelationSide__MaximumCardinalityAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1739:1: ( ( ruleCardinalityType ) )
            // InternalErDsl.g:1740:2: ( ruleCardinalityType )
            {
            // InternalErDsl.g:1740:2: ( ruleCardinalityType )
            // InternalErDsl.g:1741:3: ruleCardinalityType
            {
             before(grammarAccess.getRelationSideAccess().getMaximumCardinalityCardinalityTypeEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinalityType();

            state._fsp--;

             after(grammarAccess.getRelationSideAccess().getMaximumCardinalityCardinalityTypeEnumRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__RelationSide__MaximumCardinalityAssignment_0_1"


    // $ANTLR start "rule__RelationSide__TargetAssignment_0_2"
    // InternalErDsl.g:1750:1: rule__RelationSide__TargetAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSide__TargetAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1754:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl.g:1755:2: ( ( RULE_ID ) )
            {
            // InternalErDsl.g:1755:2: ( ( RULE_ID ) )
            // InternalErDsl.g:1756:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideAccess().getTargetEntityCrossReference_0_2_0()); 
            // InternalErDsl.g:1757:3: ( RULE_ID )
            // InternalErDsl.g:1758:4: RULE_ID
            {
             before(grammarAccess.getRelationSideAccess().getTargetEntityIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationSideAccess().getTargetEntityIDTerminalRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getRelationSideAccess().getTargetEntityCrossReference_0_2_0()); 

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
    // $ANTLR end "rule__RelationSide__TargetAssignment_0_2"


    // $ANTLR start "rule__RelationSide__TargetAssignment_1"
    // InternalErDsl.g:1769:1: rule__RelationSide__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSide__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1773:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl.g:1774:2: ( ( RULE_ID ) )
            {
            // InternalErDsl.g:1774:2: ( ( RULE_ID ) )
            // InternalErDsl.g:1775:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideAccess().getTargetRelationCrossReference_1_0()); 
            // InternalErDsl.g:1776:3: ( RULE_ID )
            // InternalErDsl.g:1777:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040400010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000004000C0010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000004000C0000L});

}