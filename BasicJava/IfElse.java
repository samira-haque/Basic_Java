import java.util.Scanner;

public class IfElse {
      public static void main(String[] args) {
     Scanner input=new Scanner(System.in); 
     
     int age;
        System.out.print("enter age for a person: ");
        age=input.nextInt();
        
        if(age>=18){
            System.out.println("valid voter");
        }
        
        else{
            System.out.println("invalid voter");
        }
 
    }
}

