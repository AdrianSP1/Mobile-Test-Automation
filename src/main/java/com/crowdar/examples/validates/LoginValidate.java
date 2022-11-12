package com.crowdar.examples.validates;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.asserts.SoftAssert;
import static com.crowdar.core.actions.ActionManager.isVisible;

public class LoginValidate {
    static SoftAssert softAssert = new SoftAssert();

    public static void checkEntry(){
        MobileActionManager.waitVisibility(LoginConstants.IMGB_TIME_ADD);
        softAssert.assertTrue(isVisible(LoginConstants.IMGB_TIME_ADD));
    }

    public  static void isViewLoaded(){
        MobileActionManager.waitVisibility(LoginConstants.IMG_LOGO);
        softAssert.assertTrue(isVisible(LoginConstants.EMAIL_INPUT));
    }
}
