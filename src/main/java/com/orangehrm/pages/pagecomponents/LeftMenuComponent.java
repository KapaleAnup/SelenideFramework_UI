package com.orangehrm.pages.pagecomponents;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.orangehrm.LeftMenuComponentType;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.*;

public class LeftMenuComponent {

    private static final String MENU_NAME = "%s";

    public void selectMenuFromLeftMenuBar( LeftMenuComponentType menuType){
        $(byText ( menuType.getMenuName () )).shouldBe (enabled ).click ();
    }
}
