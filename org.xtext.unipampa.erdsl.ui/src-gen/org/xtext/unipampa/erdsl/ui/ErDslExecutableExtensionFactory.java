/*
 * generated by Xtext 2.22.0
 */
package org.xtext.unipampa.erdsl.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.unipampa.erdsl.ui.internal.ErdslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ErDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(ErdslActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		ErdslActivator activator = ErdslActivator.getInstance();
		return activator != null ? activator.getInjector(ErdslActivator.ORG_XTEXT_UNIPAMPA_ERDSL_ERDSL) : null;
	}

}