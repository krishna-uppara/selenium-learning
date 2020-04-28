package seleniumLearning.Action;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.io.*; 
public class aaaaaa
{
	 
	public static void main(String[] args)
	{
		FileInputStream fis;
		FileOutputStream fos;
		Properties p = new Properties();
		try
		{
			fis = new FileInputStream("D:\\system.properties");
			p.load(fis);
			fos = new FileOutputStream("D:\\system.properties");
//			p.setProperty("failed_auth_attempts", "0");
			Set key = p.keySet();
			Iterator it = key.iterator();
			String value = p.getProperty("failed_auth_attempts");
			while(it.hasNext())
			{
				String keyname = it.next().toString();
				if(keyname.equals("failed_auth_attempts"))
				{
					p.setProperty(keyname, "0");
				
				}
			} 
			p.store(fos,null);
			fis.close();
			fos.close();
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

