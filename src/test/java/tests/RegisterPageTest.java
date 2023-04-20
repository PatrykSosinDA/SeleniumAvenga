package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.RegisterPage;
import java.sql.Timestamp;

    public class RegisterPageTest extends BaseTest {

        @Test
        void RegisterPageTest(){
            driver.manage().window().maximize();
            driver.get("https://react-redux.realworld.io/#/register?_k=pjy2d1");

            RegisterPage regPage = new RegisterPage(driver);

            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            Long uniName = timestamp.getTime();
            String uniUsername = uniName.toString();

            regPage.setUsername(uniUsername);

            String uniEmail = "patryk.sosinski" + uniName + "@avenga.com";

            regPage.setEmail(uniEmail);
            regPage.setPassword("eVIq7NC9QKWfzHD");
            regPage.clickOnSignInButton();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='user-pic']")));

            driver.quit();
        }
}
