package solution;

import predator.Cat;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(Color.ORANGE, 2.5, "Birman");

        System.out.println(cat);
        System.out.println(cat.hunt());
        System.out.println(cat.sleep());
        System.out.println(cat.tigidik());
        System.out.println(cat.lick());
    }
}