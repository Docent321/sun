package test;

import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class Books {

    @Test
    public void book() {
        open("https://testbase.ru/books");
        $(".entry-title").shouldBe(Condition.text("Книги"));
        sleep(5000);
    }
}
