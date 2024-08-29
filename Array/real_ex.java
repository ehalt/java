// real life example 

public class real_ex {
    public static void main (String[] args){
        int ages[] = {20, 17, 22, 44, 33, 45, 89, 56};
        int length = ages.length;
        float avg, sum = 0;

        for (int age : ages) {
            sum += age;
        }
        avg = sum / length;
        System.out.println("The average age is : " + avg);
    }
}