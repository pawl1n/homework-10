package predator;

import calendar.DayOfWeek;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CatTest {

    @Test
    void shouldSleep() {
        // given
        Cat cat = new Cat("Orange", 2.5, "Birman");

        // when
        DayOfWeek day1 = DayOfWeek.MONDAY;
        DayOfWeek day2 = DayOfWeek.WEDNESDAY;
        DayOfWeek day3 = DayOfWeek.FRIDAY;

        //then
        assertThat(cat.action(day1)).isEqualTo(cat.action(day2))
                .isEqualTo(cat.action(day3))
                .isEqualTo(cat.sleep());
    }

    @Test
    void shouldHunt() {
        // given
        Cat cat = new Cat("Orange", 2.5, "Birman");

        // when
        DayOfWeek day1 = DayOfWeek.TUESDAY;
        DayOfWeek day2 = DayOfWeek.THURSDAY;
        DayOfWeek day3 = DayOfWeek.SATURDAY;

        //then
        assertThat(cat.action(day1)).isEqualTo(cat.action(day2))
                .isEqualTo(cat.action(day3))
                .isEqualTo(cat.hunt());
    }

    @Test
    void shouldTIGIDIK() {
        // given
        Cat cat = new Cat("Orange", 2.5, "Birman");

        // when
        DayOfWeek day = DayOfWeek.SUNDAY;

        //then
        assertThat(cat.action(day)).isEqualTo(cat.tigidik());
    }

    @Test
    void shouldLick() {
        // given
        Cat cat = new Cat("Orange", 2.5, "Birman");

        // when
        DayOfWeek day = DayOfWeek.UNKNOWN;

        //then
        assertThat(cat.action(day)).isEqualTo(cat.lick());
    }

    @Test
    void shouldEqual() {
        // given
        Cat cat1 = new Cat("Orange", 2.5, "Birman");

        // when
        Cat cat2 = new Cat("Orange", 2.5, "Birman");

        //then
        assertThat(cat1.equals(cat2)).isTrue();
    }

    @Test
    void shouldNotEqual() {
        // given
        Cat cat1 = new Cat("Orange", 2.5, "Birman");

        // when
        Cat cat2 = new Cat("Orange", 2.6, "Birman");

        //then
        assertThat(cat1.equals(cat2)).isFalse();
    }
}