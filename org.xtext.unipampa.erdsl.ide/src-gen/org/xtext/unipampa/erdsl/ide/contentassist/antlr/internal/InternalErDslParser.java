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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "GenerateOcurrenceDiagram", "PartialOverlapped", "PartialDisjoint", "TotalOverlapped", "TotalDisjoint", "LogicalSchema", "Relationships", "IsIdentifier", "PostgreSQL", "Entities", "Generate", "Datetime", "Diagram", "Boolean", "Relates", "Domain", "Double", "String", "LeftParenthesisDigitZeroColonDigitOneRightParenthesis", "N", "LeftParenthesisDigitOneColonDigitOneRightParenthesis", "N_1", "MySQL", "Money", "File", "All", "Int", "Is", "Comma", "Semicolon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int All=29;
    public static final int N_1=25;
    public static final int PostgreSQL=12;
    public static final int String=21;
    public static final int TotalOverlapped=7;
    public static final int MySQL=26;
    public static final int Boolean=17;
    public static final int RightSquareBracket=35;
    public static final int Relates=18;
    public static final int RULE_ID=38;
    public static final int PartialOverlapped=5;
    public static final int LogicalSchema=9;
    public static final int IsIdentifier=11;
    public static final int Double=20;
    public static final int RULE_INT=39;
    public static final int RULE_ML_COMMENT=41;
    public static final int LeftSquareBracket=34;
    public static final int Domain=19;
    public static final int File=28;
    public static final int PartialDisjoint=6;
    public static final int Is=31;
    public static final int RULE_STRING=40;
    public static final int LeftParenthesisDigitZeroColonDigitOneRightParenthesis=22;
    public static final int GenerateOcurrenceDiagram=4;
    public static final int N=23;
    public static final int Int=30;
    public static final int RULE_SL_COMMENT=42;
    public static final int Money=27;
    public static final int Comma=32;
    public static final int Relationships=10;
    public static final int Generate=14;
    public static final int RightCurlyBracket=37;
    public static final int EOF=-1;
    public static final int TotalDisjoint=8;
    public static final int Datetime=15;
    public static final int RULE_WS=43;
    public static final int LeftCurlyBracket=36;
    public static final int RULE_ANY_OTHER=44;
    public static final int Entities=13;
    public static final int Diagram=16;
    public static final int LeftParenthesisDigitOneColonDigitOneRightParenthesis=24;
    public static final int Semicolon=33;

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
    		tokenNameToValue.put("Diagram", "'Diagram'");
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
    		tokenNameToValue.put("GenerateOcurrenceDiagram", "'@generateOcurrenceDiagram'");
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
    // InternalErDslParser.g:89:1: entryRuleERModel : ruleERModel EOF ;
    public final void entryRuleERModel() throws RecognitionException {
        try {
            // InternalErDslParser.g:90:1: ( ruleERModel EOF )
            // InternalErDslParser.g:91:1: ruleERModel EOF
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
    // InternalErDslParser.g:98:1: ruleERModel : ( ( rule__ERModel__Group__0 ) ) ;
    public final void ruleERModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:102:2: ( ( ( rule__ERModel__Group__0 ) ) )
            // InternalErDslParser.g:103:2: ( ( rule__ERModel__Group__0 ) )
            {
            // InternalErDslParser.g:103:2: ( ( rule__ERModel__Group__0 ) )
            // InternalErDslParser.g:104:3: ( rule__ERModel__Group__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup()); 
            // InternalErDslParser.g:105:3: ( rule__ERModel__Group__0 )
            // InternalErDslParser.g:105:4: rule__ERModel__Group__0
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
    // InternalErDslParser.g:114:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalErDslParser.g:115:1: ( ruleDomain EOF )
            // InternalErDslParser.g:116:1: ruleDomain EOF
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
    // InternalErDslParser.g:123:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:127:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalErDslParser.g:128:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalErDslParser.g:128:2: ( ( rule__Domain__Group__0 ) )
            // InternalErDslParser.g:129:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalErDslParser.g:130:3: ( rule__Domain__Group__0 )
            // InternalErDslParser.g:130:4: rule__Domain__Group__0
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
    // InternalErDslParser.g:139:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalErDslParser.g:140:1: ( ruleAttribute EOF )
            // InternalErDslParser.g:141:1: ruleAttribute EOF
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
    // InternalErDslParser.g:148:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:152:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalErDslParser.g:153:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalErDslParser.g:153:2: ( ( rule__Attribute__Group__0 ) )
            // InternalErDslParser.g:154:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalErDslParser.g:155:3: ( rule__Attribute__Group__0 )
            // InternalErDslParser.g:155:4: rule__Attribute__Group__0
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
    // InternalErDslParser.g:164:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalErDslParser.g:165:1: ( ruleEntity EOF )
            // InternalErDslParser.g:166:1: ruleEntity EOF
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
    // InternalErDslParser.g:173:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:177:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalErDslParser.g:178:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalErDslParser.g:178:2: ( ( rule__Entity__Group__0 ) )
            // InternalErDslParser.g:179:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalErDslParser.g:180:3: ( rule__Entity__Group__0 )
            // InternalErDslParser.g:180:4: rule__Entity__Group__0
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
    // InternalErDslParser.g:189:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalErDslParser.g:190:1: ( ruleRelation EOF )
            // InternalErDslParser.g:191:1: ruleRelation EOF
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
    // InternalErDslParser.g:198:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:202:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalErDslParser.g:203:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalErDslParser.g:203:2: ( ( rule__Relation__Group__0 ) )
            // InternalErDslParser.g:204:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalErDslParser.g:205:3: ( rule__Relation__Group__0 )
            // InternalErDslParser.g:205:4: rule__Relation__Group__0
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
    // InternalErDslParser.g:214:1: entryRuleRelationSideRight : ruleRelationSideRight EOF ;
    public final void entryRuleRelationSideRight() throws RecognitionException {
        try {
            // InternalErDslParser.g:215:1: ( ruleRelationSideRight EOF )
            // InternalErDslParser.g:216:1: ruleRelationSideRight EOF
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
    // InternalErDslParser.g:223:1: ruleRelationSideRight : ( ( rule__RelationSideRight__Alternatives ) ) ;
    public final void ruleRelationSideRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:227:2: ( ( ( rule__RelationSideRight__Alternatives ) ) )
            // InternalErDslParser.g:228:2: ( ( rule__RelationSideRight__Alternatives ) )
            {
            // InternalErDslParser.g:228:2: ( ( rule__RelationSideRight__Alternatives ) )
            // InternalErDslParser.g:229:3: ( rule__RelationSideRight__Alternatives )
            {
             before(grammarAccess.getRelationSideRightAccess().getAlternatives()); 
            // InternalErDslParser.g:230:3: ( rule__RelationSideRight__Alternatives )
            // InternalErDslParser.g:230:4: rule__RelationSideRight__Alternatives
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
    // InternalErDslParser.g:239:1: entryRuleRelationSideLeft : ruleRelationSideLeft EOF ;
    public final void entryRuleRelationSideLeft() throws RecognitionException {
        try {
            // InternalErDslParser.g:240:1: ( ruleRelationSideLeft EOF )
            // InternalErDslParser.g:241:1: ruleRelationSideLeft EOF
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
    // InternalErDslParser.g:248:1: ruleRelationSideLeft : ( ( rule__RelationSideLeft__Alternatives ) ) ;
    public final void ruleRelationSideLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:252:2: ( ( ( rule__RelationSideLeft__Alternatives ) ) )
            // InternalErDslParser.g:253:2: ( ( rule__RelationSideLeft__Alternatives ) )
            {
            // InternalErDslParser.g:253:2: ( ( rule__RelationSideLeft__Alternatives ) )
            // InternalErDslParser.g:254:3: ( rule__RelationSideLeft__Alternatives )
            {
             before(grammarAccess.getRelationSideLeftAccess().getAlternatives()); 
            // InternalErDslParser.g:255:3: ( rule__RelationSideLeft__Alternatives )
            // InternalErDslParser.g:255:4: rule__RelationSideLeft__Alternatives
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
    // InternalErDslParser.g:264:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:268:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalErDslParser.g:269:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalErDslParser.g:269:2: ( ( rule__DataType__Alternatives ) )
            // InternalErDslParser.g:270:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalErDslParser.g:271:3: ( rule__DataType__Alternatives )
            // InternalErDslParser.g:271:4: rule__DataType__Alternatives
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
    // InternalErDslParser.g:279:1: rule__ERModel__TargetGeneratorAlternatives_0_1_0 : ( ( LogicalSchema ) | ( PostgreSQL ) | ( MySQL ) | ( Diagram ) | ( All ) );
    public final void rule__ERModel__TargetGeneratorAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:283:1: ( ( LogicalSchema ) | ( PostgreSQL ) | ( MySQL ) | ( Diagram ) | ( All ) )
            int alt1=5;
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
            case Diagram:
                {
                alt1=4;
                }
                break;
            case All:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalErDslParser.g:284:2: ( LogicalSchema )
                    {
                    // InternalErDslParser.g:284:2: ( LogicalSchema )
                    // InternalErDslParser.g:285:3: LogicalSchema
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorLogicalSchemaKeyword_0_1_0_0()); 
                    match(input,LogicalSchema,FOLLOW_2); 
                     after(grammarAccess.getERModelAccess().getTargetGeneratorLogicalSchemaKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:290:2: ( PostgreSQL )
                    {
                    // InternalErDslParser.g:290:2: ( PostgreSQL )
                    // InternalErDslParser.g:291:3: PostgreSQL
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorPostgreSQLKeyword_0_1_0_1()); 
                    match(input,PostgreSQL,FOLLOW_2); 
                     after(grammarAccess.getERModelAccess().getTargetGeneratorPostgreSQLKeyword_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDslParser.g:296:2: ( MySQL )
                    {
                    // InternalErDslParser.g:296:2: ( MySQL )
                    // InternalErDslParser.g:297:3: MySQL
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorMySQLKeyword_0_1_0_2()); 
                    match(input,MySQL,FOLLOW_2); 
                     after(grammarAccess.getERModelAccess().getTargetGeneratorMySQLKeyword_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDslParser.g:302:2: ( Diagram )
                    {
                    // InternalErDslParser.g:302:2: ( Diagram )
                    // InternalErDslParser.g:303:3: Diagram
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorDiagramKeyword_0_1_0_3()); 
                    match(input,Diagram,FOLLOW_2); 
                     after(grammarAccess.getERModelAccess().getTargetGeneratorDiagramKeyword_0_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalErDslParser.g:308:2: ( All )
                    {
                    // InternalErDslParser.g:308:2: ( All )
                    // InternalErDslParser.g:309:3: All
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorAllKeyword_0_1_0_4()); 
                    match(input,All,FOLLOW_2); 
                     after(grammarAccess.getERModelAccess().getTargetGeneratorAllKeyword_0_1_0_4()); 

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
    // InternalErDslParser.g:318:1: rule__Entity__GeneralizationAlternatives_1_1_0 : ( ( TotalDisjoint ) | ( TotalOverlapped ) | ( PartialDisjoint ) | ( PartialOverlapped ) );
    public final void rule__Entity__GeneralizationAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:322:1: ( ( TotalDisjoint ) | ( TotalOverlapped ) | ( PartialDisjoint ) | ( PartialOverlapped ) )
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
                    // InternalErDslParser.g:323:2: ( TotalDisjoint )
                    {
                    // InternalErDslParser.g:323:2: ( TotalDisjoint )
                    // InternalErDslParser.g:324:3: TotalDisjoint
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationTotalDisjointKeyword_1_1_0_0()); 
                    match(input,TotalDisjoint,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getGeneralizationTotalDisjointKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:329:2: ( TotalOverlapped )
                    {
                    // InternalErDslParser.g:329:2: ( TotalOverlapped )
                    // InternalErDslParser.g:330:3: TotalOverlapped
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationTotalOverlappedKeyword_1_1_0_1()); 
                    match(input,TotalOverlapped,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getGeneralizationTotalOverlappedKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDslParser.g:335:2: ( PartialDisjoint )
                    {
                    // InternalErDslParser.g:335:2: ( PartialDisjoint )
                    // InternalErDslParser.g:336:3: PartialDisjoint
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationPartialDisjointKeyword_1_1_0_2()); 
                    match(input,PartialDisjoint,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getGeneralizationPartialDisjointKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDslParser.g:341:2: ( PartialOverlapped )
                    {
                    // InternalErDslParser.g:341:2: ( PartialOverlapped )
                    // InternalErDslParser.g:342:3: PartialOverlapped
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
    // InternalErDslParser.g:351:1: rule__RelationSideRight__Alternatives : ( ( ( rule__RelationSideRight__Group_0__0 ) ) | ( ( rule__RelationSideRight__TargetAssignment_1 ) ) );
    public final void rule__RelationSideRight__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:355:1: ( ( ( rule__RelationSideRight__Group_0__0 ) ) | ( ( rule__RelationSideRight__TargetAssignment_1 ) ) )
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
                    // InternalErDslParser.g:356:2: ( ( rule__RelationSideRight__Group_0__0 ) )
                    {
                    // InternalErDslParser.g:356:2: ( ( rule__RelationSideRight__Group_0__0 ) )
                    // InternalErDslParser.g:357:3: ( rule__RelationSideRight__Group_0__0 )
                    {
                     before(grammarAccess.getRelationSideRightAccess().getGroup_0()); 
                    // InternalErDslParser.g:358:3: ( rule__RelationSideRight__Group_0__0 )
                    // InternalErDslParser.g:358:4: rule__RelationSideRight__Group_0__0
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
                    // InternalErDslParser.g:362:2: ( ( rule__RelationSideRight__TargetAssignment_1 ) )
                    {
                    // InternalErDslParser.g:362:2: ( ( rule__RelationSideRight__TargetAssignment_1 ) )
                    // InternalErDslParser.g:363:3: ( rule__RelationSideRight__TargetAssignment_1 )
                    {
                     before(grammarAccess.getRelationSideRightAccess().getTargetAssignment_1()); 
                    // InternalErDslParser.g:364:3: ( rule__RelationSideRight__TargetAssignment_1 )
                    // InternalErDslParser.g:364:4: rule__RelationSideRight__TargetAssignment_1
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
    // InternalErDslParser.g:372:1: rule__RelationSideRight__CardinalityAlternatives_0_0_0 : ( ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis ) | ( LeftParenthesisDigitOneColonDigitOneRightParenthesis ) | ( N ) | ( N_1 ) );
    public final void rule__RelationSideRight__CardinalityAlternatives_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:376:1: ( ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis ) | ( LeftParenthesisDigitOneColonDigitOneRightParenthesis ) | ( N ) | ( N_1 ) )
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
                    // InternalErDslParser.g:377:2: ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis )
                    {
                    // InternalErDslParser.g:377:2: ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis )
                    // InternalErDslParser.g:378:3: LeftParenthesisDigitZeroColonDigitOneRightParenthesis
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality01Keyword_0_0_0_0()); 
                    match(input,LeftParenthesisDigitZeroColonDigitOneRightParenthesis,FOLLOW_2); 
                     after(grammarAccess.getRelationSideRightAccess().getCardinality01Keyword_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:383:2: ( LeftParenthesisDigitOneColonDigitOneRightParenthesis )
                    {
                    // InternalErDslParser.g:383:2: ( LeftParenthesisDigitOneColonDigitOneRightParenthesis )
                    // InternalErDslParser.g:384:3: LeftParenthesisDigitOneColonDigitOneRightParenthesis
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality11Keyword_0_0_0_1()); 
                    match(input,LeftParenthesisDigitOneColonDigitOneRightParenthesis,FOLLOW_2); 
                     after(grammarAccess.getRelationSideRightAccess().getCardinality11Keyword_0_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDslParser.g:389:2: ( N )
                    {
                    // InternalErDslParser.g:389:2: ( N )
                    // InternalErDslParser.g:390:3: N
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality0NKeyword_0_0_0_2()); 
                    match(input,N,FOLLOW_2); 
                     after(grammarAccess.getRelationSideRightAccess().getCardinality0NKeyword_0_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDslParser.g:395:2: ( N_1 )
                    {
                    // InternalErDslParser.g:395:2: ( N_1 )
                    // InternalErDslParser.g:396:3: N_1
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
    // InternalErDslParser.g:405:1: rule__RelationSideLeft__Alternatives : ( ( ( rule__RelationSideLeft__TargetAssignment_0 ) ) | ( ( rule__RelationSideLeft__Group_1__0 ) ) );
    public final void rule__RelationSideLeft__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:409:1: ( ( ( rule__RelationSideLeft__TargetAssignment_0 ) ) | ( ( rule__RelationSideLeft__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=LeftParenthesisDigitZeroColonDigitOneRightParenthesis && LA5_1<=N_1)) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==Relates) ) {
                    alt5=1;
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
                    // InternalErDslParser.g:410:2: ( ( rule__RelationSideLeft__TargetAssignment_0 ) )
                    {
                    // InternalErDslParser.g:410:2: ( ( rule__RelationSideLeft__TargetAssignment_0 ) )
                    // InternalErDslParser.g:411:3: ( rule__RelationSideLeft__TargetAssignment_0 )
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getTargetAssignment_0()); 
                    // InternalErDslParser.g:412:3: ( rule__RelationSideLeft__TargetAssignment_0 )
                    // InternalErDslParser.g:412:4: rule__RelationSideLeft__TargetAssignment_0
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
                    // InternalErDslParser.g:416:2: ( ( rule__RelationSideLeft__Group_1__0 ) )
                    {
                    // InternalErDslParser.g:416:2: ( ( rule__RelationSideLeft__Group_1__0 ) )
                    // InternalErDslParser.g:417:3: ( rule__RelationSideLeft__Group_1__0 )
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getGroup_1()); 
                    // InternalErDslParser.g:418:3: ( rule__RelationSideLeft__Group_1__0 )
                    // InternalErDslParser.g:418:4: rule__RelationSideLeft__Group_1__0
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
    // InternalErDslParser.g:426:1: rule__RelationSideLeft__CardinalityAlternatives_1_1_0 : ( ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis ) | ( LeftParenthesisDigitOneColonDigitOneRightParenthesis ) | ( N ) | ( N_1 ) );
    public final void rule__RelationSideLeft__CardinalityAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:430:1: ( ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis ) | ( LeftParenthesisDigitOneColonDigitOneRightParenthesis ) | ( N ) | ( N_1 ) )
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
                    // InternalErDslParser.g:431:2: ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis )
                    {
                    // InternalErDslParser.g:431:2: ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis )
                    // InternalErDslParser.g:432:3: LeftParenthesisDigitZeroColonDigitOneRightParenthesis
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality01Keyword_1_1_0_0()); 
                    match(input,LeftParenthesisDigitZeroColonDigitOneRightParenthesis,FOLLOW_2); 
                     after(grammarAccess.getRelationSideLeftAccess().getCardinality01Keyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:437:2: ( LeftParenthesisDigitOneColonDigitOneRightParenthesis )
                    {
                    // InternalErDslParser.g:437:2: ( LeftParenthesisDigitOneColonDigitOneRightParenthesis )
                    // InternalErDslParser.g:438:3: LeftParenthesisDigitOneColonDigitOneRightParenthesis
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality11Keyword_1_1_0_1()); 
                    match(input,LeftParenthesisDigitOneColonDigitOneRightParenthesis,FOLLOW_2); 
                     after(grammarAccess.getRelationSideLeftAccess().getCardinality11Keyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDslParser.g:443:2: ( N )
                    {
                    // InternalErDslParser.g:443:2: ( N )
                    // InternalErDslParser.g:444:3: N
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality0NKeyword_1_1_0_2()); 
                    match(input,N,FOLLOW_2); 
                     after(grammarAccess.getRelationSideLeftAccess().getCardinality0NKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDslParser.g:449:2: ( N_1 )
                    {
                    // InternalErDslParser.g:449:2: ( N_1 )
                    // InternalErDslParser.g:450:3: N_1
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
    // InternalErDslParser.g:459:1: rule__DataType__Alternatives : ( ( ( Int ) ) | ( ( Double ) ) | ( ( Money ) ) | ( ( String ) ) | ( ( Boolean ) ) | ( ( Datetime ) ) | ( ( File ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:463:1: ( ( ( Int ) ) | ( ( Double ) ) | ( ( Money ) ) | ( ( String ) ) | ( ( Boolean ) ) | ( ( Datetime ) ) | ( ( File ) ) )
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
                    // InternalErDslParser.g:464:2: ( ( Int ) )
                    {
                    // InternalErDslParser.g:464:2: ( ( Int ) )
                    // InternalErDslParser.g:465:3: ( Int )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalErDslParser.g:466:3: ( Int )
                    // InternalErDslParser.g:466:4: Int
                    {
                    match(input,Int,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:470:2: ( ( Double ) )
                    {
                    // InternalErDslParser.g:470:2: ( ( Double ) )
                    // InternalErDslParser.g:471:3: ( Double )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                    // InternalErDslParser.g:472:3: ( Double )
                    // InternalErDslParser.g:472:4: Double
                    {
                    match(input,Double,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDslParser.g:476:2: ( ( Money ) )
                    {
                    // InternalErDslParser.g:476:2: ( ( Money ) )
                    // InternalErDslParser.g:477:3: ( Money )
                    {
                     before(grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2()); 
                    // InternalErDslParser.g:478:3: ( Money )
                    // InternalErDslParser.g:478:4: Money
                    {
                    match(input,Money,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDslParser.g:482:2: ( ( String ) )
                    {
                    // InternalErDslParser.g:482:2: ( ( String ) )
                    // InternalErDslParser.g:483:3: ( String )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                    // InternalErDslParser.g:484:3: ( String )
                    // InternalErDslParser.g:484:4: String
                    {
                    match(input,String,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalErDslParser.g:488:2: ( ( Boolean ) )
                    {
                    // InternalErDslParser.g:488:2: ( ( Boolean ) )
                    // InternalErDslParser.g:489:3: ( Boolean )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 
                    // InternalErDslParser.g:490:3: ( Boolean )
                    // InternalErDslParser.g:490:4: Boolean
                    {
                    match(input,Boolean,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalErDslParser.g:494:2: ( ( Datetime ) )
                    {
                    // InternalErDslParser.g:494:2: ( ( Datetime ) )
                    // InternalErDslParser.g:495:3: ( Datetime )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5()); 
                    // InternalErDslParser.g:496:3: ( Datetime )
                    // InternalErDslParser.g:496:4: Datetime
                    {
                    match(input,Datetime,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalErDslParser.g:500:2: ( ( File ) )
                    {
                    // InternalErDslParser.g:500:2: ( ( File ) )
                    // InternalErDslParser.g:501:3: ( File )
                    {
                     before(grammarAccess.getDataTypeAccess().getBLOBEnumLiteralDeclaration_6()); 
                    // InternalErDslParser.g:502:3: ( File )
                    // InternalErDslParser.g:502:4: File
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
    // InternalErDslParser.g:510:1: rule__ERModel__Group__0 : rule__ERModel__Group__0__Impl rule__ERModel__Group__1 ;
    public final void rule__ERModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:514:1: ( rule__ERModel__Group__0__Impl rule__ERModel__Group__1 )
            // InternalErDslParser.g:515:2: rule__ERModel__Group__0__Impl rule__ERModel__Group__1
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
    // InternalErDslParser.g:522:1: rule__ERModel__Group__0__Impl : ( ( rule__ERModel__Group_0__0 )? ) ;
    public final void rule__ERModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:526:1: ( ( ( rule__ERModel__Group_0__0 )? ) )
            // InternalErDslParser.g:527:1: ( ( rule__ERModel__Group_0__0 )? )
            {
            // InternalErDslParser.g:527:1: ( ( rule__ERModel__Group_0__0 )? )
            // InternalErDslParser.g:528:2: ( rule__ERModel__Group_0__0 )?
            {
             before(grammarAccess.getERModelAccess().getGroup_0()); 
            // InternalErDslParser.g:529:2: ( rule__ERModel__Group_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Generate) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalErDslParser.g:529:3: rule__ERModel__Group_0__0
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
    // InternalErDslParser.g:537:1: rule__ERModel__Group__1 : rule__ERModel__Group__1__Impl rule__ERModel__Group__2 ;
    public final void rule__ERModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:541:1: ( rule__ERModel__Group__1__Impl rule__ERModel__Group__2 )
            // InternalErDslParser.g:542:2: rule__ERModel__Group__1__Impl rule__ERModel__Group__2
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
    // InternalErDslParser.g:549:1: rule__ERModel__Group__1__Impl : ( ( rule__ERModel__DomainAssignment_1 ) ) ;
    public final void rule__ERModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:553:1: ( ( ( rule__ERModel__DomainAssignment_1 ) ) )
            // InternalErDslParser.g:554:1: ( ( rule__ERModel__DomainAssignment_1 ) )
            {
            // InternalErDslParser.g:554:1: ( ( rule__ERModel__DomainAssignment_1 ) )
            // InternalErDslParser.g:555:2: ( rule__ERModel__DomainAssignment_1 )
            {
             before(grammarAccess.getERModelAccess().getDomainAssignment_1()); 
            // InternalErDslParser.g:556:2: ( rule__ERModel__DomainAssignment_1 )
            // InternalErDslParser.g:556:3: rule__ERModel__DomainAssignment_1
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
    // InternalErDslParser.g:564:1: rule__ERModel__Group__2 : rule__ERModel__Group__2__Impl rule__ERModel__Group__3 ;
    public final void rule__ERModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:568:1: ( rule__ERModel__Group__2__Impl rule__ERModel__Group__3 )
            // InternalErDslParser.g:569:2: rule__ERModel__Group__2__Impl rule__ERModel__Group__3
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
    // InternalErDslParser.g:576:1: rule__ERModel__Group__2__Impl : ( Semicolon ) ;
    public final void rule__ERModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:580:1: ( ( Semicolon ) )
            // InternalErDslParser.g:581:1: ( Semicolon )
            {
            // InternalErDslParser.g:581:1: ( Semicolon )
            // InternalErDslParser.g:582:2: Semicolon
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
    // InternalErDslParser.g:591:1: rule__ERModel__Group__3 : rule__ERModel__Group__3__Impl rule__ERModel__Group__4 ;
    public final void rule__ERModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:595:1: ( rule__ERModel__Group__3__Impl rule__ERModel__Group__4 )
            // InternalErDslParser.g:596:2: rule__ERModel__Group__3__Impl rule__ERModel__Group__4
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
    // InternalErDslParser.g:603:1: rule__ERModel__Group__3__Impl : ( ( rule__ERModel__Group_3__0 ) ) ;
    public final void rule__ERModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:607:1: ( ( ( rule__ERModel__Group_3__0 ) ) )
            // InternalErDslParser.g:608:1: ( ( rule__ERModel__Group_3__0 ) )
            {
            // InternalErDslParser.g:608:1: ( ( rule__ERModel__Group_3__0 ) )
            // InternalErDslParser.g:609:2: ( rule__ERModel__Group_3__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_3()); 
            // InternalErDslParser.g:610:2: ( rule__ERModel__Group_3__0 )
            // InternalErDslParser.g:610:3: rule__ERModel__Group_3__0
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
    // InternalErDslParser.g:618:1: rule__ERModel__Group__4 : rule__ERModel__Group__4__Impl rule__ERModel__Group__5 ;
    public final void rule__ERModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:622:1: ( rule__ERModel__Group__4__Impl rule__ERModel__Group__5 )
            // InternalErDslParser.g:623:2: rule__ERModel__Group__4__Impl rule__ERModel__Group__5
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
    // InternalErDslParser.g:630:1: rule__ERModel__Group__4__Impl : ( ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* ) ) ;
    public final void rule__ERModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:634:1: ( ( ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* ) ) )
            // InternalErDslParser.g:635:1: ( ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* ) )
            {
            // InternalErDslParser.g:635:1: ( ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* ) )
            // InternalErDslParser.g:636:2: ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* )
            {
            // InternalErDslParser.g:636:2: ( ( rule__ERModel__EntitiesAssignment_4 ) )
            // InternalErDslParser.g:637:3: ( rule__ERModel__EntitiesAssignment_4 )
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_4()); 
            // InternalErDslParser.g:638:3: ( rule__ERModel__EntitiesAssignment_4 )
            // InternalErDslParser.g:638:4: rule__ERModel__EntitiesAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__ERModel__EntitiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getEntitiesAssignment_4()); 

            }

            // InternalErDslParser.g:641:2: ( ( rule__ERModel__EntitiesAssignment_4 )* )
            // InternalErDslParser.g:642:3: ( rule__ERModel__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_4()); 
            // InternalErDslParser.g:643:3: ( rule__ERModel__EntitiesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalErDslParser.g:643:4: rule__ERModel__EntitiesAssignment_4
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
    // InternalErDslParser.g:652:1: rule__ERModel__Group__5 : rule__ERModel__Group__5__Impl rule__ERModel__Group__6 ;
    public final void rule__ERModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:656:1: ( rule__ERModel__Group__5__Impl rule__ERModel__Group__6 )
            // InternalErDslParser.g:657:2: rule__ERModel__Group__5__Impl rule__ERModel__Group__6
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
    // InternalErDslParser.g:664:1: rule__ERModel__Group__5__Impl : ( ( rule__ERModel__Group_5__0 ) ) ;
    public final void rule__ERModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:668:1: ( ( ( rule__ERModel__Group_5__0 ) ) )
            // InternalErDslParser.g:669:1: ( ( rule__ERModel__Group_5__0 ) )
            {
            // InternalErDslParser.g:669:1: ( ( rule__ERModel__Group_5__0 ) )
            // InternalErDslParser.g:670:2: ( rule__ERModel__Group_5__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_5()); 
            // InternalErDslParser.g:671:2: ( rule__ERModel__Group_5__0 )
            // InternalErDslParser.g:671:3: rule__ERModel__Group_5__0
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
    // InternalErDslParser.g:679:1: rule__ERModel__Group__6 : rule__ERModel__Group__6__Impl rule__ERModel__Group__7 ;
    public final void rule__ERModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:683:1: ( rule__ERModel__Group__6__Impl rule__ERModel__Group__7 )
            // InternalErDslParser.g:684:2: rule__ERModel__Group__6__Impl rule__ERModel__Group__7
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
    // InternalErDslParser.g:691:1: rule__ERModel__Group__6__Impl : ( ( rule__ERModel__Group_6__0 ) ) ;
    public final void rule__ERModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:695:1: ( ( ( rule__ERModel__Group_6__0 ) ) )
            // InternalErDslParser.g:696:1: ( ( rule__ERModel__Group_6__0 ) )
            {
            // InternalErDslParser.g:696:1: ( ( rule__ERModel__Group_6__0 ) )
            // InternalErDslParser.g:697:2: ( rule__ERModel__Group_6__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_6()); 
            // InternalErDslParser.g:698:2: ( rule__ERModel__Group_6__0 )
            // InternalErDslParser.g:698:3: rule__ERModel__Group_6__0
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
    // InternalErDslParser.g:706:1: rule__ERModel__Group__7 : rule__ERModel__Group__7__Impl rule__ERModel__Group__8 ;
    public final void rule__ERModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:710:1: ( rule__ERModel__Group__7__Impl rule__ERModel__Group__8 )
            // InternalErDslParser.g:711:2: rule__ERModel__Group__7__Impl rule__ERModel__Group__8
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
    // InternalErDslParser.g:718:1: rule__ERModel__Group__7__Impl : ( ( rule__ERModel__RelationsAssignment_7 )* ) ;
    public final void rule__ERModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:722:1: ( ( ( rule__ERModel__RelationsAssignment_7 )* ) )
            // InternalErDslParser.g:723:1: ( ( rule__ERModel__RelationsAssignment_7 )* )
            {
            // InternalErDslParser.g:723:1: ( ( rule__ERModel__RelationsAssignment_7 )* )
            // InternalErDslParser.g:724:2: ( rule__ERModel__RelationsAssignment_7 )*
            {
             before(grammarAccess.getERModelAccess().getRelationsAssignment_7()); 
            // InternalErDslParser.g:725:2: ( rule__ERModel__RelationsAssignment_7 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalErDslParser.g:725:3: rule__ERModel__RelationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalErDslParser.g:733:1: rule__ERModel__Group__8 : rule__ERModel__Group__8__Impl ;
    public final void rule__ERModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:737:1: ( rule__ERModel__Group__8__Impl )
            // InternalErDslParser.g:738:2: rule__ERModel__Group__8__Impl
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
    // InternalErDslParser.g:744:1: rule__ERModel__Group__8__Impl : ( ( rule__ERModel__Group_8__0 ) ) ;
    public final void rule__ERModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:748:1: ( ( ( rule__ERModel__Group_8__0 ) ) )
            // InternalErDslParser.g:749:1: ( ( rule__ERModel__Group_8__0 ) )
            {
            // InternalErDslParser.g:749:1: ( ( rule__ERModel__Group_8__0 ) )
            // InternalErDslParser.g:750:2: ( rule__ERModel__Group_8__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_8()); 
            // InternalErDslParser.g:751:2: ( rule__ERModel__Group_8__0 )
            // InternalErDslParser.g:751:3: rule__ERModel__Group_8__0
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
    // InternalErDslParser.g:760:1: rule__ERModel__Group_0__0 : rule__ERModel__Group_0__0__Impl rule__ERModel__Group_0__1 ;
    public final void rule__ERModel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:764:1: ( rule__ERModel__Group_0__0__Impl rule__ERModel__Group_0__1 )
            // InternalErDslParser.g:765:2: rule__ERModel__Group_0__0__Impl rule__ERModel__Group_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalErDslParser.g:772:1: rule__ERModel__Group_0__0__Impl : ( Generate ) ;
    public final void rule__ERModel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:776:1: ( ( Generate ) )
            // InternalErDslParser.g:777:1: ( Generate )
            {
            // InternalErDslParser.g:777:1: ( Generate )
            // InternalErDslParser.g:778:2: Generate
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
    // InternalErDslParser.g:787:1: rule__ERModel__Group_0__1 : rule__ERModel__Group_0__1__Impl rule__ERModel__Group_0__2 ;
    public final void rule__ERModel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:791:1: ( rule__ERModel__Group_0__1__Impl rule__ERModel__Group_0__2 )
            // InternalErDslParser.g:792:2: rule__ERModel__Group_0__1__Impl rule__ERModel__Group_0__2
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
    // InternalErDslParser.g:799:1: rule__ERModel__Group_0__1__Impl : ( ( rule__ERModel__TargetGeneratorAssignment_0_1 ) ) ;
    public final void rule__ERModel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:803:1: ( ( ( rule__ERModel__TargetGeneratorAssignment_0_1 ) ) )
            // InternalErDslParser.g:804:1: ( ( rule__ERModel__TargetGeneratorAssignment_0_1 ) )
            {
            // InternalErDslParser.g:804:1: ( ( rule__ERModel__TargetGeneratorAssignment_0_1 ) )
            // InternalErDslParser.g:805:2: ( rule__ERModel__TargetGeneratorAssignment_0_1 )
            {
             before(grammarAccess.getERModelAccess().getTargetGeneratorAssignment_0_1()); 
            // InternalErDslParser.g:806:2: ( rule__ERModel__TargetGeneratorAssignment_0_1 )
            // InternalErDslParser.g:806:3: rule__ERModel__TargetGeneratorAssignment_0_1
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
    // InternalErDslParser.g:814:1: rule__ERModel__Group_0__2 : rule__ERModel__Group_0__2__Impl ;
    public final void rule__ERModel__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:818:1: ( rule__ERModel__Group_0__2__Impl )
            // InternalErDslParser.g:819:2: rule__ERModel__Group_0__2__Impl
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
    // InternalErDslParser.g:825:1: rule__ERModel__Group_0__2__Impl : ( Semicolon ) ;
    public final void rule__ERModel__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:829:1: ( ( Semicolon ) )
            // InternalErDslParser.g:830:1: ( Semicolon )
            {
            // InternalErDslParser.g:830:1: ( Semicolon )
            // InternalErDslParser.g:831:2: Semicolon
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
    // InternalErDslParser.g:841:1: rule__ERModel__Group_3__0 : rule__ERModel__Group_3__0__Impl rule__ERModel__Group_3__1 ;
    public final void rule__ERModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:845:1: ( rule__ERModel__Group_3__0__Impl rule__ERModel__Group_3__1 )
            // InternalErDslParser.g:846:2: rule__ERModel__Group_3__0__Impl rule__ERModel__Group_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalErDslParser.g:853:1: rule__ERModel__Group_3__0__Impl : ( Entities ) ;
    public final void rule__ERModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:857:1: ( ( Entities ) )
            // InternalErDslParser.g:858:1: ( Entities )
            {
            // InternalErDslParser.g:858:1: ( Entities )
            // InternalErDslParser.g:859:2: Entities
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
    // InternalErDslParser.g:868:1: rule__ERModel__Group_3__1 : rule__ERModel__Group_3__1__Impl ;
    public final void rule__ERModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:872:1: ( rule__ERModel__Group_3__1__Impl )
            // InternalErDslParser.g:873:2: rule__ERModel__Group_3__1__Impl
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
    // InternalErDslParser.g:879:1: rule__ERModel__Group_3__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ERModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:883:1: ( ( LeftCurlyBracket ) )
            // InternalErDslParser.g:884:1: ( LeftCurlyBracket )
            {
            // InternalErDslParser.g:884:1: ( LeftCurlyBracket )
            // InternalErDslParser.g:885:2: LeftCurlyBracket
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
    // InternalErDslParser.g:895:1: rule__ERModel__Group_5__0 : rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1 ;
    public final void rule__ERModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:899:1: ( rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1 )
            // InternalErDslParser.g:900:2: rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1
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
    // InternalErDslParser.g:907:1: rule__ERModel__Group_5__0__Impl : ( RightCurlyBracket ) ;
    public final void rule__ERModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:911:1: ( ( RightCurlyBracket ) )
            // InternalErDslParser.g:912:1: ( RightCurlyBracket )
            {
            // InternalErDslParser.g:912:1: ( RightCurlyBracket )
            // InternalErDslParser.g:913:2: RightCurlyBracket
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
    // InternalErDslParser.g:922:1: rule__ERModel__Group_5__1 : rule__ERModel__Group_5__1__Impl ;
    public final void rule__ERModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:926:1: ( rule__ERModel__Group_5__1__Impl )
            // InternalErDslParser.g:927:2: rule__ERModel__Group_5__1__Impl
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
    // InternalErDslParser.g:933:1: rule__ERModel__Group_5__1__Impl : ( Semicolon ) ;
    public final void rule__ERModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:937:1: ( ( Semicolon ) )
            // InternalErDslParser.g:938:1: ( Semicolon )
            {
            // InternalErDslParser.g:938:1: ( Semicolon )
            // InternalErDslParser.g:939:2: Semicolon
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
    // InternalErDslParser.g:949:1: rule__ERModel__Group_6__0 : rule__ERModel__Group_6__0__Impl rule__ERModel__Group_6__1 ;
    public final void rule__ERModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:953:1: ( rule__ERModel__Group_6__0__Impl rule__ERModel__Group_6__1 )
            // InternalErDslParser.g:954:2: rule__ERModel__Group_6__0__Impl rule__ERModel__Group_6__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalErDslParser.g:961:1: rule__ERModel__Group_6__0__Impl : ( Relationships ) ;
    public final void rule__ERModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:965:1: ( ( Relationships ) )
            // InternalErDslParser.g:966:1: ( Relationships )
            {
            // InternalErDslParser.g:966:1: ( Relationships )
            // InternalErDslParser.g:967:2: Relationships
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
    // InternalErDslParser.g:976:1: rule__ERModel__Group_6__1 : rule__ERModel__Group_6__1__Impl ;
    public final void rule__ERModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:980:1: ( rule__ERModel__Group_6__1__Impl )
            // InternalErDslParser.g:981:2: rule__ERModel__Group_6__1__Impl
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
    // InternalErDslParser.g:987:1: rule__ERModel__Group_6__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ERModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:991:1: ( ( LeftCurlyBracket ) )
            // InternalErDslParser.g:992:1: ( LeftCurlyBracket )
            {
            // InternalErDslParser.g:992:1: ( LeftCurlyBracket )
            // InternalErDslParser.g:993:2: LeftCurlyBracket
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
    // InternalErDslParser.g:1003:1: rule__ERModel__Group_8__0 : rule__ERModel__Group_8__0__Impl rule__ERModel__Group_8__1 ;
    public final void rule__ERModel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1007:1: ( rule__ERModel__Group_8__0__Impl rule__ERModel__Group_8__1 )
            // InternalErDslParser.g:1008:2: rule__ERModel__Group_8__0__Impl rule__ERModel__Group_8__1
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
    // InternalErDslParser.g:1015:1: rule__ERModel__Group_8__0__Impl : ( RightCurlyBracket ) ;
    public final void rule__ERModel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1019:1: ( ( RightCurlyBracket ) )
            // InternalErDslParser.g:1020:1: ( RightCurlyBracket )
            {
            // InternalErDslParser.g:1020:1: ( RightCurlyBracket )
            // InternalErDslParser.g:1021:2: RightCurlyBracket
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
    // InternalErDslParser.g:1030:1: rule__ERModel__Group_8__1 : rule__ERModel__Group_8__1__Impl ;
    public final void rule__ERModel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1034:1: ( rule__ERModel__Group_8__1__Impl )
            // InternalErDslParser.g:1035:2: rule__ERModel__Group_8__1__Impl
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
    // InternalErDslParser.g:1041:1: rule__ERModel__Group_8__1__Impl : ( Semicolon ) ;
    public final void rule__ERModel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1045:1: ( ( Semicolon ) )
            // InternalErDslParser.g:1046:1: ( Semicolon )
            {
            // InternalErDslParser.g:1046:1: ( Semicolon )
            // InternalErDslParser.g:1047:2: Semicolon
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
    // InternalErDslParser.g:1057:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1061:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalErDslParser.g:1062:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalErDslParser.g:1069:1: rule__Domain__Group__0__Impl : ( Domain ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1073:1: ( ( Domain ) )
            // InternalErDslParser.g:1074:1: ( Domain )
            {
            // InternalErDslParser.g:1074:1: ( Domain )
            // InternalErDslParser.g:1075:2: Domain
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
    // InternalErDslParser.g:1084:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1088:1: ( rule__Domain__Group__1__Impl )
            // InternalErDslParser.g:1089:2: rule__Domain__Group__1__Impl
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
    // InternalErDslParser.g:1095:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1099:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalErDslParser.g:1100:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalErDslParser.g:1100:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalErDslParser.g:1101:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalErDslParser.g:1102:2: ( rule__Domain__NameAssignment_1 )
            // InternalErDslParser.g:1102:3: rule__Domain__NameAssignment_1
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
    // InternalErDslParser.g:1111:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1115:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalErDslParser.g:1116:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalErDslParser.g:1123:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1127:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalErDslParser.g:1128:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalErDslParser.g:1128:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalErDslParser.g:1129:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalErDslParser.g:1130:2: ( rule__Attribute__NameAssignment_0 )
            // InternalErDslParser.g:1130:3: rule__Attribute__NameAssignment_0
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
    // InternalErDslParser.g:1138:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1142:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalErDslParser.g:1143:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalErDslParser.g:1150:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__TypeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1154:1: ( ( ( rule__Attribute__TypeAssignment_1 ) ) )
            // InternalErDslParser.g:1155:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            {
            // InternalErDslParser.g:1155:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            // InternalErDslParser.g:1156:2: ( rule__Attribute__TypeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 
            // InternalErDslParser.g:1157:2: ( rule__Attribute__TypeAssignment_1 )
            // InternalErDslParser.g:1157:3: rule__Attribute__TypeAssignment_1
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
    // InternalErDslParser.g:1165:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1169:1: ( rule__Attribute__Group__2__Impl )
            // InternalErDslParser.g:1170:2: rule__Attribute__Group__2__Impl
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
    // InternalErDslParser.g:1176:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__IsKeyAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1180:1: ( ( ( rule__Attribute__IsKeyAssignment_2 )? ) )
            // InternalErDslParser.g:1181:1: ( ( rule__Attribute__IsKeyAssignment_2 )? )
            {
            // InternalErDslParser.g:1181:1: ( ( rule__Attribute__IsKeyAssignment_2 )? )
            // InternalErDslParser.g:1182:2: ( rule__Attribute__IsKeyAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getIsKeyAssignment_2()); 
            // InternalErDslParser.g:1183:2: ( rule__Attribute__IsKeyAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IsIdentifier) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalErDslParser.g:1183:3: rule__Attribute__IsKeyAssignment_2
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
    // InternalErDslParser.g:1192:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1196:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalErDslParser.g:1197:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalErDslParser.g:1204:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1208:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // InternalErDslParser.g:1209:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // InternalErDslParser.g:1209:1: ( ( rule__Entity__NameAssignment_0 ) )
            // InternalErDslParser.g:1210:2: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // InternalErDslParser.g:1211:2: ( rule__Entity__NameAssignment_0 )
            // InternalErDslParser.g:1211:3: rule__Entity__NameAssignment_0
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
    // InternalErDslParser.g:1219:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1223:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalErDslParser.g:1224:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalErDslParser.g:1231:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__Group_1__0 )? ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1235:1: ( ( ( rule__Entity__Group_1__0 )? ) )
            // InternalErDslParser.g:1236:1: ( ( rule__Entity__Group_1__0 )? )
            {
            // InternalErDslParser.g:1236:1: ( ( rule__Entity__Group_1__0 )? )
            // InternalErDslParser.g:1237:2: ( rule__Entity__Group_1__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_1()); 
            // InternalErDslParser.g:1238:2: ( rule__Entity__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Is) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalErDslParser.g:1238:3: rule__Entity__Group_1__0
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
    // InternalErDslParser.g:1246:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1250:1: ( rule__Entity__Group__2__Impl )
            // InternalErDslParser.g:1251:2: rule__Entity__Group__2__Impl
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
    // InternalErDslParser.g:1257:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1261:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalErDslParser.g:1262:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalErDslParser.g:1262:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalErDslParser.g:1263:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalErDslParser.g:1264:2: ( rule__Entity__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LeftCurlyBracket) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalErDslParser.g:1264:3: rule__Entity__Group_2__0
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
    // InternalErDslParser.g:1273:1: rule__Entity__Group_1__0 : rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 ;
    public final void rule__Entity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1277:1: ( rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 )
            // InternalErDslParser.g:1278:2: rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalErDslParser.g:1285:1: rule__Entity__Group_1__0__Impl : ( Is ) ;
    public final void rule__Entity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1289:1: ( ( Is ) )
            // InternalErDslParser.g:1290:1: ( Is )
            {
            // InternalErDslParser.g:1290:1: ( Is )
            // InternalErDslParser.g:1291:2: Is
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
    // InternalErDslParser.g:1300:1: rule__Entity__Group_1__1 : rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2 ;
    public final void rule__Entity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1304:1: ( rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2 )
            // InternalErDslParser.g:1305:2: rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2
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
    // InternalErDslParser.g:1312:1: rule__Entity__Group_1__1__Impl : ( ( rule__Entity__GeneralizationAssignment_1_1 ) ) ;
    public final void rule__Entity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1316:1: ( ( ( rule__Entity__GeneralizationAssignment_1_1 ) ) )
            // InternalErDslParser.g:1317:1: ( ( rule__Entity__GeneralizationAssignment_1_1 ) )
            {
            // InternalErDslParser.g:1317:1: ( ( rule__Entity__GeneralizationAssignment_1_1 ) )
            // InternalErDslParser.g:1318:2: ( rule__Entity__GeneralizationAssignment_1_1 )
            {
             before(grammarAccess.getEntityAccess().getGeneralizationAssignment_1_1()); 
            // InternalErDslParser.g:1319:2: ( rule__Entity__GeneralizationAssignment_1_1 )
            // InternalErDslParser.g:1319:3: rule__Entity__GeneralizationAssignment_1_1
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
    // InternalErDslParser.g:1327:1: rule__Entity__Group_1__2 : rule__Entity__Group_1__2__Impl ;
    public final void rule__Entity__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1331:1: ( rule__Entity__Group_1__2__Impl )
            // InternalErDslParser.g:1332:2: rule__Entity__Group_1__2__Impl
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
    // InternalErDslParser.g:1338:1: rule__Entity__Group_1__2__Impl : ( ( rule__Entity__IsAssignment_1_2 ) ) ;
    public final void rule__Entity__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1342:1: ( ( ( rule__Entity__IsAssignment_1_2 ) ) )
            // InternalErDslParser.g:1343:1: ( ( rule__Entity__IsAssignment_1_2 ) )
            {
            // InternalErDslParser.g:1343:1: ( ( rule__Entity__IsAssignment_1_2 ) )
            // InternalErDslParser.g:1344:2: ( rule__Entity__IsAssignment_1_2 )
            {
             before(grammarAccess.getEntityAccess().getIsAssignment_1_2()); 
            // InternalErDslParser.g:1345:2: ( rule__Entity__IsAssignment_1_2 )
            // InternalErDslParser.g:1345:3: rule__Entity__IsAssignment_1_2
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
    // InternalErDslParser.g:1354:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1358:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalErDslParser.g:1359:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
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
    // InternalErDslParser.g:1366:1: rule__Entity__Group_2__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1370:1: ( ( LeftCurlyBracket ) )
            // InternalErDslParser.g:1371:1: ( LeftCurlyBracket )
            {
            // InternalErDslParser.g:1371:1: ( LeftCurlyBracket )
            // InternalErDslParser.g:1372:2: LeftCurlyBracket
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
    // InternalErDslParser.g:1381:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1385:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // InternalErDslParser.g:1386:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalErDslParser.g:1393:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1397:1: ( ( ( rule__Entity__AttributesAssignment_2_1 ) ) )
            // InternalErDslParser.g:1398:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            {
            // InternalErDslParser.g:1398:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            // InternalErDslParser.g:1399:2: ( rule__Entity__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_1()); 
            // InternalErDslParser.g:1400:2: ( rule__Entity__AttributesAssignment_2_1 )
            // InternalErDslParser.g:1400:3: rule__Entity__AttributesAssignment_2_1
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
    // InternalErDslParser.g:1408:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1412:1: ( rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 )
            // InternalErDslParser.g:1413:2: rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalErDslParser.g:1420:1: rule__Entity__Group_2__2__Impl : ( ( rule__Entity__Group_2_2__0 )* ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1424:1: ( ( ( rule__Entity__Group_2_2__0 )* ) )
            // InternalErDslParser.g:1425:1: ( ( rule__Entity__Group_2_2__0 )* )
            {
            // InternalErDslParser.g:1425:1: ( ( rule__Entity__Group_2_2__0 )* )
            // InternalErDslParser.g:1426:2: ( rule__Entity__Group_2_2__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_2_2()); 
            // InternalErDslParser.g:1427:2: ( rule__Entity__Group_2_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalErDslParser.g:1427:3: rule__Entity__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalErDslParser.g:1435:1: rule__Entity__Group_2__3 : rule__Entity__Group_2__3__Impl ;
    public final void rule__Entity__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1439:1: ( rule__Entity__Group_2__3__Impl )
            // InternalErDslParser.g:1440:2: rule__Entity__Group_2__3__Impl
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
    // InternalErDslParser.g:1446:1: rule__Entity__Group_2__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Entity__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1450:1: ( ( RightCurlyBracket ) )
            // InternalErDslParser.g:1451:1: ( RightCurlyBracket )
            {
            // InternalErDslParser.g:1451:1: ( RightCurlyBracket )
            // InternalErDslParser.g:1452:2: RightCurlyBracket
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
    // InternalErDslParser.g:1462:1: rule__Entity__Group_2_2__0 : rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 ;
    public final void rule__Entity__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1466:1: ( rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 )
            // InternalErDslParser.g:1467:2: rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1
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
    // InternalErDslParser.g:1474:1: rule__Entity__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__Entity__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1478:1: ( ( Comma ) )
            // InternalErDslParser.g:1479:1: ( Comma )
            {
            // InternalErDslParser.g:1479:1: ( Comma )
            // InternalErDslParser.g:1480:2: Comma
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
    // InternalErDslParser.g:1489:1: rule__Entity__Group_2_2__1 : rule__Entity__Group_2_2__1__Impl ;
    public final void rule__Entity__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1493:1: ( rule__Entity__Group_2_2__1__Impl )
            // InternalErDslParser.g:1494:2: rule__Entity__Group_2_2__1__Impl
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
    // InternalErDslParser.g:1500:1: rule__Entity__Group_2_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Entity__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1504:1: ( ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) )
            // InternalErDslParser.g:1505:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDslParser.g:1505:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            // InternalErDslParser.g:1506:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDslParser.g:1507:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            // InternalErDslParser.g:1507:3: rule__Entity__AttributesAssignment_2_2_1
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
    // InternalErDslParser.g:1516:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1520:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalErDslParser.g:1521:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalErDslParser.g:1528:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__NameAssignment_0 ) ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1532:1: ( ( ( rule__Relation__NameAssignment_0 ) ) )
            // InternalErDslParser.g:1533:1: ( ( rule__Relation__NameAssignment_0 ) )
            {
            // InternalErDslParser.g:1533:1: ( ( rule__Relation__NameAssignment_0 ) )
            // InternalErDslParser.g:1534:2: ( rule__Relation__NameAssignment_0 )
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_0()); 
            // InternalErDslParser.g:1535:2: ( rule__Relation__NameAssignment_0 )
            // InternalErDslParser.g:1535:3: rule__Relation__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__NameAssignment_0();

            state._fsp--;


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
    // InternalErDslParser.g:1543:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1547:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalErDslParser.g:1548:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalErDslParser.g:1555:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__Group_1__0 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1559:1: ( ( ( rule__Relation__Group_1__0 ) ) )
            // InternalErDslParser.g:1560:1: ( ( rule__Relation__Group_1__0 ) )
            {
            // InternalErDslParser.g:1560:1: ( ( rule__Relation__Group_1__0 ) )
            // InternalErDslParser.g:1561:2: ( rule__Relation__Group_1__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_1()); 
            // InternalErDslParser.g:1562:2: ( rule__Relation__Group_1__0 )
            // InternalErDslParser.g:1562:3: rule__Relation__Group_1__0
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
    // InternalErDslParser.g:1570:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1574:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalErDslParser.g:1575:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

            state._fsp--;


            }

        }
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
    // InternalErDslParser.g:1582:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__Group_2__0 )* ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1586:1: ( ( ( rule__Relation__Group_2__0 )* ) )
            // InternalErDslParser.g:1587:1: ( ( rule__Relation__Group_2__0 )* )
            {
            // InternalErDslParser.g:1587:1: ( ( rule__Relation__Group_2__0 )* )
            // InternalErDslParser.g:1588:2: ( rule__Relation__Group_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2()); 
            // InternalErDslParser.g:1589:2: ( rule__Relation__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==LeftCurlyBracket) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalErDslParser.g:1589:3: rule__Relation__Group_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Relation__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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


    // $ANTLR start "rule__Relation__Group__3"
    // InternalErDslParser.g:1597:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1601:1: ( rule__Relation__Group__3__Impl )
            // InternalErDslParser.g:1602:2: rule__Relation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalErDslParser.g:1608:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__OcurrenceAssignment_3 )? ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1612:1: ( ( ( rule__Relation__OcurrenceAssignment_3 )? ) )
            // InternalErDslParser.g:1613:1: ( ( rule__Relation__OcurrenceAssignment_3 )? )
            {
            // InternalErDslParser.g:1613:1: ( ( rule__Relation__OcurrenceAssignment_3 )? )
            // InternalErDslParser.g:1614:2: ( rule__Relation__OcurrenceAssignment_3 )?
            {
             before(grammarAccess.getRelationAccess().getOcurrenceAssignment_3()); 
            // InternalErDslParser.g:1615:2: ( rule__Relation__OcurrenceAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==GenerateOcurrenceDiagram) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalErDslParser.g:1615:3: rule__Relation__OcurrenceAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__OcurrenceAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getOcurrenceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group_1__0"
    // InternalErDslParser.g:1624:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1628:1: ( rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 )
            // InternalErDslParser.g:1629:2: rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1
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
    // InternalErDslParser.g:1636:1: rule__Relation__Group_1__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1640:1: ( ( LeftSquareBracket ) )
            // InternalErDslParser.g:1641:1: ( LeftSquareBracket )
            {
            // InternalErDslParser.g:1641:1: ( LeftSquareBracket )
            // InternalErDslParser.g:1642:2: LeftSquareBracket
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
    // InternalErDslParser.g:1651:1: rule__Relation__Group_1__1 : rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 ;
    public final void rule__Relation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1655:1: ( rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 )
            // InternalErDslParser.g:1656:2: rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2
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
    // InternalErDslParser.g:1663:1: rule__Relation__Group_1__1__Impl : ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) ;
    public final void rule__Relation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1667:1: ( ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) )
            // InternalErDslParser.g:1668:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            {
            // InternalErDslParser.g:1668:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            // InternalErDslParser.g:1669:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            {
             before(grammarAccess.getRelationAccess().getLeftEndingAssignment_1_1()); 
            // InternalErDslParser.g:1670:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            // InternalErDslParser.g:1670:3: rule__Relation__LeftEndingAssignment_1_1
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
    // InternalErDslParser.g:1678:1: rule__Relation__Group_1__2 : rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 ;
    public final void rule__Relation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1682:1: ( rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 )
            // InternalErDslParser.g:1683:2: rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3
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
    // InternalErDslParser.g:1690:1: rule__Relation__Group_1__2__Impl : ( Relates ) ;
    public final void rule__Relation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1694:1: ( ( Relates ) )
            // InternalErDslParser.g:1695:1: ( Relates )
            {
            // InternalErDslParser.g:1695:1: ( Relates )
            // InternalErDslParser.g:1696:2: Relates
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
    // InternalErDslParser.g:1705:1: rule__Relation__Group_1__3 : rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 ;
    public final void rule__Relation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1709:1: ( rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 )
            // InternalErDslParser.g:1710:2: rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4
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
    // InternalErDslParser.g:1717:1: rule__Relation__Group_1__3__Impl : ( ( rule__Relation__RightEndingAssignment_1_3 ) ) ;
    public final void rule__Relation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1721:1: ( ( ( rule__Relation__RightEndingAssignment_1_3 ) ) )
            // InternalErDslParser.g:1722:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            {
            // InternalErDslParser.g:1722:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            // InternalErDslParser.g:1723:2: ( rule__Relation__RightEndingAssignment_1_3 )
            {
             before(grammarAccess.getRelationAccess().getRightEndingAssignment_1_3()); 
            // InternalErDslParser.g:1724:2: ( rule__Relation__RightEndingAssignment_1_3 )
            // InternalErDslParser.g:1724:3: rule__Relation__RightEndingAssignment_1_3
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
    // InternalErDslParser.g:1732:1: rule__Relation__Group_1__4 : rule__Relation__Group_1__4__Impl ;
    public final void rule__Relation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1736:1: ( rule__Relation__Group_1__4__Impl )
            // InternalErDslParser.g:1737:2: rule__Relation__Group_1__4__Impl
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
    // InternalErDslParser.g:1743:1: rule__Relation__Group_1__4__Impl : ( RightSquareBracket ) ;
    public final void rule__Relation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1747:1: ( ( RightSquareBracket ) )
            // InternalErDslParser.g:1748:1: ( RightSquareBracket )
            {
            // InternalErDslParser.g:1748:1: ( RightSquareBracket )
            // InternalErDslParser.g:1749:2: RightSquareBracket
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
    // InternalErDslParser.g:1759:1: rule__Relation__Group_2__0 : rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 ;
    public final void rule__Relation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1763:1: ( rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 )
            // InternalErDslParser.g:1764:2: rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1
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
    // InternalErDslParser.g:1771:1: rule__Relation__Group_2__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Relation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1775:1: ( ( LeftCurlyBracket ) )
            // InternalErDslParser.g:1776:1: ( LeftCurlyBracket )
            {
            // InternalErDslParser.g:1776:1: ( LeftCurlyBracket )
            // InternalErDslParser.g:1777:2: LeftCurlyBracket
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
    // InternalErDslParser.g:1786:1: rule__Relation__Group_2__1 : rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 ;
    public final void rule__Relation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1790:1: ( rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 )
            // InternalErDslParser.g:1791:2: rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalErDslParser.g:1798:1: rule__Relation__Group_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_1 ) ) ;
    public final void rule__Relation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1802:1: ( ( ( rule__Relation__AttributesAssignment_2_1 ) ) )
            // InternalErDslParser.g:1803:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            {
            // InternalErDslParser.g:1803:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            // InternalErDslParser.g:1804:2: ( rule__Relation__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_1()); 
            // InternalErDslParser.g:1805:2: ( rule__Relation__AttributesAssignment_2_1 )
            // InternalErDslParser.g:1805:3: rule__Relation__AttributesAssignment_2_1
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
    // InternalErDslParser.g:1813:1: rule__Relation__Group_2__2 : rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 ;
    public final void rule__Relation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1817:1: ( rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 )
            // InternalErDslParser.g:1818:2: rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalErDslParser.g:1825:1: rule__Relation__Group_2__2__Impl : ( ( rule__Relation__Group_2_2__0 )* ) ;
    public final void rule__Relation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1829:1: ( ( ( rule__Relation__Group_2_2__0 )* ) )
            // InternalErDslParser.g:1830:1: ( ( rule__Relation__Group_2_2__0 )* )
            {
            // InternalErDslParser.g:1830:1: ( ( rule__Relation__Group_2_2__0 )* )
            // InternalErDslParser.g:1831:2: ( rule__Relation__Group_2_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2_2()); 
            // InternalErDslParser.g:1832:2: ( rule__Relation__Group_2_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Comma) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalErDslParser.g:1832:3: rule__Relation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalErDslParser.g:1840:1: rule__Relation__Group_2__3 : rule__Relation__Group_2__3__Impl ;
    public final void rule__Relation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1844:1: ( rule__Relation__Group_2__3__Impl )
            // InternalErDslParser.g:1845:2: rule__Relation__Group_2__3__Impl
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
    // InternalErDslParser.g:1851:1: rule__Relation__Group_2__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Relation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1855:1: ( ( RightCurlyBracket ) )
            // InternalErDslParser.g:1856:1: ( RightCurlyBracket )
            {
            // InternalErDslParser.g:1856:1: ( RightCurlyBracket )
            // InternalErDslParser.g:1857:2: RightCurlyBracket
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
    // InternalErDslParser.g:1867:1: rule__Relation__Group_2_2__0 : rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 ;
    public final void rule__Relation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1871:1: ( rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 )
            // InternalErDslParser.g:1872:2: rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1
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
    // InternalErDslParser.g:1879:1: rule__Relation__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__Relation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1883:1: ( ( Comma ) )
            // InternalErDslParser.g:1884:1: ( Comma )
            {
            // InternalErDslParser.g:1884:1: ( Comma )
            // InternalErDslParser.g:1885:2: Comma
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
    // InternalErDslParser.g:1894:1: rule__Relation__Group_2_2__1 : rule__Relation__Group_2_2__1__Impl ;
    public final void rule__Relation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1898:1: ( rule__Relation__Group_2_2__1__Impl )
            // InternalErDslParser.g:1899:2: rule__Relation__Group_2_2__1__Impl
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
    // InternalErDslParser.g:1905:1: rule__Relation__Group_2_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Relation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1909:1: ( ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) )
            // InternalErDslParser.g:1910:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDslParser.g:1910:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            // InternalErDslParser.g:1911:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDslParser.g:1912:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            // InternalErDslParser.g:1912:3: rule__Relation__AttributesAssignment_2_2_1
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
    // InternalErDslParser.g:1921:1: rule__RelationSideRight__Group_0__0 : rule__RelationSideRight__Group_0__0__Impl rule__RelationSideRight__Group_0__1 ;
    public final void rule__RelationSideRight__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1925:1: ( rule__RelationSideRight__Group_0__0__Impl rule__RelationSideRight__Group_0__1 )
            // InternalErDslParser.g:1926:2: rule__RelationSideRight__Group_0__0__Impl rule__RelationSideRight__Group_0__1
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
    // InternalErDslParser.g:1933:1: rule__RelationSideRight__Group_0__0__Impl : ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) ) ;
    public final void rule__RelationSideRight__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1937:1: ( ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) ) )
            // InternalErDslParser.g:1938:1: ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) )
            {
            // InternalErDslParser.g:1938:1: ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) )
            // InternalErDslParser.g:1939:2: ( rule__RelationSideRight__CardinalityAssignment_0_0 )
            {
             before(grammarAccess.getRelationSideRightAccess().getCardinalityAssignment_0_0()); 
            // InternalErDslParser.g:1940:2: ( rule__RelationSideRight__CardinalityAssignment_0_0 )
            // InternalErDslParser.g:1940:3: rule__RelationSideRight__CardinalityAssignment_0_0
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
    // InternalErDslParser.g:1948:1: rule__RelationSideRight__Group_0__1 : rule__RelationSideRight__Group_0__1__Impl ;
    public final void rule__RelationSideRight__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1952:1: ( rule__RelationSideRight__Group_0__1__Impl )
            // InternalErDslParser.g:1953:2: rule__RelationSideRight__Group_0__1__Impl
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
    // InternalErDslParser.g:1959:1: rule__RelationSideRight__Group_0__1__Impl : ( ( rule__RelationSideRight__TargetAssignment_0_1 ) ) ;
    public final void rule__RelationSideRight__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1963:1: ( ( ( rule__RelationSideRight__TargetAssignment_0_1 ) ) )
            // InternalErDslParser.g:1964:1: ( ( rule__RelationSideRight__TargetAssignment_0_1 ) )
            {
            // InternalErDslParser.g:1964:1: ( ( rule__RelationSideRight__TargetAssignment_0_1 ) )
            // InternalErDslParser.g:1965:2: ( rule__RelationSideRight__TargetAssignment_0_1 )
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetAssignment_0_1()); 
            // InternalErDslParser.g:1966:2: ( rule__RelationSideRight__TargetAssignment_0_1 )
            // InternalErDslParser.g:1966:3: rule__RelationSideRight__TargetAssignment_0_1
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
    // InternalErDslParser.g:1975:1: rule__RelationSideLeft__Group_1__0 : rule__RelationSideLeft__Group_1__0__Impl rule__RelationSideLeft__Group_1__1 ;
    public final void rule__RelationSideLeft__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1979:1: ( rule__RelationSideLeft__Group_1__0__Impl rule__RelationSideLeft__Group_1__1 )
            // InternalErDslParser.g:1980:2: rule__RelationSideLeft__Group_1__0__Impl rule__RelationSideLeft__Group_1__1
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
    // InternalErDslParser.g:1987:1: rule__RelationSideLeft__Group_1__0__Impl : ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) ) ;
    public final void rule__RelationSideLeft__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1991:1: ( ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) ) )
            // InternalErDslParser.g:1992:1: ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) )
            {
            // InternalErDslParser.g:1992:1: ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) )
            // InternalErDslParser.g:1993:2: ( rule__RelationSideLeft__TargetAssignment_1_0 )
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetAssignment_1_0()); 
            // InternalErDslParser.g:1994:2: ( rule__RelationSideLeft__TargetAssignment_1_0 )
            // InternalErDslParser.g:1994:3: rule__RelationSideLeft__TargetAssignment_1_0
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
    // InternalErDslParser.g:2002:1: rule__RelationSideLeft__Group_1__1 : rule__RelationSideLeft__Group_1__1__Impl ;
    public final void rule__RelationSideLeft__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2006:1: ( rule__RelationSideLeft__Group_1__1__Impl )
            // InternalErDslParser.g:2007:2: rule__RelationSideLeft__Group_1__1__Impl
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
    // InternalErDslParser.g:2013:1: rule__RelationSideLeft__Group_1__1__Impl : ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) ) ;
    public final void rule__RelationSideLeft__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2017:1: ( ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) ) )
            // InternalErDslParser.g:2018:1: ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) )
            {
            // InternalErDslParser.g:2018:1: ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) )
            // InternalErDslParser.g:2019:2: ( rule__RelationSideLeft__CardinalityAssignment_1_1 )
            {
             before(grammarAccess.getRelationSideLeftAccess().getCardinalityAssignment_1_1()); 
            // InternalErDslParser.g:2020:2: ( rule__RelationSideLeft__CardinalityAssignment_1_1 )
            // InternalErDslParser.g:2020:3: rule__RelationSideLeft__CardinalityAssignment_1_1
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
    // InternalErDslParser.g:2029:1: rule__ERModel__TargetGeneratorAssignment_0_1 : ( ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 ) ) ;
    public final void rule__ERModel__TargetGeneratorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2033:1: ( ( ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 ) ) )
            // InternalErDslParser.g:2034:2: ( ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 ) )
            {
            // InternalErDslParser.g:2034:2: ( ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 ) )
            // InternalErDslParser.g:2035:3: ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 )
            {
             before(grammarAccess.getERModelAccess().getTargetGeneratorAlternatives_0_1_0()); 
            // InternalErDslParser.g:2036:3: ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 )
            // InternalErDslParser.g:2036:4: rule__ERModel__TargetGeneratorAlternatives_0_1_0
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
    // InternalErDslParser.g:2044:1: rule__ERModel__DomainAssignment_1 : ( ruleDomain ) ;
    public final void rule__ERModel__DomainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2048:1: ( ( ruleDomain ) )
            // InternalErDslParser.g:2049:2: ( ruleDomain )
            {
            // InternalErDslParser.g:2049:2: ( ruleDomain )
            // InternalErDslParser.g:2050:3: ruleDomain
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
    // InternalErDslParser.g:2059:1: rule__ERModel__EntitiesAssignment_4 : ( ruleEntity ) ;
    public final void rule__ERModel__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2063:1: ( ( ruleEntity ) )
            // InternalErDslParser.g:2064:2: ( ruleEntity )
            {
            // InternalErDslParser.g:2064:2: ( ruleEntity )
            // InternalErDslParser.g:2065:3: ruleEntity
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
    // InternalErDslParser.g:2074:1: rule__ERModel__RelationsAssignment_7 : ( ruleRelation ) ;
    public final void rule__ERModel__RelationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2078:1: ( ( ruleRelation ) )
            // InternalErDslParser.g:2079:2: ( ruleRelation )
            {
            // InternalErDslParser.g:2079:2: ( ruleRelation )
            // InternalErDslParser.g:2080:3: ruleRelation
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
    // InternalErDslParser.g:2089:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2093:1: ( ( RULE_ID ) )
            // InternalErDslParser.g:2094:2: ( RULE_ID )
            {
            // InternalErDslParser.g:2094:2: ( RULE_ID )
            // InternalErDslParser.g:2095:3: RULE_ID
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
    // InternalErDslParser.g:2104:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2108:1: ( ( RULE_ID ) )
            // InternalErDslParser.g:2109:2: ( RULE_ID )
            {
            // InternalErDslParser.g:2109:2: ( RULE_ID )
            // InternalErDslParser.g:2110:3: RULE_ID
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
    // InternalErDslParser.g:2119:1: rule__Attribute__TypeAssignment_1 : ( ruleDataType ) ;
    public final void rule__Attribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2123:1: ( ( ruleDataType ) )
            // InternalErDslParser.g:2124:2: ( ruleDataType )
            {
            // InternalErDslParser.g:2124:2: ( ruleDataType )
            // InternalErDslParser.g:2125:3: ruleDataType
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
    // InternalErDslParser.g:2134:1: rule__Attribute__IsKeyAssignment_2 : ( ( IsIdentifier ) ) ;
    public final void rule__Attribute__IsKeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2138:1: ( ( ( IsIdentifier ) ) )
            // InternalErDslParser.g:2139:2: ( ( IsIdentifier ) )
            {
            // InternalErDslParser.g:2139:2: ( ( IsIdentifier ) )
            // InternalErDslParser.g:2140:3: ( IsIdentifier )
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_2_0()); 
            // InternalErDslParser.g:2141:3: ( IsIdentifier )
            // InternalErDslParser.g:2142:4: IsIdentifier
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
    // InternalErDslParser.g:2153:1: rule__Entity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2157:1: ( ( RULE_ID ) )
            // InternalErDslParser.g:2158:2: ( RULE_ID )
            {
            // InternalErDslParser.g:2158:2: ( RULE_ID )
            // InternalErDslParser.g:2159:3: RULE_ID
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
    // InternalErDslParser.g:2168:1: rule__Entity__GeneralizationAssignment_1_1 : ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) ) ;
    public final void rule__Entity__GeneralizationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2172:1: ( ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) ) )
            // InternalErDslParser.g:2173:2: ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) )
            {
            // InternalErDslParser.g:2173:2: ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) )
            // InternalErDslParser.g:2174:3: ( rule__Entity__GeneralizationAlternatives_1_1_0 )
            {
             before(grammarAccess.getEntityAccess().getGeneralizationAlternatives_1_1_0()); 
            // InternalErDslParser.g:2175:3: ( rule__Entity__GeneralizationAlternatives_1_1_0 )
            // InternalErDslParser.g:2175:4: rule__Entity__GeneralizationAlternatives_1_1_0
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
    // InternalErDslParser.g:2183:1: rule__Entity__IsAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__IsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2187:1: ( ( ( RULE_ID ) ) )
            // InternalErDslParser.g:2188:2: ( ( RULE_ID ) )
            {
            // InternalErDslParser.g:2188:2: ( ( RULE_ID ) )
            // InternalErDslParser.g:2189:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getIsEntityCrossReference_1_2_0()); 
            // InternalErDslParser.g:2190:3: ( RULE_ID )
            // InternalErDslParser.g:2191:4: RULE_ID
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
    // InternalErDslParser.g:2202:1: rule__Entity__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2206:1: ( ( ruleAttribute ) )
            // InternalErDslParser.g:2207:2: ( ruleAttribute )
            {
            // InternalErDslParser.g:2207:2: ( ruleAttribute )
            // InternalErDslParser.g:2208:3: ruleAttribute
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
    // InternalErDslParser.g:2217:1: rule__Entity__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2221:1: ( ( ruleAttribute ) )
            // InternalErDslParser.g:2222:2: ( ruleAttribute )
            {
            // InternalErDslParser.g:2222:2: ( ruleAttribute )
            // InternalErDslParser.g:2223:3: ruleAttribute
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
    // InternalErDslParser.g:2232:1: rule__Relation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2236:1: ( ( RULE_ID ) )
            // InternalErDslParser.g:2237:2: ( RULE_ID )
            {
            // InternalErDslParser.g:2237:2: ( RULE_ID )
            // InternalErDslParser.g:2238:3: RULE_ID
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
    // InternalErDslParser.g:2247:1: rule__Relation__LeftEndingAssignment_1_1 : ( ruleRelationSideLeft ) ;
    public final void rule__Relation__LeftEndingAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2251:1: ( ( ruleRelationSideLeft ) )
            // InternalErDslParser.g:2252:2: ( ruleRelationSideLeft )
            {
            // InternalErDslParser.g:2252:2: ( ruleRelationSideLeft )
            // InternalErDslParser.g:2253:3: ruleRelationSideLeft
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
    // InternalErDslParser.g:2262:1: rule__Relation__RightEndingAssignment_1_3 : ( ruleRelationSideRight ) ;
    public final void rule__Relation__RightEndingAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2266:1: ( ( ruleRelationSideRight ) )
            // InternalErDslParser.g:2267:2: ( ruleRelationSideRight )
            {
            // InternalErDslParser.g:2267:2: ( ruleRelationSideRight )
            // InternalErDslParser.g:2268:3: ruleRelationSideRight
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
    // InternalErDslParser.g:2277:1: rule__Relation__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2281:1: ( ( ruleAttribute ) )
            // InternalErDslParser.g:2282:2: ( ruleAttribute )
            {
            // InternalErDslParser.g:2282:2: ( ruleAttribute )
            // InternalErDslParser.g:2283:3: ruleAttribute
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
    // InternalErDslParser.g:2292:1: rule__Relation__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2296:1: ( ( ruleAttribute ) )
            // InternalErDslParser.g:2297:2: ( ruleAttribute )
            {
            // InternalErDslParser.g:2297:2: ( ruleAttribute )
            // InternalErDslParser.g:2298:3: ruleAttribute
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


    // $ANTLR start "rule__Relation__OcurrenceAssignment_3"
    // InternalErDslParser.g:2307:1: rule__Relation__OcurrenceAssignment_3 : ( ( GenerateOcurrenceDiagram ) ) ;
    public final void rule__Relation__OcurrenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2311:1: ( ( ( GenerateOcurrenceDiagram ) ) )
            // InternalErDslParser.g:2312:2: ( ( GenerateOcurrenceDiagram ) )
            {
            // InternalErDslParser.g:2312:2: ( ( GenerateOcurrenceDiagram ) )
            // InternalErDslParser.g:2313:3: ( GenerateOcurrenceDiagram )
            {
             before(grammarAccess.getRelationAccess().getOcurrenceGenerateOcurrenceDiagramKeyword_3_0()); 
            // InternalErDslParser.g:2314:3: ( GenerateOcurrenceDiagram )
            // InternalErDslParser.g:2315:4: GenerateOcurrenceDiagram
            {
             before(grammarAccess.getRelationAccess().getOcurrenceGenerateOcurrenceDiagramKeyword_3_0()); 
            match(input,GenerateOcurrenceDiagram,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getOcurrenceGenerateOcurrenceDiagramKeyword_3_0()); 

            }

             after(grammarAccess.getRelationAccess().getOcurrenceGenerateOcurrenceDiagramKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__OcurrenceAssignment_3"


    // $ANTLR start "rule__RelationSideRight__CardinalityAssignment_0_0"
    // InternalErDslParser.g:2326:1: rule__RelationSideRight__CardinalityAssignment_0_0 : ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) ) ;
    public final void rule__RelationSideRight__CardinalityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2330:1: ( ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) ) )
            // InternalErDslParser.g:2331:2: ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) )
            {
            // InternalErDslParser.g:2331:2: ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) )
            // InternalErDslParser.g:2332:3: ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 )
            {
             before(grammarAccess.getRelationSideRightAccess().getCardinalityAlternatives_0_0_0()); 
            // InternalErDslParser.g:2333:3: ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 )
            // InternalErDslParser.g:2333:4: rule__RelationSideRight__CardinalityAlternatives_0_0_0
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
    // InternalErDslParser.g:2341:1: rule__RelationSideRight__TargetAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideRight__TargetAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2345:1: ( ( ( RULE_ID ) ) )
            // InternalErDslParser.g:2346:2: ( ( RULE_ID ) )
            {
            // InternalErDslParser.g:2346:2: ( ( RULE_ID ) )
            // InternalErDslParser.g:2347:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetEntityCrossReference_0_1_0()); 
            // InternalErDslParser.g:2348:3: ( RULE_ID )
            // InternalErDslParser.g:2349:4: RULE_ID
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
    // InternalErDslParser.g:2360:1: rule__RelationSideRight__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideRight__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2364:1: ( ( ( RULE_ID ) ) )
            // InternalErDslParser.g:2365:2: ( ( RULE_ID ) )
            {
            // InternalErDslParser.g:2365:2: ( ( RULE_ID ) )
            // InternalErDslParser.g:2366:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetRelationCrossReference_1_0()); 
            // InternalErDslParser.g:2367:3: ( RULE_ID )
            // InternalErDslParser.g:2368:4: RULE_ID
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
    // InternalErDslParser.g:2379:1: rule__RelationSideLeft__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideLeft__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2383:1: ( ( ( RULE_ID ) ) )
            // InternalErDslParser.g:2384:2: ( ( RULE_ID ) )
            {
            // InternalErDslParser.g:2384:2: ( ( RULE_ID ) )
            // InternalErDslParser.g:2385:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetEntityCrossReference_0_0()); 
            // InternalErDslParser.g:2386:3: ( RULE_ID )
            // InternalErDslParser.g:2387:4: RULE_ID
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
    // InternalErDslParser.g:2398:1: rule__RelationSideLeft__TargetAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideLeft__TargetAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2402:1: ( ( ( RULE_ID ) ) )
            // InternalErDslParser.g:2403:2: ( ( RULE_ID ) )
            {
            // InternalErDslParser.g:2403:2: ( ( RULE_ID ) )
            // InternalErDslParser.g:2404:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetRelationCrossReference_1_0_0()); 
            // InternalErDslParser.g:2405:3: ( RULE_ID )
            // InternalErDslParser.g:2406:4: RULE_ID
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
    // InternalErDslParser.g:2417:1: rule__RelationSideLeft__CardinalityAssignment_1_1 : ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) ) ;
    public final void rule__RelationSideLeft__CardinalityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2421:1: ( ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) ) )
            // InternalErDslParser.g:2422:2: ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) )
            {
            // InternalErDslParser.g:2422:2: ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) )
            // InternalErDslParser.g:2423:3: ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 )
            {
             before(grammarAccess.getRelationSideLeftAccess().getCardinalityAlternatives_1_1_0()); 
            // InternalErDslParser.g:2424:3: ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 )
            // InternalErDslParser.g:2424:4: rule__RelationSideLeft__CardinalityAlternatives_1_1_0
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000024011200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000058328000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004003C00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000003C00000L});

}