#Author: mruiza@choucairtesting.com

@Trello
Feature: Registro en la aplicación Trello
  Como Analista de una célula de pruebas, 
  Quiero utilizar la aplicación Trello 
  Para realizar un control de las actividades planeadas, que se están realizando y 
  finalizadas en mi equipo de trabajo


 @registrousuario
  Scenario: Realizar el registro en la aplicación Trello
    Given Ingreso a la pagina web de Trello
    When Creo una cuenta nueva en Trello
    |email|nombre|contrasena|
    |lolo1234@gmail.com|Alejandra|Lolo*1994+|
    Then Verifico creación exitosa del usuario
    
  @creartableros
    Scenario Outline: Crear tablero en trello
    Given Autenticacion en trello
    |<email>|<contrasena>|
    When Creo el tablero
    |<nombre_tablero>|
    Then Verifico creación exitosa del tablero  
    |<nombre_tablero>|
      
  
    Examples:
   |email                |nombre      |contrasena   |nombre_tablero|
    ##@externaldata@src\test\resources\Datadriven\datosderegistro.xlsx@registro
   |lolo1234@gmail.com   |Alejandra   |Lolo*1994+   |Prueba1|
   |lolo1234@gmail.com   |Alejandra   |Lolo*1994+   |Prueba2|
   |lolo1234@gmail.com   |Alejandra   |Lolo*1994+   |Prueba3|
