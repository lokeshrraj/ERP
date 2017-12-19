package script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {

	public static void main(String[] args) 
	throws MalformedURLException {
	  URL ra=new URL("http://192.168.43.74:4444/wd/hub");
	  DesiredCapabilities dc = DesiredCapabilities.chrome();
	  WebDriver driver=new RemoteWebDriver(ra,dc);	
	}
}














