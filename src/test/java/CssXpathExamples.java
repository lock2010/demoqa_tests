import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class CssXpathExamples {
    void cssXpathExamples() {
        $("[data-testid=email]").setValue("1");
        $(by("data-testid", "email")).setValue("1");
        $("#email").setValue("1");
    }
}
