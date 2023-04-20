package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import java.net.URI;
import java.util.function.Predicate;

public class AuthTest extends BaseTest {

    @Test
    public void AuthTest(){
        var url = "https://authenticationtest.com/HTTPAuth/";
        var username = "user";
        var password = "pass";

        Predicate<URI> uriPredicate = uri -> uri.getHost().contains("authenticationtest.com");
        ((HasAuthentication) driver).register(uriPredicate, UsernameAndPassword.of(username, password));
        driver.get(url);
    }
}
