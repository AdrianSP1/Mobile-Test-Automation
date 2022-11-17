package com.crowdar.examples.validates;

import com.crowdar.examples.services.SettingService;
import org.testng.asserts.SoftAssert;

public class SettingValidate {
    static SoftAssert softAssert= new SoftAssert();
    public static void verificarDarkModeActivado(){
        softAssert.assertEquals(SettingService.getTextDarkmode(),"ON");
    }
}
