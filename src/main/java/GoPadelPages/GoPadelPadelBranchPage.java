package GoPadelPages;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class GoPadelPadelBranchPage {
	WebDriver driver;

	@FindBy(xpath = "(//*[text()='Padel Branch'])[1]")
	WebElement title;

	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[3]/div/div[2]/a")
	WebElement addPadelBranchButton;

	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[3]/div/div[3]/h3")
	WebElement tableTitle;

	@FindBy(xpath = "//*[@id=\"example\"]/thead/tr")
	WebElement tableHeader;

	@FindBy(xpath = "//*[@id=\"example_filter\"]/label/input")
	WebElement searchBar;

	@FindBy(xpath = "//*[@id=\"example_length\"]/label/select")
	WebElement showEntriesDropdown;

	@FindBy(xpath = "//*[@id=\"example_previous\"]")
	WebElement previousButton;

	@FindBy(xpath = "//*[@id=\"example_next\"]/a")
	WebElement nextButton;

	@FindBy(xpath = "//*[@id=\"example\"]")
	WebElement showEntriesTable;

	@FindBy(xpath = "//*[@id=\"example\"]/tbody/tr[1]")
	WebElement addedPadelBranch;

	public GoPadelPadelBranchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void displayTitle() {
		String expectedTitle = "Padel Branch";
		String actualTitle = title.getText();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Title is displayed as Padel Branch");

	}

	public void displayAddPadelBranchButton() {
		Assert.assertEquals(true, addPadelBranchButton.isDisplayed());
		System.out.println("Add Padel Branch Button is displayed");
	}

	public void displayTableTitle() {
		String expectedTableTitle = "Padel Branch List";
		String actualTableTitle = tableTitle.getText();
		Assert.assertEquals(expectedTableTitle, actualTableTitle);
		System.out.println("Title of the table is displayed as Padel Branch List");
	}

	public void displayTableHeaders() {
		String expectedTableHeader = "SL No. Branch Name Person Name Padel Name Phone Email Address Status Action Delete";
		String actualTableHeader = tableHeader.getText();
		Assert.assertEquals(expectedTableHeader, actualTableHeader);
		System.out.println("Table contains the coloumn headers such as" + " " + actualTableHeader);

	}

	public void displaySearchBar() {
		Assert.assertEquals(true, searchBar.isDisplayed());
		System.out.println("Search Bar is displayed");
	}

	public void displayDropdown() {
		Assert.assertEquals(true, showEntriesDropdown.isDisplayed());
		System.out.println("Dropdown is displayed");
	}

	public void displayNextButton() {
		Assert.assertEquals(true, nextButton.isDisplayed());
		System.out.println("Next Button is displayed");
	}

	public void displayPreviousButton() {
		Assert.assertEquals(true, previousButton.isDisplayed());
		System.out.println("Previous Button is displayed");
	}

	public void selectFromShowEntriesDropdown() {
		Select entries = new Select(showEntriesDropdown);
		showEntriesDropdown.click();
		entries.selectByIndex(0);
		System.out.println(showEntriesTable.getText());

	}

	public void searchBarFunctionality() {
		Scanner search = new Scanner(System.in);
		System.out.println("Enter the keyword to search : ");
		String keyword = search.nextLine();
		searchBar.sendKeys(keyword);
		System.out.println(showEntriesTable.getText());

	}

	public void clickAddPanelBranchesButton() {
		addPadelBranchButton.click();
		String expectedUrl = "https://gopadel.cadvil.com/admin/padelBranch/add";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		System.out.println("Navigated to Add Padel Branch Page");
	}

	public void verifyPadelBranchAdded() {
		System.out.println(addedPadelBranch.getText());

	}
}
