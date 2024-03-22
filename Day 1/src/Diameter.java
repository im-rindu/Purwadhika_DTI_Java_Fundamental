import java.util.Scanner;

public class Diameter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Radius : ");
        float radius = input.nextFloat();
        input.close();

        System.out.println("The Diameter is " + radius*2);        
        System.out.println("The Circumference is " + radius*2*Math.PI);        
        System.out.println("The Area Size is " + radius*radius*Math.PI);        
    }
}
