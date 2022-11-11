package solution;

import predator.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Orange", 2.5, "Birman");

        System.out.println(cat.hunt());
        System.out.println(cat.sleep());
        System.out.println(cat.tigidik());
        System.out.println(cat.lick());
    }
}