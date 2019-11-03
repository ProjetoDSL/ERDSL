/*
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.unipampa.erdsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ErDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ERModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.unipampa.erdsl.ErDsl.ERModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDomainAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDomainDomainParserRuleCall_0_0 = (RuleCall)cDomainAssignment_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cEntitiesKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cEntitiesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEntitiesEntityParserRuleCall_3_0 = (RuleCall)cEntitiesAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cRelationshipsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cRelationsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cRelationsRelationParserRuleCall_6_0 = (RuleCall)cRelationsAssignment_6.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cRightCurlyBracketKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Keyword cSemicolonKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		
		//ERModel:
		//	domain=Domain ';' ('Entities' '{') entities+=Entity+ ('}' ';') ('Relationships' '{') relations+=Relation* ('}' ';');
		@Override public ParserRule getRule() { return rule; }
		
		//domain=Domain ';' ('Entities' '{') entities+=Entity+ ('}' ';') ('Relationships' '{') relations+=Relation* ('}' ';')
		public Group getGroup() { return cGroup; }
		
		//domain=Domain
		public Assignment getDomainAssignment_0() { return cDomainAssignment_0; }
		
		//Domain
		public RuleCall getDomainDomainParserRuleCall_0_0() { return cDomainDomainParserRuleCall_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
		
		//'Entities' '{'
		public Group getGroup_2() { return cGroup_2; }
		
		//'Entities'
		public Keyword getEntitiesKeyword_2_0() { return cEntitiesKeyword_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2_1() { return cLeftCurlyBracketKeyword_2_1; }
		
		//entities+=Entity+
		public Assignment getEntitiesAssignment_3() { return cEntitiesAssignment_3; }
		
		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_3_0() { return cEntitiesEntityParserRuleCall_3_0; }
		
		//'}' ';'
		public Group getGroup_4() { return cGroup_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4_0() { return cRightCurlyBracketKeyword_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_4_1() { return cSemicolonKeyword_4_1; }
		
		//'Relationships' '{'
		public Group getGroup_5() { return cGroup_5; }
		
		//'Relationships'
		public Keyword getRelationshipsKeyword_5_0() { return cRelationshipsKeyword_5_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }
		
		//relations+=Relation*
		public Assignment getRelationsAssignment_6() { return cRelationsAssignment_6; }
		
		//Relation
		public RuleCall getRelationsRelationParserRuleCall_6_0() { return cRelationsRelationParserRuleCall_6_0; }
		
		//'}' ';'
		public Group getGroup_7() { return cGroup_7; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7_0() { return cRightCurlyBracketKeyword_7_0; }
		
		//';'
		public Keyword getSemicolonKeyword_7_1() { return cSemicolonKeyword_7_1; }
	}
	public class DomainElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.unipampa.erdsl.ErDsl.Domain");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDomainKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Domain:
		//	'Domain' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'Domain' name=ID
		public Group getGroup() { return cGroup; }
		
		//'Domain'
		public Keyword getDomainKeyword_0() { return cDomainKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.unipampa.erdsl.ErDsl.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cIsKeyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cIsKeyIsIdentifierKeyword_1_0 = (Keyword)cIsKeyAssignment_1.eContents().get(0);
		
		//Attribute:
		//	name=ID isKey?='isIdentifier'?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID isKey?='isIdentifier'?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//isKey?='isIdentifier'?
		public Assignment getIsKeyAssignment_1() { return cIsKeyAssignment_1; }
		
		//'isIdentifier'
		public Keyword getIsKeyIsIdentifierKeyword_1_0() { return cIsKeyIsIdentifierKeyword_1_0; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.unipampa.erdsl.ErDsl.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cIsKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cIsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cIsEntityCrossReference_1_1_0 = (CrossReference)cIsAssignment_1_1.eContents().get(0);
		private final RuleCall cIsEntityIDTerminalRuleCall_1_1_0_1 = (RuleCall)cIsEntityCrossReference_1_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAttributesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAttributesAttributeParserRuleCall_2_1_0 = (RuleCall)cAttributesAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cAttributesAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cAttributesAttributeParserRuleCall_2_2_1_0 = (RuleCall)cAttributesAssignment_2_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		
		//Entity:
		//	name=ID ('is' is+=[Entity])* ('{' attributes+=Attribute (',' attributes+=Attribute)* '}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ('is' is+=[Entity])* ('{' attributes+=Attribute (',' attributes+=Attribute)* '}')?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//('is' is+=[Entity])*
		public Group getGroup_1() { return cGroup_1; }
		
		//'is'
		public Keyword getIsKeyword_1_0() { return cIsKeyword_1_0; }
		
		//is+=[Entity]
		public Assignment getIsAssignment_1_1() { return cIsAssignment_1_1; }
		
		//[Entity]
		public CrossReference getIsEntityCrossReference_1_1_0() { return cIsEntityCrossReference_1_1_0; }
		
		//ID
		public RuleCall getIsEntityIDTerminalRuleCall_1_1_0_1() { return cIsEntityIDTerminalRuleCall_1_1_0_1; }
		
		//('{' attributes+=Attribute (',' attributes+=Attribute)* '}')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2_0() { return cLeftCurlyBracketKeyword_2_0; }
		
		//attributes+=Attribute
		public Assignment getAttributesAssignment_2_1() { return cAttributesAssignment_2_1; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_2_1_0() { return cAttributesAttributeParserRuleCall_2_1_0; }
		
		//(',' attributes+=Attribute)*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//attributes+=Attribute
		public Assignment getAttributesAssignment_2_2_1() { return cAttributesAssignment_2_2_1; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_2_2_1_0() { return cAttributesAttributeParserRuleCall_2_2_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2_3() { return cRightCurlyBracketKeyword_2_3; }
	}
	public class RelationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.unipampa.erdsl.ErDsl.Relation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cLeftEndingAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cLeftEndingRelationSideParserRuleCall_1_1_0 = (RuleCall)cLeftEndingAssignment_1_1.eContents().get(0);
		private final Keyword cRelatesKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cRightEndingAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cRightEndingRelationSideParserRuleCall_1_3_0 = (RuleCall)cRightEndingAssignment_1_3.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_4 = (Keyword)cGroup_1.eContents().get(4);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftCurlyBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAttributesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAttributesAttributeParserRuleCall_2_1_0 = (RuleCall)cAttributesAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cAttributesAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cAttributesAttributeParserRuleCall_2_2_1_0 = (RuleCall)cAttributesAssignment_2_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		
		//Relation:
		//	name=ID? ('[' leftEnding=RelationSide 'relates' rightEnding=RelationSide ']') ('{'
		//	attributes+=Attribute (',' attributes+=Attribute)* '}')*;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID? ('[' leftEnding=RelationSide 'relates' rightEnding=RelationSide ']') ('{' attributes+=Attribute (','
		//attributes+=Attribute)* '}')*
		public Group getGroup() { return cGroup; }
		
		//name=ID?
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'[' leftEnding=RelationSide 'relates' rightEnding=RelationSide ']'
		public Group getGroup_1() { return cGroup_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }
		
		//leftEnding=RelationSide
		public Assignment getLeftEndingAssignment_1_1() { return cLeftEndingAssignment_1_1; }
		
		//RelationSide
		public RuleCall getLeftEndingRelationSideParserRuleCall_1_1_0() { return cLeftEndingRelationSideParserRuleCall_1_1_0; }
		
		//'relates'
		public Keyword getRelatesKeyword_1_2() { return cRelatesKeyword_1_2; }
		
		//rightEnding=RelationSide
		public Assignment getRightEndingAssignment_1_3() { return cRightEndingAssignment_1_3; }
		
		//RelationSide
		public RuleCall getRightEndingRelationSideParserRuleCall_1_3_0() { return cRightEndingRelationSideParserRuleCall_1_3_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_4() { return cRightSquareBracketKeyword_1_4; }
		
		//('{' attributes+=Attribute (',' attributes+=Attribute)* '}')*
		public Group getGroup_2() { return cGroup_2; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2_0() { return cLeftCurlyBracketKeyword_2_0; }
		
		//attributes+=Attribute
		public Assignment getAttributesAssignment_2_1() { return cAttributesAssignment_2_1; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_2_1_0() { return cAttributesAttributeParserRuleCall_2_1_0; }
		
		//(',' attributes+=Attribute)*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//attributes+=Attribute
		public Assignment getAttributesAssignment_2_2_1() { return cAttributesAssignment_2_2_1; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_2_2_1_0() { return cAttributesAttributeParserRuleCall_2_2_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2_3() { return cRightCurlyBracketKeyword_2_3; }
	}
	public class RelationSideElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.unipampa.erdsl.ErDsl.RelationSide");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cCardinalityAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final Alternatives cCardinalityAlternatives_0_0_0 = (Alternatives)cCardinalityAssignment_0_0.eContents().get(0);
		private final Keyword cCardinality01Keyword_0_0_0_0 = (Keyword)cCardinalityAlternatives_0_0_0.eContents().get(0);
		private final Keyword cCardinality11Keyword_0_0_0_1 = (Keyword)cCardinalityAlternatives_0_0_0.eContents().get(1);
		private final Keyword cCardinality0NKeyword_0_0_0_2 = (Keyword)cCardinalityAlternatives_0_0_0.eContents().get(2);
		private final Keyword cCardinality1NKeyword_0_0_0_3 = (Keyword)cCardinalityAlternatives_0_0_0.eContents().get(3);
		private final Assignment cTargetAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final CrossReference cTargetEntityCrossReference_0_1_0 = (CrossReference)cTargetAssignment_0_1.eContents().get(0);
		private final RuleCall cTargetEntityIDTerminalRuleCall_0_1_0_1 = (RuleCall)cTargetEntityCrossReference_0_1_0.eContents().get(1);
		private final Assignment cTargetAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final CrossReference cTargetRelationCrossReference_1_0 = (CrossReference)cTargetAssignment_1.eContents().get(0);
		private final RuleCall cTargetRelationIDTerminalRuleCall_1_0_1 = (RuleCall)cTargetRelationCrossReference_1_0.eContents().get(1);
		
		//RelationSide:
		//	Cardinality=('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)') target=[Entity] | target=[Relation];
		@Override public ParserRule getRule() { return rule; }
		
		//Cardinality=('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)') target=[Entity] | target=[Relation]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Cardinality=('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)') target=[Entity]
		public Group getGroup_0() { return cGroup_0; }
		
		//Cardinality=('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)')
		public Assignment getCardinalityAssignment_0_0() { return cCardinalityAssignment_0_0; }
		
		//('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)')
		public Alternatives getCardinalityAlternatives_0_0_0() { return cCardinalityAlternatives_0_0_0; }
		
		//'(0:1)'
		public Keyword getCardinality01Keyword_0_0_0_0() { return cCardinality01Keyword_0_0_0_0; }
		
		//'(1:1)'
		public Keyword getCardinality11Keyword_0_0_0_1() { return cCardinality11Keyword_0_0_0_1; }
		
		//'(0:N)'
		public Keyword getCardinality0NKeyword_0_0_0_2() { return cCardinality0NKeyword_0_0_0_2; }
		
		//'(1:N)'
		public Keyword getCardinality1NKeyword_0_0_0_3() { return cCardinality1NKeyword_0_0_0_3; }
		
		//target=[Entity]
		public Assignment getTargetAssignment_0_1() { return cTargetAssignment_0_1; }
		
		//[Entity]
		public CrossReference getTargetEntityCrossReference_0_1_0() { return cTargetEntityCrossReference_0_1_0; }
		
		//ID
		public RuleCall getTargetEntityIDTerminalRuleCall_0_1_0_1() { return cTargetEntityIDTerminalRuleCall_0_1_0_1; }
		
		//target=[Relation]
		public Assignment getTargetAssignment_1() { return cTargetAssignment_1; }
		
		//[Relation]
		public CrossReference getTargetRelationCrossReference_1_0() { return cTargetRelationCrossReference_1_0; }
		
		//ID
		public RuleCall getTargetRelationIDTerminalRuleCall_1_0_1() { return cTargetRelationIDTerminalRuleCall_1_0_1; }
	}
	
	
	private final ERModelElements pERModel;
	private final DomainElements pDomain;
	private final AttributeElements pAttribute;
	private final EntityElements pEntity;
	private final RelationElements pRelation;
	private final RelationSideElements pRelationSide;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ErDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pERModel = new ERModelElements();
		this.pDomain = new DomainElements();
		this.pAttribute = new AttributeElements();
		this.pEntity = new EntityElements();
		this.pRelation = new RelationElements();
		this.pRelationSide = new RelationSideElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.unipampa.erdsl.ErDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ERModel:
	//	domain=Domain ';' ('Entities' '{') entities+=Entity+ ('}' ';') ('Relationships' '{') relations+=Relation* ('}' ';');
	public ERModelElements getERModelAccess() {
		return pERModel;
	}
	
	public ParserRule getERModelRule() {
		return getERModelAccess().getRule();
	}
	
	//Domain:
	//	'Domain' name=ID;
	public DomainElements getDomainAccess() {
		return pDomain;
	}
	
	public ParserRule getDomainRule() {
		return getDomainAccess().getRule();
	}
	
	//Attribute:
	//	name=ID isKey?='isIdentifier'?;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//Entity:
	//	name=ID ('is' is+=[Entity])* ('{' attributes+=Attribute (',' attributes+=Attribute)* '}')?;
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Relation:
	//	name=ID? ('[' leftEnding=RelationSide 'relates' rightEnding=RelationSide ']') ('{'
	//	attributes+=Attribute (',' attributes+=Attribute)* '}')*;
	public RelationElements getRelationAccess() {
		return pRelation;
	}
	
	public ParserRule getRelationRule() {
		return getRelationAccess().getRule();
	}
	
	//RelationSide:
	//	Cardinality=('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)') target=[Entity] | target=[Relation];
	public RelationSideElements getRelationSideAccess() {
		return pRelationSide;
	}
	
	public ParserRule getRelationSideRule() {
		return getRelationSideAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}