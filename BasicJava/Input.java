import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the id: ");
        int id = input.nextInt();
        
        Scanner input1 = new Scanner(System.in);
        System.out.print("\nEnter the title: ");
        String title = input1.nextLine();
        
        System.out.print("\nEnter the Price: ");
        String price = input1.nextLine();
        
        System.out.print("\nEnter the description: ");
        String dresciption = input1.nextLine();
        
        System.out.print("\nEnter the category: ");
        String category = input1.nextLine();
        
        System.out.println("Your id = "+id);
        System.out.println("Your title = "+title);
        System.out.println("Your price = "+price);
        System.out.println("Your description = "+dresciption);
        System.out.println("Your category = "+category);
    }
   
}