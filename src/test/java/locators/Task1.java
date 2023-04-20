package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void main(String[] args) {
        String url = "https://the-internet.herokuapp.com/challenging_dom";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get(url);

        WebElement scriptForCanvas = driver.findElement(By.xpath("//script[contains(text(), 'Answer')]"));
        String scriptText = scriptForCanvas.getAttribute("innerHTML");

        String patternString = "Answer: (\\d+)";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(scriptText);

        if (matcher.find())
        {
            System.out.println(matcher.group(0));
        }

        List<WebElement> actualHeaders = driver.findElements(By.xpath("//th"));
        List<String> expectedHeaders = List.of("Lorem", "Ipsum", "Dolor", "Sit", "Amet", "Diceret", "Action");
        boolean areHeadersEqual = validateHeaders(expectedHeaders, actualHeaders);
        System.out.println(areHeadersEqual);
    }

    public static boolean validateHeaders(List<String> expectedHeaders, List<WebElement> actualHeaders){
        List<String> headersText = actualHeaders
                .stream()
                .map(WebElement::getText)
                .toList();
        System.out.println(headersText);
        return true;
    }
}