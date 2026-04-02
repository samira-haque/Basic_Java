public class incrementdecrement {
    public static void main(String[] args) {
        int x = 25;
        int y;

        y = x++; //post increment
        System.out.println("y = "+y);

        y = x;
        System.out.println("y = "+y);
        y = ++x; //pre increment
        System.out.println("y = "+y);

        y = x;
        System.out.println("y = "+y);
        y = x--; //post decrement
        System.out.println("y = "+y);

        y = x;
        System.out.println("y = "+y);
        y = --x; //pre decrement
        System.out.println("y = "+y);

        y = x;
        System.out.println("y = "+y);

        
    }
}
