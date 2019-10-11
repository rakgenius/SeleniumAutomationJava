package socialnetworks;

import chromewebdriver.BaseWebDriver;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Data
@Builder
@Slf4j
public class FacebookLogin extends BaseWebDriver {
    FacebookLogin() {
        super();
    }
    public static void main(String[] args) {
        FacebookLogin facebookLogin = FacebookLogin.builder().build();
        WebDriver driver = facebookLogin.getWebDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

        WebElement userName = driver.findElement(By.id("email"));
        userName.sendKeys("");

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("");

        WebElement loginButton = driver.findElement(By.id("loginbutton"));
        loginButton.click();

        // signup
//        String name = "firstname";
//        WebElement firstName = driver.findElement(By.name(name));
//        firstName.sendKeys("");
//
//        WebElement lastName = driver.findElement(By.name("lastname"));
//        lastName.sendKeys("");

    }
}
