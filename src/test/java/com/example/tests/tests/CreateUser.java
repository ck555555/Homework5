package com.example.tests.tests;

import com.example.tests.model.UserFields;
import org.junit.Test;


import static com.example.tests.appmanager.AplicationManager.userCreateHelper;

public class CreateUser  extends TastBase {
  @Test
  public void testUntitledTestCase() throws Exception {
    userCreateHelper.createUserFields(new UserFields("Sveta", "S", "S", "ck", "TYTYTY", "T", "Moscow", "2", "111111", "ss", "99999"));

  }

}
