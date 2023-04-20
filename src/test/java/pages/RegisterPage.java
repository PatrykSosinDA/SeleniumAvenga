package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.sql.Timestamp;

public class RegisterPage {
    WebDriver driver;

    @FindBy(xpath="//input[@type='text']")
    private WebElement username;

    @FindBy(xpath="//input[@type='email']")
    private WebElement email;

    @FindBy(xpath="//input[@type='password']")
    private WebElement password;

    @FindBy(xpath="//button[@class='btn btn-lg btn-primary pull-xs-right' and text()='Sign in']")
    private WebElement buttonSignIn;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String UserName) {
        username.sendKeys(UserName);
    }

    public void setEmail(String Email) {
        email.sendKeys(Email);
    }

    public void setPassword(String Password) {
        password.sendKeys(Password);
    }

    public void clickOnSignInButton() {
        buttonSignIn.click();
    }
}