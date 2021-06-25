Feature:US1006_Farkli_Url_Calistirma
@rapor
Scenario Outline:
  Given kullanici "<sayfaUrl>" sayfasina gider



  Examples:
  |sayfaUrl|
  |amazon_url|
  |yandex_url|
  |facebook_url|
