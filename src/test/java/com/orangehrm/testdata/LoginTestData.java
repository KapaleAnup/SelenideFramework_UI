package com.orangehrm.testdata;

import com.orangehrm.entity.InvalidLoginDetails;
import com.orangehrm.entity.ValidLoginDetails;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class LoginTestData {
    private static final PodamFactory FACTORY = new PodamFactoryImpl (  );
    private LoginTestData(){

    }

    public static ValidLoginDetails getValidLoginDetails(){
        return FACTORY.manufacturePojo ( ValidLoginDetails.class );
    }

    public static InvalidLoginDetails getInvalidLoginDetails(){
        return FACTORY.manufacturePojo ( InvalidLoginDetails.class );
    }
}
