package com.mavenit.ui;

//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class JunitDemo {
//    public static WebDriver driver;
//
//    @Before
//    public void setUp() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://www.asda.com");
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
//
//
//    }
//
//  //  @After
//    public void tearDown() {
//        driver.quit();
//    }
//
//    @Test
//    public void searchTest() {  // method should be in camelcasing
//         WebElement searchBox = driver.findElement(By.className("search-input"));
//         searchBox.sendKeys("toys");
//         searchBox.sendKeys(Keys.ENTER);
//
//
//
//    }
//    @Test
//    public void basketTest() {
//        // Test & Execution
//        // Verification or Assertion
//        System.out.println("basket test");
//
//    }
//
//
//}
