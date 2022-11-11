package predator;

import java.awt.Color;
import java.util.Objects;

public abstract class Predator {
    protected Color color;
    protected double weight;

    protected Predator(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract String sleep();

    public abstract String hunt();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predator predator)) return false;
        return Double.compare(predator.weight, weight) == 0 && Objects.equals(color, predator.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }
}
