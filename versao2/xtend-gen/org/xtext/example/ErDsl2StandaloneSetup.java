/**
 * generated by Xtext 2.17.0
 */
package org.xtext.example;

import org.xtext.example.ErDsl2StandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ErDsl2StandaloneSetup extends ErDsl2StandaloneSetupGenerated {
  public static void doSetup() {
    new ErDsl2StandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
