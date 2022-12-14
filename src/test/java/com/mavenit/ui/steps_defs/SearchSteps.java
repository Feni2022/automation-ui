package com.mavenit.ui.steps_defs;

import com.mavenit.ui.pageObjects.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SearchSteps {
    private HomePage homePage = new HomePage();

    @And("^I search for a product \"([^\"]*)\"$")
    public void iSearchForAProduct(String searchTerm) {
        homePage.doSearch(searchTerm);
    }

    @Then("^I should be able to see the respective products$")
    public void i_should_be_able_to_see_the_respective_products(){

    }
}
