package saladproducer;

import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;


public class SaladActivator implements BundleActivator, ServiceListener {

	private static BundleContext context;
	ServiceRegistration serviceRegistration;
	
	static BundleContext getContext() {
		return context;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		
		SaladInterface salad = new SaladImpl();
		
		serviceRegistration = context.registerService(SaladInterface.class.getName(), salad, null);
		
		System.out.println("Salad producer started\n");
		
		salad.saladService();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Salad producer finished\n");
		
		serviceRegistration.unregister();
	}

	public void serviceChanged(ServiceEvent ev) {
		
	}


}
