package com.example.tests.tests;

import com.example.tests.appmanager.AplicationManager;
import com.example.tests.appmanager.GroupHelper;
import com.example.tests.model.UserFields;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.example.tests.appmanager.AplicationManager.wd;

public class TastBase {

    protected static WebDriver wd;
    protected final AplicationManager app = new AplicationManager();

    @BeforeClass
    public static void setUp() throws Exception {
        AplicationManager.init();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        AplicationManager.stop();
    }

    protected void deleteSelectedGroup() {
        wd.findElement(By.name("delete")).click();
    }

    protected void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }

    }

