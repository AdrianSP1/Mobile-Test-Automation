Feature: El usuario se loguea en la aplicacion clockify de manera exitosa
@Login
  Scenario Outline:Logeo exitoso
    Given El usuario accede a la aplicacion correctamente
    When  El usuario ingresa su: <email>, y su <password>
    And El usuario hace click en el boton Login
    Then  Se muestra la pantalla principal de la cuenta.

   Examples:
   |               email                     |     password     |
   |pepelopez125q@gmail.com| Pepelopez789  |

  @Logout
 Scenario Outline: : El usuario cierra sesion de  su cuenta
    Given El usuario accede a la aplicacion correctamente
    When  El usuario ingresa su: <email>, y su <password>
    And El usuario hace click en el boton Login
    And El usuario hace click en el menu
    And El usuario hace click en Logout
    And  El usuario confirma el cierre de sesion
    Then El usuario cierra sesion de su cuenta

    Examples:
      |               email                     |     password     |
      |pepelopez125q@gmail.com| Pepelopez789  |



