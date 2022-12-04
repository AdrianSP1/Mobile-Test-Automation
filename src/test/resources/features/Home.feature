Feature: El usuario  prueba las variantes de crear un escenario.
Background:
  Given El usuario esta logeado

  @Mobile @EscenarioCancelado
  Scenario Outline:El usuario cancela el preceso de crear un escenario
    When El usuario hace click en el boton +
    And El usuario hace click en el boton de entrada de fecha
    And El usuario ingresa el inicio <horaDeInicio> del trabajo
    And El usuario hace click en el boton End
    And El usuario ingresa el fin <horaDeFin> del trabajo
    And El usuario guarda el escenario con las horas cargadas
    And El usuario cancela el escenario
    Then No se crea el escenario

    Examples:
      | horaDeInicio | horaDeFin  |
      |        18         |       20        |

  @Mobile @Home
  Scenario Outline: El usuario crea un escenario
    When El usuario hace click en el boton +
    And  El usuario hace click en el boton de entrada de fecha
      And El usuario ingresa el inicio <horaDeInicio> del trabajo
      And El usuario hace click en el boton End
      And El usuario ingresa el fin <horaDeFin> del trabajo
      And El usuario guarda el escenario con las horas cargadas
      And El usuario crea el escernario
      Then Se muestra el escenario y luego se borra la entrada
  Examples:
    |horaDeInicio||horaDeFin|
    |        12      ||      17       |

    @Mobile @EscenarioConFecha
    Scenario Outline: El usuario crea un escenario cargando fecha y horas.
      When El usuario hace click en el boton +
      And  El usuario hace click en el boton de entrada de fecha
      And El usuario ingresa la fecha de inicio '<fechaEntrada>'
      And El usuario ingresa el inicio <horaDeInicio> del trabajo
      And El usuario hace click en el boton End
      And El usuario ingresa la fecha de salida '<fechaSalida>'
      And El usuario ingresa el fin <horaDeFin> del trabajo
      And El usuario guarda el escenario con las horas cargadas
      And El usuario crea el escernario
      Then Se muestra el escenario con fecha y luego se borra la entrada
      Examples:
      |    horaDeInicio       |horaDeFin|        fechaEntrada       |        fechaSalida        |
      |             21              |       03      | 08 December 2022   |  09 December 2022  |


