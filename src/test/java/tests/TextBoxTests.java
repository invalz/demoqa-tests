package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void succesfulTest(){
        String name = "Vladimir";
        String email = "test@mailinator.com";
        String currentAddress = "Minsk";
        String permanentAddress = "Minsk City";

        open("/text-box");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('fixedban').remove()");

        $("[id=userName]").setValue(name);
        $("[id=userEmail]").setValue(email);
        $("[id=currentAddress]").setValue(currentAddress);
        $("[id=permanentAddress]").setValue(permanentAddress);
        $("[id=submit]").click();

        $("[id=output]").shouldHave(text(name), text(email), text(currentAddress), text(permanentAddress));
    }
}
