package co.com.choucair.certification.proyectoUtest.questions;

import co.com.choucair.certification.proyectoUtest.userinterface.FormAbutMeView;
import co.com.choucair.certification.proyectoUtest.userinterface.FormPassView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String tituloPage) {
        return new Answer(tituloPage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean booleanResult;
        String textTitlePage = Text.of(FormPassView.TITLE_WELCOME_PAGE).viewedBy(actor).asString();
        if (question.equals(textTitlePage)){
            booleanResult = true;
        }else {
            booleanResult = false;
        }
        return booleanResult;
    }
}
