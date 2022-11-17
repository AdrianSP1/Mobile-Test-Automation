package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.MobileActionManager;
import src.main.java.com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.validates.HomeValidator;

import com.crowdar.examples.validates.LoginValidate;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomeSteps extends PageSteps {
    @Given("El usuario esta logeado")
    public void elUsuarioEstaLogeado(){
        LoginService.doLogin(PropertyManager.getProperty("email"), PropertyManager.getProperty("password"));
    }

    @When("El usuario hace click en el boton +")
    public void elUsuarioHaceClickEnElBoton() {
        HomeService.clickEntryAdd();
    }

    @And("El usuario hace click en el boton de entrada de fecha")
    public void elUsuarioHaceClickEnElBotonDeEntradaDeFecha() {
        HomeService.clickMenuFechas();
    }

    @And("El usuario ingresa el inicio (.*) del trabajo")
    public void elUsuarioIngresaLaHoraDeInicioDelTrabajo(String horaDeInicio) {
        HomeService.inputHoraInicio(horaDeInicio);
    }

    @And("El usuario hace click en el boton End")
    public void elUsuarioHaceClickEnElBotonEnd() {
        HomeService.clickHoraFin();
    }

    @And("El usuario ingresa el fin (.*) del trabajo")
    public void elUsuarioIngresaLaHoraDeFinDelTrabajo(String horaDeFin) {
        HomeService.inputHoraFin(horaDeFin);
    }

    @And("El usuario guarda el escenario con las horas cargadas")
    public void elUsuarioGuardaElEscenarioConLasHorasCargadas() {
        MobileActionManager.click(HomeConstants.SAVE_END);
    }

    @And("El usuario crea el escernario")
    public void elUsuarioCreaElEscernario() {
        MobileActionManager.click(HomeConstants.SAVE_HOURS);
    }

    @Then("Se muestra el escenario y luego se borra la entrada")
    public void seMuestraElEscenarioCreadoEnLaPantallaPrincipal() {
        HomeValidator.verificarEscenarioCreado();
        HomeService.deleteEntry();
        HomeValidator.verificarInicioSinEntradas();



    }

    @And("El usuario ingresa la fecha de inicio {string}")
    public void elUsuarioIngresaLaFechDeInicio(String fecha_I) {
        HomeService.inputFechaInicio(fecha_I);

    }

    @And("El usuario ingresa la fecha de salida {string}")
    public void elUsuarioIngresaLaFechaDeSalida(String fecha_S) {
        HomeService.inputFechaSalida(fecha_S);
    }


    @Then("Se muestra el escenario con fecha y luego se borra la entrada")
    public void seMuestraElEscenarioConFecha() {
        HomeValidator.verificarEntradaDatos();
        HomeService.deleteEntry();
        HomeValidator.verificarInicioSinEntradas();
    }

    @And("El usuario cancela el escenario")
    public void elUsuarioCancelaElEscenario() {
        HomeService.cancelEscenario();

    }

    @Then("No se crea el escenario")
    public void noSeCreaElEscenario() {
        HomeValidator.verificarInicioSinEntradas();

    }

    @And("El usuario hace click en el menu")
    public void elUsuarioHaceClickEnElMenu() {
        HomeService.clickMenu();
    }

    @And("El usuario hace click en Logout")
    public void elUsuarioHaceClickEnLogout() {
        HomeService.cerrarSesion();
    }

    @And("El usuario confirma el cierre de sesion")
    public void elUsuarioConfirmaElCierreDeSesion() {
        HomeService.confirmCerrarSesion();
    }

    @Then("El usuario cierra sesion de su cuenta")
    public void elUsuarioCierraSesionDeSuCuenta() {
        LoginValidate.isViewLoaded();
    }
}

