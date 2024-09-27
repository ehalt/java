class Car {
    String color;
    String model;

    // default constructor
    Car() {
        color = "unknown";
        model = "unknown";
    }

    // constructor with parameter
    Car(String color, String model) {
        this.color = color;
        this.model = model;
    }
}



public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car("blue", "habijabi");
        System.out.println("Car color: " + car.color + " model: " + car.model);
        System.out.println("Car color: " + car2.color + " model: " + car2.model);
    }
}

// another example =========



class Book {
    String title;
    String author;
    double price;

    // default constructor
    Book() {
        title = "unknown";
        author = "unknown";
        price = 0.0;
    }

    // constructor with parameter
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    // info display

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("opekkha", "humayon ahmed", 135.34);

        book1.displayInfo();
        book2.displayInfo();
    }
}



