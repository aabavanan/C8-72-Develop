package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class ConfigurationPage extends Commonactions{
	
	public ConfigurationPage() {
		PageFactory.initElements(Commonactions.driver, this);
	} 
	
	@FindBy(xpath="//span[@data-csi-tab='Site-Configuration' or text()='Configuration']")
	private WebElement user_config;
	
	@FindBy(xpath="//span[@data-csi-tab='Site-TypeConfiguration' or text()='Type Configuration']")
	private WebElement user_TypeConfig;
	
	@FindBy(xpath="//span[@data-csi-tab='Site-StyleTypes' or text()='Style Types']")
	private WebElement style_Types;
	
	@FindBy(xpath="//span[@data-csi-tab='BusinessObject-StyleTypeAttributes' or text()='Style Type Attributes']")
	private WebElement style_Type_Attribute;
	
	@FindBy(xpath="//span[@data-csi-tab='Site-StyleTDS' or text()='Style Type Data Sheets']")
	private WebElement style_Type_DataSheets;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-Site-StyleTDS-charts']//following-sibling::span[@data-csi-act='ViewRefresh']")
	private WebElement style_Type_DataSheets_RefreshBtn;
	
	@FindBy(xpath="//table[@data-csi-result-action='true']//div[@role='button']//div[@class='dijitReset dijitInline dijitButtonText']")
	private WebElement new_styleType_Btn;
	
	@FindBy(xpath="//span[@data-csi-tab='Site-MaterialTypes' or text()='Material Types']")
	private WebElement material_Types;
	
	@FindBy(xpath="(//table[@data-csi-automation='plugin-Site-MaterialTypes-ToolbarNewActions']//div/div)[2]")
	private WebElement new_material_TypeBtn;
	
	@FindBy(xpath="//span[@data-csi-tab='Site-BOMTypes' or text()='BOM Types']")
	private WebElement BOM_Types;
	
	@FindBy(xpath="(//table[contains(@data-csi-context-parent,'ApparelBOMConfig')]//div[@role='button']//div[@class='dijitReset dijitInline dijitButtonText'])")
	private WebElement new_BOM_Type_Btn;
	
	@FindBy(xpath="(//table[contains(@data-csi-context-parent,'MaterialBOMConfig')]//div[@role='button']//div[@class='dijitReset dijitInline dijitButtonText'])")
	private WebElement new_materialBOM_Type_Btn;
	
	public WebElement getNew_materialBOM_Type_Btn() {
		return new_materialBOM_Type_Btn;
	}

	@FindBy(xpath="(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])")
	private WebElement BOM_active;
	
	@FindBy(xpath="(//div[@data-csi-act='IsAutomaticPlacementTracking:Child:SetupSettings:0']/input[@tabindex='0'])")
	private WebElement BOM_AutPlaceTracking;
	
	@FindBy(xpath="(//div[@data-csi-act='LockThemePlacementList:Child:SetupSettings:0']/input[@tabindex='0'])")
	private WebElement BOM_LockThemePlacementList;
	
	@FindBy(xpath="(//div[@data-csi-act='FilterQuotesByColor:Child:SetupSettings:0']/input[@tabindex='0'])[1]")
	private WebElement BOM_FilterQuotesByColor;
	
	@FindBy(xpath="(//div[@data-csi-act='ExposeBOMSupplierAttributes:Child:SetupSettings:0']/input[@tabindex='0'])[1]")
	private WebElement BOM_expose;
	
	@FindBy(xpath="(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])[2]")
	private WebElement material_BOM_active;
	
	@FindBy(xpath="(//div[@data-csi-act='FilterQuotesByColor:Child:SetupSettings:0']/input[@tabindex='0'])[2]")
	private WebElement material_BOM_FilterQuotesByColor;
	
	@FindBy(xpath="(//div[@data-csi-act='ExposeBOMSupplierAttributes:Child:SetupSettings:0']/input[@tabindex='0'])[2]")
	private WebElement materialBOM_expose;
	
	@FindBy(xpath="//span[@data-csi-tab='Site-SizeChartSubtypes' or text()='Size Chart Types']")
	private WebElement sizeChart_Types;
	
	@FindBy(xpath="(//table[contains(@data-csi-context-parent,'SizeChartConfig')]//div[@role='button']//div[@class='dijitReset dijitInline dijitButtonText'])")
	private WebElement new_sizeChart_Types_Btn;
	
	@FindBy(xpath="(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])[3]")
	private WebElement sizeChart_active1;
	
	@FindBy(xpath="(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])[4]")
	private WebElement sizeChart_active2;
	
	@FindBy(xpath="(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])[5]")
	private WebElement sizeChart_active3;
	
	@FindBy(xpath="(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])[6]")
	private WebElement sizeChart_active4;
	
	@FindBy(xpath="(//div[@data-csi-act='LockShapeDimensionList:Child:SetupSettings:0']/input[@tabindex='0'])")
	private WebElement sizeChart_DimensionList;
	
	@FindBy(xpath="(//div[@data-csi-act='LockShapeDimensionValues:Child:SetupSettings:0']/input[@tabindex='0'])")
	private WebElement sizeChart_DimensionValues;
	
	@FindBy(xpath="(//div[@data-csi-act='LockShapeTolerance:Child:SetupSettings:0']/input[@tabindex='0'])")
	private WebElement sizeChart_Tolerance;
	
	@FindBy(xpath="//span[@data-csi-tab='Site-SpecificationDataSheetSubtypes' or text()='Spec Types']")
	private WebElement spec_Types;
	
	@FindBy(xpath="(//table[contains(@data-csi-context-parent,'SpecificationDataSheetConfig')]//div[@role='button']//div[@class='dijitReset dijitInline dijitButtonText'])")
	private WebElement new_spec_type_Btn;
	
	@FindBy(xpath="(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])[7]")
	private WebElement spec_Active;
	
	@FindBy(xpath="(//div[@data-csi-act='EnableValueAttributes:Child:SetupSettings:0']/input[@tabindex='0'])[1]")
	private WebElement spec_EnableA;
	
	@FindBy(xpath="(//div[@data-csi-act='EnableValueAttributes:Child:SetupSettings:0']/input[@tabindex='0'])[2]")
	private WebElement spec_EnableB;
	
	@FindBy(xpath="//span[@data-csi-tab='Site-TestSpecSubtypes' or text()='Test Types']")
	private WebElement test_Types;
	
	@FindBy(xpath="(//table[contains(@data-csi-context-parent,'TestSpecConfig')]//div[@role='button']//div[@class='dijitReset dijitInline dijitButtonText'])")
	private WebElement new_test_type_Btn;
	
	@FindBy(xpath="(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])[8]")
	private WebElement test_Active;
	
	@FindBy(xpath="(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])[1]")
	private WebElement style_Active;
	
	@FindBy(xpath="(//div[@data-csi-act='HasColor:Child:Config:0']/input[@tabindex='0'])[1]")
	private WebElement style_Colour;
	
	@FindBy(xpath="(//div[@data-csi-act='AllowCreateColorSpecOnColorway:Child:Config:0']/input[@tabindex='0'])[1]")
	private WebElement style_Allow_ColourSpec;
	
	@FindBy(xpath="(//div[@data-csi-act='ReferenceDefaultImageOnColorwayCreate:Child:Config:0']/input[@tabindex='0'])[1]")
	private WebElement style_Reference_Img;
	
	@FindBy(xpath="(//div[@data-csi-act='ValidateMCMaterialColors:Child:Config:0']/input[@tabindex='0'])[1]")
	private WebElement style_Validate_MCM;
	
	@FindBy(xpath="(//div[@data-csi-act='HasSize:Child:Config:0']/input[@tabindex='0'])[1]")
	private WebElement style_Size;
	
	@FindBy(xpath="(//div[@data-csi-act='EnableStyleSupplierAttributes:Child:Config:0']/input[@tabindex='0'])[1]")
	private WebElement style_EnableStyle;
	
	@FindBy(xpath="(//div[@data-csi-act='EnableSKUSources:Child:Config:0']/input[@tabindex='0'])[1]")
	private WebElement style_EnableSKU;
	
	@FindBy(xpath="(//div[@data-csi-act='IsAssortment:Child:Config:0']/input[@tabindex='0'])[1]")
	private WebElement style_IsAssortment;
	
	@FindBy(xpath="(//div[@data-csi-act='InAssortment:Child:Config:0']/input[@tabindex='0'])[1]")
	private WebElement style_InAssortment;
	
	@FindBy(xpath="(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[1]")
	private WebElement style_Brands;
	
	@FindBy(xpath="(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[2]")
	private WebElement style_Features;
	
	@FindBy(xpath="(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[3]")
	private WebElement style_Functions;
	
	@FindBy(xpath="(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[3]")
	private WebElement TDS_Rowcount;
	
	@FindBy(xpath="((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0']")
	private WebElement material_Active;
	
	@FindBy(xpath="((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='HasColor:Child:Config:0']/input[@tabindex='0']")
	private WebElement material_Colour;
	
	@FindBy(xpath="((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='AllowCreateColoredMaterialOnPlacement:Child:Config:0']/input[@tabindex='0']")
	private WebElement material_Allow_Coloured;
	
	@FindBy(xpath="((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='HasSize:Child:Config:0']/input[@tabindex='0']")
	private WebElement material_Size;
	
	@FindBy(xpath="((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='EnableSKUSources:Child:Config:0']/input[@tabindex='0']")
	private WebElement material_EnableSKU;
	
	@FindBy(xpath="((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='DefaultHasSeasonAvailability:Child:Config:0']/input[@tabindex='0']")
	private WebElement material_Default_Season;
	
	@FindBy(xpath="((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='DefaultPlacementQuoteToHighestCost:Child:Config:0']/input[@tabindex='0']")
	private WebElement material_Highest_Cost;
	
	@FindBy(xpath="(((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])[1]")
	private WebElement material_BOM;
	
	@FindBy(xpath="(((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])[2]")
	private WebElement material_Routing;
	
	@FindBy(xpath="(((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])[3]")
	private WebElement material_DataSheet;
	
	@FindBy(xpath="(((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])[4]")
	private WebElement material_TestRun;
	
	@FindBy(xpath="//span[@data-csi-tab='Data-InspectionSectionSubtypes' or text()='Inspection Section Types']")
	private WebElement insp_Types;
	
	@FindBy(xpath="(//table[contains(@data-csi-context-parent,'FinalInspectionSectionConfig')]//div[@role='button']//div[@class='dijitReset dijitInline dijitButtonText'])")
	private WebElement new_InspTypes_Btn;
	
	@FindBy(xpath="//span[@data-csi-tab='Site-ContractualDocumentSubtypes' or text()='Contractual Document Types']")
	private WebElement contract_Types;
	
	@FindBy(xpath="(//table[contains(@data-csi-context-parent,'ContractualDocumentConfig')]//div[@role='button']//div[@class='dijitReset dijitInline dijitButtonText'])")
	private WebElement new_contractTypes_Btn;
	
	@FindBy(xpath="(//div[@data-csi-act='HasEffectivity:Child:SetupSettings:0']/input[@tabindex='0'])[1]")
	private WebElement contrct_HED;
	
	@FindBy(xpath="(//div[@data-csi-act='RequiresAcknowledgement:Child:SetupSettings:0']/input[@tabindex='0'])[1]")
	private WebElement contrct_RA;
	
	@FindBy(xpath="(//div[@data-csi-act='HasRenewalPeriod:Child:SetupSettings:0']/input[@tabindex='0'])[1]")
	private WebElement contrct_HRD;
	
	@FindBy(xpath="(//div[@data-csi-act='RenewalPeriodBeginsOnReceipt:Child:SetupSettings:0']/input[@tabindex='0'])[2]")
	private WebElement contrct_RPOR;
	
	@FindBy(xpath="//span[@data-csi-tab='Site-ThemeMasterSubtypes' or text()='Theme Master Types']")
	private WebElement theme_Types;
	
	@FindBy(xpath="(//table[contains(@data-csi-context-parent,'ThemeMasterConfig')]//div[@role='button']//div[@class='dijitReset dijitInline dijitButtonText'])")
	private WebElement new_theme_Btn;
	
	@FindBy(xpath="//span[@data-csi-tab='Site-LookupItemSubtypes' or text()='Lookup Item Types']")
	private WebElement lookUp_Types;
	
	@FindBy(xpath="(//table[contains(@data-csi-context-parent,'LookupItemConfig')]//div[@role='button']//div[@class='dijitReset dijitInline dijitButtonText'])")
	private WebElement new_LookUp_Btn;
	


	public WebElement getInsp_Types() {
		return insp_Types;
	}

	public WebElement getLookUp_Types() {
		return lookUp_Types;
	}

	public WebElement getNew_LookUp_Btn() {
		return new_LookUp_Btn;
	}

	public WebElement getNew_InspTypes_Btn() {
		return new_InspTypes_Btn;
	}

	public WebElement getContract_Types() {
		return contract_Types;
	}

	public WebElement getNew_contractTypes_Btn() {
		return new_contractTypes_Btn;
	}

	public WebElement getContrct_HED() {
		return contrct_HED;
	}

	public WebElement getContrct_RA() {
		return contrct_RA;
	}

	public WebElement getContrct_HRD() {
		return contrct_HRD;
	}

	public WebElement getContrct_RPOR() {
		return contrct_RPOR;
	}

	public WebElement getTheme_Types() {
		return theme_Types;
	}

	public WebElement getNew_theme_Btn() {
		return new_theme_Btn;
	}

	public WebElement getUser_config() {
		return user_config;
	}

	public WebElement getUser_TypeConfig() {
		return user_TypeConfig;
	}

	public WebElement getBOM_Types() {
		return BOM_Types;
	}

	public WebElement getNew_BOM_Type_Btn() {
		return new_BOM_Type_Btn;
	}

	public WebElement getBOM_active() {
		return BOM_active;
	}

	public WebElement getBOM_AutPlaceTracking() {
		return BOM_AutPlaceTracking;
	}

	public WebElement getBOM_LockThemePlacementList() {
		return BOM_LockThemePlacementList;
	}

	public WebElement getBOM_FilterQuotesByColor() {
		return BOM_FilterQuotesByColor;
	}

	public WebElement getBOM_expose() {
		return BOM_expose;
	}

	public WebElement getMaterial_BOM_active() {
		return material_BOM_active;
	}

	public WebElement getMaterial_BOM_FilterQuotesByColor() {
		return material_BOM_FilterQuotesByColor;
	}

	public WebElement getMaterialBOM_expose() {
		return materialBOM_expose;
	}

	public WebElement getSizeChart_Types() {
		return sizeChart_Types;
	}

	public WebElement getNew_sizeChart_Types_Btn() {
		return new_sizeChart_Types_Btn;
	}

	public WebElement getSizeChart_active1() {
		return sizeChart_active1;
	}

	public WebElement getSizeChart_active2() {
		return sizeChart_active2;
	}

	public WebElement getSizeChart_active3() {
		return sizeChart_active3;
	}

	public WebElement getSizeChart_active4() {
		return sizeChart_active4;
	}

	public WebElement getSizeChart_DimensionList() {
		return sizeChart_DimensionList;
	}

	public WebElement getSizeChart_DimensionValues() {
		return sizeChart_DimensionValues;
	}

	public WebElement getSizeChart_Tolerance() {
		return sizeChart_Tolerance;
	}

	public WebElement getSpec_Types() {
		return spec_Types;
	}

	public WebElement getNew_spec_type_Btn() {
		return new_spec_type_Btn;
	}

	public WebElement getSpec_Active() {
		return spec_Active;
	}

	public WebElement getSpec_EnableA() {
		return spec_EnableA;
	}
	
	public WebElement getSpec_EnableB() {
		return spec_EnableB;
	}

	public WebElement getTest_Types() {
		return test_Types;
	}

	public WebElement getNew_test_type_Btn() {
		return new_test_type_Btn;
	}

	public WebElement getTest_Active() {
		return test_Active;
	}

	public WebElement getStyle_Types() {
		return style_Types;
	}

	public WebElement getStyle_Type_Attribute() {
		return style_Type_Attribute;
	}

	public WebElement getStyle_Type_DataSheets() {
		return style_Type_DataSheets;
	}

	public WebElement getStyle_Type_DataSheets_RefreshBtn() {
		return style_Type_DataSheets_RefreshBtn;
	}

	public WebElement getNew_styleType_Btn() {
		return new_styleType_Btn;
	}

	public WebElement getMaterial_Types() {
		return material_Types;
	}

	public WebElement getNew_material_TypeBtn() {
		return new_material_TypeBtn;
	}

	public WebElement getStyle_Active() {
		return style_Active;
	}

	public WebElement getStyle_Colour() {
		return style_Colour;
	}

	public WebElement getStyle_Allow_ColourSpec() {
		return style_Allow_ColourSpec;
	}

	public WebElement getStyle_Reference_Img() {
		return style_Reference_Img;
	}

	public WebElement getStyle_Validate_MCM() {
		return style_Validate_MCM;
	}

	public WebElement getStyle_Size() {
		return style_Size;
	}

	public WebElement getStyle_EnableStyle() {
		return style_EnableStyle;
	}

	public WebElement getStyle_EnableSKU() {
		return style_EnableSKU;
	}

	public WebElement getStyle_IsAssortment() {
		return style_IsAssortment;
	}

	public WebElement getStyle_InAssortment() {
		return style_InAssortment;
	}

	public WebElement getStyle_Brands() {
		return style_Brands;
	}

	public WebElement getStyle_Features() {
		return style_Features;
	}

	public WebElement getStyle_Functions() {
		return style_Functions;
	}

	public WebElement getTDS_Rowcount() {
		return TDS_Rowcount;
	}

	public WebElement getMaterial_Active() {
		return material_Active;
	}

	public WebElement getMaterial_Colour() {
		return material_Colour;
	}

	public WebElement getMaterial_Allow_Coloured() {
		return material_Allow_Coloured;
	}

	public WebElement getMaterial_Size() {
		return material_Size;
	}

	public WebElement getMaterial_EnableSKU() {
		return material_EnableSKU;
	}

	public WebElement getMaterial_Default_Season() {
		return material_Default_Season;
	}

	public WebElement getMaterial_Highest_Cost() {
		return material_Highest_Cost;
	}

	public WebElement getMaterial_BOM() {
		return material_BOM;
	}

	public WebElement getMaterial_Routing() {
		return material_Routing;
	}

	public WebElement getMaterial_DataSheet() {
		return material_DataSheet;
	}

	public WebElement getMaterial_TestRun() {
		return material_TestRun;
	}

	
	
	

}
