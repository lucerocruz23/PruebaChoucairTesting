package automatizacion.stepdefinitions;

import automatizacion.tasks.OpenUp;
import automatizacion.tasks.Register;
import automatizacion.questions.Answer;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class RegisterStepDefinition {

    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());}

    @Given("^que Lucero quiere ingresar a la pagina principal Utest$")
    public void queLuceroQuiereIngresarALaPaginaPrincipalUtest() {
        OnStage.theActorCalled("Lucero").wasAbleTo(OpenUp.thePage());
    }

    @When("^ingresa todos las credenciales validas$")
    public void ingresaTodosLasCredencialesValidas() {
        OnStage.theActorCalled("Lucero").wasAbleTo(Register.onThePage());
    }

    @Then("^Lucero es un usuario registrado$")
    public void luceroEsUnUsuarioRegistrado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(null)));
    }
}
