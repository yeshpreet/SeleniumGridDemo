import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class newGridFile {
	public static void main(String[] args) throws MalformedURLException  {
		//String url= System.getProperty("user.dir")+"\\src\\Browsers_drivers\\chromedriver.exe";     
		//System.setProperty("webdriver.chrome.driver","G:\\selenium_practice_May'17\\selGrid\\src\\Browsers_drivers\\chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
		System.out.println("abc");
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"), cap);
		driver.get("http://the-internet.herokuapp.com/key_presses");

	}

}
