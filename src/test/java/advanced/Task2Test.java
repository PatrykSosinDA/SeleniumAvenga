package advanced;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task2Test extends BaseTest {

    @Test
    void basicAjaxTest() {
        driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
        //[{"imię": "Bob", "wiek" : 20}, {"imię": "George", "wiek" : 42}, {"imię": "Jan", "wiek" : 7} ]
        WebElement showTable = driver.findElement(By.xpath("//summary"));
        showTable.click();

        WebElement textArea = driver.findElement(By.xpath("//textarea[@id='jsondata']"));
        textArea.clear();
        textArea.click();
        textArea.sendKeys("[{\"imię\": \"Bob\", \"wiek\" : 20}, {\"imię\": \"George\", \"wiek\" : 42}, {\"imię\": \"Jan\", \"wiek\" : 7} ]");

        WebElement buttonRefresh = driver.findElement(By.xpath("//button[@id='refreshtable']"));
        buttonRefresh.click();

        WebElement table = driver.findElement(By.xpath("//table[@id='dynamictable']"));
        List<WebElement> tableValue = table.findElements(By.xpath("./tr"));
        int numberTableValue = tableValue.size();
        if (numberTableValue != 4) {
            System.out.println("Tabela ma za mało wartości " + numberTableValue);
        }
    }
}
