import java.util.Scanner;
public class Arithmatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,result;

        System.out.println("Enter 1st Number : ");
        num1 = input.nextInt();
        System.out.println("Enter 2nd Number : ");
        num2 = input.nextInt();

        result = num1 + num2;
        System.out.println("Sum = "+result);
        result = num1 - num2;
        System.out.println("Sub = "+result);
        result = num1 * num2;
        System.out.println("Multipication = "+result);
        result = num1 % num2;
        System.out.println("reminder = "+result);
        result = num1 / num2;
        System.out.println("div = "+result);
    }
}
