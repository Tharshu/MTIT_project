package juiceproducer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JuiceImpl implements JuiceInterface{

	InputStreamReader r = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);
	
	int tot = 0;
	int qty = 0;
	String type;
	
	@Override
	public void juiceService() {

		try {
			
			System.out.println("Juice\t\tPrice\nMango\t\t130\nAvacado\t\t120\nLime\t\t100\nWatermellon\t135\nLassi\t\t150\n\n");
			
			System.out.println("Enter the juice wanted: ");
			type = br.readLine();
			
			
			System.out.println("\nEnter the quantity required: ");
			qty = br.read();
			
			
			if(type.equalsIgnoreCase("Mango"))
			{
				tot = 130 * (qty-48);
			}
			else if(type.equalsIgnoreCase("Avacado"))
			{
				tot = 120 * (qty-48);
			}
			else if(type.equalsIgnoreCase("Lime"))
			{
				tot = 100 * (qty-48);
			}
			else if(type.equalsIgnoreCase("Watermellon"))
			{
				tot = 135 * (qty-48);
			}
			else if(type.equalsIgnoreCase("Lassi"))
			{
				tot = 150 * (qty-48);
			}
			
			
			System.out.println("\nTotal payable: " +tot + "\n\n");
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
