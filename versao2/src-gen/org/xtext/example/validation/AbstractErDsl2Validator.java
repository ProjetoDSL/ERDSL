/*
 * generated by Xtext 2.17.1
 */
package org.xtext.example.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractErDsl2Validator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.example.erDsl2.ErDsl2Package.eINSTANCE);
		return result;
	}
}
