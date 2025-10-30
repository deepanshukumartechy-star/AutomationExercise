package test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticeShadowDom {


    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
            driver.get("chrome://downloads/");
            WebElement mainRoot = driver.findElement(By.cssSelector("downloads-manager"));
            System.out.println(mainRoot );
            SearchContext shadowRoot1 = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", mainRoot);
            WebElement root2 = shadowRoot1.findElement(By.cssSelector("downloads-toolbar"));
            SearchContext shadowRoot2 = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", root2);
            WebElement root3 = shadowRoot2.findElement(By.cssSelector("cr-toolbar"));
            SearchContext shadowRoot3 = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", root3);
            WebElement root4 = shadowRoot3.findElement(By.cssSelector("cr-toolbar-search-field"));
            SearchContext shadowRoot4 = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", root4);
            shadowRoot4.findElement(By.cssSelector("#searchInput")).sendKeys("Random");
    }
}