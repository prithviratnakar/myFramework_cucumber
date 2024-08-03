package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class StepDefination {

	WebDriver driver;

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("user enters vaild credentials")
	public void user_enters_vaild_credentials() {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

	}

	@When("clicks on login button")
	public void clicks_on_login_button() {

		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

	}

	@Then("user should able to logged in successfully")
	public void user_should_able_to_logged_in_successfully() {

		String expected = "Dashboard";

		Assert.assertEquals(expected, driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText());

	}

	@When("user enters invaild credentials")
	public void user_enters_invaild_credentials() {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admn");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admi123");

	}

	@Then("user should not be able to login and dashboard should not be displayed")
	public void user_should_not_be_able_to_login_and_dashboard_should_not_be_displayed() {

		String expected = "Invalid credentials";
		Assert.assertEquals(expected, driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText());

	}

	@When("user enters vaild username and invalid password")
	public void user_enters_vaild_username_and_invalid_password() {

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admi123");
	}

	@When("user enters invaild username and valid password")
	public void user_enters_invaild_username_and_valid_password() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admn");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	}

	@When("user forgot the password")
	public void user_forgot_the_password() {

		System.out.println("User Forgot the Password");

	}

	@When("clicks on Forgot your password")
	public void clicks_on_forgot_your_password() {

		driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();

	}

	@Then("reset password page should be displayed")
	public void reset_password_page_should_be_displayed() {

		String expected = "Reset Password";
		Assert.assertEquals(expected, driver.findElement(By.xpath("//h6[text()='Reset Password']")).getText());
	}

	@Given("user is on dashboard page")
	public void user_is_on_dashboard_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

	}

	@When("user clicks on My Info")
	public void user_clicks_on_my_info() throws Exception {

		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		Thread.sleep(8000);
	}

	@Then("PIM page should be displayed")
	public void pim_page_should_be_displayed() {

		String expected = "PIM";

		Assert.assertEquals(expected, driver.findElement(By.xpath("//h6[text()='PIM']")).getText());
	}

	@Then("modules of My Info page should be displayed")
	public void modules_of_my_info_page_should_be_displayed() {
		driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-navigation']")).isDisplayed();
	}

	@Given("user is on Emergency Contacts page")
	public void user_is_on_emergency_contacts_page() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Emergency Contacts']")).click();
	}

	@When("clicks on add button of assigned emergency contact")
	public void clicks_on_add_button_of_assigned_emergency_contact() {
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
	}

	@When("enters requuired mandatory details")
	public void enters_requuired_mandatory_details() {

		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("prithvi");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("friend");
		driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[4]")).sendKeys("9876543210");
	}

	@When("clicks on save button")
	public void clicks_on_save_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Then("contact should be added into emergency contact")
	public void contact_should_be_added_into_emergency_contact() {
		System.out.println("User is added Successfully");
	}

	@Then("contact should be displayed into records")
	public void contact_should_be_displayed_into_records() {
		driver.findElement(By.xpath("(//div[@class='oxd-table-row oxd-table-row--with-border'])[2]")).isDisplayed();
	}

	@When("not enter required mandatory details")
	public void not_enter_required_mandatory_details() {

		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("mac");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
		driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[4]"));

	}

	@Then("contact should not be added into emergency contact")
	public void contact_should_not_be_added_into_emergency_contact() {

		String expected = "Required";
		Assert.assertEquals(expected, driver.findElement(By.xpath("//span[text()='Required']")).getText());

	}

	@When("user clicks on edit button of any record")
	public void user_clicks_on_edit_button_of_any_record() {
		driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[2]")).click();
	}

	@When("enters new data")
	public void enters_new_data() {

		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).clear();

		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("potdar");

	}

	@Then("contact should be edited into emergency contact")
	public void contact_should_be_edited_into_emergency_contact() {

		System.out.println("Contact has beeen updated successfully");
	}

	@Then("updated contact should be displayed into records")
	public void updated_contact_should_be_displayed_into_records() throws Exception {

		driver.findElement(By.xpath("(//div[@class='oxd-table-row oxd-table-row--with-border'])[2]")).isDisplayed();

		Thread.sleep(5000);
	}

	@When("user clicks on delete button of any record of assigned emergency contact")
	public void user_clicks_on_delete_button_of_any_record_of_assigned_emergency_contact() {
		driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]")).click();
	}

	@When("clicks on yes,delete button")
	public void clicks_on_yes_delete_button() {
		driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
	}

	@Then("contact should be deleted from emergency contact")
	public void contact_should_be_deleted_from_emergency_contact() {
		System.out.println("contact has been deleted");
	}

	@Then("deleted contacts should not be displayed into emergency contact records")
	public void deleted_contacts_should_not_be_displayed_into_emergency_contact_records() {
		WebElement table = driver
				.findElement(By.xpath("(//div[@class='oxd-table-row oxd-table-row--with-border'])[2]"));

		Assert.assertTrue(table.isDisplayed(), "contact has been deleted");
	}

	@When("selects multiple contacts through checkbox")
	public void selects_multiple_contacts_through_checkbox() {

		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]")).click();
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[3]")).click();

	}

	@When("clicks on delete selected")
	public void clicks_on_delete_selected() {
		driver.findElement(By.xpath("//button[text()=' Delete Selected ']")).click();
	}

	@Then("selected contacts should be deleted from emergency contact")
	public void selected_contacts_should_be_deleted_from_emergency_contact() {
		driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
	}

	@Then("deleted contact should not be displayed into emergency contact records")
	public void deleted_contact_should_not_be_displayed_into_emergency_contact_records() {
		WebElement table = driver
				.findElement(By.xpath("(//div[@class='oxd-table-row oxd-table-row--with-border'])[2]"));

		WebElement table1 = driver
				.findElement(By.xpath("(//div[@class='oxd-table-row oxd-table-row--with-border'])[3]"));

		Assert.assertTrue(table.isDisplayed(), "contact 1 has been deleted");
		Assert.assertTrue(table1.isDisplayed(), "contact 2 has been deleted");
	}
}
