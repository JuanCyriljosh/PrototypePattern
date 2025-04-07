public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal a1 = registry.createSheep("Shaun the Sheep");
        Animal a2 = registry.createCow();
        Color a3 = (Color) registry.createHorse();

        a3.setColor("White");

        a1.makeSound();     
        a2.makeSound();       
        a3.makeSound();    
    }
}
