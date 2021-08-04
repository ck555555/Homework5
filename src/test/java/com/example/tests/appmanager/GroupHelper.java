package com.example.tests.appmanager;

import com.example.tests.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupHelper {
    private static WebDriver wd;

    public GroupHelper(ChromeDriver wd) {
        this.wd = wd;
    }

    public void returnToGroupPage() {
      wd.findElement(By.linkText("Logout")).click();
    }

    public void sabmitGroupCreation() {
      wd.findElement(By.name("submit")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        type(groupData, "group_name");
        type(groupData);
        if(groupData.getFooter()!= null){
            wd.findElement(By.name("group_footer")).click();
            wd.findElement(By.name("group_footer")).clear();
            wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
        }
    }


    ///ПОДУМАТЬ
    public void type(By locator, String text) {
        if( text!= null) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }};
   // type(By.name("group_header"), groupData.getHeader());





    private void type(GroupData groupData) {
        if (groupData.getHeader() != null) {
            wd.findElement(By.name("group_header")).click();
            wd.findElement(By.name("group_header")).clear();
            wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        }
    }

    private void type(GroupData groupData, String locator) {
        if(groupData.getName()!=null){
            wd.findElement(By.name(locator)).click();

            wd.findElement(By.name(locator)).clear();

            wd.findElement(By.name(locator)).sendKeys(groupData.getName());
        }}

    public static void initGroupCreation(String s) {
      wd.findElement(By.name(s)).click();
    }

    protected void deleteSelectedGroup() {
        GroupHelper.wd.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        GroupHelper.wd.findElement(By.name("selected[]")).click();
    }

    public void initGroupModification() {
        GroupHelper.wd.findElement(By.name("edit")).click();
    }

    public void submitGroupModification() {
        GroupHelper.wd.findElement(By.name("update")).click();
    }
}
