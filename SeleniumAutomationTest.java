package com.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.test.selenium.page.WDPage;


public class SeleniumAutomationTest {
	private WebDriver driver;
    private WDPage wdPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        wdPage = new WDPage(driver);
    }

    @Test
    public void testCountryFilter() {
        wdPage.navigateToURL("https://viewpoint.glasslewis.com/WD/?siteId=DemoClient");
        wdPage.selectCountryFilter("Belgium");
        assertEquals(String wdPage, String "Belgium" );
    }

    @Test
    public void testCompanyNameLink() {
        wdPage.navigateToURL("https://viewpoint.glasslewis.com/WD/?siteId=DemoClient");
        wdPage.clickCompanyNameLink("Activision Blizzard Inc");
        assertEquals(String wdPage, String "Activision Blizzard Inc" );
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}
