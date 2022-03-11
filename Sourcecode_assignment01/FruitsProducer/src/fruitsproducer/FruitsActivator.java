package fruitsproducer;

import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;


public class FruitsActivator implements BundleActivator, ServiceListener {

	private static BundleContext context;
	ServiceRegistration serviceRegistration;
	
	static BundleContext getContext() {
		return context;
	}

	@Override
	public void start(BundleContext context) throws Exception {

		FruitsInterface fruitsObj = new FruitsImpl();
		
		serviceRegistration = context.registerService(FruitsInterface.class.getName(), fruitsObj, null);
		
		System.out.println("Fruit producer started\n");
		
		fruitsObj.shareFruits();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Fruit producer finished\n");
		
		serviceRegistration.unregister();
	}

	public void serviceChanged(ServiceEvent ev) {
		
	}


}
