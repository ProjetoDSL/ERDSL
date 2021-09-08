package org.xtext.unipampa.erdsl.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.unipampa.erdsl.erDsl.ERModel;
import org.xtext.unipampa.erdsl.erDsl.Entity
import org.xtext.unipampa.erdsl.erDsl.Relation
import org.xtext.unipampa.erdsl.erDsl.Attribute

class HtmlFileGenerator extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		val modeloER = input.contents.get(0) as ERModel
	
		fsa.generateFile('LogicalSchema_' + modeloER.domain.name + '.html', CreateLogical(modeloER))
	
	}
	
	def CreateLogical(ERModel modeloER) '''		
		«html_Head»
		
		«html_DomainMapping(modeloER)»
		
		«html_EntitiesMapping(modeloER)»
		
		«html_RelationshipsMapping(modeloER)»
				
		«html_Footer»
	'''
	
	
	
	
	def private html_Head () '''
	<!DOCTYPE html>
		<html>
		<head>
			<title>ERtext Logical schema</title>
			<meta charset="utf-8">
			<meta name="viewport" content="width=device-width, initial-scale=1">
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
			<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
			
			<style>
			      body {
			        background: #ffffff;
			        border: 1px solid black, padding: 5px 0 5px 0
			      }
			
			      .title {
			        font: bold 160% serif;
			        color: #0066FF;
			        padding: 10px 0 10px 0;
			        text-align: center;
			        background: #ccc8c8
			      }
			
			      .stitle {
			        font: bold 120% sans-serif;
			        color: #0044DD;
			        padding: 10px 0 10px 0
			      }
			
			      .sstitle {
			        font: bold 120% serif;
			        color: #000000;
			        background: #efefef;
			        padding: 5px 0 5px 0;
			        padding-left: 20px;
			      }
			
			      .field {
			        font: 100% sans-serif;
			        color: #000000;
			        padding: 2px;
			        padding-left: 50px;
			        border: 0px solid black
			      }
			
			      .value {
			        font: 100% sans-serif;
			        color: #505050
			      }
			
			      footer {
			        text-align: center;
			        padding: 3px;
			        border: 1px;
			        background-color: #ccc8c8;
			        color: white;
			      }
			    </style>
		</head>
		<body> 
		<div class="panel">
		<p class="title badge-primary">LOGICAL SCHEMA</p>
		</div>		
	'''
	
	def private html_Footer()'''
		<footer>
		  <p><a href="https://github.com/ProjetoDSL/ERDSL">github.com/ProjetoDSL/ERDSL</a></p>
		</footer>
	</body>
	</html>
	'''
	
	/**
	 * Display of the modeled domain (database name)
	 **/
	def private html_DomainMapping (ERModel m) '''
	<p class="sstitle">
	<a href="#domain" class="btn btn-primary" data-toggle="collapse"><i class="fa fa-arrows-v" aria-hidden="true"></i></a>
	&nbsp; Domain
	</p>
	<div id="domain" class="panel-body collapse in">
	<p class="field"><span class="label label-pill label-primary">«m.domain.name.toUpperCase»</span></p>
	</div>	
	
	'''
	
	/**
	*	
	* Display of modeled entities (tables)
	*
	*/
	def private html_EntitiesMapping (ERModel m) '''
	<hr style="width:100%;text-align:left;margin-left:0">
	<p class="sstitle">
	<a href="#entities" class="btn btn-primary" data-toggle="collapse"><i class="fa fa-arrows-v" aria-hidden="true"></i></a>
	&nbsp; Entities
	</p>	 
	<div id="entities" class="panel-body collapse in">
	<p class="field">
	
		«FOR entity : m.entities SEPARATOR " ]<br/><br/>" AFTER "]<br/>"»
			«html_EntityNameTag(entity.name)» [ «html_AtributesMapping(m, entity)»
		«ENDFOR»	
	
	«html_NtoN_EntityCreation(m)»
	«html_Ternary_EntityCreation(m)»
	</div>
	'''
	
	def private html_EntityNameTag (String o) '''
	<span class="label label-pill label-primary">«o.toUpperCase»</span>
	'''
	
		
	/**
	*
	* Verification and display of primary (PK) and, at the same time, foreign (FK) 
	* keys from generalizations / specializations:
	*  1) Checks for a reference to a parent entity;
	*  2) If it exists, the key that references the parent is written being primary and foreign at the same time
	* @param e The analyzed entity.
	*/	
	def private html_AtributesMapping (ERModel m, Entity e) '''
		«var boolean hasPK = false»
		«FOR att : e.attributes.filter[isIsKey] SEPARATOR " | "»
			«html_AttributeStyleForPK(att)»
			«{hasPK=true;null}»
		«ENDFOR»		
		
		«FOR att : e.attributes.filter[!isIsKey] BEFORE if (hasPK) {" | "} SEPARATOR " | "»
			«att.name»
		«ENDFOR»
		«{hasPK=false;null}»
		
		«IF e.is !== null»
			«FOR PKInherited : e.is.attributes.filter[isIsKey] BEFORE " | " SEPARATOR " | "»
				«html_AttributeStyleForInheritedPK(PKInherited)»
			«ENDFOR»
		«ENDIF»
		«html_1To1_RefCheck(m, e)»
		«html_1ToN_RefCheck(m, e)»
	'''
	
	def private html_AttributeStyleForPK (Attribute a) '''<font color="red"><i class="fa fa-key" aria-hidden="true"></i></font> «a.name.toLowerCase»'''
	
	def private html_AttributeStyleForInheritedPK (Attribute a) '''<font color="red"><i class="fa fa-key" aria-hidden="true"></i></font><font color="blue"><i class="fa fa-globe" aria-hidden="true"></i></font> «a.name.toLowerCase»'''
	
	def private html_AttributeStyleForInheritedPK (Entity e) '''
		«FOR attribute : e.attributes.filter[isIsKey] SEPARATOR " | "»
			<font color="red"><i class="fa fa-key" aria-hidden="true"></i></font><font color="blue"><i class="fa fa-globe" aria-hidden="true"></i></font> «attribute.name.toLowerCase»
		«ENDFOR»
	'''
	
	def private html_AttributeStyleForFK (Attribute a) '''<font color="blue"><i class="fa fa-globe" aria-hidden="true"></i></font> «a.name.toLowerCase»'''
	
	def private html_1To1_RefCheck(ERModel m, Entity e) '''
		«FOR relation : m.relations»		
			«IF ((relation.leftEnding.cardinality.equalsIgnoreCase('(0:1)') || relation.leftEnding.cardinality.equalsIgnoreCase('(1:1)'))
							&& 
							(relation.rightEnding.cardinality.equalsIgnoreCase('(0:1)') || relation.rightEnding.cardinality.equalsIgnoreCase('(1:1)')))»	
				«IF relation.rightEnding.target.toString.equalsIgnoreCase(e.name)»
					«FOR aux : m.entities»
						«IF relation.leftEnding.target.toString.equalsIgnoreCase(aux.name)»
							«IF aux.is === null»
								«IF !relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString)»
									«FOR aux2 : aux.attributes.filter[isIsKey] BEFORE " | " SEPARATOR " | "»
										«html_AttributeStyleForFK(aux2)»_fk
									«ENDFOR»
								«ELSE»
									«html_ListPKtoFK_SelfRelationship(aux, relation.name.toLowerCase)»
								«ENDIF»
							
								«/*FIXME precisa implementar um autogenerate para casos em que a tabela foi modelada sem chave primária e sem herança*/»
							
							«ELSEIF aux.is !== null»
								«FOR aux3 : aux.is.attributes.filter[isIsKey] BEFORE " | " SEPARATOR " | "»
									«IF !relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString)»
										«html_AttributeStyleForFK(aux3)»_fk
									«ELSE»
										«html_AttributeStyleForFK(aux3)+"_"+relation.name.toLowerCase»_fk
									«ENDIF»
								«ENDFOR»								
							«ENDIF»
						«ENDIF»
					«ENDFOR»
				«ENDIF»
			«ENDIF»
			«ENDFOR»
	'''
	
	def private html_1ToN_RefCheck(ERModel m, Entity e) '''
	«var Entity temp»
	«FOR relation : m.relations»
			«IF (((relation.leftEnding.cardinality.equalsIgnoreCase('(0:1)') || relation.leftEnding.cardinality.equalsIgnoreCase('(1:1)'))
					&& 
					(relation.rightEnding.cardinality.equalsIgnoreCase('(0:N)') || relation.rightEnding.cardinality.equalsIgnoreCase('(1:N)'))))»
				
				«IF relation.rightEnding.target.toString.equalsIgnoreCase(e.name)»
					«FOR aux : m.entities»
						«IF relation.leftEnding.target.toString.equalsIgnoreCase(aux.name)»
							«IF aux.is === null»
								«IF !relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString)»
									«html_ListPKtoFK(aux)»
								«ELSE»
								 	«html_ListPKtoFK_SelfRelationship(aux, relation.name.toLowerCase)»
								«ENDIF»
							«ELSEIF aux.is !== null»
								«IF relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString)»
									«html_ListPKtoFK_SelfRelationship(aux, relation.name.toLowerCase)»
								«ELSEIF !relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString)»
										«{temp = relation.leftEnding.target as Entity; null;}»
										«html_ListPKtoFK(temp.is)»
								«ENDIF»
							«ENDIF»
						«ENDIF»
					«ENDFOR»
				«ENDIF»
			«ELSEIF (((relation.leftEnding.cardinality.equalsIgnoreCase('(0:N)') || relation.leftEnding.cardinality.equalsIgnoreCase('(1:N)'))
					&& 
					(relation.rightEnding.cardinality.equalsIgnoreCase('(0:1)') || relation.rightEnding.cardinality.equalsIgnoreCase('(1:1)'))))»
			
			«IF relation.leftEnding.target.toString.equalsIgnoreCase(e.name)»
					«FOR aux : m.entities»
						«IF relation.rightEnding.target.toString.equalsIgnoreCase(aux.name)»
							«IF aux.is === null»
								«IF !relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString)»
									«html_ListPKtoFK(aux)»
								«ELSE»
									«html_ListPKtoFK_SelfRelationship(aux, relation.name.toLowerCase)»
								«ENDIF»
							«ELSEIF aux.is !== null»
								«IF relation.rightEnding.target.toString.equalsIgnoreCase(relation.leftEnding.target.toString)» 
									
									«/*FIXME verificar a questão de autorelacionamento de entidades que tem mais de uma pk */»
									
									«html_ListPKtoFK_SelfRelationship(aux, relation.name.toLowerCase)»
								«ELSEIF !relation.rightEnding.target.toString.equalsIgnoreCase(relation.leftEnding.target.toString)»
										«{temp = relation.rightEnding.target as Entity; null;}»
										«html_ListPKtoFK(temp.is)»
								«ENDIF»
							«ENDIF»
						«ENDIF»
					«ENDFOR»
				«ENDIF»				
			«ENDIF»
	«ENDFOR»						
	'''
	
	/**
	 *
	 * Formation of entities from relations N:N.
	 *	1) Checks if there is a name for the relationship, if it does not exist, the name of the two associated entities is concatenated;
	 *  2) The primary keys of the associated entities are allocated and become primary and foreign at the same time;
	 *  3) If the relationship has attributes they are written at the end
	 * @param m The analyzed model.
	 */
	def private html_NtoN_EntityCreation (ERModel m) '''
	«FOR relation : m.relations»
			«IF ((relation.leftEnding.cardinality.equalsIgnoreCase('(0:N)') || relation.leftEnding.cardinality.equalsIgnoreCase('(1:N)'))
			&& 
			(relation.rightEnding.cardinality.equalsIgnoreCase('(0:N)') || relation.rightEnding.cardinality.equalsIgnoreCase('(1:N)')))»		
			«IF relation.leftEnding.target instanceof Entity && relation.rightEnding.target instanceof Entity»
				
				«IF relation.name.nullOrEmpty»
					<br/>«html_EntityNameTag(relation.leftEnding.target.toString.toUpperCase+"_"+relation.rightEnding.target.toString.toUpperCase)» [
				«ELSEIF !relation.name.nullOrEmpty»
					<br/>«html_EntityNameTag(relation.name)» [
				«ENDIF»				
				
				«FOR entity : m.entities»
					«IF relation.leftEnding.target.toString.equalsIgnoreCase(entity.name) && !(relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString))»
						«FOR attribute : entity.attributes.filter[isIsKey] SEPARATOR " | "»
							«html_AttributeStyleForInheritedPK(attribute)»_fk
						«ENDFOR»
					«ENDIF»
				«ENDFOR»
				
				«FOR entity : m.entities»
					«IF relation.rightEnding.target.toString.equalsIgnoreCase(entity.name) && !(relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString))»
						«FOR attribute : entity.attributes.filter[isIsKey] BEFORE " | " SEPARATOR " | "»
							«html_AttributeStyleForInheritedPK(attribute)»_fk
						«ENDFOR»
					«ENDIF»
				«ENDFOR»
				
				«FOR entity : m.entities»
					«/**
					 *
					 * Display of self-relationships N:N
					 *  
					 */»				
					«IF relation.leftEnding.target.toString.equalsIgnoreCase(entity.name) && (relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString))»
						«FOR attribute : entity.attributes.filter[isKey] SEPARATOR " | "»
							«html_AttributeStyleForInheritedPK(attribute)»_fk_1 
						«ENDFOR»
					«ENDIF»
					
					«IF relation.rightEnding.target.toString.equalsIgnoreCase(entity.name) && (relation.rightEnding.target.toString.equalsIgnoreCase(relation.leftEnding.target.toString))»
						«FOR attribute : entity.attributes.filter[isIsKey] BEFORE " | " SEPARATOR " | "»
							«html_AttributeStyleForInheritedPK(attribute)»_fk_2
						«ENDFOR»
					«ENDIF»					
				«ENDFOR»	
				
				«/**
				 *
				 * Display of attributes of N:N relationships
				 *  
				 */»			
				«FOR attribute : relation.attributes.filter[i| !i.name.nullOrEmpty && i.isIsKey] BEFORE " | " SEPARATOR " | "»
					«html_AttributeStyleForPK(attribute)»
				«ENDFOR»
				«FOR attribute : relation.attributes.filter[i| !i.name.nullOrEmpty && !i.isIsKey] BEFORE " | " SEPARATOR " | "»
					«attribute.name.toLowerCase»
				«ENDFOR»
				]<br/>	
			«ENDIF»
		«ENDIF»
		«ENDFOR»		
	'''
	
	def private html_Ternary_EntityCreation (ERModel m) '''
		«/* Var para manipular o relacionamento N para N */»
		«var Relation tempRel»
		
		«/* Busca uma relação que tem outra relação em um dos lados */»
		«FOR relation : m.relations.filter[i| i.leftEnding.target instanceof Relation || i.rightEnding.target instanceof Relation] SEPARATOR "] <br/>" AFTER "] <br/>"»
			
			«IF relation.name.nullOrEmpty»
			
				<br/>«html_EntityNameTag(relation.leftEnding.target.toString.toUpperCase+"_"+relation.rightEnding.target.toString.toUpperCase)» [
			
			«ELSEIF !relation.name.nullOrEmpty»
			
				<br/>«html_EntityNameTag(relation.name)» [
			
			«ENDIF»	
			
			«/* Busca o lado dessa relação que aponta para uma entidade */»
			«IF relation.leftEnding.target instanceof Entity»
			
				«html_AttributeStyleForInheritedPK(relation.leftEnding.target as Entity)»
			
			«ELSEIF relation.rightEnding.target instanceof Entity»
			
				«html_AttributeStyleForInheritedPK(relation.rightEnding.target as Entity)»
			
			«ENDIF»
			
			|
			
			«IF relation.leftEnding.target instanceof Relation»
			
				«{tempRel = relation.leftEnding.target as Relation; null}»
			
				«html_AttributeStyleForInheritedPK(tempRel.leftEnding.target as Entity)»
			|
				«html_AttributeStyleForInheritedPK(tempRel.rightEnding.target as Entity)»
			
			«ELSEIF relation.rightEnding.target instanceof Relation»
			
				«{tempRel = relation.rightEnding.target as Relation; null}»
				
				«html_AttributeStyleForInheritedPK(tempRel.leftEnding.target as Entity)»
			|
				«html_AttributeStyleForInheritedPK(tempRel.rightEnding.target as Entity)»
			«ENDIF»
			
			
			
			«/* Se a relação tiver PKs ou atributos, escreve. */»
			«FOR attribute : relation.attributes.filter[isIsKey] BEFORE " | " SEPARATOR " | "»
		
				«html_AttributeStyleForPK(attribute)»
		
			«ENDFOR»
			
			«FOR attribute : relation.attributes.filter[!isIsKey] BEFORE " | " SEPARATOR " | "»
			
				«attribute.name.toLowerCase»
			
			«ENDFOR»
		
		«ENDFOR»
	'''
	
	def private html_ListPKtoFK (Entity e) '''
		«FOR att : e.attributes.filter[isIsKey] BEFORE " | " SEPARATOR " | "»
			<font color="blue"><i class="fa fa-globe" aria-hidden="true"></i></font> «att.name.toLowerCase»_fk
		«ENDFOR»
	'''

	def private html_ListPKtoFK_Alt (Entity e) '''
		«FOR att : e.attributes.filter[isIsKey] SEPARATOR " , "»
			<font color="blue">«att.name.toLowerCase»_fk</font>
		«ENDFOR»
	'''
	
	def private html_ListPKtoFK_SelfRelationship (Entity e, String r) '''
		«FOR att : e.attributes.filter[isIsKey] BEFORE " | " SEPARATOR " | "»
			<font color="blue"><i class="fa fa-globe" aria-hidden="true"></i></font> «att.name.toLowerCase+"_"+r»_fk
		«ENDFOR»
	'''
	
	def private html_ListPKtoFK_SelfRelationship_Alt (Entity e, String r) '''
		«FOR att : e.attributes.filter[isIsKey] SEPARATOR " , "»
			<font color="blue">«att.name.toLowerCase+"_"+r»_fk</font>
		«ENDFOR»
	'''
	
	def private html_RelationshipsMapping(ERModel m) '''
		<hr style="width:100%;text-align:left;margin-left:0">
		<p class="sstitle">
		<a href="#references" class="btn btn-primary" data-toggle="collapse"><i class="fa fa-arrows-v" aria-hidden="true"></i></a>
		&nbsp; References
		</p>	 
		<div id="references" class="panel-body collapse in">	
		<p class="field">	
		
		«html_GeneralizationSpecialization_Relationship(m)»
		«html_1To1_Relationships(m)»
		«html_1ToN_Relationships(m)»
		«html_NToN_Relationships(m)»
		«html_Ternary_Relationships(m)»
		</div>
	'''

	def private html_GeneralizationSpecialization_Relationship(ERModel m) '''
		«FOR subclass : m.entities.filter[i|i.is !== null]»
			<br/>
			<font color="#505050"><span class="label label-pill label-danger"># Generalization/Specialization</span></br></br>
			Attribute (<font color="blue"><b>
			«FOR superclassAtt : subclass.is.attributes.filter[isIsKey] SEPARATOR " , "»
				«superclassAtt.name.toLowerCase»
			«ENDFOR»	
			</b></font>) in «html_EntityNameTag(subclass.toString)» references «html_EntityNameTag(subclass.is.toString)»
			</br>
		«ENDFOR»	
	'''
	
	def private html_BinaryRelationshipNameStyle(String nameRel, String leftNameRel, String rightNameRel, String leftCardinaltyRel, String rightCardinaltyRel) '''
		<br/>
		<font color="#505050"><span class="label label-pill label-success">## Binary Relationship</span></br></br>
		«IF nameRel.blank» <i>_UnnamedEntity_</i> «ELSEIF !nameRel.blank»«nameRel.toUpperCase»«ENDIF» <i class="fa fa-long-arrow-right" aria-hidden="true"></i>
		«leftNameRel.toUpperCase+" "+leftCardinaltyRel.toUpperCase» relates «rightCardinaltyRel.toUpperCase+" "+ rightNameRel.toUpperCase»
		</font>
		<br/>
	'''
	
	def private html_1To1_Relationships (ERModel m) '''
		«FOR relation : m.relations.filter[i|i.leftEnding.target instanceof Entity && i.rightEnding.target instanceof Entity]»	
			«IF ((relation.leftEnding.cardinality.equalsIgnoreCase('(0:1)') || relation.leftEnding.cardinality.equalsIgnoreCase('(1:1)'))
			&& 
			(relation.rightEnding.cardinality.equalsIgnoreCase('(0:1)') || relation.rightEnding.cardinality.equalsIgnoreCase('(1:1)')))»
				
				«html_BinaryRelationshipNameStyle(relation.name, relation.leftEnding.target.toString, relation.rightEnding.target.toString, relation.leftEnding.cardinality, relation.rightEnding.cardinality)»

				Attribute (<font color="blue"><b> 
				«FOR aux : m.entities»
					«IF relation.leftEnding.target.toString.equalsIgnoreCase(aux.name)»
						«IF aux.is === null»
							«IF !relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString)»
								«FOR aux2 : aux.attributes.filter[isIsKey]»
								«aux2.name.toLowerCase»_fk
								«ENDFOR»
							«ELSE»
								«html_ListPKtoFK_SelfRelationship(aux, relation.name.toLowerCase)»
							«ENDIF»						
						«ELSEIF aux.is !== null»
							«FOR aux3 : aux.is.attributes.filter[isIsKey] SEPARATOR " , "»
								«IF !relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString)»
									«aux3.name.toLowerCase»_fk
								«ELSE»
									«aux3.name.toLowerCase+"_"+relation.name.toLowerCase»_fk
								«ENDIF»
							«ENDFOR»								
						«ENDIF»
					«ENDIF»
				«ENDFOR»
			</b></font>) in «html_EntityNameTag(relation.rightEnding.target.toString)» references «html_EntityNameTag(relation.leftEnding.target.toString)»
			</br>
			«ENDIF»	
		«ENDFOR»
	'''
	
	def private html_1ToN_Relationships (ERModel m) '''
	«var Entity temp»
	«FOR relation : m.relations.filter[i|i.leftEnding.target instanceof Entity && i.rightEnding.target instanceof Entity]»
			«IF (((relation.leftEnding.cardinality.equalsIgnoreCase('(0:1)') || relation.leftEnding.cardinality.equalsIgnoreCase('(1:1)'))
					&& 
					(relation.rightEnding.cardinality.equalsIgnoreCase('(0:N)') || relation.rightEnding.cardinality.equalsIgnoreCase('(1:N)'))))»
				
			«html_BinaryRelationshipNameStyle(relation.name, relation.leftEnding.target.toString, relation.rightEnding.target.toString, relation.leftEnding.cardinality, relation.rightEnding.cardinality)»
				
			Attribute (<font color="blue"><b> 
					«FOR aux : m.entities»
						«IF relation.leftEnding.target.toString.equalsIgnoreCase(aux.name)»
							«IF aux.is === null»
								«IF !relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString)»
									«html_ListPKtoFK_Alt(aux)»
								«ELSEIF relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString)»
									«html_ListPKtoFK_SelfRelationship_Alt(aux, relation.name.toLowerCase)»
								«ENDIF»
							«ELSEIF aux.is !== null»
								«IF relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString)»
									«html_ListPKtoFK_SelfRelationship_Alt(aux, relation.name.toLowerCase)»
								«ELSEIF !relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString)»
										«{temp = relation.leftEnding.target as Entity; null;}»
										«html_ListPKtoFK_Alt(temp.is)»
								«ENDIF»
							«ENDIF»
						«ENDIF»
					«ENDFOR»
			</b></font>) in «html_EntityNameTag(relation.rightEnding.target.toString)» references «html_EntityNameTag(relation.leftEnding.target.toString)»
			</br>
			«ELSEIF (((relation.leftEnding.cardinality.equalsIgnoreCase('(0:N)') || relation.leftEnding.cardinality.equalsIgnoreCase('(1:N)'))
					&& 
					(relation.rightEnding.cardinality.equalsIgnoreCase('(0:1)') || relation.rightEnding.cardinality.equalsIgnoreCase('(1:1)'))))»
			
			«html_BinaryRelationshipNameStyle(relation.name, relation.leftEnding.target.toString, relation.rightEnding.target.toString, relation.leftEnding.cardinality, relation.rightEnding.cardinality)»
			
			Attribute (<font color="blue"><b>
					«FOR aux : m.entities»
						«IF relation.rightEnding.target.toString.equalsIgnoreCase(aux.name)»
							«IF aux.is === null»
								«IF !relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString)»
									«html_ListPKtoFK_Alt(aux)»
								«ELSEIF relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString)»
									«html_ListPKtoFK_SelfRelationship_Alt(aux, relation.name.toLowerCase)»
								«ENDIF»
							«ELSEIF aux.is !== null»
								«IF relation.rightEnding.target.toString.equalsIgnoreCase(relation.leftEnding.target.toString)» 
									
									«/*FIXME verificar a questão de autorelacionamento de entidades que tem mais de uma pk */»
									
									«html_ListPKtoFK_SelfRelationship_Alt(aux, relation.name.toLowerCase)»
								«ELSEIF !relation.rightEnding.target.toString.equalsIgnoreCase(relation.leftEnding.target.toString)»
										«{temp = relation.rightEnding.target as Entity; null;}»
										«html_ListPKtoFK_Alt(temp.is)»
								«ENDIF»
							«ENDIF»
						«ENDIF»
					«ENDFOR»
			</b></font>) in «html_EntityNameTag(relation.leftEnding.target.toString)» references «html_EntityNameTag(relation.rightEnding.target.toString)»
			</br>
				«ENDIF»
			«ENDFOR»	
	'''
	
	def private html_NToN_Relationships(ERModel m) '''
		
		«FOR relation : m.relations.filter[i|i.leftEnding.target instanceof Entity && i.rightEnding.target instanceof Entity]»
			
			«IF ((relation.leftEnding.cardinality.equalsIgnoreCase('(0:N)') || relation.leftEnding.cardinality.equalsIgnoreCase('(1:N)'))
			&& 
			(relation.rightEnding.cardinality.equalsIgnoreCase('(0:N)') || relation.rightEnding.cardinality.equalsIgnoreCase('(1:N)')))»
			
			«html_BinaryRelationshipNameStyle(relation.name, relation.leftEnding.target.toString, relation.rightEnding.target.toString, relation.leftEnding.cardinality, relation.rightEnding.cardinality)»
			
			Attribute (<font color="blue"><b> 
			
			«html_ListPKtoFK_Alt(relation.leftEnding.target as Entity)»
			
			</b></font>) in «html_EntityNameTag(relation.name)» references «html_EntityNameTag(relation.leftEnding.target.toString)»
			</br></br>
			
			Attribute (<font color="blue"><b> 
			
			«html_ListPKtoFK_Alt(relation.rightEnding.target as Entity)»			
						
			</b></font>) in «html_EntityNameTag(relation.name)» references «html_EntityNameTag(relation.rightEnding.target.toString)»
			</br>
			
			«ENDIF»
			
		«ENDFOR»	
	'''
	

	def private html_Ternary_Relationships(ERModel m) '''
		«FOR relation : m.relations.filter[i|i.leftEnding.target instanceof Relation || i.rightEnding.target instanceof Relation] SEPARATOR "</br"»
			<br/><font color="#505050"><span class="label label-pill label-warning">### Ternary Relationship</span></br></br>
			
			<font color="#505050">«IF relation.name.nullOrEmpty» <i>_Unnamed_</i> «ELSEIF !relation.name.nullOrEmpty»«relation.name.toUpperCase»«ENDIF» <i class="fa fa-long-arrow-right" aria-hidden="true"></i>
			«relation.leftEnding.target.toString.toUpperCase+" "+relation.leftEnding.cardinality.toString.toUpperCase» relates «relation.rightEnding.cardinality.toUpperCase+" "+ relation.rightEnding.target.toString.toUpperCase»
			</font><br/>	
			«html_Ternary_Relationships_Attributes(m, relation)»
		«ENDFOR»
	'''
	
	def private html_Ternary_Relationships_Attributes(ERModel m, Relation r)'''
		«var Entity objEntity»
		«var Relation objRelation»
		
		Attribute (<font color="blue"><b>
		
		«IF r.leftEnding.target instanceof Entity»
		
			«{objEntity = r.leftEnding.target as Entity; null}»
		
			«FOR att : objEntity.attributes.filter[isIsKey] SEPARATOR " , "»
				«att.name.toString.toLowerCase»
			«ENDFOR»
		
		</b></font>) in «html_EntityNameTag(r.name)» references «html_EntityNameTag(r.leftEnding.target.toString)»
		</br></br>
		
		«ELSEIF r.rightEnding.target instanceof Entity»
		
			«{objEntity = r.rightEnding.target as Entity; null}»
		
			«FOR att : objEntity.attributes.filter[isIsKey] SEPARATOR " , "»
				«att.name.toString.toLowerCase»
			«ENDFOR»
		
		</b></font>) in «html_EntityNameTag(r.name)» references «html_EntityNameTag(r.rightEnding.target.toString)»
		</br></br>
		
		«ENDIF»
		
		
		
		
		«IF r.leftEnding.target instanceof Relation»
			
			«{objRelation = r.leftEnding.target as Relation; null}»
			
			«{objEntity = objRelation.leftEnding.target as Entity; null}»
			
			Attribute (<font color="blue"><b>
			
			«FOR att : objEntity.attributes.filter[isIsKey] SEPARATOR " , " AFTER " , "»
				«att.name.toString.toLowerCase»
			«ENDFOR»
			
			«{objEntity = objRelation.rightEnding.target as Entity; null}»
			
			«FOR att : objEntity.attributes.filter[isIsKey] SEPARATOR " , "»
				«att.name.toString.toLowerCase»
			«ENDFOR»
			
			</b></font>) in «html_EntityNameTag(r.name)» references «html_EntityNameTag(r.leftEnding.target.toString)»
			</br></br>

		«ELSEIF r.rightEnding.target instanceof Relation»
			
			«{objRelation = r.rightEnding.target as Relation; null}»
		
			«{objEntity = objRelation.leftEnding.target as Entity; null}»
			
			Attribute (<font color="blue"><b>
			
			«FOR att : objEntity.attributes.filter[isIsKey] SEPARATOR " , " AFTER " , "»
				«att.name.toString.toLowerCase»
			«ENDFOR»
			
			«{objEntity = objRelation.rightEnding.target as Entity; null}»
			
			«FOR att : objEntity.attributes.filter[isIsKey] SEPARATOR " , "»
				«att.name.toString.toLowerCase»
			«ENDFOR»
			
			</b></font>) in «html_EntityNameTag(r.name)» references «html_EntityNameTag(r.rightEnding.target.toString)»
			</br></br>
		
		«ENDIF»
		
	'''
	

}
