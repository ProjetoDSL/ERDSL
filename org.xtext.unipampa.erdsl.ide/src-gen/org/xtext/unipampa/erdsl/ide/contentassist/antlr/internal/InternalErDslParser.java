package org.xtext.unipampa.erdsl.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PartialOverlapped", "PartialDisjoint", "TotalOverlapped", "TotalDisjoint", "LogicalSchema", "Relationships", "IsIdentifier", "PostgreSQL", "Entities", "Generate", "Datetime", "Boolean", "Relates", "Domain", "Double", "String", "LeftParenthesisDigitZeroColonDigitOneRightParenthesis", "N", "LeftParenthesisDigitOneColonDigitOneRightParenthesis", "N_1", "MySQL", "Money", "File", "All", "Int", "Is", "Comma", "Semicolon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int All=27;
    public static final int N_1=23;
    public static final int PostgreSQL=11;
    public static final int PartialDisjoint=5;
    public static final int Is=29;
    public static final int RULE_STRING=38;
    public static final int String=19;
    public static final int LeftParenthesisDigitZeroColonDigitOneRightParenthesis=20;
    public static final int N=21;
    public static final int Int=28;
    public static final int RULE_SL_COMMENT=40;
    public static final int TotalOverlapped=6;
    public static final int Money=25;
    public static final int Comma=30;
    public static final int Relationships=9;
    public static final int Generate=13;
    public static final int MySQL=24;
    public static final int RightCurlyBracket=35;
    public static final int Boolean=15;
    public static final int EOF=-1;
    public static final int TotalDisjoint=7;
    public static final int RightSquareBracket=33;
    public static final int Datetime=14;
    public static final int Relates=16;
    public static final int RULE_ID=36;
    public static final int RULE_WS=41;
    public static final int LeftCurlyBracket=34;
    public static final int PartialOverlapped=4;
    public static final int LogicalSchema=8;
    public static final int RULE_ANY_OTHER=42;
    public static final int IsIdentifier=10;
    public static final int Double=18;
    public static final int Entities=12;
    public static final int LeftParenthesisDigitOneColonDigitOneRightParenthesis=22;
    public static final int Semicolon=31;
    public static final int RULE_INT=37;
    public static final int RULE_ML_COMMENT=39;
    public static final int LeftSquareBracket=32;
    public static final int Domain=17;
    public static final int File=26;

    // delegates
    // delegators


        public InternalErDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalErDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalErDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalErDslParser.g"; }


    	private ErDslGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Semicolon", "';'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("Is", "'is'");
    		tokenNameToValue.put("All", "'All'");
    		tokenNameToValue.put("Int", "'int'");
    		tokenNameToValue.put("File", "'file'");
    		tokenNameToValue.put("LeftParenthesisDigitZeroColonDigitOneRightParenthesis", "'(0:1)'");
    		tokenNameToValue.put("N", "'(0:N)'");
    		tokenNameToValue.put("LeftParenthesisDigitOneColonDigitOneRightParenthesis", "'(1:1)'");
    		tokenNameToValue.put("N_1", "'(1:N)'");
    		tokenNameToValue.put("MySQL", "'MySQL'");
    		tokenNameToValue.put("Money", "'money'");
    		tokenNameToValue.put("Domain", "'Domain'");
    		tokenNameToValue.put("Double", "'double'");
    		tokenNameToValue.put("String", "'string'");
    		tokenNameToValue.put("Boolean", "'boolean'");
    		tokenNameToValue.put("Relates", "'relates'");
    		tokenNameToValue.put("Entities", "'Entities'");
    		tokenNameToValue.put("Generate", "'Generate'");
    		tokenNameToValue.put("Datetime", "'datetime'");
    		tokenNameToValue.put("PostgreSQL", "'PostgreSQL'");
    		tokenNameToValue.put("IsIdentifier", "'isIdentifier'");
    		tokenNameToValue.put("LogicalSchema", "'LogicalSchema'");
    		tokenNameToValue.put("Relationships", "'Relationships'");
    		tokenNameToValue.put("TotalDisjoint", "'total/disjoint'");
    		tokenNameToValue.put("PartialDisjoint", "'partial/disjoint'");
    		tokenNameToValue.put("TotalOverlapped", "'total/overlapped'");
    		tokenNameToValue.put("PartialOverlapped", "'partial/overlapped'");
    	}

    	public void setGrammarAccess(ErDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleERModel"
    // InternalErDslParser.g:87:1: entryRuleERModel : ruleERModel EOF ;
    public final void entryRuleERModel() throws RecognitionException {
        try {
            // InternalErDslParser.g:88:1: ( ruleERModel EOF )
            // InternalErDslParser.g:89:1: ruleERModel EOF
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
    // InternalErDslParser.g:96:1: ruleERModel : ( ( rule__ERModel__Group__0 ) ) ;
    public final void ruleERModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:100:2: ( ( ( rule__ERModel__Group__0 ) ) )
            // InternalErDslParser.g:101:2: ( ( rule__ERModel__Group__0 ) )
            {
            // InternalErDslParser.g:101:2: ( ( rule__ERModel__Group__0 ) )
            // InternalErDslParser.g:102:3: ( rule__ERModel__Group__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup()); 
            // InternalErDslParser.g:103:3: ( rule__ERModel__Group__0 )
            // InternalErDslParser.g:103:4: rule__ERModel__Group__0
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
    // InternalErDslParser.g:112:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalErDslParser.g:113:1: ( ruleDomain EOF )
            // InternalErDslParser.g:114:1: ruleDomain EOF
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
    // InternalErDslParser.g:121:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:125:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalErDslParser.g:126:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalErDslParser.g:126:2: ( ( rule__Domain__Group__0 ) )
            // InternalErDslParser.g:127:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalErDslParser.g:128:3: ( rule__Domain__Group__0 )
            // InternalErDslParser.g:128:4: rule__Domain__Group__0
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
    // InternalErDslParser.g:137:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalErDslParser.g:138:1: ( ruleAttribute EOF )
            // InternalErDslParser.g:139:1: ruleAttribute EOF
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
    // InternalErDslParser.g:146:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:150:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalErDslParser.g:151:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalErDslParser.g:151:2: ( ( rule__Attribute__Group__0 ) )
            // InternalErDslParser.g:152:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalErDslParser.g:153:3: ( rule__Attribute__Group__0 )
            // InternalErDslParser.g:153:4: rule__Attribute__Group__0
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
    // InternalErDslParser.g:162:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalErDslParser.g:163:1: ( ruleEntity EOF )
            // InternalErDslParser.g:164:1: ruleEntity EOF
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
    // InternalErDslParser.g:171:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:175:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalErDslParser.g:176:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalErDslParser.g:176:2: ( ( rule__Entity__Group__0 ) )
            // InternalErDslParser.g:177:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalErDslParser.g:178:3: ( rule__Entity__Group__0 )
            // InternalErDslParser.g:178:4: rule__Entity__Group__0
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
    // InternalErDslParser.g:187:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalErDslParser.g:188:1: ( ruleRelation EOF )
            // InternalErDslParser.g:189:1: ruleRelation EOF
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
    // InternalErDslParser.g:196:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:200:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalErDslParser.g:201:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalErDslParser.g:201:2: ( ( rule__Relation__Group__0 ) )
            // InternalErDslParser.g:202:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalErDslParser.g:203:3: ( rule__Relation__Group__0 )
            // InternalErDslParser.g:203:4: rule__Relation__Group__0
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
    // InternalErDslParser.g:212:1: entryRuleRelationSideRight : ruleRelationSideRight EOF ;
    public final void entryRuleRelationSideRight() throws RecognitionException {
        try {
            // InternalErDslParser.g:213:1: ( ruleRelationSideRight EOF )
            // InternalErDslParser.g:214:1: ruleRelationSideRight EOF
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
    // InternalErDslParser.g:221:1: ruleRelationSideRight : ( ( rule__RelationSideRight__Alternatives ) ) ;
    public final void ruleRelationSideRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:225:2: ( ( ( rule__RelationSideRight__Alternatives ) ) )
            // InternalErDslParser.g:226:2: ( ( rule__RelationSideRight__Alternatives ) )
            {
            // InternalErDslParser.g:226:2: ( ( rule__RelationSideRight__Alternatives ) )
            // InternalErDslParser.g:227:3: ( rule__RelationSideRight__Alternatives )
            {
             before(grammarAccess.getRelationSideRightAccess().getAlternatives()); 
            // InternalErDslParser.g:228:3: ( rule__RelationSideRight__Alternatives )
            // InternalErDslParser.g:228:4: rule__RelationSideRight__Alternatives
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
    // InternalErDslParser.g:237:1: entryRuleRelationSideLeft : ruleRelationSideLeft EOF ;
    public final void entryRuleRelationSideLeft() throws RecognitionException {
        try {
            // InternalErDslParser.g:238:1: ( ruleRelationSideLeft EOF )
            // InternalErDslParser.g:239:1: ruleRelationSideLeft EOF
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
    // InternalErDslParser.g:246:1: ruleRelationSideLeft : ( ( rule__RelationSideLeft__Alternatives ) ) ;
    public final void ruleRelationSideLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:250:2: ( ( ( rule__RelationSideLeft__Alternatives ) ) )
            // InternalErDslParser.g:251:2: ( ( rule__RelationSideLeft__Alternatives ) )
            {
            // InternalErDslParser.g:251:2: ( ( rule__RelationSideLeft__Alternatives ) )
            // InternalErDslParser.g:252:3: ( rule__RelationSideLeft__Alternatives )
            {
             before(grammarAccess.getRelationSideLeftAccess().getAlternatives()); 
            // InternalErDslParser.g:253:3: ( rule__RelationSideLeft__Alternatives )
            // InternalErDslParser.g:253:4: rule__RelationSideLeft__Alternatives
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
    // InternalErDslParser.g:262:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:266:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalErDslParser.g:267:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalErDslParser.g:267:2: ( ( rule__DataType__Alternatives ) )
            // InternalErDslParser.g:268:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalErDslParser.g:269:3: ( rule__DataType__Alternatives )
            // InternalErDslParser.g:269:4: rule__DataType__Alternatives
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
    // InternalErDslParser.g:277:1: rule__ERModel__TargetGeneratorAlternatives_0_1_0 : ( ( LogicalSchema ) | ( PostgreSQL ) | ( MySQL ) | ( All ) );
    public final void rule__ERModel__TargetGeneratorAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:281:1: ( ( LogicalSchema ) | ( PostgreSQL ) | ( MySQL ) | ( All ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case LogicalSchema:
                {
                alt1=1;
                }
                break;
            case PostgreSQL:
                {
                alt1=2;
                }
                break;
            case MySQL:
                {
                alt1=3;
                }
                break;
            case All:
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
                    // InternalErDslParser.g:282:2: ( LogicalSchema )
                    {
                    // InternalErDslParser.g:282:2: ( LogicalSchema )
                    // InternalErDslParser.g:283:3: LogicalSchema
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorLogicalSchemaKeyword_0_1_0_0()); 
                    match(input,LogicalSchema,FOLLOW_2); 
                     after(grammarAccess.getERModelAccess().getTargetGeneratorLogicalSchemaKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:288:2: ( PostgreSQL )
                    {
                    // InternalErDslParser.g:288:2: ( PostgreSQL )
                    // InternalErDslParser.g:289:3: PostgreSQL
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorPostgreSQLKeyword_0_1_0_1()); 
                    match(input,PostgreSQL,FOLLOW_2); 
                     after(grammarAccess.getERModelAccess().getTargetGeneratorPostgreSQLKeyword_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDslParser.g:294:2: ( MySQL )
                    {
                    // InternalErDslParser.g:294:2: ( MySQL )
                    // InternalErDslParser.g:295:3: MySQL
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorMySQLKeyword_0_1_0_2()); 
                    match(input,MySQL,FOLLOW_2); 
                     after(grammarAccess.getERModelAccess().getTargetGeneratorMySQLKeyword_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDslParser.g:300:2: ( All )
                    {
                    // InternalErDslParser.g:300:2: ( All )
                    // InternalErDslParser.g:301:3: All
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorAllKeyword_0_1_0_3()); 
                    match(input,All,FOLLOW_2); 
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
    // InternalErDslParser.g:310:1: rule__Entity__GeneralizationAlternatives_1_1_0 : ( ( TotalDisjoint ) | ( TotalOverlapped ) | ( PartialDisjoint ) | ( PartialOverlapped ) );
    public final void rule__Entity__GeneralizationAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:314:1: ( ( TotalDisjoint ) | ( TotalOverlapped ) | ( PartialDisjoint ) | ( PartialOverlapped ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case TotalDisjoint:
                {
                alt2=1;
                }
                break;
            case TotalOverlapped:
                {
                alt2=2;
                }
                break;
            case PartialDisjoint:
                {
                alt2=3;
                }
                break;
            case PartialOverlapped:
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
                    // InternalErDslParser.g:315:2: ( TotalDisjoint )
                    {
                    // InternalErDslParser.g:315:2: ( TotalDisjoint )
                    // InternalErDslParser.g:316:3: TotalDisjoint
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationTotalDisjointKeyword_1_1_0_0()); 
                    match(input,TotalDisjoint,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getGeneralizationTotalDisjointKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:321:2: ( TotalOverlapped )
                    {
                    // InternalErDslParser.g:321:2: ( TotalOverlapped )
                    // InternalErDslParser.g:322:3: TotalOverlapped
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationTotalOverlappedKeyword_1_1_0_1()); 
                    match(input,TotalOverlapped,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getGeneralizationTotalOverlappedKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDslParser.g:327:2: ( PartialDisjoint )
                    {
                    // InternalErDslParser.g:327:2: ( PartialDisjoint )
                    // InternalErDslParser.g:328:3: PartialDisjoint
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationPartialDisjointKeyword_1_1_0_2()); 
                    match(input,PartialDisjoint,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getGeneralizationPartialDisjointKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDslParser.g:333:2: ( PartialOverlapped )
                    {
                    // InternalErDslParser.g:333:2: ( PartialOverlapped )
                    // InternalErDslParser.g:334:3: PartialOverlapped
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationPartialOverlappedKeyword_1_1_0_3()); 
                    match(input,PartialOverlapped,FOLLOW_2); 
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
    // InternalErDslParser.g:343:1: rule__RelationSideRight__Alternatives : ( ( ( rule__RelationSideRight__Group_0__0 ) ) | ( ( rule__RelationSideRight__TargetAssignment_1 ) ) );
    public final void rule__RelationSideRight__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:347:1: ( ( ( rule__RelationSideRight__Group_0__0 ) ) | ( ( rule__RelationSideRight__TargetAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=LeftParenthesisDigitZeroColonDigitOneRightParenthesis && LA3_0<=N_1)) ) {
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
                    // InternalErDslParser.g:348:2: ( ( rule__RelationSideRight__Group_0__0 ) )
                    {
                    // InternalErDslParser.g:348:2: ( ( rule__RelationSideRight__Group_0__0 ) )
                    // InternalErDslParser.g:349:3: ( rule__RelationSideRight__Group_0__0 )
                    {
                     before(grammarAccess.getRelationSideRightAccess().getGroup_0()); 
                    // InternalErDslParser.g:350:3: ( rule__RelationSideRight__Group_0__0 )
                    // InternalErDslParser.g:350:4: rule__RelationSideRight__Group_0__0
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
                    // InternalErDslParser.g:354:2: ( ( rule__RelationSideRight__TargetAssignment_1 ) )
                    {
                    // InternalErDslParser.g:354:2: ( ( rule__RelationSideRight__TargetAssignment_1 ) )
                    // InternalErDslParser.g:355:3: ( rule__RelationSideRight__TargetAssignment_1 )
                    {
                     before(grammarAccess.getRelationSideRightAccess().getTargetAssignment_1()); 
                    // InternalErDslParser.g:356:3: ( rule__RelationSideRight__TargetAssignment_1 )
                    // InternalErDslParser.g:356:4: rule__RelationSideRight__TargetAssignment_1
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
    // InternalErDslParser.g:364:1: rule__RelationSideRight__CardinalityAlternatives_0_0_0 : ( ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis ) | ( LeftParenthesisDigitOneColonDigitOneRightParenthesis ) | ( N ) | ( N_1 ) );
    public final void rule__RelationSideRight__CardinalityAlternatives_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:368:1: ( ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis ) | ( LeftParenthesisDigitOneColonDigitOneRightParenthesis ) | ( N ) | ( N_1 ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case LeftParenthesisDigitZeroColonDigitOneRightParenthesis:
                {
                alt4=1;
                }
                break;
            case LeftParenthesisDigitOneColonDigitOneRightParenthesis:
                {
                alt4=2;
                }
                break;
            case N:
                {
                alt4=3;
                }
                break;
            case N_1:
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
                    // InternalErDslParser.g:369:2: ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis )
                    {
                    // InternalErDslParser.g:369:2: ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis )
                    // InternalErDslParser.g:370:3: LeftParenthesisDigitZeroColonDigitOneRightParenthesis
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality01Keyword_0_0_0_0()); 
                    match(input,LeftParenthesisDigitZeroColonDigitOneRightParenthesis,FOLLOW_2); 
                     after(grammarAccess.getRelationSideRightAccess().getCardinality01Keyword_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:375:2: ( LeftParenthesisDigitOneColonDigitOneRightParenthesis )
                    {
                    // InternalErDslParser.g:375:2: ( LeftParenthesisDigitOneColonDigitOneRightParenthesis )
                    // InternalErDslParser.g:376:3: LeftParenthesisDigitOneColonDigitOneRightParenthesis
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality11Keyword_0_0_0_1()); 
                    match(input,LeftParenthesisDigitOneColonDigitOneRightParenthesis,FOLLOW_2); 
                     after(grammarAccess.getRelationSideRightAccess().getCardinality11Keyword_0_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDslParser.g:381:2: ( N )
                    {
                    // InternalErDslParser.g:381:2: ( N )
                    // InternalErDslParser.g:382:3: N
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality0NKeyword_0_0_0_2()); 
                    match(input,N,FOLLOW_2); 
                     after(grammarAccess.getRelationSideRightAccess().getCardinality0NKeyword_0_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDslParser.g:387:2: ( N_1 )
                    {
                    // InternalErDslParser.g:387:2: ( N_1 )
                    // InternalErDslParser.g:388:3: N_1
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality1NKeyword_0_0_0_3()); 
                    match(input,N_1,FOLLOW_2); 
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
    // InternalErDslParser.g:397:1: rule__RelationSideLeft__Alternatives : ( ( ( rule__RelationSideLeft__TargetAssignment_0 ) ) | ( ( rule__RelationSideLeft__Group_1__0 ) ) );
    public final void rule__RelationSideLeft__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:401:1: ( ( ( rule__RelationSideLeft__TargetAssignment_0 ) ) | ( ( rule__RelationSideLeft__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||LA5_1==Relates) ) {
                    alt5=1;
                }
                else if ( ((LA5_1>=LeftParenthesisDigitZeroColonDigitOneRightParenthesis && LA5_1<=N_1)) ) {
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
                    // InternalErDslParser.g:402:2: ( ( rule__RelationSideLeft__TargetAssignment_0 ) )
                    {
                    // InternalErDslParser.g:402:2: ( ( rule__RelationSideLeft__TargetAssignment_0 ) )
                    // InternalErDslParser.g:403:3: ( rule__RelationSideLeft__TargetAssignment_0 )
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getTargetAssignment_0()); 
                    // InternalErDslParser.g:404:3: ( rule__RelationSideLeft__TargetAssignment_0 )
                    // InternalErDslParser.g:404:4: rule__RelationSideLeft__TargetAssignment_0
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
                    // InternalErDslParser.g:408:2: ( ( rule__RelationSideLeft__Group_1__0 ) )
                    {
                    // InternalErDslParser.g:408:2: ( ( rule__RelationSideLeft__Group_1__0 ) )
                    // InternalErDslParser.g:409:3: ( rule__RelationSideLeft__Group_1__0 )
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getGroup_1()); 
                    // InternalErDslParser.g:410:3: ( rule__RelationSideLeft__Group_1__0 )
                    // InternalErDslParser.g:410:4: rule__RelationSideLeft__Group_1__0
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
    // InternalErDslParser.g:418:1: rule__RelationSideLeft__CardinalityAlternatives_1_1_0 : ( ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis ) | ( LeftParenthesisDigitOneColonDigitOneRightParenthesis ) | ( N ) | ( N_1 ) );
    public final void rule__RelationSideLeft__CardinalityAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:422:1: ( ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis ) | ( LeftParenthesisDigitOneColonDigitOneRightParenthesis ) | ( N ) | ( N_1 ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case LeftParenthesisDigitZeroColonDigitOneRightParenthesis:
                {
                alt6=1;
                }
                break;
            case LeftParenthesisDigitOneColonDigitOneRightParenthesis:
                {
                alt6=2;
                }
                break;
            case N:
                {
                alt6=3;
                }
                break;
            case N_1:
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
                    // InternalErDslParser.g:423:2: ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis )
                    {
                    // InternalErDslParser.g:423:2: ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis )
                    // InternalErDslParser.g:424:3: LeftParenthesisDigitZeroColonDigitOneRightParenthesis
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality01Keyword_1_1_0_0()); 
                    match(input,LeftParenthesisDigitZeroColonDigitOneRightParenthesis,FOLLOW_2); 
                     after(grammarAccess.getRelationSideLeftAccess().getCardinality01Keyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:429:2: ( LeftParenthesisDigitOneColonDigitOneRightParenthesis )
                    {
                    // InternalErDslParser.g:429:2: ( LeftParenthesisDigitOneColonDigitOneRightParenthesis )
                    // InternalErDslParser.g:430:3: LeftParenthesisDigitOneColonDigitOneRightParenthesis
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality11Keyword_1_1_0_1()); 
                    match(input,LeftParenthesisDigitOneColonDigitOneRightParenthesis,FOLLOW_2); 
                     after(grammarAccess.getRelationSideLeftAccess().getCardinality11Keyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDslParser.g:435:2: ( N )
                    {
                    // InternalErDslParser.g:435:2: ( N )
                    // InternalErDslParser.g:436:3: N
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality0NKeyword_1_1_0_2()); 
                    match(input,N,FOLLOW_2); 
                     after(grammarAccess.getRelationSideLeftAccess().getCardinality0NKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDslParser.g:441:2: ( N_1 )
                    {
                    // InternalErDslParser.g:441:2: ( N_1 )
                    // InternalErDslParser.g:442:3: N_1
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality1NKeyword_1_1_0_3()); 
                    match(input,N_1,FOLLOW_2); 
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
    // InternalErDslParser.g:451:1: rule__DataType__Alternatives : ( ( ( Int ) ) | ( ( Double ) ) | ( ( Money ) ) | ( ( String ) ) | ( ( Boolean ) ) | ( ( Datetime ) ) | ( ( File ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:455:1: ( ( ( Int ) ) | ( ( Double ) ) | ( ( Money ) ) | ( ( String ) ) | ( ( Boolean ) ) | ( ( Datetime ) ) | ( ( File ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case Int:
                {
                alt7=1;
                }
                break;
            case Double:
                {
                alt7=2;
                }
                break;
            case Money:
                {
                alt7=3;
                }
                break;
            case String:
                {
                alt7=4;
                }
                break;
            case Boolean:
                {
                alt7=5;
                }
                break;
            case Datetime:
                {
                alt7=6;
                }
                break;
            case File:
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
                    // InternalErDslParser.g:456:2: ( ( Int ) )
                    {
                    // InternalErDslParser.g:456:2: ( ( Int ) )
                    // InternalErDslParser.g:457:3: ( Int )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalErDslParser.g:458:3: ( Int )
                    // InternalErDslParser.g:458:4: Int
                    {
                    match(input,Int,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:462:2: ( ( Double ) )
                    {
                    // InternalErDslParser.g:462:2: ( ( Double ) )
                    // InternalErDslParser.g:463:3: ( Double )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                    // InternalErDslParser.g:464:3: ( Double )
                    // InternalErDslParser.g:464:4: Double
                    {
                    match(input,Double,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDslParser.g:468:2: ( ( Money ) )
                    {
                    // InternalErDslParser.g:468:2: ( ( Money ) )
                    // InternalErDslParser.g:469:3: ( Money )
                    {
                     before(grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2()); 
                    // InternalErDslParser.g:470:3: ( Money )
                    // InternalErDslParser.g:470:4: Money
                    {
                    match(input,Money,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDslParser.g:474:2: ( ( String ) )
                    {
                    // InternalErDslParser.g:474:2: ( ( String ) )
                    // InternalErDslParser.g:475:3: ( String )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                    // InternalErDslParser.g:476:3: ( String )
                    // InternalErDslParser.g:476:4: String
                    {
                    match(input,String,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalErDslParser.g:480:2: ( ( Boolean ) )
                    {
                    // InternalErDslParser.g:480:2: ( ( Boolean ) )
                    // InternalErDslParser.g:481:3: ( Boolean )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 
                    // InternalErDslParser.g:482:3: ( Boolean )
                    // InternalErDslParser.g:482:4: Boolean
                    {
                    match(input,Boolean,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalErDslParser.g:486:2: ( ( Datetime ) )
                    {
                    // InternalErDslParser.g:486:2: ( ( Datetime ) )
                    // InternalErDslParser.g:487:3: ( Datetime )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5()); 
                    // InternalErDslParser.g:488:3: ( Datetime )
                    // InternalErDslParser.g:488:4: Datetime
                    {
                    match(input,Datetime,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalErDslParser.g:492:2: ( ( File ) )
                    {
                    // InternalErDslParser.g:492:2: ( ( File ) )
                    // InternalErDslParser.g:493:3: ( File )
                    {
                     before(grammarAccess.getDataTypeAccess().getBLOBEnumLiteralDeclaration_6()); 
                    // InternalErDslParser.g:494:3: ( File )
                    // InternalErDslParser.g:494:4: File
                    {
                    match(input,File,FOLLOW_2); 

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
    // InternalErDslParser.g:502:1: rule__ERModel__Group__0 : rule__ERModel__Group__0__Impl rule__ERModel__Group__1 ;
    public final void rule__ERModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:506:1: ( rule__ERModel__Group__0__Impl rule__ERModel__Group__1 )
            // InternalErDslParser.g:507:2: rule__ERModel__Group__0__Impl rule__ERModel__Group__1
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
    // InternalErDslParser.g:514:1: rule__ERModel__Group__0__Impl : ( ( rule__ERModel__Group_0__0 )? ) ;
    public final void rule__ERModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:518:1: ( ( ( rule__ERModel__Group_0__0 )? ) )
            // InternalErDslParser.g:519:1: ( ( rule__ERModel__Group_0__0 )? )
            {
            // InternalErDslParser.g:519:1: ( ( rule__ERModel__Group_0__0 )? )
            // InternalErDslParser.g:520:2: ( rule__ERModel__Group_0__0 )?
            {
             before(grammarAccess.getERModelAccess().getGroup_0()); 
            // InternalErDslParser.g:521:2: ( rule__ERModel__Group_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Generate) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalErDslParser.g:521:3: rule__ERModel__Group_0__0
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
    // InternalErDslParser.g:529:1: rule__ERModel__Group__1 : rule__ERModel__Group__1__Impl rule__ERModel__Group__2 ;
    public final void rule__ERModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:533:1: ( rule__ERModel__Group__1__Impl rule__ERModel__Group__2 )
            // InternalErDslParser.g:534:2: rule__ERModel__Group__1__Impl rule__ERModel__Group__2
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
    // InternalErDslParser.g:541:1: rule__ERModel__Group__1__Impl : ( ( rule__ERModel__DomainAssignment_1 ) ) ;
    public final void rule__ERModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:545:1: ( ( ( rule__ERModel__DomainAssignment_1 ) ) )
            // InternalErDslParser.g:546:1: ( ( rule__ERModel__DomainAssignment_1 ) )
            {
            // InternalErDslParser.g:546:1: ( ( rule__ERModel__DomainAssignment_1 ) )
            // InternalErDslParser.g:547:2: ( rule__ERModel__DomainAssignment_1 )
            {
             before(grammarAccess.getERModelAccess().getDomainAssignment_1()); 
            // InternalErDslParser.g:548:2: ( rule__ERModel__DomainAssignment_1 )
            // InternalErDslParser.g:548:3: rule__ERModel__DomainAssignment_1
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
    // InternalErDslParser.g:556:1: rule__ERModel__Group__2 : rule__ERModel__Group__2__Impl rule__ERModel__Group__3 ;
    public final void rule__ERModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:560:1: ( rule__ERModel__Group__2__Impl rule__ERModel__Group__3 )
            // InternalErDslParser.g:561:2: rule__ERModel__Group__2__Impl rule__ERModel__Group__3
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
    // InternalErDslParser.g:568:1: rule__ERModel__Group__2__Impl : ( Semicolon ) ;
    public final void rule__ERModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:572:1: ( ( Semicolon ) )
            // InternalErDslParser.g:573:1: ( Semicolon )
            {
            // InternalErDslParser.g:573:1: ( Semicolon )
            // InternalErDslParser.g:574:2: Semicolon
            {
             before(grammarAccess.getERModelAccess().getSemicolonKeyword_2()); 
            match(input,Semicolon,FOLLOW_2); 
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
    // InternalErDslParser.g:583:1: rule__ERModel__Group__3 : rule__ERModel__Group__3__Impl rule__ERModel__Group__4 ;
    public final void rule__ERModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:587:1: ( rule__ERModel__Group__3__Impl rule__ERModel__Group__4 )
            // InternalErDslParser.g:588:2: rule__ERModel__Group__3__Impl rule__ERModel__Group__4
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
    // InternalErDslParser.g:595:1: rule__ERModel__Group__3__Impl : ( ( rule__ERModel__Group_3__0 ) ) ;
    public final void rule__ERModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:599:1: ( ( ( rule__ERModel__Group_3__0 ) ) )
            // InternalErDslParser.g:600:1: ( ( rule__ERModel__Group_3__0 ) )
            {
            // InternalErDslParser.g:600:1: ( ( rule__ERModel__Group_3__0 ) )
            // InternalErDslParser.g:601:2: ( rule__ERModel__Group_3__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_3()); 
            // InternalErDslParser.g:602:2: ( rule__ERModel__Group_3__0 )
            // InternalErDslParser.g:602:3: rule__ERModel__Group_3__0
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
    // InternalErDslParser.g:610:1: rule__ERModel__Group__4 : rule__ERModel__Group__4__Impl rule__ERModel__Group__5 ;
    public final void rule__ERModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:614:1: ( rule__ERModel__Group__4__Impl rule__ERModel__Group__5 )
            // InternalErDslParser.g:615:2: rule__ERModel__Group__4__Impl rule__ERModel__Group__5
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
    // InternalErDslParser.g:622:1: rule__ERModel__Group__4__Impl : ( ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* ) ) ;
    public final void rule__ERModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:626:1: ( ( ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* ) ) )
            // InternalErDslParser.g:627:1: ( ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* ) )
            {
            // InternalErDslParser.g:627:1: ( ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* ) )
            // InternalErDslParser.g:628:2: ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* )
            {
            // InternalErDslParser.g:628:2: ( ( rule__ERModel__EntitiesAssignment_4 ) )
            // InternalErDslParser.g:629:3: ( rule__ERModel__EntitiesAssignment_4 )
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_4()); 
            // InternalErDslParser.g:630:3: ( rule__ERModel__EntitiesAssignment_4 )
            // InternalErDslParser.g:630:4: rule__ERModel__EntitiesAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__ERModel__EntitiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getEntitiesAssignment_4()); 

            }

            // InternalErDslParser.g:633:2: ( ( rule__ERModel__EntitiesAssignment_4 )* )
            // InternalErDslParser.g:634:3: ( rule__ERModel__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_4()); 
            // InternalErDslParser.g:635:3: ( rule__ERModel__EntitiesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalErDslParser.g:635:4: rule__ERModel__EntitiesAssignment_4
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
    // InternalErDslParser.g:644:1: rule__ERModel__Group__5 : rule__ERModel__Group__5__Impl rule__ERModel__Group__6 ;
    public final void rule__ERModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:648:1: ( rule__ERModel__Group__5__Impl rule__ERModel__Group__6 )
            // InternalErDslParser.g:649:2: rule__ERModel__Group__5__Impl rule__ERModel__Group__6
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
    // InternalErDslParser.g:656:1: rule__ERModel__Group__5__Impl : ( ( rule__ERModel__Group_5__0 ) ) ;
    public final void rule__ERModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:660:1: ( ( ( rule__ERModel__Group_5__0 ) ) )
            // InternalErDslParser.g:661:1: ( ( rule__ERModel__Group_5__0 ) )
            {
            // InternalErDslParser.g:661:1: ( ( rule__ERModel__Group_5__0 ) )
            // InternalErDslParser.g:662:2: ( rule__ERModel__Group_5__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_5()); 
            // InternalErDslParser.g:663:2: ( rule__ERModel__Group_5__0 )
            // InternalErDslParser.g:663:3: rule__ERModel__Group_5__0
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
    // InternalErDslParser.g:671:1: rule__ERModel__Group__6 : rule__ERModel__Group__6__Impl rule__ERModel__Group__7 ;
    public final void rule__ERModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:675:1: ( rule__ERModel__Group__6__Impl rule__ERModel__Group__7 )
            // InternalErDslParser.g:676:2: rule__ERModel__Group__6__Impl rule__ERModel__Group__7
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
    // InternalErDslParser.g:683:1: rule__ERModel__Group__6__Impl : ( ( rule__ERModel__Group_6__0 ) ) ;
    public final void rule__ERModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:687:1: ( ( ( rule__ERModel__Group_6__0 ) ) )
            // InternalErDslParser.g:688:1: ( ( rule__ERModel__Group_6__0 ) )
            {
            // InternalErDslParser.g:688:1: ( ( rule__ERModel__Group_6__0 ) )
            // InternalErDslParser.g:689:2: ( rule__ERModel__Group_6__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_6()); 
            // InternalErDslParser.g:690:2: ( rule__ERModel__Group_6__0 )
            // InternalErDslParser.g:690:3: rule__ERModel__Group_6__0
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
    // InternalErDslParser.g:698:1: rule__ERModel__Group__7 : rule__ERModel__Group__7__Impl rule__ERModel__Group__8 ;
    public final void rule__ERModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:702:1: ( rule__ERModel__Group__7__Impl rule__ERModel__Group__8 )
            // InternalErDslParser.g:703:2: rule__ERModel__Group__7__Impl rule__ERModel__Group__8
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
    // InternalErDslParser.g:710:1: rule__ERModel__Group__7__Impl : ( ( rule__ERModel__RelationsAssignment_7 )* ) ;
    public final void rule__ERModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:714:1: ( ( ( rule__ERModel__RelationsAssignment_7 )* ) )
            // InternalErDslParser.g:715:1: ( ( rule__ERModel__RelationsAssignment_7 )* )
            {
            // InternalErDslParser.g:715:1: ( ( rule__ERModel__RelationsAssignment_7 )* )
            // InternalErDslParser.g:716:2: ( rule__ERModel__RelationsAssignment_7 )*
            {
             before(grammarAccess.getERModelAccess().getRelationsAssignment_7()); 
            // InternalErDslParser.g:717:2: ( rule__ERModel__RelationsAssignment_7 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==LeftSquareBracket||LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalErDslParser.g:717:3: rule__ERModel__RelationsAssignment_7
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
    // InternalErDslParser.g:725:1: rule__ERModel__Group__8 : rule__ERModel__Group__8__Impl ;
    public final void rule__ERModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:729:1: ( rule__ERModel__Group__8__Impl )
            // InternalErDslParser.g:730:2: rule__ERModel__Group__8__Impl
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
    // InternalErDslParser.g:736:1: rule__ERModel__Group__8__Impl : ( ( rule__ERModel__Group_8__0 ) ) ;
    public final void rule__ERModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:740:1: ( ( ( rule__ERModel__Group_8__0 ) ) )
            // InternalErDslParser.g:741:1: ( ( rule__ERModel__Group_8__0 ) )
            {
            // InternalErDslParser.g:741:1: ( ( rule__ERModel__Group_8__0 ) )
            // InternalErDslParser.g:742:2: ( rule__ERModel__Group_8__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_8()); 
            // InternalErDslParser.g:743:2: ( rule__ERModel__Group_8__0 )
            // InternalErDslParser.g:743:3: rule__ERModel__Group_8__0
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
    // InternalErDslParser.g:752:1: rule__ERModel__Group_0__0 : rule__ERModel__Group_0__0__Impl rule__ERModel__Group_0__1 ;
    public final void rule__ERModel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:756:1: ( rule__ERModel__Group_0__0__Impl rule__ERModel__Group_0__1 )
            // InternalErDslParser.g:757:2: rule__ERModel__Group_0__0__Impl rule__ERModel__Group_0__1
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
    // InternalErDslParser.g:764:1: rule__ERModel__Group_0__0__Impl : ( Generate ) ;
    public final void rule__ERModel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:768:1: ( ( Generate ) )
            // InternalErDslParser.g:769:1: ( Generate )
            {
            // InternalErDslParser.g:769:1: ( Generate )
            // InternalErDslParser.g:770:2: Generate
            {
             before(grammarAccess.getERModelAccess().getGenerateKeyword_0_0()); 
            match(input,Generate,FOLLOW_2); 
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
    // InternalErDslParser.g:779:1: rule__ERModel__Group_0__1 : rule__ERModel__Group_0__1__Impl rule__ERModel__Group_0__2 ;
    public final void rule__ERModel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:783:1: ( rule__ERModel__Group_0__1__Impl rule__ERModel__Group_0__2 )
            // InternalErDslParser.g:784:2: rule__ERModel__Group_0__1__Impl rule__ERModel__Group_0__2
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
    // InternalErDslParser.g:791:1: rule__ERModel__Group_0__1__Impl : ( ( rule__ERModel__TargetGeneratorAssignment_0_1 ) ) ;
    public final void rule__ERModel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:795:1: ( ( ( rule__ERModel__TargetGeneratorAssignment_0_1 ) ) )
            // InternalErDslParser.g:796:1: ( ( rule__ERModel__TargetGeneratorAssignment_0_1 ) )
            {
            // InternalErDslParser.g:796:1: ( ( rule__ERModel__TargetGeneratorAssignment_0_1 ) )
            // InternalErDslParser.g:797:2: ( rule__ERModel__TargetGeneratorAssignment_0_1 )
            {
             before(grammarAccess.getERModelAccess().getTargetGeneratorAssignment_0_1()); 
            // InternalErDslParser.g:798:2: ( rule__ERModel__TargetGeneratorAssignment_0_1 )
            // InternalErDslParser.g:798:3: rule__ERModel__TargetGeneratorAssignment_0_1
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
    // InternalErDslParser.g:806:1: rule__ERModel__Group_0__2 : rule__ERModel__Group_0__2__Impl ;
    public final void rule__ERModel__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:810:1: ( rule__ERModel__Group_0__2__Impl )
            // InternalErDslParser.g:811:2: rule__ERModel__Group_0__2__Impl
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
    // InternalErDslParser.g:817:1: rule__ERModel__Group_0__2__Impl : ( Semicolon ) ;
    public final void rule__ERModel__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:821:1: ( ( Semicolon ) )
            // InternalErDslParser.g:822:1: ( Semicolon )
            {
            // InternalErDslParser.g:822:1: ( Semicolon )
            // InternalErDslParser.g:823:2: Semicolon
            {
             before(grammarAccess.getERModelAccess().getSemicolonKeyword_0_2()); 
            match(input,Semicolon,FOLLOW_2); 
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
    // InternalErDslParser.g:833:1: rule__ERModel__Group_3__0 : rule__ERModel__Group_3__0__Impl rule__ERModel__Group_3__1 ;
    public final void rule__ERModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:837:1: ( rule__ERModel__Group_3__0__Impl rule__ERModel__Group_3__1 )
            // InternalErDslParser.g:838:2: rule__ERModel__Group_3__0__Impl rule__ERModel__Group_3__1
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
    // InternalErDslParser.g:845:1: rule__ERModel__Group_3__0__Impl : ( Entities ) ;
    public final void rule__ERModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:849:1: ( ( Entities ) )
            // InternalErDslParser.g:850:1: ( Entities )
            {
            // InternalErDslParser.g:850:1: ( Entities )
            // InternalErDslParser.g:851:2: Entities
            {
             before(grammarAccess.getERModelAccess().getEntitiesKeyword_3_0()); 
            match(input,Entities,FOLLOW_2); 
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
    // InternalErDslParser.g:860:1: rule__ERModel__Group_3__1 : rule__ERModel__Group_3__1__Impl ;
    public final void rule__ERModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:864:1: ( rule__ERModel__Group_3__1__Impl )
            // InternalErDslParser.g:865:2: rule__ERModel__Group_3__1__Impl
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
    // InternalErDslParser.g:871:1: rule__ERModel__Group_3__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ERModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:875:1: ( ( LeftCurlyBracket ) )
            // InternalErDslParser.g:876:1: ( LeftCurlyBracket )
            {
            // InternalErDslParser.g:876:1: ( LeftCurlyBracket )
            // InternalErDslParser.g:877:2: LeftCurlyBracket
            {
             before(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
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
    // InternalErDslParser.g:887:1: rule__ERModel__Group_5__0 : rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1 ;
    public final void rule__ERModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:891:1: ( rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1 )
            // InternalErDslParser.g:892:2: rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1
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
    // InternalErDslParser.g:899:1: rule__ERModel__Group_5__0__Impl : ( RightCurlyBracket ) ;
    public final void rule__ERModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:903:1: ( ( RightCurlyBracket ) )
            // InternalErDslParser.g:904:1: ( RightCurlyBracket )
            {
            // InternalErDslParser.g:904:1: ( RightCurlyBracket )
            // InternalErDslParser.g:905:2: RightCurlyBracket
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_5_0()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
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
    // InternalErDslParser.g:914:1: rule__ERModel__Group_5__1 : rule__ERModel__Group_5__1__Impl ;
    public final void rule__ERModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:918:1: ( rule__ERModel__Group_5__1__Impl )
            // InternalErDslParser.g:919:2: rule__ERModel__Group_5__1__Impl
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
    // InternalErDslParser.g:925:1: rule__ERModel__Group_5__1__Impl : ( Semicolon ) ;
    public final void rule__ERModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:929:1: ( ( Semicolon ) )
            // InternalErDslParser.g:930:1: ( Semicolon )
            {
            // InternalErDslParser.g:930:1: ( Semicolon )
            // InternalErDslParser.g:931:2: Semicolon
            {
             before(grammarAccess.getERModelAccess().getSemicolonKeyword_5_1()); 
            match(input,Semicolon,FOLLOW_2); 
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
    // InternalErDslParser.g:941:1: rule__ERModel__Group_6__0 : rule__ERModel__Group_6__0__Impl rule__ERModel__Group_6__1 ;
    public final void rule__ERModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:945:1: ( rule__ERModel__Group_6__0__Impl rule__ERModel__Group_6__1 )
            // InternalErDslParser.g:946:2: rule__ERModel__Group_6__0__Impl rule__ERModel__Group_6__1
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
    // InternalErDslParser.g:953:1: rule__ERModel__Group_6__0__Impl : ( Relationships ) ;
    public final void rule__ERModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:957:1: ( ( Relationships ) )
            // InternalErDslParser.g:958:1: ( Relationships )
            {
            // InternalErDslParser.g:958:1: ( Relationships )
            // InternalErDslParser.g:959:2: Relationships
            {
             before(grammarAccess.getERModelAccess().getRelationshipsKeyword_6_0()); 
            match(input,Relationships,FOLLOW_2); 
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
    // InternalErDslParser.g:968:1: rule__ERModel__Group_6__1 : rule__ERModel__Group_6__1__Impl ;
    public final void rule__ERModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:972:1: ( rule__ERModel__Group_6__1__Impl )
            // InternalErDslParser.g:973:2: rule__ERModel__Group_6__1__Impl
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
    // InternalErDslParser.g:979:1: rule__ERModel__Group_6__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ERModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:983:1: ( ( LeftCurlyBracket ) )
            // InternalErDslParser.g:984:1: ( LeftCurlyBracket )
            {
            // InternalErDslParser.g:984:1: ( LeftCurlyBracket )
            // InternalErDslParser.g:985:2: LeftCurlyBracket
            {
             before(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
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
    // InternalErDslParser.g:995:1: rule__ERModel__Group_8__0 : rule__ERModel__Group_8__0__Impl rule__ERModel__Group_8__1 ;
    public final void rule__ERModel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:999:1: ( rule__ERModel__Group_8__0__Impl rule__ERModel__Group_8__1 )
            // InternalErDslParser.g:1000:2: rule__ERModel__Group_8__0__Impl rule__ERModel__Group_8__1
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
    // InternalErDslParser.g:1007:1: rule__ERModel__Group_8__0__Impl : ( RightCurlyBracket ) ;
    public final void rule__ERModel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1011:1: ( ( RightCurlyBracket ) )
            // InternalErDslParser.g:1012:1: ( RightCurlyBracket )
            {
            // InternalErDslParser.g:1012:1: ( RightCurlyBracket )
            // InternalErDslParser.g:1013:2: RightCurlyBracket
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_8_0()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
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
    // InternalErDslParser.g:1022:1: rule__ERModel__Group_8__1 : rule__ERModel__Group_8__1__Impl ;
    public final void rule__ERModel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1026:1: ( rule__ERModel__Group_8__1__Impl )
            // InternalErDslParser.g:1027:2: rule__ERModel__Group_8__1__Impl
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
    // InternalErDslParser.g:1033:1: rule__ERModel__Group_8__1__Impl : ( Semicolon ) ;
    public final void rule__ERModel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1037:1: ( ( Semicolon ) )
            // InternalErDslParser.g:1038:1: ( Semicolon )
            {
            // InternalErDslParser.g:1038:1: ( Semicolon )
            // InternalErDslParser.g:1039:2: Semicolon
            {
             before(grammarAccess.getERModelAccess().getSemicolonKeyword_8_1()); 
            match(input,Semicolon,FOLLOW_2); 
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
    // InternalErDslParser.g:1049:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1053:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalErDslParser.g:1054:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalErDslParser.g:1061:1: rule__Domain__Group__0__Impl : ( Domain ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1065:1: ( ( Domain ) )
            // InternalErDslParser.g:1066:1: ( Domain )
            {
            // InternalErDslParser.g:1066:1: ( Domain )
            // InternalErDslParser.g:1067:2: Domain
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0()); 
            match(input,Domain,FOLLOW_2); 
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
    // InternalErDslParser.g:1076:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1080:1: ( rule__Domain__Group__1__Impl )
            // InternalErDslParser.g:1081:2: rule__Domain__Group__1__Impl
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
    // InternalErDslParser.g:1087:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1091:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalErDslParser.g:1092:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalErDslParser.g:1092:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalErDslParser.g:1093:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalErDslParser.g:1094:2: ( rule__Domain__NameAssignment_1 )
            // InternalErDslParser.g:1094:3: rule__Domain__NameAssignment_1
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
    // InternalErDslParser.g:1103:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1107:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalErDslParser.g:1108:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalErDslParser.g:1115:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1119:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalErDslParser.g:1120:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalErDslParser.g:1120:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalErDslParser.g:1121:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalErDslParser.g:1122:2: ( rule__Attribute__NameAssignment_0 )
            // InternalErDslParser.g:1122:3: rule__Attribute__NameAssignment_0
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
    // InternalErDslParser.g:1130:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1134:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalErDslParser.g:1135:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalErDslParser.g:1142:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__TypeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1146:1: ( ( ( rule__Attribute__TypeAssignment_1 ) ) )
            // InternalErDslParser.g:1147:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            {
            // InternalErDslParser.g:1147:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            // InternalErDslParser.g:1148:2: ( rule__Attribute__TypeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 
            // InternalErDslParser.g:1149:2: ( rule__Attribute__TypeAssignment_1 )
            // InternalErDslParser.g:1149:3: rule__Attribute__TypeAssignment_1
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
    // InternalErDslParser.g:1157:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1161:1: ( rule__Attribute__Group__2__Impl )
            // InternalErDslParser.g:1162:2: rule__Attribute__Group__2__Impl
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
    // InternalErDslParser.g:1168:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__IsKeyAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1172:1: ( ( ( rule__Attribute__IsKeyAssignment_2 )? ) )
            // InternalErDslParser.g:1173:1: ( ( rule__Attribute__IsKeyAssignment_2 )? )
            {
            // InternalErDslParser.g:1173:1: ( ( rule__Attribute__IsKeyAssignment_2 )? )
            // InternalErDslParser.g:1174:2: ( rule__Attribute__IsKeyAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getIsKeyAssignment_2()); 
            // InternalErDslParser.g:1175:2: ( rule__Attribute__IsKeyAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IsIdentifier) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalErDslParser.g:1175:3: rule__Attribute__IsKeyAssignment_2
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
    // InternalErDslParser.g:1184:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1188:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalErDslParser.g:1189:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalErDslParser.g:1196:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1200:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // InternalErDslParser.g:1201:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // InternalErDslParser.g:1201:1: ( ( rule__Entity__NameAssignment_0 ) )
            // InternalErDslParser.g:1202:2: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // InternalErDslParser.g:1203:2: ( rule__Entity__NameAssignment_0 )
            // InternalErDslParser.g:1203:3: rule__Entity__NameAssignment_0
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
    // InternalErDslParser.g:1211:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1215:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalErDslParser.g:1216:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalErDslParser.g:1223:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__Group_1__0 )? ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1227:1: ( ( ( rule__Entity__Group_1__0 )? ) )
            // InternalErDslParser.g:1228:1: ( ( rule__Entity__Group_1__0 )? )
            {
            // InternalErDslParser.g:1228:1: ( ( rule__Entity__Group_1__0 )? )
            // InternalErDslParser.g:1229:2: ( rule__Entity__Group_1__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_1()); 
            // InternalErDslParser.g:1230:2: ( rule__Entity__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Is) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalErDslParser.g:1230:3: rule__Entity__Group_1__0
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
    // InternalErDslParser.g:1238:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1242:1: ( rule__Entity__Group__2__Impl )
            // InternalErDslParser.g:1243:2: rule__Entity__Group__2__Impl
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
    // InternalErDslParser.g:1249:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1253:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalErDslParser.g:1254:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalErDslParser.g:1254:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalErDslParser.g:1255:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalErDslParser.g:1256:2: ( rule__Entity__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LeftCurlyBracket) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalErDslParser.g:1256:3: rule__Entity__Group_2__0
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
    // InternalErDslParser.g:1265:1: rule__Entity__Group_1__0 : rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 ;
    public final void rule__Entity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1269:1: ( rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 )
            // InternalErDslParser.g:1270:2: rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1
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
    // InternalErDslParser.g:1277:1: rule__Entity__Group_1__0__Impl : ( Is ) ;
    public final void rule__Entity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1281:1: ( ( Is ) )
            // InternalErDslParser.g:1282:1: ( Is )
            {
            // InternalErDslParser.g:1282:1: ( Is )
            // InternalErDslParser.g:1283:2: Is
            {
             before(grammarAccess.getEntityAccess().getIsKeyword_1_0()); 
            match(input,Is,FOLLOW_2); 
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
    // InternalErDslParser.g:1292:1: rule__Entity__Group_1__1 : rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2 ;
    public final void rule__Entity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1296:1: ( rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2 )
            // InternalErDslParser.g:1297:2: rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2
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
    // InternalErDslParser.g:1304:1: rule__Entity__Group_1__1__Impl : ( ( rule__Entity__GeneralizationAssignment_1_1 ) ) ;
    public final void rule__Entity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1308:1: ( ( ( rule__Entity__GeneralizationAssignment_1_1 ) ) )
            // InternalErDslParser.g:1309:1: ( ( rule__Entity__GeneralizationAssignment_1_1 ) )
            {
            // InternalErDslParser.g:1309:1: ( ( rule__Entity__GeneralizationAssignment_1_1 ) )
            // InternalErDslParser.g:1310:2: ( rule__Entity__GeneralizationAssignment_1_1 )
            {
             before(grammarAccess.getEntityAccess().getGeneralizationAssignment_1_1()); 
            // InternalErDslParser.g:1311:2: ( rule__Entity__GeneralizationAssignment_1_1 )
            // InternalErDslParser.g:1311:3: rule__Entity__GeneralizationAssignment_1_1
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
    // InternalErDslParser.g:1319:1: rule__Entity__Group_1__2 : rule__Entity__Group_1__2__Impl ;
    public final void rule__Entity__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1323:1: ( rule__Entity__Group_1__2__Impl )
            // InternalErDslParser.g:1324:2: rule__Entity__Group_1__2__Impl
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
    // InternalErDslParser.g:1330:1: rule__Entity__Group_1__2__Impl : ( ( rule__Entity__IsAssignment_1_2 ) ) ;
    public final void rule__Entity__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1334:1: ( ( ( rule__Entity__IsAssignment_1_2 ) ) )
            // InternalErDslParser.g:1335:1: ( ( rule__Entity__IsAssignment_1_2 ) )
            {
            // InternalErDslParser.g:1335:1: ( ( rule__Entity__IsAssignment_1_2 ) )
            // InternalErDslParser.g:1336:2: ( rule__Entity__IsAssignment_1_2 )
            {
             before(grammarAccess.getEntityAccess().getIsAssignment_1_2()); 
            // InternalErDslParser.g:1337:2: ( rule__Entity__IsAssignment_1_2 )
            // InternalErDslParser.g:1337:3: rule__Entity__IsAssignment_1_2
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
    // InternalErDslParser.g:1346:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1350:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalErDslParser.g:1351:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
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
    // InternalErDslParser.g:1358:1: rule__Entity__Group_2__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1362:1: ( ( LeftCurlyBracket ) )
            // InternalErDslParser.g:1363:1: ( LeftCurlyBracket )
            {
            // InternalErDslParser.g:1363:1: ( LeftCurlyBracket )
            // InternalErDslParser.g:1364:2: LeftCurlyBracket
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
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
    // InternalErDslParser.g:1373:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1377:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // InternalErDslParser.g:1378:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
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
    // InternalErDslParser.g:1385:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1389:1: ( ( ( rule__Entity__AttributesAssignment_2_1 ) ) )
            // InternalErDslParser.g:1390:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            {
            // InternalErDslParser.g:1390:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            // InternalErDslParser.g:1391:2: ( rule__Entity__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_1()); 
            // InternalErDslParser.g:1392:2: ( rule__Entity__AttributesAssignment_2_1 )
            // InternalErDslParser.g:1392:3: rule__Entity__AttributesAssignment_2_1
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
    // InternalErDslParser.g:1400:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1404:1: ( rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 )
            // InternalErDslParser.g:1405:2: rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3
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
    // InternalErDslParser.g:1412:1: rule__Entity__Group_2__2__Impl : ( ( rule__Entity__Group_2_2__0 )* ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1416:1: ( ( ( rule__Entity__Group_2_2__0 )* ) )
            // InternalErDslParser.g:1417:1: ( ( rule__Entity__Group_2_2__0 )* )
            {
            // InternalErDslParser.g:1417:1: ( ( rule__Entity__Group_2_2__0 )* )
            // InternalErDslParser.g:1418:2: ( rule__Entity__Group_2_2__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_2_2()); 
            // InternalErDslParser.g:1419:2: ( rule__Entity__Group_2_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalErDslParser.g:1419:3: rule__Entity__Group_2_2__0
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
    // InternalErDslParser.g:1427:1: rule__Entity__Group_2__3 : rule__Entity__Group_2__3__Impl ;
    public final void rule__Entity__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1431:1: ( rule__Entity__Group_2__3__Impl )
            // InternalErDslParser.g:1432:2: rule__Entity__Group_2__3__Impl
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
    // InternalErDslParser.g:1438:1: rule__Entity__Group_2__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Entity__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1442:1: ( ( RightCurlyBracket ) )
            // InternalErDslParser.g:1443:1: ( RightCurlyBracket )
            {
            // InternalErDslParser.g:1443:1: ( RightCurlyBracket )
            // InternalErDslParser.g:1444:2: RightCurlyBracket
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
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
    // InternalErDslParser.g:1454:1: rule__Entity__Group_2_2__0 : rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 ;
    public final void rule__Entity__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1458:1: ( rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 )
            // InternalErDslParser.g:1459:2: rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1
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
    // InternalErDslParser.g:1466:1: rule__Entity__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__Entity__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1470:1: ( ( Comma ) )
            // InternalErDslParser.g:1471:1: ( Comma )
            {
            // InternalErDslParser.g:1471:1: ( Comma )
            // InternalErDslParser.g:1472:2: Comma
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_2); 
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
    // InternalErDslParser.g:1481:1: rule__Entity__Group_2_2__1 : rule__Entity__Group_2_2__1__Impl ;
    public final void rule__Entity__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1485:1: ( rule__Entity__Group_2_2__1__Impl )
            // InternalErDslParser.g:1486:2: rule__Entity__Group_2_2__1__Impl
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
    // InternalErDslParser.g:1492:1: rule__Entity__Group_2_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Entity__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1496:1: ( ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) )
            // InternalErDslParser.g:1497:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDslParser.g:1497:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            // InternalErDslParser.g:1498:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDslParser.g:1499:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            // InternalErDslParser.g:1499:3: rule__Entity__AttributesAssignment_2_2_1
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
    // InternalErDslParser.g:1508:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1512:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalErDslParser.g:1513:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
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
    // InternalErDslParser.g:1520:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__NameAssignment_0 )? ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1524:1: ( ( ( rule__Relation__NameAssignment_0 )? ) )
            // InternalErDslParser.g:1525:1: ( ( rule__Relation__NameAssignment_0 )? )
            {
            // InternalErDslParser.g:1525:1: ( ( rule__Relation__NameAssignment_0 )? )
            // InternalErDslParser.g:1526:2: ( rule__Relation__NameAssignment_0 )?
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_0()); 
            // InternalErDslParser.g:1527:2: ( rule__Relation__NameAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalErDslParser.g:1527:3: rule__Relation__NameAssignment_0
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
    // InternalErDslParser.g:1535:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1539:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalErDslParser.g:1540:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
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
    // InternalErDslParser.g:1547:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__Group_1__0 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1551:1: ( ( ( rule__Relation__Group_1__0 ) ) )
            // InternalErDslParser.g:1552:1: ( ( rule__Relation__Group_1__0 ) )
            {
            // InternalErDslParser.g:1552:1: ( ( rule__Relation__Group_1__0 ) )
            // InternalErDslParser.g:1553:2: ( rule__Relation__Group_1__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_1()); 
            // InternalErDslParser.g:1554:2: ( rule__Relation__Group_1__0 )
            // InternalErDslParser.g:1554:3: rule__Relation__Group_1__0
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
    // InternalErDslParser.g:1562:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1566:1: ( rule__Relation__Group__2__Impl )
            // InternalErDslParser.g:1567:2: rule__Relation__Group__2__Impl
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
    // InternalErDslParser.g:1573:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__Group_2__0 )* ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1577:1: ( ( ( rule__Relation__Group_2__0 )* ) )
            // InternalErDslParser.g:1578:1: ( ( rule__Relation__Group_2__0 )* )
            {
            // InternalErDslParser.g:1578:1: ( ( rule__Relation__Group_2__0 )* )
            // InternalErDslParser.g:1579:2: ( rule__Relation__Group_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2()); 
            // InternalErDslParser.g:1580:2: ( rule__Relation__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==LeftCurlyBracket) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalErDslParser.g:1580:3: rule__Relation__Group_2__0
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
    // InternalErDslParser.g:1589:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1593:1: ( rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 )
            // InternalErDslParser.g:1594:2: rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1
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
    // InternalErDslParser.g:1601:1: rule__Relation__Group_1__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1605:1: ( ( LeftSquareBracket ) )
            // InternalErDslParser.g:1606:1: ( LeftSquareBracket )
            {
            // InternalErDslParser.g:1606:1: ( LeftSquareBracket )
            // InternalErDslParser.g:1607:2: LeftSquareBracket
            {
             before(grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
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
    // InternalErDslParser.g:1616:1: rule__Relation__Group_1__1 : rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 ;
    public final void rule__Relation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1620:1: ( rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 )
            // InternalErDslParser.g:1621:2: rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2
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
    // InternalErDslParser.g:1628:1: rule__Relation__Group_1__1__Impl : ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) ;
    public final void rule__Relation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1632:1: ( ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) )
            // InternalErDslParser.g:1633:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            {
            // InternalErDslParser.g:1633:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            // InternalErDslParser.g:1634:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            {
             before(grammarAccess.getRelationAccess().getLeftEndingAssignment_1_1()); 
            // InternalErDslParser.g:1635:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            // InternalErDslParser.g:1635:3: rule__Relation__LeftEndingAssignment_1_1
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
    // InternalErDslParser.g:1643:1: rule__Relation__Group_1__2 : rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 ;
    public final void rule__Relation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1647:1: ( rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 )
            // InternalErDslParser.g:1648:2: rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3
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
    // InternalErDslParser.g:1655:1: rule__Relation__Group_1__2__Impl : ( Relates ) ;
    public final void rule__Relation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1659:1: ( ( Relates ) )
            // InternalErDslParser.g:1660:1: ( Relates )
            {
            // InternalErDslParser.g:1660:1: ( Relates )
            // InternalErDslParser.g:1661:2: Relates
            {
             before(grammarAccess.getRelationAccess().getRelatesKeyword_1_2()); 
            match(input,Relates,FOLLOW_2); 
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
    // InternalErDslParser.g:1670:1: rule__Relation__Group_1__3 : rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 ;
    public final void rule__Relation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1674:1: ( rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 )
            // InternalErDslParser.g:1675:2: rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4
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
    // InternalErDslParser.g:1682:1: rule__Relation__Group_1__3__Impl : ( ( rule__Relation__RightEndingAssignment_1_3 ) ) ;
    public final void rule__Relation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1686:1: ( ( ( rule__Relation__RightEndingAssignment_1_3 ) ) )
            // InternalErDslParser.g:1687:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            {
            // InternalErDslParser.g:1687:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            // InternalErDslParser.g:1688:2: ( rule__Relation__RightEndingAssignment_1_3 )
            {
             before(grammarAccess.getRelationAccess().getRightEndingAssignment_1_3()); 
            // InternalErDslParser.g:1689:2: ( rule__Relation__RightEndingAssignment_1_3 )
            // InternalErDslParser.g:1689:3: rule__Relation__RightEndingAssignment_1_3
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
    // InternalErDslParser.g:1697:1: rule__Relation__Group_1__4 : rule__Relation__Group_1__4__Impl ;
    public final void rule__Relation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1701:1: ( rule__Relation__Group_1__4__Impl )
            // InternalErDslParser.g:1702:2: rule__Relation__Group_1__4__Impl
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
    // InternalErDslParser.g:1708:1: rule__Relation__Group_1__4__Impl : ( RightSquareBracket ) ;
    public final void rule__Relation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1712:1: ( ( RightSquareBracket ) )
            // InternalErDslParser.g:1713:1: ( RightSquareBracket )
            {
            // InternalErDslParser.g:1713:1: ( RightSquareBracket )
            // InternalErDslParser.g:1714:2: RightSquareBracket
            {
             before(grammarAccess.getRelationAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,RightSquareBracket,FOLLOW_2); 
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
    // InternalErDslParser.g:1724:1: rule__Relation__Group_2__0 : rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 ;
    public final void rule__Relation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1728:1: ( rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 )
            // InternalErDslParser.g:1729:2: rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1
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
    // InternalErDslParser.g:1736:1: rule__Relation__Group_2__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Relation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1740:1: ( ( LeftCurlyBracket ) )
            // InternalErDslParser.g:1741:1: ( LeftCurlyBracket )
            {
            // InternalErDslParser.g:1741:1: ( LeftCurlyBracket )
            // InternalErDslParser.g:1742:2: LeftCurlyBracket
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
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
    // InternalErDslParser.g:1751:1: rule__Relation__Group_2__1 : rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 ;
    public final void rule__Relation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1755:1: ( rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 )
            // InternalErDslParser.g:1756:2: rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2
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
    // InternalErDslParser.g:1763:1: rule__Relation__Group_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_1 ) ) ;
    public final void rule__Relation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1767:1: ( ( ( rule__Relation__AttributesAssignment_2_1 ) ) )
            // InternalErDslParser.g:1768:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            {
            // InternalErDslParser.g:1768:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            // InternalErDslParser.g:1769:2: ( rule__Relation__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_1()); 
            // InternalErDslParser.g:1770:2: ( rule__Relation__AttributesAssignment_2_1 )
            // InternalErDslParser.g:1770:3: rule__Relation__AttributesAssignment_2_1
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
    // InternalErDslParser.g:1778:1: rule__Relation__Group_2__2 : rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 ;
    public final void rule__Relation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1782:1: ( rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 )
            // InternalErDslParser.g:1783:2: rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3
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
    // InternalErDslParser.g:1790:1: rule__Relation__Group_2__2__Impl : ( ( rule__Relation__Group_2_2__0 )* ) ;
    public final void rule__Relation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1794:1: ( ( ( rule__Relation__Group_2_2__0 )* ) )
            // InternalErDslParser.g:1795:1: ( ( rule__Relation__Group_2_2__0 )* )
            {
            // InternalErDslParser.g:1795:1: ( ( rule__Relation__Group_2_2__0 )* )
            // InternalErDslParser.g:1796:2: ( rule__Relation__Group_2_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2_2()); 
            // InternalErDslParser.g:1797:2: ( rule__Relation__Group_2_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Comma) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalErDslParser.g:1797:3: rule__Relation__Group_2_2__0
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
    // InternalErDslParser.g:1805:1: rule__Relation__Group_2__3 : rule__Relation__Group_2__3__Impl ;
    public final void rule__Relation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1809:1: ( rule__Relation__Group_2__3__Impl )
            // InternalErDslParser.g:1810:2: rule__Relation__Group_2__3__Impl
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
    // InternalErDslParser.g:1816:1: rule__Relation__Group_2__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Relation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1820:1: ( ( RightCurlyBracket ) )
            // InternalErDslParser.g:1821:1: ( RightCurlyBracket )
            {
            // InternalErDslParser.g:1821:1: ( RightCurlyBracket )
            // InternalErDslParser.g:1822:2: RightCurlyBracket
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
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
    // InternalErDslParser.g:1832:1: rule__Relation__Group_2_2__0 : rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 ;
    public final void rule__Relation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1836:1: ( rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 )
            // InternalErDslParser.g:1837:2: rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1
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
    // InternalErDslParser.g:1844:1: rule__Relation__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__Relation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1848:1: ( ( Comma ) )
            // InternalErDslParser.g:1849:1: ( Comma )
            {
            // InternalErDslParser.g:1849:1: ( Comma )
            // InternalErDslParser.g:1850:2: Comma
            {
             before(grammarAccess.getRelationAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_2); 
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
    // InternalErDslParser.g:1859:1: rule__Relation__Group_2_2__1 : rule__Relation__Group_2_2__1__Impl ;
    public final void rule__Relation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1863:1: ( rule__Relation__Group_2_2__1__Impl )
            // InternalErDslParser.g:1864:2: rule__Relation__Group_2_2__1__Impl
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
    // InternalErDslParser.g:1870:1: rule__Relation__Group_2_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Relation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1874:1: ( ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) )
            // InternalErDslParser.g:1875:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDslParser.g:1875:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            // InternalErDslParser.g:1876:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDslParser.g:1877:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            // InternalErDslParser.g:1877:3: rule__Relation__AttributesAssignment_2_2_1
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
    // InternalErDslParser.g:1886:1: rule__RelationSideRight__Group_0__0 : rule__RelationSideRight__Group_0__0__Impl rule__RelationSideRight__Group_0__1 ;
    public final void rule__RelationSideRight__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1890:1: ( rule__RelationSideRight__Group_0__0__Impl rule__RelationSideRight__Group_0__1 )
            // InternalErDslParser.g:1891:2: rule__RelationSideRight__Group_0__0__Impl rule__RelationSideRight__Group_0__1
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
    // InternalErDslParser.g:1898:1: rule__RelationSideRight__Group_0__0__Impl : ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) ) ;
    public final void rule__RelationSideRight__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1902:1: ( ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) ) )
            // InternalErDslParser.g:1903:1: ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) )
            {
            // InternalErDslParser.g:1903:1: ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) )
            // InternalErDslParser.g:1904:2: ( rule__RelationSideRight__CardinalityAssignment_0_0 )
            {
             before(grammarAccess.getRelationSideRightAccess().getCardinalityAssignment_0_0()); 
            // InternalErDslParser.g:1905:2: ( rule__RelationSideRight__CardinalityAssignment_0_0 )
            // InternalErDslParser.g:1905:3: rule__RelationSideRight__CardinalityAssignment_0_0
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
    // InternalErDslParser.g:1913:1: rule__RelationSideRight__Group_0__1 : rule__RelationSideRight__Group_0__1__Impl ;
    public final void rule__RelationSideRight__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1917:1: ( rule__RelationSideRight__Group_0__1__Impl )
            // InternalErDslParser.g:1918:2: rule__RelationSideRight__Group_0__1__Impl
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
    // InternalErDslParser.g:1924:1: rule__RelationSideRight__Group_0__1__Impl : ( ( rule__RelationSideRight__TargetAssignment_0_1 ) ) ;
    public final void rule__RelationSideRight__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1928:1: ( ( ( rule__RelationSideRight__TargetAssignment_0_1 ) ) )
            // InternalErDslParser.g:1929:1: ( ( rule__RelationSideRight__TargetAssignment_0_1 ) )
            {
            // InternalErDslParser.g:1929:1: ( ( rule__RelationSideRight__TargetAssignment_0_1 ) )
            // InternalErDslParser.g:1930:2: ( rule__RelationSideRight__TargetAssignment_0_1 )
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetAssignment_0_1()); 
            // InternalErDslParser.g:1931:2: ( rule__RelationSideRight__TargetAssignment_0_1 )
            // InternalErDslParser.g:1931:3: rule__RelationSideRight__TargetAssignment_0_1
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
    // InternalErDslParser.g:1940:1: rule__RelationSideLeft__Group_1__0 : rule__RelationSideLeft__Group_1__0__Impl rule__RelationSideLeft__Group_1__1 ;
    public final void rule__RelationSideLeft__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1944:1: ( rule__RelationSideLeft__Group_1__0__Impl rule__RelationSideLeft__Group_1__1 )
            // InternalErDslParser.g:1945:2: rule__RelationSideLeft__Group_1__0__Impl rule__RelationSideLeft__Group_1__1
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
    // InternalErDslParser.g:1952:1: rule__RelationSideLeft__Group_1__0__Impl : ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) ) ;
    public final void rule__RelationSideLeft__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1956:1: ( ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) ) )
            // InternalErDslParser.g:1957:1: ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) )
            {
            // InternalErDslParser.g:1957:1: ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) )
            // InternalErDslParser.g:1958:2: ( rule__RelationSideLeft__TargetAssignment_1_0 )
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetAssignment_1_0()); 
            // InternalErDslParser.g:1959:2: ( rule__RelationSideLeft__TargetAssignment_1_0 )
            // InternalErDslParser.g:1959:3: rule__RelationSideLeft__TargetAssignment_1_0
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
    // InternalErDslParser.g:1967:1: rule__RelationSideLeft__Group_1__1 : rule__RelationSideLeft__Group_1__1__Impl ;
    public final void rule__RelationSideLeft__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1971:1: ( rule__RelationSideLeft__Group_1__1__Impl )
            // InternalErDslParser.g:1972:2: rule__RelationSideLeft__Group_1__1__Impl
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
    // InternalErDslParser.g:1978:1: rule__RelationSideLeft__Group_1__1__Impl : ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) ) ;
    public final void rule__RelationSideLeft__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1982:1: ( ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) ) )
            // InternalErDslParser.g:1983:1: ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) )
            {
            // InternalErDslParser.g:1983:1: ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) )
            // InternalErDslParser.g:1984:2: ( rule__RelationSideLeft__CardinalityAssignment_1_1 )
            {
             before(grammarAccess.getRelationSideLeftAccess().getCardinalityAssignment_1_1()); 
            // InternalErDslParser.g:1985:2: ( rule__RelationSideLeft__CardinalityAssignment_1_1 )
            // InternalErDslParser.g:1985:3: rule__RelationSideLeft__CardinalityAssignment_1_1
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
    // InternalErDslParser.g:1994:1: rule__ERModel__TargetGeneratorAssignment_0_1 : ( ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 ) ) ;
    public final void rule__ERModel__TargetGeneratorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1998:1: ( ( ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 ) ) )
            // InternalErDslParser.g:1999:2: ( ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 ) )
            {
            // InternalErDslParser.g:1999:2: ( ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 ) )
            // InternalErDslParser.g:2000:3: ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 )
            {
             before(grammarAccess.getERModelAccess().getTargetGeneratorAlternatives_0_1_0()); 
            // InternalErDslParser.g:2001:3: ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 )
            // InternalErDslParser.g:2001:4: rule__ERModel__TargetGeneratorAlternatives_0_1_0
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
    // InternalErDslParser.g:2009:1: rule__ERModel__DomainAssignment_1 : ( ruleDomain ) ;
    public final void rule__ERModel__DomainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2013:1: ( ( ruleDomain ) )
            // InternalErDslParser.g:2014:2: ( ruleDomain )
            {
            // InternalErDslParser.g:2014:2: ( ruleDomain )
            // InternalErDslParser.g:2015:3: ruleDomain
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
    // InternalErDslParser.g:2024:1: rule__ERModel__EntitiesAssignment_4 : ( ruleEntity ) ;
    public final void rule__ERModel__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2028:1: ( ( ruleEntity ) )
            // InternalErDslParser.g:2029:2: ( ruleEntity )
            {
            // InternalErDslParser.g:2029:2: ( ruleEntity )
            // InternalErDslParser.g:2030:3: ruleEntity
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
    // InternalErDslParser.g:2039:1: rule__ERModel__RelationsAssignment_7 : ( ruleRelation ) ;
    public final void rule__ERModel__RelationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2043:1: ( ( ruleRelation ) )
            // InternalErDslParser.g:2044:2: ( ruleRelation )
            {
            // InternalErDslParser.g:2044:2: ( ruleRelation )
            // InternalErDslParser.g:2045:3: ruleRelation
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
    // InternalErDslParser.g:2054:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2058:1: ( ( RULE_ID ) )
            // InternalErDslParser.g:2059:2: ( RULE_ID )
            {
            // InternalErDslParser.g:2059:2: ( RULE_ID )
            // InternalErDslParser.g:2060:3: RULE_ID
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
    // InternalErDslParser.g:2069:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2073:1: ( ( RULE_ID ) )
            // InternalErDslParser.g:2074:2: ( RULE_ID )
            {
            // InternalErDslParser.g:2074:2: ( RULE_ID )
            // InternalErDslParser.g:2075:3: RULE_ID
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
    // InternalErDslParser.g:2084:1: rule__Attribute__TypeAssignment_1 : ( ruleDataType ) ;
    public final void rule__Attribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2088:1: ( ( ruleDataType ) )
            // InternalErDslParser.g:2089:2: ( ruleDataType )
            {
            // InternalErDslParser.g:2089:2: ( ruleDataType )
            // InternalErDslParser.g:2090:3: ruleDataType
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
    // InternalErDslParser.g:2099:1: rule__Attribute__IsKeyAssignment_2 : ( ( IsIdentifier ) ) ;
    public final void rule__Attribute__IsKeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2103:1: ( ( ( IsIdentifier ) ) )
            // InternalErDslParser.g:2104:2: ( ( IsIdentifier ) )
            {
            // InternalErDslParser.g:2104:2: ( ( IsIdentifier ) )
            // InternalErDslParser.g:2105:3: ( IsIdentifier )
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_2_0()); 
            // InternalErDslParser.g:2106:3: ( IsIdentifier )
            // InternalErDslParser.g:2107:4: IsIdentifier
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_2_0()); 
            match(input,IsIdentifier,FOLLOW_2); 
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
    // InternalErDslParser.g:2118:1: rule__Entity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2122:1: ( ( RULE_ID ) )
            // InternalErDslParser.g:2123:2: ( RULE_ID )
            {
            // InternalErDslParser.g:2123:2: ( RULE_ID )
            // InternalErDslParser.g:2124:3: RULE_ID
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
    // InternalErDslParser.g:2133:1: rule__Entity__GeneralizationAssignment_1_1 : ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) ) ;
    public final void rule__Entity__GeneralizationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2137:1: ( ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) ) )
            // InternalErDslParser.g:2138:2: ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) )
            {
            // InternalErDslParser.g:2138:2: ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) )
            // InternalErDslParser.g:2139:3: ( rule__Entity__GeneralizationAlternatives_1_1_0 )
            {
             before(grammarAccess.getEntityAccess().getGeneralizationAlternatives_1_1_0()); 
            // InternalErDslParser.g:2140:3: ( rule__Entity__GeneralizationAlternatives_1_1_0 )
            // InternalErDslParser.g:2140:4: rule__Entity__GeneralizationAlternatives_1_1_0
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
    // InternalErDslParser.g:2148:1: rule__Entity__IsAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__IsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2152:1: ( ( ( RULE_ID ) ) )
            // InternalErDslParser.g:2153:2: ( ( RULE_ID ) )
            {
            // InternalErDslParser.g:2153:2: ( ( RULE_ID ) )
            // InternalErDslParser.g:2154:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getIsEntityCrossReference_1_2_0()); 
            // InternalErDslParser.g:2155:3: ( RULE_ID )
            // InternalErDslParser.g:2156:4: RULE_ID
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
    // InternalErDslParser.g:2167:1: rule__Entity__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2171:1: ( ( ruleAttribute ) )
            // InternalErDslParser.g:2172:2: ( ruleAttribute )
            {
            // InternalErDslParser.g:2172:2: ( ruleAttribute )
            // InternalErDslParser.g:2173:3: ruleAttribute
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
    // InternalErDslParser.g:2182:1: rule__Entity__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2186:1: ( ( ruleAttribute ) )
            // InternalErDslParser.g:2187:2: ( ruleAttribute )
            {
            // InternalErDslParser.g:2187:2: ( ruleAttribute )
            // InternalErDslParser.g:2188:3: ruleAttribute
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
    // InternalErDslParser.g:2197:1: rule__Relation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2201:1: ( ( RULE_ID ) )
            // InternalErDslParser.g:2202:2: ( RULE_ID )
            {
            // InternalErDslParser.g:2202:2: ( RULE_ID )
            // InternalErDslParser.g:2203:3: RULE_ID
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
    // InternalErDslParser.g:2212:1: rule__Relation__LeftEndingAssignment_1_1 : ( ruleRelationSideLeft ) ;
    public final void rule__Relation__LeftEndingAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2216:1: ( ( ruleRelationSideLeft ) )
            // InternalErDslParser.g:2217:2: ( ruleRelationSideLeft )
            {
            // InternalErDslParser.g:2217:2: ( ruleRelationSideLeft )
            // InternalErDslParser.g:2218:3: ruleRelationSideLeft
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
    // InternalErDslParser.g:2227:1: rule__Relation__RightEndingAssignment_1_3 : ( ruleRelationSideRight ) ;
    public final void rule__Relation__RightEndingAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2231:1: ( ( ruleRelationSideRight ) )
            // InternalErDslParser.g:2232:2: ( ruleRelationSideRight )
            {
            // InternalErDslParser.g:2232:2: ( ruleRelationSideRight )
            // InternalErDslParser.g:2233:3: ruleRelationSideRight
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
    // InternalErDslParser.g:2242:1: rule__Relation__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2246:1: ( ( ruleAttribute ) )
            // InternalErDslParser.g:2247:2: ( ruleAttribute )
            {
            // InternalErDslParser.g:2247:2: ( ruleAttribute )
            // InternalErDslParser.g:2248:3: ruleAttribute
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
    // InternalErDslParser.g:2257:1: rule__Relation__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2261:1: ( ( ruleAttribute ) )
            // InternalErDslParser.g:2262:2: ( ruleAttribute )
            {
            // InternalErDslParser.g:2262:2: ( ruleAttribute )
            // InternalErDslParser.g:2263:3: ruleAttribute
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
    // InternalErDslParser.g:2272:1: rule__RelationSideRight__CardinalityAssignment_0_0 : ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) ) ;
    public final void rule__RelationSideRight__CardinalityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2276:1: ( ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) ) )
            // InternalErDslParser.g:2277:2: ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) )
            {
            // InternalErDslParser.g:2277:2: ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) )
            // InternalErDslParser.g:2278:3: ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 )
            {
             before(grammarAccess.getRelationSideRightAccess().getCardinalityAlternatives_0_0_0()); 
            // InternalErDslParser.g:2279:3: ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 )
            // InternalErDslParser.g:2279:4: rule__RelationSideRight__CardinalityAlternatives_0_0_0
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
    // InternalErDslParser.g:2287:1: rule__RelationSideRight__TargetAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideRight__TargetAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2291:1: ( ( ( RULE_ID ) ) )
            // InternalErDslParser.g:2292:2: ( ( RULE_ID ) )
            {
            // InternalErDslParser.g:2292:2: ( ( RULE_ID ) )
            // InternalErDslParser.g:2293:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetEntityCrossReference_0_1_0()); 
            // InternalErDslParser.g:2294:3: ( RULE_ID )
            // InternalErDslParser.g:2295:4: RULE_ID
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
    // InternalErDslParser.g:2306:1: rule__RelationSideRight__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideRight__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2310:1: ( ( ( RULE_ID ) ) )
            // InternalErDslParser.g:2311:2: ( ( RULE_ID ) )
            {
            // InternalErDslParser.g:2311:2: ( ( RULE_ID ) )
            // InternalErDslParser.g:2312:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetRelationCrossReference_1_0()); 
            // InternalErDslParser.g:2313:3: ( RULE_ID )
            // InternalErDslParser.g:2314:4: RULE_ID
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
    // InternalErDslParser.g:2325:1: rule__RelationSideLeft__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideLeft__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2329:1: ( ( ( RULE_ID ) ) )
            // InternalErDslParser.g:2330:2: ( ( RULE_ID ) )
            {
            // InternalErDslParser.g:2330:2: ( ( RULE_ID ) )
            // InternalErDslParser.g:2331:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetEntityCrossReference_0_0()); 
            // InternalErDslParser.g:2332:3: ( RULE_ID )
            // InternalErDslParser.g:2333:4: RULE_ID
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
    // InternalErDslParser.g:2344:1: rule__RelationSideLeft__TargetAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideLeft__TargetAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2348:1: ( ( ( RULE_ID ) ) )
            // InternalErDslParser.g:2349:2: ( ( RULE_ID ) )
            {
            // InternalErDslParser.g:2349:2: ( ( RULE_ID ) )
            // InternalErDslParser.g:2350:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetRelationCrossReference_1_0_0()); 
            // InternalErDslParser.g:2351:3: ( RULE_ID )
            // InternalErDslParser.g:2352:4: RULE_ID
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
    // InternalErDslParser.g:2363:1: rule__RelationSideLeft__CardinalityAssignment_1_1 : ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) ) ;
    public final void rule__RelationSideLeft__CardinalityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2367:1: ( ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) ) )
            // InternalErDslParser.g:2368:2: ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) )
            {
            // InternalErDslParser.g:2368:2: ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) )
            // InternalErDslParser.g:2369:3: ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 )
            {
             before(grammarAccess.getRelationSideLeftAccess().getCardinalityAlternatives_1_1_0()); 
            // InternalErDslParser.g:2370:3: ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 )
            // InternalErDslParser.g:2370:4: rule__RelationSideLeft__CardinalityAlternatives_1_1_0
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001900000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001100000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000009000900L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000160CC000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000420000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000F00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000F00000L});

}