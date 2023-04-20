package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSettings {

    WebDriver driver;

    @FindBy(xpath="//a[@href='#settings']")
    private WebElement settings;

    @FindBy(xpath="//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath="//button[@class='btn btn-outline-danger']")
    private WebElement logOut;

    @FindBy(xpath="//textarea[@class='form-control form-control-lg']")
    private WebElement shortBio;

    @FindBy(xpath="//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath="//input[@type='password']")
    private WebElement passwordField;

    public UserSettings(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnSettingsMenu() {
        settings.click();
    }
    public void clickOnSubmitButton() {
        Actions actions = new Actions(driver);
        actions.scrollToElement(logOut).perform();
        submitButton.click();
    }

    public void clickLogOut() {
        Actions actions = new Actions(driver);
        actions.scrollToElement(logOut).moveToElement(logOut).click().perform();
    }

    public void setShotBio(String TextBio) {
        shortBio.click();
        shortBio.sendKeys(TextBio);
    }

    public void changePassword(String newPassword) {
        passwordField.sendKeys(newPassword);
    }

    public void changeEmail(String newEmail) {
        emailField.sendKeys(newEmail);
    }
}
