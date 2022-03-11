package saladproducer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaladImpl implements SaladInterface{

	InputStreamReader r = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);
	
	int tot = 0;
	int qty = 0;
	String icecream;
	
	@Override
	public void saladService() {

		try {
			
			System.out.println("Salad\t\tPrice\nFruit salad\t130\nWith ice cream\t20\n\n");
			
			System.out.println("Do you need ice cream: ");
			icecream = br.readLine();
			
			
			System.out.println("\nEnter the quantity required: ");
			qty = br.read();
			
			
			if(icecream.equalsIgnoreCase("Yes"))
			{
				tot = (130 + 20) * (qty-48);
			}
			else 
			{
				tot = 130 * (qty-48);
			}
			
			
			System.out.println("\nTotal payable: " +tot + "\n\n");
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
