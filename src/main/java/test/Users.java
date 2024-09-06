package test;

import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Users {

    @Test
    public void searchEmail() {
        open("http://users.bugred.ru/");
        $(".form-control", 2).setValue("super@super.com");
        $(".btn-submit").click();
        $(".ajax_load_row").shouldBe(text("super@super.com"));
        sleep(5000);
    }
}
