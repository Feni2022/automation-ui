package com.mavenit.ui.steps_defs;

import com.mavenit.ui.pageObjects.BasketPage;
import com.mavenit.ui.pageObjects.ProductDescPage;
import com.mavenit.ui.pageObjects.ResultsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class BasketSteps {
    // we have written selenium code for this under different pages in pageObjects
    private ResultsPage resultsPage = new ResultsPage();
    private ProductDescPage productDescPage = new ProductDescPage();
    private BasketPage basketPage = new BasketPage();
    private  String expected; // change local to global by defining here

    @When("^I select any product$")
    public void i_select_any_product() {
        expected = resultsPage.selectAnySingleProduct();
    }

    @When("^I add product to basket$")
    public void i_add_product_to_basket() {
        productDescPage.addProductToBasket();

    }

    @When("^I go to basket$")
    public void i_go_to_basket() {
        productDescPage.goToBasket();

    }

    @Then("^I should be able to see product in basket$")
    public void i_should_be_able_to_see_product_in_basket() {
        List<String> actualList = basketPage.getAllProductsFromBasket();
        assertThat(actualList, hasItem(expected));
    }

}
