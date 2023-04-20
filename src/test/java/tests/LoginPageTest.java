package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {
    @Test
    void LoginPageTest(){
        driver.manage().window().maximize();
        driver.get("https://react-redux.realworld.io/#/login?_k=v862as");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.setEmailLogin("patryk.sosinski1681979907875@avenga.com");
        loginPage.setPasswordLogin("eVIq7NC9QKWfzHD");
        loginPage.clickSignIn();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='user-pic']")));

        driver.quit();
    }
}
