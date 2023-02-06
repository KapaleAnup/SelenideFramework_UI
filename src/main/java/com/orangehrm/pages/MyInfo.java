package com.orangehrm.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.SelenideElement;
import com.orangehrm.entity.InvalidLoginDetails;
import com.orangehrm.entity.ValidLoginDetails;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class MyInfo {
    private static final SelenideElement FIRST_NAME= $(byName ( "firstName" ));
    private static final SelenideElement MIDDLE_NAME= $(byName ( "middleName" ));
    private static final SelenideElement LAST_NAME= $(byName ( "lastName" ));
    private static final SelenideElement EMPLOYEE_ID= $(byXpath ( "(//input[@class='oxd-input oxd-input--active'])[3]" ));
    private static final SelenideElement OTHER_ID= $(byXpath ( "(//input[@class='oxd-input oxd-input--active'])[4]" ));
    private static final SelenideElement DRIVER_LICENSE_NUMBER= $(byXpath ( "(//input[@class='oxd-input oxd-input--active'])[5]" ));
    private static final SelenideElement LICENSE_EXPIRY_DATE =$(byAttribute ( "placeholder","yyyy-mm-dd" ));
    private static final SelenideElement SAVE_BUTTON = $(byText ( "Save" ));


    public MyInfo myDetails(){
        FIRST_NAME.shouldBe ( visible ).setValue ( "Admin" );
        MIDDLE_NAME.shouldBe ( visible ).setValue ( "Test" );
        LAST_NAME.shouldBe ( visible ).setValue ( "User" );
        EMPLOYEE_ID.shouldBe ( visible ).setValue ( "TST009" );
        OTHER_ID.shouldBe ( visible ).setValue ( "TSF000" );
        DRIVER_LICENSE_NUMBER.shouldBe ( visible ).setValue ( "TEST990999" );
        LICENSE_EXPIRY_DATE.shouldBe ( visible ).setValue ( "2025-11-29" );
        SAVE_BUTTON.shouldBe ( enabled ).click ();
        return this;
    }

}
