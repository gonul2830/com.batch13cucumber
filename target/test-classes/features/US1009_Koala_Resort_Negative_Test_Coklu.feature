Feature: US1009_Koala_Resort_Negative_Test_Coklu
  @wip
  Scenario Outline: TC13 kullanici yanlis bilgilerle giris yapamaz


    Given kullanici "kr_url" sayfasina gider
    Then Log in yazisina tiklar
    And kullanici ismi olarak "<gecersiz_name>" girer
    And kullanici sifre olarak "<gecersiz_password>" girer
    And Login butonuna basar
    Then sayfaya giris yapamadigini kontrol eder
    And  sayfayi kapatir

    Examples:
    |gecersiz_name|gecersiz_password|


 | kr_gecersiz_username5|kr_gecersiz_password5|
 | kr_gecersiz_username6| kr_gecersiz_password6|
 | kr_gecersiz_username7|kr_gecersiz_password7|
 | kr_gecersiz_username8| kr_gecersiz_password8|
