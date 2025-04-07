public class Color implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String color;

    public Color(int legs, String sound, String food, String color) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.color = color;
    }

    @Override
    public Color clone() {
        return new Color(legs, sound, food, color);
    }

    @Override
    public void makeSound() {
        System.out.println(color + " Horse says: " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
