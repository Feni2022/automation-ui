package com.mavenit.ui.pageObjects;

import com.mavenit.ui.driver.DriverManager;
import com.mavenit.ui.utilis.NumberHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends DriverManager {


    public String selectAnySingleProduct(){
        List<WebElement> products = driver.findElements(By.cssSelector(".ProductCardstyles__Title-h52kot-12"));// it has all products list
        int productCount = products.size(); // 11
        int randomIndex = new NumberHelper().randomNumber(productCount);
        System.out.println("Random index is:" + randomIndex);
        String expected = products.get(randomIndex).getText(); // expected
        products.get(randomIndex).click(); // so everytime it will choose random index product
        sleep(3000);
        return expected;
    }

    public void selectCustomerRating(String choice){
        List<WebElement> ratingElements = driver.findElements(By.cssSelector(".RadioListstyles__Label-sc-1atiffa-5.iGLFSX"));
        for (WebElement ratingElement: ratingElements) {
            String rating = ratingElement.getText();
            if (rating.equalsIgnoreCase(choice)) {
                ratingElement.click();
                break;
            }
        }
        sleep(6000);
    }

    public List<Double> getAllCustomerRatings() {
        // checking product rating is >= 3 which is our choice
        List<Double> ratingLists = new ArrayList<Double>(); // > = 3
        List<WebElement> productRatings = driver.findElements(By.cssSelector("div[data-test='component-ratings']"));
        for (WebElement productRating : productRatings) {
            String ratingValue = productRating.getAttribute("data-star-rating"); // because in UI they haven't mentioned ratings
            double ratingInDouble = Double.parseDouble(ratingValue);
            ratingLists.add(ratingInDouble);
        }
        return ratingLists;
    }


}
