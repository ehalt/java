public class InheritanceDemo
{
       public static void main(String args[])
       {
              Person pobj= new Person("Torikus","Sadik");
              pobj.Display();
              
              Student sobj= new Student("Fahim", "Morshed", 10,"III", "Faisal");
              sobj.Display();
              
              Teacher tobj= new Teacher("Shamim", "Akhter", "Java", 50000, "School");
             tobj.Display();
              
       }
       
}

