//package com.mavenit.ui;
//
//import com.mavenit.ui.pageObjects.BasketPage;
//import com.mavenit.ui.pageObjects.HomePage;
//import com.mavenit.ui.pageObjects.ProductDescPage;
//import com.mavenit.ui.pageObjects.ResultsPage;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.List;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.*;
//
//public class RegressionTestSuite extends Hooks {
//    private HomePage homePage= new HomePage();
//    private ResultsPage resultsPage = new ResultsPage();
//    private ProductDescPage productDescPage = new ProductDescPage();
//    private BasketPage basketPage = new BasketPage();
//
//
//    // ADD to basket Test
//    @Test
//    public void addToBasketTest() {
//        homePage.doSearch("nike"); // 1 from Locators class mentioned methods // homepage
//        String expected = resultsPage.selectAnySingleProduct(); //2 // resultspage
//        productDescPage.addProductToBasket(); //3 //productdescspage
//        productDescPage.goToBasket(); //4 // same as above page
//        List<String> actualList = basketPage.getAllProductsFromBasket(); //5 //basketpage
//        // JunitStyle Assertion
//        for (String actual : actualList) {
//            Assert.assertEquals(expected, actual);
//        }
//        // HamcrestStyle Assertion
//        assertThat(actualList, hasItem(expected));
//    }
//
//    @Test
//    public void customerReviewTest() {
//
//        String choice = "3or more";
//        homePage.doSearch("nike"); //1
//        resultsPage.selectCustomerRating(choice); //6
//        List<Double> actualList = resultsPage.getAllCustomerRatings(); //7
//        // 5.005, 4.80, 3.84
//        // Junit Style Assertion
//        for (Double actual : actualList) {
//            boolean condition = actual > 3.0;
//            Assert.assertTrue(condition);
//        }
//        // HamcrestStyle Assertion
//        assertThat(actualList, everyItem(greaterThanOrEqualTo(3.0)));
//    }
//
//    @Test
//    public void quantityTest() {
//        double quantity = 2;
//        homePage.doSearch("nike");
//        resultsPage.selectAnySingleProduct();
//        productDescPage.addProductToBasket();
//        productDescPage.goToBasket();
//        // get the price for 1
//        // increase quantity
//        // get the price again
//        // assert
//        double singleProductPrice = basketPage.getPriceOfProductFromBasket(); //1
//        double expected = singleProductPrice * quantity;
//        basketPage.increaseQuantity(quantity);//2
//        double actual = basketPage.getPriceOfProductFromBasket();//3
//        assertThat(expected, is(equalTo(actual))); //4
//    }
//
//    @Test
//    public void productSkuTest() {
//        homePage.doSearch("nike");
//        resultsPage.selectAnySingleProduct();
//        String expected = productDescPage.getProductSku();
//        productDescPage.addProductToBasket();
//        productDescPage.goToBasket();
//        List<String> actual = basketPage
//                .getAllProductsSkuFromBasket();
//        System.out.println(actual);
//        assertThat(actual, hasItem(expected));
//    }
//
//
//}
