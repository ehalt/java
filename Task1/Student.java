class Student extends Person
{
     int id;
     String standard;
     String instructor;
 
     Student(String fName, String lName, int nId, String stnd, String instr)
     {
         super.FirstName=fName;
         super.LastName=lName;
        // super(fName,lName);
          id = nId;
          standard = stnd;
          instructor = instr;         
      }
     public void Display()
     {
            super.Display();

            System.out.println("ID : " + this.id);
            System.out.println("Standard : " + this.standard);
            System.out.println("Instructor : " + this.instructor);
     }
}