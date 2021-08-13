/*
 * generated by Xtext 2.22.0
 */
package org.xtext.unipampa.erdsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ErDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ERModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.unipampa.erdsl.ErDsl.ERModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cGenerateKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cTargetGeneratorAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final Alternatives cTargetGeneratorAlternatives_0_1_0 = (Alternatives)cTargetGeneratorAssignment_0_1.eContents().get(0);
		private final Keyword cTargetGeneratorLogicalSchemaKeyword_0_1_0_0 = (Keyword)cTargetGeneratorAlternatives_0_1_0.eContents().get(0);
		private final Keyword cTargetGeneratorPostgreSQLKeyword_0_1_0_1 = (Keyword)cTargetGeneratorAlternatives_0_1_0.eContents().get(1);
		private final Keyword cTargetGeneratorMySQLKeyword_0_1_0_2 = (Keyword)cTargetGeneratorAlternatives_0_1_0.eContents().get(2);
		private final Keyword cTargetGeneratorAllKeyword_0_1_0_3 = (Keyword)cTargetGeneratorAlternatives_0_1_0.eContents().get(3);
		private final Keyword cSemicolonKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cDomainAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDomainDomainParserRuleCall_1_0 = (RuleCall)cDomainAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cEntitiesKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cEntitiesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cEntitiesEntityParserRuleCall_4_0 = (RuleCall)cEntitiesAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cRelationshipsKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cRelationsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cRelationsRelationParserRuleCall_7_0 = (RuleCall)cRelationsAssignment_7.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cRightCurlyBracketKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		
		//ERModel:
		//	('Generate' targetGenerator=('Logical Schema' | 'PostgreSQL' | 'MySQL' | 'All') ';')?
		//	domain=Domain ';' ('Entities' '{') entities+=Entity+ ('}' ';') ('Relationships' '{') relations+=Relation* ('}' ';');
		@Override public ParserRule getRule() { return rule; }
		
		//('Generate' targetGenerator=('Logical Schema' | 'PostgreSQL' | 'MySQL' | 'All') ';')? domain=Domain ';' ('Entities' '{')
		//entities+=Entity+ ('}' ';') ('Relationships' '{') relations+=Relation* ('}' ';')
		public Group getGroup() { return cGroup; }
		
		//('Generate' targetGenerator=('Logical Schema' | 'PostgreSQL' | 'MySQL' | 'All') ';')?
		public Group getGroup_0() { return cGroup_0; }
		
		//'Generate'
		public Keyword getGenerateKeyword_0_0() { return cGenerateKeyword_0_0; }
		
		//targetGenerator=('Logical Schema' | 'PostgreSQL' | 'MySQL' | 'All')
		public Assignment getTargetGeneratorAssignment_0_1() { return cTargetGeneratorAssignment_0_1; }
		
		//('Logical Schema' | 'PostgreSQL' | 'MySQL' | 'All')
		public Alternatives getTargetGeneratorAlternatives_0_1_0() { return cTargetGeneratorAlternatives_0_1_0; }
		
		//'Logical Schema'
		public Keyword getTargetGeneratorLogicalSchemaKeyword_0_1_0_0() { return cTargetGeneratorLogicalSchemaKeyword_0_1_0_0; }
		
		//'PostgreSQL'
		public Keyword getTargetGeneratorPostgreSQLKeyword_0_1_0_1() { return cTargetGeneratorPostgreSQLKeyword_0_1_0_1; }
		
		//'MySQL'
		public Keyword getTargetGeneratorMySQLKeyword_0_1_0_2() { return cTargetGeneratorMySQLKeyword_0_1_0_2; }
		
		//'All'
		public Keyword getTargetGeneratorAllKeyword_0_1_0_3() { return cTargetGeneratorAllKeyword_0_1_0_3; }
		
		//';'
		public Keyword getSemicolonKeyword_0_2() { return cSemicolonKeyword_0_2; }
		
		//domain=Domain
		public Assignment getDomainAssignment_1() { return cDomainAssignment_1; }
		
		//Domain
		public RuleCall getDomainDomainParserRuleCall_1_0() { return cDomainDomainParserRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
		
		//('Entities' '{')
		public Group getGroup_3() { return cGroup_3; }
		
		//'Entities'
		public Keyword getEntitiesKeyword_3_0() { return cEntitiesKeyword_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }
		
		//entities+=Entity+
		public Assignment getEntitiesAssignment_4() { return cEntitiesAssignment_4; }
		
		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_4_0() { return cEntitiesEntityParserRuleCall_4_0; }
		
		//('}' ';')
		public Group getGroup_5() { return cGroup_5; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5_0() { return cRightCurlyBracketKeyword_5_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5_1() { return cSemicolonKeyword_5_1; }
		
		//('Relationships' '{')
		public Group getGroup_6() { return cGroup_6; }
		
		//'Relationships'
		public Keyword getRelationshipsKeyword_6_0() { return cRelationshipsKeyword_6_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_1() { return cLeftCurlyBracketKeyword_6_1; }
		
		//relations+=Relation*
		public Assignment getRelationsAssignment_7() { return cRelationsAssignment_7; }
		
		//Relation
		public RuleCall getRelationsRelationParserRuleCall_7_0() { return cRelationsRelationParserRuleCall_7_0; }
		
		//('}' ';')
		public Group getGroup_8() { return cGroup_8; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8_0() { return cRightCurlyBracketKeyword_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_8_1() { return cSemicolonKeyword_8_1; }
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
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeDataTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cIsKeyAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cIsKeyIsIdentifierKeyword_2_0 = (Keyword)cIsKeyAssignment_2.eContents().get(0);
		
		//Attribute:
		//	name=ID type=DataType isKey?='isIdentifier'?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID type=DataType isKey?='isIdentifier'?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//type=DataType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//DataType
		public RuleCall getTypeDataTypeEnumRuleCall_1_0() { return cTypeDataTypeEnumRuleCall_1_0; }
		
		//isKey?='isIdentifier'?
		public Assignment getIsKeyAssignment_2() { return cIsKeyAssignment_2; }
		
		//'isIdentifier'
		public Keyword getIsKeyIsIdentifierKeyword_2_0() { return cIsKeyIsIdentifierKeyword_2_0; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.unipampa.erdsl.ErDsl.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cIsKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cGeneralizationAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cGeneralizationAlternatives_1_1_0 = (Alternatives)cGeneralizationAssignment_1_1.eContents().get(0);
		private final Keyword cGeneralizationTotalDisjointKeyword_1_1_0_0 = (Keyword)cGeneralizationAlternatives_1_1_0.eContents().get(0);
		private final Keyword cGeneralizationTotalOverlappedKeyword_1_1_0_1 = (Keyword)cGeneralizationAlternatives_1_1_0.eContents().get(1);
		private final Keyword cGeneralizationPartialDisjointKeyword_1_1_0_2 = (Keyword)cGeneralizationAlternatives_1_1_0.eContents().get(2);
		private final Keyword cGeneralizationPartialOverlappedKeyword_1_1_0_3 = (Keyword)cGeneralizationAlternatives_1_1_0.eContents().get(3);
		private final Assignment cIsAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final CrossReference cIsEntityCrossReference_1_2_0 = (CrossReference)cIsAssignment_1_2.eContents().get(0);
		private final RuleCall cIsEntityIDTerminalRuleCall_1_2_0_1 = (RuleCall)cIsEntityCrossReference_1_2_0.eContents().get(1);
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
		//	name=ID ('is' generalization=('total/disjoint' | 'total/Overlapped' | 'partial/disjoint' | 'partial/overlapped')
		//	is=[Entity])? ('{' attributes+=Attribute (',' attributes+=Attribute)* '}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ('is' generalization=('total/disjoint' | 'total/Overlapped' | 'partial/disjoint' | 'partial/overlapped')
		//is=[Entity])? ('{' attributes+=Attribute (',' attributes+=Attribute)* '}')?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//('is' generalization=('total/disjoint' | 'total/Overlapped' | 'partial/disjoint' | 'partial/overlapped') is=[Entity])?
		public Group getGroup_1() { return cGroup_1; }
		
		//'is'
		public Keyword getIsKeyword_1_0() { return cIsKeyword_1_0; }
		
		//generalization=('total/disjoint' | 'total/Overlapped' | 'partial/disjoint' | 'partial/overlapped')
		public Assignment getGeneralizationAssignment_1_1() { return cGeneralizationAssignment_1_1; }
		
		//('total/disjoint' | 'total/Overlapped' | 'partial/disjoint' | 'partial/overlapped')
		public Alternatives getGeneralizationAlternatives_1_1_0() { return cGeneralizationAlternatives_1_1_0; }
		
		//'total/disjoint'
		public Keyword getGeneralizationTotalDisjointKeyword_1_1_0_0() { return cGeneralizationTotalDisjointKeyword_1_1_0_0; }
		
		//'total/Overlapped'
		public Keyword getGeneralizationTotalOverlappedKeyword_1_1_0_1() { return cGeneralizationTotalOverlappedKeyword_1_1_0_1; }
		
		//'partial/disjoint'
		public Keyword getGeneralizationPartialDisjointKeyword_1_1_0_2() { return cGeneralizationPartialDisjointKeyword_1_1_0_2; }
		
		//'partial/overlapped'
		public Keyword getGeneralizationPartialOverlappedKeyword_1_1_0_3() { return cGeneralizationPartialOverlappedKeyword_1_1_0_3; }
		
		//is=[Entity]
		public Assignment getIsAssignment_1_2() { return cIsAssignment_1_2; }
		
		//[Entity]
		public CrossReference getIsEntityCrossReference_1_2_0() { return cIsEntityCrossReference_1_2_0; }
		
		//ID
		public RuleCall getIsEntityIDTerminalRuleCall_1_2_0_1() { return cIsEntityIDTerminalRuleCall_1_2_0_1; }
		
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
		private final RuleCall cLeftEndingRelationSideLeftParserRuleCall_1_1_0 = (RuleCall)cLeftEndingAssignment_1_1.eContents().get(0);
		private final Keyword cRelatesKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cRightEndingAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cRightEndingRelationSideRightParserRuleCall_1_3_0 = (RuleCall)cRightEndingAssignment_1_3.eContents().get(0);
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
		
		////generalization=('TD' | 'TO' | 'PD' | 'PO')
		//Relation:
		//	name=ID? ('[' leftEnding=RelationSideLeft
		//	'relates'
		//	rightEnding=RelationSideRight ']') ('{' attributes+=Attribute (',' attributes+=Attribute)* '}')*;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID? ('[' leftEnding=RelationSideLeft 'relates' rightEnding=RelationSideRight ']') ('{' attributes+=Attribute (','
		//attributes+=Attribute)* '}')*
		public Group getGroup() { return cGroup; }
		
		//name=ID?
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//('[' leftEnding=RelationSideLeft 'relates' rightEnding=RelationSideRight ']')
		public Group getGroup_1() { return cGroup_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }
		
		//leftEnding=RelationSideLeft
		public Assignment getLeftEndingAssignment_1_1() { return cLeftEndingAssignment_1_1; }
		
		//RelationSideLeft
		public RuleCall getLeftEndingRelationSideLeftParserRuleCall_1_1_0() { return cLeftEndingRelationSideLeftParserRuleCall_1_1_0; }
		
		//'relates'
		public Keyword getRelatesKeyword_1_2() { return cRelatesKeyword_1_2; }
		
		//rightEnding=RelationSideRight
		public Assignment getRightEndingAssignment_1_3() { return cRightEndingAssignment_1_3; }
		
		//RelationSideRight
		public RuleCall getRightEndingRelationSideRightParserRuleCall_1_3_0() { return cRightEndingRelationSideRightParserRuleCall_1_3_0; }
		
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
	public class RelationSideRightElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.unipampa.erdsl.ErDsl.RelationSideRight");
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
		
		//RelationSideRight:
		//	cardinality=('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)') target=[Entity] | target=[Relation];
		@Override public ParserRule getRule() { return rule; }
		
		//cardinality=('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)') target=[Entity] | target=[Relation]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//cardinality=('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)') target=[Entity]
		public Group getGroup_0() { return cGroup_0; }
		
		//cardinality=('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)')
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
	public class RelationSideLeftElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.unipampa.erdsl.ErDsl.RelationSideLeft");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cTargetAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final CrossReference cTargetEntityCrossReference_0_0 = (CrossReference)cTargetAssignment_0.eContents().get(0);
		private final RuleCall cTargetEntityIDTerminalRuleCall_0_0_1 = (RuleCall)cTargetEntityCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cTargetAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final CrossReference cTargetRelationCrossReference_1_0_0 = (CrossReference)cTargetAssignment_1_0.eContents().get(0);
		private final RuleCall cTargetRelationIDTerminalRuleCall_1_0_0_1 = (RuleCall)cTargetRelationCrossReference_1_0_0.eContents().get(1);
		private final Assignment cCardinalityAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cCardinalityAlternatives_1_1_0 = (Alternatives)cCardinalityAssignment_1_1.eContents().get(0);
		private final Keyword cCardinality01Keyword_1_1_0_0 = (Keyword)cCardinalityAlternatives_1_1_0.eContents().get(0);
		private final Keyword cCardinality11Keyword_1_1_0_1 = (Keyword)cCardinalityAlternatives_1_1_0.eContents().get(1);
		private final Keyword cCardinality0NKeyword_1_1_0_2 = (Keyword)cCardinalityAlternatives_1_1_0.eContents().get(2);
		private final Keyword cCardinality1NKeyword_1_1_0_3 = (Keyword)cCardinalityAlternatives_1_1_0.eContents().get(3);
		
		//RelationSideLeft:
		//	target=[Entity] | target=[Relation] cardinality=('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)');
		@Override public ParserRule getRule() { return rule; }
		
		//target=[Entity] | target=[Relation] cardinality=('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)')
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//target=[Entity]
		public Assignment getTargetAssignment_0() { return cTargetAssignment_0; }
		
		//[Entity]
		public CrossReference getTargetEntityCrossReference_0_0() { return cTargetEntityCrossReference_0_0; }
		
		//ID
		public RuleCall getTargetEntityIDTerminalRuleCall_0_0_1() { return cTargetEntityIDTerminalRuleCall_0_0_1; }
		
		//target=[Relation] cardinality=('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)')
		public Group getGroup_1() { return cGroup_1; }
		
		//target=[Relation]
		public Assignment getTargetAssignment_1_0() { return cTargetAssignment_1_0; }
		
		//[Relation]
		public CrossReference getTargetRelationCrossReference_1_0_0() { return cTargetRelationCrossReference_1_0_0; }
		
		//ID
		public RuleCall getTargetRelationIDTerminalRuleCall_1_0_0_1() { return cTargetRelationIDTerminalRuleCall_1_0_0_1; }
		
		//cardinality=('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)')
		public Assignment getCardinalityAssignment_1_1() { return cCardinalityAssignment_1_1; }
		
		//('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)')
		public Alternatives getCardinalityAlternatives_1_1_0() { return cCardinalityAlternatives_1_1_0; }
		
		//'(0:1)'
		public Keyword getCardinality01Keyword_1_1_0_0() { return cCardinality01Keyword_1_1_0_0; }
		
		//'(1:1)'
		public Keyword getCardinality11Keyword_1_1_0_1() { return cCardinality11Keyword_1_1_0_1; }
		
		//'(0:N)'
		public Keyword getCardinality0NKeyword_1_1_0_2() { return cCardinality0NKeyword_1_1_0_2; }
		
		//'(1:N)'
		public Keyword getCardinality1NKeyword_1_1_0_3() { return cCardinality1NKeyword_1_1_0_3; }
	}
	
	public class DataTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.unipampa.erdsl.ErDsl.DataType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cINTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cINTIntKeyword_0_0 = (Keyword)cINTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDOUBLEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDOUBLEDoubleKeyword_1_0 = (Keyword)cDOUBLEEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cMONEYEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cMONEYMoneyKeyword_2_0 = (Keyword)cMONEYEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cSTRINGEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cSTRINGStringKeyword_3_0 = (Keyword)cSTRINGEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cBOOLEANEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cBOOLEANBooleanKeyword_4_0 = (Keyword)cBOOLEANEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cDATETIMEEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cDATETIMEDatetimeKeyword_5_0 = (Keyword)cDATETIMEEnumLiteralDeclaration_5.eContents().get(0);
		private final EnumLiteralDeclaration cBLOBEnumLiteralDeclaration_6 = (EnumLiteralDeclaration)cAlternatives.eContents().get(6);
		private final Keyword cBLOBFileKeyword_6_0 = (Keyword)cBLOBEnumLiteralDeclaration_6.eContents().get(0);
		
		//enum DataType:
		//	INT='int' | DOUBLE='double' |
		//	MONEY='money' | STRING='string' |
		//	BOOLEAN='boolean' | DATETIME='datetime' |
		//	BLOB='file';
		public EnumRule getRule() { return rule; }
		
		//INT='int' | DOUBLE='double' | MONEY='money' | STRING='string' | BOOLEAN='boolean' | DATETIME='datetime' | BLOB='file'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INT='int'
		public EnumLiteralDeclaration getINTEnumLiteralDeclaration_0() { return cINTEnumLiteralDeclaration_0; }
		
		//'int'
		public Keyword getINTIntKeyword_0_0() { return cINTIntKeyword_0_0; }
		
		//DOUBLE='double'
		public EnumLiteralDeclaration getDOUBLEEnumLiteralDeclaration_1() { return cDOUBLEEnumLiteralDeclaration_1; }
		
		//'double'
		public Keyword getDOUBLEDoubleKeyword_1_0() { return cDOUBLEDoubleKeyword_1_0; }
		
		//MONEY='money'
		public EnumLiteralDeclaration getMONEYEnumLiteralDeclaration_2() { return cMONEYEnumLiteralDeclaration_2; }
		
		//'money'
		public Keyword getMONEYMoneyKeyword_2_0() { return cMONEYMoneyKeyword_2_0; }
		
		//STRING='string'
		public EnumLiteralDeclaration getSTRINGEnumLiteralDeclaration_3() { return cSTRINGEnumLiteralDeclaration_3; }
		
		//'string'
		public Keyword getSTRINGStringKeyword_3_0() { return cSTRINGStringKeyword_3_0; }
		
		//BOOLEAN='boolean'
		public EnumLiteralDeclaration getBOOLEANEnumLiteralDeclaration_4() { return cBOOLEANEnumLiteralDeclaration_4; }
		
		//'boolean'
		public Keyword getBOOLEANBooleanKeyword_4_0() { return cBOOLEANBooleanKeyword_4_0; }
		
		//DATETIME='datetime'
		public EnumLiteralDeclaration getDATETIMEEnumLiteralDeclaration_5() { return cDATETIMEEnumLiteralDeclaration_5; }
		
		//'datetime'
		public Keyword getDATETIMEDatetimeKeyword_5_0() { return cDATETIMEDatetimeKeyword_5_0; }
		
		//BLOB='file'
		public EnumLiteralDeclaration getBLOBEnumLiteralDeclaration_6() { return cBLOBEnumLiteralDeclaration_6; }
		
		//'file'
		public Keyword getBLOBFileKeyword_6_0() { return cBLOBFileKeyword_6_0; }
	}
	
	private final ERModelElements pERModel;
	private final DomainElements pDomain;
	private final AttributeElements pAttribute;
	private final EntityElements pEntity;
	private final RelationElements pRelation;
	private final RelationSideRightElements pRelationSideRight;
	private final RelationSideLeftElements pRelationSideLeft;
	private final DataTypeElements eDataType;
	
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
		this.pRelationSideRight = new RelationSideRightElements();
		this.pRelationSideLeft = new RelationSideLeftElements();
		this.eDataType = new DataTypeElements();
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
	//	('Generate' targetGenerator=('Logical Schema' | 'PostgreSQL' | 'MySQL' | 'All') ';')?
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
	//	name=ID type=DataType isKey?='isIdentifier'?;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//Entity:
	//	name=ID ('is' generalization=('total/disjoint' | 'total/Overlapped' | 'partial/disjoint' | 'partial/overlapped')
	//	is=[Entity])? ('{' attributes+=Attribute (',' attributes+=Attribute)* '}')?;
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	////generalization=('TD' | 'TO' | 'PD' | 'PO')
	//Relation:
	//	name=ID? ('[' leftEnding=RelationSideLeft
	//	'relates'
	//	rightEnding=RelationSideRight ']') ('{' attributes+=Attribute (',' attributes+=Attribute)* '}')*;
	public RelationElements getRelationAccess() {
		return pRelation;
	}
	
	public ParserRule getRelationRule() {
		return getRelationAccess().getRule();
	}
	
	//RelationSideRight:
	//	cardinality=('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)') target=[Entity] | target=[Relation];
	public RelationSideRightElements getRelationSideRightAccess() {
		return pRelationSideRight;
	}
	
	public ParserRule getRelationSideRightRule() {
		return getRelationSideRightAccess().getRule();
	}
	
	//RelationSideLeft:
	//	target=[Entity] | target=[Relation] cardinality=('(0:1)' | '(1:1)' | '(0:N)' | '(1:N)');
	public RelationSideLeftElements getRelationSideLeftAccess() {
		return pRelationSideLeft;
	}
	
	public ParserRule getRelationSideLeftRule() {
		return getRelationSideLeftAccess().getRule();
	}
	
	//enum DataType:
	//	INT='int' | DOUBLE='double' |
	//	MONEY='money' | STRING='string' |
	//	BOOLEAN='boolean' | DATETIME='datetime' |
	//	BLOB='file';
	public DataTypeElements getDataTypeAccess() {
		return eDataType;
	}
	
	public EnumRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
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