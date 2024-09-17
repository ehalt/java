import java.util.*;

public class Sandwich extends PortableLunch {
    public Sandwich() {
        System.out.println("Sandwich()");
    }
    
    public static void main(String[] args) {
        new Bread();
        new Cheese();
        new Lettuce();

        new Sandwich();
    }
}
