package com.mavenit.ui.driver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    public static WebDriver driver;

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public void maxBrowser() {
        driver.manage().window().maximize();
    }
    public void navigateToURL() {
        driver.get("https://www.argos.co.uk");
    }
    public void acceptCookies(){
        driver.findElement(By.className("button")).click();
    }
    public void closeBrowser() {
        driver.quit();
    }
    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void takesScreenShort() {

    }

    public void waits() {

    }

}
