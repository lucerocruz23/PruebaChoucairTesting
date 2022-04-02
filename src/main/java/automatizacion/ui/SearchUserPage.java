package automatizacion.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchUserPage extends PageObject
{
    public static final Target TABLE = Target.the("tabla para confirmar si el usuario se registro").located(By.className("ui-grid-canvas"));

}
