package mar22;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readproperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties prop = new Properties();

FileInputStream fis = new FileInputStream("C:\\automation\\automation\\src\\main\\resources\\config.properties");

prop.load(fis);

String username = prop.getProperty("username");
String password = prop.getProperty("password");

System.out.println(username);
System.out.println(password);


	}

}
