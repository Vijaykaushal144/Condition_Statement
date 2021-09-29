import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year=");
        int year;
        year=sc.nextInt();
        if (year%4==0)
        {
            if (year%100==0)
            {
                if (year%400==0)
                {
                    System.out.println("This is leap year " +year);
                }
                else
                    System.out.println("NOt a leap year");
            }
            else
                System.out.println("Not a leap year");
        }
        else
            System.out.println("NOt a leap year");

    }
}

