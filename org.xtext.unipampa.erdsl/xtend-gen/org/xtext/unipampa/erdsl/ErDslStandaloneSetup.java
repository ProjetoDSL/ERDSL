/**
 * generated by Xtext 2.17.0
 */
package org.xtext.unipampa.erdsl;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ErDslStandaloneSetup extends ErDslStandaloneSetupGenerated {
  public static void doSetup() {
    new ErDslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
