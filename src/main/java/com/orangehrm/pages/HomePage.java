package com.orangehrm.pages;

import com.codeborne.selenide.SelenideElement;
import com.orangehrm.LeftMenuComponentType;
import com.orangehrm.pages.pagecomponents.LeftMenuComponent;

public class HomePage {

   private LeftMenuComponent leftMenuComponent;

   public HomePage(){
       this.leftMenuComponent = new LeftMenuComponent ();
   }

    public LeftMenuComponent getLeftMenuComponent ( ) {
        return leftMenuComponent;
    }

    public EmployeeInformationPage navigateToEmployeeInformationPage(){
       this.leftMenuComponent.selectMenuFromLeftMenuBar ( LeftMenuComponentType.PIM );
       return new EmployeeInformationPage ();
    }

    public ConfigurePage navigateToConfigurePage(){
        this.leftMenuComponent.selectMenuFromLeftMenuBar ( LeftMenuComponentType.LEAVE );
         return new ConfigurePage ().addHolidays ();
    }

    public AdminPage navigateToAdminPage(){
       this.leftMenuComponent.selectMenuFromLeftMenuBar ( LeftMenuComponentType.ADMIN );
       return new AdminPage ();
    }
}
