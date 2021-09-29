import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);
        System.out.println("Enter two number=");
        int num1=next.nextInt();
        if (num1%2==0)
        {
            System.out.println("number is even  " +num1);
        }
        else
            System.out.println("Number is odd  " +num1);

    }
}