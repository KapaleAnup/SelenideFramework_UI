package com.orangehrm.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.*;

public class ConfigurePage {

    private static final SelenideElement CONFIGURE_BUTTON = $(byText ( "Configure" ));
    private static final SelenideElement HOLIDAYS_BUTTON =$(byXpath ("//a[normalize-space()='Holidays']" ));
    private static final SelenideElement ADD_BUTTON = $(byXpath ("//button[normalize-space()='Add']"));
    private static final SelenideElement HOLIDAY_NAME = $(byXpath ( "(//input)[2]"));
    private static final SelenideElement CALENDAR_DATE= $(byXpath ( "//input[@placeholder='yyyy-mm-dd']" ));
    private static final SelenideElement SAVE_BUTTON = $(byText ( "Save" ));

    public ConfigurePage addHolidays(){
        CONFIGURE_BUTTON.shouldBe ( enabled ).click ();
        HOLIDAYS_BUTTON.shouldBe ( enabled ).click ();
        ADD_BUTTON.shouldBe ( enabled, Duration.ofSeconds ( 3000 ) ).click ();
        HOLIDAY_NAME.shouldBe ( visible ).setValue ( "Personal" );
        CALENDAR_DATE.shouldBe ( visible ).setValue ( "2023-01-31" );
        SAVE_BUTTON.shouldBe ( enabled ).click ();

        return this;
    }

}
