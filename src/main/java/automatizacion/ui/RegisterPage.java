package automatizacion.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

    public class RegisterPage extends PageObject {
        public static final Target FIRST_NAME = Target.the("donde escribo el nombre del usuario").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
        public static final Target LAST_NAME = Target.the("donde escribo el apellido del usuario").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
        public static final Target ADDRESS = Target.the("donde escribo la dirección del usuario").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
        public static final Target EMAIL = Target.the("donde escribo el correo electronico del usuario").located(By.xpath("//*[@id=\"eid\"]/input"));
        public static final Target PHONE = Target.the("donde escribo el telefono del usuario").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
        public static final Target GENDER_MALE = Target.the("donde escribo el genero del usuario").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
        public static final Target GENDER_FEMALE = Target.the("donde escribo el genero del usuario").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
        public static final Target HOBBIE1 = Target.the("donde escribo el genero del usuario").located(By.id("checkbox1"));
        public static final Target HOBBIE2 = Target.the("donde escribo el genero del usuario").located(By.id("checkbox2"));
        public static final Target HOBBIE3 = Target.the("donde escribo el genero del usuario").located(By.id("checkbox3"));
        public static final Target LANGUAGES_CLICK = Target.the("donde escribo el genero del usuario").located(By.id("msdd"));
        public static final Target LANGUAGES = Target.the("donde escribo el genero del usuario").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]"));
        public static final Target SKILLS = Target.the("donde selecciono el mes de nacimiento del usuario").located(By.id("Skills"));
        public static final Target COUNTRY = Target.the("donde escribo la ciudad donde esta ubicado el usuario").located(By.id(""));
        public static final Target SELECT = Target.the("donde escribo la ciudad donde esta ubicado el usuario").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span"));
        public static final Target SELECT_COUNTRY = Target.the("donde escribo la ciudad donde esta ubicado el usuario").located(By.xpath("//*[@id=\"select2-country-results\"]/li[5]"));
        public static final Target YEAR_BIRTH = Target.the("donde selecciono el año de nacimiento del usuario").located(By.id("yearbox"));
        public static final Target MONTH_BIRTH = Target.the("donde selecciono el dia de nacimiento del usuario").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
        public static final Target DAY_BIRTH = Target.the("donde selecciono el dia de nacimiento del usuario").located(By.id("daybox"));
        public static final Target PASSWORD = Target.the("donde escribo la contraseña de registro del usuario").located(By.id("firstpassword"));
        public static final Target CONFIRM_PASSWORD = Target.the("donde confirmo la contraseña de registro del usuario").located(By.id("secondpassword"));
        public static final Target REGISTER_FINISH = Target.the("boton que finaliza el registro").located(By.id("submitbtn"));

    }
