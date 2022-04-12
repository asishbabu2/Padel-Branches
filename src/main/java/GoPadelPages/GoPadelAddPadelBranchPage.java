package GoPadelPages;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class GoPadelAddPadelBranchPage {
	WebDriver driver;
	String personName, branchName, branchPhone, branchEmail, branchAddress, branchDetails, branchLatitude,
			branchLongitude;

	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[3]/div/div[1]/div[1]/h3")
	WebElement addPadelBranchPageTitle;

	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[3]/div/div[2]/div/form/div/div[1]/div/div/input")
	WebElement personNameField;

	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[3]/div/div[2]/div/form/div/div[2]/div/div/input")
	WebElement branchNameField;

	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[3]/div/div[2]/div/form/div/div[3]/div/div/input")
	WebElement branchPhoneField;

	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[3]/div/div[2]/div/form/div/div[4]/div/div/input")
	WebElement branchEmailField;

	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[3]/div/div[2]/div/form/div/div[5]/div/div/input")
	WebElement branchAddressField;

	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[3]/div/div[2]/div/form/div/div[6]/div/div/input")
	WebElement branchDetailsField;

	@FindBy(xpath = "//*[@id=\"PadelId\"]")
	WebElement padelDropdown;

	@FindBy(xpath = "//*[@id=\"CityId\"]")
	WebElement cityDropdown;

	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[3]/div/div[2]/div/form/div/div[9]/div/div/input")
	WebElement branchLatitudeField;

	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[3]/div/div[2]/div/form/div/div[10]/div/div/input")
	WebElement branchLongitudeField;

	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[3]/div/div[2]/div/form/div/div[13]/div/div/div/select")
	WebElement statusDropdown;

	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[3]/div/div[2]/div/form/div/div[19]/button")
	WebElement saveButton;

	@FindBy(xpath = "//*[@id=\"example_filter\"]/label/input")
	WebElement searchBar;

	public GoPadelAddPadelBranchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void displayAddPadelBranchPageTitle() {
		String expectedTitle = "Add Padel Branch";
		String actualTitle = addPadelBranchPageTitle.getText();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Title is displayed as Add Padel Branch");
	}

	public void PersonNameField() {
		Assert.assertEquals(true, personNameField.isDisplayed());
		System.out.println("Person Name Field is displayed");
		Scanner enterPersonName = new Scanner(System.in);
		System.out.println("Enter the Person Name : ");
		personName = enterPersonName.nextLine();
		personNameField.sendKeys(personName);
	}

	public void BranchNameField() {
		Assert.assertEquals(true, branchNameField.isDisplayed());
		System.out.println("Branch Name Field is displayed");
		Scanner enterBranchName = new Scanner(System.in);
		System.out.println("Enter the Branch Name : ");
		branchName = enterBranchName.nextLine();
		branchNameField.sendKeys(branchName);
	}

	public void BranchPhoneField() {
		Assert.assertEquals(true, branchPhoneField.isDisplayed());
		System.out.println("Branch Phone Field is displayed");
		Scanner enterBranchPhone = new Scanner(System.in);
		System.out.println("Enter the Branch Phone : ");
		branchPhone = enterBranchPhone.nextLine();
		String regex = "[0-9]+";

		if (branchPhone.matches(regex)) {
			branchPhoneField.sendKeys(branchPhone);
		}
	}

	public void BranchEmailField() {
		Assert.assertEquals(true, branchEmailField.isDisplayed());
		System.out.println("Branch Email Field is displayed");
		Scanner enterBranchEmail = new Scanner(System.in);
		System.out.println("Enter the Branch Email : ");
		branchEmail = enterBranchEmail.nextLine();
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

		if (branchEmail.matches(regex)) {
			branchEmailField.sendKeys(branchEmail);
		}
	}

	public void BranchAddressField() {
		Assert.assertEquals(true, branchAddressField.isDisplayed());
		System.out.println("Branch Address Field is displayed");
		Scanner enterBranchAddress = new Scanner(System.in);
		System.out.println("Enter the Branch Address : ");
		branchAddress = enterBranchAddress.nextLine();
		branchAddressField.sendKeys(branchAddress);
	}

	public void BranchDetailsField() {
		Assert.assertEquals(true, branchDetailsField.isDisplayed());
		System.out.println("Branch Details Field is displayed");
		Scanner enterBranchDetails = new Scanner(System.in);
		System.out.println("Enter the Branch Details : ");
		branchDetails = enterBranchDetails.nextLine();
		branchDetailsField.sendKeys(branchDetails);

	}

	public void PadelDropdown() {
		Assert.assertEquals(true, padelDropdown.isDisplayed());
		System.out.println("Padel Dropdown is displayed");
		Select padleName = new Select(padelDropdown);
		List<WebElement> padledropdown = padleName.getOptions();
		for (WebElement padelDropdown : padledropdown) {
			System.out.println(padelDropdown.getText());
		}
		padleName.selectByIndex(1);

	}

	public void CityDropdown() {
		Assert.assertEquals(true, cityDropdown.isDisplayed());
		System.out.println("City Dropdown is displayed");
		Select city = new Select(cityDropdown);
		List<WebElement> citydropdown = city.getOptions();
		for (WebElement cityDropdown : citydropdown) {
			System.out.println(cityDropdown.getText());
		}
		city.selectByIndex(1);

	}

	public void BranchLatitudeField() {
		Assert.assertEquals(true, branchLatitudeField.isDisplayed());
		System.out.println("Branch Latitude Field is displayed");
		Scanner enterBranchLatitude = new Scanner(System.in);
		System.out.println("Enter the Branch Latitude : ");
		branchLatitude = enterBranchLatitude.nextLine();
		branchLatitudeField.sendKeys(branchLatitude);
	}

	public void BranchLongitudeField() {
		Assert.assertEquals(true, branchLongitudeField.isDisplayed());
		System.out.println("Branch Longitude Field is displayed");
		Scanner enterBranchLongitude = new Scanner(System.in);
		System.out.println("Enter the Branch Longitude : ");
		branchLongitude = enterBranchLongitude.nextLine();
		branchLongitudeField.sendKeys(branchLongitude);

	}

	public void StatusDropdown() {
		Assert.assertEquals(true, statusDropdown.isDisplayed());
		System.out.println("Status Dropdown is displayed");
		Select status = new Select(statusDropdown);
		List<WebElement> statusdropdown = status.getOptions();
		for (WebElement statusDropdown : statusdropdown) {
			System.out.println(statusDropdown.getText());
		}
		status.selectByIndex(0);

	}

	public void SaveButton() {
		Assert.assertEquals(true, saveButton.isDisplayed());
		System.out.println("Save Button is displayed");
		if (personName.isEmpty() && branchName.isEmpty() && branchPhone.isEmpty() && branchEmail.isEmpty()
				&& branchAddress.isEmpty() && branchDetails.isEmpty() && branchLatitude.isEmpty()
				&& branchLongitude.isEmpty()) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButton);
			System.out.println("Error message is displayed as Please fill out this field");
		}

		else {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButton);
			String expectedUrl = "https://gopadel.cadvil.com/admin/padelBranch/list";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl, actualUrl);
			System.out.println("Navigated to Padel Branch Page");
		}

	}

}
