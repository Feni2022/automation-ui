package com.mavenit.ui.pageObjects;

import com.mavenit.ui.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends DriverManager {


    public void doSearch(String item) {
        driver.findElement(By.cssSelector("._1Rz0y")).sendKeys("item");
        driver.findElement(By.cssSelector("._1Rz0y")).sendKeys(Keys.ENTER);
    }
}

