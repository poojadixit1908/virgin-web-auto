package com.virgin.automation.pageobjects;

import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void goToHomePage(){
        driver.get("https://www.virginaustralia.com/au/en/");
    }
}
