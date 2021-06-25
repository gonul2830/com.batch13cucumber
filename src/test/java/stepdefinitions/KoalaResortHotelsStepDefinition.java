package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.KoalaResortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class KoalaResortHotelsStepDefinition {

    KoalaResortPage koalaResortPage = new KoalaResortPage();
    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
koalaResortPage.ilkLoginButonu.click();
    }

    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        koalaResortPage.userTextBox.sendKeys(ConfigReader.getProperty("kr_valid_username"));

    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty("kr_valid_password"));
    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
koalaResortPage.girisLoginButonu.click();
    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertEquals(ConfigReader.getProperty("kr_basarili_giris_url"),Driver.getDriver().getCurrentUrl());
    }


    @Then("sayfaya giris yapamadigini kontrol eder")
    public void sayfaya_giris_yapamadigini_kontrol_eder() {
Assert.assertTrue(koalaResortPage.girilemediYazisi.isDisplayed());
    }

    @Then("kullanici ismi olarak {string} girer")
    public void kullanici_ismi_olarak_girer(String username) {
koalaResortPage.userTextBox.sendKeys(ConfigReader.getProperty(username));
    }

    @Then("kullanici sifre olarak {string} girer")
    public void kullanici_sifre_olarak_girer(String password) {
koalaResortPage.passwordTextBox.sendKeys(ConfigReader.getProperty(password));
    }





    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {

    }


}