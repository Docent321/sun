package test;

import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Card {

    @Test
    public void card() {
        open("https://cards.bugred.ru/cards/index");
        $("[href=\"https://cards.bugred.ru/cards/create\"]").shouldBe(text("Добавить карточку"));
        sleep(5000);
    }
}
