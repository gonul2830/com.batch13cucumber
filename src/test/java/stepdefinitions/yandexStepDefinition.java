package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import pages.YandexPage;
import utilities.ConfigReader;
import utilities.Driver;

public class yandexStepDefinition {
 YandexPage yandexPage = new YandexPage();
    @Given("kullanici yandex anasayfaya gider")
    public void kullanici_yandex_anasayfaya_gider() {
   Driver.getDriver().get(ConfigReader.getProperty("yandex_url"));
    }

    @Then("yandexte iPhone icin arama yapar")
    public void yandexte_i_phone_icin_arama_yapar() {
    yandexPage.aramaKutusu.sendKeys("iPhone"+ Keys.ENTER);
    }

    @Then("yandexte sonuclarin Iphone icerdigini test eder")
    public void yandexte_sonuclarin_iphone_icerdigini_test_eder() {
     Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
    }

    @When("yandexte tea pot icin arama yapar")
    public void yandexte_tea_pot_icin_arama_yapar() {
     yandexPage.aramaKutusu.sendKeys("tea pot"+ Keys.ENTER);
    }

    @Then("yandexte sonuclarin tea pot icerdigini test eder")
    public void yandexte_sonuclarin_tea_pot_icerdigini_test_eder() {
     Assert.assertTrue(yandexPage.sonucTeaPot.isDisplayed());
     //Assert.assertTrue(Driver.getDriver().getTitle().contains("result found"));
    }


}
