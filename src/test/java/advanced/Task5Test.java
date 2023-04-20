package advanced;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task5Test extends BaseTest {

    @Test
    void basicAjaxTest() {
        driver.get("https://testpages.herokuapp.com/styled/file-upload-test.html");
        WebElement fileInput = driver.findElement(By.id("fileinput"));
        WebElement imageRadioButton = driver.findElement(By.id("itsanimage"));
        WebElement uploadButton = driver.findElement(By.name("upload"));
        String pathToFile = "C:\\Users\\patryk.sosinski\\Downloads\\Cat.jpg";

        fileInput.sendKeys(pathToFile);
        imageRadioButton.click();
        uploadButton.click();
        WebElement uploadedFilename = driver.findElement(By.id("uploadedfilename"));
        Assertions.assertEquals("Cat.jpg", uploadedFilename.getText());

    }
}
