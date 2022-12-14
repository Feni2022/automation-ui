package com.mavenit.ui.pageObjects;

import com.mavenit.ui.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BasketPage extends DriverManager {

    public List<String> getAllProductsFromBasket() {
        List<WebElement> basket = driver.findElements(By.cssSelector("a[data-e2e='product-name']"));
        List<String> basketItems = new ArrayList<String>();  // actual
        for (WebElement webElement : basket) {
            String prooductName = webElement.getText();
            if (!prooductName.isEmpty()) {
                basketItems.add(prooductName);
            }
        }
        return basketItems;
    }

    public List<String> getAllProductsSkuFromBasket() {
        List<WebElement> basketSku = driver.findElements(By.cssSelector("span[data-e2e='product-sku']"));
        List<String> basketItems = new ArrayList<String>();  // actual
        for (WebElement webElement : basketSku) {
            String prooductSku = webElement.getText();
            if (!prooductSku.isEmpty()) {
                basketItems.add(prooductSku);
            }
        }
        return basketItems;
    }

    public double getPriceOfProductFromBasket() { // it is £14
        String priceInString = driver.findElement(By.cssSelector("span[data-e2e='product-line-price']"))
                .getText().replace("£", ""); // it will give only 14
        return Double.parseDouble(priceInString); // convert string into double
    }

    public void increaseQuantity(double noOfItems) {
        WebElement quantityElement = driver.findElement(By.cssSelector("select[data-e2e='product-quantity']"));
        Select select = new Select(quantityElement);
        select.selectByVisibleText(String.valueOf(noOfItems)); // convert double into String
    }

}



