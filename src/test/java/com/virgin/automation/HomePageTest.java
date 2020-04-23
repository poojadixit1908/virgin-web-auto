package com.virgin.automation;
import org.openqa.selenium.WebDriver;

import com.virgin.automation.pageobjects.HomePage;

public class HomePageTest {

    private static WebDriver driver;
    private static HomePage homePage;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Test
    public void testHomePage() {
        homePage.goToHomePage();
    }
}
