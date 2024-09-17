class Teacher extends Person
{
      String mainSubject;
      int salary;
      String type; // Primary or Secondary School teacher
 
     Teacher(String fName, String lName, String sub, int slry, String sType)
     {
          super(fName,lName);
          mainSubject = sub;
          salary = slry;
          type = sType;     

      }
  public   void Display()
     {
            super.Display();

            System.out.println("Main Subject : " + this.mainSubject);
            System.out.println("Salary : " + this.salary);
            System.out.println("Type : " + this.type);
     }
}