package com.orangehrm.pages;

import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.SelenideElement;
import com.orangehrm.entity.InvalidLoginDetails;
import com.orangehrm.entity.ValidLoginDetails;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private LoginPage(){

    }
   public static LoginPage getInstance(){
        return new LoginPage ();
   }
    private static final SelenideElement USERNAME =  $(byName( "username" ));
    private static final SelenideElement PASSWORD =  $(byName( "password" ));
    private static final SelenideElement LOGIN_BUTTON =  $("[type='submit']");
    private static final SelenideElement INVALID_CREDENTIALS_ERROR_MESSAGE =$(byText ( "Invalid credentials" ));

    public LoginPage invalidLoginDetails( InvalidLoginDetails invalidLoginDetails ){
        USERNAME.shouldBe ( visible ).setValue ( invalidLoginDetails.getUserName ());
        PASSWORD.shouldBe ( visible ).setValue ( invalidLoginDetails.getPassword () );
        LOGIN_BUTTON.shouldBe ( enabled ).click ();
     INVALID_CREDENTIALS_ERROR_MESSAGE.shouldBe ( visible );
     return new LoginPage ();
    }


    public HomePage loginToApplication( ValidLoginDetails loginDetails ){
        USERNAME.shouldBe ( visible ).setValue ( loginDetails.getUserName ());
        PASSWORD.shouldBe ( visible ).setValue ( loginDetails.getPassword () );
        LOGIN_BUTTON.shouldBe ( enabled ).click ();
        return new HomePage ();
    }

}
