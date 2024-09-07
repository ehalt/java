class Dog {
    String name;
    int age;
    void bark() {
        System.out.println("Woof!!");
    }
}


public class b1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Bubly";
        dog1.age = 3;
        dog1.bark();

        System.out.println(dog1.name);
        System.out.println(dog1.age);
        Dog dog2 = new Dog();
        dog2.name = "opu";
        dog2.age = 4;
        dog2.bark();
    }
}