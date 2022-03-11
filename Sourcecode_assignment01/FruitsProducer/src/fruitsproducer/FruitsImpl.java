package fruitsproducer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class FruitsImpl implements FruitsInterface{
	
	InputStreamReader r = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);
	
	int tot = 0;
	int qty = 0;
	String type;
	
	public void shareFruits()
	{
		try {
			
			System.out.println("Fruit types\tPrice\nStawberry\t350\nApple\t\t100\nWoodapple\t50\nBanana\t\t175\nPapaya\t\t150\n\n");
			
			System.out.println("Enter the type of fruit required: ");
			type = br.readLine();
			
			
			System.out.println("\nEnter the quantity required: ");
			qty = br.read();
			
			
			if(type.equalsIgnoreCase("Stawberry"))
			{
				tot = 350 * (qty-48);
			}
			else if(type.equalsIgnoreCase("Apple"))
			{
				tot = 100 * (qty-48);
			}
			else if(type.equalsIgnoreCase("Woodapple"))
			{
				tot = 50 * (qty-48);
			}
			else if(type.equalsIgnoreCase("Banana"))
			{
				tot = 175 * (qty-48);
			}
			else if(type.equalsIgnoreCase("Papaya"))
			{
				tot = 150 * (qty-48);
			}
			
			
			System.out.println("\nTotal payable: " +tot + "\n\n");
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
}
