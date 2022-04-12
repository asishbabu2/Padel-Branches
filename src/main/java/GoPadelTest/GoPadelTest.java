package GoPadelTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import GoPadelPages.GoPadelAddPadelBranchPage;
import GoPadelPages.GoPadelDashboardPage;
import GoPadelPages.GoPadelLoginPage;
import GoPadelPages.GoPadelPadelBranchPage;
import TestScenario.GoPadelTestBase;

public class GoPadelTest extends GoPadelTestBase {

	GoPadelLoginPage loginPage;
	GoPadelPadelBranchPage padelBranchPage;
	GoPadelAddPadelBranchPage addpadelBranchPage;

	// Log4j configuration
	private static final Logger log = LogManager.getLogger(GoPadelTest.class);

	@Test(priority = 0)
	public void PadelBranchesTest() {

		log.info("Verifying successful login.");

		loginPage = new GoPadelLoginPage(driver);

		GoPadelDashboardPage dashboardPage = loginPage.login("vt@testvox.com", "vt@testvox.com");
		//dashboardPage.clickOnpadelBranches();

	}

//	@Test(priority = 1)
//	public void PadelBranchPageTest() {
//		padelBranchPage = new GoPadelPadelBranchPage(driver);
//		padelBranchPage.displayTitle();
//		padelBranchPage.displayAddPadelBranchButton();
//		padelBranchPage.displayTableTitle();
//		padelBranchPage.displayTableHeaders();
//		padelBranchPage.displaySearchBar();
//		padelBranchPage.displayDropdown();
//		padelBranchPage.displayPreviousButton();
//		padelBranchPage.displayNextButton();
//		padelBranchPage.selectFromShowEntriesDropdown();
//		padelBranchPage.searchBarFunctionality();
//		padelBranchPage.clickAddPanelBranchesButton();
//	}
//
//	@Test(priority = 2)
//	public void AddPadelBranchPageTest() {
//		addpadelBranchPage = new GoPadelAddPadelBranchPage(driver);
//		addpadelBranchPage.displayAddPadelBranchPageTitle();
//		addpadelBranchPage.PersonNameField();
//		addpadelBranchPage.BranchNameField();
//		addpadelBranchPage.BranchPhoneField();
//		addpadelBranchPage.BranchEmailField();
//		addpadelBranchPage.BranchAddressField();
//		addpadelBranchPage.BranchDetailsField();
//		addpadelBranchPage.PadelDropdown();
//		addpadelBranchPage.CityDropdown();
//		addpadelBranchPage.BranchLatitudeField();
//		addpadelBranchPage.BranchLongitudeField();
//		addpadelBranchPage.StatusDropdown();
//		addpadelBranchPage.SaveButton();
//	}
//
//	@Test(priority = 3)
//	public void VerifyAddedPadelBranchTest() {
//		padelBranchPage.verifyPadelBranchAdded();
//	}
}
