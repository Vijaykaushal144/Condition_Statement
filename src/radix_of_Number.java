import java.util.Scanner;

public class radix_of_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  a number=");
        String number;
        number= sc.nextLine();
        if (number.matches("[01]+"))
            System.out.println("Binary radix = 2");
        else if (number.matches("[0-7]+"))
            System.out.println("Octal  radix=8");
        else if (number.matches("[0-9A-F]+"))
            System.out.println("Hexa radix = 16");
        else
            System.out.println("Not a number");






    }
}
