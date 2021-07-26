package com.example.tests.tests;

import com.example.tests.model.GroupData;
import org.junit.Test;

public class GroupModificationTest extends TastBase {
    @Test
    public void testGroupModification (){
        app.getNavigationHelper().goToGroup();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("TestGroup22", "Test22", "Test2"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().reternToGroupPage();
    }
}
