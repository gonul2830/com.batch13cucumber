Feature: US1001_amazon arama


  Scenario: TC01_Amazon arama yapma
    Given kullanici amazon sayfasina gider
    And iPhone icin arama yapar
    Then sonuclarin Iphone icerdigini test eder
    Given kullanici amazon sayfasina gider
    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder
    Given kullanici amazon sayfasina gider
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder
    Then sayfayi kapatir