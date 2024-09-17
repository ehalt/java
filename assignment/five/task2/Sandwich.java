public class Sandwich extends PortableLunch {

    private static Bread b;
    private static Cheese c;
    private static Lettuce l;
    
    static {
        b = new Bread();  
        c = new Cheese(); 
        l = new Lettuce();
    }

    public Sandwich() {
        System.out.println("Sandwich()");
    }
    
    public static void main(String[] args) {
        new Sandwich();
    }
}
