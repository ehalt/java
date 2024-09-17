class Person
{
     protected String FirstName;
     protected String LastName;
      
     protected Person(){}
 
     protected Person(String fName, String lName)
     {
              FirstName = fName;
              LastName = lName;
      }
   

     protected void Display()
      {
            System.out.println("First Name : " + FirstName);
            System.out.println("Last Name : " + LastName);
       }
} 