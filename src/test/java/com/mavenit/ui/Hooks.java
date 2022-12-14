package com.mavenit.ui;

import com.mavenit.ui.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private DriverManager driverManager = new DriverManager();
    @Before
    public void setUp() {
        driverManager.openBrowser();
        driverManager.maxBrowser();
        driverManager.navigateToURL();
        driverManager.acceptCookies();
    }

    @After
    public void tearDown(){
        driverManager.closeBrowser();
    }



}



