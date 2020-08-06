package com.centric.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class InspectionPage extends Commonactions{

	public InspectionPage() {
		PageFactory.initElements(Commonactions.driver, this);
	}

	@FindBy(xpath="(//div[@id='pageContent']/div/div/div/div[3])[1]")
	private WebElement PagecontentArrow;

	@FindBy(xpath="//span[text()='Inspections' or @data-csi-tab='Data-Inspections']")
	private WebElement InspectionTab;

	@FindBy(xpath="//span[text()='Inspection Security Groups' or @data-csi-tab='Data-InspectionSecurityGroups']")
	private WebElement InspectionSecGrpTab;

	@FindBy(xpath="//span[text()='Defects' or @data-csi-tab='Data-InspectionDefects']")
	private WebElement Defects;

	@FindBy(xpath="//span[text()='Defect']//following::td/following-sibling::td//span[text()='content_copy']")
	private WebElement DefectCopy;

	@FindBy(xpath="//span[text()='Acceptance Limits' or @data-csi-tab='Data-AcceptanceLimits']")
	private WebElement AccLimit;

	@FindBy(xpath="//span[text()='Sampling Plans' or @data-csi-tab='Data-SamplingPlans']")
	private WebElement Samplingplan;

	@FindBy(xpath="//span[text()='Test Specifications' or @data-csi-tab='Data-InspectionTestSpecs']")
	private WebElement TestSpecification;

	@FindBy(xpath="//span[text()='Error Types' or @data-csi-tab='Data-InspectionErrorTypes']")
	private WebElement ErrorType;

	@FindBy(xpath="//span[text()='Templates' or @data-csi-tab='Data-InspectionTemplates']")
	private WebElement Template;

	@FindBy(xpath="//table[contains(@data-csi-automation,'InspectionDefects')]//div[contains(text(),'New Defect')]")
	private WebElement NewDefectBtn;

	@FindBy(xpath="//div[contains(text(),'New Defect')]")
	private WebElement NewDefect;

	@FindBy(xpath="//table[contains(@data-csi-automation,'AcceptanceLimits')]//div[contains(text(),'New Acceptance Limit')]")
	private WebElement NewAccBtn;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-AcceptanceLimit')]//div[2]/div/input")
	private WebElement AccLimitvalue;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-AcceptanceLimit')]/div[2]/input[1]")
	private WebElement SortOrder;

	@FindBy(xpath="(//td[contains(text(),'ACL')]//following-sibling::td//span[@data-csi-act='Edit'])[1]")
	private WebElement Edit_Btn;

	@FindBy(xpath="(//td[contains(text(),'ACL')]//following-sibling::td//span[@data-csi-act='Delete'])[1]")
	private WebElement DeleteAccLimit;

	@FindBy(xpath="//table[contains(@data-csi-automation,'SamplingPlans')]//div[contains(text(),'New Sampling Plan')]")
	private WebElement NewSamplingBtn;

	@FindBy(xpath="//div[contains(@data-csi-automation,'field-SamplingPlan')]//div[2]/div/input")
	private WebElement SamplingPlanValue;

	@FindBy(xpath="//span[contains(@data-csi-automation,'SamplingPlans-CustomViewAction')]//span[text()='Views']")
	private WebElement Sampligview;
	@FindBy(xpath="//tr[contains(@data-csi-automation,'SamplingPlans-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement SampligManageview;
	@FindBy(xpath="(//select[@class='csiPreferenceSelect '])/option[text()='Acceptance Limits']")
	private WebElement SamplingAccLimit;

	@FindBy(xpath="//td[contains(@data-csi-heading,'Node Name')]/a[contains(text(),'Multiple')]")
	private WebElement MultipleSampling;

	@FindBy(xpath="//table[@data-csi-automation='plugin-SamplingPlan-SamplingPlanTable-ToolbarNewActions']//div[contains(text(),'New Sampling Plan Item')]")
	private WebElement NewSamplingPaln;
	@FindBy(xpath="//div[@data-csi-automation='field-SamplingPlanItem-Form-LotSize']//div[2]/input[1]")
	private WebElement LotSize;
	@FindBy(xpath="//div[@data-csi-automation='field-SamplingPlanItem-Form-SampleQty']//div[2]/input[1]")
	private WebElement SampleQty;
	@FindBy(xpath="//div[@data-csi-automation='field-SamplingPlanItem-Form-CartonQty']//div[2]/input[1]")
	private WebElement CartonQty;
	@FindBy(xpath="(//td[contains(@data-csi-act,'ErrorAcceptanceLimits')])[2]")
	private WebElement AccLimit1;
	@FindBy(xpath="(//td[contains(@data-csi-act,'ErrorAcceptanceLimits')])[1]")
	private WebElement AccLimit2;
	@FindBy(xpath="(//td[contains(@data-csi-act,'InspectionLevel')])")
	private WebElement InspectionLEvel;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'SamplingPlanAcceptanceLimits')]/div)[1]")
	private WebElement AccLimitExpand;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'SamplingPlanAcceptanceLimits')]/div/div/input)[2]")
	private WebElement selectAccLimit;

	@FindBy(xpath="(//div[contains(@data-csi-automation,'SamplingPlanAcceptanceLimits')]/div/div/input)[3]")
	private WebElement selectAccLimit2;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'InspectionTestSpecs')]//div[contains(text(),'New Test Specification')])[1]")
	private WebElement NewTestSpec;

	@FindBy(xpath="//div[contains(@data-csi-automation,'InspectionTestSpec-Form-Node Name')]//div[2]/div/input")
	private WebElement TestSpecValue;


	@FindBy(xpath="(//div[contains(@data-csi-automation,'-InspectionTestSpec-Form-LinkingType')]//div[3]/input)[1]")
	private WebElement LinkTypevalue;

	@FindBy(xpath="//div[contains(@data-csi-automation,'-InspectionTestSpec-Form-LinkingType')]//div[text()='No Link']")
	private WebElement TypeNoLink;

	@FindBy(xpath="//div[contains(@data-csi-automation,'-InspectionTestSpec-Form-LinkingType')]//div[text()='BOM']")
	private WebElement TypeBOM;

	@FindBy(xpath="//div[contains(@data-csi-automation,'-InspectionTestSpec-Form-LinkingType')]//div[text()='Size Chart']")
	private WebElement TypeSizeChart;

	@FindBy(xpath="//div[contains(@data-csi-automation,'-InspectionTestSpec-Form-LinkingType')]//div[text()='Spec Data Sheet']")
	private WebElement TypeSpecDataSheet;

	@FindBy(xpath="//div[contains(@data-csi-automation,'-InspectionTestSpec-Form-LinkingType')]//div[text()='Style Review']")
	private WebElement TypeStyleReview;

	@FindBy(xpath="//a[text()='Style Review']/parent::td//following-sibling::td//span[contains(text(),'copy')]")
	private WebElement CopyTestSpec;

	@FindBy(xpath="//a[contains(text(),'Copy')]/parent::td//following-sibling::td//span[contains(text(),'edit')]")
	private WebElement EditTestSpec;

	@FindBy(xpath="//a[contains(text(),'Delete')]/parent::td//following-sibling::td//span[contains(text(),'close')]")
	private WebElement DeleteTestSpec;

	@FindBy(xpath="//table[contains(@data-csi-automation,'InspectionErrorTypes')]//div[contains(text(),'New Error Type')]")
	private WebElement NewErrorBtn;

	@FindBy(xpath="//div[contains(@data-csi-act,'FullInspection')]")
	private WebElement fullinsChkbox;

	@FindBy(xpath="//td[contains(@data-csi-heading,'FullInspection')]/following-sibling::td/div/span[text()='close']")
	private WebElement DeleteErrorBtn;

	@FindBy(xpath="//table[contains(@data-csi-automation,'InspectionTemplates')]//div[contains(text(),'New Inspection Template')]")
	private WebElement NewInspTemplateBtn;

	@FindBy(xpath="//span[text()='Inspection Template']//following::td[contains(@data-csi-act,'Node Name')]/a")
	private WebElement InspectionTempName;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'FinalInspectionTemplate') and text()='Inspection Template'])")
	private WebElement InspectionTemplatetab;

	@FindBy(xpath="//td[contains(@data-csi-heading,'SamplingPlan')]")
	private WebElement TempSamplingPlan;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'ErrorTypes') and text()='Error Types'])")
	private WebElement ErrorTypestab;

	@FindBy(xpath="//table[contains(@data-csi-automation,'ErrorTypes')]//div[contains(text(),'New Inspection Error Type')]")
	private WebElement NewInspErrorType;

	@FindBy(xpath="//div[@data-csi-automation='field-FinalInspectionErrorType-Form-ErrorType']/div[3]/input[1]")
	private WebElement ErrorTypevalue;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'InspectionSections') and text()='Test Specifications'])")
	private WebElement Testspecificationtab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'AbstractFinalInspection-InspectionSections')]//div[contains(text(),'New from Inspection Section Type')])[1]")
	private WebElement NewTestSpecBtn;

	@FindBy(xpath="//span[text()='Inspection Section Type']/ancestor::tr/th/div/input")
	private WebElement InspSecChkBox;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'FinalInspectionSection-InspectionTestSpecs')]//div[contains(text(),'Select Test Specifications')])[1]")
	private WebElement selectTestSpec;

	@FindBy(xpath="//span[text()='Test Specification']/ancestor::tr/th/div/input")
	private WebElement TestSpecChkBox;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'FIBOMs') and text()='BOM'])")
	private WebElement BOMTab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'AbstractFinalInspection-FIBOMs')]//div[contains(text(),'New Special')])[1]")
	private WebElement NewBombtn;

	@FindBy(xpath="//a[text()='(Unnamed)']/ancestor::td")
	private WebElement EditName;

	@FindBy(xpath="//span[text()='Inspection BOM']/ancestor::div[2]//table//td/a")
	private WebElement BOMName;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'FinalInspectionBOM-Properties') and text()='Properties'])")
	private WebElement BOMInspProperties;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'FinalInspectionBOM-Placements') and text()='Placements'])")
	private WebElement BOMInspPlacement;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'FinalInspectionBOM-Placements')]//div[contains(text(),'New from Material')])[1]")
	private WebElement NewFromMaterialBtn;

	@FindBy(xpath="(//td[contains(text(),'100% Cotton Jersey')]/ancestor::tr/td/div/input)[1]")
	private WebElement materialchkBox;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'FISizeCharts') and text()='Size Charts'])")
	private WebElement SizeChartTab;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'AbstractFinalInspection-FISizeCharts')]//div[contains(text(),'New Special')])[1]")
	private WebElement NewSplSizeChartBtn;

	@FindBy(xpath="//span[text()='Inspection Size Chart']/ancestor::div[2]//table//td/a")
	private WebElement InsSpecName;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'FinalInspectionSizeChart-Properties') and text()='Properties'])")
	private WebElement SizeChartInspProperty;

	@FindBy(xpath="(//span[contains(@data-csi-tab,'FinalInspectionSizeChart-Dimensions') and text()='Inspection Size Charts Dimensions'])")
	private WebElement SizeChartDimension;

	@FindBy(xpath="//table[contains(@data-csi-automation,'FinalInspectionSizeChart-Dimensions-ToolbarNewActions')]//td[2]")
	private WebElement DimesionExpand;

	@FindBy(xpath="//td[contains(text(),'New Inspection Size Chart Dimension')]")
	private WebElement NewinpeSizeChart;

	@FindBy(xpath="//td[contains(@data-csi-heading,'Description')]/preceding-sibling::td[@data-csi-act='Node Name::0']")
	private WebElement EditDimName;

	@FindBy(xpath="(//table[contains(@data-csi-automation,'InspectionSecurityGroups')]//div[contains(text(),'New Inspection Security Group')])[1]")
	private WebElement NewInspSecGrpBtn;
	//**************************************************************************************************************************************************
	@FindBy(xpath="//table[contains(@data-csi-automation,'Data-Inspections')]//div[contains(text(),'New Inspection')]")
	private WebElement NewinspectionBtn;

	@FindBy(xpath="//div[@data-csi-automation='field-FinalInspection-Form-Style']//div[3]/input")
	private WebElement stylevalue;

	@FindBy(xpath="//div[@data-csi-automation='field-FinalInspection-Form-Node Name']//div[2]/div/input")
	private WebElement Inspecationvalue;

	@FindBy(xpath="//div[@data-csi-automation='field-FinalInspection-Form-SamplingPlan']//div[3]/input[1]")
	private WebElement SamplingplanValue;

	@FindBy(xpath="//div[@data-csi-automation='field-FinalInspection-Form-Supplier']//div[3]/input")
	private WebElement SupplierValue;

	@FindBy(xpath="//span[@data-csi-act='Finish']//span[text()='Finish']")
	private WebElement Finish;

	@FindBy(xpath="//td[contains(@data-csi-act,'Node Name')]/a")
	private WebElement InspectionName;


	@FindBy(xpath="//span[contains(@data-csi-tab,'AbstractFinalInspection-FISpecificationDataSheet') or text()='Spec Data Sheets']")
	private WebElement specdatasheet;

	@FindBy(xpath="//span[contains(@data-csi-tab,'AbstractFinalInspection-FIImageDataSheet') or text()='Image Data Sheets']")
	private WebElement imagedatasheet;

	@FindBy(xpath="//span[contains(@data-csi-tab,'AbstractFinalInspection-FIReviewStyle') or text()='Style Reviews']")
	private WebElement StyleRStylereviewtab;

	@FindBy(xpath="//span[contains(@data-csi-tab,'AbstractFinalInspection-FIBOM') or text()='BOMs']")
	private WebElement InspectionBOMTab;

	@FindBy(xpath="//span[@data-csi-automation='plugin-FinalInspection-Properties-ReinitializeAll']//span[text()='Reset All']")
	private WebElement InspectionResetAll  ;

	@FindBy(xpath="//span[@data-csi-automation='plugin-AbstractFinalInspection-FIBOMs-ReinitializeAll']//span[text()='Reset All']")
	private WebElement BOMResetAll;

	@FindBy(xpath="//span[text()='arrow_back']")
	private WebElement HomeArrowIcon;

	@FindBy(xpath="(//table[@data-csi-automation='plugin-User-HeaderToolbar-LastVisited'])//tbody/tr[2]")
	private WebElement selectlastview;

	@FindBy(xpath="//div[contains(text(),'Displaying')]")
	private WebElement NoofItemDisplayed;


	public WebElement getPagecontentArrow() {
		return PagecontentArrow;
	}

	public WebElement getInspectionTab() {
		return InspectionTab;
	}

	public WebElement getInspectionSecGrpTab() {
		return InspectionSecGrpTab;
	}

	public WebElement getDefects() {
		return Defects;
	}
	public WebElement getDefectCopy() {
		return DefectCopy;
	}

	public WebElement getAccLimit() {
		return AccLimit;
	}

	public WebElement getSamplingplan() {
		return Samplingplan;
	}

	public WebElement getTestSpecification() {
		return TestSpecification;
	}

	public WebElement getErrorType() {
		return ErrorType;
	}

	public WebElement getTemplate() {
		return Template;
	}

	public WebElement getNewDefectBtn() {
		return NewDefectBtn;
	}

	public WebElement getNewDefect() {
		return NewDefect;
	}

	public WebElement getNewAccBtn() {
		return NewAccBtn;
	}

	public WebElement getAccLimitvalue() {
		return AccLimitvalue;
	}

	public WebElement getSortOrder() {
		return SortOrder;
	}

	public WebElement getEdit_Btn() {
		return Edit_Btn;
	}

	public WebElement getDeleteAccLimit() {
		return DeleteAccLimit;
	}

	public WebElement getNewSamplingBtn() {
		return NewSamplingBtn;
	}

	public WebElement getSamplingPlanValue() {
		return SamplingPlanValue;
	}

	public WebElement getNewSamplingPaln() {
		return NewSamplingPaln;
	}

	public WebElement getLotSize() {
		return LotSize;
	}

	public WebElement getSampleQty() {
		return SampleQty;
	}

	public WebElement getCartonQty() {
		return CartonQty;
	}

	public WebElement getAccLimit1() {
		return AccLimit1;
	}

	public WebElement getAccLimit2() {
		return AccLimit2;
	}

	public WebElement getInspectionLEvel() {
		return InspectionLEvel;
	}

	public WebElement getAccLimitExpand() {
		return AccLimitExpand;
	}

	public WebElement getSelectAccLimit() {
		return selectAccLimit;
	}

	public WebElement getSelectAccLimit2() {
		return selectAccLimit2;
	}


	public WebElement getMultipleSampling() {
		return MultipleSampling;
	}

	public WebElement getNewTestSpec() {
		return NewTestSpec;
	}

	public WebElement getTestSpecValue() {
		return TestSpecValue;
	}

	public WebElement getLinkTypevalue() {
		return LinkTypevalue;
	}

	public WebElement getTypeNoLink() {
		return TypeNoLink;
	}

	public WebElement getTypeBOM() {
		return TypeBOM;
	}

	public WebElement getTypeSizeChart() {
		return TypeSizeChart;
	}

	public WebElement getTypeSpecDataSheet() {
		return TypeSpecDataSheet;
	}

	public WebElement getTypeStyleReview() {
		return TypeStyleReview;
	}

	public WebElement getCopyTestSpec() {
		return CopyTestSpec;
	}

	public WebElement getEditTestSpec() {
		return EditTestSpec;
	}

	public WebElement getDeleteTestSpec() {
		return DeleteTestSpec;
	}

	public WebElement getNewErrorBtn() {
		return NewErrorBtn;
	}

	public WebElement getFullinsChkbox() {
		return fullinsChkbox;
	}

	public WebElement getDeleteErrorBtn() {
		return DeleteErrorBtn;
	}

	public WebElement getNewInspTemplateBtn() {
		return NewInspTemplateBtn;
	}

	public WebElement getInspectionTempName() {
		return InspectionTempName;
	}

	public WebElement getInspectionTemplatetab() {
		return InspectionTemplatetab;
	}

	public WebElement getTempSamplingPlan() {
		return TempSamplingPlan;
	}

	public WebElement getErrorTypestab() {
		return ErrorTypestab;
	}

	public WebElement getNewInspErrorType() {
		return NewInspErrorType;
	}

	public WebElement getErrorTypevalue() {
		return ErrorTypevalue;
	}

	public WebElement getTestspecificationtab() {
		return Testspecificationtab;
	}

	public WebElement getNewTestSpecBtn() {
		return NewTestSpecBtn;
	}

	public WebElement getInspSecChkBox() {
		return InspSecChkBox;
	}

	public WebElement getSelectTestSpec() {
		return selectTestSpec;
	}

	public WebElement getTestSpecChkBox() {
		return TestSpecChkBox;
	}

	public WebElement getBOMTab() {
		return BOMTab;
	}

	public WebElement getNewBombtn() {
		return NewBombtn;
	}

	public WebElement getEditName() {
		return EditName;
	}

	public WebElement getBOMName() {
		return BOMName;
	}

	public WebElement getBOMInspProperties() {
		return BOMInspProperties;
	}

	public WebElement getBOMInspPlacement() {
		return BOMInspPlacement;
	}

	public WebElement getNewFromMaterialBtn() {
		return NewFromMaterialBtn;
	}

	public WebElement getMaterialchkBox() {
		return materialchkBox;
	}

	public WebElement getSizeChartTab() {
		return SizeChartTab;
	}

	public WebElement getNewSplSizeChartBtn() {
		return NewSplSizeChartBtn;
	}

	public WebElement getInsSpecName() {
		return InsSpecName;
	}

	public WebElement getSizeChartInspProperty() {
		return SizeChartInspProperty;
	}

	public WebElement getSizeChartDimension() {
		return SizeChartDimension;
	}

	public WebElement getDimesionExpand() {
		return DimesionExpand;
	}

	public WebElement getNewinpeSizeChart() {
		return NewinpeSizeChart;
	}

	public WebElement getEditDimName() {
		return EditDimName;
	}

	public WebElement getNewInspSecGrpBtn() {
		return NewInspSecGrpBtn;
	}

	public WebElement getNewinspectionBtn() {
		return NewinspectionBtn;
	}

	public WebElement getStylevalue() {
		return stylevalue;
	}

	public WebElement getInspecationvalue() {
		return Inspecationvalue;
	}

	public WebElement getSamplingplanValue() {
		return SamplingplanValue;
	}

	public WebElement getSupplierValue() {
		return SupplierValue;
	}

	public WebElement getFinish() {
		return Finish;
	}

	public WebElement getInspectionName() {
		return InspectionName;
	}

	public WebElement getSpecdatasheet() {
		return specdatasheet;
	}

	public WebElement getImagedatasheet() {
		return imagedatasheet;
	}

	public WebElement getStyleRStylereviewtab() {
		return StyleRStylereviewtab;
	}

	public WebElement getInspectionBOMTab() {
		return InspectionBOMTab;
	}

	public WebElement getInspectionResetAll() {
		return InspectionResetAll;
	}

	public WebElement getBOMResetAll() {
		return BOMResetAll;
	}

	public WebElement getHomeArrowIcon() {
		return HomeArrowIcon;
	}

	public WebElement getSelectlastview() {
		return selectlastview;
	}

	public WebElement getNoofItemDisplayed() {
		return NoofItemDisplayed;
	}

	public WebElement getSampligview() {
		return Sampligview;
	}

	public WebElement getSampligManageview() {
		return SampligManageview;
	}

	public WebElement getSamplingAccLimit() {
		return SamplingAccLimit;
	}


	//**********************************************************************************
	@FindBy(xpath="//div[contains(text(),'New Inspection Security Group')]//following::td[contains(@data-csi-act,'Node Name')]/a")
	private WebElement NewSecGrpName;

	@FindBy(xpath="((//table[contains(@data-csi-automation,'FinalInspectionSecurityGroup-SecurityGroupFinalInspections-ToolbarNewActions')])//td)[2]")
	private WebElement InspectionGrpExpand;

	@FindBy(xpath="//td[contains(text(),'Move Inspections from')]")
	private WebElement MoveFromIns;

	@FindBy(xpath="(//span[contains(text(),'Move Inspections from')]//following::input[@type='checkbox'])[1]")
	private WebElement InsCheckbox;

	@FindBy(xpath="//table[contains(@data-csi-automation,'AbstractFinalInspection-ErrorTypes')]//div[contains(text(),'New Inspection Error Type')]")
	private WebElement NewInsErrorType;

	@FindBy(xpath="//div[@data-csi-automation='field-FinalInspectionErrorType-Form-ErrorType']//div[3]/input[1]")
	private WebElement InsErrorType;

	@FindBy(xpath="//div[@data-csi-automation='field-FinalInspectionErrorType-Form-AcceptanceLimit']//div[3]/input[1]")
	private WebElement InsAccLimit;

	@FindBy(xpath="//span[@data-csi-automation='plugin-Data-InspectionTestSpecCurrentRevisions-filter']")
	private WebElement Filter;

	@FindBy(xpath="//span[text()='Inspection Batches' or @data-csi-tab='FinalInspection-Batches']")
	private WebElement InspectionBatches;

	@FindBy(xpath="//input[@value='DefectCategory']")
	private WebElement DefectCategory;

	@FindBy(xpath="//span[text()='Cancel']")
	private WebElement Cancel;

	@FindBy(xpath="//table[contains(@data-csi-automation,'FinalInspectionSecurityGroup-SecurityGroupFinalInspections')]//div[contains(text(),'New Inspection')]")
	private WebElement NewInsBtn;

	@FindBy(xpath="//span[text()='Start']")
	private WebElement Start;

	@FindBy(xpath="//table[contains(@data-csi-automation,'FinalInspection-Batches')]//div[contains(text(),'New Inspection Batch')]")
	private WebElement NewInsBatch;

	@FindBy(xpath="//div[@data-csi-automation='field-FinalInspectionBatch-Form-Node Name']/div[2]/div/input")
	private WebElement InspectionBatchName;

	@FindBy(xpath="(//td[text()='Style Review']//following::span[text()='close'])[1]")
	private WebElement ReiewDelete;

	@FindBy(xpath="//table[@data-csi-automation='actionRow-FinalInspectionBatch-InspectionBatchSections-root']//div[text()='add']")
	private WebElement TestspecAdd;

	@FindBy(xpath="//span[text()='Inspection Section']/ancestor::tr/th/div/input")
	private WebElement BatchCheckbox;

	@FindBy(xpath="(//input[@type='radio'])[3]")
	private WebElement ScRadiobutton;

	@FindBy(xpath="//span[contains(@data-csi-automation,'FinalInspectionBatchSection-BatchSectionTestSpecs-CustomViewActions')]//span[text()='Views']")
	private WebElement SCBatchviews;

	@FindBy(xpath="//tr[contains(@data-csi-automation,'FinalInspectionBatchSection-BatchSectionTestSpecs-CustomViewManage')]//td[text()='Manage Views']")
	private WebElement SCBatchManageview;

	@FindBy(xpath="(//label[text()='Available Attributes']//following::div/input[@type='text'])[3]")
	private WebElement Attribute;

	@FindBy(xpath="//option[text()='Inspection Size Chart Dimension']")
	private WebElement InsSizeChartDimension;

	@FindBy(xpath="//option[text()='Dim']")
	private WebElement Dim;

	@FindBy(xpath="//span[text()='Up']")
	private WebElement Up;

	@FindBy(xpath="//td/a[contains(text(),'Size Chart')]")
	private WebElement SizechartIcon;

	@FindBy(xpath="//span[@data-csi-tab='FinalInspectionBatchSection-BatchSectionSamples' and text()='Batch Section Samples']")
	private WebElement BatchSectionsampleTab;

	@FindBy(xpath="//table[contains(@data-csi-automation,'FinalInspectionBatchSection-BatchSectionSamples-ToolbarNewActions')]//div[contains(text(),'New Batch Section Sample')]")
	private WebElement Batchsectionbtn;

	@FindBy(xpath="//div[@data-csi-automation='field-FinalInspectionBatchSectionSample-Form-Colorway']//div[3]/input[1]")
	private WebElement Batchcolorway;

	@FindBy(xpath="//div[@data-csi-automation='field-FinalInspectionBatchSectionSample-Form-Size']//div[3]/input[1]")
	private WebElement Batchsize;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'Deviation')])[1]")
	private WebElement Deviation;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'MeasuredValue')])[1]")
	private WebElement MeasuredValue;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'OutOfTolerance::0')]//div/input)[1]")
	private WebElement outoftolerance1;

	@FindBy(xpath="(//td[contains(@data-csi-heading,'OutOfTolerance::0')]//div/input)[2]")
	private WebElement outoftolerance2;

	@FindBy(xpath="//span//a[contains(text(),'Size chart')]")
	private WebElement SizechartName;

	@FindBy(xpath="(//span[@data-csi-act='AddDefect'])[1]")
	private WebElement AdddefectIcon;

	@FindBy(xpath="//span[text()='Next']")
	private WebElement Next;

	@FindBy(xpath="//div[@data-csi-automation='field-FinalInspectionDefect-Form-Defect']/div[3]/input[1]")
	private WebElement SCDefectvaue;

	@FindBy(xpath="//div[@data-csi-automation='field-FinalInspectionDefect-Form-BatchErrorType']/div[3]/input[1]")
	private WebElement BatchErrorTypevalue;

	@FindBy(xpath="//span[contains(@data-csi-tab,'FinalInspectionBatch-InspectionBatchDefects') or text()='Defects']")
	private WebElement DefectTab;

	@FindBy(xpath="//table[contains(@data-csi-automation,'FinalInspectionBatch-InspectionBatchDefects-ToolbarNewActions')]//div[contains(text(),'New Inspection Defect')]")
	private WebElement NewInspectioDefectBtn;

	@FindBy(xpath="//div[@data-csi-automation='field-FinalInspectionDefect-Form-DefectCounter']//div[2]/input[1]")
	private WebElement Defectcounter;

	@FindBy(xpath="//div/span[text()='DRAFT']")
	private WebElement Draft;

	@FindBy(xpath="//span[text()='Inspection Batch' or @data-csi-tab='FinalInspectionBatch-InspectionBatchHtml']")
	private WebElement FinalInspectionBatch;
	
	@FindBy(xpath="//span[text()='Report' or @data-csi-tab='FinalInspectionBatch-Print']")
	private WebElement ReportTab;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-FinalInspectionBatch-Print-pdf']/span")
	private WebElement PrintPDF;
	
	@FindBy(xpath="//span[contains(@data-csi-automation,'FailInspectionBatch')]//span[text()='Fail']")
	private WebElement Failbtn;

	public WebElement getDraft() {
		return Draft;
	}

	public WebElement getNewSecGrpName() {
		return NewSecGrpName;
	}

	public WebElement getInspectionGrpExpand() {
		return InspectionGrpExpand;
	}

	public WebElement getMoveFromIns() {
		return MoveFromIns;
	}

	public WebElement getInsCheckbox() {
		return InsCheckbox;
	}

	public WebElement getNewInsErrorType() {
		return NewInsErrorType;
	}

	public WebElement getInsErrorType() {
		return InsErrorType;
	}

	public WebElement getInsAccLimit() {
		return InsAccLimit;
	}
	public WebElement getFilter() {
		return Filter;
	}

	public WebElement getInspectionBatches() {
		return InspectionBatches;
	}

	public WebElement getDefectCategory() {
		return DefectCategory;
	}

	public WebElement getCancel() {
		return Cancel;
	}

	public WebElement getNewInsBtn() {
		return NewInsBtn;
	}

	public WebElement getStart() {
		return Start;
	}

	public WebElement getNewInsBatch() {
		return NewInsBatch;
	}

	public WebElement getInspectionBatchName() {
		return InspectionBatchName;
	}


	public WebElement getReiewDelete() {
		return ReiewDelete;
	}

	public WebElement getTestspecAdd() {
		return TestspecAdd;
	}

	public WebElement getBatchCheckbox() {
		return BatchCheckbox;
	}

	public WebElement getScRadiobutton() {
		return ScRadiobutton;
	}

	public WebElement getSCBatchviews() {
		return SCBatchviews;
	}

	public WebElement getSCBatchManageview() {
		return SCBatchManageview;
	}

	public WebElement getAttribute() {
		return Attribute;
	}

	public WebElement getInsSizeChartDimension() {
		return InsSizeChartDimension;
	}

	public WebElement getDim() {
		return Dim;
	}

	public WebElement getBatchsize() {
		return Batchsize;
	}

	public WebElement getOutoftolerance2() {
		return outoftolerance2;
	}

	public WebElement getUp() {
		return Up;
	}

	public WebElement getSizechartIcon() {
		return SizechartIcon;
	}

	public WebElement getBatchSectionsampleTab() {
		return BatchSectionsampleTab;
	}

	public WebElement getBatchsectionbtn() {
		return Batchsectionbtn;
	}

	public WebElement getBatchcolorway() {
		return Batchcolorway;
	}

	public WebElement getDeviation() {
		return Deviation;
	}

	public WebElement getMeasuredValue() {
		return MeasuredValue;
	}

	public WebElement getOutoftolerance1() {
		return outoftolerance1;
	}

	public WebElement getSizechartName() {
		return SizechartName;
	}

	public WebElement getAdddefectIcon() {
		return AdddefectIcon;
	}

	public WebElement getNext() {
		return Next;
	}

	public WebElement getSCDefectvaue() {
		return SCDefectvaue;
	}

	public WebElement getBatchErrorTypevalue() {
		return BatchErrorTypevalue;
	}

	public WebElement getDefectTab() {
		return DefectTab;
	}

	public WebElement getNewInspectioDefectBtn() {
		return NewInspectioDefectBtn;
	}

	public WebElement getDefectcounter() {
		return Defectcounter;
	}

	public WebElement getFinalInspectionBatch() {
		return FinalInspectionBatch;
	}

	public WebElement getReportTab() {
		return ReportTab;
	}

	public WebElement getPrintPDF() {
		return PrintPDF;
	}

	public WebElement getFailbtn() {
		return Failbtn;
	}




}
