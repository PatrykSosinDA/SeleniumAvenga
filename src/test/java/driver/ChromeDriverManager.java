package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager {
    @Override
    protected WebDriver createDriver() {

        return new ChromeDriver(getChromeOptions());
    }
    private ChromeOptions getChromeOptions() {

        return new ChromeOptions();
    }
}
