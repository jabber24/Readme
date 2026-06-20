import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 3 Digit: ");
        num1 = s.nextInt();
        num2 = s.nextInt();
        num3 = s.nextInt();

        int largestnum;
        if (num1 >= num2 && num1 >= num3) {
            largestnum = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largestnum = num2;
        } else {
            largestnum = num3;
        }

        System.out.println("The Largest number is " + largestnum);
        if (num1 == num2 && num2 == num3) {
            System.out.println("All the Number are equals");
        }
        s.close();
    }
}
