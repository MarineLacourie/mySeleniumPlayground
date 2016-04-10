package com.marine.webdriver;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginTest {

    @Test
    public void openWebsite(){
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("https://www.challenger.com.sg/");
        Assert.assertTrue("This title should be Challenger Singapore", driver.getTitle().startsWith("Challenger Singapore"));

            

        driver.close();
        driver.quit();
    }
}
