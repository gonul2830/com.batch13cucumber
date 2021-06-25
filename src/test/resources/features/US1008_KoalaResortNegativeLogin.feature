Feature: US1008_KoalaResort_Negative_Login

  Scenario: TC12 kullanici yanlis bilgilerle giris yapamaz


   Given kullanici "kr_url" sayfasina gider
   Then Log in yazisina tiklar
   And kullanici ismi olarak "kr_gecersiz_username" girer
   And kullanici sifre olarak "kr_gecersiz_password" girer
   And Login butonuna basar
   Then sayfaya giris yapamadigini kontrol eder
   And  sayfayi kapatir