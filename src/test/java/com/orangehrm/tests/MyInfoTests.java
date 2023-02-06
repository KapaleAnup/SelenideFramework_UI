package com.orangehrm.tests;

import com.orangehrm.entity.ValidLoginDetails;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testdata.LoginTestData;
import com.orangehrm.tests.base.TestSetup;
import org.junit.jupiter.api.Test;

public class MyInfoTests extends TestSetup {

    private final ValidLoginDetails loginDetails = LoginTestData.getValidLoginDetails ();

    @Test
    public void addMyInfoDetailsTest(){
        LoginPage.getInstance ()
                .loginToApplication ( loginDetails )
                .navigateToMyInfoPage ().myDetails ();

    }
}
