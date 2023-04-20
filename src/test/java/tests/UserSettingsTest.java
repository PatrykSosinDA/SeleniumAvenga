package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.LoginPage;
import pages.UserSettings;

public class UserSettingsTest extends BaseTest{

    @Test
    void UserSettingsPageTest(){
        driver.manage().window().maximize();
        driver.get("https://react-redux.realworld.io/#/login?_k=v862as");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.setEmailLogin("patryk.sosinski1681979907875@avenga.com");
        loginPage.setPasswordLogin("eVIq7NC9QKWfzHD");
        loginPage.clickSignIn();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='user-pic']")));

        UserSettings UserPage = new UserSettings(driver);

        UserPage.clickOnSettingsMenu();

        UserPage.setShotBio("Test01");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        UserPage.clickOnSubmitButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#settings']")));
        UserPage.clickOnSettingsMenu();

        /*

        UserPage.changePassword("uyjkhjujkj278292");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        UserPage.clickOnSubmitButton();
        UserPage.clickOnSettingsMenu();

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        Long uniName = timestamp.getTime();
        String uniEmail = "patryk.sosinski" + uniName + "@avenga.com";
        UserPage.changeEmail(uniEmail);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        UserPage.clickOnSubmitButton();

        */

        UserPage.clickLogOut();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#register']")));

        driver.quit();
    }
}
