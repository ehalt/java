public class AnimalDemo {
    public static void main(String[] args) {
        Horse h = new Horse("CJ");
        System.out.println("The horse " + h.getAnimalName() + " says: " + h.speak());
        Cow c = new Cow("Bessie");
        System.out.println("The cow " + c.getAnimalName() + " says: " + c.speak());
    }
}