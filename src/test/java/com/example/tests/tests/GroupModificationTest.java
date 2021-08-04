package com.example.tests.tests;

import com.example.tests.model.GroupData;
import org.junit.Test;
import org.openqa.selenium.By;

public class GroupModificationTest extends TastBase {
    @Test
    public void testGroupModification (){
        GroupData groupData = new GroupData("TestGroup22", null, null);

        app.getNavigationHelper().goToGroup();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().type(By.name("group_header"), groupData.getHeader());
        app.getGroupHelper().fillGroupForm(groupData);
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
