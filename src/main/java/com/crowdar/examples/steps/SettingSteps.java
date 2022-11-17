package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.SettingsConstants;
import com.crowdar.examples.services.SettingService;
import com.crowdar.examples.validates.SettingValidate;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;



public class SettingSteps extends PageSteps {
    @And ("El usuario hace click en Settings")
    public static void  elUsuarioHaceClickEnSettings(){
        SettingService.clickSettings();

    }

    @And("El usuario selecciona el modo oscuro")
    public void elUsuarioSeleccionaElModoOscuro() {
        SettingService.clickDarkMode();
    }

    @Then("Cambia la configuracion a modo oscuro")
    public void cambiaLaConfiguracionAModoOscuro() {
        SettingValidate.verificarDarkModeActivado();
    }
}
