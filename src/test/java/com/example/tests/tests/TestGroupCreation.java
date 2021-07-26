package com.example.tests.tests;

import com.example.tests.model.GroupData;
import org.junit.Test;

public class TestGroupCreation extends TastBase {

  @Test
  public void testCreatoin() throws Exception {
    app.getNavigationHelper().goToGroup();
    app.getGroupHelper().initGroupCreation("new");
    app.getGroupHelper().fillGroupForm(new GroupData("TestGroup3", "Test", "Test"));
    app.getGroupHelper().sabmitGroupCreation();
    app.getNavigationHelper().goToGroup();
    app.getGroupHelper().reternToGroupPage();
  }

}
