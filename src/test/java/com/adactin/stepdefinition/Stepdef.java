package com.adactin.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {
	public static WebDriver driver = Runner.driver;

	@Given("user launch the adactin application")
	public void user_launch_the_adactin_application() {
		driver.get("https://adactinhotelapp.com/");
		//throw new io.cucumber.java.PendingException();
	}

	@When("user enter the user name in user name field")
	public void user_enter_the_user_name_in_user_name_field() {
		driver.findElement(By.xpath("//input [@type = 'text']")).sendKeys("yogeshraj2");
		//throw new io.cucumber.java.PendingException();
	}

	@When("user enter the password in password field")
	public void user_enter_the_password_in_password_field() {
		driver.findElement(By.xpath("//input [@name = 'password']")).sendKeys("Yogesh@1234");
		//throw new io.cucumber.java.PendingException();
	}

	@Then("click the login button")
	public void click_the_login_button() {
		driver.findElement(By.xpath("//input [@type = 'Submit']")).click();

		//throw new io.cucumber.java.PendingException();
	}

	@When("user select the location in location field")
	public void user_select_the_location_in_location_field() throws InterruptedException {
		WebElement location = driver.findElement(By.xpath("//select[@name ='location']"));

		Select s = new Select(location);

		s.selectByVisibleText("Sydney");

		Thread.sleep(2000);
		//throw new io.cucumber.java.PendingException();
	}

	@When("user select the hotels in hotel field")
	public void user_select_the_hotels_in_hotel_field() {
		WebElement hotels = driver.findElement(By.xpath("//select [@name = 'hotels']"));

		Select s1 = new Select(hotels);

		s1.selectByVisibleText("Hotel Sunshine");

		//throw new io.cucumber.java.PendingException();
	}

	@When("user select the room type in roomtype field")
	public void user_select_the_room_type_in_roomtype_field() {
		WebElement roomtype = driver.findElement(By.xpath("//select [@name = 'room_type']"));
		Select s2 = new Select(roomtype);
		s2.selectByVisibleText("Super Deluxe");

		//throw new io.cucumber.java.PendingException();
	}

	@When("user select the rooms in number of room type field")
	public void user_select_the_rooms_in_number_of_room_type_field() {
		WebElement roomnos = driver.findElement(By.xpath("//select[@name = 'room_nos']"));
		Select s3 = new Select(roomnos);
		s3.selectByIndex(1);
		//throw new io.cucumber.java.PendingException();
	}

	@When("user check in date in check in date field")
	public void user_check_in_date_in_check_in_date_field() {

		//throw new io.cucumber.java.PendingException();
	}

	@When("user check out date in check out date field")
	public void user_check_out_date_in_check_out_date_field() {
		//throw new io.cucumber.java.PendingException();
	}

	@When("user selects the adult room in adults room field")
	public void user_selects_the_adult_room_in_adults_room_field() throws InterruptedException {
		WebElement adult = driver.findElement(By.xpath("//select[@name ='adult_room']"));
		Select s4 = new Select(adult);
		s4.selectByIndex(1);
		Thread.sleep(2000);

		//throw new io.cucumber.java.PendingException();
	}

	@When("user select the child room in child room option")
	public void user_select_the_child_room_in_child_room_option() {

		//throw new io.cucumber.java.PendingException();
	}

	@Then("user click on the search button")
	public void user_click_on_the_search_button() {
		driver.findElement(By.xpath("//input[@type ='submit']")).click();
		//throw new io.cucumber.java.PendingException();
	}

	@When("user select the hotel by clicking radio button")
	public void user_select_the_hotel_by_clicking_radio_button() {
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();

		//throw new io.cucumber.java.PendingException();
	}

	@Then("user click on continue button ,it navigates to book a book a hotel page.")
	public void user_click_on_continue_button_it_navigates_to_book_a_book_a_hotel_page() {
		driver.findElement(By.xpath("//input [@type = 'submit']")).click();
		//throw new io.cucumber.java.PendingException();
	}

	@When("user enters first name in first name field")
	public void user_enters_first_name_in_first_name_field() {
		driver.findElement(By.id("first_name")).sendKeys("yogesh");
		//throw new io.cucumber.java.PendingException();
	}

	@When("user enters last name in last name field")
	public void user_enters_last_name_in_last_name_field() {
		driver.findElement(By.id("last_name")).sendKeys("raj");
		//throw new io.cucumber.java.PendingException();
	}

	@When("user enters the address in biling address field")
	public void user_enters_the_address_in_biling_address_field() {
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("ambathur,chennai");

		//throw new io.cucumber.java.PendingException();
	}

	@When("user enters the credit card no, in credit card no field")
	public void user_enters_the_credit_card_no_in_credit_card_no_field() throws InterruptedException {
		driver.findElement(By.id("cc_num")).sendKeys("1345678912345678");
		Thread.sleep(3000);
		//throw new io.cucumber.java.PendingException();
	}

	@When("user selects the credit card type in credit card type field")
	public void user_selects_the_credit_card_type_in_credit_card_type_field() {
		WebElement creditcardtype = driver.findElement(By.xpath("//select [@class= 'select_combobox']"));
		Select s5 = new Select(creditcardtype);
		s5.selectByIndex(2);

		//throw new io.cucumber.java.PendingException();
	}

	@When("user selects the credit card  expiry month and year in  expiry date")
	public void user_selects_the_credit_card_expiry_month_and_year_in_expiry_date() {

		WebElement expdate = driver.findElement(By.id("cc_exp_month"));
		Select s6 = new Select(expdate);
		s6.selectByIndex(4);
		WebElement expyr = driver.findElement(By.id("cc_exp_year"));
		Select s7 = new Select(expyr);
		s7.selectByIndex(14);

		//throw new io.cucumber.java.PendingException();
	}

	@When("user enters the credit card cvv no in cvv no field")
	public void user_enters_the_credit_card_cvv_no_in_cvv_no_field() throws InterruptedException {
		WebElement cvv = driver.findElement(By.xpath("//input[@name = 'cc_cvv']"));
		cvv.sendKeys("123");

		//throw new io.cucumber.java.PendingException();
	}

	@Then("user click on book now button it navigates to booking confimation page")
	public void user_click_on_book_now_button_it_navigates_to_booking_confimation_page()
			throws InterruptedException, IOException {
		driver.findElement(By.xpath("//input[@type = 'button']")).click();

		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\admin\\eclipse-workspace1\\cucumberproject\\screenshot\\Adactin.png");

		FileUtils.copyFile(source, dest);
		//throw new io.cucumber.java.PendingException();
		
	}

	@When("user clicks the logout button")
	public void user_clicks_the_logout_button() throws InterruptedException {
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.xpath("//input[@name ='logout']"));
        logout.click();

		//throw new io.cucumber.java.PendingException();
	}

	@Then("it will return to home page")
	public void it_will_return_to_home_page() {
		WebElement relogin = driver.findElement(By.xpath("//a[text()='Click here to login again'] "));
		relogin.click();

		//throw new io.cucumber.java.PendingException();
	}

}

	
	
	 
	





