package predator;

import org.junit.jupiter.api.Test;

import java.awt.Color;

import static org.assertj.core.api.Assertions.assertThat;

class CatTest {

    @Test
    void shouldSleep() {
        // given
        Cat cat = new Cat(Color.ORANGE, 2.5, "Birman");

        // when
        String day1 = "пн";
        String day2 = "Ср";
        String day3 = "ПТ";

        //then
        assertThat(cat.action(day1)).isEqualTo(cat.action(day2))
                .isEqualTo(cat.action(day3))
                .isEqualTo(cat.sleep());
    }

    @Test
    void shouldHunt() {
        // given
        Cat cat = new Cat(Color.ORANGE, 2.5, "Birman");

        // when
        String day1 = "вТ";
        String day2 = "Чт";
        String day3 = "сб";

        //then
        assertThat(cat.action(day1)).isEqualTo(cat.action(day2))
                .isEqualTo(cat.action(day3))
                .isEqualTo(cat.hunt());
    }

    @Test
    void shouldTIGIDIK() {
        // given
        Cat cat = new Cat(Color.ORANGE, 2.5, "Birman");

        // when
        String day = "НД";

        //then
        assertThat(cat.action(day)).isEqualTo(cat.tigidik());
    }

    @Test
    void shouldLick() {
        // given
        Cat cat = new Cat(Color.ORANGE, 2.5, "Birman");

        // when
        String day = "АБВ";

        //then
        assertThat(cat.action(day)).isEqualTo(cat.lick());
    }

    @Test
    void shouldEqual() {
        // given
        Cat cat1 = new Cat(Color.ORANGE, 2.5, "Birman");

        // when
        Cat cat2 = new Cat(Color.ORANGE, 2.5, "Birman");

        //then
        assertThat(cat1.equals(cat2)).isTrue();
    }

    @Test
    void shouldNotEqual() {
        // given
        Cat cat1 = new Cat(Color.ORANGE, 2.5, "Birman");

        // when
        Cat cat2 = new Cat(Color.ORANGE, 2.6, "Birman");

        //then
        assertThat(cat1.equals(cat2)).isFalse();
    }
}