package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Utils.TestBase;
import io.cucumber.java.en.*;

public class LoginStep extends TestBase {

	WebDriver driver = WebDriverManager();
	public Actions action;
	@Given("^Land on Page$")
	public void land_on_page() throws Throwable {
		driver.get("https://www.facebook.com/login/");
	}
	@When("^Enter with (.+) and (.+)$")
	public void enter_with_and(String username, String password) throws Throwable {

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);

	}

	@Then("^Successfully login$")
	public void successfully_login() throws Throwable {

		// driver.findElement(By.id("loginbutton")).click();
		action = new Actions(driver);
		WebElement signup = driver.findElement(By.className("_97w5"));
		// action.moveToElement(signup).click().build().perform();
		// Thread.sleep(50000);
		// .quit();
		action.moveToElement(signup).keyDown(Keys.CONTROL).click().build().perform();
		Windowhandle();

	}

}
