package com.mavenit.ui.steps_defs;

import com.mavenit.ui.pageObjects.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class Common {
    private HomePage homePage = new HomePage();
    @Given("^I am on homepage$")
    public void i_am_on_homepage() {

    }

}
