

Feature: US1003_Yandex_Arama
  Background: kullanici yandex anasayfaya gider

    Given kullanici yandex anasayfaya gider

    Scenario: TC05_iPhone arama
      Then yandexte iPhone icin arama yapar
      Then yandexte sonuclarin Iphone icerdigini test eder

      Scenario: TC06_Tea pot icin arama yapar
        When yandexte tea pot icin arama yapar
        Then yandexte sonuclarin tea pot icerdigini test eder
