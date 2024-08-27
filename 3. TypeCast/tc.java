public class tc {
    public static void main(String[] args) {
        // -> widening casting 
        // widening casting is done automatically 

        int myint = 9;
        double mydbl = myint;
        // System.out.println(myint);
        // System.out.println(mydbl);



        // -> narrowing casting 
        // narrowing casting must be done manually 

        double m_dbl = 8.32d;
        int m_int = (int)m_dbl;

        // System.out.println(m_dbl);
        // System.out.println(m_int);
    }
}