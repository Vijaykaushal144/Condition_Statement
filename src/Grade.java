import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);
        System.out.println("Enter three  number=");
        int marks1,marks2,marks3;
        marks1 = next.nextInt();
        marks2 = next.nextInt();
        marks3 = next.nextInt();
       float avg=(float)(marks1+marks2+marks3)/3;
       if(avg>=70)
        System.out.println("Grade is = A");
       else if (avg>=60 && avg<70)
           System.out.println("your grade is = B ");
       else if (avg>=50&&avg<60)
           System.out.println("your grade is = C");
       else if (avg>=40 && avg<50)
           System.out.println("Your grade is = D");
       else
           System.out.println("your grade is = F");


    }
}