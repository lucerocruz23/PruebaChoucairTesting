package automatizacion.tasks;

import automatizacion.ui.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class Register implements Task{
    private RegisterPage testPage;
    private String strFirstName;
    private String strLastName;
    private String strAddress;
    private String strPhone;
    private String strSkills;
    private String strYearBirth;
    private String strMonthBirth;
    private String srtDayBirth;
    private String strPassword;
    private String strConfirmPassword;

    public Register(String strFirstName, String strLastName, String strAddress, String strPhone, String strSkills, String strYearBirth, String strMonthBirth, String srtDayBirth, String strPassword, String strConfirmPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strAddress = strAddress;
        this.strPhone = strPhone;
        this.strSkills = strSkills;
        this.strYearBirth = strYearBirth;
        this.strMonthBirth = strMonthBirth;
        this.srtDayBirth = srtDayBirth;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static Register onThePage(String strFirstName, String strLastName, String strAddress, String strPhone, String strSkills, String strYearBirth, String strMonthBirth, String srtDayBirth, String strPassword, String strConfirmPassword) {

        return  Tasks.instrumented(Register.class, strFirstName, strLastName, strAddress, strPhone, strSkills, strYearBirth, strMonthBirth, srtDayBirth, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(strFirstName).into(RegisterPage.FIRST_NAME),
                Enter.theValue(strLastName).into(RegisterPage.LAST_NAME),
                Enter.theValue(strAddress).into(RegisterPage.ADDRESS),
                Enter.theValue("lugomez@email.com").into(RegisterPage.EMAIL),
                Enter.theValue(strPhone).into(RegisterPage.PHONE),
                Click.on(RegisterPage.GENDER_FEMALE),
                Click.on(RegisterPage.HOBBIE2),
                Click.on(RegisterPage.LANGUAGES_CLICK),
                Click.on(RegisterPage.LANGUAGES),
                SelectFromOptions.byVisibleText(strSkills).from(RegisterPage.SKILLS),
              //  Click.on(RegisterPage.COUNTRY),
                Click.on(RegisterPage.SELECT),
                Click.on(RegisterPage.SELECT_COUNTRY),
                SelectFromOptions.byVisibleText(strYearBirth).from(RegisterPage.YEAR_BIRTH),
                SelectFromOptions.byVisibleText(strMonthBirth).from(RegisterPage.MONTH_BIRTH),
                SelectFromOptions.byVisibleText(srtDayBirth).from(RegisterPage.DAY_BIRTH),
                Enter.theValue(strPassword).into(RegisterPage.PASSWORD),
                Enter.theValue(strConfirmPassword).into(RegisterPage.CONFIRM_PASSWORD),
                Click.on(RegisterPage.REGISTER_FINISH)

                );
           }

}
