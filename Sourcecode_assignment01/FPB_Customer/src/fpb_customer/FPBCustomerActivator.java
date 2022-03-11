package fpb_customer;

import fruitsproducer.FruitsInterface;
import jamproducer.JamInterface;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;
import juiceproducer.JuiceInterface;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;
import saladproducer.SaladInterface;

public class FPBCustomerActivator implements BundleActivator {

	InputStreamReader r = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);
	
	ServiceReference serviceReference;
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Customer service starting\n");
		
		System.out.println("Products\nJam\nFruits\nSalad\nJuice\n\n");
		
		System.out.println("Enter the name of product you would like to have: ");
		String serviceType = br.readLine();
		
		System.out.println("Service: "+serviceType);
		
		if(serviceType.equalsIgnoreCase("Jam"))
		{
			serviceReference = context.getServiceReference(JamInterface.class.getName());
			
			JamInterface jam = (JamInterface) context.getService(serviceReference);
		}
		else if(serviceType.equalsIgnoreCase("Fruits"))
		{
			serviceReference = context.getServiceReference(FruitsInterface.class.getName());
			
			FruitsInterface fruits = (FruitsInterface) context.getService(serviceReference);
		}
		else if(serviceType.equalsIgnoreCase("Salad"))
		{
			serviceReference = context.getServiceReference(SaladInterface.class.getName());
			
			SaladInterface salad = (SaladInterface) context.getService(serviceReference);
		}
		else if(serviceType.equalsIgnoreCase("Juice"))
		{
			serviceReference = context.getServiceReference(JuiceInterface.class.getName());
			
			JuiceInterface juice = (JuiceInterface) context.getService(serviceReference);
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Stopping customer service\n");
		context.ungetService(serviceReference);
	}

	public void serviceChanged(ServiceEvent ev) {
		
	}


}
