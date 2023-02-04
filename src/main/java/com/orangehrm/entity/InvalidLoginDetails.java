package com.orangehrm.entity;

import lombok.Data;
import uk.co.jemos.podam.common.PodamStringValue;

@Data
public class InvalidLoginDetails {
    @PodamStringValue(strValue = "AdminTest")
    private String userName;

    @PodamStringValue(strValue = "admin123")
    private String password;
}
