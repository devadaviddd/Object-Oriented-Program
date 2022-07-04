public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1,
             20, "long silky");
        dog.eat(); // We can use the method of Animal
        /*dog.walk();*/
        dog.run();

        Fish fish = new Fish( "GoldFish", 1, 1, 10, 2, 10);
        fish.swim(5);

    }
}