package com.centric.stepdefinition;

import com.centric.objectrepository.*;
import com.centric.resources.Commonactions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;


public class SizesTK extends Commonactions {

    Commonactions ca = new Commonactions();
    SetupPageTK sp = new SetupPageTK();
    PopupPage pp = new PopupPage();
    HomePage hp = new HomePage();
    SpecificationPage spec = new SpecificationPage();
    SpecificationHierarchyPageTK shp = new SpecificationHierarchyPageTK();
    ColorSpecificationPageTK cp = new ColorSpecificationPageTK();
    PopupPage pup=new PopupPage();
    StylePage spk =new StylePage();
    MaterialSpecificationPage mp = new MaterialSpecificationPage();

    @When("Setup Enum for size dimensions in setup page {string}")
    public void setupEnumForSizeDimensionsInSetupPage(String Enum) throws Throwable {
        jsWaitForPageLoad();
        Thread.sleep(5000);
        ca.click(sp.getUser_Enumerations());
        Thread.sleep(3000);
        ca.click(sp.getUser_EnumDropBox());
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//label[contains(text(),'" + Enum + "')]"));
        ca.eleToBeClickable();
        element.click();
        Thread.sleep(5000);
        ca.click(sp.getUser_Enumerations());
    }

    @Then("Create the Enum value for the sizes {string},{string},{string},{string}")
    public void createTheEnumValueForTheSizes(String EnumValue, String desc, String EnumValue2, String desc2) throws Throwable {
        ca.jsScrollPageDown(sp.getUser_NewEnumValue());
        Actions actions = new Actions(driver);
        if (sp.getUser_NewEnumValue().isDisplayed()) {
            jsWaitForPageLoad();
            Thread.sleep(2000);
            actions.moveToElement(sp.getUser_NewEnumValue()).click(sp.getUser_NewEnumValue()).build().perform();
            Thread.sleep(200);
            ca.insertText(sp.getUser_NewEnumName(), EnumValue);
            Thread.sleep(200);
            ca.insertText(sp.getUser_NewEnumDescription(), desc);
            Thread.sleep(200);
            ca.click(mp.getSave_btn1());


            Thread.sleep(2000);
            actions.moveToElement(sp.getUser_NewEnumValue()).click(sp.getUser_NewEnumValue()).build().perform();
            Thread.sleep(200);
            ca.insertText(sp.getUser_NewEnumName(), EnumValue2);
            Thread.sleep(200);
            ca.insertText(sp.getUser_NewEnumDescription(), desc2);
            Thread.sleep(200);
            ca.click(mp.getSave_btn1());
            Thread.sleep(1500);
        } else {
            System.out.println("The enumeration setup has been failed");
        }
    }

    @And("Update the Enum through partial configuration")
    public void updateTheEnumThroughPartialConfiguration() throws Throwable {
        Thread.sleep(3000);
        ca.eleToBeClickable();
        ca.click(hp.getUser_settingsBtn());
        Thread.sleep(600);
        ca.click(sp.getUpdateConfigBtn());
        Thread.sleep(600);
        if (sp.getPartialUpdateBtn().isDisplayed()) {
            Thread.sleep(600);
            ca.click(sp.getFullUpdateBtn());
            Thread.sleep(2000);
            ca.click(sp.getRunBtn());
        }
    }

    @And("Selecting the sub ranges for composite sizes {string},{string}")
    public void selectingTheSubRangesForCompositeSizes(String simple1, String simple2) throws InterruptedException {
        Thread.sleep(2000);
        ca.click(spec.getSubSizeRange());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[contains(text(),'" + simple1 + "')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[contains(text(),'" + simple2 + "')]")).click();
        Thread.sleep(1500);
        ca.click(mp.getSave_btn1());
    }


    @When("User creates multiple sizes with different type for TwoDSizes {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void userCreatesMultipleSizesWithDifferentTypeForTwoDSizes(String size, String size1, String size2, String size3, String size4, String size5, String SortOrder, String SortOrder1, String SortOrder2, String SortOrder3, String SortOrder4, String SortOrder5) throws Throwable {
        ca.eleToBeClickable();
        ca.click(hp.getSpecificationTab());
        jsWaitForPageLoad();
        ca.click(spec.getSizeTab());
        jsWaitForPageLoad();
        waitForElementClickable(spec.getNewSizeAction());
        ca.click(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeInputBox(), size);
        WebElement dimension = spec.getDimensionBox();
        ca.insertText(dimension,"Size");
        Thread.sleep(2000);
        ca.insertText(spec.getSortOrderBox(), SortOrder);
        Thread.sleep(4000);
        ca.click(mp.getSave_btn1());
        

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(4000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeInputBox(), size1);
        ca.insertText(dimension,"Size");
        Thread.sleep(2000);
        ca.insertText(spec.getSortOrderBox(), SortOrder1);
        Thread.sleep(4000);
        ca.click(mp.getSave_btn1());

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeInputBox(), size2);
        ca.insertText(dimension,"Size");
        Thread.sleep(2000);
        ca.insertText(spec.getSortOrderBox(), SortOrder2);
        Thread.sleep(4000);
        ca.click(mp.getSave_btn1());

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeInputBox(), size3);
        ca.insertText(dimension,"Size");
        Thread.sleep(2000);
        ca.insertText(spec.getSortOrderBox(), SortOrder3);
        Thread.sleep(4000);
        ca.click(mp.getSave_btn1());

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeInputBox(), size4);
        ca.insertText(dimension,"Size");
        Thread.sleep(2000);
        ca.insertText(spec.getSortOrderBox(), SortOrder4);
        Thread.sleep(4000);
        ca.click(mp.getSave_btn1());

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeInputBox(), size5);
        ca.insertText(dimension,"Size");
        Thread.sleep(2000);
        ca.insertText(spec.getSortOrderBox(), SortOrder5);
        Thread.sleep(4000);
        ca.click(mp.getSave_btn1());
    }

    @Then("Create duplicate Sizes and verify the error message {string},{string}")
    public void createDuplicateSizesAndVerifyTheErrorMessage(String DupSize, String DupSo) throws Throwable {
        Thread.sleep(2000);
        WebElement dimension = spec.getDimensionBox();
        if (spec.getNewSizeAction().isDisplayed()) {
            ca.eleToBeClickable();
            ca.click(spec.getNewSizeAction());
            Thread.sleep(2000);
            ca.insertText(spec.getSizeInputBox(), DupSize);
            Thread.sleep(3000);
            ca.insertText(dimension,"Size");
            Thread.sleep(3000);
            ca.insertText(spec.getSortOrderBox(), DupSo);
            Thread.sleep(2000);
            ca.click(mp.getSave_btn1());
            Thread.sleep(2000);
            String expectedHeader = "Duplicate sizes are not allowed.";
            String message = spec.getDuplicateSizeError().getText();
            Assert.assertTrue("Duplicate sizes are not allowed.", message.contains(expectedHeader));
            System.out.println("Duplicate sizes error message detected ");
            Thread.sleep(2000);
            ca.click(spec.getCancel());
        }

        ca.eleToBeClickable();
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeInputBox(), DupSize);
        Thread.sleep(3000);
        ca.insertText(dimension,"Size");
        Thread.sleep(3000);
        ca.insertText(spec.getSortOrderBox(), DupSo);
        Thread.sleep(2000);
        ca.click(mp.getSave_btn1());
        Thread.sleep(300);
        String expectedHeader1 = "The Sort Order must be unique for each Dimension Type.";
        try{
        String sortOrder = spec.getDuplicateSortOdError().getText();
        Assert.assertTrue("The Sort Order must be unique for each Dimension Type.", sortOrder.contains(expectedHeader1));
        System.out.println("Duplicate sort order error message detected ");
        Thread.sleep(300);
        }catch (Exception e) {
			
		}
        ca.click(spec.getCancel());
    }


    @And("Create twoD sizes with different type of dimension {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void createTwoDSizesWithDifferentTypeOfDimension(String Size1, String Size2, String Size3, String Size4, String Size5, String Size6, String DimTyp1, String DimTyp2, String DimTyp3, String DimTyp4, String DimTyp5, String DimTyp6, String CompSO1, String CompSO2, String CompSO3, String CompSO4, String CompSO5, String CompSO6) throws InterruptedException {
        WebElement dimension = spec.getDimensionBox();
        Actions a = new Actions(driver);
        Thread.sleep(2000);
        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeInputBox(), Size1);
        dimension.clear();
        Thread.sleep(1500);
        ca.insertText(spec.getDimensionBox(), DimTyp1);
        Thread.sleep(1500);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        ca.insertText(spec.getSortOrderBox(), CompSO1);
        Thread.sleep(1200);
        ca.click(mp.getSave_btn1());
        Thread.sleep(800);

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeInputBox(), Size2);
        dimension.clear();
        Thread.sleep(1500);
        ca.insertText(spec.getDimensionBox(), DimTyp2);
        Thread.sleep(1500);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1500);
        ca.insertText(spec.getSortOrderBox(), CompSO2);
        Thread.sleep(4000);
        ca.click(mp.getSave_btn1());
        Thread.sleep(800);

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeInputBox(), Size3);
        dimension.clear();
        Thread.sleep(1500);
        ca.insertText(spec.getDimensionBox(), DimTyp3);
        Thread.sleep(1500);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1500);
        ca.insertText(spec.getSortOrderBox(), CompSO3);
        Thread.sleep(4000);
        ca.click(mp.getSave_btn1());
        Thread.sleep(800);

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeInputBox(), Size4);
        dimension.clear();
        Thread.sleep(1500);
        ca.insertText(spec.getDimensionBox(), DimTyp4);
        Thread.sleep(1500);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1500);
        ca.insertText(spec.getSortOrderBox(), CompSO4);
        Thread.sleep(4000);
        ca.click(mp.getSave_btn1());
        Thread.sleep(800);

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeInputBox(), Size5);
        dimension.clear();
        Thread.sleep(1500);
        ca.insertText(spec.getDimensionBox(), DimTyp5);
        Thread.sleep(1500);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1500);
        ca.insertText(spec.getSortOrderBox(), CompSO5);
        Thread.sleep(4000);
        ca.click(mp.getSave_btn1());
        Thread.sleep(800);

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeInputBox(), Size6);
        dimension.clear();
        Thread.sleep(1500);
        ca.insertText(spec.getDimensionBox(), DimTyp6);
        Thread.sleep(1500);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1500);
        ca.insertText(spec.getSortOrderBox(), CompSO6);
        Thread.sleep(4000);
        ca.click(mp.getSave_btn1());
        Thread.sleep(800);
    }



    @When("User selects the created sizes for TwoD sizes {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void userSelectsTheCreatedSizesForTwoDSizes(String TwoDSizeName1, String TwoDSizeName2, String TwoDSizeName3, String TwoDSizeName4, String TwoDSizeName5, String TwoDSizeName6, String TwoDSizeName7, String TwoDSizeName8,String TwoDSizeName9, String Size1, String Size2, String Size3, String Size4, String Size5, String Size6) throws Throwable {

    	
    	Actions a = new Actions(driver);
        Thread.sleep(2000);
        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.eleToBeClickable();
        ca.click(spec.getNewSizeAction());
        Thread.sleep(1500);
        ca.click(spec.getTwoDimensionCheckBox());
        Thread.sleep(1500);
        ca.insertText(spec.getSizeInputBox(),TwoDSizeName1);
        Thread.sleep(1500);
        ca.insertText(spec.getOneDimBox(),Size1);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(4000);
        ca.insertText(spec.getSecondDimBox(), Size4);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1500);
        ca.click(mp.getSave_btn1());

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(1500);
        ca.click(spec.getTwoDimensionCheckBox());
        Thread.sleep(1500);
        ca.insertText(spec.getSizeInputBox(),TwoDSizeName2);
        Thread.sleep(1500);
        ca.insertText(spec.getOneDimBox(),Size1);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(4000);
        ca.insertText(spec.getSecondDimBox(), Size5);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1500);
        ca.click(mp.getSave_btn1());

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(1500);
        ca.click(spec.getTwoDimensionCheckBox());
        Thread.sleep(1500);
        ca.insertText(spec.getSizeInputBox(),TwoDSizeName3);
        Thread.sleep(1500);
        ca.insertText(spec.getOneDimBox(),Size1);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(4000);
        ca.insertText(spec.getSecondDimBox(), Size6);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1500);
        ca.click(mp.getSave_btn1());

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(1500);
        ca.click(spec.getTwoDimensionCheckBox());
        Thread.sleep(1500);
        ca.insertText(spec.getSizeInputBox(),TwoDSizeName4);
        Thread.sleep(1500);
        ca.insertText(spec.getOneDimBox(),Size2);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(4000);
        ca.insertText(spec.getSecondDimBox(), Size4);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1500);
        ca.click(mp.getSave_btn1());

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(1500);
        ca.click(spec.getTwoDimensionCheckBox());
        Thread.sleep(1500);
        ca.insertText(spec.getSizeInputBox(),TwoDSizeName5);
        Thread.sleep(1500);
        ca.insertText(spec.getOneDimBox(),Size2);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(4000);
        ca.insertText(spec.getSecondDimBox(), Size5);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1500);
        ca.click(mp.getSave_btn1());

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(1500);
        ca.click(spec.getTwoDimensionCheckBox());
        Thread.sleep(1500);
        ca.insertText(spec.getSizeInputBox(),TwoDSizeName6);
        Thread.sleep(1500);
        ca.insertText(spec.getOneDimBox(),Size2);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(4000);
        ca.insertText(spec.getSecondDimBox(), Size6);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1500);
        ca.click(mp.getSave_btn1());

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(1500);
        ca.click(spec.getTwoDimensionCheckBox());
        Thread.sleep(1500);
        ca.insertText(spec.getSizeInputBox(),TwoDSizeName7);
        Thread.sleep(1500);
        ca.insertText(spec.getOneDimBox(),Size3);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(4000);
        ca.insertText(spec.getSecondDimBox(), Size4);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1500);
        ca.click(mp.getSave_btn1());

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(1500);
        ca.click(spec.getTwoDimensionCheckBox());
        Thread.sleep(1500);
        ca.insertText(spec.getSizeInputBox(),TwoDSizeName8);
        Thread.sleep(1500);
        ca.insertText(spec.getOneDimBox(),Size3);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(4000);
        ca.insertText(spec.getSecondDimBox(), Size5);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1500);
        ca.click(mp.getSave_btn1());

        waitForElementClickable(spec.getNewSizeAction());
        Thread.sleep(2000);
        ca.click(spec.getNewSizeAction());
        Thread.sleep(1500);
        ca.click(spec.getTwoDimensionCheckBox());
        Thread.sleep(1500);
        ca.insertText(spec.getSizeInputBox(),TwoDSizeName9);
        Thread.sleep(1500);
        ca.insertText(spec.getOneDimBox(),Size3);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(4000);
        ca.insertText(spec.getSecondDimBox(), Size6);
        Thread.sleep(4000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1500);
        ca.click(mp.getSave_btn1());
    }

    @And("Create size range for the sizes {string},{string},{string},{string}")
    public void createSizeRangeForTheSizes(String SR_name, String desc, String type1, String type2) throws Throwable {

    	
    	waitForElementClickable(spec.getSizeRangeTab());
        Thread.sleep(2000);
        ca.click(spec.getSizeRangeTab());
        jsWaitForPageLoad();
        Thread.sleep(3000);
        waitForElementClickable(spec.getSizeRangeAction());
        ca.click(spec.getSizeRangeAction());
        Thread.sleep(40000);
        ca.insertText(spec.getSizeRangeName(), SR_name);
        Thread.sleep(300);
        ca.insertText(spec.getSizeRangeDescription(), desc);
        Thread.sleep(300);
        ca.click(spec.getTwoDimensionCheckBox());
        Thread.sleep(4000);
        WebElement dimension = spec.getSizeRangeOneDimBox();
        dimension.clear();
        ca.insertText(spec.getSizeRangeOneDimBox(), type1);
        Thread.sleep(4000);
        Actions a = new Actions(driver);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(300);
        WebElement dimension1 = spec.getSizeRangeSecondDimDox();
        dimension1.clear();
        ca.insertText(spec.getSizeRangeSecondDimDox(), type2);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(300);
        ca.click(mp.getSave_btn1());
    }

    @Then("User selects the sizes for the created size range {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void userSelectsTheSizesForTheCreatedSizeRange(String TwoDSizeName1, String TwoDSizeName2, String TwoDSizeName3, String TwoDSizeName4, String TwoDSizeName5, String TwoDSizeName6, String TwoDSizeName7, String TwoDSizeName8,String TwoDSizeName9,String sizeName) throws InterruptedException {
        Actions a = new Actions(driver);
        WebElement SizeName = driver.findElement(By.xpath("//a[@class='browse' and text()]/parent::td"));
        String storeNode = SizeName.getAttribute("data-csi-url");
        WebElement codeCell = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode + "']//following::td[@data-csi-act='Sizes::0']"));
        Thread.sleep(3000);
        a.moveToElement(codeCell).click(codeCell).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName1 + "']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName2 + "']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName3 + "']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName4 + "']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName5 + "']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName6 + "']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName7 + "']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName8 + "']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + TwoDSizeName9 + "']")).click();
        ca.click(spec.getSizeRangeTab());
    }

    @And("User creates simple size range for validation {string},{string},{string}")
    public void userCreatesSimpleSizeRangeForValidation(String Simple1, String Simple2, String Composite) throws Throwable {
        Actions actions = new Actions(driver);
        waitForElementClickable(spec.getSizeRangeAction());
        Thread.sleep(2000);
        ca.click(spec.getSizeRangeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeRangeName(),Simple1);
        Thread.sleep(1500);
        ca.insertText(spec.getSizeRangeDescription(), "SortOderValidation");
        Thread.sleep(2500);
        WebElement dimension = spec.getSRDimensionTypeBx();
        Thread.sleep(1500);
        actions.moveToElement(dimension).click(dimension).build().perform();
        Thread.sleep(3000);
        ca.insertText(dimension,"Size");
        Thread.sleep(3000);
        ca.eleToBeClickable();
        ca.click(mp.getSave_btn1());

        waitForElementClickable(spec.getSizeRangeAction());
        Thread.sleep(2000);
        ca.click(spec.getSizeRangeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeRangeName(),Simple2);
        Thread.sleep(1500);
        ca.insertText(spec.getSizeRangeDescription(), "SortOderValidation");
        Thread.sleep(1500);
        actions.moveToElement(dimension).click(dimension).build().perform();
        Thread.sleep(3000);
        ca.eleToBeClickable();
        ca.insertText(dimension,"Size");
        ca.eleToBeClickable();
        ca.click(mp.getSave_btn1());

        waitForElementClickable(spec.getSizeRangeAction());
        Thread.sleep(2000);
        ca.click(spec.getSizeRangeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeRangeName(),Composite);
        Thread.sleep(1500);
        ca.insertText(spec.getSizeRangeDescription(), "SortOderValidation");
        Thread.sleep(1500);
        actions.moveToElement(dimension).click(dimension).build().perform();
        Thread.sleep(3000);
        ca.eleToBeClickable();
        ca.insertText(dimension,"Size");
        ca.eleToBeClickable();
        ca.click(mp.getSave_btn1());

        Thread.sleep(2000);
        ca.click(spec.getSizeRangeAction());
        Thread.sleep(2000);
        ca.insertText(spec.getSizeRangeName(), "Simple2");
        Thread.sleep(300);
        System.out.println("Sort order validated completed for size Range");
        ca.click(spec.getCancel());
    }


    @Then("Merging of composite size type {string},{string},{string},{string},{string},{string},{string},{string}")
    public void mergingOfCompositeSizeType(String Size1, String Size2, String Size3, String Size4, String Size5, String Size6, String Simple1, String Simple2) throws InterruptedException {
        Thread.sleep(2000);
        WebElement SizeName = driver.findElement(By.xpath("(//a[@class='browse'])[3]/parent::td"));
        String storeNode = SizeName.getAttribute("data-csi-url");
        WebElement codeCell = driver.findElement(By.xpath("(//a[text()='MensJeans']/parent::td//following::td[@data-csi-act='Sizes::0'])[1]"));
        Thread.sleep(3000);
        waitForElementClickable(codeCell);
        codeCell.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + Size1 + "']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + Size2 + "']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + Size3 + "']")).click();
        Thread.sleep(1500);
        ca.click(spec.getSizeRangeTab());

        Thread.sleep(2000);
        WebElement SizeName2 = driver.findElement(By.xpath("(//a[@class='browse'])[2]/parent::td"));
        String storeNode2 = SizeName2.getAttribute("data-csi-url");
        WebElement codeCell2 = driver.findElement(By.xpath("(//a[text()='MensPants']/parent::td//following::td[@data-csi-act='Sizes::0'])[1]"));
        Thread.sleep(3000);
        waitForElementClickable(codeCell2);
        codeCell2.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + Size4 + "']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + Size5 + "']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']//following::label[text()='" + Size6 + "']")).click();
        Thread.sleep(1500);
        ca.click(spec.getSizeRangeTab());

    }


    @Then("Validate the options like copy and delete for size Range {string},{string}")
    public void validateTheOptionsLikeCopyAndDeleteForSizeRange(String duplicateSize, String sizeRangeName) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        java.util.List<WebElement> optionCount = driver.findElements(By.xpath("//span[@data-csi-act='Copy']"));
        optionCount.size();

        Thread.sleep(4000);
        driver.findElement(By.xpath("(//a[@class='browse' and text()='" + sizeRangeName + "']//following::span[@data-csi-act='Copy'])[1]")).click();
        Thread.sleep(2000);
        WebElement copyOption = wait.until(ExpectedConditions.elementToBeClickable((spec.getSizeRangeName())));
        copyOption.clear();
        Thread.sleep(200);
        copyOption.sendKeys(duplicateSize);
        Thread.sleep(200);
        Boolean save_Copy = driver.findElement(By.cssSelector("span[data-csi-act='Save_Copy']")).isDisplayed();
        System.out.println("The Popup contains Save&Copy button" + " -" + save_Copy);
        Boolean cancel = driver.findElement(By.cssSelector("span[data-csi-act='Cancel']")).isDisplayed();
        System.out.println("The Popup contains Cancel button" + "- " + cancel);
        ca.click(cp.getSaveBtn());

        WebElement delete = driver.findElement(By.xpath("//a[@class='browse' and text()='" + duplicateSize + "']//following::span[@data-csi-act='Delete']"));
        Thread.sleep(2000);
        delete.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[contains(text(),'Delete')])[2]")).click();
        System.out.println("The copy color specification is deleted ");
    }

    @And("Create a Size Map and validate the status {string},{string},{string},{string}")
    public void createASizeMapAndValidateTheStatus(String SizeName, String CompositeName, String SizeMapName, String deactivateSize) throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@class='browse'])[4]")).click();
        jsWaitForPageLoad();
        Thread.sleep(2000);
        ca.click(spec.getSRSizeMapTab());
        jsWaitForPageLoad();
        waitForElementClickable(spec.getSRSizeMapAction());
        ca.click(spec.getSRSizeMapAction());
        Thread.sleep(1500);
        ca.insertText(spec.getTargetSizeRangeBox(), CompositeName);
        Thread.sleep(300);
        Actions a = new Actions(driver);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);
        ca.insertText(spec.getSRSizeMapName(), SizeMapName);
        waitForElementClickable(mp.getSave_btn1());
        ca.click(mp.getSave_btn1());
        WebElement sizeMapName = driver.findElement(By.xpath("//td[text()='" + SizeMapName + "']//following::span[@data-csi-act='EditMapping']"));
        waitForElementClickable(sizeMapName);
        ca.click(sizeMapName);
        Thread.sleep(2000);
        WebElement SourceSize = driver.findElement(By.xpath("//td[contains(text(),'" + deactivateSize + "')]//following::td[1]"));
        Thread.sleep(600);
        ca.clickjs(SourceSize);
        Thread.sleep(2000);
        a.sendKeys(Keys.DOWN).build().perform();
        a.sendKeys(Keys.ENTER).build().perform();
        waitForElementClickable(mp.getSave_btn1());
        ca.click(mp.getSave_btn1());
        Thread.sleep(3000);
        WebElement statusChecker = driver.findElement(By.xpath("//td[text()='" + SizeMapName + "']//following::input[@aria-checked='false']"));
        Boolean check = statusChecker.isSelected();
        if (check.equals(false)) {
            statusChecker.click();
            Thread.sleep(2000);
            ca.click(spec.getMakeActiveBtn());
        } else {
            System.out.println("The Size Map status is not active");
        }
    }

    @When("User creates the Custom view and add the options to the table {string},{string}")
    public void userCreatesTheCustomViewAndAddTheOptionsToTheTable(String colorway, String ColourSpec) throws Throwable {
        Thread.sleep(2000);
        if (spec.getCancel().isDisplayed()) {
            spec.getCancel().click();
        }
            Thread.sleep(2000);
            ca.eleToBeClickable();
            Actions a = new Actions(driver);
            a.moveToElement(shp.getStyleViewBtn()).click(shp.getStyleViewBtn()).build().perform();
            Thread.sleep(2000);
            ca.click(shp.getStyleManageCVBtn());
            Thread.sleep(2000);
            ca.eleToBeClickable();
            ca.click(cp.getCopyCV_Option());
            Thread.sleep(2000);
            ca.eleToBeClickable();
            cp.getCopyNameTxt_bx().clear();
            Thread.sleep(2000);
            ca.insertText(cp.getCopyNameTxt_bx(), "CV_Copy");
            Thread.sleep(2000);
            ca.click(shp.getCV_colorwayOption());
            Select dropdown = new Select(cp.getAttributesBox());
            Thread.sleep(2000);
            dropdown.selectByVisibleText(colorway);
            Thread.sleep(2000);
            dropdown.selectByVisibleText(ColourSpec);
            Thread.sleep(2000);
            ca.click(cp.getCV_AddBtn());
            Thread.sleep(2000);
            ca.click(mp.getSave_btn1());
            Thread.sleep(3000);
        }

    @And("Create Style followed by its style Type {string},{string}")
    public void createStyleFollowedByItsStyleType(String a, String b) throws Throwable {
        Thread.sleep(3000);
        ca.eleToBeClickable();
        ca.insertText(pup.getStyle_type_Value(), a);
        ca.eleToBeClickable();
        ca.jsMouseOver();
        ca.eleToBeClickable();
        ca.insertText(pup.getSstyle_Value(), a);
        ca.eleToBeClickable();
        ca.click(pup.getSave_and_new_Btn());
        ca.eleToBeClickable();

        Thread.sleep(2000);
        ca.eleToBeClickable();
        ca.insertText(pup.getStyle_type_Value(), b);
        ca.eleToBeClickable();
        ca.jsMouseOver();
        Thread.sleep(3000);
        ca.eleToBeClickable();
        ca.insertText(pup.getSstyle_Value(), b);
        ca.eleToBeClickable();
        ca.click(pup.getSave_and_new_Btn());
        ca.eleToBeClickable();

    }

    @And("Create Style followed by its style Type {string},{string},{string},{string},{string},{string},{string},{string}")
    public void createStyleFollowedByItsStyleType(String a, String b, String c, String d, String name1, String name2, String name3, String name4) throws Throwable {
        Thread.sleep(3000);
        ca.eleToBeClickable();
        ca.insertText(pup.getStyle_type_Value(), a);
        ca.eleToBeClickable();
        ca.jsMouseOver();
        ca.eleToBeClickable();
        ca.insertText(pup.getSstyle_Value(), name1);
        ca.eleToBeClickable();
        ca.click(pup.getSave_and_new_Btn());
        ca.eleToBeClickable();

        Thread.sleep(2000);
        ca.eleToBeClickable();
        ca.insertText(pup.getStyle_type_Value(), b);
        ca.eleToBeClickable();
        ca.jsMouseOver();
        Thread.sleep(3000);
        ca.eleToBeClickable();
        ca.insertText(pup.getSstyle_Value(), name2);
        ca.eleToBeClickable();
        ca.click(pup.getSave_and_new_Btn());
        ca.eleToBeClickable();

        Thread.sleep(2000);
        ca.eleToBeClickable();
        ca.insertText(pup.getStyle_type_Value(), c);
        ca.eleToBeClickable();
        ca.jsMouseOver();
        Thread.sleep(3000);
        ca.eleToBeClickable();
        ca.insertText(pup.getSstyle_Value(), name3);
        ca.eleToBeClickable();
        ca.click(pup.getSave_and_new_Btn());
        ca.eleToBeClickable();

        Thread.sleep(2000);
        ca.eleToBeClickable();
        ca.insertText(pup.getStyle_type_Value(), d);
        ca.eleToBeClickable();
        ca.jsMouseOver();
        Thread.sleep(3000);
        ca.eleToBeClickable();
        ca.insertText(pup.getSstyle_Value(), name4);
        ca.eleToBeClickable();
        ca.click(pup.getSave_Btn());
        ca.eleToBeClickable();

        System.out.println("style created successfully");
    }

    @And("User deletes the unwanted attributes from custom views column for styles {string},{string},{string},{string},{string}")
    public void userDeletesTheUnwantedAttributesFromCustomViewsColumnForStyles(String arg0, String arg1, String arg2, String arg3,String arg4) throws InterruptedException {
        try {
            Thread.sleep(3000);
            ca.eleToBeClickable();
            Actions a = new Actions(driver);
            a.moveToElement(shp.getStyleViewBtn()).click(shp.getStyleViewBtn()).build().perform();
            Thread.sleep(2000);
            ca.click(shp.getStyleManageCVBtn());
            Thread.sleep(3000);
            Select dropdown = new Select(cp.getSelectedAttributesBox());
            Thread.sleep(40000);
            dropdown.selectByVisibleText(arg0);
            dropdown.selectByVisibleText(arg1);
            dropdown.selectByVisibleText(arg2);
            dropdown.selectByVisibleText(arg3);
            dropdown.selectByVisibleText(arg4);
            Thread.sleep(2000);
            ca.click(cp.getCV_RemoveBtn());
            Thread.sleep(2000);
            ca.click(mp.getSave_btn1());
            System.out.println("The custom view is created successfully with the given options");
    }catch (Exception e){
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Then("User selects the size range for the styles {string},{string},{string},{string},{string},{string},{string},{string}")
    public void userSelectsTheSizeRangeForTheStyles(String Style1, String Style2, String Style3, String Style4,String SizeRange1, String SizeRange2, String SizeRange3, String SizeRange4) throws Throwable {
        ArrayList<String> styles=new ArrayList<String>();
        styles.add(Style1);
        styles.add(Style2);
        styles.add(Style3);
        styles.add(Style4);
        ArrayList<String> SizeRanges=new ArrayList<String>();
        SizeRanges.add(SizeRange4);
        SizeRanges.add(SizeRange2);
        SizeRanges.add(SizeRange1);
        SizeRanges.add(SizeRange3);
        int list = styles.size();
        for (int i = 0; i <list ; i++) {
            Thread.sleep(2000);
            WebElement nameNode = driver.findElement(By.xpath("//a[@class='browse' and text()='" + styles.get(i) + "']"));
            WebElement values = driver.findElement(By.xpath("(//a[@class='browse' and text()='" + styles.get(i) + "'])/parent::td"));
            String storeNode = values.getAttribute("data-csi-url");
            WebElement codeCell = driver.findElement(By.xpath("//tr[@data-csi-result='" + storeNode + "']/td[@data-csi-heading='ActualSizeRange:Child:Attributes:0']"));
            Thread.sleep(2000);
            codeCell.click();
            Thread.sleep(2000);
            WebElement size = driver.findElement(By.xpath("//a[@class='browse' and text()='" + styles.get(i) + "']//following::td[@data-csi-heading='ActualSizeRange:Child:Attributes:0']"));
            Thread.sleep(2000);
            Actions builder = new Actions(driver);
            builder.moveToElement(size).click(size);
            builder.perform();
            Thread.sleep(2000);
            //ca.insertText(spec.getRF_InputText(), SizeRange1);
            WebElement sizerange = driver.findElement(By.xpath("//div[@class='dijitReset dijitMenuItem' and contains(text(),'" + SizeRanges.get(i) + "')]"));
            Thread.sleep(2000);
            sizerange.click();
        }
    }

    @And("user selects the colorway for the styles {string},{string}")
    public void userSelectsTheColorwayForTheStyles(String searchtype, String stylename) throws Throwable {
        Thread.sleep(2000);
        Actions a = new Actions(driver);
        ca.eleToBeClickable();
        a.moveToElement(shp.getSearchOptionBtn()).click(shp.getSearchOptionBtn()).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[text()='" + stylename + "']")).click();
        Thread.sleep(2000);
        ca.insertText(shp.getSearchInput(),searchtype);
        Thread.sleep(2000);
        a.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);
        a.sendKeys(Keys.TAB).build().perform();
        a.sendKeys(Keys.TAB).build().perform();
        a.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(2000);
        a.sendKeys(Keys.ENTER).build().perform();
    }

    @Then("User creates the colorway for the style and maps it {string},{string}")
    public void userCreatesTheColorwayForTheStyleAndMapsIt(String color1, String color2) throws Throwable {
        Actions a = new Actions(driver);
        jsWaitForPageLoad();
        ca.eleToBeClickable();
        driver.navigate().refresh();
        jsWaitForPageLoad();
        Thread.sleep(15000);
        ca.click(shp.getStyleColorwayTab());
        ca.eleToBeClickable();
        ca.click(shp.getNewColorwayArrowBtn());
        Thread.sleep(2000);
        a.moveToElement(shp.getNFCBtn()).click(shp.getNFCBtn()).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//td[contains(text(),'" + color1 + "')]")).click();
        driver.findElement(By.xpath("//td[contains(text(),'" + color2 + "')]")).click();
        Thread.sleep(2000);
        ca.click(cp.getCV_PopUpSaveBtn());
        ca.eleToBeClickable();
        ca.click(cp.getCV_PopUpSaveBtn());
        Thread.sleep(40000);
        ca.click(cp.getCV_PopUpSaveBtn());
        Thread.sleep(3000);
    }

    @When("User selects the colorway through option from the styles page itself {string}")
    public void userSelectsTheColorwayThroughOptionFromTheStylesPageItself(String style) throws Throwable {
        Thread.sleep(3000);
        jsWaitForPageLoad();
        driver.findElement(By.xpath("//a[@class='browse' and text()='" + style + "']//following::span[@data-csi-act='PopupColorways'][1]")).click();
        Actions a = new Actions(driver);
        ca.eleToBeClickable();
        ca.click(shp.getNowColorwayAction());
        ca.eleToBeClickable();
        Thread.sleep(2000);
        ca.click(shp.getCCSpecCheckBoxInStyleHicPage());
        Thread.sleep(2000);
        ca.insertText(shp.getColorwayNameStylePage(),"11-0304 WATER LILY");
        ca.eleToBeClickable();
        ca.click(cp.getSaveBtn());
        Thread.sleep(3000);
        ca.click(shp.getCloseBtn());
        Thread.sleep(3000);
    }


    @And("Create Brand by providing valid and mandatory data {string}")
    public void createBrandByProvidingValidAndMandatoryData(String a) throws InterruptedException {
        Thread.sleep(2000);
        ca.insertText(pup.getBrand_Value(), a);
    }

    @Then("Click New department by providing valid data {string}")
    public void clickNewDepartmentByProvidingValidData(String a) throws Throwable {
        Thread.sleep(2000);
        ca.jsScrollPageDown(spk.getNew_season_Btn());
        ca.click(spk.getNew_season_Btn());
    }

    @And("Create collection by providing valida and mandatory details {string}")
    public void createCollectionByProvidingValidaAndMandatoryDetails(String a) throws InterruptedException {
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        ca.click(spk.getCollectionTempBtn());
        Thread.sleep(2000);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);
    }

    @Then("Create the Enum value for the print technique {string}")
    public void createTheEnumValueForThePrintTechnique(String a) throws Throwable {
        String[] printTechnique;
        Actions actions = new Actions(driver);
        ca.eleToBeClickable();
        printTechnique = a.split(",");
        for (int i = 0; i < printTechnique.length; i++) {
            ca.eleToBeClickable();
            ca.click(sp.getNewEnumValueBtn());
            ca.eleToBeClickable();
            ca.insertText(sp.getNewEnumValueInputTxtBx(),printTechnique[i].trim());
            ca.eleToBeClickable();
            ca.click(mp.getSave_btn1());
            Thread.sleep(3000);
        }
    }

    @Then("Create the Enum value for the sizes {string}")
    public void createTheEnumValueForTheSizes(String a) throws Throwable {
        String[] printType;
        Actions actions = new Actions(driver);
        ca.eleToBeClickable();
        printType = a.split(",");
        for (int i = 0; i < printType.length; i++) {
            Thread.sleep(2000);
            actions.moveToElement(sp.getUser_NewEnumValue()).click(sp.getUser_NewEnumValue()).build().perform();
            Thread.sleep(200);
            ca.insertText(sp.getUser_NewEnumName(), printType[i]);
            Thread.sleep(200);
            ca.click(mp.getSave_btn1());
            Thread.sleep(3000);
        }
    }

    @When("Setup Enum for size print tech in setup page {string},{string}")
    public void setupEnumForSizePrintTechInSetupPage(String Enum,String b) throws Throwable {
        ca.eleToBeClickable();
        ca.click(sp.getUser_Enumerations());
        Thread.sleep(3000);
        ca.click(sp.getUser_EnumDropBox());
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[contains(text(),'" + b + "')]")).click();
        Thread.sleep(2500);
        WebElement element = driver.findElement(By.xpath("//label[contains(text(),'" + Enum + "')]"));
        ca.eleToBeClickable();
        element.click();
        Thread.sleep(3000);
        ca.click(sp.getUser_Enumerations());
    }
}



