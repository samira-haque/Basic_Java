import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);
         int phonePrice = 1800;
         int numberOfInstallment,installmentPerMonth;
         System.out.print("Number of installment: ");
         numberOfInstallment = input.nextInt();
         
         installmentPerMonth = phonePrice / numberOfInstallment;
         
         System.out.println("Monthly Installment Amount: "+installmentPerMonth+" euros");
    }
    
}