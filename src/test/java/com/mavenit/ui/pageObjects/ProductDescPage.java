package com.mavenit.ui.pageObjects;

import com.mavenit.ui.driver.DriverManager;
import org.openqa.selenium.By;

public class ProductDescPage extends DriverManager {


    public void addProductToBasket(){
        driver.findElement(By.cssSelector("button[data-test='add-to-trolley-button-button'")).click();
        sleep(3000);
    }

    public void goToBasket(){
        driver.findElement(By.cssSelector("a[data-test='component-att-button-basket']")).click();
        sleep(3000);
    }

    public String getProductSku() {
        return driver.findElement(By.cssSelector("span[data-test='product-name-catNumber']")).getText();

    }
}
