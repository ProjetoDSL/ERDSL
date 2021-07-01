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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Logical Schema'", "'PostgreSQL'", "'MySQL'", "'All'", "'total/disjoint'", "'total/Overlapped'", "'partial/disjoint'", "'partial/overlapped'", "'(0:1)'", "'(1:1)'", "'(0:N)'", "'(1:N)'", "'int'", "'double'", "'money'", "'string'", "'boolean'", "'datetime'", "'file'", "';'", "'Generate'", "'Entities'", "'{'", "'}'", "'Relationships'", "'Domain'", "'is'", "','", "'['", "'relates'", "']'", "'isIdentifier'"
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


    // $ANTLR start "entryRuleRelationSideRight"
    // InternalErDsl.g:178:1: entryRuleRelationSideRight : ruleRelationSideRight EOF ;
    public final void entryRuleRelationSideRight() throws RecognitionException {
        try {
            // InternalErDsl.g:179:1: ( ruleRelationSideRight EOF )
            // InternalErDsl.g:180:1: ruleRelationSideRight EOF
            {
             before(grammarAccess.getRelationSideRightRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationSideRight();

            state._fsp--;

             after(grammarAccess.getRelationSideRightRule()); 
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
    // $ANTLR end "entryRuleRelationSideRight"


    // $ANTLR start "ruleRelationSideRight"
    // InternalErDsl.g:187:1: ruleRelationSideRight : ( ( rule__RelationSideRight__Alternatives ) ) ;
    public final void ruleRelationSideRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:191:2: ( ( ( rule__RelationSideRight__Alternatives ) ) )
            // InternalErDsl.g:192:2: ( ( rule__RelationSideRight__Alternatives ) )
            {
            // InternalErDsl.g:192:2: ( ( rule__RelationSideRight__Alternatives ) )
            // InternalErDsl.g:193:3: ( rule__RelationSideRight__Alternatives )
            {
             before(grammarAccess.getRelationSideRightAccess().getAlternatives()); 
            // InternalErDsl.g:194:3: ( rule__RelationSideRight__Alternatives )
            // InternalErDsl.g:194:4: rule__RelationSideRight__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationSideRight__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideRightAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationSideRight"


    // $ANTLR start "entryRuleRelationSideLeft"
    // InternalErDsl.g:203:1: entryRuleRelationSideLeft : ruleRelationSideLeft EOF ;
    public final void entryRuleRelationSideLeft() throws RecognitionException {
        try {
            // InternalErDsl.g:204:1: ( ruleRelationSideLeft EOF )
            // InternalErDsl.g:205:1: ruleRelationSideLeft EOF
            {
             before(grammarAccess.getRelationSideLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationSideLeft();

            state._fsp--;

             after(grammarAccess.getRelationSideLeftRule()); 
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
    // $ANTLR end "entryRuleRelationSideLeft"


    // $ANTLR start "ruleRelationSideLeft"
    // InternalErDsl.g:212:1: ruleRelationSideLeft : ( ( rule__RelationSideLeft__Alternatives ) ) ;
    public final void ruleRelationSideLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:216:2: ( ( ( rule__RelationSideLeft__Alternatives ) ) )
            // InternalErDsl.g:217:2: ( ( rule__RelationSideLeft__Alternatives ) )
            {
            // InternalErDsl.g:217:2: ( ( rule__RelationSideLeft__Alternatives ) )
            // InternalErDsl.g:218:3: ( rule__RelationSideLeft__Alternatives )
            {
             before(grammarAccess.getRelationSideLeftAccess().getAlternatives()); 
            // InternalErDsl.g:219:3: ( rule__RelationSideLeft__Alternatives )
            // InternalErDsl.g:219:4: rule__RelationSideLeft__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RelationSideLeft__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideLeftAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationSideLeft"


    // $ANTLR start "ruleDataType"
    // InternalErDsl.g:228:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:232:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalErDsl.g:233:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalErDsl.g:233:2: ( ( rule__DataType__Alternatives ) )
            // InternalErDsl.g:234:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalErDsl.g:235:3: ( rule__DataType__Alternatives )
            // InternalErDsl.g:235:4: rule__DataType__Alternatives
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


    // $ANTLR start "rule__ERModel__TargetGeneratorAlternatives_0_1_0"
    // InternalErDsl.g:243:1: rule__ERModel__TargetGeneratorAlternatives_0_1_0 : ( ( 'Logical Schema' ) | ( 'PostgreSQL' ) | ( 'MySQL' ) | ( 'All' ) );
    public final void rule__ERModel__TargetGeneratorAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:247:1: ( ( 'Logical Schema' ) | ( 'PostgreSQL' ) | ( 'MySQL' ) | ( 'All' ) )
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
                    // InternalErDsl.g:248:2: ( 'Logical Schema' )
                    {
                    // InternalErDsl.g:248:2: ( 'Logical Schema' )
                    // InternalErDsl.g:249:3: 'Logical Schema'
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorLogicalSchemaKeyword_0_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getERModelAccess().getTargetGeneratorLogicalSchemaKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:254:2: ( 'PostgreSQL' )
                    {
                    // InternalErDsl.g:254:2: ( 'PostgreSQL' )
                    // InternalErDsl.g:255:3: 'PostgreSQL'
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorPostgreSQLKeyword_0_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getERModelAccess().getTargetGeneratorPostgreSQLKeyword_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl.g:260:2: ( 'MySQL' )
                    {
                    // InternalErDsl.g:260:2: ( 'MySQL' )
                    // InternalErDsl.g:261:3: 'MySQL'
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorMySQLKeyword_0_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getERModelAccess().getTargetGeneratorMySQLKeyword_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl.g:266:2: ( 'All' )
                    {
                    // InternalErDsl.g:266:2: ( 'All' )
                    // InternalErDsl.g:267:3: 'All'
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorAllKeyword_0_1_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getERModelAccess().getTargetGeneratorAllKeyword_0_1_0_3()); 

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
    // $ANTLR end "rule__ERModel__TargetGeneratorAlternatives_0_1_0"


    // $ANTLR start "rule__Entity__GeneralizationAlternatives_1_1_0"
    // InternalErDsl.g:276:1: rule__Entity__GeneralizationAlternatives_1_1_0 : ( ( 'total/disjoint' ) | ( 'total/Overlapped' ) | ( 'partial/disjoint' ) | ( 'partial/overlapped' ) );
    public final void rule__Entity__GeneralizationAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:280:1: ( ( 'total/disjoint' ) | ( 'total/Overlapped' ) | ( 'partial/disjoint' ) | ( 'partial/overlapped' ) )
            int alt2=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalErDsl.g:281:2: ( 'total/disjoint' )
                    {
                    // InternalErDsl.g:281:2: ( 'total/disjoint' )
                    // InternalErDsl.g:282:3: 'total/disjoint'
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationTotalDisjointKeyword_1_1_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getGeneralizationTotalDisjointKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:287:2: ( 'total/Overlapped' )
                    {
                    // InternalErDsl.g:287:2: ( 'total/Overlapped' )
                    // InternalErDsl.g:288:3: 'total/Overlapped'
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationTotalOverlappedKeyword_1_1_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getGeneralizationTotalOverlappedKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl.g:293:2: ( 'partial/disjoint' )
                    {
                    // InternalErDsl.g:293:2: ( 'partial/disjoint' )
                    // InternalErDsl.g:294:3: 'partial/disjoint'
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationPartialDisjointKeyword_1_1_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getGeneralizationPartialDisjointKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl.g:299:2: ( 'partial/overlapped' )
                    {
                    // InternalErDsl.g:299:2: ( 'partial/overlapped' )
                    // InternalErDsl.g:300:3: 'partial/overlapped'
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationPartialOverlappedKeyword_1_1_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getGeneralizationPartialOverlappedKeyword_1_1_0_3()); 

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
    // $ANTLR end "rule__Entity__GeneralizationAlternatives_1_1_0"


    // $ANTLR start "rule__RelationSideRight__Alternatives"
    // InternalErDsl.g:309:1: rule__RelationSideRight__Alternatives : ( ( ( rule__RelationSideRight__Group_0__0 ) ) | ( ( rule__RelationSideRight__TargetAssignment_1 ) ) );
    public final void rule__RelationSideRight__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:313:1: ( ( ( rule__RelationSideRight__Group_0__0 ) ) | ( ( rule__RelationSideRight__TargetAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=19 && LA3_0<=22)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalErDsl.g:314:2: ( ( rule__RelationSideRight__Group_0__0 ) )
                    {
                    // InternalErDsl.g:314:2: ( ( rule__RelationSideRight__Group_0__0 ) )
                    // InternalErDsl.g:315:3: ( rule__RelationSideRight__Group_0__0 )
                    {
                     before(grammarAccess.getRelationSideRightAccess().getGroup_0()); 
                    // InternalErDsl.g:316:3: ( rule__RelationSideRight__Group_0__0 )
                    // InternalErDsl.g:316:4: rule__RelationSideRight__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationSideRight__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationSideRightAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:320:2: ( ( rule__RelationSideRight__TargetAssignment_1 ) )
                    {
                    // InternalErDsl.g:320:2: ( ( rule__RelationSideRight__TargetAssignment_1 ) )
                    // InternalErDsl.g:321:3: ( rule__RelationSideRight__TargetAssignment_1 )
                    {
                     before(grammarAccess.getRelationSideRightAccess().getTargetAssignment_1()); 
                    // InternalErDsl.g:322:3: ( rule__RelationSideRight__TargetAssignment_1 )
                    // InternalErDsl.g:322:4: rule__RelationSideRight__TargetAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationSideRight__TargetAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationSideRightAccess().getTargetAssignment_1()); 

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
    // $ANTLR end "rule__RelationSideRight__Alternatives"


    // $ANTLR start "rule__RelationSideRight__CardinalityAlternatives_0_0_0"
    // InternalErDsl.g:330:1: rule__RelationSideRight__CardinalityAlternatives_0_0_0 : ( ( '(0:1)' ) | ( '(1:1)' ) | ( '(0:N)' ) | ( '(1:N)' ) );
    public final void rule__RelationSideRight__CardinalityAlternatives_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:334:1: ( ( '(0:1)' ) | ( '(1:1)' ) | ( '(0:N)' ) | ( '(1:N)' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalErDsl.g:335:2: ( '(0:1)' )
                    {
                    // InternalErDsl.g:335:2: ( '(0:1)' )
                    // InternalErDsl.g:336:3: '(0:1)'
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality01Keyword_0_0_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getRelationSideRightAccess().getCardinality01Keyword_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:341:2: ( '(1:1)' )
                    {
                    // InternalErDsl.g:341:2: ( '(1:1)' )
                    // InternalErDsl.g:342:3: '(1:1)'
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality11Keyword_0_0_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getRelationSideRightAccess().getCardinality11Keyword_0_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl.g:347:2: ( '(0:N)' )
                    {
                    // InternalErDsl.g:347:2: ( '(0:N)' )
                    // InternalErDsl.g:348:3: '(0:N)'
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality0NKeyword_0_0_0_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getRelationSideRightAccess().getCardinality0NKeyword_0_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl.g:353:2: ( '(1:N)' )
                    {
                    // InternalErDsl.g:353:2: ( '(1:N)' )
                    // InternalErDsl.g:354:3: '(1:N)'
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality1NKeyword_0_0_0_3()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getRelationSideRightAccess().getCardinality1NKeyword_0_0_0_3()); 

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
    // $ANTLR end "rule__RelationSideRight__CardinalityAlternatives_0_0_0"


    // $ANTLR start "rule__RelationSideLeft__Alternatives"
    // InternalErDsl.g:363:1: rule__RelationSideLeft__Alternatives : ( ( ( rule__RelationSideLeft__TargetAssignment_0 ) ) | ( ( rule__RelationSideLeft__Group_1__0 ) ) );
    public final void rule__RelationSideLeft__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:367:1: ( ( ( rule__RelationSideLeft__TargetAssignment_0 ) ) | ( ( rule__RelationSideLeft__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==40) ) {
                    alt5=1;
                }
                else if ( ((LA5_1>=19 && LA5_1<=22)) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalErDsl.g:368:2: ( ( rule__RelationSideLeft__TargetAssignment_0 ) )
                    {
                    // InternalErDsl.g:368:2: ( ( rule__RelationSideLeft__TargetAssignment_0 ) )
                    // InternalErDsl.g:369:3: ( rule__RelationSideLeft__TargetAssignment_0 )
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getTargetAssignment_0()); 
                    // InternalErDsl.g:370:3: ( rule__RelationSideLeft__TargetAssignment_0 )
                    // InternalErDsl.g:370:4: rule__RelationSideLeft__TargetAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationSideLeft__TargetAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationSideLeftAccess().getTargetAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:374:2: ( ( rule__RelationSideLeft__Group_1__0 ) )
                    {
                    // InternalErDsl.g:374:2: ( ( rule__RelationSideLeft__Group_1__0 ) )
                    // InternalErDsl.g:375:3: ( rule__RelationSideLeft__Group_1__0 )
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getGroup_1()); 
                    // InternalErDsl.g:376:3: ( rule__RelationSideLeft__Group_1__0 )
                    // InternalErDsl.g:376:4: rule__RelationSideLeft__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelationSideLeft__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationSideLeftAccess().getGroup_1()); 

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
    // $ANTLR end "rule__RelationSideLeft__Alternatives"


    // $ANTLR start "rule__RelationSideLeft__CardinalityAlternatives_1_1_0"
    // InternalErDsl.g:384:1: rule__RelationSideLeft__CardinalityAlternatives_1_1_0 : ( ( '(0:1)' ) | ( '(1:1)' ) | ( '(0:N)' ) | ( '(1:N)' ) );
    public final void rule__RelationSideLeft__CardinalityAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:388:1: ( ( '(0:1)' ) | ( '(1:1)' ) | ( '(0:N)' ) | ( '(1:N)' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
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
                    // InternalErDsl.g:389:2: ( '(0:1)' )
                    {
                    // InternalErDsl.g:389:2: ( '(0:1)' )
                    // InternalErDsl.g:390:3: '(0:1)'
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality01Keyword_1_1_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getRelationSideLeftAccess().getCardinality01Keyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:395:2: ( '(1:1)' )
                    {
                    // InternalErDsl.g:395:2: ( '(1:1)' )
                    // InternalErDsl.g:396:3: '(1:1)'
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality11Keyword_1_1_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getRelationSideLeftAccess().getCardinality11Keyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl.g:401:2: ( '(0:N)' )
                    {
                    // InternalErDsl.g:401:2: ( '(0:N)' )
                    // InternalErDsl.g:402:3: '(0:N)'
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality0NKeyword_1_1_0_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getRelationSideLeftAccess().getCardinality0NKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl.g:407:2: ( '(1:N)' )
                    {
                    // InternalErDsl.g:407:2: ( '(1:N)' )
                    // InternalErDsl.g:408:3: '(1:N)'
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality1NKeyword_1_1_0_3()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getRelationSideLeftAccess().getCardinality1NKeyword_1_1_0_3()); 

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
    // $ANTLR end "rule__RelationSideLeft__CardinalityAlternatives_1_1_0"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalErDsl.g:417:1: rule__DataType__Alternatives : ( ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'money' ) ) | ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'datetime' ) ) | ( ( 'file' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:421:1: ( ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'money' ) ) | ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'datetime' ) ) | ( ( 'file' ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            case 27:
                {
                alt7=5;
                }
                break;
            case 28:
                {
                alt7=6;
                }
                break;
            case 29:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalErDsl.g:422:2: ( ( 'int' ) )
                    {
                    // InternalErDsl.g:422:2: ( ( 'int' ) )
                    // InternalErDsl.g:423:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalErDsl.g:424:3: ( 'int' )
                    // InternalErDsl.g:424:4: 'int'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:428:2: ( ( 'double' ) )
                    {
                    // InternalErDsl.g:428:2: ( ( 'double' ) )
                    // InternalErDsl.g:429:3: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                    // InternalErDsl.g:430:3: ( 'double' )
                    // InternalErDsl.g:430:4: 'double'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl.g:434:2: ( ( 'money' ) )
                    {
                    // InternalErDsl.g:434:2: ( ( 'money' ) )
                    // InternalErDsl.g:435:3: ( 'money' )
                    {
                     before(grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2()); 
                    // InternalErDsl.g:436:3: ( 'money' )
                    // InternalErDsl.g:436:4: 'money'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl.g:440:2: ( ( 'string' ) )
                    {
                    // InternalErDsl.g:440:2: ( ( 'string' ) )
                    // InternalErDsl.g:441:3: ( 'string' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                    // InternalErDsl.g:442:3: ( 'string' )
                    // InternalErDsl.g:442:4: 'string'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalErDsl.g:446:2: ( ( 'boolean' ) )
                    {
                    // InternalErDsl.g:446:2: ( ( 'boolean' ) )
                    // InternalErDsl.g:447:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 
                    // InternalErDsl.g:448:3: ( 'boolean' )
                    // InternalErDsl.g:448:4: 'boolean'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalErDsl.g:452:2: ( ( 'datetime' ) )
                    {
                    // InternalErDsl.g:452:2: ( ( 'datetime' ) )
                    // InternalErDsl.g:453:3: ( 'datetime' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5()); 
                    // InternalErDsl.g:454:3: ( 'datetime' )
                    // InternalErDsl.g:454:4: 'datetime'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalErDsl.g:458:2: ( ( 'file' ) )
                    {
                    // InternalErDsl.g:458:2: ( ( 'file' ) )
                    // InternalErDsl.g:459:3: ( 'file' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBLOBEnumLiteralDeclaration_6()); 
                    // InternalErDsl.g:460:3: ( 'file' )
                    // InternalErDsl.g:460:4: 'file'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalErDsl.g:468:1: rule__ERModel__Group__0 : rule__ERModel__Group__0__Impl rule__ERModel__Group__1 ;
    public final void rule__ERModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:472:1: ( rule__ERModel__Group__0__Impl rule__ERModel__Group__1 )
            // InternalErDsl.g:473:2: rule__ERModel__Group__0__Impl rule__ERModel__Group__1
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
    // InternalErDsl.g:480:1: rule__ERModel__Group__0__Impl : ( ( rule__ERModel__Group_0__0 )? ) ;
    public final void rule__ERModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:484:1: ( ( ( rule__ERModel__Group_0__0 )? ) )
            // InternalErDsl.g:485:1: ( ( rule__ERModel__Group_0__0 )? )
            {
            // InternalErDsl.g:485:1: ( ( rule__ERModel__Group_0__0 )? )
            // InternalErDsl.g:486:2: ( rule__ERModel__Group_0__0 )?
            {
             before(grammarAccess.getERModelAccess().getGroup_0()); 
            // InternalErDsl.g:487:2: ( rule__ERModel__Group_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalErDsl.g:487:3: rule__ERModel__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ERModel__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getERModelAccess().getGroup_0()); 

            }


            }

        }
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
    // InternalErDsl.g:495:1: rule__ERModel__Group__1 : rule__ERModel__Group__1__Impl rule__ERModel__Group__2 ;
    public final void rule__ERModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:499:1: ( rule__ERModel__Group__1__Impl rule__ERModel__Group__2 )
            // InternalErDsl.g:500:2: rule__ERModel__Group__1__Impl rule__ERModel__Group__2
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
    // InternalErDsl.g:507:1: rule__ERModel__Group__1__Impl : ( ( rule__ERModel__DomainAssignment_1 ) ) ;
    public final void rule__ERModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:511:1: ( ( ( rule__ERModel__DomainAssignment_1 ) ) )
            // InternalErDsl.g:512:1: ( ( rule__ERModel__DomainAssignment_1 ) )
            {
            // InternalErDsl.g:512:1: ( ( rule__ERModel__DomainAssignment_1 ) )
            // InternalErDsl.g:513:2: ( rule__ERModel__DomainAssignment_1 )
            {
             before(grammarAccess.getERModelAccess().getDomainAssignment_1()); 
            // InternalErDsl.g:514:2: ( rule__ERModel__DomainAssignment_1 )
            // InternalErDsl.g:514:3: rule__ERModel__DomainAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__DomainAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getDomainAssignment_1()); 

            }


            }

        }
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
    // InternalErDsl.g:522:1: rule__ERModel__Group__2 : rule__ERModel__Group__2__Impl rule__ERModel__Group__3 ;
    public final void rule__ERModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:526:1: ( rule__ERModel__Group__2__Impl rule__ERModel__Group__3 )
            // InternalErDsl.g:527:2: rule__ERModel__Group__2__Impl rule__ERModel__Group__3
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
    // InternalErDsl.g:534:1: rule__ERModel__Group__2__Impl : ( ';' ) ;
    public final void rule__ERModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:538:1: ( ( ';' ) )
            // InternalErDsl.g:539:1: ( ';' )
            {
            // InternalErDsl.g:539:1: ( ';' )
            // InternalErDsl.g:540:2: ';'
            {
             before(grammarAccess.getERModelAccess().getSemicolonKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getSemicolonKeyword_2()); 

            }


            }

        }
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
    // InternalErDsl.g:549:1: rule__ERModel__Group__3 : rule__ERModel__Group__3__Impl rule__ERModel__Group__4 ;
    public final void rule__ERModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:553:1: ( rule__ERModel__Group__3__Impl rule__ERModel__Group__4 )
            // InternalErDsl.g:554:2: rule__ERModel__Group__3__Impl rule__ERModel__Group__4
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
    // InternalErDsl.g:561:1: rule__ERModel__Group__3__Impl : ( ( rule__ERModel__Group_3__0 ) ) ;
    public final void rule__ERModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:565:1: ( ( ( rule__ERModel__Group_3__0 ) ) )
            // InternalErDsl.g:566:1: ( ( rule__ERModel__Group_3__0 ) )
            {
            // InternalErDsl.g:566:1: ( ( rule__ERModel__Group_3__0 ) )
            // InternalErDsl.g:567:2: ( rule__ERModel__Group_3__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_3()); 
            // InternalErDsl.g:568:2: ( rule__ERModel__Group_3__0 )
            // InternalErDsl.g:568:3: rule__ERModel__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalErDsl.g:576:1: rule__ERModel__Group__4 : rule__ERModel__Group__4__Impl rule__ERModel__Group__5 ;
    public final void rule__ERModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:580:1: ( rule__ERModel__Group__4__Impl rule__ERModel__Group__5 )
            // InternalErDsl.g:581:2: rule__ERModel__Group__4__Impl rule__ERModel__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalErDsl.g:588:1: rule__ERModel__Group__4__Impl : ( ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* ) ) ;
    public final void rule__ERModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:592:1: ( ( ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* ) ) )
            // InternalErDsl.g:593:1: ( ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* ) )
            {
            // InternalErDsl.g:593:1: ( ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* ) )
            // InternalErDsl.g:594:2: ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* )
            {
            // InternalErDsl.g:594:2: ( ( rule__ERModel__EntitiesAssignment_4 ) )
            // InternalErDsl.g:595:3: ( rule__ERModel__EntitiesAssignment_4 )
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_4()); 
            // InternalErDsl.g:596:3: ( rule__ERModel__EntitiesAssignment_4 )
            // InternalErDsl.g:596:4: rule__ERModel__EntitiesAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__ERModel__EntitiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getEntitiesAssignment_4()); 

            }

            // InternalErDsl.g:599:2: ( ( rule__ERModel__EntitiesAssignment_4 )* )
            // InternalErDsl.g:600:3: ( rule__ERModel__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_4()); 
            // InternalErDsl.g:601:3: ( rule__ERModel__EntitiesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalErDsl.g:601:4: rule__ERModel__EntitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ERModel__EntitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getERModelAccess().getEntitiesAssignment_4()); 

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
    // $ANTLR end "rule__ERModel__Group__4__Impl"


    // $ANTLR start "rule__ERModel__Group__5"
    // InternalErDsl.g:610:1: rule__ERModel__Group__5 : rule__ERModel__Group__5__Impl rule__ERModel__Group__6 ;
    public final void rule__ERModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:614:1: ( rule__ERModel__Group__5__Impl rule__ERModel__Group__6 )
            // InternalErDsl.g:615:2: rule__ERModel__Group__5__Impl rule__ERModel__Group__6
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
    // InternalErDsl.g:622:1: rule__ERModel__Group__5__Impl : ( ( rule__ERModel__Group_5__0 ) ) ;
    public final void rule__ERModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:626:1: ( ( ( rule__ERModel__Group_5__0 ) ) )
            // InternalErDsl.g:627:1: ( ( rule__ERModel__Group_5__0 ) )
            {
            // InternalErDsl.g:627:1: ( ( rule__ERModel__Group_5__0 ) )
            // InternalErDsl.g:628:2: ( rule__ERModel__Group_5__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_5()); 
            // InternalErDsl.g:629:2: ( rule__ERModel__Group_5__0 )
            // InternalErDsl.g:629:3: rule__ERModel__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalErDsl.g:637:1: rule__ERModel__Group__6 : rule__ERModel__Group__6__Impl rule__ERModel__Group__7 ;
    public final void rule__ERModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:641:1: ( rule__ERModel__Group__6__Impl rule__ERModel__Group__7 )
            // InternalErDsl.g:642:2: rule__ERModel__Group__6__Impl rule__ERModel__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalErDsl.g:649:1: rule__ERModel__Group__6__Impl : ( ( rule__ERModel__Group_6__0 ) ) ;
    public final void rule__ERModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:653:1: ( ( ( rule__ERModel__Group_6__0 ) ) )
            // InternalErDsl.g:654:1: ( ( rule__ERModel__Group_6__0 ) )
            {
            // InternalErDsl.g:654:1: ( ( rule__ERModel__Group_6__0 ) )
            // InternalErDsl.g:655:2: ( rule__ERModel__Group_6__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_6()); 
            // InternalErDsl.g:656:2: ( rule__ERModel__Group_6__0 )
            // InternalErDsl.g:656:3: rule__ERModel__Group_6__0
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalErDsl.g:664:1: rule__ERModel__Group__7 : rule__ERModel__Group__7__Impl rule__ERModel__Group__8 ;
    public final void rule__ERModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:668:1: ( rule__ERModel__Group__7__Impl rule__ERModel__Group__8 )
            // InternalErDsl.g:669:2: rule__ERModel__Group__7__Impl rule__ERModel__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__ERModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group__8();

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
    // InternalErDsl.g:676:1: rule__ERModel__Group__7__Impl : ( ( rule__ERModel__RelationsAssignment_7 )* ) ;
    public final void rule__ERModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:680:1: ( ( ( rule__ERModel__RelationsAssignment_7 )* ) )
            // InternalErDsl.g:681:1: ( ( rule__ERModel__RelationsAssignment_7 )* )
            {
            // InternalErDsl.g:681:1: ( ( rule__ERModel__RelationsAssignment_7 )* )
            // InternalErDsl.g:682:2: ( rule__ERModel__RelationsAssignment_7 )*
            {
             before(grammarAccess.getERModelAccess().getRelationsAssignment_7()); 
            // InternalErDsl.g:683:2: ( rule__ERModel__RelationsAssignment_7 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==39) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalErDsl.g:683:3: rule__ERModel__RelationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ERModel__RelationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getERModelAccess().getRelationsAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__ERModel__Group__8"
    // InternalErDsl.g:691:1: rule__ERModel__Group__8 : rule__ERModel__Group__8__Impl ;
    public final void rule__ERModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:695:1: ( rule__ERModel__Group__8__Impl )
            // InternalErDsl.g:696:2: rule__ERModel__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group__8__Impl();

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
    // $ANTLR end "rule__ERModel__Group__8"


    // $ANTLR start "rule__ERModel__Group__8__Impl"
    // InternalErDsl.g:702:1: rule__ERModel__Group__8__Impl : ( ( rule__ERModel__Group_8__0 ) ) ;
    public final void rule__ERModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:706:1: ( ( ( rule__ERModel__Group_8__0 ) ) )
            // InternalErDsl.g:707:1: ( ( rule__ERModel__Group_8__0 ) )
            {
            // InternalErDsl.g:707:1: ( ( rule__ERModel__Group_8__0 ) )
            // InternalErDsl.g:708:2: ( rule__ERModel__Group_8__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_8()); 
            // InternalErDsl.g:709:2: ( rule__ERModel__Group_8__0 )
            // InternalErDsl.g:709:3: rule__ERModel__Group_8__0
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group__8__Impl"


    // $ANTLR start "rule__ERModel__Group_0__0"
    // InternalErDsl.g:718:1: rule__ERModel__Group_0__0 : rule__ERModel__Group_0__0__Impl rule__ERModel__Group_0__1 ;
    public final void rule__ERModel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:722:1: ( rule__ERModel__Group_0__0__Impl rule__ERModel__Group_0__1 )
            // InternalErDsl.g:723:2: rule__ERModel__Group_0__0__Impl rule__ERModel__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__ERModel__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group_0__1();

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
    // $ANTLR end "rule__ERModel__Group_0__0"


    // $ANTLR start "rule__ERModel__Group_0__0__Impl"
    // InternalErDsl.g:730:1: rule__ERModel__Group_0__0__Impl : ( 'Generate' ) ;
    public final void rule__ERModel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:734:1: ( ( 'Generate' ) )
            // InternalErDsl.g:735:1: ( 'Generate' )
            {
            // InternalErDsl.g:735:1: ( 'Generate' )
            // InternalErDsl.g:736:2: 'Generate'
            {
             before(grammarAccess.getERModelAccess().getGenerateKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getGenerateKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_0__0__Impl"


    // $ANTLR start "rule__ERModel__Group_0__1"
    // InternalErDsl.g:745:1: rule__ERModel__Group_0__1 : rule__ERModel__Group_0__1__Impl rule__ERModel__Group_0__2 ;
    public final void rule__ERModel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:749:1: ( rule__ERModel__Group_0__1__Impl rule__ERModel__Group_0__2 )
            // InternalErDsl.g:750:2: rule__ERModel__Group_0__1__Impl rule__ERModel__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__ERModel__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group_0__2();

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
    // $ANTLR end "rule__ERModel__Group_0__1"


    // $ANTLR start "rule__ERModel__Group_0__1__Impl"
    // InternalErDsl.g:757:1: rule__ERModel__Group_0__1__Impl : ( ( rule__ERModel__TargetGeneratorAssignment_0_1 ) ) ;
    public final void rule__ERModel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:761:1: ( ( ( rule__ERModel__TargetGeneratorAssignment_0_1 ) ) )
            // InternalErDsl.g:762:1: ( ( rule__ERModel__TargetGeneratorAssignment_0_1 ) )
            {
            // InternalErDsl.g:762:1: ( ( rule__ERModel__TargetGeneratorAssignment_0_1 ) )
            // InternalErDsl.g:763:2: ( rule__ERModel__TargetGeneratorAssignment_0_1 )
            {
             before(grammarAccess.getERModelAccess().getTargetGeneratorAssignment_0_1()); 
            // InternalErDsl.g:764:2: ( rule__ERModel__TargetGeneratorAssignment_0_1 )
            // InternalErDsl.g:764:3: rule__ERModel__TargetGeneratorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__TargetGeneratorAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getTargetGeneratorAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_0__1__Impl"


    // $ANTLR start "rule__ERModel__Group_0__2"
    // InternalErDsl.g:772:1: rule__ERModel__Group_0__2 : rule__ERModel__Group_0__2__Impl ;
    public final void rule__ERModel__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:776:1: ( rule__ERModel__Group_0__2__Impl )
            // InternalErDsl.g:777:2: rule__ERModel__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group_0__2__Impl();

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
    // $ANTLR end "rule__ERModel__Group_0__2"


    // $ANTLR start "rule__ERModel__Group_0__2__Impl"
    // InternalErDsl.g:783:1: rule__ERModel__Group_0__2__Impl : ( ';' ) ;
    public final void rule__ERModel__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:787:1: ( ( ';' ) )
            // InternalErDsl.g:788:1: ( ';' )
            {
            // InternalErDsl.g:788:1: ( ';' )
            // InternalErDsl.g:789:2: ';'
            {
             before(grammarAccess.getERModelAccess().getSemicolonKeyword_0_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getSemicolonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_0__2__Impl"


    // $ANTLR start "rule__ERModel__Group_3__0"
    // InternalErDsl.g:799:1: rule__ERModel__Group_3__0 : rule__ERModel__Group_3__0__Impl rule__ERModel__Group_3__1 ;
    public final void rule__ERModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:803:1: ( rule__ERModel__Group_3__0__Impl rule__ERModel__Group_3__1 )
            // InternalErDsl.g:804:2: rule__ERModel__Group_3__0__Impl rule__ERModel__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ERModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group_3__1();

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
    // $ANTLR end "rule__ERModel__Group_3__0"


    // $ANTLR start "rule__ERModel__Group_3__0__Impl"
    // InternalErDsl.g:811:1: rule__ERModel__Group_3__0__Impl : ( 'Entities' ) ;
    public final void rule__ERModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:815:1: ( ( 'Entities' ) )
            // InternalErDsl.g:816:1: ( 'Entities' )
            {
            // InternalErDsl.g:816:1: ( 'Entities' )
            // InternalErDsl.g:817:2: 'Entities'
            {
             before(grammarAccess.getERModelAccess().getEntitiesKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getEntitiesKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_3__0__Impl"


    // $ANTLR start "rule__ERModel__Group_3__1"
    // InternalErDsl.g:826:1: rule__ERModel__Group_3__1 : rule__ERModel__Group_3__1__Impl ;
    public final void rule__ERModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:830:1: ( rule__ERModel__Group_3__1__Impl )
            // InternalErDsl.g:831:2: rule__ERModel__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group_3__1__Impl();

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
    // $ANTLR end "rule__ERModel__Group_3__1"


    // $ANTLR start "rule__ERModel__Group_3__1__Impl"
    // InternalErDsl.g:837:1: rule__ERModel__Group_3__1__Impl : ( '{' ) ;
    public final void rule__ERModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:841:1: ( ( '{' ) )
            // InternalErDsl.g:842:1: ( '{' )
            {
            // InternalErDsl.g:842:1: ( '{' )
            // InternalErDsl.g:843:2: '{'
            {
             before(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_3__1__Impl"


    // $ANTLR start "rule__ERModel__Group_5__0"
    // InternalErDsl.g:853:1: rule__ERModel__Group_5__0 : rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1 ;
    public final void rule__ERModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:857:1: ( rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1 )
            // InternalErDsl.g:858:2: rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__ERModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group_5__1();

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
    // $ANTLR end "rule__ERModel__Group_5__0"


    // $ANTLR start "rule__ERModel__Group_5__0__Impl"
    // InternalErDsl.g:865:1: rule__ERModel__Group_5__0__Impl : ( '}' ) ;
    public final void rule__ERModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:869:1: ( ( '}' ) )
            // InternalErDsl.g:870:1: ( '}' )
            {
            // InternalErDsl.g:870:1: ( '}' )
            // InternalErDsl.g:871:2: '}'
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_5__0__Impl"


    // $ANTLR start "rule__ERModel__Group_5__1"
    // InternalErDsl.g:880:1: rule__ERModel__Group_5__1 : rule__ERModel__Group_5__1__Impl ;
    public final void rule__ERModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:884:1: ( rule__ERModel__Group_5__1__Impl )
            // InternalErDsl.g:885:2: rule__ERModel__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group_5__1__Impl();

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
    // $ANTLR end "rule__ERModel__Group_5__1"


    // $ANTLR start "rule__ERModel__Group_5__1__Impl"
    // InternalErDsl.g:891:1: rule__ERModel__Group_5__1__Impl : ( ';' ) ;
    public final void rule__ERModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:895:1: ( ( ';' ) )
            // InternalErDsl.g:896:1: ( ';' )
            {
            // InternalErDsl.g:896:1: ( ';' )
            // InternalErDsl.g:897:2: ';'
            {
             before(grammarAccess.getERModelAccess().getSemicolonKeyword_5_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getSemicolonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_5__1__Impl"


    // $ANTLR start "rule__ERModel__Group_6__0"
    // InternalErDsl.g:907:1: rule__ERModel__Group_6__0 : rule__ERModel__Group_6__0__Impl rule__ERModel__Group_6__1 ;
    public final void rule__ERModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:911:1: ( rule__ERModel__Group_6__0__Impl rule__ERModel__Group_6__1 )
            // InternalErDsl.g:912:2: rule__ERModel__Group_6__0__Impl rule__ERModel__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__ERModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group_6__1();

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
    // $ANTLR end "rule__ERModel__Group_6__0"


    // $ANTLR start "rule__ERModel__Group_6__0__Impl"
    // InternalErDsl.g:919:1: rule__ERModel__Group_6__0__Impl : ( 'Relationships' ) ;
    public final void rule__ERModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:923:1: ( ( 'Relationships' ) )
            // InternalErDsl.g:924:1: ( 'Relationships' )
            {
            // InternalErDsl.g:924:1: ( 'Relationships' )
            // InternalErDsl.g:925:2: 'Relationships'
            {
             before(grammarAccess.getERModelAccess().getRelationshipsKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRelationshipsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_6__0__Impl"


    // $ANTLR start "rule__ERModel__Group_6__1"
    // InternalErDsl.g:934:1: rule__ERModel__Group_6__1 : rule__ERModel__Group_6__1__Impl ;
    public final void rule__ERModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:938:1: ( rule__ERModel__Group_6__1__Impl )
            // InternalErDsl.g:939:2: rule__ERModel__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group_6__1__Impl();

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
    // $ANTLR end "rule__ERModel__Group_6__1"


    // $ANTLR start "rule__ERModel__Group_6__1__Impl"
    // InternalErDsl.g:945:1: rule__ERModel__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ERModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:949:1: ( ( '{' ) )
            // InternalErDsl.g:950:1: ( '{' )
            {
            // InternalErDsl.g:950:1: ( '{' )
            // InternalErDsl.g:951:2: '{'
            {
             before(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_6__1__Impl"


    // $ANTLR start "rule__ERModel__Group_8__0"
    // InternalErDsl.g:961:1: rule__ERModel__Group_8__0 : rule__ERModel__Group_8__0__Impl rule__ERModel__Group_8__1 ;
    public final void rule__ERModel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:965:1: ( rule__ERModel__Group_8__0__Impl rule__ERModel__Group_8__1 )
            // InternalErDsl.g:966:2: rule__ERModel__Group_8__0__Impl rule__ERModel__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__ERModel__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group_8__1();

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
    // $ANTLR end "rule__ERModel__Group_8__0"


    // $ANTLR start "rule__ERModel__Group_8__0__Impl"
    // InternalErDsl.g:973:1: rule__ERModel__Group_8__0__Impl : ( '}' ) ;
    public final void rule__ERModel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:977:1: ( ( '}' ) )
            // InternalErDsl.g:978:1: ( '}' )
            {
            // InternalErDsl.g:978:1: ( '}' )
            // InternalErDsl.g:979:2: '}'
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_8_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_8__0__Impl"


    // $ANTLR start "rule__ERModel__Group_8__1"
    // InternalErDsl.g:988:1: rule__ERModel__Group_8__1 : rule__ERModel__Group_8__1__Impl ;
    public final void rule__ERModel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:992:1: ( rule__ERModel__Group_8__1__Impl )
            // InternalErDsl.g:993:2: rule__ERModel__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group_8__1__Impl();

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
    // $ANTLR end "rule__ERModel__Group_8__1"


    // $ANTLR start "rule__ERModel__Group_8__1__Impl"
    // InternalErDsl.g:999:1: rule__ERModel__Group_8__1__Impl : ( ';' ) ;
    public final void rule__ERModel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1003:1: ( ( ';' ) )
            // InternalErDsl.g:1004:1: ( ';' )
            {
            // InternalErDsl.g:1004:1: ( ';' )
            // InternalErDsl.g:1005:2: ';'
            {
             before(grammarAccess.getERModelAccess().getSemicolonKeyword_8_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getSemicolonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_8__1__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // InternalErDsl.g:1015:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1019:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalErDsl.g:1020:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalErDsl.g:1027:1: rule__Domain__Group__0__Impl : ( 'Domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1031:1: ( ( 'Domain' ) )
            // InternalErDsl.g:1032:1: ( 'Domain' )
            {
            // InternalErDsl.g:1032:1: ( 'Domain' )
            // InternalErDsl.g:1033:2: 'Domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalErDsl.g:1042:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1046:1: ( rule__Domain__Group__1__Impl )
            // InternalErDsl.g:1047:2: rule__Domain__Group__1__Impl
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
    // InternalErDsl.g:1053:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1057:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalErDsl.g:1058:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalErDsl.g:1058:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalErDsl.g:1059:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalErDsl.g:1060:2: ( rule__Domain__NameAssignment_1 )
            // InternalErDsl.g:1060:3: rule__Domain__NameAssignment_1
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
    // InternalErDsl.g:1069:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1073:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalErDsl.g:1074:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalErDsl.g:1081:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1085:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalErDsl.g:1086:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalErDsl.g:1086:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalErDsl.g:1087:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalErDsl.g:1088:2: ( rule__Attribute__NameAssignment_0 )
            // InternalErDsl.g:1088:3: rule__Attribute__NameAssignment_0
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
    // InternalErDsl.g:1096:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1100:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalErDsl.g:1101:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalErDsl.g:1108:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__TypeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1112:1: ( ( ( rule__Attribute__TypeAssignment_1 ) ) )
            // InternalErDsl.g:1113:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            {
            // InternalErDsl.g:1113:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            // InternalErDsl.g:1114:2: ( rule__Attribute__TypeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 
            // InternalErDsl.g:1115:2: ( rule__Attribute__TypeAssignment_1 )
            // InternalErDsl.g:1115:3: rule__Attribute__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 

            }


            }

        }
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
    // InternalErDsl.g:1123:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1127:1: ( rule__Attribute__Group__2__Impl )
            // InternalErDsl.g:1128:2: rule__Attribute__Group__2__Impl
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
    // InternalErDsl.g:1134:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__IsKeyAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1138:1: ( ( ( rule__Attribute__IsKeyAssignment_2 )? ) )
            // InternalErDsl.g:1139:1: ( ( rule__Attribute__IsKeyAssignment_2 )? )
            {
            // InternalErDsl.g:1139:1: ( ( rule__Attribute__IsKeyAssignment_2 )? )
            // InternalErDsl.g:1140:2: ( rule__Attribute__IsKeyAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getIsKeyAssignment_2()); 
            // InternalErDsl.g:1141:2: ( rule__Attribute__IsKeyAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalErDsl.g:1141:3: rule__Attribute__IsKeyAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__IsKeyAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getIsKeyAssignment_2()); 

            }


            }

        }
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
    // InternalErDsl.g:1150:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1154:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalErDsl.g:1155:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalErDsl.g:1162:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1166:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // InternalErDsl.g:1167:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // InternalErDsl.g:1167:1: ( ( rule__Entity__NameAssignment_0 ) )
            // InternalErDsl.g:1168:2: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // InternalErDsl.g:1169:2: ( rule__Entity__NameAssignment_0 )
            // InternalErDsl.g:1169:3: rule__Entity__NameAssignment_0
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
    // InternalErDsl.g:1177:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1181:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalErDsl.g:1182:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalErDsl.g:1189:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__Group_1__0 )? ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1193:1: ( ( ( rule__Entity__Group_1__0 )? ) )
            // InternalErDsl.g:1194:1: ( ( rule__Entity__Group_1__0 )? )
            {
            // InternalErDsl.g:1194:1: ( ( rule__Entity__Group_1__0 )? )
            // InternalErDsl.g:1195:2: ( rule__Entity__Group_1__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_1()); 
            // InternalErDsl.g:1196:2: ( rule__Entity__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalErDsl.g:1196:3: rule__Entity__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalErDsl.g:1204:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1208:1: ( rule__Entity__Group__2__Impl )
            // InternalErDsl.g:1209:2: rule__Entity__Group__2__Impl
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
    // InternalErDsl.g:1215:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1219:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalErDsl.g:1220:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalErDsl.g:1220:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalErDsl.g:1221:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalErDsl.g:1222:2: ( rule__Entity__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalErDsl.g:1222:3: rule__Entity__Group_2__0
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
    // InternalErDsl.g:1231:1: rule__Entity__Group_1__0 : rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 ;
    public final void rule__Entity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1235:1: ( rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 )
            // InternalErDsl.g:1236:2: rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalErDsl.g:1243:1: rule__Entity__Group_1__0__Impl : ( 'is' ) ;
    public final void rule__Entity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1247:1: ( ( 'is' ) )
            // InternalErDsl.g:1248:1: ( 'is' )
            {
            // InternalErDsl.g:1248:1: ( 'is' )
            // InternalErDsl.g:1249:2: 'is'
            {
             before(grammarAccess.getEntityAccess().getIsKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalErDsl.g:1258:1: rule__Entity__Group_1__1 : rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2 ;
    public final void rule__Entity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1262:1: ( rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2 )
            // InternalErDsl.g:1263:2: rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_1__2();

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
    // InternalErDsl.g:1270:1: rule__Entity__Group_1__1__Impl : ( ( rule__Entity__GeneralizationAssignment_1_1 ) ) ;
    public final void rule__Entity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1274:1: ( ( ( rule__Entity__GeneralizationAssignment_1_1 ) ) )
            // InternalErDsl.g:1275:1: ( ( rule__Entity__GeneralizationAssignment_1_1 ) )
            {
            // InternalErDsl.g:1275:1: ( ( rule__Entity__GeneralizationAssignment_1_1 ) )
            // InternalErDsl.g:1276:2: ( rule__Entity__GeneralizationAssignment_1_1 )
            {
             before(grammarAccess.getEntityAccess().getGeneralizationAssignment_1_1()); 
            // InternalErDsl.g:1277:2: ( rule__Entity__GeneralizationAssignment_1_1 )
            // InternalErDsl.g:1277:3: rule__Entity__GeneralizationAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__GeneralizationAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGeneralizationAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Entity__Group_1__2"
    // InternalErDsl.g:1285:1: rule__Entity__Group_1__2 : rule__Entity__Group_1__2__Impl ;
    public final void rule__Entity__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1289:1: ( rule__Entity__Group_1__2__Impl )
            // InternalErDsl.g:1290:2: rule__Entity__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_1__2__Impl();

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
    // $ANTLR end "rule__Entity__Group_1__2"


    // $ANTLR start "rule__Entity__Group_1__2__Impl"
    // InternalErDsl.g:1296:1: rule__Entity__Group_1__2__Impl : ( ( rule__Entity__IsAssignment_1_2 ) ) ;
    public final void rule__Entity__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1300:1: ( ( ( rule__Entity__IsAssignment_1_2 ) ) )
            // InternalErDsl.g:1301:1: ( ( rule__Entity__IsAssignment_1_2 ) )
            {
            // InternalErDsl.g:1301:1: ( ( rule__Entity__IsAssignment_1_2 ) )
            // InternalErDsl.g:1302:2: ( rule__Entity__IsAssignment_1_2 )
            {
             before(grammarAccess.getEntityAccess().getIsAssignment_1_2()); 
            // InternalErDsl.g:1303:2: ( rule__Entity__IsAssignment_1_2 )
            // InternalErDsl.g:1303:3: rule__Entity__IsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__IsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getIsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__2__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalErDsl.g:1312:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1316:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalErDsl.g:1317:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalErDsl.g:1324:1: rule__Entity__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1328:1: ( ( '{' ) )
            // InternalErDsl.g:1329:1: ( '{' )
            {
            // InternalErDsl.g:1329:1: ( '{' )
            // InternalErDsl.g:1330:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalErDsl.g:1339:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1343:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // InternalErDsl.g:1344:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalErDsl.g:1351:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1355:1: ( ( ( rule__Entity__AttributesAssignment_2_1 ) ) )
            // InternalErDsl.g:1356:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            {
            // InternalErDsl.g:1356:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            // InternalErDsl.g:1357:2: ( rule__Entity__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_1()); 
            // InternalErDsl.g:1358:2: ( rule__Entity__AttributesAssignment_2_1 )
            // InternalErDsl.g:1358:3: rule__Entity__AttributesAssignment_2_1
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
    // InternalErDsl.g:1366:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1370:1: ( rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 )
            // InternalErDsl.g:1371:2: rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalErDsl.g:1378:1: rule__Entity__Group_2__2__Impl : ( ( rule__Entity__Group_2_2__0 )* ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1382:1: ( ( ( rule__Entity__Group_2_2__0 )* ) )
            // InternalErDsl.g:1383:1: ( ( rule__Entity__Group_2_2__0 )* )
            {
            // InternalErDsl.g:1383:1: ( ( rule__Entity__Group_2_2__0 )* )
            // InternalErDsl.g:1384:2: ( rule__Entity__Group_2_2__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_2_2()); 
            // InternalErDsl.g:1385:2: ( rule__Entity__Group_2_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==38) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalErDsl.g:1385:3: rule__Entity__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Entity__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalErDsl.g:1393:1: rule__Entity__Group_2__3 : rule__Entity__Group_2__3__Impl ;
    public final void rule__Entity__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1397:1: ( rule__Entity__Group_2__3__Impl )
            // InternalErDsl.g:1398:2: rule__Entity__Group_2__3__Impl
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
    // InternalErDsl.g:1404:1: rule__Entity__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Entity__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1408:1: ( ( '}' ) )
            // InternalErDsl.g:1409:1: ( '}' )
            {
            // InternalErDsl.g:1409:1: ( '}' )
            // InternalErDsl.g:1410:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalErDsl.g:1420:1: rule__Entity__Group_2_2__0 : rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 ;
    public final void rule__Entity__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1424:1: ( rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 )
            // InternalErDsl.g:1425:2: rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalErDsl.g:1432:1: rule__Entity__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1436:1: ( ( ',' ) )
            // InternalErDsl.g:1437:1: ( ',' )
            {
            // InternalErDsl.g:1437:1: ( ',' )
            // InternalErDsl.g:1438:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_2_2_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalErDsl.g:1447:1: rule__Entity__Group_2_2__1 : rule__Entity__Group_2_2__1__Impl ;
    public final void rule__Entity__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1451:1: ( rule__Entity__Group_2_2__1__Impl )
            // InternalErDsl.g:1452:2: rule__Entity__Group_2_2__1__Impl
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
    // InternalErDsl.g:1458:1: rule__Entity__Group_2_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Entity__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1462:1: ( ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) )
            // InternalErDsl.g:1463:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDsl.g:1463:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            // InternalErDsl.g:1464:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDsl.g:1465:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            // InternalErDsl.g:1465:3: rule__Entity__AttributesAssignment_2_2_1
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
    // InternalErDsl.g:1474:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1478:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalErDsl.g:1479:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalErDsl.g:1486:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__NameAssignment_0 )? ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1490:1: ( ( ( rule__Relation__NameAssignment_0 )? ) )
            // InternalErDsl.g:1491:1: ( ( rule__Relation__NameAssignment_0 )? )
            {
            // InternalErDsl.g:1491:1: ( ( rule__Relation__NameAssignment_0 )? )
            // InternalErDsl.g:1492:2: ( rule__Relation__NameAssignment_0 )?
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_0()); 
            // InternalErDsl.g:1493:2: ( rule__Relation__NameAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalErDsl.g:1493:3: rule__Relation__NameAssignment_0
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
    // InternalErDsl.g:1501:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1505:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalErDsl.g:1506:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalErDsl.g:1513:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__Group_1__0 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1517:1: ( ( ( rule__Relation__Group_1__0 ) ) )
            // InternalErDsl.g:1518:1: ( ( rule__Relation__Group_1__0 ) )
            {
            // InternalErDsl.g:1518:1: ( ( rule__Relation__Group_1__0 ) )
            // InternalErDsl.g:1519:2: ( rule__Relation__Group_1__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_1()); 
            // InternalErDsl.g:1520:2: ( rule__Relation__Group_1__0 )
            // InternalErDsl.g:1520:3: rule__Relation__Group_1__0
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
    // InternalErDsl.g:1528:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1532:1: ( rule__Relation__Group__2__Impl )
            // InternalErDsl.g:1533:2: rule__Relation__Group__2__Impl
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
    // InternalErDsl.g:1539:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__Group_2__0 )* ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1543:1: ( ( ( rule__Relation__Group_2__0 )* ) )
            // InternalErDsl.g:1544:1: ( ( rule__Relation__Group_2__0 )* )
            {
            // InternalErDsl.g:1544:1: ( ( rule__Relation__Group_2__0 )* )
            // InternalErDsl.g:1545:2: ( rule__Relation__Group_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2()); 
            // InternalErDsl.g:1546:2: ( rule__Relation__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalErDsl.g:1546:3: rule__Relation__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Relation__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalErDsl.g:1555:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1559:1: ( rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 )
            // InternalErDsl.g:1560:2: rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalErDsl.g:1567:1: rule__Relation__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1571:1: ( ( '[' ) )
            // InternalErDsl.g:1572:1: ( '[' )
            {
            // InternalErDsl.g:1572:1: ( '[' )
            // InternalErDsl.g:1573:2: '['
            {
             before(grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalErDsl.g:1582:1: rule__Relation__Group_1__1 : rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 ;
    public final void rule__Relation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1586:1: ( rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 )
            // InternalErDsl.g:1587:2: rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2
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
    // InternalErDsl.g:1594:1: rule__Relation__Group_1__1__Impl : ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) ;
    public final void rule__Relation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1598:1: ( ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) )
            // InternalErDsl.g:1599:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            {
            // InternalErDsl.g:1599:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            // InternalErDsl.g:1600:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            {
             before(grammarAccess.getRelationAccess().getLeftEndingAssignment_1_1()); 
            // InternalErDsl.g:1601:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            // InternalErDsl.g:1601:3: rule__Relation__LeftEndingAssignment_1_1
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
    // InternalErDsl.g:1609:1: rule__Relation__Group_1__2 : rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 ;
    public final void rule__Relation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1613:1: ( rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 )
            // InternalErDsl.g:1614:2: rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalErDsl.g:1621:1: rule__Relation__Group_1__2__Impl : ( 'relates' ) ;
    public final void rule__Relation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1625:1: ( ( 'relates' ) )
            // InternalErDsl.g:1626:1: ( 'relates' )
            {
            // InternalErDsl.g:1626:1: ( 'relates' )
            // InternalErDsl.g:1627:2: 'relates'
            {
             before(grammarAccess.getRelationAccess().getRelatesKeyword_1_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalErDsl.g:1636:1: rule__Relation__Group_1__3 : rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 ;
    public final void rule__Relation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1640:1: ( rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 )
            // InternalErDsl.g:1641:2: rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalErDsl.g:1648:1: rule__Relation__Group_1__3__Impl : ( ( rule__Relation__RightEndingAssignment_1_3 ) ) ;
    public final void rule__Relation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1652:1: ( ( ( rule__Relation__RightEndingAssignment_1_3 ) ) )
            // InternalErDsl.g:1653:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            {
            // InternalErDsl.g:1653:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            // InternalErDsl.g:1654:2: ( rule__Relation__RightEndingAssignment_1_3 )
            {
             before(grammarAccess.getRelationAccess().getRightEndingAssignment_1_3()); 
            // InternalErDsl.g:1655:2: ( rule__Relation__RightEndingAssignment_1_3 )
            // InternalErDsl.g:1655:3: rule__Relation__RightEndingAssignment_1_3
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
    // InternalErDsl.g:1663:1: rule__Relation__Group_1__4 : rule__Relation__Group_1__4__Impl ;
    public final void rule__Relation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1667:1: ( rule__Relation__Group_1__4__Impl )
            // InternalErDsl.g:1668:2: rule__Relation__Group_1__4__Impl
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
    // InternalErDsl.g:1674:1: rule__Relation__Group_1__4__Impl : ( ']' ) ;
    public final void rule__Relation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1678:1: ( ( ']' ) )
            // InternalErDsl.g:1679:1: ( ']' )
            {
            // InternalErDsl.g:1679:1: ( ']' )
            // InternalErDsl.g:1680:2: ']'
            {
             before(grammarAccess.getRelationAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalErDsl.g:1690:1: rule__Relation__Group_2__0 : rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 ;
    public final void rule__Relation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1694:1: ( rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 )
            // InternalErDsl.g:1695:2: rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalErDsl.g:1702:1: rule__Relation__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Relation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1706:1: ( ( '{' ) )
            // InternalErDsl.g:1707:1: ( '{' )
            {
            // InternalErDsl.g:1707:1: ( '{' )
            // InternalErDsl.g:1708:2: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalErDsl.g:1717:1: rule__Relation__Group_2__1 : rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 ;
    public final void rule__Relation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1721:1: ( rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 )
            // InternalErDsl.g:1722:2: rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalErDsl.g:1729:1: rule__Relation__Group_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_1 ) ) ;
    public final void rule__Relation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1733:1: ( ( ( rule__Relation__AttributesAssignment_2_1 ) ) )
            // InternalErDsl.g:1734:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            {
            // InternalErDsl.g:1734:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            // InternalErDsl.g:1735:2: ( rule__Relation__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_1()); 
            // InternalErDsl.g:1736:2: ( rule__Relation__AttributesAssignment_2_1 )
            // InternalErDsl.g:1736:3: rule__Relation__AttributesAssignment_2_1
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
    // InternalErDsl.g:1744:1: rule__Relation__Group_2__2 : rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 ;
    public final void rule__Relation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1748:1: ( rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 )
            // InternalErDsl.g:1749:2: rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalErDsl.g:1756:1: rule__Relation__Group_2__2__Impl : ( ( rule__Relation__Group_2_2__0 )* ) ;
    public final void rule__Relation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1760:1: ( ( ( rule__Relation__Group_2_2__0 )* ) )
            // InternalErDsl.g:1761:1: ( ( rule__Relation__Group_2_2__0 )* )
            {
            // InternalErDsl.g:1761:1: ( ( rule__Relation__Group_2_2__0 )* )
            // InternalErDsl.g:1762:2: ( rule__Relation__Group_2_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2_2()); 
            // InternalErDsl.g:1763:2: ( rule__Relation__Group_2_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==38) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalErDsl.g:1763:3: rule__Relation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Relation__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalErDsl.g:1771:1: rule__Relation__Group_2__3 : rule__Relation__Group_2__3__Impl ;
    public final void rule__Relation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1775:1: ( rule__Relation__Group_2__3__Impl )
            // InternalErDsl.g:1776:2: rule__Relation__Group_2__3__Impl
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
    // InternalErDsl.g:1782:1: rule__Relation__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Relation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1786:1: ( ( '}' ) )
            // InternalErDsl.g:1787:1: ( '}' )
            {
            // InternalErDsl.g:1787:1: ( '}' )
            // InternalErDsl.g:1788:2: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,34,FOLLOW_2); 
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
    // InternalErDsl.g:1798:1: rule__Relation__Group_2_2__0 : rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 ;
    public final void rule__Relation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1802:1: ( rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 )
            // InternalErDsl.g:1803:2: rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalErDsl.g:1810:1: rule__Relation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Relation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1814:1: ( ( ',' ) )
            // InternalErDsl.g:1815:1: ( ',' )
            {
            // InternalErDsl.g:1815:1: ( ',' )
            // InternalErDsl.g:1816:2: ','
            {
             before(grammarAccess.getRelationAccess().getCommaKeyword_2_2_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalErDsl.g:1825:1: rule__Relation__Group_2_2__1 : rule__Relation__Group_2_2__1__Impl ;
    public final void rule__Relation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1829:1: ( rule__Relation__Group_2_2__1__Impl )
            // InternalErDsl.g:1830:2: rule__Relation__Group_2_2__1__Impl
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
    // InternalErDsl.g:1836:1: rule__Relation__Group_2_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Relation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1840:1: ( ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) )
            // InternalErDsl.g:1841:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDsl.g:1841:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            // InternalErDsl.g:1842:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDsl.g:1843:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            // InternalErDsl.g:1843:3: rule__Relation__AttributesAssignment_2_2_1
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


    // $ANTLR start "rule__RelationSideRight__Group_0__0"
    // InternalErDsl.g:1852:1: rule__RelationSideRight__Group_0__0 : rule__RelationSideRight__Group_0__0__Impl rule__RelationSideRight__Group_0__1 ;
    public final void rule__RelationSideRight__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1856:1: ( rule__RelationSideRight__Group_0__0__Impl rule__RelationSideRight__Group_0__1 )
            // InternalErDsl.g:1857:2: rule__RelationSideRight__Group_0__0__Impl rule__RelationSideRight__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__RelationSideRight__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationSideRight__Group_0__1();

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
    // $ANTLR end "rule__RelationSideRight__Group_0__0"


    // $ANTLR start "rule__RelationSideRight__Group_0__0__Impl"
    // InternalErDsl.g:1864:1: rule__RelationSideRight__Group_0__0__Impl : ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) ) ;
    public final void rule__RelationSideRight__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1868:1: ( ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) ) )
            // InternalErDsl.g:1869:1: ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) )
            {
            // InternalErDsl.g:1869:1: ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) )
            // InternalErDsl.g:1870:2: ( rule__RelationSideRight__CardinalityAssignment_0_0 )
            {
             before(grammarAccess.getRelationSideRightAccess().getCardinalityAssignment_0_0()); 
            // InternalErDsl.g:1871:2: ( rule__RelationSideRight__CardinalityAssignment_0_0 )
            // InternalErDsl.g:1871:3: rule__RelationSideRight__CardinalityAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationSideRight__CardinalityAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideRightAccess().getCardinalityAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSideRight__Group_0__0__Impl"


    // $ANTLR start "rule__RelationSideRight__Group_0__1"
    // InternalErDsl.g:1879:1: rule__RelationSideRight__Group_0__1 : rule__RelationSideRight__Group_0__1__Impl ;
    public final void rule__RelationSideRight__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1883:1: ( rule__RelationSideRight__Group_0__1__Impl )
            // InternalErDsl.g:1884:2: rule__RelationSideRight__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationSideRight__Group_0__1__Impl();

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
    // $ANTLR end "rule__RelationSideRight__Group_0__1"


    // $ANTLR start "rule__RelationSideRight__Group_0__1__Impl"
    // InternalErDsl.g:1890:1: rule__RelationSideRight__Group_0__1__Impl : ( ( rule__RelationSideRight__TargetAssignment_0_1 ) ) ;
    public final void rule__RelationSideRight__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1894:1: ( ( ( rule__RelationSideRight__TargetAssignment_0_1 ) ) )
            // InternalErDsl.g:1895:1: ( ( rule__RelationSideRight__TargetAssignment_0_1 ) )
            {
            // InternalErDsl.g:1895:1: ( ( rule__RelationSideRight__TargetAssignment_0_1 ) )
            // InternalErDsl.g:1896:2: ( rule__RelationSideRight__TargetAssignment_0_1 )
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetAssignment_0_1()); 
            // InternalErDsl.g:1897:2: ( rule__RelationSideRight__TargetAssignment_0_1 )
            // InternalErDsl.g:1897:3: rule__RelationSideRight__TargetAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationSideRight__TargetAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideRightAccess().getTargetAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSideRight__Group_0__1__Impl"


    // $ANTLR start "rule__RelationSideLeft__Group_1__0"
    // InternalErDsl.g:1906:1: rule__RelationSideLeft__Group_1__0 : rule__RelationSideLeft__Group_1__0__Impl rule__RelationSideLeft__Group_1__1 ;
    public final void rule__RelationSideLeft__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1910:1: ( rule__RelationSideLeft__Group_1__0__Impl rule__RelationSideLeft__Group_1__1 )
            // InternalErDsl.g:1911:2: rule__RelationSideLeft__Group_1__0__Impl rule__RelationSideLeft__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__RelationSideLeft__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationSideLeft__Group_1__1();

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
    // $ANTLR end "rule__RelationSideLeft__Group_1__0"


    // $ANTLR start "rule__RelationSideLeft__Group_1__0__Impl"
    // InternalErDsl.g:1918:1: rule__RelationSideLeft__Group_1__0__Impl : ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) ) ;
    public final void rule__RelationSideLeft__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1922:1: ( ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) ) )
            // InternalErDsl.g:1923:1: ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) )
            {
            // InternalErDsl.g:1923:1: ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) )
            // InternalErDsl.g:1924:2: ( rule__RelationSideLeft__TargetAssignment_1_0 )
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetAssignment_1_0()); 
            // InternalErDsl.g:1925:2: ( rule__RelationSideLeft__TargetAssignment_1_0 )
            // InternalErDsl.g:1925:3: rule__RelationSideLeft__TargetAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationSideLeft__TargetAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideLeftAccess().getTargetAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSideLeft__Group_1__0__Impl"


    // $ANTLR start "rule__RelationSideLeft__Group_1__1"
    // InternalErDsl.g:1933:1: rule__RelationSideLeft__Group_1__1 : rule__RelationSideLeft__Group_1__1__Impl ;
    public final void rule__RelationSideLeft__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1937:1: ( rule__RelationSideLeft__Group_1__1__Impl )
            // InternalErDsl.g:1938:2: rule__RelationSideLeft__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationSideLeft__Group_1__1__Impl();

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
    // $ANTLR end "rule__RelationSideLeft__Group_1__1"


    // $ANTLR start "rule__RelationSideLeft__Group_1__1__Impl"
    // InternalErDsl.g:1944:1: rule__RelationSideLeft__Group_1__1__Impl : ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) ) ;
    public final void rule__RelationSideLeft__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1948:1: ( ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) ) )
            // InternalErDsl.g:1949:1: ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) )
            {
            // InternalErDsl.g:1949:1: ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) )
            // InternalErDsl.g:1950:2: ( rule__RelationSideLeft__CardinalityAssignment_1_1 )
            {
             before(grammarAccess.getRelationSideLeftAccess().getCardinalityAssignment_1_1()); 
            // InternalErDsl.g:1951:2: ( rule__RelationSideLeft__CardinalityAssignment_1_1 )
            // InternalErDsl.g:1951:3: rule__RelationSideLeft__CardinalityAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationSideLeft__CardinalityAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideLeftAccess().getCardinalityAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSideLeft__Group_1__1__Impl"


    // $ANTLR start "rule__ERModel__TargetGeneratorAssignment_0_1"
    // InternalErDsl.g:1960:1: rule__ERModel__TargetGeneratorAssignment_0_1 : ( ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 ) ) ;
    public final void rule__ERModel__TargetGeneratorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1964:1: ( ( ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 ) ) )
            // InternalErDsl.g:1965:2: ( ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 ) )
            {
            // InternalErDsl.g:1965:2: ( ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 ) )
            // InternalErDsl.g:1966:3: ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 )
            {
             before(grammarAccess.getERModelAccess().getTargetGeneratorAlternatives_0_1_0()); 
            // InternalErDsl.g:1967:3: ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 )
            // InternalErDsl.g:1967:4: rule__ERModel__TargetGeneratorAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__TargetGeneratorAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getTargetGeneratorAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__TargetGeneratorAssignment_0_1"


    // $ANTLR start "rule__ERModel__DomainAssignment_1"
    // InternalErDsl.g:1975:1: rule__ERModel__DomainAssignment_1 : ( ruleDomain ) ;
    public final void rule__ERModel__DomainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1979:1: ( ( ruleDomain ) )
            // InternalErDsl.g:1980:2: ( ruleDomain )
            {
            // InternalErDsl.g:1980:2: ( ruleDomain )
            // InternalErDsl.g:1981:3: ruleDomain
            {
             before(grammarAccess.getERModelAccess().getDomainDomainParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getDomainDomainParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__DomainAssignment_1"


    // $ANTLR start "rule__ERModel__EntitiesAssignment_4"
    // InternalErDsl.g:1990:1: rule__ERModel__EntitiesAssignment_4 : ( ruleEntity ) ;
    public final void rule__ERModel__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1994:1: ( ( ruleEntity ) )
            // InternalErDsl.g:1995:2: ( ruleEntity )
            {
            // InternalErDsl.g:1995:2: ( ruleEntity )
            // InternalErDsl.g:1996:3: ruleEntity
            {
             before(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getEntitiesEntityParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__EntitiesAssignment_4"


    // $ANTLR start "rule__ERModel__RelationsAssignment_7"
    // InternalErDsl.g:2005:1: rule__ERModel__RelationsAssignment_7 : ( ruleRelation ) ;
    public final void rule__ERModel__RelationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2009:1: ( ( ruleRelation ) )
            // InternalErDsl.g:2010:2: ( ruleRelation )
            {
            // InternalErDsl.g:2010:2: ( ruleRelation )
            // InternalErDsl.g:2011:3: ruleRelation
            {
             before(grammarAccess.getERModelAccess().getRelationsRelationParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getERModelAccess().getRelationsRelationParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__RelationsAssignment_7"


    // $ANTLR start "rule__Domain__NameAssignment_1"
    // InternalErDsl.g:2020:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2024:1: ( ( RULE_ID ) )
            // InternalErDsl.g:2025:2: ( RULE_ID )
            {
            // InternalErDsl.g:2025:2: ( RULE_ID )
            // InternalErDsl.g:2026:3: RULE_ID
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
    // InternalErDsl.g:2035:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2039:1: ( ( RULE_ID ) )
            // InternalErDsl.g:2040:2: ( RULE_ID )
            {
            // InternalErDsl.g:2040:2: ( RULE_ID )
            // InternalErDsl.g:2041:3: RULE_ID
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


    // $ANTLR start "rule__Attribute__TypeAssignment_1"
    // InternalErDsl.g:2050:1: rule__Attribute__TypeAssignment_1 : ( ruleDataType ) ;
    public final void rule__Attribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2054:1: ( ( ruleDataType ) )
            // InternalErDsl.g:2055:2: ( ruleDataType )
            {
            // InternalErDsl.g:2055:2: ( ruleDataType )
            // InternalErDsl.g:2056:3: ruleDataType
            {
             before(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeDataTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_1"


    // $ANTLR start "rule__Attribute__IsKeyAssignment_2"
    // InternalErDsl.g:2065:1: rule__Attribute__IsKeyAssignment_2 : ( ( 'isIdentifier' ) ) ;
    public final void rule__Attribute__IsKeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2069:1: ( ( ( 'isIdentifier' ) ) )
            // InternalErDsl.g:2070:2: ( ( 'isIdentifier' ) )
            {
            // InternalErDsl.g:2070:2: ( ( 'isIdentifier' ) )
            // InternalErDsl.g:2071:3: ( 'isIdentifier' )
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_2_0()); 
            // InternalErDsl.g:2072:3: ( 'isIdentifier' )
            // InternalErDsl.g:2073:4: 'isIdentifier'
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_2_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__IsKeyAssignment_2"


    // $ANTLR start "rule__Entity__NameAssignment_0"
    // InternalErDsl.g:2084:1: rule__Entity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2088:1: ( ( RULE_ID ) )
            // InternalErDsl.g:2089:2: ( RULE_ID )
            {
            // InternalErDsl.g:2089:2: ( RULE_ID )
            // InternalErDsl.g:2090:3: RULE_ID
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


    // $ANTLR start "rule__Entity__GeneralizationAssignment_1_1"
    // InternalErDsl.g:2099:1: rule__Entity__GeneralizationAssignment_1_1 : ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) ) ;
    public final void rule__Entity__GeneralizationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2103:1: ( ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) ) )
            // InternalErDsl.g:2104:2: ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) )
            {
            // InternalErDsl.g:2104:2: ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) )
            // InternalErDsl.g:2105:3: ( rule__Entity__GeneralizationAlternatives_1_1_0 )
            {
             before(grammarAccess.getEntityAccess().getGeneralizationAlternatives_1_1_0()); 
            // InternalErDsl.g:2106:3: ( rule__Entity__GeneralizationAlternatives_1_1_0 )
            // InternalErDsl.g:2106:4: rule__Entity__GeneralizationAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__GeneralizationAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGeneralizationAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__GeneralizationAssignment_1_1"


    // $ANTLR start "rule__Entity__IsAssignment_1_2"
    // InternalErDsl.g:2114:1: rule__Entity__IsAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__IsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2118:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl.g:2119:2: ( ( RULE_ID ) )
            {
            // InternalErDsl.g:2119:2: ( ( RULE_ID ) )
            // InternalErDsl.g:2120:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getIsEntityCrossReference_1_2_0()); 
            // InternalErDsl.g:2121:3: ( RULE_ID )
            // InternalErDsl.g:2122:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getIsEntityIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getIsEntityIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getIsEntityCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__IsAssignment_1_2"


    // $ANTLR start "rule__Entity__AttributesAssignment_2_1"
    // InternalErDsl.g:2133:1: rule__Entity__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2137:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:2138:2: ( ruleAttribute )
            {
            // InternalErDsl.g:2138:2: ( ruleAttribute )
            // InternalErDsl.g:2139:3: ruleAttribute
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
    // InternalErDsl.g:2148:1: rule__Entity__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2152:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:2153:2: ( ruleAttribute )
            {
            // InternalErDsl.g:2153:2: ( ruleAttribute )
            // InternalErDsl.g:2154:3: ruleAttribute
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
    // InternalErDsl.g:2163:1: rule__Relation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2167:1: ( ( RULE_ID ) )
            // InternalErDsl.g:2168:2: ( RULE_ID )
            {
            // InternalErDsl.g:2168:2: ( RULE_ID )
            // InternalErDsl.g:2169:3: RULE_ID
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
    // InternalErDsl.g:2178:1: rule__Relation__LeftEndingAssignment_1_1 : ( ruleRelationSideLeft ) ;
    public final void rule__Relation__LeftEndingAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2182:1: ( ( ruleRelationSideLeft ) )
            // InternalErDsl.g:2183:2: ( ruleRelationSideLeft )
            {
            // InternalErDsl.g:2183:2: ( ruleRelationSideLeft )
            // InternalErDsl.g:2184:3: ruleRelationSideLeft
            {
             before(grammarAccess.getRelationAccess().getLeftEndingRelationSideLeftParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationSideLeft();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getLeftEndingRelationSideLeftParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalErDsl.g:2193:1: rule__Relation__RightEndingAssignment_1_3 : ( ruleRelationSideRight ) ;
    public final void rule__Relation__RightEndingAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2197:1: ( ( ruleRelationSideRight ) )
            // InternalErDsl.g:2198:2: ( ruleRelationSideRight )
            {
            // InternalErDsl.g:2198:2: ( ruleRelationSideRight )
            // InternalErDsl.g:2199:3: ruleRelationSideRight
            {
             before(grammarAccess.getRelationAccess().getRightEndingRelationSideRightParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationSideRight();

            state._fsp--;

             after(grammarAccess.getRelationAccess().getRightEndingRelationSideRightParserRuleCall_1_3_0()); 

            }


            }

        }
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
    // InternalErDsl.g:2208:1: rule__Relation__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2212:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:2213:2: ( ruleAttribute )
            {
            // InternalErDsl.g:2213:2: ( ruleAttribute )
            // InternalErDsl.g:2214:3: ruleAttribute
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
    // InternalErDsl.g:2223:1: rule__Relation__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2227:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:2228:2: ( ruleAttribute )
            {
            // InternalErDsl.g:2228:2: ( ruleAttribute )
            // InternalErDsl.g:2229:3: ruleAttribute
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


    // $ANTLR start "rule__RelationSideRight__CardinalityAssignment_0_0"
    // InternalErDsl.g:2238:1: rule__RelationSideRight__CardinalityAssignment_0_0 : ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) ) ;
    public final void rule__RelationSideRight__CardinalityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2242:1: ( ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) ) )
            // InternalErDsl.g:2243:2: ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) )
            {
            // InternalErDsl.g:2243:2: ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) )
            // InternalErDsl.g:2244:3: ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 )
            {
             before(grammarAccess.getRelationSideRightAccess().getCardinalityAlternatives_0_0_0()); 
            // InternalErDsl.g:2245:3: ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 )
            // InternalErDsl.g:2245:4: rule__RelationSideRight__CardinalityAlternatives_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationSideRight__CardinalityAlternatives_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideRightAccess().getCardinalityAlternatives_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSideRight__CardinalityAssignment_0_0"


    // $ANTLR start "rule__RelationSideRight__TargetAssignment_0_1"
    // InternalErDsl.g:2253:1: rule__RelationSideRight__TargetAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideRight__TargetAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2257:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl.g:2258:2: ( ( RULE_ID ) )
            {
            // InternalErDsl.g:2258:2: ( ( RULE_ID ) )
            // InternalErDsl.g:2259:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetEntityCrossReference_0_1_0()); 
            // InternalErDsl.g:2260:3: ( RULE_ID )
            // InternalErDsl.g:2261:4: RULE_ID
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetEntityIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationSideRightAccess().getTargetEntityIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getRelationSideRightAccess().getTargetEntityCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSideRight__TargetAssignment_0_1"


    // $ANTLR start "rule__RelationSideRight__TargetAssignment_1"
    // InternalErDsl.g:2272:1: rule__RelationSideRight__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideRight__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2276:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl.g:2277:2: ( ( RULE_ID ) )
            {
            // InternalErDsl.g:2277:2: ( ( RULE_ID ) )
            // InternalErDsl.g:2278:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetRelationCrossReference_1_0()); 
            // InternalErDsl.g:2279:3: ( RULE_ID )
            // InternalErDsl.g:2280:4: RULE_ID
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetRelationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationSideRightAccess().getTargetRelationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRelationSideRightAccess().getTargetRelationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSideRight__TargetAssignment_1"


    // $ANTLR start "rule__RelationSideLeft__TargetAssignment_0"
    // InternalErDsl.g:2291:1: rule__RelationSideLeft__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideLeft__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2295:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl.g:2296:2: ( ( RULE_ID ) )
            {
            // InternalErDsl.g:2296:2: ( ( RULE_ID ) )
            // InternalErDsl.g:2297:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetEntityCrossReference_0_0()); 
            // InternalErDsl.g:2298:3: ( RULE_ID )
            // InternalErDsl.g:2299:4: RULE_ID
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetEntityIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationSideLeftAccess().getTargetEntityIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRelationSideLeftAccess().getTargetEntityCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSideLeft__TargetAssignment_0"


    // $ANTLR start "rule__RelationSideLeft__TargetAssignment_1_0"
    // InternalErDsl.g:2310:1: rule__RelationSideLeft__TargetAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideLeft__TargetAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2314:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl.g:2315:2: ( ( RULE_ID ) )
            {
            // InternalErDsl.g:2315:2: ( ( RULE_ID ) )
            // InternalErDsl.g:2316:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetRelationCrossReference_1_0_0()); 
            // InternalErDsl.g:2317:3: ( RULE_ID )
            // InternalErDsl.g:2318:4: RULE_ID
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetRelationIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationSideLeftAccess().getTargetRelationIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getRelationSideLeftAccess().getTargetRelationCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSideLeft__TargetAssignment_1_0"


    // $ANTLR start "rule__RelationSideLeft__CardinalityAssignment_1_1"
    // InternalErDsl.g:2329:1: rule__RelationSideLeft__CardinalityAssignment_1_1 : ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) ) ;
    public final void rule__RelationSideLeft__CardinalityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2333:1: ( ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) ) )
            // InternalErDsl.g:2334:2: ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) )
            {
            // InternalErDsl.g:2334:2: ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) )
            // InternalErDsl.g:2335:3: ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 )
            {
             before(grammarAccess.getRelationSideLeftAccess().getCardinalityAlternatives_1_1_0()); 
            // InternalErDsl.g:2336:3: ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 )
            // InternalErDsl.g:2336:4: rule__RelationSideLeft__CardinalityAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationSideLeft__CardinalityAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationSideLeftAccess().getCardinalityAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationSideLeft__CardinalityAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008400000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000003F800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000780010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000780000L});

}