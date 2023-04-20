package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserConfig {
    Properties properties = new Properties();
    private String browserName; // TODO: dodaj getter
    private String width;
    private String height;

    public String getBrowserName(){
        return browserName.toLowerCase();
    }
    public BrowserConfig() {
        String confFile = Thread.currentThread().getContextClassLoader().getResource("app.properties").getPath();
        try {
            properties.load(new FileInputStream(confFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
// read file
        this.browserName = properties.getProperty("browser");
        this.height = properties.getProperty("height");
        this.width = properties.getProperty("width");


        System.out.println("Browser set to: " + browserName);
        System.out.println(properties);

    }
}
