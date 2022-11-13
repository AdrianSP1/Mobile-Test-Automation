package com.crowdar.examples.validates;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.asserts.SoftAssert;

import static jdk.internal.agent.Agent.getText;

public class HomeValidator {
    static SoftAssert softAssert= new SoftAssert();
    public static void verificarEscenarioCreado(){
        String Today= MobileActionManager.getText(HomeConstants.ENTRY_CREATE);
        softAssert.assertEquals(Today,"Today","No se creo la entrada");
    }
    public static void verificarEntradaDatos(){
        String Day = MobileActionManager.getText(HomeConstants.ENTRY_CREATE);
        softAssert.assertEquals(Day, "Wed., 09 Nov. ", "No se creo la entrada con fecha");
    }

    public static void verificarEscenarioCancel() {
        softAssert.assertSame("No time entries yet", MobileActionManager.getText(HomeConstants.NO_TIMES_ENTRY));

    }
}
