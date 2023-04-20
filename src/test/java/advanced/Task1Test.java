package advanced;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.BasicAjaxPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test extends BaseTest {

    @Test
    void basicAjaxTest() {
        driver.manage().window().maximize();
        driver.get("https://testpages.herokuapp.com/styled/basic-ajax-test.html");

        BasicAjaxPage bap = new BasicAjaxPage(driver);
        bap.selectCategory("Desktop");
        bap.selectLanguage("C");
        bap.submitForm();

        assertEquals(bap.getIdElement() ,"2");
        assertEquals(bap.getLanguageIdElement(),"12");

        driver.quit();
    }
}