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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PartialOverlapped", "PartialDisjoint", "TotalOverlapped", "TotalDisjoint", "LogicalSchema", "Relationships", "IsIdentifier", "PostgreSQL", "Entities", "Generate", "Datetime", "Diagram", "Boolean", "Relates", "Domain", "Double", "String", "LeftParenthesisDigitZeroColonDigitOneRightParenthesis", "N", "LeftParenthesisDigitOneColonDigitOneRightParenthesis", "N_1", "MySQL", "Money", "File", "All", "Int", "Is", "Comma", "Semicolon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int All=28;
    public static final int N_1=24;
    public static final int PostgreSQL=11;
    public static final int String=20;
    public static final int TotalOverlapped=6;
    public static final int MySQL=25;
    public static final int Boolean=16;
    public static final int RightSquareBracket=34;
    public static final int Relates=17;
    public static final int RULE_ID=37;
    public static final int PartialOverlapped=4;
    public static final int LogicalSchema=8;
    public static final int IsIdentifier=10;
    public static final int Double=19;
    public static final int RULE_INT=38;
    public static final int RULE_ML_COMMENT=40;
    public static final int LeftSquareBracket=33;
    public static final int Domain=18;
    public static final int File=27;
    public static final int PartialDisjoint=5;
    public static final int Is=30;
    public static final int RULE_STRING=39;
    public static final int LeftParenthesisDigitZeroColonDigitOneRightParenthesis=21;
    public static final int N=22;
    public static final int Int=29;
    public static final int RULE_SL_COMMENT=41;
    public static final int Money=26;
    public static final int Comma=31;
    public static final int Relationships=9;
    public static final int Generate=13;
    public static final int RightCurlyBracket=36;
    public static final int EOF=-1;
    public static final int TotalDisjoint=7;
    public static final int Datetime=14;
    public static final int RULE_WS=42;
    public static final int LeftCurlyBracket=35;
    public static final int RULE_ANY_OTHER=43;
    public static final int Entities=12;
    public static final int Diagram=15;
    public static final int LeftParenthesisDigitOneColonDigitOneRightParenthesis=23;
    public static final int Semicolon=32;

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
    // InternalErDslParser.g:88:1: entryRuleERModel : ruleERModel EOF ;
    public final void entryRuleERModel() throws RecognitionException {
        try {
            // InternalErDslParser.g:89:1: ( ruleERModel EOF )
            // InternalErDslParser.g:90:1: ruleERModel EOF
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
    // InternalErDslParser.g:97:1: ruleERModel : ( ( rule__ERModel__Group__0 ) ) ;
    public final void ruleERModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:101:2: ( ( ( rule__ERModel__Group__0 ) ) )
            // InternalErDslParser.g:102:2: ( ( rule__ERModel__Group__0 ) )
            {
            // InternalErDslParser.g:102:2: ( ( rule__ERModel__Group__0 ) )
            // InternalErDslParser.g:103:3: ( rule__ERModel__Group__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup()); 
            // InternalErDslParser.g:104:3: ( rule__ERModel__Group__0 )
            // InternalErDslParser.g:104:4: rule__ERModel__Group__0
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
    // InternalErDslParser.g:113:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalErDslParser.g:114:1: ( ruleDomain EOF )
            // InternalErDslParser.g:115:1: ruleDomain EOF
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
    // InternalErDslParser.g:122:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:126:2: ( ( ( rule__Domain__Group__0 ) ) )
            // InternalErDslParser.g:127:2: ( ( rule__Domain__Group__0 ) )
            {
            // InternalErDslParser.g:127:2: ( ( rule__Domain__Group__0 ) )
            // InternalErDslParser.g:128:3: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // InternalErDslParser.g:129:3: ( rule__Domain__Group__0 )
            // InternalErDslParser.g:129:4: rule__Domain__Group__0
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
    // InternalErDslParser.g:138:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalErDslParser.g:139:1: ( ruleAttribute EOF )
            // InternalErDslParser.g:140:1: ruleAttribute EOF
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
    // InternalErDslParser.g:147:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:151:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalErDslParser.g:152:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalErDslParser.g:152:2: ( ( rule__Attribute__Group__0 ) )
            // InternalErDslParser.g:153:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalErDslParser.g:154:3: ( rule__Attribute__Group__0 )
            // InternalErDslParser.g:154:4: rule__Attribute__Group__0
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
    // InternalErDslParser.g:163:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalErDslParser.g:164:1: ( ruleEntity EOF )
            // InternalErDslParser.g:165:1: ruleEntity EOF
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
    // InternalErDslParser.g:172:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:176:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalErDslParser.g:177:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalErDslParser.g:177:2: ( ( rule__Entity__Group__0 ) )
            // InternalErDslParser.g:178:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalErDslParser.g:179:3: ( rule__Entity__Group__0 )
            // InternalErDslParser.g:179:4: rule__Entity__Group__0
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
    // InternalErDslParser.g:188:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalErDslParser.g:189:1: ( ruleRelation EOF )
            // InternalErDslParser.g:190:1: ruleRelation EOF
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
    // InternalErDslParser.g:197:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:201:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalErDslParser.g:202:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalErDslParser.g:202:2: ( ( rule__Relation__Group__0 ) )
            // InternalErDslParser.g:203:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalErDslParser.g:204:3: ( rule__Relation__Group__0 )
            // InternalErDslParser.g:204:4: rule__Relation__Group__0
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
    // InternalErDslParser.g:213:1: entryRuleRelationSideRight : ruleRelationSideRight EOF ;
    public final void entryRuleRelationSideRight() throws RecognitionException {
        try {
            // InternalErDslParser.g:214:1: ( ruleRelationSideRight EOF )
            // InternalErDslParser.g:215:1: ruleRelationSideRight EOF
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
    // InternalErDslParser.g:222:1: ruleRelationSideRight : ( ( rule__RelationSideRight__Alternatives ) ) ;
    public final void ruleRelationSideRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:226:2: ( ( ( rule__RelationSideRight__Alternatives ) ) )
            // InternalErDslParser.g:227:2: ( ( rule__RelationSideRight__Alternatives ) )
            {
            // InternalErDslParser.g:227:2: ( ( rule__RelationSideRight__Alternatives ) )
            // InternalErDslParser.g:228:3: ( rule__RelationSideRight__Alternatives )
            {
             before(grammarAccess.getRelationSideRightAccess().getAlternatives()); 
            // InternalErDslParser.g:229:3: ( rule__RelationSideRight__Alternatives )
            // InternalErDslParser.g:229:4: rule__RelationSideRight__Alternatives
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
    // InternalErDslParser.g:238:1: entryRuleRelationSideLeft : ruleRelationSideLeft EOF ;
    public final void entryRuleRelationSideLeft() throws RecognitionException {
        try {
            // InternalErDslParser.g:239:1: ( ruleRelationSideLeft EOF )
            // InternalErDslParser.g:240:1: ruleRelationSideLeft EOF
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
    // InternalErDslParser.g:247:1: ruleRelationSideLeft : ( ( rule__RelationSideLeft__Alternatives ) ) ;
    public final void ruleRelationSideLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:251:2: ( ( ( rule__RelationSideLeft__Alternatives ) ) )
            // InternalErDslParser.g:252:2: ( ( rule__RelationSideLeft__Alternatives ) )
            {
            // InternalErDslParser.g:252:2: ( ( rule__RelationSideLeft__Alternatives ) )
            // InternalErDslParser.g:253:3: ( rule__RelationSideLeft__Alternatives )
            {
             before(grammarAccess.getRelationSideLeftAccess().getAlternatives()); 
            // InternalErDslParser.g:254:3: ( rule__RelationSideLeft__Alternatives )
            // InternalErDslParser.g:254:4: rule__RelationSideLeft__Alternatives
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
    // InternalErDslParser.g:263:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:267:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalErDslParser.g:268:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalErDslParser.g:268:2: ( ( rule__DataType__Alternatives ) )
            // InternalErDslParser.g:269:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalErDslParser.g:270:3: ( rule__DataType__Alternatives )
            // InternalErDslParser.g:270:4: rule__DataType__Alternatives
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
    // InternalErDslParser.g:278:1: rule__ERModel__TargetGeneratorAlternatives_0_1_0 : ( ( LogicalSchema ) | ( PostgreSQL ) | ( MySQL ) | ( Diagram ) | ( All ) );
    public final void rule__ERModel__TargetGeneratorAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:282:1: ( ( LogicalSchema ) | ( PostgreSQL ) | ( MySQL ) | ( Diagram ) | ( All ) )
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
                    // InternalErDslParser.g:283:2: ( LogicalSchema )
                    {
                    // InternalErDslParser.g:283:2: ( LogicalSchema )
                    // InternalErDslParser.g:284:3: LogicalSchema
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorLogicalSchemaKeyword_0_1_0_0()); 
                    match(input,LogicalSchema,FOLLOW_2); 
                     after(grammarAccess.getERModelAccess().getTargetGeneratorLogicalSchemaKeyword_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:289:2: ( PostgreSQL )
                    {
                    // InternalErDslParser.g:289:2: ( PostgreSQL )
                    // InternalErDslParser.g:290:3: PostgreSQL
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorPostgreSQLKeyword_0_1_0_1()); 
                    match(input,PostgreSQL,FOLLOW_2); 
                     after(grammarAccess.getERModelAccess().getTargetGeneratorPostgreSQLKeyword_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDslParser.g:295:2: ( MySQL )
                    {
                    // InternalErDslParser.g:295:2: ( MySQL )
                    // InternalErDslParser.g:296:3: MySQL
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorMySQLKeyword_0_1_0_2()); 
                    match(input,MySQL,FOLLOW_2); 
                     after(grammarAccess.getERModelAccess().getTargetGeneratorMySQLKeyword_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDslParser.g:301:2: ( Diagram )
                    {
                    // InternalErDslParser.g:301:2: ( Diagram )
                    // InternalErDslParser.g:302:3: Diagram
                    {
                     before(grammarAccess.getERModelAccess().getTargetGeneratorDiagramKeyword_0_1_0_3()); 
                    match(input,Diagram,FOLLOW_2); 
                     after(grammarAccess.getERModelAccess().getTargetGeneratorDiagramKeyword_0_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalErDslParser.g:307:2: ( All )
                    {
                    // InternalErDslParser.g:307:2: ( All )
                    // InternalErDslParser.g:308:3: All
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
    // InternalErDslParser.g:317:1: rule__Entity__GeneralizationAlternatives_1_1_0 : ( ( TotalDisjoint ) | ( TotalOverlapped ) | ( PartialDisjoint ) | ( PartialOverlapped ) );
    public final void rule__Entity__GeneralizationAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:321:1: ( ( TotalDisjoint ) | ( TotalOverlapped ) | ( PartialDisjoint ) | ( PartialOverlapped ) )
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
                    // InternalErDslParser.g:322:2: ( TotalDisjoint )
                    {
                    // InternalErDslParser.g:322:2: ( TotalDisjoint )
                    // InternalErDslParser.g:323:3: TotalDisjoint
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationTotalDisjointKeyword_1_1_0_0()); 
                    match(input,TotalDisjoint,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getGeneralizationTotalDisjointKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:328:2: ( TotalOverlapped )
                    {
                    // InternalErDslParser.g:328:2: ( TotalOverlapped )
                    // InternalErDslParser.g:329:3: TotalOverlapped
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationTotalOverlappedKeyword_1_1_0_1()); 
                    match(input,TotalOverlapped,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getGeneralizationTotalOverlappedKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDslParser.g:334:2: ( PartialDisjoint )
                    {
                    // InternalErDslParser.g:334:2: ( PartialDisjoint )
                    // InternalErDslParser.g:335:3: PartialDisjoint
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationPartialDisjointKeyword_1_1_0_2()); 
                    match(input,PartialDisjoint,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getGeneralizationPartialDisjointKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDslParser.g:340:2: ( PartialOverlapped )
                    {
                    // InternalErDslParser.g:340:2: ( PartialOverlapped )
                    // InternalErDslParser.g:341:3: PartialOverlapped
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
    // InternalErDslParser.g:350:1: rule__RelationSideRight__Alternatives : ( ( ( rule__RelationSideRight__Group_0__0 ) ) | ( ( rule__RelationSideRight__TargetAssignment_1 ) ) );
    public final void rule__RelationSideRight__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:354:1: ( ( ( rule__RelationSideRight__Group_0__0 ) ) | ( ( rule__RelationSideRight__TargetAssignment_1 ) ) )
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
                    // InternalErDslParser.g:355:2: ( ( rule__RelationSideRight__Group_0__0 ) )
                    {
                    // InternalErDslParser.g:355:2: ( ( rule__RelationSideRight__Group_0__0 ) )
                    // InternalErDslParser.g:356:3: ( rule__RelationSideRight__Group_0__0 )
                    {
                     before(grammarAccess.getRelationSideRightAccess().getGroup_0()); 
                    // InternalErDslParser.g:357:3: ( rule__RelationSideRight__Group_0__0 )
                    // InternalErDslParser.g:357:4: rule__RelationSideRight__Group_0__0
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
                    // InternalErDslParser.g:361:2: ( ( rule__RelationSideRight__TargetAssignment_1 ) )
                    {
                    // InternalErDslParser.g:361:2: ( ( rule__RelationSideRight__TargetAssignment_1 ) )
                    // InternalErDslParser.g:362:3: ( rule__RelationSideRight__TargetAssignment_1 )
                    {
                     before(grammarAccess.getRelationSideRightAccess().getTargetAssignment_1()); 
                    // InternalErDslParser.g:363:3: ( rule__RelationSideRight__TargetAssignment_1 )
                    // InternalErDslParser.g:363:4: rule__RelationSideRight__TargetAssignment_1
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
    // InternalErDslParser.g:371:1: rule__RelationSideRight__CardinalityAlternatives_0_0_0 : ( ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis ) | ( LeftParenthesisDigitOneColonDigitOneRightParenthesis ) | ( N ) | ( N_1 ) );
    public final void rule__RelationSideRight__CardinalityAlternatives_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:375:1: ( ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis ) | ( LeftParenthesisDigitOneColonDigitOneRightParenthesis ) | ( N ) | ( N_1 ) )
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
                    // InternalErDslParser.g:376:2: ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis )
                    {
                    // InternalErDslParser.g:376:2: ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis )
                    // InternalErDslParser.g:377:3: LeftParenthesisDigitZeroColonDigitOneRightParenthesis
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality01Keyword_0_0_0_0()); 
                    match(input,LeftParenthesisDigitZeroColonDigitOneRightParenthesis,FOLLOW_2); 
                     after(grammarAccess.getRelationSideRightAccess().getCardinality01Keyword_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:382:2: ( LeftParenthesisDigitOneColonDigitOneRightParenthesis )
                    {
                    // InternalErDslParser.g:382:2: ( LeftParenthesisDigitOneColonDigitOneRightParenthesis )
                    // InternalErDslParser.g:383:3: LeftParenthesisDigitOneColonDigitOneRightParenthesis
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality11Keyword_0_0_0_1()); 
                    match(input,LeftParenthesisDigitOneColonDigitOneRightParenthesis,FOLLOW_2); 
                     after(grammarAccess.getRelationSideRightAccess().getCardinality11Keyword_0_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDslParser.g:388:2: ( N )
                    {
                    // InternalErDslParser.g:388:2: ( N )
                    // InternalErDslParser.g:389:3: N
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality0NKeyword_0_0_0_2()); 
                    match(input,N,FOLLOW_2); 
                     after(grammarAccess.getRelationSideRightAccess().getCardinality0NKeyword_0_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDslParser.g:394:2: ( N_1 )
                    {
                    // InternalErDslParser.g:394:2: ( N_1 )
                    // InternalErDslParser.g:395:3: N_1
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
    // InternalErDslParser.g:404:1: rule__RelationSideLeft__Alternatives : ( ( ( rule__RelationSideLeft__TargetAssignment_0 ) ) | ( ( rule__RelationSideLeft__Group_1__0 ) ) );
    public final void rule__RelationSideLeft__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:408:1: ( ( ( rule__RelationSideLeft__TargetAssignment_0 ) ) | ( ( rule__RelationSideLeft__Group_1__0 ) ) )
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
                    // InternalErDslParser.g:409:2: ( ( rule__RelationSideLeft__TargetAssignment_0 ) )
                    {
                    // InternalErDslParser.g:409:2: ( ( rule__RelationSideLeft__TargetAssignment_0 ) )
                    // InternalErDslParser.g:410:3: ( rule__RelationSideLeft__TargetAssignment_0 )
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getTargetAssignment_0()); 
                    // InternalErDslParser.g:411:3: ( rule__RelationSideLeft__TargetAssignment_0 )
                    // InternalErDslParser.g:411:4: rule__RelationSideLeft__TargetAssignment_0
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
                    // InternalErDslParser.g:415:2: ( ( rule__RelationSideLeft__Group_1__0 ) )
                    {
                    // InternalErDslParser.g:415:2: ( ( rule__RelationSideLeft__Group_1__0 ) )
                    // InternalErDslParser.g:416:3: ( rule__RelationSideLeft__Group_1__0 )
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getGroup_1()); 
                    // InternalErDslParser.g:417:3: ( rule__RelationSideLeft__Group_1__0 )
                    // InternalErDslParser.g:417:4: rule__RelationSideLeft__Group_1__0
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
    // InternalErDslParser.g:425:1: rule__RelationSideLeft__CardinalityAlternatives_1_1_0 : ( ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis ) | ( LeftParenthesisDigitOneColonDigitOneRightParenthesis ) | ( N ) | ( N_1 ) );
    public final void rule__RelationSideLeft__CardinalityAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:429:1: ( ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis ) | ( LeftParenthesisDigitOneColonDigitOneRightParenthesis ) | ( N ) | ( N_1 ) )
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
                    // InternalErDslParser.g:430:2: ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis )
                    {
                    // InternalErDslParser.g:430:2: ( LeftParenthesisDigitZeroColonDigitOneRightParenthesis )
                    // InternalErDslParser.g:431:3: LeftParenthesisDigitZeroColonDigitOneRightParenthesis
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality01Keyword_1_1_0_0()); 
                    match(input,LeftParenthesisDigitZeroColonDigitOneRightParenthesis,FOLLOW_2); 
                     after(grammarAccess.getRelationSideLeftAccess().getCardinality01Keyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:436:2: ( LeftParenthesisDigitOneColonDigitOneRightParenthesis )
                    {
                    // InternalErDslParser.g:436:2: ( LeftParenthesisDigitOneColonDigitOneRightParenthesis )
                    // InternalErDslParser.g:437:3: LeftParenthesisDigitOneColonDigitOneRightParenthesis
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality11Keyword_1_1_0_1()); 
                    match(input,LeftParenthesisDigitOneColonDigitOneRightParenthesis,FOLLOW_2); 
                     after(grammarAccess.getRelationSideLeftAccess().getCardinality11Keyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDslParser.g:442:2: ( N )
                    {
                    // InternalErDslParser.g:442:2: ( N )
                    // InternalErDslParser.g:443:3: N
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality0NKeyword_1_1_0_2()); 
                    match(input,N,FOLLOW_2); 
                     after(grammarAccess.getRelationSideLeftAccess().getCardinality0NKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDslParser.g:448:2: ( N_1 )
                    {
                    // InternalErDslParser.g:448:2: ( N_1 )
                    // InternalErDslParser.g:449:3: N_1
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
    // InternalErDslParser.g:458:1: rule__DataType__Alternatives : ( ( ( Int ) ) | ( ( Double ) ) | ( ( Money ) ) | ( ( String ) ) | ( ( Boolean ) ) | ( ( Datetime ) ) | ( ( File ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:462:1: ( ( ( Int ) ) | ( ( Double ) ) | ( ( Money ) ) | ( ( String ) ) | ( ( Boolean ) ) | ( ( Datetime ) ) | ( ( File ) ) )
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
                    // InternalErDslParser.g:463:2: ( ( Int ) )
                    {
                    // InternalErDslParser.g:463:2: ( ( Int ) )
                    // InternalErDslParser.g:464:3: ( Int )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalErDslParser.g:465:3: ( Int )
                    // InternalErDslParser.g:465:4: Int
                    {
                    match(input,Int,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDslParser.g:469:2: ( ( Double ) )
                    {
                    // InternalErDslParser.g:469:2: ( ( Double ) )
                    // InternalErDslParser.g:470:3: ( Double )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                    // InternalErDslParser.g:471:3: ( Double )
                    // InternalErDslParser.g:471:4: Double
                    {
                    match(input,Double,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDslParser.g:475:2: ( ( Money ) )
                    {
                    // InternalErDslParser.g:475:2: ( ( Money ) )
                    // InternalErDslParser.g:476:3: ( Money )
                    {
                     before(grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2()); 
                    // InternalErDslParser.g:477:3: ( Money )
                    // InternalErDslParser.g:477:4: Money
                    {
                    match(input,Money,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDslParser.g:481:2: ( ( String ) )
                    {
                    // InternalErDslParser.g:481:2: ( ( String ) )
                    // InternalErDslParser.g:482:3: ( String )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                    // InternalErDslParser.g:483:3: ( String )
                    // InternalErDslParser.g:483:4: String
                    {
                    match(input,String,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalErDslParser.g:487:2: ( ( Boolean ) )
                    {
                    // InternalErDslParser.g:487:2: ( ( Boolean ) )
                    // InternalErDslParser.g:488:3: ( Boolean )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 
                    // InternalErDslParser.g:489:3: ( Boolean )
                    // InternalErDslParser.g:489:4: Boolean
                    {
                    match(input,Boolean,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalErDslParser.g:493:2: ( ( Datetime ) )
                    {
                    // InternalErDslParser.g:493:2: ( ( Datetime ) )
                    // InternalErDslParser.g:494:3: ( Datetime )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5()); 
                    // InternalErDslParser.g:495:3: ( Datetime )
                    // InternalErDslParser.g:495:4: Datetime
                    {
                    match(input,Datetime,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalErDslParser.g:499:2: ( ( File ) )
                    {
                    // InternalErDslParser.g:499:2: ( ( File ) )
                    // InternalErDslParser.g:500:3: ( File )
                    {
                     before(grammarAccess.getDataTypeAccess().getBLOBEnumLiteralDeclaration_6()); 
                    // InternalErDslParser.g:501:3: ( File )
                    // InternalErDslParser.g:501:4: File
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
    // InternalErDslParser.g:509:1: rule__ERModel__Group__0 : rule__ERModel__Group__0__Impl rule__ERModel__Group__1 ;
    public final void rule__ERModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:513:1: ( rule__ERModel__Group__0__Impl rule__ERModel__Group__1 )
            // InternalErDslParser.g:514:2: rule__ERModel__Group__0__Impl rule__ERModel__Group__1
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
    // InternalErDslParser.g:521:1: rule__ERModel__Group__0__Impl : ( ( rule__ERModel__Group_0__0 )? ) ;
    public final void rule__ERModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:525:1: ( ( ( rule__ERModel__Group_0__0 )? ) )
            // InternalErDslParser.g:526:1: ( ( rule__ERModel__Group_0__0 )? )
            {
            // InternalErDslParser.g:526:1: ( ( rule__ERModel__Group_0__0 )? )
            // InternalErDslParser.g:527:2: ( rule__ERModel__Group_0__0 )?
            {
             before(grammarAccess.getERModelAccess().getGroup_0()); 
            // InternalErDslParser.g:528:2: ( rule__ERModel__Group_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Generate) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalErDslParser.g:528:3: rule__ERModel__Group_0__0
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
    // InternalErDslParser.g:536:1: rule__ERModel__Group__1 : rule__ERModel__Group__1__Impl rule__ERModel__Group__2 ;
    public final void rule__ERModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:540:1: ( rule__ERModel__Group__1__Impl rule__ERModel__Group__2 )
            // InternalErDslParser.g:541:2: rule__ERModel__Group__1__Impl rule__ERModel__Group__2
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
    // InternalErDslParser.g:548:1: rule__ERModel__Group__1__Impl : ( ( rule__ERModel__DomainAssignment_1 ) ) ;
    public final void rule__ERModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:552:1: ( ( ( rule__ERModel__DomainAssignment_1 ) ) )
            // InternalErDslParser.g:553:1: ( ( rule__ERModel__DomainAssignment_1 ) )
            {
            // InternalErDslParser.g:553:1: ( ( rule__ERModel__DomainAssignment_1 ) )
            // InternalErDslParser.g:554:2: ( rule__ERModel__DomainAssignment_1 )
            {
             before(grammarAccess.getERModelAccess().getDomainAssignment_1()); 
            // InternalErDslParser.g:555:2: ( rule__ERModel__DomainAssignment_1 )
            // InternalErDslParser.g:555:3: rule__ERModel__DomainAssignment_1
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
    // InternalErDslParser.g:563:1: rule__ERModel__Group__2 : rule__ERModel__Group__2__Impl rule__ERModel__Group__3 ;
    public final void rule__ERModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:567:1: ( rule__ERModel__Group__2__Impl rule__ERModel__Group__3 )
            // InternalErDslParser.g:568:2: rule__ERModel__Group__2__Impl rule__ERModel__Group__3
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
    // InternalErDslParser.g:575:1: rule__ERModel__Group__2__Impl : ( Semicolon ) ;
    public final void rule__ERModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:579:1: ( ( Semicolon ) )
            // InternalErDslParser.g:580:1: ( Semicolon )
            {
            // InternalErDslParser.g:580:1: ( Semicolon )
            // InternalErDslParser.g:581:2: Semicolon
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
    // InternalErDslParser.g:590:1: rule__ERModel__Group__3 : rule__ERModel__Group__3__Impl rule__ERModel__Group__4 ;
    public final void rule__ERModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:594:1: ( rule__ERModel__Group__3__Impl rule__ERModel__Group__4 )
            // InternalErDslParser.g:595:2: rule__ERModel__Group__3__Impl rule__ERModel__Group__4
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
    // InternalErDslParser.g:602:1: rule__ERModel__Group__3__Impl : ( ( rule__ERModel__Group_3__0 ) ) ;
    public final void rule__ERModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:606:1: ( ( ( rule__ERModel__Group_3__0 ) ) )
            // InternalErDslParser.g:607:1: ( ( rule__ERModel__Group_3__0 ) )
            {
            // InternalErDslParser.g:607:1: ( ( rule__ERModel__Group_3__0 ) )
            // InternalErDslParser.g:608:2: ( rule__ERModel__Group_3__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_3()); 
            // InternalErDslParser.g:609:2: ( rule__ERModel__Group_3__0 )
            // InternalErDslParser.g:609:3: rule__ERModel__Group_3__0
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
    // InternalErDslParser.g:617:1: rule__ERModel__Group__4 : rule__ERModel__Group__4__Impl rule__ERModel__Group__5 ;
    public final void rule__ERModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:621:1: ( rule__ERModel__Group__4__Impl rule__ERModel__Group__5 )
            // InternalErDslParser.g:622:2: rule__ERModel__Group__4__Impl rule__ERModel__Group__5
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
    // InternalErDslParser.g:629:1: rule__ERModel__Group__4__Impl : ( ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* ) ) ;
    public final void rule__ERModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:633:1: ( ( ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* ) ) )
            // InternalErDslParser.g:634:1: ( ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* ) )
            {
            // InternalErDslParser.g:634:1: ( ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* ) )
            // InternalErDslParser.g:635:2: ( ( rule__ERModel__EntitiesAssignment_4 ) ) ( ( rule__ERModel__EntitiesAssignment_4 )* )
            {
            // InternalErDslParser.g:635:2: ( ( rule__ERModel__EntitiesAssignment_4 ) )
            // InternalErDslParser.g:636:3: ( rule__ERModel__EntitiesAssignment_4 )
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_4()); 
            // InternalErDslParser.g:637:3: ( rule__ERModel__EntitiesAssignment_4 )
            // InternalErDslParser.g:637:4: rule__ERModel__EntitiesAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__ERModel__EntitiesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getEntitiesAssignment_4()); 

            }

            // InternalErDslParser.g:640:2: ( ( rule__ERModel__EntitiesAssignment_4 )* )
            // InternalErDslParser.g:641:3: ( rule__ERModel__EntitiesAssignment_4 )*
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_4()); 
            // InternalErDslParser.g:642:3: ( rule__ERModel__EntitiesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalErDslParser.g:642:4: rule__ERModel__EntitiesAssignment_4
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
    // InternalErDslParser.g:651:1: rule__ERModel__Group__5 : rule__ERModel__Group__5__Impl rule__ERModel__Group__6 ;
    public final void rule__ERModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:655:1: ( rule__ERModel__Group__5__Impl rule__ERModel__Group__6 )
            // InternalErDslParser.g:656:2: rule__ERModel__Group__5__Impl rule__ERModel__Group__6
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
    // InternalErDslParser.g:663:1: rule__ERModel__Group__5__Impl : ( ( rule__ERModel__Group_5__0 ) ) ;
    public final void rule__ERModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:667:1: ( ( ( rule__ERModel__Group_5__0 ) ) )
            // InternalErDslParser.g:668:1: ( ( rule__ERModel__Group_5__0 ) )
            {
            // InternalErDslParser.g:668:1: ( ( rule__ERModel__Group_5__0 ) )
            // InternalErDslParser.g:669:2: ( rule__ERModel__Group_5__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_5()); 
            // InternalErDslParser.g:670:2: ( rule__ERModel__Group_5__0 )
            // InternalErDslParser.g:670:3: rule__ERModel__Group_5__0
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
    // InternalErDslParser.g:678:1: rule__ERModel__Group__6 : rule__ERModel__Group__6__Impl rule__ERModel__Group__7 ;
    public final void rule__ERModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:682:1: ( rule__ERModel__Group__6__Impl rule__ERModel__Group__7 )
            // InternalErDslParser.g:683:2: rule__ERModel__Group__6__Impl rule__ERModel__Group__7
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
    // InternalErDslParser.g:690:1: rule__ERModel__Group__6__Impl : ( ( rule__ERModel__Group_6__0 ) ) ;
    public final void rule__ERModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:694:1: ( ( ( rule__ERModel__Group_6__0 ) ) )
            // InternalErDslParser.g:695:1: ( ( rule__ERModel__Group_6__0 ) )
            {
            // InternalErDslParser.g:695:1: ( ( rule__ERModel__Group_6__0 ) )
            // InternalErDslParser.g:696:2: ( rule__ERModel__Group_6__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_6()); 
            // InternalErDslParser.g:697:2: ( rule__ERModel__Group_6__0 )
            // InternalErDslParser.g:697:3: rule__ERModel__Group_6__0
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
    // InternalErDslParser.g:705:1: rule__ERModel__Group__7 : rule__ERModel__Group__7__Impl rule__ERModel__Group__8 ;
    public final void rule__ERModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:709:1: ( rule__ERModel__Group__7__Impl rule__ERModel__Group__8 )
            // InternalErDslParser.g:710:2: rule__ERModel__Group__7__Impl rule__ERModel__Group__8
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
    // InternalErDslParser.g:717:1: rule__ERModel__Group__7__Impl : ( ( rule__ERModel__RelationsAssignment_7 )* ) ;
    public final void rule__ERModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:721:1: ( ( ( rule__ERModel__RelationsAssignment_7 )* ) )
            // InternalErDslParser.g:722:1: ( ( rule__ERModel__RelationsAssignment_7 )* )
            {
            // InternalErDslParser.g:722:1: ( ( rule__ERModel__RelationsAssignment_7 )* )
            // InternalErDslParser.g:723:2: ( rule__ERModel__RelationsAssignment_7 )*
            {
             before(grammarAccess.getERModelAccess().getRelationsAssignment_7()); 
            // InternalErDslParser.g:724:2: ( rule__ERModel__RelationsAssignment_7 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==LeftSquareBracket||LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalErDslParser.g:724:3: rule__ERModel__RelationsAssignment_7
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
    // InternalErDslParser.g:732:1: rule__ERModel__Group__8 : rule__ERModel__Group__8__Impl ;
    public final void rule__ERModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:736:1: ( rule__ERModel__Group__8__Impl )
            // InternalErDslParser.g:737:2: rule__ERModel__Group__8__Impl
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
    // InternalErDslParser.g:743:1: rule__ERModel__Group__8__Impl : ( ( rule__ERModel__Group_8__0 ) ) ;
    public final void rule__ERModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:747:1: ( ( ( rule__ERModel__Group_8__0 ) ) )
            // InternalErDslParser.g:748:1: ( ( rule__ERModel__Group_8__0 ) )
            {
            // InternalErDslParser.g:748:1: ( ( rule__ERModel__Group_8__0 ) )
            // InternalErDslParser.g:749:2: ( rule__ERModel__Group_8__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_8()); 
            // InternalErDslParser.g:750:2: ( rule__ERModel__Group_8__0 )
            // InternalErDslParser.g:750:3: rule__ERModel__Group_8__0
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
    // InternalErDslParser.g:759:1: rule__ERModel__Group_0__0 : rule__ERModel__Group_0__0__Impl rule__ERModel__Group_0__1 ;
    public final void rule__ERModel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:763:1: ( rule__ERModel__Group_0__0__Impl rule__ERModel__Group_0__1 )
            // InternalErDslParser.g:764:2: rule__ERModel__Group_0__0__Impl rule__ERModel__Group_0__1
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
    // InternalErDslParser.g:771:1: rule__ERModel__Group_0__0__Impl : ( Generate ) ;
    public final void rule__ERModel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:775:1: ( ( Generate ) )
            // InternalErDslParser.g:776:1: ( Generate )
            {
            // InternalErDslParser.g:776:1: ( Generate )
            // InternalErDslParser.g:777:2: Generate
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
    // InternalErDslParser.g:786:1: rule__ERModel__Group_0__1 : rule__ERModel__Group_0__1__Impl rule__ERModel__Group_0__2 ;
    public final void rule__ERModel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:790:1: ( rule__ERModel__Group_0__1__Impl rule__ERModel__Group_0__2 )
            // InternalErDslParser.g:791:2: rule__ERModel__Group_0__1__Impl rule__ERModel__Group_0__2
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
    // InternalErDslParser.g:798:1: rule__ERModel__Group_0__1__Impl : ( ( rule__ERModel__TargetGeneratorAssignment_0_1 ) ) ;
    public final void rule__ERModel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:802:1: ( ( ( rule__ERModel__TargetGeneratorAssignment_0_1 ) ) )
            // InternalErDslParser.g:803:1: ( ( rule__ERModel__TargetGeneratorAssignment_0_1 ) )
            {
            // InternalErDslParser.g:803:1: ( ( rule__ERModel__TargetGeneratorAssignment_0_1 ) )
            // InternalErDslParser.g:804:2: ( rule__ERModel__TargetGeneratorAssignment_0_1 )
            {
             before(grammarAccess.getERModelAccess().getTargetGeneratorAssignment_0_1()); 
            // InternalErDslParser.g:805:2: ( rule__ERModel__TargetGeneratorAssignment_0_1 )
            // InternalErDslParser.g:805:3: rule__ERModel__TargetGeneratorAssignment_0_1
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
    // InternalErDslParser.g:813:1: rule__ERModel__Group_0__2 : rule__ERModel__Group_0__2__Impl ;
    public final void rule__ERModel__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:817:1: ( rule__ERModel__Group_0__2__Impl )
            // InternalErDslParser.g:818:2: rule__ERModel__Group_0__2__Impl
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
    // InternalErDslParser.g:824:1: rule__ERModel__Group_0__2__Impl : ( Semicolon ) ;
    public final void rule__ERModel__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:828:1: ( ( Semicolon ) )
            // InternalErDslParser.g:829:1: ( Semicolon )
            {
            // InternalErDslParser.g:829:1: ( Semicolon )
            // InternalErDslParser.g:830:2: Semicolon
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
    // InternalErDslParser.g:840:1: rule__ERModel__Group_3__0 : rule__ERModel__Group_3__0__Impl rule__ERModel__Group_3__1 ;
    public final void rule__ERModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:844:1: ( rule__ERModel__Group_3__0__Impl rule__ERModel__Group_3__1 )
            // InternalErDslParser.g:845:2: rule__ERModel__Group_3__0__Impl rule__ERModel__Group_3__1
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
    // InternalErDslParser.g:852:1: rule__ERModel__Group_3__0__Impl : ( Entities ) ;
    public final void rule__ERModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:856:1: ( ( Entities ) )
            // InternalErDslParser.g:857:1: ( Entities )
            {
            // InternalErDslParser.g:857:1: ( Entities )
            // InternalErDslParser.g:858:2: Entities
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
    // InternalErDslParser.g:867:1: rule__ERModel__Group_3__1 : rule__ERModel__Group_3__1__Impl ;
    public final void rule__ERModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:871:1: ( rule__ERModel__Group_3__1__Impl )
            // InternalErDslParser.g:872:2: rule__ERModel__Group_3__1__Impl
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
    // InternalErDslParser.g:878:1: rule__ERModel__Group_3__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ERModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:882:1: ( ( LeftCurlyBracket ) )
            // InternalErDslParser.g:883:1: ( LeftCurlyBracket )
            {
            // InternalErDslParser.g:883:1: ( LeftCurlyBracket )
            // InternalErDslParser.g:884:2: LeftCurlyBracket
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
    // InternalErDslParser.g:894:1: rule__ERModel__Group_5__0 : rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1 ;
    public final void rule__ERModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:898:1: ( rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1 )
            // InternalErDslParser.g:899:2: rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1
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
    // InternalErDslParser.g:906:1: rule__ERModel__Group_5__0__Impl : ( RightCurlyBracket ) ;
    public final void rule__ERModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:910:1: ( ( RightCurlyBracket ) )
            // InternalErDslParser.g:911:1: ( RightCurlyBracket )
            {
            // InternalErDslParser.g:911:1: ( RightCurlyBracket )
            // InternalErDslParser.g:912:2: RightCurlyBracket
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
    // InternalErDslParser.g:921:1: rule__ERModel__Group_5__1 : rule__ERModel__Group_5__1__Impl ;
    public final void rule__ERModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:925:1: ( rule__ERModel__Group_5__1__Impl )
            // InternalErDslParser.g:926:2: rule__ERModel__Group_5__1__Impl
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
    // InternalErDslParser.g:932:1: rule__ERModel__Group_5__1__Impl : ( Semicolon ) ;
    public final void rule__ERModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:936:1: ( ( Semicolon ) )
            // InternalErDslParser.g:937:1: ( Semicolon )
            {
            // InternalErDslParser.g:937:1: ( Semicolon )
            // InternalErDslParser.g:938:2: Semicolon
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
    // InternalErDslParser.g:948:1: rule__ERModel__Group_6__0 : rule__ERModel__Group_6__0__Impl rule__ERModel__Group_6__1 ;
    public final void rule__ERModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:952:1: ( rule__ERModel__Group_6__0__Impl rule__ERModel__Group_6__1 )
            // InternalErDslParser.g:953:2: rule__ERModel__Group_6__0__Impl rule__ERModel__Group_6__1
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
    // InternalErDslParser.g:960:1: rule__ERModel__Group_6__0__Impl : ( Relationships ) ;
    public final void rule__ERModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:964:1: ( ( Relationships ) )
            // InternalErDslParser.g:965:1: ( Relationships )
            {
            // InternalErDslParser.g:965:1: ( Relationships )
            // InternalErDslParser.g:966:2: Relationships
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
    // InternalErDslParser.g:975:1: rule__ERModel__Group_6__1 : rule__ERModel__Group_6__1__Impl ;
    public final void rule__ERModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:979:1: ( rule__ERModel__Group_6__1__Impl )
            // InternalErDslParser.g:980:2: rule__ERModel__Group_6__1__Impl
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
    // InternalErDslParser.g:986:1: rule__ERModel__Group_6__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ERModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:990:1: ( ( LeftCurlyBracket ) )
            // InternalErDslParser.g:991:1: ( LeftCurlyBracket )
            {
            // InternalErDslParser.g:991:1: ( LeftCurlyBracket )
            // InternalErDslParser.g:992:2: LeftCurlyBracket
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
    // InternalErDslParser.g:1002:1: rule__ERModel__Group_8__0 : rule__ERModel__Group_8__0__Impl rule__ERModel__Group_8__1 ;
    public final void rule__ERModel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1006:1: ( rule__ERModel__Group_8__0__Impl rule__ERModel__Group_8__1 )
            // InternalErDslParser.g:1007:2: rule__ERModel__Group_8__0__Impl rule__ERModel__Group_8__1
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
    // InternalErDslParser.g:1014:1: rule__ERModel__Group_8__0__Impl : ( RightCurlyBracket ) ;
    public final void rule__ERModel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1018:1: ( ( RightCurlyBracket ) )
            // InternalErDslParser.g:1019:1: ( RightCurlyBracket )
            {
            // InternalErDslParser.g:1019:1: ( RightCurlyBracket )
            // InternalErDslParser.g:1020:2: RightCurlyBracket
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
    // InternalErDslParser.g:1029:1: rule__ERModel__Group_8__1 : rule__ERModel__Group_8__1__Impl ;
    public final void rule__ERModel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1033:1: ( rule__ERModel__Group_8__1__Impl )
            // InternalErDslParser.g:1034:2: rule__ERModel__Group_8__1__Impl
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
    // InternalErDslParser.g:1040:1: rule__ERModel__Group_8__1__Impl : ( Semicolon ) ;
    public final void rule__ERModel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1044:1: ( ( Semicolon ) )
            // InternalErDslParser.g:1045:1: ( Semicolon )
            {
            // InternalErDslParser.g:1045:1: ( Semicolon )
            // InternalErDslParser.g:1046:2: Semicolon
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
    // InternalErDslParser.g:1056:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1060:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalErDslParser.g:1061:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalErDslParser.g:1068:1: rule__Domain__Group__0__Impl : ( Domain ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1072:1: ( ( Domain ) )
            // InternalErDslParser.g:1073:1: ( Domain )
            {
            // InternalErDslParser.g:1073:1: ( Domain )
            // InternalErDslParser.g:1074:2: Domain
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
    // InternalErDslParser.g:1083:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1087:1: ( rule__Domain__Group__1__Impl )
            // InternalErDslParser.g:1088:2: rule__Domain__Group__1__Impl
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
    // InternalErDslParser.g:1094:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1098:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalErDslParser.g:1099:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalErDslParser.g:1099:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalErDslParser.g:1100:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalErDslParser.g:1101:2: ( rule__Domain__NameAssignment_1 )
            // InternalErDslParser.g:1101:3: rule__Domain__NameAssignment_1
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
    // InternalErDslParser.g:1110:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1114:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalErDslParser.g:1115:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalErDslParser.g:1122:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1126:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalErDslParser.g:1127:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalErDslParser.g:1127:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalErDslParser.g:1128:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalErDslParser.g:1129:2: ( rule__Attribute__NameAssignment_0 )
            // InternalErDslParser.g:1129:3: rule__Attribute__NameAssignment_0
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
    // InternalErDslParser.g:1137:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1141:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalErDslParser.g:1142:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalErDslParser.g:1149:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__TypeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1153:1: ( ( ( rule__Attribute__TypeAssignment_1 ) ) )
            // InternalErDslParser.g:1154:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            {
            // InternalErDslParser.g:1154:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            // InternalErDslParser.g:1155:2: ( rule__Attribute__TypeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 
            // InternalErDslParser.g:1156:2: ( rule__Attribute__TypeAssignment_1 )
            // InternalErDslParser.g:1156:3: rule__Attribute__TypeAssignment_1
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
    // InternalErDslParser.g:1164:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1168:1: ( rule__Attribute__Group__2__Impl )
            // InternalErDslParser.g:1169:2: rule__Attribute__Group__2__Impl
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
    // InternalErDslParser.g:1175:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__IsKeyAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1179:1: ( ( ( rule__Attribute__IsKeyAssignment_2 )? ) )
            // InternalErDslParser.g:1180:1: ( ( rule__Attribute__IsKeyAssignment_2 )? )
            {
            // InternalErDslParser.g:1180:1: ( ( rule__Attribute__IsKeyAssignment_2 )? )
            // InternalErDslParser.g:1181:2: ( rule__Attribute__IsKeyAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getIsKeyAssignment_2()); 
            // InternalErDslParser.g:1182:2: ( rule__Attribute__IsKeyAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IsIdentifier) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalErDslParser.g:1182:3: rule__Attribute__IsKeyAssignment_2
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
    // InternalErDslParser.g:1191:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1195:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalErDslParser.g:1196:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalErDslParser.g:1203:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1207:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // InternalErDslParser.g:1208:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // InternalErDslParser.g:1208:1: ( ( rule__Entity__NameAssignment_0 ) )
            // InternalErDslParser.g:1209:2: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // InternalErDslParser.g:1210:2: ( rule__Entity__NameAssignment_0 )
            // InternalErDslParser.g:1210:3: rule__Entity__NameAssignment_0
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
    // InternalErDslParser.g:1218:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1222:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalErDslParser.g:1223:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalErDslParser.g:1230:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__Group_1__0 )? ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1234:1: ( ( ( rule__Entity__Group_1__0 )? ) )
            // InternalErDslParser.g:1235:1: ( ( rule__Entity__Group_1__0 )? )
            {
            // InternalErDslParser.g:1235:1: ( ( rule__Entity__Group_1__0 )? )
            // InternalErDslParser.g:1236:2: ( rule__Entity__Group_1__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_1()); 
            // InternalErDslParser.g:1237:2: ( rule__Entity__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Is) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalErDslParser.g:1237:3: rule__Entity__Group_1__0
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
    // InternalErDslParser.g:1245:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1249:1: ( rule__Entity__Group__2__Impl )
            // InternalErDslParser.g:1250:2: rule__Entity__Group__2__Impl
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
    // InternalErDslParser.g:1256:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1260:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalErDslParser.g:1261:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalErDslParser.g:1261:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalErDslParser.g:1262:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalErDslParser.g:1263:2: ( rule__Entity__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LeftCurlyBracket) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalErDslParser.g:1263:3: rule__Entity__Group_2__0
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
    // InternalErDslParser.g:1272:1: rule__Entity__Group_1__0 : rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 ;
    public final void rule__Entity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1276:1: ( rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 )
            // InternalErDslParser.g:1277:2: rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1
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
    // InternalErDslParser.g:1284:1: rule__Entity__Group_1__0__Impl : ( Is ) ;
    public final void rule__Entity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1288:1: ( ( Is ) )
            // InternalErDslParser.g:1289:1: ( Is )
            {
            // InternalErDslParser.g:1289:1: ( Is )
            // InternalErDslParser.g:1290:2: Is
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
    // InternalErDslParser.g:1299:1: rule__Entity__Group_1__1 : rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2 ;
    public final void rule__Entity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1303:1: ( rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2 )
            // InternalErDslParser.g:1304:2: rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2
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
    // InternalErDslParser.g:1311:1: rule__Entity__Group_1__1__Impl : ( ( rule__Entity__GeneralizationAssignment_1_1 ) ) ;
    public final void rule__Entity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1315:1: ( ( ( rule__Entity__GeneralizationAssignment_1_1 ) ) )
            // InternalErDslParser.g:1316:1: ( ( rule__Entity__GeneralizationAssignment_1_1 ) )
            {
            // InternalErDslParser.g:1316:1: ( ( rule__Entity__GeneralizationAssignment_1_1 ) )
            // InternalErDslParser.g:1317:2: ( rule__Entity__GeneralizationAssignment_1_1 )
            {
             before(grammarAccess.getEntityAccess().getGeneralizationAssignment_1_1()); 
            // InternalErDslParser.g:1318:2: ( rule__Entity__GeneralizationAssignment_1_1 )
            // InternalErDslParser.g:1318:3: rule__Entity__GeneralizationAssignment_1_1
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
    // InternalErDslParser.g:1326:1: rule__Entity__Group_1__2 : rule__Entity__Group_1__2__Impl ;
    public final void rule__Entity__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1330:1: ( rule__Entity__Group_1__2__Impl )
            // InternalErDslParser.g:1331:2: rule__Entity__Group_1__2__Impl
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
    // InternalErDslParser.g:1337:1: rule__Entity__Group_1__2__Impl : ( ( rule__Entity__IsAssignment_1_2 ) ) ;
    public final void rule__Entity__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1341:1: ( ( ( rule__Entity__IsAssignment_1_2 ) ) )
            // InternalErDslParser.g:1342:1: ( ( rule__Entity__IsAssignment_1_2 ) )
            {
            // InternalErDslParser.g:1342:1: ( ( rule__Entity__IsAssignment_1_2 ) )
            // InternalErDslParser.g:1343:2: ( rule__Entity__IsAssignment_1_2 )
            {
             before(grammarAccess.getEntityAccess().getIsAssignment_1_2()); 
            // InternalErDslParser.g:1344:2: ( rule__Entity__IsAssignment_1_2 )
            // InternalErDslParser.g:1344:3: rule__Entity__IsAssignment_1_2
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
    // InternalErDslParser.g:1353:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1357:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalErDslParser.g:1358:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
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
    // InternalErDslParser.g:1365:1: rule__Entity__Group_2__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1369:1: ( ( LeftCurlyBracket ) )
            // InternalErDslParser.g:1370:1: ( LeftCurlyBracket )
            {
            // InternalErDslParser.g:1370:1: ( LeftCurlyBracket )
            // InternalErDslParser.g:1371:2: LeftCurlyBracket
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
    // InternalErDslParser.g:1380:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1384:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // InternalErDslParser.g:1385:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
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
    // InternalErDslParser.g:1392:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1396:1: ( ( ( rule__Entity__AttributesAssignment_2_1 ) ) )
            // InternalErDslParser.g:1397:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            {
            // InternalErDslParser.g:1397:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            // InternalErDslParser.g:1398:2: ( rule__Entity__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_1()); 
            // InternalErDslParser.g:1399:2: ( rule__Entity__AttributesAssignment_2_1 )
            // InternalErDslParser.g:1399:3: rule__Entity__AttributesAssignment_2_1
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
    // InternalErDslParser.g:1407:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1411:1: ( rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 )
            // InternalErDslParser.g:1412:2: rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3
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
    // InternalErDslParser.g:1419:1: rule__Entity__Group_2__2__Impl : ( ( rule__Entity__Group_2_2__0 )* ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1423:1: ( ( ( rule__Entity__Group_2_2__0 )* ) )
            // InternalErDslParser.g:1424:1: ( ( rule__Entity__Group_2_2__0 )* )
            {
            // InternalErDslParser.g:1424:1: ( ( rule__Entity__Group_2_2__0 )* )
            // InternalErDslParser.g:1425:2: ( rule__Entity__Group_2_2__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_2_2()); 
            // InternalErDslParser.g:1426:2: ( rule__Entity__Group_2_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalErDslParser.g:1426:3: rule__Entity__Group_2_2__0
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
    // InternalErDslParser.g:1434:1: rule__Entity__Group_2__3 : rule__Entity__Group_2__3__Impl ;
    public final void rule__Entity__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1438:1: ( rule__Entity__Group_2__3__Impl )
            // InternalErDslParser.g:1439:2: rule__Entity__Group_2__3__Impl
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
    // InternalErDslParser.g:1445:1: rule__Entity__Group_2__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Entity__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1449:1: ( ( RightCurlyBracket ) )
            // InternalErDslParser.g:1450:1: ( RightCurlyBracket )
            {
            // InternalErDslParser.g:1450:1: ( RightCurlyBracket )
            // InternalErDslParser.g:1451:2: RightCurlyBracket
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
    // InternalErDslParser.g:1461:1: rule__Entity__Group_2_2__0 : rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 ;
    public final void rule__Entity__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1465:1: ( rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 )
            // InternalErDslParser.g:1466:2: rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1
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
    // InternalErDslParser.g:1473:1: rule__Entity__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__Entity__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1477:1: ( ( Comma ) )
            // InternalErDslParser.g:1478:1: ( Comma )
            {
            // InternalErDslParser.g:1478:1: ( Comma )
            // InternalErDslParser.g:1479:2: Comma
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
    // InternalErDslParser.g:1488:1: rule__Entity__Group_2_2__1 : rule__Entity__Group_2_2__1__Impl ;
    public final void rule__Entity__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1492:1: ( rule__Entity__Group_2_2__1__Impl )
            // InternalErDslParser.g:1493:2: rule__Entity__Group_2_2__1__Impl
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
    // InternalErDslParser.g:1499:1: rule__Entity__Group_2_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Entity__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1503:1: ( ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) )
            // InternalErDslParser.g:1504:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDslParser.g:1504:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            // InternalErDslParser.g:1505:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDslParser.g:1506:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            // InternalErDslParser.g:1506:3: rule__Entity__AttributesAssignment_2_2_1
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
    // InternalErDslParser.g:1515:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1519:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalErDslParser.g:1520:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
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
    // InternalErDslParser.g:1527:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__NameAssignment_0 )? ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1531:1: ( ( ( rule__Relation__NameAssignment_0 )? ) )
            // InternalErDslParser.g:1532:1: ( ( rule__Relation__NameAssignment_0 )? )
            {
            // InternalErDslParser.g:1532:1: ( ( rule__Relation__NameAssignment_0 )? )
            // InternalErDslParser.g:1533:2: ( rule__Relation__NameAssignment_0 )?
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_0()); 
            // InternalErDslParser.g:1534:2: ( rule__Relation__NameAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalErDslParser.g:1534:3: rule__Relation__NameAssignment_0
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
    // InternalErDslParser.g:1542:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1546:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalErDslParser.g:1547:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
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
    // InternalErDslParser.g:1554:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__Group_1__0 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1558:1: ( ( ( rule__Relation__Group_1__0 ) ) )
            // InternalErDslParser.g:1559:1: ( ( rule__Relation__Group_1__0 ) )
            {
            // InternalErDslParser.g:1559:1: ( ( rule__Relation__Group_1__0 ) )
            // InternalErDslParser.g:1560:2: ( rule__Relation__Group_1__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_1()); 
            // InternalErDslParser.g:1561:2: ( rule__Relation__Group_1__0 )
            // InternalErDslParser.g:1561:3: rule__Relation__Group_1__0
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
    // InternalErDslParser.g:1569:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1573:1: ( rule__Relation__Group__2__Impl )
            // InternalErDslParser.g:1574:2: rule__Relation__Group__2__Impl
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
    // InternalErDslParser.g:1580:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__Group_2__0 )* ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1584:1: ( ( ( rule__Relation__Group_2__0 )* ) )
            // InternalErDslParser.g:1585:1: ( ( rule__Relation__Group_2__0 )* )
            {
            // InternalErDslParser.g:1585:1: ( ( rule__Relation__Group_2__0 )* )
            // InternalErDslParser.g:1586:2: ( rule__Relation__Group_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2()); 
            // InternalErDslParser.g:1587:2: ( rule__Relation__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==LeftCurlyBracket) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalErDslParser.g:1587:3: rule__Relation__Group_2__0
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
    // InternalErDslParser.g:1596:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1600:1: ( rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 )
            // InternalErDslParser.g:1601:2: rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1
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
    // InternalErDslParser.g:1608:1: rule__Relation__Group_1__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1612:1: ( ( LeftSquareBracket ) )
            // InternalErDslParser.g:1613:1: ( LeftSquareBracket )
            {
            // InternalErDslParser.g:1613:1: ( LeftSquareBracket )
            // InternalErDslParser.g:1614:2: LeftSquareBracket
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
    // InternalErDslParser.g:1623:1: rule__Relation__Group_1__1 : rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 ;
    public final void rule__Relation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1627:1: ( rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 )
            // InternalErDslParser.g:1628:2: rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2
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
    // InternalErDslParser.g:1635:1: rule__Relation__Group_1__1__Impl : ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) ;
    public final void rule__Relation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1639:1: ( ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) )
            // InternalErDslParser.g:1640:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            {
            // InternalErDslParser.g:1640:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            // InternalErDslParser.g:1641:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            {
             before(grammarAccess.getRelationAccess().getLeftEndingAssignment_1_1()); 
            // InternalErDslParser.g:1642:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            // InternalErDslParser.g:1642:3: rule__Relation__LeftEndingAssignment_1_1
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
    // InternalErDslParser.g:1650:1: rule__Relation__Group_1__2 : rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 ;
    public final void rule__Relation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1654:1: ( rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 )
            // InternalErDslParser.g:1655:2: rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3
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
    // InternalErDslParser.g:1662:1: rule__Relation__Group_1__2__Impl : ( Relates ) ;
    public final void rule__Relation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1666:1: ( ( Relates ) )
            // InternalErDslParser.g:1667:1: ( Relates )
            {
            // InternalErDslParser.g:1667:1: ( Relates )
            // InternalErDslParser.g:1668:2: Relates
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
    // InternalErDslParser.g:1677:1: rule__Relation__Group_1__3 : rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 ;
    public final void rule__Relation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1681:1: ( rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 )
            // InternalErDslParser.g:1682:2: rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4
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
    // InternalErDslParser.g:1689:1: rule__Relation__Group_1__3__Impl : ( ( rule__Relation__RightEndingAssignment_1_3 ) ) ;
    public final void rule__Relation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1693:1: ( ( ( rule__Relation__RightEndingAssignment_1_3 ) ) )
            // InternalErDslParser.g:1694:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            {
            // InternalErDslParser.g:1694:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            // InternalErDslParser.g:1695:2: ( rule__Relation__RightEndingAssignment_1_3 )
            {
             before(grammarAccess.getRelationAccess().getRightEndingAssignment_1_3()); 
            // InternalErDslParser.g:1696:2: ( rule__Relation__RightEndingAssignment_1_3 )
            // InternalErDslParser.g:1696:3: rule__Relation__RightEndingAssignment_1_3
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
    // InternalErDslParser.g:1704:1: rule__Relation__Group_1__4 : rule__Relation__Group_1__4__Impl ;
    public final void rule__Relation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1708:1: ( rule__Relation__Group_1__4__Impl )
            // InternalErDslParser.g:1709:2: rule__Relation__Group_1__4__Impl
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
    // InternalErDslParser.g:1715:1: rule__Relation__Group_1__4__Impl : ( RightSquareBracket ) ;
    public final void rule__Relation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1719:1: ( ( RightSquareBracket ) )
            // InternalErDslParser.g:1720:1: ( RightSquareBracket )
            {
            // InternalErDslParser.g:1720:1: ( RightSquareBracket )
            // InternalErDslParser.g:1721:2: RightSquareBracket
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
    // InternalErDslParser.g:1731:1: rule__Relation__Group_2__0 : rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 ;
    public final void rule__Relation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1735:1: ( rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 )
            // InternalErDslParser.g:1736:2: rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1
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
    // InternalErDslParser.g:1743:1: rule__Relation__Group_2__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Relation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1747:1: ( ( LeftCurlyBracket ) )
            // InternalErDslParser.g:1748:1: ( LeftCurlyBracket )
            {
            // InternalErDslParser.g:1748:1: ( LeftCurlyBracket )
            // InternalErDslParser.g:1749:2: LeftCurlyBracket
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
    // InternalErDslParser.g:1758:1: rule__Relation__Group_2__1 : rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 ;
    public final void rule__Relation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1762:1: ( rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 )
            // InternalErDslParser.g:1763:2: rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2
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
    // InternalErDslParser.g:1770:1: rule__Relation__Group_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_1 ) ) ;
    public final void rule__Relation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1774:1: ( ( ( rule__Relation__AttributesAssignment_2_1 ) ) )
            // InternalErDslParser.g:1775:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            {
            // InternalErDslParser.g:1775:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            // InternalErDslParser.g:1776:2: ( rule__Relation__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_1()); 
            // InternalErDslParser.g:1777:2: ( rule__Relation__AttributesAssignment_2_1 )
            // InternalErDslParser.g:1777:3: rule__Relation__AttributesAssignment_2_1
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
    // InternalErDslParser.g:1785:1: rule__Relation__Group_2__2 : rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 ;
    public final void rule__Relation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1789:1: ( rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 )
            // InternalErDslParser.g:1790:2: rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3
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
    // InternalErDslParser.g:1797:1: rule__Relation__Group_2__2__Impl : ( ( rule__Relation__Group_2_2__0 )* ) ;
    public final void rule__Relation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1801:1: ( ( ( rule__Relation__Group_2_2__0 )* ) )
            // InternalErDslParser.g:1802:1: ( ( rule__Relation__Group_2_2__0 )* )
            {
            // InternalErDslParser.g:1802:1: ( ( rule__Relation__Group_2_2__0 )* )
            // InternalErDslParser.g:1803:2: ( rule__Relation__Group_2_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2_2()); 
            // InternalErDslParser.g:1804:2: ( rule__Relation__Group_2_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Comma) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalErDslParser.g:1804:3: rule__Relation__Group_2_2__0
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
    // InternalErDslParser.g:1812:1: rule__Relation__Group_2__3 : rule__Relation__Group_2__3__Impl ;
    public final void rule__Relation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1816:1: ( rule__Relation__Group_2__3__Impl )
            // InternalErDslParser.g:1817:2: rule__Relation__Group_2__3__Impl
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
    // InternalErDslParser.g:1823:1: rule__Relation__Group_2__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__Relation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1827:1: ( ( RightCurlyBracket ) )
            // InternalErDslParser.g:1828:1: ( RightCurlyBracket )
            {
            // InternalErDslParser.g:1828:1: ( RightCurlyBracket )
            // InternalErDslParser.g:1829:2: RightCurlyBracket
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
    // InternalErDslParser.g:1839:1: rule__Relation__Group_2_2__0 : rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 ;
    public final void rule__Relation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1843:1: ( rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 )
            // InternalErDslParser.g:1844:2: rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1
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
    // InternalErDslParser.g:1851:1: rule__Relation__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__Relation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1855:1: ( ( Comma ) )
            // InternalErDslParser.g:1856:1: ( Comma )
            {
            // InternalErDslParser.g:1856:1: ( Comma )
            // InternalErDslParser.g:1857:2: Comma
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
    // InternalErDslParser.g:1866:1: rule__Relation__Group_2_2__1 : rule__Relation__Group_2_2__1__Impl ;
    public final void rule__Relation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1870:1: ( rule__Relation__Group_2_2__1__Impl )
            // InternalErDslParser.g:1871:2: rule__Relation__Group_2_2__1__Impl
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
    // InternalErDslParser.g:1877:1: rule__Relation__Group_2_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Relation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1881:1: ( ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) )
            // InternalErDslParser.g:1882:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDslParser.g:1882:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            // InternalErDslParser.g:1883:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDslParser.g:1884:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            // InternalErDslParser.g:1884:3: rule__Relation__AttributesAssignment_2_2_1
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
    // InternalErDslParser.g:1893:1: rule__RelationSideRight__Group_0__0 : rule__RelationSideRight__Group_0__0__Impl rule__RelationSideRight__Group_0__1 ;
    public final void rule__RelationSideRight__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1897:1: ( rule__RelationSideRight__Group_0__0__Impl rule__RelationSideRight__Group_0__1 )
            // InternalErDslParser.g:1898:2: rule__RelationSideRight__Group_0__0__Impl rule__RelationSideRight__Group_0__1
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
    // InternalErDslParser.g:1905:1: rule__RelationSideRight__Group_0__0__Impl : ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) ) ;
    public final void rule__RelationSideRight__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1909:1: ( ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) ) )
            // InternalErDslParser.g:1910:1: ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) )
            {
            // InternalErDslParser.g:1910:1: ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) )
            // InternalErDslParser.g:1911:2: ( rule__RelationSideRight__CardinalityAssignment_0_0 )
            {
             before(grammarAccess.getRelationSideRightAccess().getCardinalityAssignment_0_0()); 
            // InternalErDslParser.g:1912:2: ( rule__RelationSideRight__CardinalityAssignment_0_0 )
            // InternalErDslParser.g:1912:3: rule__RelationSideRight__CardinalityAssignment_0_0
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
    // InternalErDslParser.g:1920:1: rule__RelationSideRight__Group_0__1 : rule__RelationSideRight__Group_0__1__Impl ;
    public final void rule__RelationSideRight__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1924:1: ( rule__RelationSideRight__Group_0__1__Impl )
            // InternalErDslParser.g:1925:2: rule__RelationSideRight__Group_0__1__Impl
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
    // InternalErDslParser.g:1931:1: rule__RelationSideRight__Group_0__1__Impl : ( ( rule__RelationSideRight__TargetAssignment_0_1 ) ) ;
    public final void rule__RelationSideRight__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1935:1: ( ( ( rule__RelationSideRight__TargetAssignment_0_1 ) ) )
            // InternalErDslParser.g:1936:1: ( ( rule__RelationSideRight__TargetAssignment_0_1 ) )
            {
            // InternalErDslParser.g:1936:1: ( ( rule__RelationSideRight__TargetAssignment_0_1 ) )
            // InternalErDslParser.g:1937:2: ( rule__RelationSideRight__TargetAssignment_0_1 )
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetAssignment_0_1()); 
            // InternalErDslParser.g:1938:2: ( rule__RelationSideRight__TargetAssignment_0_1 )
            // InternalErDslParser.g:1938:3: rule__RelationSideRight__TargetAssignment_0_1
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
    // InternalErDslParser.g:1947:1: rule__RelationSideLeft__Group_1__0 : rule__RelationSideLeft__Group_1__0__Impl rule__RelationSideLeft__Group_1__1 ;
    public final void rule__RelationSideLeft__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1951:1: ( rule__RelationSideLeft__Group_1__0__Impl rule__RelationSideLeft__Group_1__1 )
            // InternalErDslParser.g:1952:2: rule__RelationSideLeft__Group_1__0__Impl rule__RelationSideLeft__Group_1__1
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
    // InternalErDslParser.g:1959:1: rule__RelationSideLeft__Group_1__0__Impl : ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) ) ;
    public final void rule__RelationSideLeft__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1963:1: ( ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) ) )
            // InternalErDslParser.g:1964:1: ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) )
            {
            // InternalErDslParser.g:1964:1: ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) )
            // InternalErDslParser.g:1965:2: ( rule__RelationSideLeft__TargetAssignment_1_0 )
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetAssignment_1_0()); 
            // InternalErDslParser.g:1966:2: ( rule__RelationSideLeft__TargetAssignment_1_0 )
            // InternalErDslParser.g:1966:3: rule__RelationSideLeft__TargetAssignment_1_0
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
    // InternalErDslParser.g:1974:1: rule__RelationSideLeft__Group_1__1 : rule__RelationSideLeft__Group_1__1__Impl ;
    public final void rule__RelationSideLeft__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1978:1: ( rule__RelationSideLeft__Group_1__1__Impl )
            // InternalErDslParser.g:1979:2: rule__RelationSideLeft__Group_1__1__Impl
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
    // InternalErDslParser.g:1985:1: rule__RelationSideLeft__Group_1__1__Impl : ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) ) ;
    public final void rule__RelationSideLeft__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:1989:1: ( ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) ) )
            // InternalErDslParser.g:1990:1: ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) )
            {
            // InternalErDslParser.g:1990:1: ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) )
            // InternalErDslParser.g:1991:2: ( rule__RelationSideLeft__CardinalityAssignment_1_1 )
            {
             before(grammarAccess.getRelationSideLeftAccess().getCardinalityAssignment_1_1()); 
            // InternalErDslParser.g:1992:2: ( rule__RelationSideLeft__CardinalityAssignment_1_1 )
            // InternalErDslParser.g:1992:3: rule__RelationSideLeft__CardinalityAssignment_1_1
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
    // InternalErDslParser.g:2001:1: rule__ERModel__TargetGeneratorAssignment_0_1 : ( ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 ) ) ;
    public final void rule__ERModel__TargetGeneratorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2005:1: ( ( ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 ) ) )
            // InternalErDslParser.g:2006:2: ( ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 ) )
            {
            // InternalErDslParser.g:2006:2: ( ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 ) )
            // InternalErDslParser.g:2007:3: ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 )
            {
             before(grammarAccess.getERModelAccess().getTargetGeneratorAlternatives_0_1_0()); 
            // InternalErDslParser.g:2008:3: ( rule__ERModel__TargetGeneratorAlternatives_0_1_0 )
            // InternalErDslParser.g:2008:4: rule__ERModel__TargetGeneratorAlternatives_0_1_0
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
    // InternalErDslParser.g:2016:1: rule__ERModel__DomainAssignment_1 : ( ruleDomain ) ;
    public final void rule__ERModel__DomainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2020:1: ( ( ruleDomain ) )
            // InternalErDslParser.g:2021:2: ( ruleDomain )
            {
            // InternalErDslParser.g:2021:2: ( ruleDomain )
            // InternalErDslParser.g:2022:3: ruleDomain
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
    // InternalErDslParser.g:2031:1: rule__ERModel__EntitiesAssignment_4 : ( ruleEntity ) ;
    public final void rule__ERModel__EntitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2035:1: ( ( ruleEntity ) )
            // InternalErDslParser.g:2036:2: ( ruleEntity )
            {
            // InternalErDslParser.g:2036:2: ( ruleEntity )
            // InternalErDslParser.g:2037:3: ruleEntity
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
    // InternalErDslParser.g:2046:1: rule__ERModel__RelationsAssignment_7 : ( ruleRelation ) ;
    public final void rule__ERModel__RelationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2050:1: ( ( ruleRelation ) )
            // InternalErDslParser.g:2051:2: ( ruleRelation )
            {
            // InternalErDslParser.g:2051:2: ( ruleRelation )
            // InternalErDslParser.g:2052:3: ruleRelation
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
    // InternalErDslParser.g:2061:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2065:1: ( ( RULE_ID ) )
            // InternalErDslParser.g:2066:2: ( RULE_ID )
            {
            // InternalErDslParser.g:2066:2: ( RULE_ID )
            // InternalErDslParser.g:2067:3: RULE_ID
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
    // InternalErDslParser.g:2076:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2080:1: ( ( RULE_ID ) )
            // InternalErDslParser.g:2081:2: ( RULE_ID )
            {
            // InternalErDslParser.g:2081:2: ( RULE_ID )
            // InternalErDslParser.g:2082:3: RULE_ID
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
    // InternalErDslParser.g:2091:1: rule__Attribute__TypeAssignment_1 : ( ruleDataType ) ;
    public final void rule__Attribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2095:1: ( ( ruleDataType ) )
            // InternalErDslParser.g:2096:2: ( ruleDataType )
            {
            // InternalErDslParser.g:2096:2: ( ruleDataType )
            // InternalErDslParser.g:2097:3: ruleDataType
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
    // InternalErDslParser.g:2106:1: rule__Attribute__IsKeyAssignment_2 : ( ( IsIdentifier ) ) ;
    public final void rule__Attribute__IsKeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2110:1: ( ( ( IsIdentifier ) ) )
            // InternalErDslParser.g:2111:2: ( ( IsIdentifier ) )
            {
            // InternalErDslParser.g:2111:2: ( ( IsIdentifier ) )
            // InternalErDslParser.g:2112:3: ( IsIdentifier )
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_2_0()); 
            // InternalErDslParser.g:2113:3: ( IsIdentifier )
            // InternalErDslParser.g:2114:4: IsIdentifier
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
    // InternalErDslParser.g:2125:1: rule__Entity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2129:1: ( ( RULE_ID ) )
            // InternalErDslParser.g:2130:2: ( RULE_ID )
            {
            // InternalErDslParser.g:2130:2: ( RULE_ID )
            // InternalErDslParser.g:2131:3: RULE_ID
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
    // InternalErDslParser.g:2140:1: rule__Entity__GeneralizationAssignment_1_1 : ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) ) ;
    public final void rule__Entity__GeneralizationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2144:1: ( ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) ) )
            // InternalErDslParser.g:2145:2: ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) )
            {
            // InternalErDslParser.g:2145:2: ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) )
            // InternalErDslParser.g:2146:3: ( rule__Entity__GeneralizationAlternatives_1_1_0 )
            {
             before(grammarAccess.getEntityAccess().getGeneralizationAlternatives_1_1_0()); 
            // InternalErDslParser.g:2147:3: ( rule__Entity__GeneralizationAlternatives_1_1_0 )
            // InternalErDslParser.g:2147:4: rule__Entity__GeneralizationAlternatives_1_1_0
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
    // InternalErDslParser.g:2155:1: rule__Entity__IsAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__IsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2159:1: ( ( ( RULE_ID ) ) )
            // InternalErDslParser.g:2160:2: ( ( RULE_ID ) )
            {
            // InternalErDslParser.g:2160:2: ( ( RULE_ID ) )
            // InternalErDslParser.g:2161:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getIsEntityCrossReference_1_2_0()); 
            // InternalErDslParser.g:2162:3: ( RULE_ID )
            // InternalErDslParser.g:2163:4: RULE_ID
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
    // InternalErDslParser.g:2174:1: rule__Entity__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2178:1: ( ( ruleAttribute ) )
            // InternalErDslParser.g:2179:2: ( ruleAttribute )
            {
            // InternalErDslParser.g:2179:2: ( ruleAttribute )
            // InternalErDslParser.g:2180:3: ruleAttribute
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
    // InternalErDslParser.g:2189:1: rule__Entity__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2193:1: ( ( ruleAttribute ) )
            // InternalErDslParser.g:2194:2: ( ruleAttribute )
            {
            // InternalErDslParser.g:2194:2: ( ruleAttribute )
            // InternalErDslParser.g:2195:3: ruleAttribute
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
    // InternalErDslParser.g:2204:1: rule__Relation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2208:1: ( ( RULE_ID ) )
            // InternalErDslParser.g:2209:2: ( RULE_ID )
            {
            // InternalErDslParser.g:2209:2: ( RULE_ID )
            // InternalErDslParser.g:2210:3: RULE_ID
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
    // InternalErDslParser.g:2219:1: rule__Relation__LeftEndingAssignment_1_1 : ( ruleRelationSideLeft ) ;
    public final void rule__Relation__LeftEndingAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2223:1: ( ( ruleRelationSideLeft ) )
            // InternalErDslParser.g:2224:2: ( ruleRelationSideLeft )
            {
            // InternalErDslParser.g:2224:2: ( ruleRelationSideLeft )
            // InternalErDslParser.g:2225:3: ruleRelationSideLeft
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
    // InternalErDslParser.g:2234:1: rule__Relation__RightEndingAssignment_1_3 : ( ruleRelationSideRight ) ;
    public final void rule__Relation__RightEndingAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2238:1: ( ( ruleRelationSideRight ) )
            // InternalErDslParser.g:2239:2: ( ruleRelationSideRight )
            {
            // InternalErDslParser.g:2239:2: ( ruleRelationSideRight )
            // InternalErDslParser.g:2240:3: ruleRelationSideRight
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
    // InternalErDslParser.g:2249:1: rule__Relation__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2253:1: ( ( ruleAttribute ) )
            // InternalErDslParser.g:2254:2: ( ruleAttribute )
            {
            // InternalErDslParser.g:2254:2: ( ruleAttribute )
            // InternalErDslParser.g:2255:3: ruleAttribute
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
    // InternalErDslParser.g:2264:1: rule__Relation__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2268:1: ( ( ruleAttribute ) )
            // InternalErDslParser.g:2269:2: ( ruleAttribute )
            {
            // InternalErDslParser.g:2269:2: ( ruleAttribute )
            // InternalErDslParser.g:2270:3: ruleAttribute
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
    // InternalErDslParser.g:2279:1: rule__RelationSideRight__CardinalityAssignment_0_0 : ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) ) ;
    public final void rule__RelationSideRight__CardinalityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2283:1: ( ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) ) )
            // InternalErDslParser.g:2284:2: ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) )
            {
            // InternalErDslParser.g:2284:2: ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) )
            // InternalErDslParser.g:2285:3: ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 )
            {
             before(grammarAccess.getRelationSideRightAccess().getCardinalityAlternatives_0_0_0()); 
            // InternalErDslParser.g:2286:3: ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 )
            // InternalErDslParser.g:2286:4: rule__RelationSideRight__CardinalityAlternatives_0_0_0
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
    // InternalErDslParser.g:2294:1: rule__RelationSideRight__TargetAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideRight__TargetAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2298:1: ( ( ( RULE_ID ) ) )
            // InternalErDslParser.g:2299:2: ( ( RULE_ID ) )
            {
            // InternalErDslParser.g:2299:2: ( ( RULE_ID ) )
            // InternalErDslParser.g:2300:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetEntityCrossReference_0_1_0()); 
            // InternalErDslParser.g:2301:3: ( RULE_ID )
            // InternalErDslParser.g:2302:4: RULE_ID
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
    // InternalErDslParser.g:2313:1: rule__RelationSideRight__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideRight__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2317:1: ( ( ( RULE_ID ) ) )
            // InternalErDslParser.g:2318:2: ( ( RULE_ID ) )
            {
            // InternalErDslParser.g:2318:2: ( ( RULE_ID ) )
            // InternalErDslParser.g:2319:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetRelationCrossReference_1_0()); 
            // InternalErDslParser.g:2320:3: ( RULE_ID )
            // InternalErDslParser.g:2321:4: RULE_ID
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
    // InternalErDslParser.g:2332:1: rule__RelationSideLeft__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideLeft__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2336:1: ( ( ( RULE_ID ) ) )
            // InternalErDslParser.g:2337:2: ( ( RULE_ID ) )
            {
            // InternalErDslParser.g:2337:2: ( ( RULE_ID ) )
            // InternalErDslParser.g:2338:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetEntityCrossReference_0_0()); 
            // InternalErDslParser.g:2339:3: ( RULE_ID )
            // InternalErDslParser.g:2340:4: RULE_ID
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
    // InternalErDslParser.g:2351:1: rule__RelationSideLeft__TargetAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideLeft__TargetAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2355:1: ( ( ( RULE_ID ) ) )
            // InternalErDslParser.g:2356:2: ( ( RULE_ID ) )
            {
            // InternalErDslParser.g:2356:2: ( ( RULE_ID ) )
            // InternalErDslParser.g:2357:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetRelationCrossReference_1_0_0()); 
            // InternalErDslParser.g:2358:3: ( RULE_ID )
            // InternalErDslParser.g:2359:4: RULE_ID
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
    // InternalErDslParser.g:2370:1: rule__RelationSideLeft__CardinalityAssignment_1_1 : ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) ) ;
    public final void rule__RelationSideLeft__CardinalityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDslParser.g:2374:1: ( ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) ) )
            // InternalErDslParser.g:2375:2: ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) )
            {
            // InternalErDslParser.g:2375:2: ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) )
            // InternalErDslParser.g:2376:3: ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 )
            {
             before(grammarAccess.getRelationSideLeftAccess().getCardinalityAlternatives_1_1_0()); 
            // InternalErDslParser.g:2377:3: ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 )
            // InternalErDslParser.g:2377:4: rule__RelationSideLeft__CardinalityAlternatives_1_1_0
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000003200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002200000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000012008900L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000002C194000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002001E00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001E00000L});

}