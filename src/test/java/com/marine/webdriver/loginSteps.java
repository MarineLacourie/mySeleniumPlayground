package com.marine.webdriver;

//login: marine.lacourie@hotmail.fr
//password: test@test

//TODO:
//        login.feature
//        loginPage.java
//        loginSteps

import pageObjects.homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class loginSteps {

    @Before
    public void openWebsite() {
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("https://www.foodpanda.sg/");
        assertTrue("This title should be Best food delivery in Singapore", driver.getTitle().startsWith("Best food delivery in Singapore"));
    }

    @Given("^I am on the homepage of the website")
    public void i_am_on_the_homepage_of_the_website() {
        assertTrue(homePage.homePageHeadline.startsWith("Food Delivery just got faster"));

    }
}



//driver.findElement(By.linkText("Log in or Sign up")).click();
//
//        driver.close();
//        driver.quit();