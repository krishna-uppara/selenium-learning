package seleniumLearning.Action;


import java.util.Properties;
import java.io.*; 
public class aaaaaa2
{
	 
public static void main(String[] args)
{
	String path ="D:\\system.properties";
	Properties p = new Properties();
    try {
        // input the file content to the StringBuffer "input"
        BufferedReader file = new BufferedReader(new FileReader(path));
        String line,input="";
        FileInputStream fis = new FileInputStream(path);
        p.load(fis);
        while ((line = file.readLine()) != null) {
        	 input += line + "\n";
        }
        String value = p.getProperty("failed_auth_attempts");
        input = input.replace("failed_auth_attempts = "+value, "failed_auth_attempts = 0");
        FileOutputStream os = new FileOutputStream(path);
        os.write(input.getBytes());

        file.close();
        os.close();

    } catch (Exception e) {
        System.out.println("Problem reading file.");
    }
}

	}
	

    


