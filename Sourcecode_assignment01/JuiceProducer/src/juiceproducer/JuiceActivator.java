package juiceproducer;

import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;


public class JuiceActivator implements BundleActivator, ServiceListener {

	private static BundleContext context;
	ServiceRegistration serviceRegistration;
	
	static BundleContext getContext() {
		return context;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		
		JuiceInterface juice = new JuiceImpl();
		
		serviceRegistration = context.registerService(JuiceInterface.class.getName(), juice, null);
		
		System.out.println("Juice producer started\n");
		
		juice.juiceService();
	}

	@Override
	public void stop(BundleContext context) throws Exception {

		System.out.println("Juice producer finished\n");
		
		serviceRegistration.unregister();
	}

	public void serviceChanged(ServiceEvent ev) {
		
	}


}
