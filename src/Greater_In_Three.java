import java.util.Scanner;

public class Greater_In_Three {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);
        System.out.println("Enter three  number=");
        int num1;
        int num2;
        int num3;
        num1 = next.nextInt();
        num2 = next.nextInt();
        num3 = next.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Greater number is " + num1);

        } else {
            if (num2 > num3) {
                System.out.println("Greater number is  " + num2);

            } else {
                System.out.println("Greater number is " + num3);
            }
        }
    }
}
