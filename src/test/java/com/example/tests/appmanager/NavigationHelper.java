package com.example.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper {
    private static WebDriver wd;

    public NavigationHelper(ChromeDriver wd) {
this.wd = wd;
    }

    public void goToGroup() {
     wd.findElement(By.linkText("groups")).click();
    }
}
