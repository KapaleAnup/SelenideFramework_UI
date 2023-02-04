package com.orangehrm;

public enum LeftMenuComponentType {

    ADMIN ( "Admin" ),
    PIM ( "PIM" ),
    LEAVE ( "Leave" );

    private String menuName;

    public final String getMenuName ( ) {
        return menuName;
    }

    LeftMenuComponentType ( String menuName ) {
        this.menuName = menuName;
    }
}
