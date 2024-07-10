import SpeciesAndSuch.Animals;

public class Main {
    public static void main(String[] args) {
        Animals Snake = new Animals(42, "reptile", "A Python", "hiss",20);
        Animals Bear = new Animals(102, "mammal", "A bear", "Grr", 600);
        System.out.println(Snake.animalFacts());
        System.out.println(Snake.protection());
        System.out.println(Snake.isType());
    }
}
