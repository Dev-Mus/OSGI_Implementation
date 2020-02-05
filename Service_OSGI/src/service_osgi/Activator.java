package service_osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import service_math.ServiceMath;
import service_math_implements.ServiceMathImplements;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("*****************************************");
		System.out.println("\n Service OSGI: Sav\n");
	       this.connexion();
		System.out.println("\n Service OSGI: Debut\n");
	}

	 private void connexion() {
	       ServiceMath service = new ServiceMathImplements();
	       context.registerService(ServiceMath.class, service, null);
	 }
	 
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("*****************************************");
		System.out.println("\n Service OSGI: Fin\n");		
	}

}
