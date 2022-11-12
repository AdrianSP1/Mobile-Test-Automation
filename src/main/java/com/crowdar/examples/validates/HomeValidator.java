package com.crowdar.examples.validates;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.asserts.SoftAssert;

public class HomeValidator {
    static SoftAssert softAssert= new SoftAssert();
    public static void verificarEscenarioCreado(){
        String Hoy= MobileActionManager.getText(HomeConstants.ENTRY_CREATE);
        softAssert.assertEquals(Hoy,"Hoy","No se creo la entrada");
    }
}
