package com.example.tests.appmanager;

import com.example.tests.model.UserFields;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UserCreateHelper {

    public static WebDriver wd;

    public UserCreateHelper(ChromeDriver wd) {

        this.wd = wd;


    }


        public void createUserFields(UserFields userFields) {
            wd.findElement(By.xpath("//a[text()='add new']")).click();
            wd.findElement(By.name("firstname")).click();
            wd.findElement(By.name("firstname")).clear();
            wd.findElement(By.name("firstname")).sendKeys(userFields.getFirstname());
            wd.findElement(By.name("middlename")).click();
            wd.findElement(By.name("middlename")).clear();
            wd.findElement(By.name("middlename")).sendKeys(userFields.getMiddlname());
            wd.findElement(By.name("lastname")).click();
            wd.findElement(By.name("lastname")).clear();
            wd.findElement(By.name("lastname")).sendKeys(userFields.getLastname());
            wd.findElement(By.name("theform")).click();
            wd.findElement(By.name("nickname")).click();
            wd.findElement(By.name("nickname")).clear();
            wd.findElement(By.name("nickname")).sendKeys(userFields.getNickname());
            wd.findElement(By.name("title")).click();
            wd.findElement(By.name("title")).clear();
            wd.findElement(By.name("title")).sendKeys(userFields.getTitle());
            wd.findElement(By.name("company")).click();
            wd.findElement(By.name("company")).clear();
            wd.findElement(By.name("company")).sendKeys(userFields.getCompany());
            wd.findElement(By.name("address")).click();
            wd.findElement(By.name("address")).clear();
            wd.findElement(By.name("address")).sendKeys(userFields.getAddree());
            wd.findElement(By.name("home")).click();
            wd.findElement(By.name("home")).clear();
            wd.findElement(By.name("home")).sendKeys(userFields.getHome());
            wd.findElement(By.name("mobile")).click();
            wd.findElement(By.name("mobile")).clear();
            wd.findElement(By.name("mobile")).sendKeys(userFields.getMobile());
            wd.findElement(By.name("work")).click();
            wd.findElement(By.name("work")).clear();
            wd.findElement(By.name("work")).sendKeys(userFields.getWork());
            wd.findElement(By.name("fax")).click();
            wd.findElement(By.name("fax")).clear();
            wd.findElement(By.name("fax")).sendKeys(userFields.getFax());
        }
    }

