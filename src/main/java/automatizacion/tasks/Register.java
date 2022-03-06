package automatizacion.tasks;

import automatizacion.ui.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task{
    public static Register onThePage() {
        return  Tasks.instrumented(Register.class);
    }
    public static final String CITY3 = null;
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(RegisterPage.REGISTER_BUTTON),
                Enter.theValue("Ana").into(RegisterPage.FIRST_NAME_USER),
                Enter.theValue("Gomez").into(RegisterPage.LAST_NAME_USER),
                Enter.theValue("anagomez@email.com").into(RegisterPage.EMAIL),
                SelectFromOptions.byVisibleText("April").from(RegisterPage.MONTH_BIRTH),
                SelectFromOptions.byVisibleText("12").from(RegisterPage.DAY_BIRTH),
                SelectFromOptions.byVisibleText("2002").from(RegisterPage.YEAR_BIRTH),
                Enter.theValue("Armenian").into(RegisterPage.LANGUAGES),
                Click.on(RegisterPage.NEXT_LOCATION),
               // SelectFromOptions.byVisibleText("Cali Valle del Cauca, Colombia").from(RegisterPage.CITY2),
               // MoveMouse.to(RegisterPage.CITY2).andThen( Actions::;
             //   SelectFromOptions.byVisibleText("Cali Valle del Cauca, Colombia").from(RegisterPage.CITY2),
               // Hit.the(Keys.ARROW_DOWN).keyIn(RegisterPage.CITY2).equals(),
              //   Enter.theValue("Cali").into(RegisterPage.CITY2),
                //Ensure.that(RegisterPage.CITY).value().isEqualTo("Cali Valle del Cauca, Colombia"),
              //  Click.on(RegisterPage.CITY2),
           //     Enter.theValue("Colombia").into(RegisterPage.COUNTRY),
                Enter.theValue("55555").into(RegisterPage.POSTAL_CODE),
                Click.on(RegisterPage.NEXT_DEVICES),
                //Clear.field(RegisterPage.OS),
              //  Click.on(RegisterPage.X),
               // Enter.theValue("macOS").into(RegisterPage.OS),
                //SelectFromOptions.byVisibleText("macOS").from(RegisterPage.OS),
            /*    Enter.theValue("OS X 10.11").into(RegisterPage.OS_VERSION),
                Enter.theValue("Spanish").into(RegisterPage.OS_LANGUAGE),
                Enter.theValue("Xiaomi").into(RegisterPage.MOBILE),
                Enter.theValue("Redmi Note 8 Pro").into(RegisterPage.MOBILE_MODEL),
                Enter.theValue("Android 11").into(RegisterPage.MOBILE_OS),
                Click.on(RegisterPage.OS),
                Click.on(RegisterPage.OS_VERSION),
                Click.on(RegisterPage.OS_LANGUAGE),
              */ // Enter.theValue("Xiaomi").into(RegisterPage.MOBILE),
                //Enter.theValue("Redmi Note 8 Pro").into(RegisterPage.MOBILE_MODEL),
                //Enter.theValue("Android 11").into(RegisterPage.MOBILE_OS),
                Click.on(RegisterPage.LAST_STEP),
                Enter.theValue("LuCeRo2325").into(RegisterPage.PASSWORD),
                Enter.theValue("LuCeRo2325").into(RegisterPage.CONFIRM_PASSWORD),
                Click.on(RegisterPage.CHECK_BOX),
                Click.on(RegisterPage.CHECK_MARK),
                Click.on(RegisterPage.REGISTER_FINISH)
                        );
    }

}
