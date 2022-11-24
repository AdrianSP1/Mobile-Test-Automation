Feature: El usuario prueba el menu del Home

    @Mobile @darkMode
  Scenario: El usuario activa el modo oscuro
    Given El usuario esta logeado
    And El usuario hace click en el menu
    And El usuario hace click en Settings
    And El usuario selecciona el modo oscuro
    Then Cambia la configuracion a modo oscuro