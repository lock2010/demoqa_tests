import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
    void cssXpathExamples() {
        $("[data-testid=email]").setValue("1");
        $(by("data-testid", "email")).setValue("1");
        $("#email").setValue("1");
        $("input#email").setValue("1");
        $x("//*[@id='email']").setValue("1");
        $x("//input[@id='email']").setValue("1");

        $("[name=email]").setValue("1");
        $(byName("email")).setValue("1");
        // <input autocomplete="off" placeholder="Full Name" type="text" id="userName" class=" mr-sm-2 form-control">

        $("[class=mr-sm-2 form-control]").setValue("1");
        $(".mr-sm-2 form-control").setValue("1");
        $x("//*[@class='mr-sm-2 form-control']").setValue("1");


        $(byText("Hello, money"));
        $(withText("Hello, money"));

    }
}
