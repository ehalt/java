public class Animal {
    private String animalName;
    public Animal(String name) {
        this.animalName = name;
    }
    
    public String getAnimalName() {
        return animalName;
    }

    public String speak() {
        return "generic animal sound";
    }
}