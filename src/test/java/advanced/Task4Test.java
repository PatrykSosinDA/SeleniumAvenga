package advanced;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.Duration;

public class Task4Test extends BaseTest {

    @Test
    void basicAjaxTest() {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='button00']")));

        WebElement startButton = driver.findElement(By.id("button00"));
        WebElement oneButton = driver.findElement(By.id("button01"));
        WebElement twoButton = driver.findElement(By.id("button02"));
        WebElement threeButton = driver.findElement(By.id("button03"));

        startButton.click();

        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(oneButton));
        oneButton.click();

        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(twoButton));
        twoButton.click();

        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(threeButton));
        threeButton.click();

        var buttonMessage = driver.findElement(By.id("buttonmessage"));
        assertEquals(buttonMessage.getText(), "All buttons clicked");

    }
}
