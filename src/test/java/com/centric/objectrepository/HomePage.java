package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class HomePage extends Commonactions{
	
	public HomePage() {
		PageFactory.initElements(Commonactions.driver, this);
	}
	
	//temp-----------------------------------------------------------
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'PageHome')]")
	private WebElement user_homeBtn1;
	
	@FindBy(xpath="//a[text()='Centric 8']//parent::div")
	private WebElement user_homeBtn;
	//----------------------------------------------------------------
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'PageSetup')]")
	private WebElement user_setupBtn;
	
	//temp------------------------------------------------------------
	
	@FindBy(xpath="//span[text()='settings']")
	private WebElement user_settingsBtn1;
	
	@FindBy(xpath="//span[contains(text(),'Configuration')]/preceding-sibling::span")
	private WebElement user_settingsBtn;
	//-----------------------------------------------------------------
	
	@FindBy(xpath="(//tr[contains(@data-csi-automation,'UpdateConfig')]/td)[2]")
	private WebElement update_config;
	
	@FindBy(xpath="(//tr[contains(@data-csi-automation,'SystemConfig')]/td)[2]")
	private WebElement system_config;	
	
	@FindBy(xpath="//span[text()='My Home' or @data-csi-tab='User-MyHome']")
	private WebElement homeBtn;

	@FindBy(xpath="//span[text()='Style' or @data-csi-tab='ApparelViews-Style']")
	private WebElement styleBtn;
	
	@FindBy(xpath="//span[text()='Material' or @data-csi-tab='ApparelViews-Materials']")
	private WebElement materialBtn;
	
	@FindBy(xpath="//span[text()='Shape and Theme' or @data-csi-tab='ApparelViews-ShapeAndTheme']")
	private WebElement shapeandthemeBtn;
	
	@FindBy(xpath="//span[text()='Specification' or @data-csi-tab='ApparelViews-ProductSpec']")
	private WebElement specificationBtn;
	
	@FindBy(xpath="//span[text()='Sourcing' or @data-csi-tab='LibSourcing-Sourcing']")
	private WebElement sourcingBtn;
	
	@FindBy(xpath="//span[text()='Documents' or @data-csi-tab='Data-Documents']")
	private WebElement documentsBtn;
	
	@FindBy(xpath="//span[text()='Issues' or @data-csi-tab='Data-Issues']")
	private WebElement issuesBtn;
	
	@FindBy(xpath="//span[text()='Reports' or @data-csi-tab='Data-Reports']")
	private WebElement reportsBtn;
	
	@FindBy(xpath="//span[text()='Select Sets' or @data-csi-tab='Data-SelectSets']")
	private WebElement selectSetsBtn;
	
	@FindBy(xpath="//span[text()='Business Planning' or @data-csi-tab='BusinessPlanningViews-BusinessPlanning']")
	private WebElement businessPlanningBtn;
	
	@FindBy(xpath="//span[text()='Calendar' or @data-csi-tab='CalendarDescriptor-Calendar']")
	private WebElement calendarBtn;
	
	@FindBy(xpath="//span[text()='Quality' or @data-csi-tab='QualityViews-Quality']")
	private WebElement qualityBtn;
	
	@FindBy(xpath="//span[text()='Schedule' or @data-csi-tab='WbsAdmin-Schedule']")
	private WebElement scheduleBtn;
	
	@FindBy(xpath="//span[text()='Collection Management' or @data-csi-tab='ApparelViews-CollectionManagement']")
	private WebElement collectionManagementBtn;
	
	@FindBy(xpath="//span[text()='Merchandising' or @data-csi-tab='MerchandisingViews-Merchandising']")
	private WebElement merchandisingBtn;
	
	@FindBy(xpath="//span[text()='Inspection' or @data-csi-tab='Data-Inspection']")
	private WebElement inspectionBtn;
	
	@FindBy(xpath = "//span[@data-csi-tab='ApparelViews-ProductSpec']")
	private WebElement SpecificationTab;

	public WebElement getSpecificationTab() {
		return SpecificationTab;
	}

	public WebElement getHomeBtn() {
		return homeBtn;
	}

	public WebElement getUser_setupBtn() {
		return user_setupBtn;
	}

	public WebElement getStyleBtn() {
		return styleBtn;
	}

	public WebElement getMaterialBtn() {
		return materialBtn;
	}

	public WebElement getShapeandthemeBtn() {
		return shapeandthemeBtn;
	}

	public WebElement getSpecificationBtn() {
		return specificationBtn;
	}

	public WebElement getSourcingBtn() {
		return sourcingBtn;
	}

	public WebElement getDocumentsBtn() {
		return documentsBtn;
	}

	public WebElement getIssuesBtn() {
		return issuesBtn;
	}

	public WebElement getReportsBtn() {
		return reportsBtn;
	}

	public WebElement getSelectSetsBtn() {
		return selectSetsBtn;
	}

	public WebElement getBusinessPlanningBtn() {
		return businessPlanningBtn;
	}

	public WebElement getCalendarBtn() {
		return calendarBtn;
	}

	public WebElement getQualityBtn() {
		return qualityBtn;
	}

	public WebElement getScheduleBtn() {
		return scheduleBtn;
	}

	public WebElement getCollectionManagementBtn() {
		return collectionManagementBtn;
	}

	public WebElement getMerchandisingBtn() {
		return merchandisingBtn;
	}

	public WebElement getInspectionBtn() {
		return inspectionBtn;
	}

	public WebElement getUser_homeBtn() {
		return user_homeBtn;
	}
	
	public WebElement getUser_settingsBtn() {
		return user_settingsBtn;
	}

	public WebElement getUpdate_config() {
		return update_config;
	}
	
	public WebElement getSystem_config() {
		return system_config;
	}
	

}
