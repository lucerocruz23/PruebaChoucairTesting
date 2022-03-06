package automatizacion.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

    public class RegisterPage extends PageObject {
        public static final Target REGISTER_BUTTON = Target.the("boton que inicia el registro").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
        public static final Target FIRST_NAME_USER = Target.the("donde escribo el nombre del usuario").located(By.id("firstName"));
        public static final Target LAST_NAME_USER = Target.the("donde escribo el apellido del usuario").located(By.id("lastName"));
        public static final Target EMAIL = Target.the("donde escribo el correo electronico del usuario").located(By.id("email"));
        public static final Target MONTH_BIRTH = Target.the("donde selecciono el mes de nacimiento del usuario").located(By.name("birthMonth"));
        public static final Target DAY_BIRTH = Target.the("donde selecciono el dia de nacimiento del usuario").located(By.name("birthDay"));
        public static final Target YEAR_BIRTH = Target.the("donde selecciono el año de nacimiento del usuario").located(By.name("birthYear"));
        public static final Target LANGUAGES = Target.the("donde escribo el lenguaje del usuario").located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
        public static final Target NEXT_LOCATION = Target.the("boton para continuar el registro").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
        public static final Target CITY = Target.the("donde escribo la ciudad donde esta ubicado el usuario").located(By.id("city"));
        public static final Target CITY2 = Target.the("donde escribo la ciudad donde esta ubicado el usuario").located(By.cssSelector("input[name='city']"));
        public static final Target POSTAL_CODE = Target.the("donde escribo el codigo postal donde esta ubicado el usuario").located(By.xpath("//*[@id=\"zip\"]"));
        public static final Target COUNTRY = Target.the("donde escribo el pais donde esta ubicado el usuario").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
        public static final Target NEXT_DEVICES = Target.the("boton para continuar con el registro").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div"));
        public static final Target X = (Target.the("x").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/a/i")));
        public static final Target OS = (Target.the("donde selecciono el tipo de sistema operativo del computador del usuario").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]")));
        public static final Target OS_VERSION = Target.the("donde selecciono la version del sistema operativo del usuario").located(By.xpath("//*[@id=\"ui-select-choices-row-21-10\"]/span/div"));
        public static final Target OS_LANGUAGE = Target.the("donde selecciono el lenguaje del computador del usuario").located(By.xpath("//*[@id=\"ui-select-choices-row-22-37\"]/span/div"));
        public static final Target MOBILE = Target.the("donde selecciono el tipo de celular del usuario").located(By.name("mobile-device"));
        public static final Target MOBILE_MODEL = Target.the("donde selecciono el modelo de celular del usuario").located(By.xpath("//*[@id=\"ui-select-choices-row-24-36\"]/span/div"));
        public static final Target MOBILE_OS = Target.the("donde selecciono el tipo de sistema operativo del celular del usuario").located(By.xpath("//*[@id=\"ui-select-choices-row-25-1\"]/span/div"));
        public static final Target LAST_STEP = Target.the("boton para continuar con el registro").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div"));
        public static final Target PASSWORD = Target.the("donde escribo la contraseña de registro del usuario").located(By.name("password"));
        public static final Target CONFIRM_PASSWORD = Target.the("donde confirmo la contraseña de registro del usuario").located(By.name("confirmPassword"));
        public static final Target CHECK_BOX = Target.the("donde acepto politicas para el usuario").located(By.className("signup-consent__checkbox error"));
        public static final Target CHECK_MARK = Target.the("donde acepto politicas para el usuario").located(By.className("checkmark signup-consent__checkbox error"));
        public static final Target REGISTER_FINISH = Target.the("boton que finaliza el registro").located(By.id("laddaBtn"));

    }
