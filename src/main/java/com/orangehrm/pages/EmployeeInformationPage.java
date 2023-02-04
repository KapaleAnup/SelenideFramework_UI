package com.orangehrm.pages;


import com.codeborne.selenide.SelenideElement;
import com.orangehrm.entity.EmployeeDetails;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class EmployeeInformationPage {

    private static final SelenideElement ADD_EMPLOYEE_BUTTON = $(byTagAndText ( "a","Add Employee" ));
    private static final SelenideElement FIRST_NAME = $(byName ( "firstName" ));
    private static final SelenideElement LAST_NAME = $(byName ( "lastName" ));
    private static final SelenideElement MIDDLE_NAME = $(byName ( "middleName" ));
    private static final SelenideElement UPLOAD_IMAGE = $(byAttribute ( "type","file"));
    private static final SelenideElement SAVE_BUTTON = $(byText ( "Save" ));
    private static final SelenideElement SUCCESS_MESSAGE = $$(byText ( "Success" )).first ();




            /*
            Employee Information have been added.
           */
    public EmployeeInformationPage addNewEmployee( EmployeeDetails employee ){
        ADD_EMPLOYEE_BUTTON.shouldBe ( visible ).click ();
        FIRST_NAME.shouldBe ( visible ).setValue (employee.getFirstName ());
        MIDDLE_NAME.shouldBe ( visible ).setValue ( employee.getMiddleName () );
        LAST_NAME.shouldBe ( visible ).setValue (employee.getLastName () );

        UPLOAD_IMAGE.shouldBe ( enabled ).uploadFromClasspath ( employee.getProfilePicturePath () );
        SAVE_BUTTON.shouldBe ( enabled ).click ();
        return this;
    }

    public void checkEmployeeCreatedSuccessefully(){
    SUCCESS_MESSAGE.shouldHave ( visible,text ( "Success" ));
    }
}
