package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GramWelcomePage {

    WebDriver driver;
    WebDriverWait wait;


    @FindBy(xpath = "//a[contains(text(), 'Encyklopedia')]")
    private WebElement encyklopediaTab;

    @FindBy(xpath = "//a[contains(text(), 'GramTV')]")
    private WebElement gramtvTab;

    public GramWelcomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickEncyklopediaTab() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        encyklopediaTab.click();
        wait.until(ExpectedConditions.urlContains("encyklopedia"));
    }

    public void clickGramtvTab() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        gramtvTab.click();
        wait.until(ExpectedConditions.urlContains("gramtv"));
    }
}
