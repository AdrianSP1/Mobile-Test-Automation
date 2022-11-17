package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.SettingsConstants;

public class SettingService {
    public static void clickSettings(){
        MobileActionManager.click(SettingsConstants.SETTINGS);
    }

    public static void clickDarkMode(){
        MobileActionManager.click(SettingsConstants.DARK_MODE);
    }

    public static String getTextDarkmode(){
        String txtDarkMode= MobileActionManager.getText(SettingsConstants.DARK_MODE);
        return txtDarkMode;
    }


}
