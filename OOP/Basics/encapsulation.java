// encapsulation 


class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age should not be negative");
        }
        else {
            this.age = age;
        }
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("torikus");
        person.setAge(24);
        
        person.printInfo();
    }
}






// =======   another example =======


class Employee {
    private String name;
    private double salary;

    // getter
    public String getName() {
        return name;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public double getSalary() {
        return salary;
    }

    // setter
    public void setSalary(double salary) {
        if (salary <= 0) {
            System.out.println("Invalid salary");
        }
        else {
            this.salary = salary;
        }
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Shakil Babu");
        emp1.setSalary(30000);

        emp1.printInfo();
    }
}
