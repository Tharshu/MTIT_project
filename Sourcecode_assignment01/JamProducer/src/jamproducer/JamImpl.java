package jamproducer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JamImpl implements JamInterface{

	InputStreamReader r = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);
	
	int tot = 0;
	int qty = 0;
	String type;
	
	public void jamService()
	{
		try {
			
			System.out.println("Jam types\tPrice\nStawberry\t500\nMixed fruit\t750\nWoodapple\t550\n\n\n");
			
			System.out.println("Enter the type of Jam required: ");
			type = br.readLine();
			
			
			System.out.println("\nEnter the quantity required: ");
			qty = br.read();
			
			
			if(type.equalsIgnoreCase("Stawberry"))
			{
				tot = 500 * (qty-48);
			}
			else if(type.equalsIgnoreCase("Mixed fruit"))
			{
				tot = 750 * (qty-48);
			}
			else if(type.equalsIgnoreCase("Woodapple"))
			{
				tot = 550 * (qty-48);
			}
			
			
			System.out.println("\nTotal payable: " +tot + "\n\n");
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
