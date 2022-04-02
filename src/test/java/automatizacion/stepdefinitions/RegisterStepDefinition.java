package automatizacion.stepdefinitions;


import automatizacion.model.RegisterData;
import automatizacion.questions.Answer;
import automatizacion.tasks.OpenPage;
import automatizacion.tasks.OpenUp;
import automatizacion.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class RegisterStepDefinition {

    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());}


    @Given("^que Lucero quiere ingresar a la pagina Automatizacion Demo site$")
    public void queLuceroQuiereIngresarALaPaginaAutomatizacionDemoSite() throws Exception{
        OnStage.theActorCalled("Lucero").wasAbleTo(OpenUp.thePage());
    }

    @When("^ingresar todas las credenciales validas del registro$")
    public void ingresarTodasLasCredencialesValidasDelRegistro(List<RegisterData> registerData) throws Exception {
        OnStage.theActorCalled("Lucero").wasAbleTo(Register.onThePage(registerData.get(0).getStrFirstName(), registerData.get(0).getStrLastName(), registerData.get(0).getStrAddress(), registerData.get(0).getStrPhone(), registerData.get(0).getStrSkills(), registerData.get(0).getStrYearBirth(), registerData.get(0).getStrMonthBirth(), registerData.get(0).getSrtDayBirth(), registerData.get(0).getStrPassword(), registerData.get(0).getStrConfirmPassword()), OpenPage.thePage());
    }

    @Then("^Lucero es una usuaria registrada$")
    public void luceroEsUnaUsuariaRegistrada() throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe()));

    }

}
