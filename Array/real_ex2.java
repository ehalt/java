public class real_ex2 {
    public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, sum = 0;
        int length = ages.length;

        int lowest_age = ages[0];

        for (int age : ages) {
            if (lowest_age > age) {
                lowest_age = age;
            }
        }
        System.out.println("lowest age is: " +  lowest_age);
    }
}