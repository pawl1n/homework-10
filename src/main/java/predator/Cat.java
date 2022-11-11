package predator;

import java.awt.Color;
import java.util.Objects;

public class Cat extends Predator {
    private String breed;

    public Cat(Color color, double weight, String breed) {
        super(color, weight);

        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String tigidik() {
        return "TIGIDIK";
    }

    public String lick() {
        return "They'll be clear";
    }

    public String action(String day) {
        return switch (day.toUpperCase()) {
            case "ПН", "СР", "ПТ" -> sleep();
            case "ВТ", "ЧТ", "СБ" -> hunt();
            case "НД" -> tigidik();
            default -> lick();
        };
    }

    @Override
    public String sleep() {
        return "I'm sleeping";
    }

    @Override
    public String hunt() {
        return "I'll find the mouse... or the bird...";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", color=" + color +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }
}
