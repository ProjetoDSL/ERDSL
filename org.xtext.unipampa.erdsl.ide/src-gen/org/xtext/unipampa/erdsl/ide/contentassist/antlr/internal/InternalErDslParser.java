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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'total/disjoint'", "'total/Overlapped'", "'partial/disjoint'", "'partial/overlapped'", "'(0:1)'", "'(1:1)'", "'(0:N)'", "'(1:N)'", "'int'", "'double'", "'money'", "'string'", "'boolean'", "'datetime'", "'file'", "';'", "'Entities'", "'{'", "'}'", "'Relationships'", "'Domain'", "'is'", "','", "'['", "'relates'", "']'", "'isIdentifier'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
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


    // $ANTLR start "rule__Entity__GeneralizationAlternatives_1_1_0"
    // InternalErDsl.g:243:1: rule__Entity__GeneralizationAlternatives_1_1_0 : ( ( 'total/disjoint' ) | ( 'total/Overlapped' ) | ( 'partial/disjoint' ) | ( 'partial/overlapped' ) );
    public final void rule__Entity__GeneralizationAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:247:1: ( ( 'total/disjoint' ) | ( 'total/Overlapped' ) | ( 'partial/disjoint' ) | ( 'partial/overlapped' ) )
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
                    // InternalErDsl.g:248:2: ( 'total/disjoint' )
                    {
                    // InternalErDsl.g:248:2: ( 'total/disjoint' )
                    // InternalErDsl.g:249:3: 'total/disjoint'
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationTotalDisjointKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getGeneralizationTotalDisjointKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:254:2: ( 'total/Overlapped' )
                    {
                    // InternalErDsl.g:254:2: ( 'total/Overlapped' )
                    // InternalErDsl.g:255:3: 'total/Overlapped'
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationTotalOverlappedKeyword_1_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getGeneralizationTotalOverlappedKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl.g:260:2: ( 'partial/disjoint' )
                    {
                    // InternalErDsl.g:260:2: ( 'partial/disjoint' )
                    // InternalErDsl.g:261:3: 'partial/disjoint'
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationPartialDisjointKeyword_1_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEntityAccess().getGeneralizationPartialDisjointKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl.g:266:2: ( 'partial/overlapped' )
                    {
                    // InternalErDsl.g:266:2: ( 'partial/overlapped' )
                    // InternalErDsl.g:267:3: 'partial/overlapped'
                    {
                     before(grammarAccess.getEntityAccess().getGeneralizationPartialOverlappedKeyword_1_1_0_3()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalErDsl.g:276:1: rule__RelationSideRight__Alternatives : ( ( ( rule__RelationSideRight__Group_0__0 ) ) | ( ( rule__RelationSideRight__TargetAssignment_1 ) ) );
    public final void rule__RelationSideRight__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:280:1: ( ( ( rule__RelationSideRight__Group_0__0 ) ) | ( ( rule__RelationSideRight__TargetAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=15 && LA2_0<=18)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalErDsl.g:281:2: ( ( rule__RelationSideRight__Group_0__0 ) )
                    {
                    // InternalErDsl.g:281:2: ( ( rule__RelationSideRight__Group_0__0 ) )
                    // InternalErDsl.g:282:3: ( rule__RelationSideRight__Group_0__0 )
                    {
                     before(grammarAccess.getRelationSideRightAccess().getGroup_0()); 
                    // InternalErDsl.g:283:3: ( rule__RelationSideRight__Group_0__0 )
                    // InternalErDsl.g:283:4: rule__RelationSideRight__Group_0__0
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
                    // InternalErDsl.g:287:2: ( ( rule__RelationSideRight__TargetAssignment_1 ) )
                    {
                    // InternalErDsl.g:287:2: ( ( rule__RelationSideRight__TargetAssignment_1 ) )
                    // InternalErDsl.g:288:3: ( rule__RelationSideRight__TargetAssignment_1 )
                    {
                     before(grammarAccess.getRelationSideRightAccess().getTargetAssignment_1()); 
                    // InternalErDsl.g:289:3: ( rule__RelationSideRight__TargetAssignment_1 )
                    // InternalErDsl.g:289:4: rule__RelationSideRight__TargetAssignment_1
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
    // InternalErDsl.g:297:1: rule__RelationSideRight__CardinalityAlternatives_0_0_0 : ( ( '(0:1)' ) | ( '(1:1)' ) | ( '(0:N)' ) | ( '(1:N)' ) );
    public final void rule__RelationSideRight__CardinalityAlternatives_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:301:1: ( ( '(0:1)' ) | ( '(1:1)' ) | ( '(0:N)' ) | ( '(1:N)' ) )
            int alt3=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalErDsl.g:302:2: ( '(0:1)' )
                    {
                    // InternalErDsl.g:302:2: ( '(0:1)' )
                    // InternalErDsl.g:303:3: '(0:1)'
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality01Keyword_0_0_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRelationSideRightAccess().getCardinality01Keyword_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:308:2: ( '(1:1)' )
                    {
                    // InternalErDsl.g:308:2: ( '(1:1)' )
                    // InternalErDsl.g:309:3: '(1:1)'
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality11Keyword_0_0_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getRelationSideRightAccess().getCardinality11Keyword_0_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl.g:314:2: ( '(0:N)' )
                    {
                    // InternalErDsl.g:314:2: ( '(0:N)' )
                    // InternalErDsl.g:315:3: '(0:N)'
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality0NKeyword_0_0_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getRelationSideRightAccess().getCardinality0NKeyword_0_0_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl.g:320:2: ( '(1:N)' )
                    {
                    // InternalErDsl.g:320:2: ( '(1:N)' )
                    // InternalErDsl.g:321:3: '(1:N)'
                    {
                     before(grammarAccess.getRelationSideRightAccess().getCardinality1NKeyword_0_0_0_3()); 
                    match(input,18,FOLLOW_2); 
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
    // InternalErDsl.g:330:1: rule__RelationSideLeft__Alternatives : ( ( ( rule__RelationSideLeft__TargetAssignment_0 ) ) | ( ( rule__RelationSideLeft__Group_1__0 ) ) );
    public final void rule__RelationSideLeft__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:334:1: ( ( ( rule__RelationSideLeft__TargetAssignment_0 ) ) | ( ( rule__RelationSideLeft__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==35) ) {
                    alt4=1;
                }
                else if ( ((LA4_1>=15 && LA4_1<=18)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalErDsl.g:335:2: ( ( rule__RelationSideLeft__TargetAssignment_0 ) )
                    {
                    // InternalErDsl.g:335:2: ( ( rule__RelationSideLeft__TargetAssignment_0 ) )
                    // InternalErDsl.g:336:3: ( rule__RelationSideLeft__TargetAssignment_0 )
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getTargetAssignment_0()); 
                    // InternalErDsl.g:337:3: ( rule__RelationSideLeft__TargetAssignment_0 )
                    // InternalErDsl.g:337:4: rule__RelationSideLeft__TargetAssignment_0
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
                    // InternalErDsl.g:341:2: ( ( rule__RelationSideLeft__Group_1__0 ) )
                    {
                    // InternalErDsl.g:341:2: ( ( rule__RelationSideLeft__Group_1__0 ) )
                    // InternalErDsl.g:342:3: ( rule__RelationSideLeft__Group_1__0 )
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getGroup_1()); 
                    // InternalErDsl.g:343:3: ( rule__RelationSideLeft__Group_1__0 )
                    // InternalErDsl.g:343:4: rule__RelationSideLeft__Group_1__0
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
    // InternalErDsl.g:351:1: rule__RelationSideLeft__CardinalityAlternatives_1_1_0 : ( ( '(0:1)' ) | ( '(1:1)' ) | ( '(0:N)' ) | ( '(1:N)' ) );
    public final void rule__RelationSideLeft__CardinalityAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:355:1: ( ( '(0:1)' ) | ( '(1:1)' ) | ( '(0:N)' ) | ( '(1:N)' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalErDsl.g:356:2: ( '(0:1)' )
                    {
                    // InternalErDsl.g:356:2: ( '(0:1)' )
                    // InternalErDsl.g:357:3: '(0:1)'
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality01Keyword_1_1_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRelationSideLeftAccess().getCardinality01Keyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:362:2: ( '(1:1)' )
                    {
                    // InternalErDsl.g:362:2: ( '(1:1)' )
                    // InternalErDsl.g:363:3: '(1:1)'
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality11Keyword_1_1_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getRelationSideLeftAccess().getCardinality11Keyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl.g:368:2: ( '(0:N)' )
                    {
                    // InternalErDsl.g:368:2: ( '(0:N)' )
                    // InternalErDsl.g:369:3: '(0:N)'
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality0NKeyword_1_1_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getRelationSideLeftAccess().getCardinality0NKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl.g:374:2: ( '(1:N)' )
                    {
                    // InternalErDsl.g:374:2: ( '(1:N)' )
                    // InternalErDsl.g:375:3: '(1:N)'
                    {
                     before(grammarAccess.getRelationSideLeftAccess().getCardinality1NKeyword_1_1_0_3()); 
                    match(input,18,FOLLOW_2); 
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
    // InternalErDsl.g:384:1: rule__DataType__Alternatives : ( ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'money' ) ) | ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'datetime' ) ) | ( ( 'file' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:388:1: ( ( ( 'int' ) ) | ( ( 'double' ) ) | ( ( 'money' ) ) | ( ( 'string' ) ) | ( ( 'boolean' ) ) | ( ( 'datetime' ) ) | ( ( 'file' ) ) )
            int alt6=7;
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
            case 23:
                {
                alt6=5;
                }
                break;
            case 24:
                {
                alt6=6;
                }
                break;
            case 25:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalErDsl.g:389:2: ( ( 'int' ) )
                    {
                    // InternalErDsl.g:389:2: ( ( 'int' ) )
                    // InternalErDsl.g:390:3: ( 'int' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalErDsl.g:391:3: ( 'int' )
                    // InternalErDsl.g:391:4: 'int'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalErDsl.g:395:2: ( ( 'double' ) )
                    {
                    // InternalErDsl.g:395:2: ( ( 'double' ) )
                    // InternalErDsl.g:396:3: ( 'double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                    // InternalErDsl.g:397:3: ( 'double' )
                    // InternalErDsl.g:397:4: 'double'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalErDsl.g:401:2: ( ( 'money' ) )
                    {
                    // InternalErDsl.g:401:2: ( ( 'money' ) )
                    // InternalErDsl.g:402:3: ( 'money' )
                    {
                     before(grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2()); 
                    // InternalErDsl.g:403:3: ( 'money' )
                    // InternalErDsl.g:403:4: 'money'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getMONEYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalErDsl.g:407:2: ( ( 'string' ) )
                    {
                    // InternalErDsl.g:407:2: ( ( 'string' ) )
                    // InternalErDsl.g:408:3: ( 'string' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                    // InternalErDsl.g:409:3: ( 'string' )
                    // InternalErDsl.g:409:4: 'string'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalErDsl.g:413:2: ( ( 'boolean' ) )
                    {
                    // InternalErDsl.g:413:2: ( ( 'boolean' ) )
                    // InternalErDsl.g:414:3: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 
                    // InternalErDsl.g:415:3: ( 'boolean' )
                    // InternalErDsl.g:415:4: 'boolean'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalErDsl.g:419:2: ( ( 'datetime' ) )
                    {
                    // InternalErDsl.g:419:2: ( ( 'datetime' ) )
                    // InternalErDsl.g:420:3: ( 'datetime' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5()); 
                    // InternalErDsl.g:421:3: ( 'datetime' )
                    // InternalErDsl.g:421:4: 'datetime'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDATETIMEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalErDsl.g:425:2: ( ( 'file' ) )
                    {
                    // InternalErDsl.g:425:2: ( ( 'file' ) )
                    // InternalErDsl.g:426:3: ( 'file' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBLOBEnumLiteralDeclaration_6()); 
                    // InternalErDsl.g:427:3: ( 'file' )
                    // InternalErDsl.g:427:4: 'file'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalErDsl.g:435:1: rule__ERModel__Group__0 : rule__ERModel__Group__0__Impl rule__ERModel__Group__1 ;
    public final void rule__ERModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:439:1: ( rule__ERModel__Group__0__Impl rule__ERModel__Group__1 )
            // InternalErDsl.g:440:2: rule__ERModel__Group__0__Impl rule__ERModel__Group__1
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
    // InternalErDsl.g:447:1: rule__ERModel__Group__0__Impl : ( ( rule__ERModel__DomainAssignment_0 ) ) ;
    public final void rule__ERModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:451:1: ( ( ( rule__ERModel__DomainAssignment_0 ) ) )
            // InternalErDsl.g:452:1: ( ( rule__ERModel__DomainAssignment_0 ) )
            {
            // InternalErDsl.g:452:1: ( ( rule__ERModel__DomainAssignment_0 ) )
            // InternalErDsl.g:453:2: ( rule__ERModel__DomainAssignment_0 )
            {
             before(grammarAccess.getERModelAccess().getDomainAssignment_0()); 
            // InternalErDsl.g:454:2: ( rule__ERModel__DomainAssignment_0 )
            // InternalErDsl.g:454:3: rule__ERModel__DomainAssignment_0
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
    // InternalErDsl.g:462:1: rule__ERModel__Group__1 : rule__ERModel__Group__1__Impl rule__ERModel__Group__2 ;
    public final void rule__ERModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:466:1: ( rule__ERModel__Group__1__Impl rule__ERModel__Group__2 )
            // InternalErDsl.g:467:2: rule__ERModel__Group__1__Impl rule__ERModel__Group__2
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
    // InternalErDsl.g:474:1: rule__ERModel__Group__1__Impl : ( ';' ) ;
    public final void rule__ERModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:478:1: ( ( ';' ) )
            // InternalErDsl.g:479:1: ( ';' )
            {
            // InternalErDsl.g:479:1: ( ';' )
            // InternalErDsl.g:480:2: ';'
            {
             before(grammarAccess.getERModelAccess().getSemicolonKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalErDsl.g:489:1: rule__ERModel__Group__2 : rule__ERModel__Group__2__Impl rule__ERModel__Group__3 ;
    public final void rule__ERModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:493:1: ( rule__ERModel__Group__2__Impl rule__ERModel__Group__3 )
            // InternalErDsl.g:494:2: rule__ERModel__Group__2__Impl rule__ERModel__Group__3
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
    // InternalErDsl.g:501:1: rule__ERModel__Group__2__Impl : ( ( rule__ERModel__Group_2__0 ) ) ;
    public final void rule__ERModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:505:1: ( ( ( rule__ERModel__Group_2__0 ) ) )
            // InternalErDsl.g:506:1: ( ( rule__ERModel__Group_2__0 ) )
            {
            // InternalErDsl.g:506:1: ( ( rule__ERModel__Group_2__0 ) )
            // InternalErDsl.g:507:2: ( rule__ERModel__Group_2__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_2()); 
            // InternalErDsl.g:508:2: ( rule__ERModel__Group_2__0 )
            // InternalErDsl.g:508:3: rule__ERModel__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalErDsl.g:516:1: rule__ERModel__Group__3 : rule__ERModel__Group__3__Impl rule__ERModel__Group__4 ;
    public final void rule__ERModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:520:1: ( rule__ERModel__Group__3__Impl rule__ERModel__Group__4 )
            // InternalErDsl.g:521:2: rule__ERModel__Group__3__Impl rule__ERModel__Group__4
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
    // InternalErDsl.g:528:1: rule__ERModel__Group__3__Impl : ( ( ( rule__ERModel__EntitiesAssignment_3 ) ) ( ( rule__ERModel__EntitiesAssignment_3 )* ) ) ;
    public final void rule__ERModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:532:1: ( ( ( ( rule__ERModel__EntitiesAssignment_3 ) ) ( ( rule__ERModel__EntitiesAssignment_3 )* ) ) )
            // InternalErDsl.g:533:1: ( ( ( rule__ERModel__EntitiesAssignment_3 ) ) ( ( rule__ERModel__EntitiesAssignment_3 )* ) )
            {
            // InternalErDsl.g:533:1: ( ( ( rule__ERModel__EntitiesAssignment_3 ) ) ( ( rule__ERModel__EntitiesAssignment_3 )* ) )
            // InternalErDsl.g:534:2: ( ( rule__ERModel__EntitiesAssignment_3 ) ) ( ( rule__ERModel__EntitiesAssignment_3 )* )
            {
            // InternalErDsl.g:534:2: ( ( rule__ERModel__EntitiesAssignment_3 ) )
            // InternalErDsl.g:535:3: ( rule__ERModel__EntitiesAssignment_3 )
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_3()); 
            // InternalErDsl.g:536:3: ( rule__ERModel__EntitiesAssignment_3 )
            // InternalErDsl.g:536:4: rule__ERModel__EntitiesAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__ERModel__EntitiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getEntitiesAssignment_3()); 

            }

            // InternalErDsl.g:539:2: ( ( rule__ERModel__EntitiesAssignment_3 )* )
            // InternalErDsl.g:540:3: ( rule__ERModel__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getERModelAccess().getEntitiesAssignment_3()); 
            // InternalErDsl.g:541:3: ( rule__ERModel__EntitiesAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalErDsl.g:541:4: rule__ERModel__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ERModel__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalErDsl.g:550:1: rule__ERModel__Group__4 : rule__ERModel__Group__4__Impl rule__ERModel__Group__5 ;
    public final void rule__ERModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:554:1: ( rule__ERModel__Group__4__Impl rule__ERModel__Group__5 )
            // InternalErDsl.g:555:2: rule__ERModel__Group__4__Impl rule__ERModel__Group__5
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
    // InternalErDsl.g:562:1: rule__ERModel__Group__4__Impl : ( ( rule__ERModel__Group_4__0 ) ) ;
    public final void rule__ERModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:566:1: ( ( ( rule__ERModel__Group_4__0 ) ) )
            // InternalErDsl.g:567:1: ( ( rule__ERModel__Group_4__0 ) )
            {
            // InternalErDsl.g:567:1: ( ( rule__ERModel__Group_4__0 ) )
            // InternalErDsl.g:568:2: ( rule__ERModel__Group_4__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_4()); 
            // InternalErDsl.g:569:2: ( rule__ERModel__Group_4__0 )
            // InternalErDsl.g:569:3: rule__ERModel__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalErDsl.g:577:1: rule__ERModel__Group__5 : rule__ERModel__Group__5__Impl rule__ERModel__Group__6 ;
    public final void rule__ERModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:581:1: ( rule__ERModel__Group__5__Impl rule__ERModel__Group__6 )
            // InternalErDsl.g:582:2: rule__ERModel__Group__5__Impl rule__ERModel__Group__6
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
    // InternalErDsl.g:589:1: rule__ERModel__Group__5__Impl : ( ( rule__ERModel__Group_5__0 ) ) ;
    public final void rule__ERModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:593:1: ( ( ( rule__ERModel__Group_5__0 ) ) )
            // InternalErDsl.g:594:1: ( ( rule__ERModel__Group_5__0 ) )
            {
            // InternalErDsl.g:594:1: ( ( rule__ERModel__Group_5__0 ) )
            // InternalErDsl.g:595:2: ( rule__ERModel__Group_5__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_5()); 
            // InternalErDsl.g:596:2: ( rule__ERModel__Group_5__0 )
            // InternalErDsl.g:596:3: rule__ERModel__Group_5__0
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
    // InternalErDsl.g:604:1: rule__ERModel__Group__6 : rule__ERModel__Group__6__Impl rule__ERModel__Group__7 ;
    public final void rule__ERModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:608:1: ( rule__ERModel__Group__6__Impl rule__ERModel__Group__7 )
            // InternalErDsl.g:609:2: rule__ERModel__Group__6__Impl rule__ERModel__Group__7
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
    // InternalErDsl.g:616:1: rule__ERModel__Group__6__Impl : ( ( rule__ERModel__RelationsAssignment_6 )* ) ;
    public final void rule__ERModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:620:1: ( ( ( rule__ERModel__RelationsAssignment_6 )* ) )
            // InternalErDsl.g:621:1: ( ( rule__ERModel__RelationsAssignment_6 )* )
            {
            // InternalErDsl.g:621:1: ( ( rule__ERModel__RelationsAssignment_6 )* )
            // InternalErDsl.g:622:2: ( rule__ERModel__RelationsAssignment_6 )*
            {
             before(grammarAccess.getERModelAccess().getRelationsAssignment_6()); 
            // InternalErDsl.g:623:2: ( rule__ERModel__RelationsAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalErDsl.g:623:3: rule__ERModel__RelationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ERModel__RelationsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalErDsl.g:631:1: rule__ERModel__Group__7 : rule__ERModel__Group__7__Impl ;
    public final void rule__ERModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:635:1: ( rule__ERModel__Group__7__Impl )
            // InternalErDsl.g:636:2: rule__ERModel__Group__7__Impl
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
    // InternalErDsl.g:642:1: rule__ERModel__Group__7__Impl : ( ( rule__ERModel__Group_7__0 ) ) ;
    public final void rule__ERModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:646:1: ( ( ( rule__ERModel__Group_7__0 ) ) )
            // InternalErDsl.g:647:1: ( ( rule__ERModel__Group_7__0 ) )
            {
            // InternalErDsl.g:647:1: ( ( rule__ERModel__Group_7__0 ) )
            // InternalErDsl.g:648:2: ( rule__ERModel__Group_7__0 )
            {
             before(grammarAccess.getERModelAccess().getGroup_7()); 
            // InternalErDsl.g:649:2: ( rule__ERModel__Group_7__0 )
            // InternalErDsl.g:649:3: rule__ERModel__Group_7__0
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getERModelAccess().getGroup_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__ERModel__Group_2__0"
    // InternalErDsl.g:658:1: rule__ERModel__Group_2__0 : rule__ERModel__Group_2__0__Impl rule__ERModel__Group_2__1 ;
    public final void rule__ERModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:662:1: ( rule__ERModel__Group_2__0__Impl rule__ERModel__Group_2__1 )
            // InternalErDsl.g:663:2: rule__ERModel__Group_2__0__Impl rule__ERModel__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__ERModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2__0"


    // $ANTLR start "rule__ERModel__Group_2__0__Impl"
    // InternalErDsl.g:670:1: rule__ERModel__Group_2__0__Impl : ( 'Entities' ) ;
    public final void rule__ERModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:674:1: ( ( 'Entities' ) )
            // InternalErDsl.g:675:1: ( 'Entities' )
            {
            // InternalErDsl.g:675:1: ( 'Entities' )
            // InternalErDsl.g:676:2: 'Entities'
            {
             before(grammarAccess.getERModelAccess().getEntitiesKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getEntitiesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2__0__Impl"


    // $ANTLR start "rule__ERModel__Group_2__1"
    // InternalErDsl.g:685:1: rule__ERModel__Group_2__1 : rule__ERModel__Group_2__1__Impl ;
    public final void rule__ERModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:689:1: ( rule__ERModel__Group_2__1__Impl )
            // InternalErDsl.g:690:2: rule__ERModel__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2__1"


    // $ANTLR start "rule__ERModel__Group_2__1__Impl"
    // InternalErDsl.g:696:1: rule__ERModel__Group_2__1__Impl : ( '{' ) ;
    public final void rule__ERModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:700:1: ( ( '{' ) )
            // InternalErDsl.g:701:1: ( '{' )
            {
            // InternalErDsl.g:701:1: ( '{' )
            // InternalErDsl.g:702:2: '{'
            {
             before(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_2__1__Impl"


    // $ANTLR start "rule__ERModel__Group_4__0"
    // InternalErDsl.g:712:1: rule__ERModel__Group_4__0 : rule__ERModel__Group_4__0__Impl rule__ERModel__Group_4__1 ;
    public final void rule__ERModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:716:1: ( rule__ERModel__Group_4__0__Impl rule__ERModel__Group_4__1 )
            // InternalErDsl.g:717:2: rule__ERModel__Group_4__0__Impl rule__ERModel__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__ERModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4__0"


    // $ANTLR start "rule__ERModel__Group_4__0__Impl"
    // InternalErDsl.g:724:1: rule__ERModel__Group_4__0__Impl : ( '}' ) ;
    public final void rule__ERModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:728:1: ( ( '}' ) )
            // InternalErDsl.g:729:1: ( '}' )
            {
            // InternalErDsl.g:729:1: ( '}' )
            // InternalErDsl.g:730:2: '}'
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4__0__Impl"


    // $ANTLR start "rule__ERModel__Group_4__1"
    // InternalErDsl.g:739:1: rule__ERModel__Group_4__1 : rule__ERModel__Group_4__1__Impl ;
    public final void rule__ERModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:743:1: ( rule__ERModel__Group_4__1__Impl )
            // InternalErDsl.g:744:2: rule__ERModel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4__1"


    // $ANTLR start "rule__ERModel__Group_4__1__Impl"
    // InternalErDsl.g:750:1: rule__ERModel__Group_4__1__Impl : ( ';' ) ;
    public final void rule__ERModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:754:1: ( ( ';' ) )
            // InternalErDsl.g:755:1: ( ';' )
            {
            // InternalErDsl.g:755:1: ( ';' )
            // InternalErDsl.g:756:2: ';'
            {
             before(grammarAccess.getERModelAccess().getSemicolonKeyword_4_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getSemicolonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_4__1__Impl"


    // $ANTLR start "rule__ERModel__Group_5__0"
    // InternalErDsl.g:766:1: rule__ERModel__Group_5__0 : rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1 ;
    public final void rule__ERModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:770:1: ( rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1 )
            // InternalErDsl.g:771:2: rule__ERModel__Group_5__0__Impl rule__ERModel__Group_5__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalErDsl.g:778:1: rule__ERModel__Group_5__0__Impl : ( 'Relationships' ) ;
    public final void rule__ERModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:782:1: ( ( 'Relationships' ) )
            // InternalErDsl.g:783:1: ( 'Relationships' )
            {
            // InternalErDsl.g:783:1: ( 'Relationships' )
            // InternalErDsl.g:784:2: 'Relationships'
            {
             before(grammarAccess.getERModelAccess().getRelationshipsKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRelationshipsKeyword_5_0()); 

            }


            }

        }
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
    // InternalErDsl.g:793:1: rule__ERModel__Group_5__1 : rule__ERModel__Group_5__1__Impl ;
    public final void rule__ERModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:797:1: ( rule__ERModel__Group_5__1__Impl )
            // InternalErDsl.g:798:2: rule__ERModel__Group_5__1__Impl
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
    // InternalErDsl.g:804:1: rule__ERModel__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ERModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:808:1: ( ( '{' ) )
            // InternalErDsl.g:809:1: ( '{' )
            {
            // InternalErDsl.g:809:1: ( '{' )
            // InternalErDsl.g:810:2: '{'
            {
             before(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ERModel__Group_7__0"
    // InternalErDsl.g:820:1: rule__ERModel__Group_7__0 : rule__ERModel__Group_7__0__Impl rule__ERModel__Group_7__1 ;
    public final void rule__ERModel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:824:1: ( rule__ERModel__Group_7__0__Impl rule__ERModel__Group_7__1 )
            // InternalErDsl.g:825:2: rule__ERModel__Group_7__0__Impl rule__ERModel__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__ERModel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ERModel__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_7__0"


    // $ANTLR start "rule__ERModel__Group_7__0__Impl"
    // InternalErDsl.g:832:1: rule__ERModel__Group_7__0__Impl : ( '}' ) ;
    public final void rule__ERModel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:836:1: ( ( '}' ) )
            // InternalErDsl.g:837:1: ( '}' )
            {
            // InternalErDsl.g:837:1: ( '}' )
            // InternalErDsl.g:838:2: '}'
            {
             before(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_7_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getRightCurlyBracketKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_7__0__Impl"


    // $ANTLR start "rule__ERModel__Group_7__1"
    // InternalErDsl.g:847:1: rule__ERModel__Group_7__1 : rule__ERModel__Group_7__1__Impl ;
    public final void rule__ERModel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:851:1: ( rule__ERModel__Group_7__1__Impl )
            // InternalErDsl.g:852:2: rule__ERModel__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ERModel__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_7__1"


    // $ANTLR start "rule__ERModel__Group_7__1__Impl"
    // InternalErDsl.g:858:1: rule__ERModel__Group_7__1__Impl : ( ';' ) ;
    public final void rule__ERModel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:862:1: ( ( ';' ) )
            // InternalErDsl.g:863:1: ( ';' )
            {
            // InternalErDsl.g:863:1: ( ';' )
            // InternalErDsl.g:864:2: ';'
            {
             before(grammarAccess.getERModelAccess().getSemicolonKeyword_7_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getERModelAccess().getSemicolonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ERModel__Group_7__1__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // InternalErDsl.g:874:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:878:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // InternalErDsl.g:879:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
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
    // InternalErDsl.g:886:1: rule__Domain__Group__0__Impl : ( 'Domain' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:890:1: ( ( 'Domain' ) )
            // InternalErDsl.g:891:1: ( 'Domain' )
            {
            // InternalErDsl.g:891:1: ( 'Domain' )
            // InternalErDsl.g:892:2: 'Domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalErDsl.g:901:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:905:1: ( rule__Domain__Group__1__Impl )
            // InternalErDsl.g:906:2: rule__Domain__Group__1__Impl
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
    // InternalErDsl.g:912:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__NameAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:916:1: ( ( ( rule__Domain__NameAssignment_1 ) ) )
            // InternalErDsl.g:917:1: ( ( rule__Domain__NameAssignment_1 ) )
            {
            // InternalErDsl.g:917:1: ( ( rule__Domain__NameAssignment_1 ) )
            // InternalErDsl.g:918:2: ( rule__Domain__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_1()); 
            // InternalErDsl.g:919:2: ( rule__Domain__NameAssignment_1 )
            // InternalErDsl.g:919:3: rule__Domain__NameAssignment_1
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
    // InternalErDsl.g:928:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:932:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalErDsl.g:933:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalErDsl.g:940:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:944:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalErDsl.g:945:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalErDsl.g:945:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalErDsl.g:946:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalErDsl.g:947:2: ( rule__Attribute__NameAssignment_0 )
            // InternalErDsl.g:947:3: rule__Attribute__NameAssignment_0
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
    // InternalErDsl.g:955:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:959:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalErDsl.g:960:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalErDsl.g:967:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__TypeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:971:1: ( ( ( rule__Attribute__TypeAssignment_1 ) ) )
            // InternalErDsl.g:972:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            {
            // InternalErDsl.g:972:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            // InternalErDsl.g:973:2: ( rule__Attribute__TypeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 
            // InternalErDsl.g:974:2: ( rule__Attribute__TypeAssignment_1 )
            // InternalErDsl.g:974:3: rule__Attribute__TypeAssignment_1
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
    // InternalErDsl.g:982:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:986:1: ( rule__Attribute__Group__2__Impl )
            // InternalErDsl.g:987:2: rule__Attribute__Group__2__Impl
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
    // InternalErDsl.g:993:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__IsKeyAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:997:1: ( ( ( rule__Attribute__IsKeyAssignment_2 )? ) )
            // InternalErDsl.g:998:1: ( ( rule__Attribute__IsKeyAssignment_2 )? )
            {
            // InternalErDsl.g:998:1: ( ( rule__Attribute__IsKeyAssignment_2 )? )
            // InternalErDsl.g:999:2: ( rule__Attribute__IsKeyAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getIsKeyAssignment_2()); 
            // InternalErDsl.g:1000:2: ( rule__Attribute__IsKeyAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalErDsl.g:1000:3: rule__Attribute__IsKeyAssignment_2
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
    // InternalErDsl.g:1009:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1013:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalErDsl.g:1014:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalErDsl.g:1021:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__NameAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1025:1: ( ( ( rule__Entity__NameAssignment_0 ) ) )
            // InternalErDsl.g:1026:1: ( ( rule__Entity__NameAssignment_0 ) )
            {
            // InternalErDsl.g:1026:1: ( ( rule__Entity__NameAssignment_0 ) )
            // InternalErDsl.g:1027:2: ( rule__Entity__NameAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0()); 
            // InternalErDsl.g:1028:2: ( rule__Entity__NameAssignment_0 )
            // InternalErDsl.g:1028:3: rule__Entity__NameAssignment_0
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
    // InternalErDsl.g:1036:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1040:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalErDsl.g:1041:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalErDsl.g:1048:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__Group_1__0 )* ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1052:1: ( ( ( rule__Entity__Group_1__0 )* ) )
            // InternalErDsl.g:1053:1: ( ( rule__Entity__Group_1__0 )* )
            {
            // InternalErDsl.g:1053:1: ( ( rule__Entity__Group_1__0 )* )
            // InternalErDsl.g:1054:2: ( rule__Entity__Group_1__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_1()); 
            // InternalErDsl.g:1055:2: ( rule__Entity__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalErDsl.g:1055:3: rule__Entity__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Entity__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalErDsl.g:1063:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1067:1: ( rule__Entity__Group__2__Impl )
            // InternalErDsl.g:1068:2: rule__Entity__Group__2__Impl
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
    // InternalErDsl.g:1074:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1078:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalErDsl.g:1079:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalErDsl.g:1079:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalErDsl.g:1080:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalErDsl.g:1081:2: ( rule__Entity__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalErDsl.g:1081:3: rule__Entity__Group_2__0
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
    // InternalErDsl.g:1090:1: rule__Entity__Group_1__0 : rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 ;
    public final void rule__Entity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1094:1: ( rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 )
            // InternalErDsl.g:1095:2: rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1
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
    // InternalErDsl.g:1102:1: rule__Entity__Group_1__0__Impl : ( 'is' ) ;
    public final void rule__Entity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1106:1: ( ( 'is' ) )
            // InternalErDsl.g:1107:1: ( 'is' )
            {
            // InternalErDsl.g:1107:1: ( 'is' )
            // InternalErDsl.g:1108:2: 'is'
            {
             before(grammarAccess.getEntityAccess().getIsKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalErDsl.g:1117:1: rule__Entity__Group_1__1 : rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2 ;
    public final void rule__Entity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1121:1: ( rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2 )
            // InternalErDsl.g:1122:2: rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalErDsl.g:1129:1: rule__Entity__Group_1__1__Impl : ( ( rule__Entity__GeneralizationAssignment_1_1 ) ) ;
    public final void rule__Entity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1133:1: ( ( ( rule__Entity__GeneralizationAssignment_1_1 ) ) )
            // InternalErDsl.g:1134:1: ( ( rule__Entity__GeneralizationAssignment_1_1 ) )
            {
            // InternalErDsl.g:1134:1: ( ( rule__Entity__GeneralizationAssignment_1_1 ) )
            // InternalErDsl.g:1135:2: ( rule__Entity__GeneralizationAssignment_1_1 )
            {
             before(grammarAccess.getEntityAccess().getGeneralizationAssignment_1_1()); 
            // InternalErDsl.g:1136:2: ( rule__Entity__GeneralizationAssignment_1_1 )
            // InternalErDsl.g:1136:3: rule__Entity__GeneralizationAssignment_1_1
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
    // InternalErDsl.g:1144:1: rule__Entity__Group_1__2 : rule__Entity__Group_1__2__Impl ;
    public final void rule__Entity__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1148:1: ( rule__Entity__Group_1__2__Impl )
            // InternalErDsl.g:1149:2: rule__Entity__Group_1__2__Impl
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
    // InternalErDsl.g:1155:1: rule__Entity__Group_1__2__Impl : ( ( rule__Entity__IsAssignment_1_2 ) ) ;
    public final void rule__Entity__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1159:1: ( ( ( rule__Entity__IsAssignment_1_2 ) ) )
            // InternalErDsl.g:1160:1: ( ( rule__Entity__IsAssignment_1_2 ) )
            {
            // InternalErDsl.g:1160:1: ( ( rule__Entity__IsAssignment_1_2 ) )
            // InternalErDsl.g:1161:2: ( rule__Entity__IsAssignment_1_2 )
            {
             before(grammarAccess.getEntityAccess().getIsAssignment_1_2()); 
            // InternalErDsl.g:1162:2: ( rule__Entity__IsAssignment_1_2 )
            // InternalErDsl.g:1162:3: rule__Entity__IsAssignment_1_2
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
    // InternalErDsl.g:1171:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1175:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalErDsl.g:1176:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
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
    // InternalErDsl.g:1183:1: rule__Entity__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1187:1: ( ( '{' ) )
            // InternalErDsl.g:1188:1: ( '{' )
            {
            // InternalErDsl.g:1188:1: ( '{' )
            // InternalErDsl.g:1189:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalErDsl.g:1198:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1202:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // InternalErDsl.g:1203:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
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
    // InternalErDsl.g:1210:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1214:1: ( ( ( rule__Entity__AttributesAssignment_2_1 ) ) )
            // InternalErDsl.g:1215:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            {
            // InternalErDsl.g:1215:1: ( ( rule__Entity__AttributesAssignment_2_1 ) )
            // InternalErDsl.g:1216:2: ( rule__Entity__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_1()); 
            // InternalErDsl.g:1217:2: ( rule__Entity__AttributesAssignment_2_1 )
            // InternalErDsl.g:1217:3: rule__Entity__AttributesAssignment_2_1
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
    // InternalErDsl.g:1225:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1229:1: ( rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3 )
            // InternalErDsl.g:1230:2: rule__Entity__Group_2__2__Impl rule__Entity__Group_2__3
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
    // InternalErDsl.g:1237:1: rule__Entity__Group_2__2__Impl : ( ( rule__Entity__Group_2_2__0 )* ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1241:1: ( ( ( rule__Entity__Group_2_2__0 )* ) )
            // InternalErDsl.g:1242:1: ( ( rule__Entity__Group_2_2__0 )* )
            {
            // InternalErDsl.g:1242:1: ( ( rule__Entity__Group_2_2__0 )* )
            // InternalErDsl.g:1243:2: ( rule__Entity__Group_2_2__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_2_2()); 
            // InternalErDsl.g:1244:2: ( rule__Entity__Group_2_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalErDsl.g:1244:3: rule__Entity__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Entity__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalErDsl.g:1252:1: rule__Entity__Group_2__3 : rule__Entity__Group_2__3__Impl ;
    public final void rule__Entity__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1256:1: ( rule__Entity__Group_2__3__Impl )
            // InternalErDsl.g:1257:2: rule__Entity__Group_2__3__Impl
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
    // InternalErDsl.g:1263:1: rule__Entity__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Entity__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1267:1: ( ( '}' ) )
            // InternalErDsl.g:1268:1: ( '}' )
            {
            // InternalErDsl.g:1268:1: ( '}' )
            // InternalErDsl.g:1269:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalErDsl.g:1279:1: rule__Entity__Group_2_2__0 : rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 ;
    public final void rule__Entity__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1283:1: ( rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 )
            // InternalErDsl.g:1284:2: rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1
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
    // InternalErDsl.g:1291:1: rule__Entity__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1295:1: ( ( ',' ) )
            // InternalErDsl.g:1296:1: ( ',' )
            {
            // InternalErDsl.g:1296:1: ( ',' )
            // InternalErDsl.g:1297:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_2_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalErDsl.g:1306:1: rule__Entity__Group_2_2__1 : rule__Entity__Group_2_2__1__Impl ;
    public final void rule__Entity__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1310:1: ( rule__Entity__Group_2_2__1__Impl )
            // InternalErDsl.g:1311:2: rule__Entity__Group_2_2__1__Impl
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
    // InternalErDsl.g:1317:1: rule__Entity__Group_2_2__1__Impl : ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Entity__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1321:1: ( ( ( rule__Entity__AttributesAssignment_2_2_1 ) ) )
            // InternalErDsl.g:1322:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDsl.g:1322:1: ( ( rule__Entity__AttributesAssignment_2_2_1 ) )
            // InternalErDsl.g:1323:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDsl.g:1324:2: ( rule__Entity__AttributesAssignment_2_2_1 )
            // InternalErDsl.g:1324:3: rule__Entity__AttributesAssignment_2_2_1
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
    // InternalErDsl.g:1333:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1337:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalErDsl.g:1338:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
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
    // InternalErDsl.g:1345:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__NameAssignment_0 )? ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1349:1: ( ( ( rule__Relation__NameAssignment_0 )? ) )
            // InternalErDsl.g:1350:1: ( ( rule__Relation__NameAssignment_0 )? )
            {
            // InternalErDsl.g:1350:1: ( ( rule__Relation__NameAssignment_0 )? )
            // InternalErDsl.g:1351:2: ( rule__Relation__NameAssignment_0 )?
            {
             before(grammarAccess.getRelationAccess().getNameAssignment_0()); 
            // InternalErDsl.g:1352:2: ( rule__Relation__NameAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalErDsl.g:1352:3: rule__Relation__NameAssignment_0
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
    // InternalErDsl.g:1360:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1364:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalErDsl.g:1365:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalErDsl.g:1372:1: rule__Relation__Group__1__Impl : ( ( rule__Relation__Group_1__0 ) ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1376:1: ( ( ( rule__Relation__Group_1__0 ) ) )
            // InternalErDsl.g:1377:1: ( ( rule__Relation__Group_1__0 ) )
            {
            // InternalErDsl.g:1377:1: ( ( rule__Relation__Group_1__0 ) )
            // InternalErDsl.g:1378:2: ( rule__Relation__Group_1__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup_1()); 
            // InternalErDsl.g:1379:2: ( rule__Relation__Group_1__0 )
            // InternalErDsl.g:1379:3: rule__Relation__Group_1__0
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
    // InternalErDsl.g:1387:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1391:1: ( rule__Relation__Group__2__Impl )
            // InternalErDsl.g:1392:2: rule__Relation__Group__2__Impl
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
    // InternalErDsl.g:1398:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__Group_2__0 )* ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1402:1: ( ( ( rule__Relation__Group_2__0 )* ) )
            // InternalErDsl.g:1403:1: ( ( rule__Relation__Group_2__0 )* )
            {
            // InternalErDsl.g:1403:1: ( ( rule__Relation__Group_2__0 )* )
            // InternalErDsl.g:1404:2: ( rule__Relation__Group_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2()); 
            // InternalErDsl.g:1405:2: ( rule__Relation__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalErDsl.g:1405:3: rule__Relation__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Relation__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalErDsl.g:1414:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1418:1: ( rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 )
            // InternalErDsl.g:1419:2: rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalErDsl.g:1426:1: rule__Relation__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1430:1: ( ( '[' ) )
            // InternalErDsl.g:1431:1: ( '[' )
            {
            // InternalErDsl.g:1431:1: ( '[' )
            // InternalErDsl.g:1432:2: '['
            {
             before(grammarAccess.getRelationAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalErDsl.g:1441:1: rule__Relation__Group_1__1 : rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 ;
    public final void rule__Relation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1445:1: ( rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 )
            // InternalErDsl.g:1446:2: rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalErDsl.g:1453:1: rule__Relation__Group_1__1__Impl : ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) ;
    public final void rule__Relation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1457:1: ( ( ( rule__Relation__LeftEndingAssignment_1_1 ) ) )
            // InternalErDsl.g:1458:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            {
            // InternalErDsl.g:1458:1: ( ( rule__Relation__LeftEndingAssignment_1_1 ) )
            // InternalErDsl.g:1459:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            {
             before(grammarAccess.getRelationAccess().getLeftEndingAssignment_1_1()); 
            // InternalErDsl.g:1460:2: ( rule__Relation__LeftEndingAssignment_1_1 )
            // InternalErDsl.g:1460:3: rule__Relation__LeftEndingAssignment_1_1
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
    // InternalErDsl.g:1468:1: rule__Relation__Group_1__2 : rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 ;
    public final void rule__Relation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1472:1: ( rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 )
            // InternalErDsl.g:1473:2: rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalErDsl.g:1480:1: rule__Relation__Group_1__2__Impl : ( 'relates' ) ;
    public final void rule__Relation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1484:1: ( ( 'relates' ) )
            // InternalErDsl.g:1485:1: ( 'relates' )
            {
            // InternalErDsl.g:1485:1: ( 'relates' )
            // InternalErDsl.g:1486:2: 'relates'
            {
             before(grammarAccess.getRelationAccess().getRelatesKeyword_1_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalErDsl.g:1495:1: rule__Relation__Group_1__3 : rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 ;
    public final void rule__Relation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1499:1: ( rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 )
            // InternalErDsl.g:1500:2: rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4
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
    // InternalErDsl.g:1507:1: rule__Relation__Group_1__3__Impl : ( ( rule__Relation__RightEndingAssignment_1_3 ) ) ;
    public final void rule__Relation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1511:1: ( ( ( rule__Relation__RightEndingAssignment_1_3 ) ) )
            // InternalErDsl.g:1512:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            {
            // InternalErDsl.g:1512:1: ( ( rule__Relation__RightEndingAssignment_1_3 ) )
            // InternalErDsl.g:1513:2: ( rule__Relation__RightEndingAssignment_1_3 )
            {
             before(grammarAccess.getRelationAccess().getRightEndingAssignment_1_3()); 
            // InternalErDsl.g:1514:2: ( rule__Relation__RightEndingAssignment_1_3 )
            // InternalErDsl.g:1514:3: rule__Relation__RightEndingAssignment_1_3
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
    // InternalErDsl.g:1522:1: rule__Relation__Group_1__4 : rule__Relation__Group_1__4__Impl ;
    public final void rule__Relation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1526:1: ( rule__Relation__Group_1__4__Impl )
            // InternalErDsl.g:1527:2: rule__Relation__Group_1__4__Impl
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
    // InternalErDsl.g:1533:1: rule__Relation__Group_1__4__Impl : ( ']' ) ;
    public final void rule__Relation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1537:1: ( ( ']' ) )
            // InternalErDsl.g:1538:1: ( ']' )
            {
            // InternalErDsl.g:1538:1: ( ']' )
            // InternalErDsl.g:1539:2: ']'
            {
             before(grammarAccess.getRelationAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalErDsl.g:1549:1: rule__Relation__Group_2__0 : rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 ;
    public final void rule__Relation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1553:1: ( rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1 )
            // InternalErDsl.g:1554:2: rule__Relation__Group_2__0__Impl rule__Relation__Group_2__1
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
    // InternalErDsl.g:1561:1: rule__Relation__Group_2__0__Impl : ( '{' ) ;
    public final void rule__Relation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1565:1: ( ( '{' ) )
            // InternalErDsl.g:1566:1: ( '{' )
            {
            // InternalErDsl.g:1566:1: ( '{' )
            // InternalErDsl.g:1567:2: '{'
            {
             before(grammarAccess.getRelationAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalErDsl.g:1576:1: rule__Relation__Group_2__1 : rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 ;
    public final void rule__Relation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1580:1: ( rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2 )
            // InternalErDsl.g:1581:2: rule__Relation__Group_2__1__Impl rule__Relation__Group_2__2
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
    // InternalErDsl.g:1588:1: rule__Relation__Group_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_1 ) ) ;
    public final void rule__Relation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1592:1: ( ( ( rule__Relation__AttributesAssignment_2_1 ) ) )
            // InternalErDsl.g:1593:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            {
            // InternalErDsl.g:1593:1: ( ( rule__Relation__AttributesAssignment_2_1 ) )
            // InternalErDsl.g:1594:2: ( rule__Relation__AttributesAssignment_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_1()); 
            // InternalErDsl.g:1595:2: ( rule__Relation__AttributesAssignment_2_1 )
            // InternalErDsl.g:1595:3: rule__Relation__AttributesAssignment_2_1
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
    // InternalErDsl.g:1603:1: rule__Relation__Group_2__2 : rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 ;
    public final void rule__Relation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1607:1: ( rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3 )
            // InternalErDsl.g:1608:2: rule__Relation__Group_2__2__Impl rule__Relation__Group_2__3
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
    // InternalErDsl.g:1615:1: rule__Relation__Group_2__2__Impl : ( ( rule__Relation__Group_2_2__0 )* ) ;
    public final void rule__Relation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1619:1: ( ( ( rule__Relation__Group_2_2__0 )* ) )
            // InternalErDsl.g:1620:1: ( ( rule__Relation__Group_2_2__0 )* )
            {
            // InternalErDsl.g:1620:1: ( ( rule__Relation__Group_2_2__0 )* )
            // InternalErDsl.g:1621:2: ( rule__Relation__Group_2_2__0 )*
            {
             before(grammarAccess.getRelationAccess().getGroup_2_2()); 
            // InternalErDsl.g:1622:2: ( rule__Relation__Group_2_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalErDsl.g:1622:3: rule__Relation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Relation__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalErDsl.g:1630:1: rule__Relation__Group_2__3 : rule__Relation__Group_2__3__Impl ;
    public final void rule__Relation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1634:1: ( rule__Relation__Group_2__3__Impl )
            // InternalErDsl.g:1635:2: rule__Relation__Group_2__3__Impl
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
    // InternalErDsl.g:1641:1: rule__Relation__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Relation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1645:1: ( ( '}' ) )
            // InternalErDsl.g:1646:1: ( '}' )
            {
            // InternalErDsl.g:1646:1: ( '}' )
            // InternalErDsl.g:1647:2: '}'
            {
             before(grammarAccess.getRelationAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalErDsl.g:1657:1: rule__Relation__Group_2_2__0 : rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 ;
    public final void rule__Relation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1661:1: ( rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1 )
            // InternalErDsl.g:1662:2: rule__Relation__Group_2_2__0__Impl rule__Relation__Group_2_2__1
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
    // InternalErDsl.g:1669:1: rule__Relation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Relation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1673:1: ( ( ',' ) )
            // InternalErDsl.g:1674:1: ( ',' )
            {
            // InternalErDsl.g:1674:1: ( ',' )
            // InternalErDsl.g:1675:2: ','
            {
             before(grammarAccess.getRelationAccess().getCommaKeyword_2_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalErDsl.g:1684:1: rule__Relation__Group_2_2__1 : rule__Relation__Group_2_2__1__Impl ;
    public final void rule__Relation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1688:1: ( rule__Relation__Group_2_2__1__Impl )
            // InternalErDsl.g:1689:2: rule__Relation__Group_2_2__1__Impl
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
    // InternalErDsl.g:1695:1: rule__Relation__Group_2_2__1__Impl : ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) ;
    public final void rule__Relation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1699:1: ( ( ( rule__Relation__AttributesAssignment_2_2_1 ) ) )
            // InternalErDsl.g:1700:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            {
            // InternalErDsl.g:1700:1: ( ( rule__Relation__AttributesAssignment_2_2_1 ) )
            // InternalErDsl.g:1701:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            {
             before(grammarAccess.getRelationAccess().getAttributesAssignment_2_2_1()); 
            // InternalErDsl.g:1702:2: ( rule__Relation__AttributesAssignment_2_2_1 )
            // InternalErDsl.g:1702:3: rule__Relation__AttributesAssignment_2_2_1
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
    // InternalErDsl.g:1711:1: rule__RelationSideRight__Group_0__0 : rule__RelationSideRight__Group_0__0__Impl rule__RelationSideRight__Group_0__1 ;
    public final void rule__RelationSideRight__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1715:1: ( rule__RelationSideRight__Group_0__0__Impl rule__RelationSideRight__Group_0__1 )
            // InternalErDsl.g:1716:2: rule__RelationSideRight__Group_0__0__Impl rule__RelationSideRight__Group_0__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalErDsl.g:1723:1: rule__RelationSideRight__Group_0__0__Impl : ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) ) ;
    public final void rule__RelationSideRight__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1727:1: ( ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) ) )
            // InternalErDsl.g:1728:1: ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) )
            {
            // InternalErDsl.g:1728:1: ( ( rule__RelationSideRight__CardinalityAssignment_0_0 ) )
            // InternalErDsl.g:1729:2: ( rule__RelationSideRight__CardinalityAssignment_0_0 )
            {
             before(grammarAccess.getRelationSideRightAccess().getCardinalityAssignment_0_0()); 
            // InternalErDsl.g:1730:2: ( rule__RelationSideRight__CardinalityAssignment_0_0 )
            // InternalErDsl.g:1730:3: rule__RelationSideRight__CardinalityAssignment_0_0
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
    // InternalErDsl.g:1738:1: rule__RelationSideRight__Group_0__1 : rule__RelationSideRight__Group_0__1__Impl ;
    public final void rule__RelationSideRight__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1742:1: ( rule__RelationSideRight__Group_0__1__Impl )
            // InternalErDsl.g:1743:2: rule__RelationSideRight__Group_0__1__Impl
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
    // InternalErDsl.g:1749:1: rule__RelationSideRight__Group_0__1__Impl : ( ( rule__RelationSideRight__TargetAssignment_0_1 ) ) ;
    public final void rule__RelationSideRight__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1753:1: ( ( ( rule__RelationSideRight__TargetAssignment_0_1 ) ) )
            // InternalErDsl.g:1754:1: ( ( rule__RelationSideRight__TargetAssignment_0_1 ) )
            {
            // InternalErDsl.g:1754:1: ( ( rule__RelationSideRight__TargetAssignment_0_1 ) )
            // InternalErDsl.g:1755:2: ( rule__RelationSideRight__TargetAssignment_0_1 )
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetAssignment_0_1()); 
            // InternalErDsl.g:1756:2: ( rule__RelationSideRight__TargetAssignment_0_1 )
            // InternalErDsl.g:1756:3: rule__RelationSideRight__TargetAssignment_0_1
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
    // InternalErDsl.g:1765:1: rule__RelationSideLeft__Group_1__0 : rule__RelationSideLeft__Group_1__0__Impl rule__RelationSideLeft__Group_1__1 ;
    public final void rule__RelationSideLeft__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1769:1: ( rule__RelationSideLeft__Group_1__0__Impl rule__RelationSideLeft__Group_1__1 )
            // InternalErDsl.g:1770:2: rule__RelationSideLeft__Group_1__0__Impl rule__RelationSideLeft__Group_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalErDsl.g:1777:1: rule__RelationSideLeft__Group_1__0__Impl : ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) ) ;
    public final void rule__RelationSideLeft__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1781:1: ( ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) ) )
            // InternalErDsl.g:1782:1: ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) )
            {
            // InternalErDsl.g:1782:1: ( ( rule__RelationSideLeft__TargetAssignment_1_0 ) )
            // InternalErDsl.g:1783:2: ( rule__RelationSideLeft__TargetAssignment_1_0 )
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetAssignment_1_0()); 
            // InternalErDsl.g:1784:2: ( rule__RelationSideLeft__TargetAssignment_1_0 )
            // InternalErDsl.g:1784:3: rule__RelationSideLeft__TargetAssignment_1_0
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
    // InternalErDsl.g:1792:1: rule__RelationSideLeft__Group_1__1 : rule__RelationSideLeft__Group_1__1__Impl ;
    public final void rule__RelationSideLeft__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1796:1: ( rule__RelationSideLeft__Group_1__1__Impl )
            // InternalErDsl.g:1797:2: rule__RelationSideLeft__Group_1__1__Impl
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
    // InternalErDsl.g:1803:1: rule__RelationSideLeft__Group_1__1__Impl : ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) ) ;
    public final void rule__RelationSideLeft__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1807:1: ( ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) ) )
            // InternalErDsl.g:1808:1: ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) )
            {
            // InternalErDsl.g:1808:1: ( ( rule__RelationSideLeft__CardinalityAssignment_1_1 ) )
            // InternalErDsl.g:1809:2: ( rule__RelationSideLeft__CardinalityAssignment_1_1 )
            {
             before(grammarAccess.getRelationSideLeftAccess().getCardinalityAssignment_1_1()); 
            // InternalErDsl.g:1810:2: ( rule__RelationSideLeft__CardinalityAssignment_1_1 )
            // InternalErDsl.g:1810:3: rule__RelationSideLeft__CardinalityAssignment_1_1
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


    // $ANTLR start "rule__ERModel__DomainAssignment_0"
    // InternalErDsl.g:1819:1: rule__ERModel__DomainAssignment_0 : ( ruleDomain ) ;
    public final void rule__ERModel__DomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1823:1: ( ( ruleDomain ) )
            // InternalErDsl.g:1824:2: ( ruleDomain )
            {
            // InternalErDsl.g:1824:2: ( ruleDomain )
            // InternalErDsl.g:1825:3: ruleDomain
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
    // InternalErDsl.g:1834:1: rule__ERModel__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__ERModel__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1838:1: ( ( ruleEntity ) )
            // InternalErDsl.g:1839:2: ( ruleEntity )
            {
            // InternalErDsl.g:1839:2: ( ruleEntity )
            // InternalErDsl.g:1840:3: ruleEntity
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
    // InternalErDsl.g:1849:1: rule__ERModel__RelationsAssignment_6 : ( ruleRelation ) ;
    public final void rule__ERModel__RelationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1853:1: ( ( ruleRelation ) )
            // InternalErDsl.g:1854:2: ( ruleRelation )
            {
            // InternalErDsl.g:1854:2: ( ruleRelation )
            // InternalErDsl.g:1855:3: ruleRelation
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
    // InternalErDsl.g:1864:1: rule__Domain__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1868:1: ( ( RULE_ID ) )
            // InternalErDsl.g:1869:2: ( RULE_ID )
            {
            // InternalErDsl.g:1869:2: ( RULE_ID )
            // InternalErDsl.g:1870:3: RULE_ID
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
    // InternalErDsl.g:1879:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1883:1: ( ( RULE_ID ) )
            // InternalErDsl.g:1884:2: ( RULE_ID )
            {
            // InternalErDsl.g:1884:2: ( RULE_ID )
            // InternalErDsl.g:1885:3: RULE_ID
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
    // InternalErDsl.g:1894:1: rule__Attribute__TypeAssignment_1 : ( ruleDataType ) ;
    public final void rule__Attribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1898:1: ( ( ruleDataType ) )
            // InternalErDsl.g:1899:2: ( ruleDataType )
            {
            // InternalErDsl.g:1899:2: ( ruleDataType )
            // InternalErDsl.g:1900:3: ruleDataType
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
    // InternalErDsl.g:1909:1: rule__Attribute__IsKeyAssignment_2 : ( ( 'isIdentifier' ) ) ;
    public final void rule__Attribute__IsKeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1913:1: ( ( ( 'isIdentifier' ) ) )
            // InternalErDsl.g:1914:2: ( ( 'isIdentifier' ) )
            {
            // InternalErDsl.g:1914:2: ( ( 'isIdentifier' ) )
            // InternalErDsl.g:1915:3: ( 'isIdentifier' )
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_2_0()); 
            // InternalErDsl.g:1916:3: ( 'isIdentifier' )
            // InternalErDsl.g:1917:4: 'isIdentifier'
            {
             before(grammarAccess.getAttributeAccess().getIsKeyIsIdentifierKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalErDsl.g:1928:1: rule__Entity__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1932:1: ( ( RULE_ID ) )
            // InternalErDsl.g:1933:2: ( RULE_ID )
            {
            // InternalErDsl.g:1933:2: ( RULE_ID )
            // InternalErDsl.g:1934:3: RULE_ID
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
    // InternalErDsl.g:1943:1: rule__Entity__GeneralizationAssignment_1_1 : ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) ) ;
    public final void rule__Entity__GeneralizationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1947:1: ( ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) ) )
            // InternalErDsl.g:1948:2: ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) )
            {
            // InternalErDsl.g:1948:2: ( ( rule__Entity__GeneralizationAlternatives_1_1_0 ) )
            // InternalErDsl.g:1949:3: ( rule__Entity__GeneralizationAlternatives_1_1_0 )
            {
             before(grammarAccess.getEntityAccess().getGeneralizationAlternatives_1_1_0()); 
            // InternalErDsl.g:1950:3: ( rule__Entity__GeneralizationAlternatives_1_1_0 )
            // InternalErDsl.g:1950:4: rule__Entity__GeneralizationAlternatives_1_1_0
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
    // InternalErDsl.g:1958:1: rule__Entity__IsAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__IsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1962:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl.g:1963:2: ( ( RULE_ID ) )
            {
            // InternalErDsl.g:1963:2: ( ( RULE_ID ) )
            // InternalErDsl.g:1964:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getIsEntityCrossReference_1_2_0()); 
            // InternalErDsl.g:1965:3: ( RULE_ID )
            // InternalErDsl.g:1966:4: RULE_ID
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
    // InternalErDsl.g:1977:1: rule__Entity__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1981:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:1982:2: ( ruleAttribute )
            {
            // InternalErDsl.g:1982:2: ( ruleAttribute )
            // InternalErDsl.g:1983:3: ruleAttribute
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
    // InternalErDsl.g:1992:1: rule__Entity__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:1996:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:1997:2: ( ruleAttribute )
            {
            // InternalErDsl.g:1997:2: ( ruleAttribute )
            // InternalErDsl.g:1998:3: ruleAttribute
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
    // InternalErDsl.g:2007:1: rule__Relation__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Relation__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2011:1: ( ( RULE_ID ) )
            // InternalErDsl.g:2012:2: ( RULE_ID )
            {
            // InternalErDsl.g:2012:2: ( RULE_ID )
            // InternalErDsl.g:2013:3: RULE_ID
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
    // InternalErDsl.g:2022:1: rule__Relation__LeftEndingAssignment_1_1 : ( ruleRelationSideLeft ) ;
    public final void rule__Relation__LeftEndingAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2026:1: ( ( ruleRelationSideLeft ) )
            // InternalErDsl.g:2027:2: ( ruleRelationSideLeft )
            {
            // InternalErDsl.g:2027:2: ( ruleRelationSideLeft )
            // InternalErDsl.g:2028:3: ruleRelationSideLeft
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
    // InternalErDsl.g:2037:1: rule__Relation__RightEndingAssignment_1_3 : ( ruleRelationSideRight ) ;
    public final void rule__Relation__RightEndingAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2041:1: ( ( ruleRelationSideRight ) )
            // InternalErDsl.g:2042:2: ( ruleRelationSideRight )
            {
            // InternalErDsl.g:2042:2: ( ruleRelationSideRight )
            // InternalErDsl.g:2043:3: ruleRelationSideRight
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
    // InternalErDsl.g:2052:1: rule__Relation__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2056:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:2057:2: ( ruleAttribute )
            {
            // InternalErDsl.g:2057:2: ( ruleAttribute )
            // InternalErDsl.g:2058:3: ruleAttribute
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
    // InternalErDsl.g:2067:1: rule__Relation__AttributesAssignment_2_2_1 : ( ruleAttribute ) ;
    public final void rule__Relation__AttributesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2071:1: ( ( ruleAttribute ) )
            // InternalErDsl.g:2072:2: ( ruleAttribute )
            {
            // InternalErDsl.g:2072:2: ( ruleAttribute )
            // InternalErDsl.g:2073:3: ruleAttribute
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
    // InternalErDsl.g:2082:1: rule__RelationSideRight__CardinalityAssignment_0_0 : ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) ) ;
    public final void rule__RelationSideRight__CardinalityAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2086:1: ( ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) ) )
            // InternalErDsl.g:2087:2: ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) )
            {
            // InternalErDsl.g:2087:2: ( ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 ) )
            // InternalErDsl.g:2088:3: ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 )
            {
             before(grammarAccess.getRelationSideRightAccess().getCardinalityAlternatives_0_0_0()); 
            // InternalErDsl.g:2089:3: ( rule__RelationSideRight__CardinalityAlternatives_0_0_0 )
            // InternalErDsl.g:2089:4: rule__RelationSideRight__CardinalityAlternatives_0_0_0
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
    // InternalErDsl.g:2097:1: rule__RelationSideRight__TargetAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideRight__TargetAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2101:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl.g:2102:2: ( ( RULE_ID ) )
            {
            // InternalErDsl.g:2102:2: ( ( RULE_ID ) )
            // InternalErDsl.g:2103:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetEntityCrossReference_0_1_0()); 
            // InternalErDsl.g:2104:3: ( RULE_ID )
            // InternalErDsl.g:2105:4: RULE_ID
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
    // InternalErDsl.g:2116:1: rule__RelationSideRight__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideRight__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2120:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl.g:2121:2: ( ( RULE_ID ) )
            {
            // InternalErDsl.g:2121:2: ( ( RULE_ID ) )
            // InternalErDsl.g:2122:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideRightAccess().getTargetRelationCrossReference_1_0()); 
            // InternalErDsl.g:2123:3: ( RULE_ID )
            // InternalErDsl.g:2124:4: RULE_ID
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
    // InternalErDsl.g:2135:1: rule__RelationSideLeft__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideLeft__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2139:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl.g:2140:2: ( ( RULE_ID ) )
            {
            // InternalErDsl.g:2140:2: ( ( RULE_ID ) )
            // InternalErDsl.g:2141:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetEntityCrossReference_0_0()); 
            // InternalErDsl.g:2142:3: ( RULE_ID )
            // InternalErDsl.g:2143:4: RULE_ID
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
    // InternalErDsl.g:2154:1: rule__RelationSideLeft__TargetAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__RelationSideLeft__TargetAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2158:1: ( ( ( RULE_ID ) ) )
            // InternalErDsl.g:2159:2: ( ( RULE_ID ) )
            {
            // InternalErDsl.g:2159:2: ( ( RULE_ID ) )
            // InternalErDsl.g:2160:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationSideLeftAccess().getTargetRelationCrossReference_1_0_0()); 
            // InternalErDsl.g:2161:3: ( RULE_ID )
            // InternalErDsl.g:2162:4: RULE_ID
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
    // InternalErDsl.g:2173:1: rule__RelationSideLeft__CardinalityAssignment_1_1 : ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) ) ;
    public final void rule__RelationSideLeft__CardinalityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalErDsl.g:2177:1: ( ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) ) )
            // InternalErDsl.g:2178:2: ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) )
            {
            // InternalErDsl.g:2178:2: ( ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 ) )
            // InternalErDsl.g:2179:3: ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 )
            {
             before(grammarAccess.getRelationSideLeftAccess().getCardinalityAlternatives_1_1_0()); 
            // InternalErDsl.g:2180:3: ( rule__RelationSideLeft__CardinalityAlternatives_1_1_0 )
            // InternalErDsl.g:2180:4: rule__RelationSideLeft__CardinalityAlternatives_1_1_0
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000420000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003F80000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000078010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000078000L});

}