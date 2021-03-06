package Util;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class Driver {

		public static WebDriver startBrowser(String browsertype, String url) {
			// TODO Auto-generated method stub
			
			String chromePath="C:\\Users\\SOUMYA HUGAR\\Documents\\CAPGEMINI\\sample\\chromedriver_win32\\chromedriver.exe";
			String firefoxPathh = "C:\\gekodriver\\geckodriver-v0.30.0-win32\\geckodrive.exer";
			
			WebDriver driver=null;
			switch (browsertype)
			{
			case "firefox":
				
				System.setProperty("webdriver.gecko.driver", firefoxPathh);
				driver=new FirefoxDriver();
				break;
			case "chrome":
				 System.setProperty("webdriver.chrome.driver",chromePath);
				driver=new ChromeDriver();
				
				break;
			default:
				break;
			}	
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    	driver.manage().window().maximize();
			return driver;
		}

	}



