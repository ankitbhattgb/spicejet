package resources;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException 
	{
		prop = new Properties();

		FileInputStream fis = new FileInputStream("C:\\Users\\Ankit Bhatt\\prodWeb\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);
		String browserName= prop.getProperty("browser");
		if (browserName.equals("chrome"))
		{	
			System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D://Drivers//geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		else if (browserName.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "D://Drivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else if (browserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "D://Drivers//MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		return driver;
	} 	

}