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


    private static final SelenideElement JOB_TAB = $(byText ( "Job " ));
    private static final SelenideElement JOB_TITLES_TAB = $(byText ( "Job Titles" ));
    private static final SelenideElement JOB_ADD_BUTTON = $(byText ( " Add " ));
    private static final SelenideElement ENTER_JOBTITLE= $(byXpath ( "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']" ));

        /*
         Add user details function will help to add new users into the system.
         */
    public AdminPage addUserDetails(){
        ADD_BUTTON.shouldBe ( enabled ).click ();
        //USER_ROLE_DROPDOWN.listIterator ( 2 );
        return this;
    }

    /*
    New function has been created to handle job related details.
     */
    public void addJobDetails(){
        JOB_TAB.shouldBe ( enabled ).click ();
        JOB_TITLES_TAB.shouldBe ( enabled ).click ();
        JOB_ADD_BUTTON.shouldBe ( enabled ).click ();
        ENTER_JOBTITLE.shouldBe ( visible ).setValue ( "Software Testing" );
    }

}
