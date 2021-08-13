/*
 * generated by Xtext 2.17.0
 */
package org.xtext.unipampa.erdsl.validation

import org.eclipse.xtext.validation.Check
import org.xtext.unipampa.erdsl.erDsl.ErDslPackage
import org.xtext.unipampa.erdsl.erDsl.Domain
import org.xtext.unipampa.erdsl.erDsl.Entity
import org.xtext.unipampa.erdsl.erDsl.Attribute

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ErDslValidator extends AbstractErDslValidator {

	public static val INVALID_NAME = 'invalidName'

//	NAMING CONVENTIONS

	@Check
	def checkDomainStartsWithUpperCase(Domain domain) {
		if (!Character.isUpperCase(domain.name.charAt(0))) {
			warning('Preferably start the name of the DOMAIN with a UPPERCASE letter',
				ErDslPackage.Literals.DOMAIN__NAME, INVALID_NAME)
		}
	}

	@Check
	def checkEntityStartsWithUpperCase(Entity entity) {
		if (!Character.isUpperCase(entity.name.charAt(0))) {
			warning('Preferably start the name of an ENTITY with a UPPERCASE letter',
				ErDslPackage.Literals.ENTITY__NAME, INVALID_NAME)
		}
	}

	@Check
	def checkAttributeStartsWithLowerCase(Attribute attribute) {
		if (!Character.isLowerCase(attribute.name.charAt(0))) {
			warning('Preferably start the name of an ATTRIBUTE with a LOWERCASE letter',
				ErDslPackage.Literals.ATTRIBUTE__NAME, INVALID_NAME)
		}
	}
}