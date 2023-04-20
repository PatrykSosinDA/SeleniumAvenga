package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath="//input[@type='email']")
    private WebElement loginEmail;

    @FindBy(xpath="//input[@type='password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary pull-xs-right' and text()='Sign in']")
    private WebElement signinButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setEmailLogin(String emailLogin) {
        loginEmail.sendKeys(emailLogin);
    }

    public void setPasswordLogin(String passwordLogin) {
        loginPassword.sendKeys(passwordLogin);
    }

    public void clickSignIn() {
        signinButton.click();
    }
}
