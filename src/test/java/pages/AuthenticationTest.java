package pages;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationTest extends BaseTest {
    WebDriver driver;

    public AuthenticationTest(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
