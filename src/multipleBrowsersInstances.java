import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class multipleBrowsersInstances {

	@Parameters("Browser")
	@Test
	 public void mailTest(String browser ) throws MalformedURLException{
	 DesiredCapabilities dr=null;
	 System.out.println(browser);
	 
	 if(browser.equals("firefox")){
		//System.setProperty("webdriver.chrome.driver","G:\\selenium_practice_May'17\\selGrid\\src\\Browsers_drivers\\geckodriver.exe");
		 dr=DesiredCapabilities.firefox();
		 dr.setBrowserName("firefox");
		 dr.setPlatform(Platform.WINDOWS);
	 }else{
		 //System.setProperty("webdriver.chrome.driver","G:\\selenium_practice_May'17\\selGrid\\src\\Browsers_drivers\\chromedriver.exe");
		 dr=DesiredCapabilities.chrome();
		 dr.setBrowserName("chrome");
		 dr.setPlatform(Platform.WINDOWS);
	  }
	 RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"), dr);
	 
	 driver.navigate().to("http://gmail.com");
	 /*driver.findElement(By.xpath("//input[@id='Email']")) .sendKeys("username");
	 driver.findElement(By.xpath("//input[@id='Passwd']")) .sendKeys("password");
	 driver.close();
*/
}
}
