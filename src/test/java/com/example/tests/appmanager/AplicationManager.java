package com.example.tests.appmanager;

import com.example.tests.model.UserFields;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AplicationManager {
    public static WebDriver wd;

    public static SesionHelper sesionHelper;
    public static UserCreateHelper userCreateHelper;
    public static StringBuffer verificationErrors = new StringBuffer();
    public static NavigationHelper navigationHelper;
    public static GroupHelper groupHelper;
    public String baseUrl = "https://www.google.com/";
    public boolean acceptNextAlert = true;

    public static void init() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/birthdays.php");
        groupHelper = new GroupHelper((ChromeDriver) wd);
        navigationHelper = new NavigationHelper((ChromeDriver) wd);
        userCreateHelper = new UserCreateHelper((ChromeDriver) wd);
        // userCreateHelper.createUserFields("Sveta", "S", "S", "ck", "TYTYTY", "T", "Moscow", "2", "111111", "ss", "99999");
        sesionHelper = new SesionHelper((ChromeDriver) wd);
        sesionHelper.Login("admin", "secret");
    }



    public static void stop() {
        wd.quit();
    }

    public boolean isElementPresent(By by) {
      try {
       wd.findElement(by);
        return true;
      } catch (NoSuchElementException e) {
        return false;
      }
    }

    public boolean isAlertPresent() {
      try {
        wd.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
