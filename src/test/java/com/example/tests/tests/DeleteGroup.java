package com.example.tests.tests;

import org.junit.Test;

public class DeleteGroup extends TastBase {

  @Test
  public void testDeleteGroup() throws Exception {
    app.getNavigationHelper().goToGroup();
    selectGroup();
    deleteSelectedGroup();
    app.getNavigationHelper().goToGroup();

  }

}
