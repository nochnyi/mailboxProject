package com.company.Helpers;

import com.company.Pages.BasePage;
import org.openqa.selenium.WebDriver;

import javax.xml.bind.annotation.W3CDomHandler;

public class CommonHelper extends BasePage {

    public void closeApp() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}

