package com.example.tests.tests;

import com.example.tests.model.UserFields;
import org.junit.Test;

import static com.example.tests.appmanager.AplicationManager.userCreateHelper;

public class UserModificationTest extends TastBase{
    @Test
    public void UserModification(){
        userCreateHelper.goToNewUser();
        userCreateHelper.createUserFields(new UserFields("Sveta2", "S2", "S2", "ck", "TYTYTY", "T", "Moscow", "2", "111111", "ss", "99999"));
        userCreateHelper.saveInfoUser();

    }
}
