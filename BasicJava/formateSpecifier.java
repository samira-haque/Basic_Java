public class formateSpecifier {
    public static void main(String[] args) {
        {
            boolean b = true; //dynamic initialization
            char c = 'a';
            short s = 32677;
            int i =126587;
            float f = 10.2f;
            double d = 10.2;

            
            System.out.printf("boolean b = %b\n",b);
            System.out.printf("Character c = %c\n",c);
            System.out.printf("Short s = %d\n",s);
            System.out.printf("float f = .1%f\n",f);
            System.out.printf("double d = .3%f\n",d);
            System.out.printf("integer i = %d\n",i);
            
        }
    }
}
