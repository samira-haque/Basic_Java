import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height,base,area;
        System.out.print("Enter height : ");
        height = input.nextDouble();
        System.out.print("Enter base : ");
        base = input.nextDouble();

        area = .5 * height * base;
        System.out.println("Area of Triangle: "+area);
    }
}
