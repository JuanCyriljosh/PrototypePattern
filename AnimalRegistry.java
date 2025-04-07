public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Color horsePrototype;

    public AnimalRegistry() {
        sheepPrototype = new Sheep(4, "Baaa!", "Grass", "Sheep");
        cowPrototype = new Cow(4, "Mooo!", "Grass");
        horsePrototype = new Color(4, "Neigh!", "Hay", "Black");
    }

    public Animal createSheep(String name) {
        Sheep clone = sheepPrototype.clone();
        clone.setName(name);
        return clone;
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}
