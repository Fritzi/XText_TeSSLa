/*
 * generated by Xtext 2.12.0
 */
package de.uniluebeck.isp.tessla.ui;

import com.google.inject.Injector;
import de.uniluebeck.isp.tessla.ui.internal.TesslaActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TeSSLaExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return TesslaActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return TesslaActivator.getInstance().getInjector(TesslaActivator.DE_UNILUEBECK_ISP_TESSLA_TESSLA);
	}
	
}
