package com.orangehrm.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class AdminPage {

    private static final SelenideElement USER_MANAGEMENT_TAB = $(byText ( "User Management " ));
    private static final SelenideElement USERS_TAB = $(byText ( "Users" ));
    private static final SelenideElement ADD_BUTTON = $(byText ( " Add " ));
   // private static final ElementsCollection USER_ROLE_DROPDOWN =$$(byClassName ( "oxd-icon bi-caret-down-fill oxd-select-text--arrow" ));


    public AdminPage addUserDetails(){
        ADD_BUTTON.shouldBe ( enabled ).click ();
        //USER_ROLE_DROPDOWN.listIterator ( 2 );
        return this;
    }

}
