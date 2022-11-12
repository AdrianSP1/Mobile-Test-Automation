Feature: Se crea un escenario
Background:
  Given el usuario esta logeado
  @Home
  Scenario Outline: El usuario crea un escenario
    When El usuario hace click en el boton +
    And  El usuario hace click en el boton de entrada de fecha
      And el usuario ingresa el inicio <horaDeInicio> del trabajo
      And el usuario hace click en el boton End
      And el usuario ingresa el fin <horaDeFin> del trabajo
      And el usuario guarda el escenario con las horas cargadas
      And el usuario crea el escernario
      Then Se muestra el escenario y luego se borra la entrada
  Examples:
    |horaDeInicio||horaDeFin|
    |        12      ||      17       |

    @EscenarioConFecha
    Scenario Outline: El usuario crea un escenario cargando fecha y horas.
      When El usuario hace click en el boton +
      And  El usuario hace click en el boton de entrada de fecha
      And el usuario ingresa la fecha de inicio '<fechaEntrada>'
      And el usuario ingresa el inicio <horaDeInicio> del trabajo
      And el usuario hace click en el boton End
      And el usuario ingresa la fecha de salida '<fechaSalida>'
      And el usuario ingresa el fin <horaDeFin> del trabajo
      And el usuario guarda el escenario con las horas cargadas
      And el usuario crea el escernario
      Then Se muestra el escenario y luego se borra la entrada
      Examples:
      |    horaDeInicio       |horaDeFin|        fechaEntrada       |        fechaSalida        |
      |             21              |       03      | 08 November 2022   |  09 November 2022  |