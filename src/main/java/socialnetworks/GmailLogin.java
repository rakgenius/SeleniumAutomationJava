package socialnetworks;

import chromewebdriver.BaseWebDriver;
import java.util.concurrent.TimeUnit;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Data
@Builder
@Slf4j
public class GmailLogin extends BaseWebDriver {
    GmailLogin() {
        super();
    }

    public static void main(String[] args) {
        GmailLogin gmailLogin = GmailLogin.builder().build();
        WebDriver driver = gmailLogin.getWebDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signin");
        WebDriverWait wait=new WebDriverWait(driver, 5);
        driver.findElement(By.id("identifierId")).sendKeys("");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
}
