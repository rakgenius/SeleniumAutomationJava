package chromewebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseWebDriver {
    private WebDriver webDriver;

    public BaseWebDriver() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        webDriver = new ChromeDriver();
    }

    // For future use where user can pass browser type
    public BaseWebDriver(String broswer) {
        // construct the driver based on the broswer type
    }

    public WebDriver getWebDriver() {
        return this.webDriver;
    }
}
