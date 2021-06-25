package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YandexPage {
public YandexPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}
    @FindBy(xpath = "//input[@id='text']")
    public WebElement aramaKutusu;

   @FindBy(xpath = "//div[@class='misspell__message']")
    public WebElement sonucTeaPot;
}
