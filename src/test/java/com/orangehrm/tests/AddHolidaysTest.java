package com.orangehrm.tests;

import com.orangehrm.entity.ValidLoginDetails;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testdata.LoginTestData;
import com.orangehrm.tests.base.TestSetup;
import org.junit.jupiter.api.Test;

public class AddHolidaysTest extends TestSetup {
    private final ValidLoginDetails loginDetails = LoginTestData.getValidLoginDetails ();
    @Test
    void addHolidays(){
        LoginPage.getInstance ()
                .loginToApplication ( loginDetails )
                .navigateToConfigurePage ().addHolidays ();
    }
}
