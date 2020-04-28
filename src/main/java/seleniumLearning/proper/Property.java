package seleniumLearning.proper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Property
{
	
	public static void main(String[] args)
	{
		
		try
		{
			Properties p = new Properties();
			FileInputStream fis = new FileInputStream("D:\\learning\\seleniumtraining\\src\\proper\\config.properties");
			p.load(fis); 	
			Set states = p.keySet(); // get set-view of keys 
			Iterator itr = states.iterator(); 
			while(itr.hasNext()) { 
			String str = (String) itr.next(); 
			System.out.println("The capital of " + 	str + " is " +	p.getProperty(str) + "."); 
			} 
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
