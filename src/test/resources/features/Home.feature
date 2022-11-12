Feature: Se crea un escenario

  @Home
  Scenario Outline: El usuario crea un escenario
      Given el usuario esta logeado
      When El usuario hace click en el boton +
      And  El usuario hace click en el boton de entrada de fecha
      And el usuario ingresa el inicio <horaDeInicio> del trabajo
      And el usuario hace click en el boton End
      And el usuario ingresa el fin <horaDeFin> del trabajo
      And el usuario guarda el escenario con las horas cargadas
      And el usuario crea el escernario
      Then Se muestra el escenario creado en la pantalla principal
  Examples:
    |horaDeInicio||horaDeFin|
    |        21      ||      05       |
