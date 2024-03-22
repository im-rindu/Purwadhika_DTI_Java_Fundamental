import java.util.Scanner;

public class Angle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Angle 1 : ");
        float angleA = input.nextFloat();
        System.out.print("Input Angle 2 : ");
        float angleB = input.nextFloat();
        input.close();

        System.out.println("The Third Angle of Triangle is " + (180-angleA-angleB));        
    }
}
