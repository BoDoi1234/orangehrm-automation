package com.orangehrm.demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestFirstSeleniumWebDriver {
    static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        ChromeDriver chromeDriver = new ChromeDriver(); // Open browser(chrome)
        chromeDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // Access website address (google)

        chromeDriver.quit();
    }
}