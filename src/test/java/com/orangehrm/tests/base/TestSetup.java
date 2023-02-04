package com.orangehrm.tests.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit5.ScreenShooterExtension;
import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.RegisterExtension;

import static com.codeborne.selenide.Selenide.open;

@ExtendWith (TextReportExtension.class)
public class TestSetup {

    @BeforeEach
    void setUp(){
        open ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

}
