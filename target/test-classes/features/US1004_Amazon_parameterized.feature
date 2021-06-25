

    Feature: US1004_Amazon_parametrerized
      Background: Amazon sayfasina gider
      Given kullanici amazon sayfasina gider


    Scenario: TC07_Amazon iPhone arama parametreli
      Then "nutella" icin arama yapar
      Then sonuclarin "nutella" icerdigini test eder


      Scenario: TC08_Amazon tea pot arama parametreli
        When "tea pot" icin arama yapar
        Then sonuclarin "tea pot" icerdigini test eder

        Scenario: TC09_Amazon flower aramasi
          Given "flower" icin arama yapar
          Then sonuclarin "flower" icerdigini test eder
          Then sayfayi kapatir