package automatizacion.questions;

import automatizacion.ui.SearchUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<String>{


    public static Answer toThe() {
        return new Answer();
    }


    @Override
    public String answeredBy(Actor actor) {
       String valor =  Text.of(SearchUserPage.TABLE).viewedBy(actor).asString();
      //return BrowseTheWeb.as(actor).find((List<By>) SearchUserPage.TABLE).getText();}// }
        String result;
        if (valor == "lugomez@email.com"){
            result ="Se registro";
             System.out.println(result);
        }

        else    {
            result = "no se registro";
            System.out.println(result);}
        return result;

}}