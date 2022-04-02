#Autor:Lucero
  @stories
  Feature: Regristro en la aplicación
    Como usuario quiero acceder a la aplicación

    @scenario
    Scenario Outline: Registro en la la aplicación
      Given que Lucero quiere ingresar a la pagina Automatizacion Demo site
      When ingresar todas las credenciales validas del registro
        | strFirstName   | strLastName   | strAddress   | strPhone   | strSkills   | strYearBirth   | strMonthBirth   | srtDayBirth   | strPassword   | strConfirmPassword   |
        | <strFirstName> | <strLastName> | <strAddress> | <strPhone> | <strSkills> | <strYearBirth> | <strMonthBirth> | <srtDayBirth> | <strPassword> | <strConfirmPassword> |
      Then Lucero es una usuaria registrada

      Examples:
        | strFirstName | strLastName | strAddress | strPhone   | strSkills | strYearBirth | strMonthBirth | srtDayBirth | strPassword | strConfirmPassword |
        | Lucero       | Gomez       | San Pablo  | 3124567890 | C         | 1994         | April         | 23          | lu123456    | lu123456           |