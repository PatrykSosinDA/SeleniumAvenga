package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v109.performance.Performance;
import org.openqa.selenium.devtools.v109.performance.model.Metric;
import pages.GramWelcomePage;
import java.util.List;
import java.util.Optional;

public class MetricsTest extends BaseTest {

    @Test
    void MetricsTest(){
        driver.manage().window().maximize();
        driver.get("https://www.gram.pl/");

        GramWelcomePage gramWelcomePage = new GramWelcomePage(driver);

        List<Metric> metricList;
        DevTools devTools = ((HasDevTools) driver).getDevTools();
        devTools.createSession();
        devTools.send(Performance.enable(Optional.empty()));

        gramWelcomePage.clickEncyklopediaTab();
        gramWelcomePage.clickGramtvTab();

        metricList = devTools.send(Performance.getMetrics());

        for(Metric m : metricList) {
            System.out.println(m.getName() + " = " + m.getValue());
        }

        driver.quit();
    }
}
