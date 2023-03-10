package com.orangehrm.pages;

import com.codeborne.selenide.SelenideElement;
import com.orangehrm.LeftMenuComponentType;
import com.orangehrm.pages.pagecomponents.LeftMenuComponent;

/*
HOME PAGE WILL BE ACT AS A MIDDLEWARE
 */
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

    public MyInfo navigateToMyInfoPage(){
       this.leftMenuComponent.selectMenuFromLeftMenuBar ( LeftMenuComponentType.MYINFO );
       return new MyInfo ();
    }
}
