import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GridTest {
    @Test
    public void PersonnelOfficeLoginTest() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        WebDriver driver = new RemoteWebDriver(new URL("http://10.10.102.45:5555/wd/hub"), caps);
        driver.get("http://192.168.100.12:8080/po/login");
        driver.findElement(By.id("j_username")).sendKeys("admin");
        driver.findElement(By.id("j_password")).sendKeys("admin");
        driver.findElement(By.className("login_button")).click();
        driver.close();
    }
}

