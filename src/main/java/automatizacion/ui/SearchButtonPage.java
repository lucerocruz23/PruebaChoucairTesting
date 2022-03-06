package automatizacion.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchButtonPage extends PageObject
{
    public static final Target BUTTON = Target.the("buscar boton para confirmar registro").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[2]/div[2]/div[1]/div[2]/a"));

}
