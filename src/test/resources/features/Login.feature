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



