package Step;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.TestBase;

public class RegisStep extends TestBase {

	public String ExepctedRegName;

	WebDriver driver = WebDriverManager();
	public List<List<String>> datablelist;

	@Given("Land on Registraion Page")
	public void land_on_registraion_page() {
		if (ExepctedRegName.equalsIgnoreCase(RegistrationTitle_Name)) {

			System.out.println("Its Landed on Proper Page");

		}

	}

	@When("Enter below Details")
	public void enter_below_details(DataTable dataTable) {

		datablelist = dataTable.asLists();

		driver.findElement(By.name("firstname")).sendKeys(datablelist.get(0).get(0));
		driver.findElement(By.name("lastname")).sendKeys(datablelist.get(0).get(1));

		driver.findElement(By.name("reg_email__")).sendKeys(datablelist.get(0).get(2));

		driver.findElement(By.name("reg_passwd__")).sendKeys(datablelist.get(0).get(3));
	}

	@Then("Registration Successfully.")
	public void registration_successfully()
	{
		System.out.println("Successfullt Entred on 4 fileds");
	}

}
