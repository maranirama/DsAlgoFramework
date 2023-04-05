package appHooks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pages.SignInPage;
import com.qa.factory.Launch_Browser;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksClass {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	public static String path = "C:\\Rama\\workspace\\DsAlgo_FrameWork\\src\\test\\resources\\Config_Files\\config1.properties";
	
	//@Before(order=0)
	
	
		public static WebDriver driverSetup() throws IOException 
	{

			
				if(driver == null) 
				{
					fr = new FileReader(path);
					prop.load(fr);
					if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
					{
						WebDriverManager.chromedriver().setup();

						driver = new ChromeDriver();
						driver.manage().deleteAllCookies();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						driver.get(prop.getProperty("url"));

					}
			
				
			
			  if(prop.getProperty("browser").equalsIgnoreCase("FireFox")) 
			  {
			  WebDriverManager.firefoxdriver().setup();
			  driver = new FirefoxDriver();
			  driver.manage().deleteAllCookies();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  driver.get(prop.getProperty("url")); }
			 
			return driver;
		} 
	else
			return driver;
	}
	
	//@Before(order=1)
	public void L_url(String uname,String pword)
	{
		Launch_Browser.driver.get(ConfigReader.launch_Web("home_url"));
		SignInPage si=new SignInPage(Launch_Browser.driver);
		si.signin();
		 si.username(uname);
		   si.password(pword);
		   si.login();
	}
	
	//@After
	public void Browser_C()
	{
		driver.quit();
	}

}
