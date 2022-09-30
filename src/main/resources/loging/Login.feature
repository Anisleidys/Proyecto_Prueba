Feature: Login
@test
  Scenario: Loguin de usuario
    Given Me logueo con usuario "A" y contrasena "B"
    When Doy clic en boton accder
    Then Valido se loguea correctamente