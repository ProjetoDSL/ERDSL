package org.xtext.unipampa.erdsl.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.unipampa.erdsl.erDsl.ERModel

class OcurrenceDiagramGenerator extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		val modeloER = input.contents.get(0) as ERModel
		
		try {
			fsa.generateFile(modeloER.domain.name.toLowerCase+'_OcurrenceDiagram.sql', ocurrence_CreateDiagram(modeloER))
		} catch (Exception e) {			
			println(e.stackTrace.toString)
		}	
		
	}
	
	def private ocurrence_CreateDiagram(ERModel modeloER) '''	
		Test
	'''
	
}