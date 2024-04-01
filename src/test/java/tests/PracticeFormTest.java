package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest {

    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "69200x40800";
    }

    @Test
    void successFormTest(){
        String firstName = "Vladimir";
        String lastName = "Testovich";
        String email = "test@mailinator.com";
        String mobileNumber = "1234567890";
        String currentAdress = "Uruchcha";

        open("/automation-practice-form");

        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('fixedban').remove()");

        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#currentAddress").setValue(email);
        $(".custom-control-label").click();
        $("#userNumber").setValue(mobileNumber);
        $("#dateOfBirthInput").click();
        $x("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]").click();
        $x("//*[@id=\"subjectsContainer\"]/div").click();
        $("#subjectsInput").setValue("s");
        $("#react-select-2-option-0").click();
        $(".custom-control-label").click();
        $("#uploadPicture").uploadFile(new File("src/test/test.png"));
        $("#currentAddress").setValue(currentAdress);
        $("#state").click();
        $("#react-select-3-option-0").click();
        $(".css-tlfecz-indicatorContainer").click();
        $("#react-select-4-option-0").click();
        $("#submit").click();
    }
}
