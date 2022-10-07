package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
	
	
	public static String RegistrationTitle_Name;
	

	public WebDriver WebDriverManager() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TGT638\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	
	public String Windowhandle() {

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		String ParentId = it.next();
		String ChildID = it.next();
		driver.switchTo().window(ChildID);
		return ChildID;

	}

}
