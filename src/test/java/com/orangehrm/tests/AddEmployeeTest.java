package com.orangehrm.tests;

import com.orangehrm.entity.EmployeeDetails;
import com.orangehrm.entity.InvalidLoginDetails;
import com.orangehrm.entity.ValidLoginDetails;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testdata.EmployeeTestData;
import com.orangehrm.testdata.LoginTestData;
import com.orangehrm.tests.base.TestSetup;
import org.junit.jupiter.api.Test;

class AddEmployeeTest extends TestSetup {

   private final EmployeeDetails employeeDetails = EmployeeTestData.getRandomEmployeeDeatils ();
    private final ValidLoginDetails loginDetails = LoginTestData.getValidLoginDetails ();
    private final InvalidLoginDetails invalidLoginDetails = LoginTestData.getInvalidLoginDetails ();

    @Test
     void testEmployee(){

        LoginPage.getInstance ().invalidLoginDetails (invalidLoginDetails)
                .loginToApplication (loginDetails)
                .navigateToEmployeeInformationPage ()
                .addNewEmployee (employeeDetails)
                .checkEmployeeCreatedSuccessefully ();
    }



}
