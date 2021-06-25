Feature: US1005_Amazon_Scenario_Outline


  Scenario Outline: TC10_Amazon coklu arama
    Given kullanici amazon sayfasina gider
    Then "<meyve>" icin arama yapar
    And sonuclarin "<meyve>" icerdigini test eder
    Examples:
    |meyve|
    |kiraz|
    |visne|
    |uzum|
    |elma|
    |incir|
