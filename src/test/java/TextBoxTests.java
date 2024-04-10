import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {
@BeforeAll
static void beforeAll(){
    Configuration.browserSize = "1920x1080";
    Configuration.baseUrl = "https://demoqa.com";
    Configuration.pageLoadStrategy = "none";
}

@Test
    void fillFormTest() throws InterruptedException {
    // https://demoqa.com/text-box
    open("/text-box");


    $("[id=userName]").setValue("Alex");
    $("#userEmail").setValue("alex@mail.com");
    $("#currentAddress").setValue("Alexland");
    $("#permanentAddress").setValue("Alexstreet");
    $("#submit").click();
    $("#output").shouldHave(text("Alex"), text("alex@mail.com"), text("Alexland"), text("Alexstreet"));
    }
    @AfterAll
    static void afterAll() {
    Configuration.holdBrowserOpen = true;
    }

}
