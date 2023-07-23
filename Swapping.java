import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a = sc.nextInt();
        System.out.println("Enter the number: ");
        b = sc.nextInt();
        System.out.println("Before Swapping a is " + a);
        System.out.println("Before Swapping b is " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping a is " + a);
        System.out.println("After Swapping b is " + b);
        sc.close();
    }
}
