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
	
	var Entity lEnt;
	var Entity rEnt;
	var Relation lRel;
	var Relation rRel;
	
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
			    body    { background: #ffffff; border: 1px solid black, padding: 5px 0 5px 0}
			    .title  { font: bold 160% serif; color: #0066FF; padding: 10px 0 10px 0; text-align: center; background: #ccc8c8}
			    .stitle { font: bold 120% sans-serif; color: #0044DD; padding: 10px 0 10px 0 }
			    .sstitle{ font: bold 120% serif; color: #000000; background: #efefef; padding: 5px 0 5px 0; padding-left: 20px;}
			    .field  { font: 100% sans-serif; color: #000000; padding: 2px; padding-left: 50px; border: 0px solid black}
			    .value  { font: 100% sans-serif; color: #505050 }
			    footer 	{ text-align: center; padding: 3px; border: 1px; background-color: #ccc8c8; color: white;}
			</style>
		</head>
		<body> 
		<div class="panel">
		<p class="title badge-primary">LOGICAL SCHEMA</p>
		</div>		
	'''
	
	def private html_Footer()'''
	</p>
	</div>	
	</body>
		<footer>
		  <p><a href="https://github.com/ProjetoDSL/ERDSL">github.com/ProjetoDSL/ERDSL</a></p>
		</footer>
	</html>
	'''
	
	/**
	 * Display of the modeled domain (database name)
	 **/
	def private html_DomainMapping (ERModel m) '''
	<p class="sstitle">
	<a href="#domain" class="btn btn-primary" data-toggle="collapse"><i class="fa fa-arrows-v" aria-hidden="true"></i></a>
	&nbsp Modelled Domain
	</p>
	<div id="domain" class="panel-body collapse in">
	<p class="field">«m.domain.name.toUpperCase»</p>
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
	&nbsp Resulting Entities
	</p>	 
	<div id="entities" class="panel-body collapse in">
	<p class="field">
	
		«FOR entity : m.entities SEPARATOR " )</br></br>" AFTER ")</br>"»
			«html_EntityNameTag(entity)» ( «html_AtributesMapping(m, entity)»
		«ENDFOR»	
	
	«html_NtoN_EntityCreation(m)»
	
	</div>
	'''
	def private html_EntityNameTag (Entity e) '''
	<span class="badge badge-secondary">«e.name.toUpperCase»</span>
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
		«FOR att : e.attributes SEPARATOR ", "»
			«IF att.isIsKey»
				«html_AttributeStyleForPK(att)»
			«ELSE»
				«att.name»
			«ENDIF»
		«ENDFOR»
		«IF e.is !== null»
			«FOR PKInherited : e.is.attributes»
				«IF PKInherited.isIsKey»
					, «html_AttributeStyleForInheritedPK(PKInherited)»
				«ENDIF»
			«ENDFOR»
		«ENDIF»
		«html_1To1_RefCheck(m, e)»
		«html_1ToN_RefCheck(m, e)»
	'''
	
	def private html_AttributeStyleForPK (Attribute a) '''
		<font color="red"><i class="fa fa-key" aria-hidden="true"></i></font>«a.name.toLowerCase»
	'''
	
	def private html_AttributeStyleForInheritedPK (Attribute a) '''
		<font color="red"><i class="fa fa-key" aria-hidden="true"></i></font><font color="blue"><i class="fa fa-globe" aria-hidden="true"></i></font>«a.name.toLowerCase»
	'''
	
	def private html_AttributeStyleForFK (Attribute a) '''
		<font color="blue"><i class="fa fa-globe" aria-hidden="true"></i></font>«a.name.toLowerCase»
	'''
	
	def private html_1To1_RefCheck(ERModel m, Entity e) '''
		«FOR relation : m.relations»		
			«IF ((relation.leftEnding.cardinality.equalsIgnoreCase('(0:1)') || relation.leftEnding.cardinality.equalsIgnoreCase('(1:1)'))
							&& 
							(relation.rightEnding.cardinality.equalsIgnoreCase('(0:1)') || relation.rightEnding.cardinality.equalsIgnoreCase('(1:1)')))»	
				«IF relation.rightEnding.target.toString.equalsIgnoreCase(e.name)»
					«FOR aux : m.entities»
						«IF relation.leftEnding.target.toString.equalsIgnoreCase(aux.name)»
							«IF aux.is === null»
								«FOR aux2 : aux.attributes»
									«IF aux2.isIsKey» «/*FIXME precisa implementar um autogenerate para casos em que a tabela foi modelada sem chave primária e sem herança*/»
										, «html_AttributeStyleForFK(aux2)»_fk#1:1=1
									«ENDIF»
								«ENDFOR»
							«ELSEIF aux.is !== null»
								«FOR aux3 : aux.is.attributes»
									«IF aux3.isIsKey»
										, «html_AttributeStyleForFK(aux3)»_fk#1:1=2
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
«««								, <font color="blue"><b>«aux.name»_fk 1</b></font>
								«html_ListPKtoFK(aux)»#1
							«ELSEIF aux.is !== null»
								«IF relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString)»
									, <font color="blue"><i class="fa fa-globe" aria-hidden="true"></i></font>«relation.name.toString»_fk#2
								«ELSEIF !relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString)»
«««									, <font color="blue"><b>«relation.leftEnding.target.toString»_fk 3</b></font>
										«{temp = relation.leftEnding.target as Entity; null;}»
										«html_ListPKtoFK(temp.is)»#3
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
								«html_ListPKtoFK(aux)»#4
							«ELSEIF aux.is !== null»
								«IF relation.rightEnding.target.toString.equalsIgnoreCase(relation.leftEnding.target.toString)»
									, <font color="blue"><b>«relation.name.toString»_fk#5</b></font>
								«ELSEIF !relation.rightEnding.target.toString.equalsIgnoreCase(relation.leftEnding.target.toString)»
«««									, <font color="blue"><b>«relation.leftEnding.target.toString»_fk 6</b></font>
										«{temp = relation.leftEnding.target as Entity; null;}»
										«html_ListPKtoFK(temp.is)»#6
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
				</br><span class="badge badge-secondary">«relation.leftEnding.target.toString.toUpperCase»_«relation.rightEnding.target.toString.toUpperCase»</span> (
				«ELSEIF !relation.name.nullOrEmpty»
				</br><span class="badge badge-secondary">«relation.name.toUpperCase»</span> (
				«ENDIF»				
				«FOR entity : m.entities»
					
					«IF relation.leftEnding.target.toString.equalsIgnoreCase(entity.name) && (relation.leftEnding.target.toString !== relation.rightEnding.target.toString)»
	«««					«FOR attribute : entity.attributes»
	«««						«IF attribute.isIsKey»
								<font color="blue"><b>«relation.leftEnding.target.toString»_fk</b></font>,
	«««						«ENDIF»
	«««					«ENDFOR»
					«ENDIF»
					
					«IF relation.rightEnding.target.toString.equalsIgnoreCase(entity.name) && (relation.rightEnding.target.toString !== relation.leftEnding.target.toString)»
	«««					«FOR attribute : entity.attributes»
	«««						«IF attribute.isIsKey»
								<font color="blue"><b>«relation.rightEnding.target.toString»_fk</b></font>
	«««						«ENDIF»
	«««					«ENDFOR»
					«ENDIF»
					
					«/**
					 *
					 * Display of self-relationships N:N
					 *  
					 */»				
					«IF relation.leftEnding.target.toString.equalsIgnoreCase(entity.name) && (relation.leftEnding.target.toString.equalsIgnoreCase(relation.rightEnding.target.toString))»
						«FOR attribute : entity.attributes»
							«IF attribute.isIsKey»
								<font color="blue"><b>«attribute.name»__fk1</b></font>,
							«ENDIF»
						«ENDFOR»
					«ENDIF»
					
					«IF relation.rightEnding.target.toString.equalsIgnoreCase(entity.name) && (relation.rightEnding.target.toString.equalsIgnoreCase(relation.leftEnding.target.toString))»
						«FOR attribute : entity.attributes»
							«IF attribute.isIsKey»
								<font color="blue"><b>«attribute.name»__fk2</b></font>
							«ENDIF»
						«ENDFOR»
					«ENDIF»					
				«ENDFOR»	
				
				«/**
				 *
				 * Display of attributes of N: N relationships
				 *  
				 */»			
				«FOR attribute : relation.attributes»
					«IF !attribute.name.nullOrEmpty && attribute.isIsKey»
						, <font color="red"><b>«attribute.name»*</b></font>
					«ENDIF»
				«ENDFOR»
	
				«FOR attribute : relation.attributes»
					«IF !attribute.name.nullOrEmpty && !attribute.isIsKey»
						, «attribute.name»
					«ENDIF»
				«ENDFOR»
						
				)</br>
				
			«ENDIF»
		«ENDIF»
		«ENDFOR»
		</br>
		
	'''
	
	def private html_ListPKtoFK (Entity e) '''
		«FOR att : e.attributes»
			«IF att.isIsKey»
				, <font color="blue"><i class="fa fa-globe" aria-hidden="true"></i></font>«att.name»_fk
			«ENDIF»
		«ENDFOR»
	'''
	
	def private html_RelationshipsMapping(ERModel m) '''
		<hr style="width:100%;text-align:left;margin-left:0">
		<p class="sstitle">
		<a href="#references" class="btn btn-primary" data-toggle="collapse"><i class="fa fa-arrows-v" aria-hidden="true"></i></a>
		&nbsp Mapped References
		</p>	 
		<div id="references" class="panel-body collapse in">	
		<p class="field">	
		«FOR relation : m.relations SEPARATOR "</br></br>"»
			«IF relation.leftEnding.target instanceof Entity»
				«{lEnt = relation.leftEnding.target as Entity;null}»
			«ELSE»
				«{lRel = relation.leftEnding.target as Relation;null}»
			«ENDIF»
			«IF relation.rightEnding.target instanceof Entity»
				«{rEnt = relation.rightEnding.target as Entity;null}»
			«ELSE»
				«{rRel = relation.rightEnding.target as Relation;null}»
			«ENDIF»

			«/* FIXME: precisa implementar a funçao de concatenação para relaçao sem nome */»

			<font color="#505050">Relationship: «IF relation.name.nullOrEmpty» <i>_UnnamedEntity_</i> «ELSEIF !relation.name.nullOrEmpty»«relation.name»«ENDIF» <i class="fa fa-long-arrow-right" aria-hidden="true"></i>
			«IF this.lEnt !== null»
				«this.lEnt.name»
			«ELSEIF this.lRel !== null»
				«this.lRel.name»
			«ENDIF» 
			«relation.leftEnding.cardinality.toString» relates «relation.rightEnding.cardinality»
			«IF this.rEnt !== null»
				«this.rEnt.name»
			«ELSEIF this.rRel !== null»
				«this.rRel.name»
			«ENDIF»
			</font></br>
			
			«{this.lEnt = null;null}»«{this.rEnt = null;null}»
			«{this.lRel = null;null}»«{this.rRel = null;null}»
		«ENDFOR»
		
		</div>
	
	'''
	
	

}
