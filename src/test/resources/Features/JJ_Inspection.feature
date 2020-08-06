@Selenium @Inspection
Feature: Inspection_creation

  @InspectionCreation
  Scenario Outline: Inspection Creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User creates Enumeration "<DefectsCategory>"
    When user creates setup in Inspection "<Defects>","<AccLimit>","<sortOrder>","<TestSpecification>","<SamplingValue>","<ErrorType>","<TemplateName>","<BOMName>","<SizeChart>","<DimensioName>","<InspectionGrpName>"

    Examples: 
      | Defects                                              | AccLimit                | sortOrder | TestSpecification                                   | SamplingValue         | ErrorType                 | TemplateName    | BOMName        | SizeChart   | DimensioName  | InspectionGrpName    | DefectsCategory |
      | Size Defect,Sewing Defect,Fabric Defect,Color Defect | 2.5%AQL,4.5%AQL,ACL 3.0 |     0,1,2 | No Link,BOM,Size Chart,Spec Data Sheet,Style Review | Single SP,Multiple SP | Critical,High,Check Error | auto-inspection | Inspection BOM | Ins Special | New Dimension | New Inspection Group | High,Medium,Low |

  @InspectionStyleCreation
  Scenario Outline: Inspection style creation
  #  Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User creates Style for inspection "<BOMName>"
    And User creates ImageDatasheet "<ImageName>","<Description>"
    Then User creates Review and sizechart "<ReviewName>","<ReviewDesc>","<canvasNote>","<InsSize>"
    Then User creates spec "<specvalue>","<datasheet>","<specdesc>","<customspecvalue>","<specialvalue>","<Bomcopy1>","<Bomcopy2>"
    Then User creates Inspection and verify the created items in Style Specification "<InspectionName>","<Samplingvalue>","<SupplierValue>"

    Examples: 
      | BOMName | ImageName | Description              | ReviewName       | ReviewDesc               | canvasNote         | InsSize       | specvalue | datasheet          | specdesc           | customspecvalue     | specialvalue   | Bomcopy1     | Bomcopy2      | InspectionName     | Samplingvalue | SupplierValue |
      | Ins-BOM | INS-IDS   | Image Inspection Testing | Ins-Style Review | Style Inspection testing | Automation Testing | Ins-SizeChart | character | Ins-spec datasheet | Inspection Testing | Custom spec section | Characteristic | Ins-BOM COPY | Ins-BOM COPY2 | Apparel-Inspection | Single        | Supplier      |

  @InspectionContinuation
  Scenario Outline: Inspection style creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then create NewInspectionSecurityGroup "<ErrorType>","<AccLimit>","<SampleQtyMethod>","<InsBatchName>","<Attribute>","<Batchcolorway>","<BatchSize>","<Defectvalue>","<DefectCounter>"
		And User verify the PDF and InspectionBatch status
    Examples: 
      | ErrorType     | AccLimit | SampleQtyMethod   | InsBatchName     | Attribute                                            | Batchcolorway | BatchSize | Defectvalue | DefectCounter |
      | High,Critical | 2.5,4.5  | Static,Percentage | Size chart batch | Inspection Size Chart Dimension,Size Chart Dimension | Vanilla       | small     | size        |             5 |
