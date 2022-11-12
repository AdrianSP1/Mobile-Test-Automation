package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.validates.LoginValidate;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class LoginSteps extends PageSteps {

    @Given("El usuario accede a la aplicacion correctamente")
    public void elUsuarioAccedeALaAplicacionCorrectamente() {
        LoginValidate.isViewLoaded();

    }

    @When("El usuario ingresa su: (.*), y su (.*)")
    public void doLoginProcess(String email, String password) {
        LoginService.doLogin(email, password);
    }


    @And("El usuario hace click en el boton Login")
    public void elUsuarioHaceClickEnElBotonLogin() {
        LoginService.clickLogin();
    }


    @Then("Se muestra la pantalla principal de la cuenta.")
    public void seMuestraLaPantallaPrincipalDeLaCuenta() {

        LoginValidate.checkEntry();
    }
}