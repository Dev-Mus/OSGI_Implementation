package client_osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import service_math.ServiceMath;

public class Activator implements BundleActivator {
	   private static BundleContext context;
	   
	   static BundleContext getContext() {
	       return context;
	   }
	@Override
	public void start(BundleContext context) throws Exception {
		Activator.context = context;
		System.out.println("*****************************************  \n\n\n");

		System.out.println("\tSalut, je suis le Client !!");
		System.out.println("\t\tClient: Debut ");
		
		// connexion client -> service
		ServiceReference<ServiceMath> serviceReference = context.getServiceReference(ServiceMath.class);
		ServiceMath service = (ServiceMath) context.getService(serviceReference);

		System.out.println("5+3 = "+ service.somme(5, 3));
		System.out.println("5+3 = "+ service.moin(5, 3));
		System.out.println("5+3 = "+ service.mult(5, 3));
		
		System.out.println("\n\n\n *****************************************  \n\n\n");

	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		
		Activator.context = null;
		System.out.println("*****************************************  \n");

		System.out.println("\t\tClient: Fin ");

		System.out.println("\n\n\n *****************************************  \n\n\n");	}

}
